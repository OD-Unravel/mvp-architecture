package com.example.mvp_arch.common.example

import com.example.mvp_arch.common.datasource.BaseDataSource
import io.reactivex.Observable

class ExampleDataSource: BaseDataSource<Unit, String>() {
  override fun getData(payload: Unit): Observable<String> {
    return Observable.just("This is an example!")
  }
}