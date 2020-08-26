package com.lirh.login.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Result {
    private int status;
    private String message;
    private String token;
    private Object Data;

    public Result(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public Result(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        Data = data;
    }

    public Result(int status, String message, String token) {
        this.status = status;
        this.message = message;
        this.token = token;
    }
}

