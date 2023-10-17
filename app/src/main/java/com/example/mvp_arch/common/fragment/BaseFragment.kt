package com.example.mvp_arch.common.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mvp_arch.common.presenter.Presenter
import com.example.mvp_arch.common.view.BaseView

abstract class BaseFragment<V: BaseView, P: Presenter<V>>(
  private val layoutId: Int
): Fragment(layoutId) {

  abstract val presenter: P

  abstract fun bindViews()
  abstract fun setActions()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    presenter.onStart()
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    bindViews()
    setActions()
  }

  final override fun onResume() {
    super.onResume()
    presenter.onResume()
  }

  final override fun onDestroy() {
    presenter.onDestroy()
    super.onDestroy()
  }
}