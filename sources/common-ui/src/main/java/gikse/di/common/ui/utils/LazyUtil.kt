package gikse.di.common.ui.utils

/**
 * @author e.a.vlasov
 */
fun <T> lazyUnsafe(initializer: () -> T): Lazy<T> = lazy(LazyThreadSafetyMode.NONE, initializer)
