package com.example.mvp_arch.common.fragment

import android.os.Bundle
import android.view.View
import com.example.mvp_arch.common.presenter.Presenter
import com.example.mvp_arch.common.view.BaseView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

abstract class BaseBottomSheetFragment<V: BaseView, P: Presenter<V>>(
  private val layoutId: Int
): BottomSheetDialogFragment(layoutId) {

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