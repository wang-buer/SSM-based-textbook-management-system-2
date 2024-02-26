package com.entity.view;

import com.entity.JiaocaichukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教材出库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
@TableName("jiaocaichuku")
public class JiaocaichukuView  extends JiaocaichukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaocaichukuView(){
	}
 
 	public JiaocaichukuView(JiaocaichukuEntity jiaocaichukuEntity){
 	try {
			BeanUtils.copyProperties(this, jiaocaichukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
