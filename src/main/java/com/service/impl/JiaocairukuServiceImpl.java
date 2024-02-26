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


import com.dao.JiaocairukuDao;
import com.entity.JiaocairukuEntity;
import com.service.JiaocairukuService;
import com.entity.vo.JiaocairukuVO;
import com.entity.view.JiaocairukuView;

@Service("jiaocairukuService")
public class JiaocairukuServiceImpl extends ServiceImpl<JiaocairukuDao, JiaocairukuEntity> implements JiaocairukuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaocairukuEntity> page = this.selectPage(
                new Query<JiaocairukuEntity>(params).getPage(),
                new EntityWrapper<JiaocairukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaocairukuEntity> wrapper) {
		  Page<JiaocairukuView> page =new Query<JiaocairukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaocairukuVO> selectListVO(Wrapper<JiaocairukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaocairukuVO selectVO(Wrapper<JiaocairukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaocairukuView> selectListView(Wrapper<JiaocairukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaocairukuView selectView(Wrapper<JiaocairukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
