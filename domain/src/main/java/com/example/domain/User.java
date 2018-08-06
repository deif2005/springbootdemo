package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author miou
 * @date 2018/8/6
 */
//Entity中不映射成列的字段得加@Transient 注解，不加注解也会映射成列
@Entity
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String userName;
    @Column(nullable = false)
    private String passWord;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = true, unique = true)
    private String nickName;
    @Column(nullable = false)
    private String regTime;

    //省略getter settet方法、构造方法
    
}
