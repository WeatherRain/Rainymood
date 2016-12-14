package zoloandgong.rainymood;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ModelBean.BasicBean;
import Presenter.DataPresenter;
import butterknife.ButterKnife;

/**
 * Created by tinyzo on 2016-12-09.
 */

public class DataFrament extends BaseFragment implements DataPresenter.View {
    public static final String TAG = "GirlsFragment";
    private TextView mGirlsRecyclerView;

    private android.view.View networkErrorView;

    private ArrayList<BasicBean.ResultsEntity> data;

    private Presenter.GirlsPresenter mPresenter;



    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        mGirlsRecyclerView= (TextView) view.findViewById(R.id.girls_recycler_view);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fra_home;
    }

    public static DataFrament getInstance() {
        DataFrament mainFragment = new DataFrament();
        return mainFragment;
    }


    @Override
    public void refresh(List<BasicBean.ResultsEntity> datas) {
           data.clear();
           data.addAll(datas);
           mGirlsRecyclerView.setText(data.get(0).getName());
    }

    @Override
    public void load(List<BasicBean.ResultsEntity> datas) {
        data.clear();

    }

    @Override
    public void showError() {

    }

    @Override
    public void showNormal() {

    }
}
