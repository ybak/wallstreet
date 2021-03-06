package com.yeepbank.android.request.user;

import android.content.Context;
import com.yeepbank.android.Cst;
import com.yeepbank.android.http.BaseRequest;
import com.yeepbank.android.http.StringListener;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by WW on 2015/11/20.
 */
public class ForgetPasswordMsgCodeRequest extends BaseRequest {

    private String mobile;
    public ForgetPasswordMsgCodeRequest(Context context, StringListener stringListener,String mobile) {
        super(context, stringListener);
        this.mobile = mobile;
    }

    @Override
    protected String getUrl() {
        return Cst.URL.FORGET_PASSWORD_GET_MSG_CODE_URL;
    }

    @Override
    protected int getMethod() {
        return METHOD_POST;
    }

    @Override
    protected Map<String, String> getParams() {
        HashMap<String,String> params = new HashMap<String,String>();
        params.put("mobile",mobile);
        params.put("type","FIND_PASSWORD");
        return params;
    }

    @Override
    public void stringRequest() {
        super.stringRequest();
    }
}
