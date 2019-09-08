package com.shmily.excelreader.exception;

public class GetAttributException extends Exception {
    public GetAttributException(String message) {
        super(message);
    }

    public GetAttributException() {
        super("获取属性值异常！");
    }
}
