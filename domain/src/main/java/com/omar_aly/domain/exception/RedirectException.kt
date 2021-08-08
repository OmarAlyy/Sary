package com.omar_aly.domain.exception

import com.omar_aly.domain.annotation.ExceptionType
import com.omar_aly.domain.model.Redirect
import com.omar_aly.domain.exception.CleanException

class RedirectException(
    override val code: Int,
    val redirect: Redirect
) : CleanException(code, ExceptionType.REDIRECT, null)