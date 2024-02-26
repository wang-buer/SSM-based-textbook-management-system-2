package com.dao;

import com.entity.JiaocaishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaocaishenqingVO;
import com.entity.view.JiaocaishenqingView;


/**
 * 教材申请
 * 
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
public interface JiaocaishenqingDao extends BaseMapper<JiaocaishenqingEntity> {
	
	List<JiaocaishenqingVO> selectListVO(@Param("ew") Wrapper<JiaocaishenqingEntity> wrapper);
	
	JiaocaishenqingVO selectVO(@Param("ew") Wrapper<JiaocaishenqingEntity> wrapper);
	
	List<JiaocaishenqingView> selectListView(@Param("ew") Wrapper<JiaocaishenqingEntity> wrapper);

	List<JiaocaishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<JiaocaishenqingEntity> wrapper);
	
	JiaocaishenqingView selectView(@Param("ew") Wrapper<JiaocaishenqingEntity> wrapper);
	

}
