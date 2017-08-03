package us.mifeng.tablayoutandviewpager;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by shido on 2017/8/3.
 */

public class persiler {
    public static void getCall(Callback<UserBean> callback){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.190.188/Goods/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JieKou jieKou = retrofit.create(JieKou.class);
        //Call<UserBean> blog = jieKou.getBlog("15210193138","123456");
        //blog.enqueue(callback);
        HashMap<String ,String> map = new HashMap<>();
        map.put("username","");
        map.put("password","123456");
        //Call<UserBean> status = jieKou.
        //
        // getStatus(map);
        //status.enqueue(callback);

        Call<UserBean> info = jieKou.getInfo();
        info.enqueue(callback);
    }

}
