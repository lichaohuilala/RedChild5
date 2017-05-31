package com.bawei.redchild.home.h_url_f1;

import com.bawei.redchild.home.bean.ChatMessage;


import com.bawei.redchild.home.bean.Result;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;

/**
*日期:2017/5/26 
 * 时间:8:36
*类描述：
*/

public class HttpUtils {
    public static final String URL="http://www.tuling123.com/openapi/api";
    public static final String API_KEY="beca64daf5dd41fd990f9a671fa25b8c";
    public static  String doGet(String msg){
        String result="";
        String url=setParams(msg);
        InputStream inputStream=null;
        ByteArrayOutputStream stream=null;
        try {
            java.net.URL urlNet=new URL(url);
            HttpURLConnection connection= (HttpURLConnection) urlNet.openConnection();
            connection.setReadTimeout(5000);
            connection.setConnectTimeout(5000);
            connection.setRequestMethod("GET");
            inputStream = connection.getInputStream();
            int len=-1;
            byte[] b=new byte[1024];
            stream=new ByteArrayOutputStream();
            while((len=inputStream.read(b))!=-1){
                stream.write(b,0,len);
            }
            //清除缓存区
            stream.flush();
            result=new String(stream.toByteArray());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(stream!=null){
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
    //发送消息，得到返回的消息
    public static ChatMessage sendMessage(String msg){
        ChatMessage chatMessage=new ChatMessage();
        String jsonRes = doGet(msg);
        Gson gson=new Gson();
        Result result=null;
        try {
            result=gson.fromJson(jsonRes,Result.class);
            chatMessage.setMsg(result.getText());
        }catch (JsonSyntaxException e){
            chatMessage.setMsg("服务器忙");
        }
       chatMessage.setDate(new Date());
        chatMessage.setType(ChatMessage.Type.INCOMING);
        return chatMessage;
    }
    //拼接参数
    private static String setParams(String msg) {
        String url= null;
        try {
            url = URL+"?key="+API_KEY+"&info="+ URLEncoder.encode(msg,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return  url;
    }
}
