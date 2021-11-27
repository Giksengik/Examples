package gikse.di.start.point

import android.app.Application
import gikse.di.start.point.di.AppComponent

/**
 * @author e.a.vlasov
 */
class DIApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
//        appComponent = DaggerAppComponent.create()
    }
}
