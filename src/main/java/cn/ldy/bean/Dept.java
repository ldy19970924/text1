package cn.ldy.bean;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Dept {

    private Integer id;

    private String name;

    private List<Emp> emps;
}

