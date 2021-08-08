package com.omar_aly.domain.exception

import com.omar_aly.domain.annotation.ExceptionType
import com.omar_aly.domain.exception.CleanException

class ToastException(
    override val code: Int,
    override val message: String
) : CleanException(code, ExceptionType.TOAST, message)