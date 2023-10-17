package com.example.mvp_arch.common.presenter

interface PresenterLifecycle {
  fun onStart()
  fun onResume()
  fun onPause()
  fun onDestroy()
}