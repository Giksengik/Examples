package gikse.di.start.point

import gikse.di.common.ui.delegates.BaseListItem

/**
 * @author e.a.vlasov
 */
class DINavigationButtonUiModel(
    val name: String,
    val event: DIStartPointEvent
) : BaseListItem {
    override fun id(): String = name

    override fun content(): Any = event
}
