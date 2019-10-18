package com.kamleshgorasiya.player.di

import android.app.Application
import dagger.Module
import dagger.Provides
import ja.kamleshgorasiya.base.di.modules.BaseAppModule
import ja.kamleshgorasiya.base.di.scopes.BaseScope

/**
 *
 * @author <a href="https://github.com/kamleshgorasiya">Kamlesh Gorasiya</a>
 * @since 6/22/2018
 */

@Module
class TestBaseAppModule(private var mApplication: Application) : BaseAppModule(mApplication) {

    @Provides
    @BaseScope
    override fun provideApplication() = mApplication
}