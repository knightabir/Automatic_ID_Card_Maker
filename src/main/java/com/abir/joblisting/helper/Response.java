package com.abir.joblisting.helper;

import javax.xml.transform.Result;
import java.util.List;

public class Response {
    public boolean status;
    public int code;
    public String message;
    public List<?> result;


    public Response() {
    }

    public Response(boolean status, int code, String message, List<?> result) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.result = result;
    }
}
