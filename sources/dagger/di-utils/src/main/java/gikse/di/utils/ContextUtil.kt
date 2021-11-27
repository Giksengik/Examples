package gikse.di.utils

import android.content.Context
import gikse.di.start.point.di.AppComponent
import gikse.di.start.point.DIApplication

/**
 * @author e.a.vlasov
 */
val Context.appComponent: AppComponent
    get() = when(this) {
        is DIApplication -> this.appComponent
        else -> this.applicationContext.appComponent
    }
