package br.com.thiengo.daggerexample.module;

import br.com.thiengo.daggerexample.domain.Car;
import br.com.thiengo.daggerexample.domain.Engine;
import br.com.thiengo.daggerexample.scope.PerActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by viniciusthiengo on 10/5/15.
 */

@Module
public class CarModule {
    @Provides
    @PerActivity
    public Engine provideEngine(){
        return( new Engine() );
    }


    @Provides
    @PerActivity
    public Car provideCar( ){
        return( new Car( ) );
    }
}
