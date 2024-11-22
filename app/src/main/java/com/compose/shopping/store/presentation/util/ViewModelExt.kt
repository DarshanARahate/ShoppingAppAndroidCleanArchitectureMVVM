package com.compose.shopping.store.presentation.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.compose.shopping.util.EventBus
import kotlinx.coroutines.launch

fun ViewModel.sendEvent(event: Any) {
    viewModelScope.launch {
        EventBus.sendEvent(event)
    }
}