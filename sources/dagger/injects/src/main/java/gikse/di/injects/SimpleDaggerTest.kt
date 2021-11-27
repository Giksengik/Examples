package gikse.di.injects

/**
 * @author e.a.vlasov
 */
fun main() {
    val component = DaggerCarComponent.create()
    print(component.getCar())
}
