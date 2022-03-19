package com.atxiaojie.demotest.springbootdemotest.pojo;

import com.atxiaojie.beanvalidator.annotation.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @ClassName: User
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2022/2/18 16:14
 * @Version: V1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String username;
    private Integer age;
}
