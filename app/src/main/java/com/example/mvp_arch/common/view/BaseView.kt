package com.example.mvp_arch.common.view

interface BaseView {
  fun showLoading()
  fun showError(error: Throwable)
}