package com.example.mvp_arch.common.datasource

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

abstract class BaseDataSource<P, R> {
  protected abstract fun getData(payload: P): Observable<R>

  fun get(payload: P): Observable<R> {
    return getData(payload).subscribeOn(Schedulers.io())
  }
}