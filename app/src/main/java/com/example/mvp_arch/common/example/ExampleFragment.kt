package com.example.mvp_arch.common.example

import android.widget.Button
import android.widget.TextView
import com.example.mvp_arch.R
import com.example.mvp_arch.common.fragment.BaseFragment
import timber.log.Timber

class ExampleFragment: BaseFragment<ExampleView, ExamplePresenter>(
  R.layout.fragment_example
), ExampleView {

  override val presenter: ExamplePresenter = ExamplePresenter(this)

  private var exampleButton: Button? = null
  private var exampleText: TextView? = null

  override fun bindViews() {
    exampleButton = view?.findViewById(R.id.example_button)
    exampleText = view?.findViewById(R.id.example_text)
  }

  override fun setActions() {
    exampleButton?.setOnClickListener { presenter.exampleLoadData() }
  }

  override fun showText(text: String) {
    exampleText?.text = text
  }

  override fun showLoading() {
    // Show Loading
  }

  override fun showError(error: Throwable) {
    exampleText?.text = error.message
  }
}