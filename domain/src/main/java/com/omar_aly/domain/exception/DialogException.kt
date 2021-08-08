package com.omar_aly.domain.exception

import com.omar_aly.domain.annotation.ExceptionType
import com.omar_aly.domain.model.Dialog

class DialogException(
    override val code: Int,
    val dialog: Dialog
) : CleanException(code, ExceptionType.DIALOG, null)