package us.mifeng.tablayoutandviewpager;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by shido on 2017/8/3.
 */

public interface JieKou {
    @GET("app/common/login.json?username=15210193138&password=123456")
    Call<UserBean> getInfo();


    @POST("app/common/login.json")
    Call<UserBean> getBlog(@Query("username") String username,@Query("password") String password);

    @POST("app/common/login.json")
    Call<UserBean> getStatus(@QueryMap HashMap<String,String> map);
}
