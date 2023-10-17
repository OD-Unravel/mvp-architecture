package com.example.mvp_arch.common.example

import com.example.mvp_arch.common.model.Model
import com.google.gson.annotations.SerializedName

data class ExampleResponse(
  @SerializedName("id")
  override val id: String = "",
  @SerializedName("text")
  val text: String = "This is an example!"
): Model<String>