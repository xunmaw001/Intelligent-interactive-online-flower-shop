package com.entity.vo;

import com.entity.XianhuaCommentbackEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 鲜花评价
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xianhua_commentback")
public class XianhuaCommentbackVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 鲜花
     */

    @TableField(value = "xianhua_id")
    private Integer xianhuaId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 评价内容
     */

    @TableField(value = "xianhua_commentback_text")
    private String xianhuaCommentbackText;


    /**
     * 回复内容
     */

    @TableField(value = "reply_text")
    private String replyText;


    /**
     * 评价时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "update_time")
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：鲜花
	 */
    public Integer getXianhuaId() {
        return xianhuaId;
    }


    /**
	 * 获取：鲜花
	 */

    public void setXianhuaId(Integer xianhuaId) {
        this.xianhuaId = xianhuaId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：评价内容
	 */
    public String getXianhuaCommentbackText() {
        return xianhuaCommentbackText;
    }


    /**
	 * 获取：评价内容
	 */

    public void setXianhuaCommentbackText(String xianhuaCommentbackText) {
        this.xianhuaCommentbackText = xianhuaCommentbackText;
    }
    /**
	 * 设置：回复内容
	 */
    public String getReplyText() {
        return replyText;
    }


    /**
	 * 获取：回复内容
	 */

    public void setReplyText(String replyText) {
        this.replyText = replyText;
    }
    /**
	 * 设置：评价时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：评价时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：回复时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：回复时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
