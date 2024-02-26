package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaocaishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaocaishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaocaishenqingView;


/**
 * 教材申请
 *
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
public interface JiaocaishenqingService extends IService<JiaocaishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaocaishenqingVO> selectListVO(Wrapper<JiaocaishenqingEntity> wrapper);
   	
   	JiaocaishenqingVO selectVO(@Param("ew") Wrapper<JiaocaishenqingEntity> wrapper);
   	
   	List<JiaocaishenqingView> selectListView(Wrapper<JiaocaishenqingEntity> wrapper);
   	
   	JiaocaishenqingView selectView(@Param("ew") Wrapper<JiaocaishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaocaishenqingEntity> wrapper);
   	

}

