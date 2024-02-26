package com.dao;

import com.entity.JiaocaichukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaocaichukuVO;
import com.entity.view.JiaocaichukuView;


/**
 * 教材出库
 * 
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
public interface JiaocaichukuDao extends BaseMapper<JiaocaichukuEntity> {
	
	List<JiaocaichukuVO> selectListVO(@Param("ew") Wrapper<JiaocaichukuEntity> wrapper);
	
	JiaocaichukuVO selectVO(@Param("ew") Wrapper<JiaocaichukuEntity> wrapper);
	
	List<JiaocaichukuView> selectListView(@Param("ew") Wrapper<JiaocaichukuEntity> wrapper);

	List<JiaocaichukuView> selectListView(Pagination page,@Param("ew") Wrapper<JiaocaichukuEntity> wrapper);
	
	JiaocaichukuView selectView(@Param("ew") Wrapper<JiaocaichukuEntity> wrapper);
	

}
