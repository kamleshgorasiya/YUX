package com.kamleshgorasiya.player.di.components

import com.kamleshgorasiya.player.di.modules.AppComponent
import com.kamleshgorasiya.player.di.scopes.AppScope
import com.kamleshgorasiya.player.dashboard.DashboardViewModel
import dagger.Component
import ja.kamleshgorasiya.base.di.components.BaseNetworkComponent

/**
 * Created by Kamlesh Gorasiya on 3/1/2018.
 */

@AppScope
@Component(dependencies = [BaseNetworkComponent::class], modules = [AppComponent::class])
interface ActivityComponent {
    fun inject(dashboardViewModel: DashboardViewModel)
}

