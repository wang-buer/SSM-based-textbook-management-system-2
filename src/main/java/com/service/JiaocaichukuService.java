package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaocaichukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaocaichukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaocaichukuView;


/**
 * 教材出库
 *
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
public interface JiaocaichukuService extends IService<JiaocaichukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaocaichukuVO> selectListVO(Wrapper<JiaocaichukuEntity> wrapper);
   	
   	JiaocaichukuVO selectVO(@Param("ew") Wrapper<JiaocaichukuEntity> wrapper);
   	
   	List<JiaocaichukuView> selectListView(Wrapper<JiaocaichukuEntity> wrapper);
   	
   	JiaocaichukuView selectView(@Param("ew") Wrapper<JiaocaichukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaocaichukuEntity> wrapper);
   	

}

