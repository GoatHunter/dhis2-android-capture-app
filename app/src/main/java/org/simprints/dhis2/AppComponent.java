package org.simprints.dhis2;

import org.simprints.dhis2.data.prefs.PreferenceModule;
import org.simprints.dhis2.data.prefs.PreferenceProvider;
import org.simprints.dhis2.data.schedulers.SchedulerModule;
import org.simprints.dhis2.data.server.ServerComponent;
import org.simprints.dhis2.data.server.ServerModule;
import org.simprints.dhis2.data.service.workManager.WorkManagerModule;
import org.simprints.dhis2.usescases.login.LoginComponent;
import org.simprints.dhis2.usescases.login.LoginModule;
import org.simprints.dhis2.usescases.splash.SplashComponent;
import org.simprints.dhis2.usescases.splash.SplashModule;
import org.simprints.dhis2.utils.UtilsModule;
import org.simprints.dhis2.utils.analytics.AnalyticsModule;
import org.simprints.dhis2.utils.session.PinModule;
import org.simprints.dhis2.utils.session.SessionComponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ppajuelo on 10/10/2017.
 */
@Singleton
@Component(modules = {
        AppModule.class, SchedulerModule.class, UtilsModule.class, AnalyticsModule.class, PreferenceModule.class, WorkManagerModule.class
})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        Builder appModule(AppModule appModule);

        Builder schedulerModule(SchedulerModule schedulerModule);

        Builder utilModule(UtilsModule utilsModule);

        Builder analyticsModule(AnalyticsModule module);

        Builder preferenceModule(PreferenceModule preferenceModule);

        Builder workManagerController(WorkManagerModule workManagerModule);

        AppComponent build();
    }

    PreferenceProvider preferenceProvider();

    //injection targets
    void inject(App app);

    //sub-components
    ServerComponent plus(ServerModule serverModule);

    SplashComponent plus(SplashModule module);

    LoginComponent plus(LoginModule loginContractsModule);

    SessionComponent plus(PinModule pinModule);
}
