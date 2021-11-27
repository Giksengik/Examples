package gikse.di.start.point

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
