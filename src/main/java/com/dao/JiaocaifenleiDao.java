package com.dao;

import com.entity.JiaocaifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaocaifenleiVO;
import com.entity.view.JiaocaifenleiView;


/**
 * 教材分类
 * 
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
public interface JiaocaifenleiDao extends BaseMapper<JiaocaifenleiEntity> {
	
	List<JiaocaifenleiVO> selectListVO(@Param("ew") Wrapper<JiaocaifenleiEntity> wrapper);
	
	JiaocaifenleiVO selectVO(@Param("ew") Wrapper<JiaocaifenleiEntity> wrapper);
	
	List<JiaocaifenleiView> selectListView(@Param("ew") Wrapper<JiaocaifenleiEntity> wrapper);

	List<JiaocaifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaocaifenleiEntity> wrapper);
	
	JiaocaifenleiView selectView(@Param("ew") Wrapper<JiaocaifenleiEntity> wrapper);
	

}
