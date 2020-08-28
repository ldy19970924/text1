package cn.ldy.mapper;

import cn.ldy.bean.Emp;

import java.util.List;

public interface EmpMapper {
    List<Emp> findAll();
    Emp findById(Integer id);
    List<Emp> findByDeptId(Integer id);

}
