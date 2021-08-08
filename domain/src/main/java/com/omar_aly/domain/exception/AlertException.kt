package com.omar_aly.domain.exception

import com.omar_aly.domain.annotation.ExceptionType
import com.omar_aly.domain.exception.CleanException

class AlertException(
    override val code: Int,
    override val message: String,
    val title: String? = null
) : CleanException(code, ExceptionType.ALERT, message)