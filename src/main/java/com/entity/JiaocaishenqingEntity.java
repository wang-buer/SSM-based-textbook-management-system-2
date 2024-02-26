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
 * 教材申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
@TableName("jiaocaishenqing")
public class JiaocaishenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaocaishenqingEntity() {
		
	}
	
	public JiaocaishenqingEntity(T t) {
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
	 * 申请数量
	 */
					
	private Integer shenqingshuliang;
	
	/**
	 * 申请说明
	 */
					
	private String shenqingshuoming;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 申请时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shenqingshijian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：申请数量
	 */
	public void setShenqingshuliang(Integer shenqingshuliang) {
		this.shenqingshuliang = shenqingshuliang;
	}
	/**
	 * 获取：申请数量
	 */
	public Integer getShenqingshuliang() {
		return shenqingshuliang;
	}
	/**
	 * 设置：申请说明
	 */
	public void setShenqingshuoming(String shenqingshuoming) {
		this.shenqingshuoming = shenqingshuoming;
	}
	/**
	 * 获取：申请说明
	 */
	public String getShenqingshuoming() {
		return shenqingshuoming;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：教师工号
	 */
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
	/**
	 * 设置：申请时间
	 */
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
