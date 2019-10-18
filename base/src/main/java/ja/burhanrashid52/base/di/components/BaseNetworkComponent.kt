package ja.kamleshgorasiya.base.di.components

import android.app.Application

import dagger.Component
import ja.kamleshgorasiya.base.api.ApiServices
import ja.kamleshgorasiya.base.di.modules.BaseAppModule
import ja.kamleshgorasiya.base.di.modules.BaseNetworkModule
import ja.kamleshgorasiya.base.di.scopes.BaseScope
import retrofit2.Retrofit

@BaseScope
@Component(modules = [BaseAppModule::class, BaseNetworkModule::class])
interface BaseNetworkComponent {
    // downstream components need these exposed with the return type
    // method name does not really matter
    val apiService: ApiServices
    val application: Application
    val retrofit: Retrofit
}