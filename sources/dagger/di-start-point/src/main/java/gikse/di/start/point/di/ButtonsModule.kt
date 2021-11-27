package gikse.di.start.point.di

import dagger.Binds
import dagger.Module
import gikse.di.start.point.model.DINavigationButtonsFactory
import gikse.di.start.point.model.DINavigationButtonsFactoryImpl

/**
 * @author e.a.vlasov
 */
@Module
interface ButtonsModule {

    @Binds
    fun bindFactory(factory: DINavigationButtonsFactoryImpl): DINavigationButtonsFactory
}
