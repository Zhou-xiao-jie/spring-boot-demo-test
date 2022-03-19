package com.atxiaojie.demotest.springbootdemotest.controller;

import com.atxiaojie.beanvalidator.result.ValidateResult;
import com.atxiaojie.demotest.springbootdemotest.pojo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.atxiaojie.beanvalidator.validator.AnnotationValidator.validate;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2022/2/18 16:15
 * @Version: V1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/save")
    public String save (User user)  {
//        if (bindingResult.hasErrors()) {
//            Map<String , String> map = new HashMap<>();
//            bindingResult.getFieldErrors().forEach( (item) -> {
//                String message = item.getDefaultMessage();
//                String field = item.getField();
//                map.put( field , message );
//            } );
//            return "非法参数";
//        }
//        return "OK";
        ValidateResult result = validate(user);
        if(result.getValid()){
            return "校验通过";
        }else{
            return result.getMessage();
        }
    }
}
