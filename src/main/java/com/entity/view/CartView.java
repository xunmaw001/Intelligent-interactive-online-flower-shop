package com.entity.view;

import com.entity.CartEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 购物车
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("cart")
public class CartView extends CartEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 xianhua
			/**
			* 鲜花名称
			*/
			private String xianhuaName;
			/**
			* 鲜花照片
			*/
			private String xianhuaPhoto;
			/**
			* 鲜花类型
			*/
			private Integer xianhuaTypes;
				/**
				* 鲜花类型的值
				*/
				private String xianhuaValue;
			/**
			* 鲜花库存
			*/
			private Integer xianhuaKucunNumber;
			/**
			* 花语
			*/
			private String xianhuaHuayu;
			/**
			* 鲜花用途
			*/
			private String xianhuaYongtu;
			/**
			* 鲜花原价
			*/
			private Double xianhuaOldMoney;
			/**
			* 现价
			*/
			private Double xianhuaNewMoney;
			/**
			* 点击次数
			*/
			private Integer xianhuaClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer xianhuaDelete;
			/**
			* 鲜花介绍
			*/
			private String xianhuaContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public CartView() {

	}

	public CartView(CartEntity cartEntity) {
		try {
			BeanUtils.copyProperties(this, cartEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




















				//级联表的get和set xianhua
					/**
					* 获取： 鲜花名称
					*/
					public String getXianhuaName() {
						return xianhuaName;
					}
					/**
					* 设置： 鲜花名称
					*/
					public void setXianhuaName(String xianhuaName) {
						this.xianhuaName = xianhuaName;
					}
					/**
					* 获取： 鲜花照片
					*/
					public String getXianhuaPhoto() {
						return xianhuaPhoto;
					}
					/**
					* 设置： 鲜花照片
					*/
					public void setXianhuaPhoto(String xianhuaPhoto) {
						this.xianhuaPhoto = xianhuaPhoto;
					}
					/**
					* 获取： 鲜花类型
					*/
					public Integer getXianhuaTypes() {
						return xianhuaTypes;
					}
					/**
					* 设置： 鲜花类型
					*/
					public void setXianhuaTypes(Integer xianhuaTypes) {
						this.xianhuaTypes = xianhuaTypes;
					}


						/**
						* 获取： 鲜花类型的值
						*/
						public String getXianhuaValue() {
							return xianhuaValue;
						}
						/**
						* 设置： 鲜花类型的值
						*/
						public void setXianhuaValue(String xianhuaValue) {
							this.xianhuaValue = xianhuaValue;
						}
					/**
					* 获取： 鲜花库存
					*/
					public Integer getXianhuaKucunNumber() {
						return xianhuaKucunNumber;
					}
					/**
					* 设置： 鲜花库存
					*/
					public void setXianhuaKucunNumber(Integer xianhuaKucunNumber) {
						this.xianhuaKucunNumber = xianhuaKucunNumber;
					}
					/**
					* 获取： 花语
					*/
					public String getXianhuaHuayu() {
						return xianhuaHuayu;
					}
					/**
					* 设置： 花语
					*/
					public void setXianhuaHuayu(String xianhuaHuayu) {
						this.xianhuaHuayu = xianhuaHuayu;
					}
					/**
					* 获取： 鲜花用途
					*/
					public String getXianhuaYongtu() {
						return xianhuaYongtu;
					}
					/**
					* 设置： 鲜花用途
					*/
					public void setXianhuaYongtu(String xianhuaYongtu) {
						this.xianhuaYongtu = xianhuaYongtu;
					}
					/**
					* 获取： 鲜花原价
					*/
					public Double getXianhuaOldMoney() {
						return xianhuaOldMoney;
					}
					/**
					* 设置： 鲜花原价
					*/
					public void setXianhuaOldMoney(Double xianhuaOldMoney) {
						this.xianhuaOldMoney = xianhuaOldMoney;
					}
					/**
					* 获取： 现价
					*/
					public Double getXianhuaNewMoney() {
						return xianhuaNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setXianhuaNewMoney(Double xianhuaNewMoney) {
						this.xianhuaNewMoney = xianhuaNewMoney;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getXianhuaClicknum() {
						return xianhuaClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setXianhuaClicknum(Integer xianhuaClicknum) {
						this.xianhuaClicknum = xianhuaClicknum;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getXianhuaDelete() {
						return xianhuaDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setXianhuaDelete(Integer xianhuaDelete) {
						this.xianhuaDelete = xianhuaDelete;
					}
					/**
					* 获取： 鲜花介绍
					*/
					public String getXianhuaContent() {
						return xianhuaContent;
					}
					/**
					* 设置： 鲜花介绍
					*/
					public void setXianhuaContent(String xianhuaContent) {
						this.xianhuaContent = xianhuaContent;
					}











				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}




}
