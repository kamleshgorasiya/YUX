package com.kamleshgorasiya.player

import com.kamleshgorasiya.player.di.TestBaseAppModule
import ja.kamleshgorasiya.base.di.components.DaggerBaseNetworkComponent

/**
 *
 * @author <a href="https://github.com/kamleshgorasiya">Kamlesh Gorasiya</a>
 * @since 6/22/2018
 */

class TestPlayerApp : PlayerApp() {

    override fun onCreate() {
        super.onCreate()
        baseNetworkComponent = DaggerBaseNetworkComponent
                .builder()
                .baseAppModule(TestBaseAppModule(this))
                .build()
    }
}