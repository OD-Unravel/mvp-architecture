package com.example.mvp_arch.common.repository

import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

abstract class BaseRepository<P, R> {

  abstract fun getData(payload: P): Single<R>

  fun get(payload: P): Single<R> {
    return getData(payload).subscribeOn(Schedulers.io())
  }
}