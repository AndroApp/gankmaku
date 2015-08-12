package me.pkliang.gankmaku.ganhuo;

import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager;

import me.pkliang.gankmaku.application.App;

/**
 * Created by Omistaja on 8/11/2015.
 */
public class AndroidFragment extends BaseGanhuoFragment<AndroidPresenter>
        implements RecyclerViewPager.OnPageChangedListener {

    private AndroidComponent component;

    @Override
    public AndroidPresenter createPresenter() {
        return component.presenter();
    }

    @Override
    protected void injectDependencies() {
        component = DaggerAndroidComponent.builder()
                .appComponent(App.getAppComponent())
                .androidModule(new AndroidModule())
                .build();
        component.inject(this);
    }


}
