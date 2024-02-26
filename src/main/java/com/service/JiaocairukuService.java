package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaocairukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaocairukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaocairukuView;


/**
 * 教材入库
 *
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
public interface JiaocairukuService extends IService<JiaocairukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaocairukuVO> selectListVO(Wrapper<JiaocairukuEntity> wrapper);
   	
   	JiaocairukuVO selectVO(@Param("ew") Wrapper<JiaocairukuEntity> wrapper);
   	
   	List<JiaocairukuView> selectListView(Wrapper<JiaocairukuEntity> wrapper);
   	
   	JiaocairukuView selectView(@Param("ew") Wrapper<JiaocairukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaocairukuEntity> wrapper);
   	

}

