package okhttputils;

import ModelBean.BasicBean;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by tinyzo on 2016-12-08.
 */

public interface NetService {

    //http://gank.io/api/data/
    @GET("api/data/{type}/{count}/{page}")
    Observable<BasicBean> getGirls(
            @Path("type") String type,
            @Path("count") int count,
            @Path("page") int page
    );
}
