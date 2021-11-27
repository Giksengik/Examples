package gikse.di.common.ui.delegates

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil

/**
 * @author e.a.vlasov
 */
// Наследники должны быть дата классами для корректной работы
interface BaseListItem {
    fun id(): String

    fun content(): Any

    fun payload(other: Any): Payloadable = Payloadable.None

    interface Payloadable {
        object None: Payloadable
    }
}

class BaseListItemDiffUtil : DiffUtil.ItemCallback<BaseListItem>() {

    override fun areItemsTheSame(oldItem: BaseListItem, newItem: BaseListItem): Boolean =
        oldItem::class == newItem::class && oldItem.id() == newItem.id()

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: BaseListItem, newItem: BaseListItem): Boolean =
        oldItem.content() == newItem.content()

    override fun getChangePayload(oldItem: BaseListItem, newItem: BaseListItem): Any =
        oldItem.payload(newItem)
}
