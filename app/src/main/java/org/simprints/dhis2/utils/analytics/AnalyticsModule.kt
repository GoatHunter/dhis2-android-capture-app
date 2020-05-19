package org.simprints.dhis2.utils.analytics

import android.content.Context
import com.google.firebase.analytics.FirebaseAnalytics
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import org.simprints.dhis2.data.prefs.PreferenceProvider

@Module
@Singleton
class AnalyticsModule internal constructor() {

    @Provides
    @Singleton
    fun providesAnalyticsHelper(
        context: Context,
        preferencesProvider: PreferenceProvider
    ): AnalyticsHelper {
        return AnalyticsHelper(
            FirebaseAnalytics.getInstance(context),
            preferencesProvider
        )
    }

    @Provides
    fun providesAnalyticsInterceptor(analyticHelper: AnalyticsHelper): AnalyticsInterceptor {
        return AnalyticsInterceptor(analyticHelper)
    }
}
