package com.example.mvp_arch.common.presenter

import com.example.mvp_arch.common.view.BaseView
import io.reactivex.Observer
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class Presenter<V : BaseView>: PresenterLifecycle {

  abstract val view: V

  private val disposables: CompositeDisposable? = null

  override fun onStart() {}
  override fun onResume() {}
  override fun onPause() {}

  override fun onDestroy() {
    disposables?.dispose()
  }

  abstract inner class BaseSubscriber<T : Any> : Observer<T> {
    override fun onSubscribe(d: Disposable) { disposables?.add(d) }
    override fun onComplete() {}
  }
}