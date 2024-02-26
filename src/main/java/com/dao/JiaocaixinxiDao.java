package com.dao;

import com.entity.JiaocaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaocaixinxiVO;
import com.entity.view.JiaocaixinxiView;


/**
 * 教材信息
 * 
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
public interface JiaocaixinxiDao extends BaseMapper<JiaocaixinxiEntity> {
	
	List<JiaocaixinxiVO> selectListVO(@Param("ew") Wrapper<JiaocaixinxiEntity> wrapper);
	
	JiaocaixinxiVO selectVO(@Param("ew") Wrapper<JiaocaixinxiEntity> wrapper);
	
	List<JiaocaixinxiView> selectListView(@Param("ew") Wrapper<JiaocaixinxiEntity> wrapper);

	List<JiaocaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaocaixinxiEntity> wrapper);
	
	JiaocaixinxiView selectView(@Param("ew") Wrapper<JiaocaixinxiEntity> wrapper);
	

}
