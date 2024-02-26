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


import com.dao.JiaocaifenleiDao;
import com.entity.JiaocaifenleiEntity;
import com.service.JiaocaifenleiService;
import com.entity.vo.JiaocaifenleiVO;
import com.entity.view.JiaocaifenleiView;

@Service("jiaocaifenleiService")
public class JiaocaifenleiServiceImpl extends ServiceImpl<JiaocaifenleiDao, JiaocaifenleiEntity> implements JiaocaifenleiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaocaifenleiEntity> page = this.selectPage(
                new Query<JiaocaifenleiEntity>(params).getPage(),
                new EntityWrapper<JiaocaifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaocaifenleiEntity> wrapper) {
		  Page<JiaocaifenleiView> page =new Query<JiaocaifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaocaifenleiVO> selectListVO(Wrapper<JiaocaifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaocaifenleiVO selectVO(Wrapper<JiaocaifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaocaifenleiView> selectListView(Wrapper<JiaocaifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaocaifenleiView selectView(Wrapper<JiaocaifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
