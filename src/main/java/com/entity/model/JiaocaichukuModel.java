package com.entity.model;

import com.entity.JiaocaichukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 教材出库
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
public class JiaocaichukuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教材名称
	 */
	
	private String jiaocaimingcheng;
		
	/**
	 * 教材分类
	 */
	
	private String jiaocaifenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 出版社
	 */
	
	private String chubanshe;
		
	/**
	 * 作者
	 */
	
	private String zuozhe;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 出库说明
	 */
	
	private String chukushuoming;
		
	/**
	 * 出库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chukushijian;
				
	
	/**
	 * 设置：教材名称
	 */
	 
	public void setJiaocaimingcheng(String jiaocaimingcheng) {
		this.jiaocaimingcheng = jiaocaimingcheng;
	}
	
	/**
	 * 获取：教材名称
	 */
	public String getJiaocaimingcheng() {
		return jiaocaimingcheng;
	}
				
	
	/**
	 * 设置：教材分类
	 */
	 
	public void setJiaocaifenlei(String jiaocaifenlei) {
		this.jiaocaifenlei = jiaocaifenlei;
	}
	
	/**
	 * 获取：教材分类
	 */
	public String getJiaocaifenlei() {
		return jiaocaifenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：出版社
	 */
	 
	public void setChubanshe(String chubanshe) {
		this.chubanshe = chubanshe;
	}
	
	/**
	 * 获取：出版社
	 */
	public String getChubanshe() {
		return chubanshe;
	}
				
	
	/**
	 * 设置：作者
	 */
	 
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	
	/**
	 * 获取：作者
	 */
	public String getZuozhe() {
		return zuozhe;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：出库说明
	 */
	 
	public void setChukushuoming(String chukushuoming) {
		this.chukushuoming = chukushuoming;
	}
	
	/**
	 * 获取：出库说明
	 */
	public String getChukushuoming() {
		return chukushuoming;
	}
				
	
	/**
	 * 设置：出库时间
	 */
	 
	public void setChukushijian(Date chukushijian) {
		this.chukushijian = chukushijian;
	}
	
	/**
	 * 获取：出库时间
	 */
	public Date getChukushijian() {
		return chukushijian;
	}
			
}
