package gikse.di.start.point.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import gikse.di.common.ui.delegates.CompositeAdapter
import gikse.di.common.ui.utils.lazyUnsafe
import gikse.di.start.point.model.DINavigationButtonsFactory
import gikse.di.start.point.databinding.ActivityDiStartBinding
import gikse.di.start.point.di.DaggerActivityComponent
import javax.inject.Inject

class DIStartActivity : AppCompatActivity(), OnButtonClickListener {

    private val buttonsDelegateAdapter: CompositeAdapter by lazyUnsafe {
        CompositeAdapter.Builder()
            .add(DINavigationButtonDelegate(this))
            .build()
    }

    private val viewBinding: ActivityDiStartBinding by lazyUnsafe {
        ActivityDiStartBinding.inflate(layoutInflater)
    }

    @Inject
    lateinit var buttonsFactory: DINavigationButtonsFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerActivityComponent.create().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        initList()
    }

    private fun initList() {
        viewBinding.diScreensList.adapter = buttonsDelegateAdapter

        buttonsDelegateAdapter.submitList(buttonsFactory())
    }

    override fun onButtonClick(event: DIStartPointEvent) {
        TODO("Not yet implemented")
    }
}
