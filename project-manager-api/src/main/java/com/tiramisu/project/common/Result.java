package com.tiramisu.project.common;

import lombok.Data;

@Data
public class Result {
    private Integer code;

    private String message;

    private Object data;

    public static Result success() {
        return success(null);
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("成功");
        result.setData(data);
        return result;
    }

    public static Result error(String message) {
        return error(-1, message, null);
    }

    public static Result error(Integer code, String message) {
        return error(code, message, null);
    }

    public static Result error(Integer code, String message, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }


}
