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


import com.dao.JiaocaixinxiDao;
import com.entity.JiaocaixinxiEntity;
import com.service.JiaocaixinxiService;
import com.entity.vo.JiaocaixinxiVO;
import com.entity.view.JiaocaixinxiView;

@Service("jiaocaixinxiService")
public class JiaocaixinxiServiceImpl extends ServiceImpl<JiaocaixinxiDao, JiaocaixinxiEntity> implements JiaocaixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaocaixinxiEntity> page = this.selectPage(
                new Query<JiaocaixinxiEntity>(params).getPage(),
                new EntityWrapper<JiaocaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaocaixinxiEntity> wrapper) {
		  Page<JiaocaixinxiView> page =new Query<JiaocaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaocaixinxiVO> selectListVO(Wrapper<JiaocaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaocaixinxiVO selectVO(Wrapper<JiaocaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaocaixinxiView> selectListView(Wrapper<JiaocaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaocaixinxiView selectView(Wrapper<JiaocaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
