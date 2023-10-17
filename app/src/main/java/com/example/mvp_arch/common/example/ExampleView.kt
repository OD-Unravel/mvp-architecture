package com.example.mvp_arch.common.example

import com.example.mvp_arch.common.view.BaseView

interface ExampleView: BaseView {
  fun showText(text: String)
}