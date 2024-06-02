package com.myfunds.fds.util;

/**
 * @author: jbk-xiao
 * @projectName: fund_distribution_system
 * @packageName: com.myfunds.fds.util
 * @Description:
 * @create: 2021-04-26
 */

import com.google.gson.Gson;

import java.util.List;

/**
 * 生成json用的
 */
public class CreateJson {
    private Gson gson = new Gson();

    public  String toJson(List list){
        return gson.toJson(list);
    }

    /**
     * 为请求类型为keyword的结果生成JSON
     * @param pageCount
     * @param queries
     * @return
     */
    public <T> String toJson(String pageCount, List<T> queries){
        String jsonInfo=toJson(queries),
                jsonPageCount="[{\"pageCount\":\""+pageCount+"\"}";
        if(queries.size()==0) jsonInfo=jsonPageCount+"]";
        else jsonInfo=jsonPageCount+","+jsonInfo.substring(1);
        return jsonInfo;
    }

}