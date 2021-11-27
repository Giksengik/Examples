package gikse.di.start.point.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import gikse.di.common.ui.delegates.BaseListItem
import gikse.di.common.ui.delegates.DelegateAdapter
import gikse.di.start.point.databinding.DiScreenNavigationButtonBinding

/**
 * @author e.a.vlasov
 */
class DINavigationButtonDelegate(
    private val onButtonClickListener: OnButtonClickListener
) : DelegateAdapter<DINavigationButtonUiModel, DINavigationButtonDelegate.ViewHolder>(
    DINavigationButtonUiModel::class.java
) {

    override fun bindViewHolder(
        model: DINavigationButtonUiModel,
        viewHolder: ViewHolder,
        payloads: List<BaseListItem.Payloadable>
    ) = viewHolder.bind(model)

    class ViewHolder(
        private val binding: DiScreenNavigationButtonBinding,
        private val onButtonClickListener: OnButtonClickListener
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: DINavigationButtonUiModel) {
            binding.navigationButton.apply {
                text = item.name
                setOnClickListener {
                    onButtonClickListener.onButtonClick(item.event)
                }
            }
        }
    }

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        ViewHolder(
            DiScreenNavigationButtonBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            onButtonClickListener
        )
}

interface OnButtonClickListener {
    fun onButtonClick(event: DIStartPointEvent)
}
