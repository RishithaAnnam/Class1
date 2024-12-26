package com.example.JFSDS12_SBJPA;

import org.springframework.boot.CommandLineRunner;

public class LoaderClass implements CommandLineRunner {
	StudentDAO sdao;
	public LoaderClass(StudentDAO sdao) {
		this.sdao=sdao;
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setSid(111);
		s.setSname("abc");
		s.setSfee(130000);
		sdao.insertStudent(s);
		System.out.println("Inserted");
	}

}
