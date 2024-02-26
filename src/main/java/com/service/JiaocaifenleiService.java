package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaocaifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaocaifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaocaifenleiView;


/**
 * 教材分类
 *
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
public interface JiaocaifenleiService extends IService<JiaocaifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaocaifenleiVO> selectListVO(Wrapper<JiaocaifenleiEntity> wrapper);
   	
   	JiaocaifenleiVO selectVO(@Param("ew") Wrapper<JiaocaifenleiEntity> wrapper);
   	
   	List<JiaocaifenleiView> selectListView(Wrapper<JiaocaifenleiEntity> wrapper);
   	
   	JiaocaifenleiView selectView(@Param("ew") Wrapper<JiaocaifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaocaifenleiEntity> wrapper);
   	

}

