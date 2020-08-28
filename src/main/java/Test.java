import cn.ldy.bean.Dept;
import cn.ldy.mapper.DeptMapper;
import cn.ldy.mapper.EmpMapper;
import cn.ldy.mapper.SysParamMapper;
import lombok.Cleanup;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        Configuration config;
        SqlSessionFactory SessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        @Cleanup SqlSession session = SessionFactory.openSession(true);
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        EmpMapper empMapper= session.getMapper(EmpMapper.class);
        SysParamMapper mapper = session.getMapper(SysParamMapper.class);

        //empMapper.findByDeptId(1);
//        List<Dept> depts = deptMapper.findAll();
//        mapper.findAll().forEach(System.out::println);
    }
}
