<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
var menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除"],"menu":"教材分类","menuJump":"列表","tableName":"jiaocaifenlei"}],"menu":"教材分类管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除","入库","出库"],"menu":"教材信息","menuJump":"列表","tableName":"jiaocaixinxi"}],"menu":"教材信息管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除"],"menu":"教材入库","menuJump":"列表","tableName":"jiaocairuku"}],"menu":"教材入库管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","修改","删除"],"menu":"教材出库","menuJump":"列表","tableName":"jiaocaichuku"}],"menu":"教材出库管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","修改","删除","审核"],"menu":"教材申请","menuJump":"列表","tableName":"jiaocaishenqing"}],"menu":"教材申请管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","申请教材"],"menu":"教材信息","menuJump":"列表","tableName":"jiaocaixinxi"}],"menu":"教材信息管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"教材申请","menuJump":"列表","tableName":"jiaocaishenqing"}],"menu":"教材申请管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"教师","tableName":"jiaoshi"}];

var hasMessage = '';