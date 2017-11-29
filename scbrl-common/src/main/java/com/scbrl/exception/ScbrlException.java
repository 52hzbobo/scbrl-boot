package com.scbrl.exception;


import com.scbrl.enums.ResultEnum;

/**
 * Created by 廖师兄
 * 2017-06-11 18:55
 */
public class ScbrlException extends RuntimeException{

    private Integer code;

    public ScbrlException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public ScbrlException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
