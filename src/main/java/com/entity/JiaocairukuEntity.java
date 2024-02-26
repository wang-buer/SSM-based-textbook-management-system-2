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
 * 教材入库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-06-15 15:02:02
 */
@TableName("jiaocairuku")
public class JiaocairukuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaocairukuEntity() {
		
	}
	
	public JiaocairukuEntity(T t) {
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
	 * 入库编号
	 */
					
	private String rukubianhao;
	
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
	 * 版次
	 */
					
	private String banci;
	
	/**
	 * 出版时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chubanshijian;
	
	/**
	 * 作者
	 */
					
	private String zuozhe;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 单价
	 */
					
	private Float danjia;
	
	/**
	 * 总价
	 */
					
	private Float zongjia;
	
	/**
	 * 入库来源
	 */
					
	private String rukulaiyuan;
	
	/**
	 * 入库时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date rukushijian;
	
	
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
	 * 设置：入库编号
	 */
	public void setRukubianhao(String rukubianhao) {
		this.rukubianhao = rukubianhao;
	}
	/**
	 * 获取：入库编号
	 */
	public String getRukubianhao() {
		return rukubianhao;
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
	 * 设置：版次
	 */
	public void setBanci(String banci) {
		this.banci = banci;
	}
	/**
	 * 获取：版次
	 */
	public String getBanci() {
		return banci;
	}
	/**
	 * 设置：出版时间
	 */
	public void setChubanshijian(Date chubanshijian) {
		this.chubanshijian = chubanshijian;
	}
	/**
	 * 获取：出版时间
	 */
	public Date getChubanshijian() {
		return chubanshijian;
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
	 * 设置：单价
	 */
	public void setDanjia(Float danjia) {
		this.danjia = danjia;
	}
	/**
	 * 获取：单价
	 */
	public Float getDanjia() {
		return danjia;
	}
	/**
	 * 设置：总价
	 */
	public void setZongjia(Float zongjia) {
		this.zongjia = zongjia;
	}
	/**
	 * 获取：总价
	 */
	public Float getZongjia() {
		return zongjia;
	}
	/**
	 * 设置：入库来源
	 */
	public void setRukulaiyuan(String rukulaiyuan) {
		this.rukulaiyuan = rukulaiyuan;
	}
	/**
	 * 获取：入库来源
	 */
	public String getRukulaiyuan() {
		return rukulaiyuan;
	}
	/**
	 * 设置：入库时间
	 */
	public void setRukushijian(Date rukushijian) {
		this.rukushijian = rukushijian;
	}
	/**
	 * 获取：入库时间
	 */
	public Date getRukushijian() {
		return rukushijian;
	}

}
