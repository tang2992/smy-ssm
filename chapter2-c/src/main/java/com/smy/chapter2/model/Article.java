package com.smy.chapter2.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * Article
 *
 * @author Tian ZhongBo
 * @date 2018-06-25 14:11:14
 */
@Data
public class Article implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String title;

    private Integer authorId;

    private String content;

    private Date createTime;



}
