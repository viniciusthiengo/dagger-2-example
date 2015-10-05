package br.com.thiengo.daggerexample.contract;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import br.com.thiengo.daggerexample.module.ApplicationModule;
import dagger.Component;

/**
 * Created by viniciusthiengo on 10/5/15.
 */

@Singleton
@Component( modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {
    SharedPreferences providePreferences();
}
