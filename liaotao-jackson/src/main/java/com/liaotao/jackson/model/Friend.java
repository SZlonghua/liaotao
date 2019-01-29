package com.liaotao.jackson.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: liaotao
 * @Date: 2019/1/29 17:26
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Friend {

    private String nickname;
    private int age;
}
