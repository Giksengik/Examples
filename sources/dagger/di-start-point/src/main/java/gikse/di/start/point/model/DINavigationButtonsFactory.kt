package gikse.di.start.point.model

import gikse.di.start.point.presentation.DINavigationButtonUiModel
import gikse.di.start.point.presentation.DIStartPointEvent
import javax.inject.Inject

/**
 * @author e.a.vlasov
 */
interface DINavigationButtonsFactory : () -> List<DINavigationButtonUiModel>

class DINavigationButtonsFactoryImpl @Inject constructor(): DINavigationButtonsFactory {

    override fun invoke(): List<DINavigationButtonUiModel> = listOf(
        DINavigationButtonUiModel("Injects", DIStartPointEvent.OnInjectsClick)
    )
}
