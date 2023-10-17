package com.example.mvp_arch.common.example

import com.example.mvp_arch.common.presenter.Presenter

class ExamplePresenter(
  override val view: ExampleView
): Presenter<ExampleView>()  {

  private val exampleDataSource = ExampleDataSource()

  fun exampleLoadData() {
    val exampleSubscriber = object : BaseSubscriber<String>() {
      override fun onNext(t: String) {
        view.showText(t)
      }

      override fun onError(e: Throwable) {
        view.showError(e)
      }
    }
    exampleDataSource.get(Unit).subscribe(exampleSubscriber)
  }
}