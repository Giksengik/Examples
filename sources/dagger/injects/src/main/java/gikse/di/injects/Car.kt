package gikse.di.injects

/**
 * @author e.a.vlasov
 */
data class Car(
    val wheels: Wheels,
    val engine: Engine,
)

class Wheels(
    val radius: Int
)

class Engine(
    val power: Int
)
