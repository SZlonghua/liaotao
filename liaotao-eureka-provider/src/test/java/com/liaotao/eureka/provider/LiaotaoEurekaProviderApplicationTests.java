package com.liaotao.eureka.provider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LiaotaoEurekaProviderApplicationTests {

	@Test
	public void contextLoads() throws ParseException {

		String d = "10:00:00";
		String d2 = "12:25:00";
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
		Date parse = df.parse(d);
		Date parse2 = df.parse(d2);
		double l = (double) (parse2.getTime() - parse.getTime()) / (1000 * 60 * 60);
		System.out.println(l);
	}

}

