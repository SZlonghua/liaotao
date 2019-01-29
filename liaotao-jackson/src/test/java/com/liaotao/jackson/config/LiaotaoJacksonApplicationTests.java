package com.liaotao.jackson.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liaotao.jackson.model.Friend;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LiaotaoJacksonApplicationTests {

	@Test
	public void contextLoads() {

	}

	@Test
	public void test() throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		Friend friend = new Friend("yitian", 25);

		// 写为字符串
		String text = mapper.writeValueAsString(friend);
		// 写为文件
		mapper.writeValue(new File("G:\\friend.json"), friend);
		// 写为字节流
		byte[] bytes = mapper.writeValueAsBytes(friend);
		System.out.println(text);
		// 从字符串中读取
		Friend newFriend = mapper.readValue(text, Friend.class);
		// 从字节流中读取
		newFriend = mapper.readValue(bytes, Friend.class);
		// 从文件中读取
		newFriend = mapper.readValue(new File("G:\\friend.json"), Friend.class);
		System.out.println(newFriend);

	}

}

