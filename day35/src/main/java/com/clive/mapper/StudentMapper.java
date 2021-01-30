package com.clive.mapper;

import java.util.List;

import com.clive.bean.Student;

//这个接口没有实现类 不用加入注解加载到spring里
/**
 * mybatis映射文件规则：
 * 1.mybatis的映射文件想要生效必须要映射文件的名称等于接口的类名
 * 2.映射文件不一定放在接口里 具体要看spring的配置文件写的那个位置
 * 3.mybatis映射文件里面有一个属性namespace一定要写接口的全类名
 *
 */
public interface StudentMapper {
      List<Student> findStudentAll();
}
