package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaocaishenqingDao;
import com.entity.JiaocaishenqingEntity;
import com.service.JiaocaishenqingService;
import com.entity.vo.JiaocaishenqingVO;
import com.entity.view.JiaocaishenqingView;

@Service("jiaocaishenqingService")
public class JiaocaishenqingServiceImpl extends ServiceImpl<JiaocaishenqingDao, JiaocaishenqingEntity> implements JiaocaishenqingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaocaishenqingEntity> page = this.selectPage(
                new Query<JiaocaishenqingEntity>(params).getPage(),
                new EntityWrapper<JiaocaishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaocaishenqingEntity> wrapper) {
		  Page<JiaocaishenqingView> page =new Query<JiaocaishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaocaishenqingVO> selectListVO(Wrapper<JiaocaishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaocaishenqingVO selectVO(Wrapper<JiaocaishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaocaishenqingView> selectListView(Wrapper<JiaocaishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaocaishenqingView selectView(Wrapper<JiaocaishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
