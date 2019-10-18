package ja.kamleshgorasiya.base

import android.app.Application
import ja.kamleshgorasiya.base.di.components.BaseNetworkComponent
import ja.kamleshgorasiya.base.di.components.DaggerBaseNetworkComponent
import ja.kamleshgorasiya.base.di.modules.BaseAppModule
import timber.log.Timber

/**
 * Created by Kamlesh Gorasiya on 3/1/2018.
 */
open class BaseApplication : Application() {

    protected lateinit var baseDaggerNetworkComponent: BaseNetworkComponent

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        baseDaggerNetworkComponent =
                DaggerBaseNetworkComponent.builder()
                        .baseAppModule(BaseAppModule(this))
                        .build()
    }
}