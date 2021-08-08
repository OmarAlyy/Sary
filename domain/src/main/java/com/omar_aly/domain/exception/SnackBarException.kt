package com.omar_aly.domain.exception

import com.omar_aly.domain.annotation.ExceptionType
import com.omar_aly.domain.exception.CleanException

class SnackBarException(
    override val code: Int,
    override val message: String
) : CleanException(code, ExceptionType.SNACK, message)