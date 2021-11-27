package gikse.di.injects

import dagger.Component
import dagger.Module
import dagger.Provides

/**
 * @author e.a.vlasov
 */
//Компонент нужен, чтобы создать граф зависимостей
@Component(
    modules = [
        CarModule::class
    ]
)
interface CarComponent {

    fun getCar(): Car
}

//Модуль нужен чтобы, определять зависимости либо связывать их
@Module
object CarModule {

    // Эта аннотация используется, чтобы определить зависимость и добавить её в граф
    @Provides
    fun provideComputer(engine: Engine, wheels: Wheels): Car = Car(wheels, engine)

    @Provides
    fun provideEngine(): Engine {
        return Engine(555)
    }

    @Provides
    fun provideWheels(): Wheels {
        return Wheels(2222)
    }
}
