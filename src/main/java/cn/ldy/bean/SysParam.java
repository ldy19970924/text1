package cn.ldy.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class SysParam {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String code;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private Integer value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

