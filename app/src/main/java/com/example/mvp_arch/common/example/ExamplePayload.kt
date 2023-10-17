package com.example.mvp_arch.common.example

import com.example.mvp_arch.common.payload.Payload

data class ExamplePayload(
  override val id: String = "PAYLOAD",
  val parameter: String = "PAYLOAD_PARAMETER"
): Payload<String>