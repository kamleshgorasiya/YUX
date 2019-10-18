package ja.kamleshgorasiya.base.di.modules

import android.app.Application

import dagger.Module
import dagger.Provides
import ja.kamleshgorasiya.base.di.scopes.BaseScope

@Module
open class BaseAppModule(private var mApplication: Application) {

    @Provides
    @BaseScope
    open fun provideApplication() = mApplication
}