package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教材信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
@TableName("jiaocaixinxi")
public class JiaocaixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaocaixinxiEntity() {
		
	}
	
	public JiaocaixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教材编号
	 */
					
	private String jiaocaibianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教材编号
	 */
	public void setJiaocaibianhao(String jiaocaibianhao) {
		this.jiaocaibianhao = jiaocaibianhao;
	}
	/**
	 * 获取：教材编号
	 */
	public String getJiaocaibianhao() {
		return jiaocaibianhao;
	}
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
