package com.example.rv.do_itindia;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

class RegisterRequest extends StringRequest{

    private static final String REGISTER_REQUEST_URL = "http://rawtandi.000webhostapp.com/Register.php";
    private final Map<String, String> params;

    public RegisterRequest(String name, String email, String password, int phone, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("email", email);
        params.put("password", password);
        params.put("phone", phone + "");
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
