package gikse.di.start.point.di

import dagger.Component
import gikse.di.start.point.presentation.DIStartActivity

/**
 * @author e.a.vlasov
 */
@Component(
    modules = [
        ButtonsModule::class
    ]
)
interface ActivityComponent {

    fun inject(activity: DIStartActivity)
}
