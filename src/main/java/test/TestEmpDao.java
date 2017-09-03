package test;

import com.hjy.dao.EmpDao;
import com.hjy.models.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpDao {

    public static void main(String[] args) {
        String conf = "applicationContext.xml";
        ApplicationContext ac =
                new ClassPathXmlApplicationContext(conf);
        EmpDao empDao = ac.getBean(
                "empDao", EmpDao.class);
        Emp emp = new Emp();
        emp.setName("spring");
        emp.setSalary(1.0);
        emp.setAge(20);
        empDao.save(emp);

    }
}
