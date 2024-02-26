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


import com.dao.JiaocaichukuDao;
import com.entity.JiaocaichukuEntity;
import com.service.JiaocaichukuService;
import com.entity.vo.JiaocaichukuVO;
import com.entity.view.JiaocaichukuView;

@Service("jiaocaichukuService")
public class JiaocaichukuServiceImpl extends ServiceImpl<JiaocaichukuDao, JiaocaichukuEntity> implements JiaocaichukuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaocaichukuEntity> page = this.selectPage(
                new Query<JiaocaichukuEntity>(params).getPage(),
                new EntityWrapper<JiaocaichukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaocaichukuEntity> wrapper) {
		  Page<JiaocaichukuView> page =new Query<JiaocaichukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaocaichukuVO> selectListVO(Wrapper<JiaocaichukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaocaichukuVO selectVO(Wrapper<JiaocaichukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaocaichukuView> selectListView(Wrapper<JiaocaichukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaocaichukuView selectView(Wrapper<JiaocaichukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
