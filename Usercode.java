package com.corezoid.usercode;

import com.corezoid.gitcall.runner.api.IUsercode;
import java.util.Map;

public class Usercode implements IUsercode<Map<String, Integer>, Map<String, Integer>> {
    @Override
    public Map<String, Integer> handle(Map<String, Integer> data) throws Exception {
        data.put("foo", 123);
        return data;
    }
}
