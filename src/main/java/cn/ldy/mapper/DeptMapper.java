package cn.ldy.mapper;

import cn.ldy.bean.Dept;

import java.util.List;

public interface DeptMapper {
List<Dept> findAll();
Dept findById(Integer id);
}
