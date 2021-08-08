package com.omar_aly.domain.model

import com.omar_aly.domain.annotation.Redirect

data class Redirect(@Redirect val redirect: Int, val redirectObject: Any? = null)