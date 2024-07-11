package com.seleniumexpress.beancycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

       ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
       StudentDAO student = context.getBean("studentDAO",StudentDAO.class);
       student.selectAllRows();
       student.deleteStuRecordById(7);
       ((AnnotationConfigApplicationContext)context).close();
       
       
	}

}
