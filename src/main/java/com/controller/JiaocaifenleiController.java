package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiaocaifenleiEntity;
import com.entity.view.JiaocaifenleiView;

import com.service.JiaocaifenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 教材分类
 * 后端接口
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
@RestController
@RequestMapping("/jiaocaifenlei")
public class JiaocaifenleiController {
    @Autowired
    private JiaocaifenleiService jiaocaifenleiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaocaifenleiEntity jiaocaifenlei, 
		HttpServletRequest request){

        EntityWrapper<JiaocaifenleiEntity> ew = new EntityWrapper<JiaocaifenleiEntity>();
    	PageUtils page = jiaocaifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaocaifenlei), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaocaifenleiEntity jiaocaifenlei, 
		HttpServletRequest request){
        EntityWrapper<JiaocaifenleiEntity> ew = new EntityWrapper<JiaocaifenleiEntity>();
    	PageUtils page = jiaocaifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaocaifenlei), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaocaifenleiEntity jiaocaifenlei){
       	EntityWrapper<JiaocaifenleiEntity> ew = new EntityWrapper<JiaocaifenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaocaifenlei, "jiaocaifenlei")); 
        return R.ok().put("data", jiaocaifenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaocaifenleiEntity jiaocaifenlei){
        EntityWrapper< JiaocaifenleiEntity> ew = new EntityWrapper< JiaocaifenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaocaifenlei, "jiaocaifenlei")); 
		JiaocaifenleiView jiaocaifenleiView =  jiaocaifenleiService.selectView(ew);
		return R.ok("查询教材分类成功").put("data", jiaocaifenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaocaifenleiEntity jiaocaifenlei = jiaocaifenleiService.selectById(id);
        return R.ok().put("data", jiaocaifenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaocaifenleiEntity jiaocaifenlei = jiaocaifenleiService.selectById(id);
        return R.ok().put("data", jiaocaifenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaocaifenleiEntity jiaocaifenlei, HttpServletRequest request){
    	jiaocaifenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaocaifenlei);

        jiaocaifenleiService.insert(jiaocaifenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaocaifenleiEntity jiaocaifenlei, HttpServletRequest request){
    	jiaocaifenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaocaifenlei);

        jiaocaifenleiService.insert(jiaocaifenlei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiaocaifenleiEntity jiaocaifenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaocaifenlei);
        jiaocaifenleiService.updateById(jiaocaifenlei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaocaifenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiaocaifenleiEntity> wrapper = new EntityWrapper<JiaocaifenleiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jiaocaifenleiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
