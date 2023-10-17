package com.example.mvp_arch.common.payload

interface Payload<T : Any> {
  val id: T
}