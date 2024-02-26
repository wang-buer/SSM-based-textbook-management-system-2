package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaocaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaocaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaocaixinxiView;


/**
 * 教材信息
 *
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
public interface JiaocaixinxiService extends IService<JiaocaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaocaixinxiVO> selectListVO(Wrapper<JiaocaixinxiEntity> wrapper);
   	
   	JiaocaixinxiVO selectVO(@Param("ew") Wrapper<JiaocaixinxiEntity> wrapper);
   	
   	List<JiaocaixinxiView> selectListView(Wrapper<JiaocaixinxiEntity> wrapper);
   	
   	JiaocaixinxiView selectView(@Param("ew") Wrapper<JiaocaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaocaixinxiEntity> wrapper);
   	

}

