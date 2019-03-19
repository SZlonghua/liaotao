package com.liaotao.jackson.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liaotao.jackson.model.Friend;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.TriggerUtils;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
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

		/*Map<Object,Object> map = new HashMap<Object,Object>();
		map.put("nickname","liaotao");
		map.put("age","35");
		Friend friend1 = mapper.convertValue(map, Friend.class);
		System.out.println(friend1);*/
        // 写为文件
		/*mapper.writeValue(new File("G:\\friend.json"), friend);
		// 写为字节流
		byte[] bytes = mapper.writeValueAsBytes(friend);
		System.out.println(text);
		// 从字符串中读取
		Friend newFriend = mapper.readValue(text, Friend.class);
		// 从字节流中读取
		newFriend = mapper.readValue(bytes, Friend.class);
		// 从文件中读取
		newFriend = mapper.readValue(new File("G:\\friend.json"), Friend.class);
		System.out.println(newFriend);*/

    }

    @Test
    public void contextLoads1() {
        getNextExecTime("*/2 * * ? * TUE-SAT",20);
    }

    public static List<String> getNextExecTime(String cronExpression, Integer numTimes) {
        List<String> list = new ArrayList<>();
        CronTriggerImpl cronTriggerImpl = new CronTriggerImpl();
        try {
            cronTriggerImpl.setCronExpression(cronExpression);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // 这个是重点，一行代码搞定
        List<Date> dates = TriggerUtils.computeFireTimes(cronTriggerImpl, null, numTimes);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (Date date : dates) {
            list.add(dateFormat.format(date));
            System.out.println(dateFormat.format(date));
        }
        return list;
    }

}

