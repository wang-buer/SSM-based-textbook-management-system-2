package com.entity.view;

import com.entity.JiaocairukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教材入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
@TableName("jiaocairuku")
public class JiaocairukuView  extends JiaocairukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaocairukuView(){
	}
 
 	public JiaocairukuView(JiaocairukuEntity jiaocairukuEntity){
 	try {
			BeanUtils.copyProperties(this, jiaocairukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
