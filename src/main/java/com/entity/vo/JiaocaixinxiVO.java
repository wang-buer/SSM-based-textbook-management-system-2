package com.entity.vo;

import com.entity.JiaocaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 教材信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
public class JiaocaixinxiVO  implements Serializable {
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
	 * 教材详情
	 */
	
	private String jiaocaixiangqing;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：教材详情
	 */
	 
	public void setJiaocaixiangqing(String jiaocaixiangqing) {
		this.jiaocaixiangqing = jiaocaixiangqing;
	}
	
	/**
	 * 获取：教材详情
	 */
	public String getJiaocaixiangqing() {
		return jiaocaixiangqing;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
