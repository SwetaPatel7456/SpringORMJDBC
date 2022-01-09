package com.spring.jdbc;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.jdbc.spring.dao.StudentDao;
import com.spring.jdbc.entity.Student;
// * Hello world!

public class App 
{ 
    public static void main( String[] args )
    {
       
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	
    	//ApplicationContext context = new AnnotationConfigApplicationContext("JavaConfig.class");
    	
    	JdbcTemplate template = context.getBean("jdbctemplate",JdbcTemplate.class);
    	StudentDao s = context.getBean("studentDao",StudentDao.class);
    	
    	Student p = context.getBean ("student1",Student.class);
    	Student q = context.getBean("student2",Student.class);
    	Student r = context.getBean("student3",Student.class);
    	Student h = context.getBean("student4",Student.class);
    	Student t = context.getBean("student5",Student.class);
    	Student u = context.getBean("student6",Student.class);
    	Student v = context.getBean("student7",Student.class);
    	Student w = context.getBean("student8",Student.class);
    	Student x = context.getBean("student9",Student.class);
    	Student y = context.getBean("student10",Student.class);
    	Student z = context.getBean("student11",Student.class);
    	Student a = context.getBean("student12",Student.class);
    	Student b = context.getBean("student13",Student.class);
    	Student c = context.getBean("student14",Student.class);
    	Student d = context.getBean("student15",Student.class);
    	Student e = context.getBean("student16",Student.class);
    	Student f = context.getBean("student17",Student.class);
    	Student g = context.getBean("student18",Student.class);
    	
    	
        //it is not the right way of doing things	String sql = "insert into student(id,name,city) values(?,?,?)";
    	/*s.insert(a);
    	s.insert(b);
    	s.insert(c);
    	s.insert(d);
    	s.insert(e);
    	s.insert(f);
    	s.insert(g);
    	s.insert(h);
    	s.insert(u);
    	s.insert(v);
    	s.insert(w);
    	s.insert(x);
    	s.insert(y);
    	s.insert(z);
    	s.insert(p);
    	s.insert(q);
    	s.insert(r);
    	s.insert(t);*/
    	
   	
    	
    	//int e = s.insert(p);
    	
    	//int j = s.change(q);
    	//int k = s.delete(33);
    	//System.out.println(k);
    	//System.out.println(student);
    	//System.out.println(s.getStudent(3).getCity());
    	//List<Student> students = s.getAllStudentds();
    	//for(Student o :students) {
    		//System.out.println(o);
    	//}
    	List<Student> students = s.getAllStudentds();
    	students.forEach(new Consumer<Student>() {
			public void accept(Student l) {
				System.out.println(l);
			}
		});
    	
    	
    }
}
 