package cn.ldy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Emp {

    private Integer id;
    private String name;
    private Integer deptId;
    private Dept dept;
}
