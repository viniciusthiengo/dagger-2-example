package br.com.thiengo.daggerexample;

import android.app.Application;

import br.com.thiengo.daggerexample.contract.ApplicationComponent;
import br.com.thiengo.daggerexample.contract.DaggerApplicationComponent;
import br.com.thiengo.daggerexample.module.ApplicationModule;

/**
 * Created by viniciusthiengo on 10/5/15.
 */
public class AndroidApplication extends Application {
    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent(){
        return( mApplicationComponent );
    }
}
