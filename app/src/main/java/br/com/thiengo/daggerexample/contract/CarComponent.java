package br.com.thiengo.daggerexample.contract;

import android.content.SharedPreferences;

import br.com.thiengo.daggerexample.MainActivity;
import br.com.thiengo.daggerexample.domain.Car;
import br.com.thiengo.daggerexample.module.CarModule;
import br.com.thiengo.daggerexample.scope.PerActivity;
import dagger.Component;

/**
 * Created by viniciusthiengo on 10/5/15.
 */

@PerActivity
@Component(
        dependencies = {
                ApplicationComponent.class
        },
        modules = {
                CarModule.class
        }
)
public interface CarComponent {
    public void inject( Car car );

    Car provideCar();

    SharedPreferences providePreferences();
}
