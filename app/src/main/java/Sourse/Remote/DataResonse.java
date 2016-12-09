package Sourse.Remote;

import Sourse.DataSourse;

/**
 * Created by tinyzo on 2016-12-09.
 */

public class DataResonse implements DataSourse {
    private RemoteDataResourse mRemoteDataResouse;
    public DataResonse()
    {
        mRemoteDataResouse=new RemoteDataResourse();
    }
    @Override
    public void getData(int page, int size, DataLoadCallBack callback) {
             mRemoteDataResouse.getData(page,size,callback);
    }
}
