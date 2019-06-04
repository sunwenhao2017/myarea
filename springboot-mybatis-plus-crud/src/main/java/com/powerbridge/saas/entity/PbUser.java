package com.powerbridge.saas.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author SUNWENHAO
 * @since 2019-06-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PbUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String userName;

    private String userPwd;

    private String phone;

    /**
     * 角色
     */
    private Integer role;

    /**
     * 状态 0正常 1封号
     */
    private Integer status;

    private String createId;

    private String createName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    private String updateId;

    private String updateName;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


}
