package com.tobe.scholarlytest.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tobe.scholarlytest.domain.ContentRepository
import com.tobe.scholarlytest.domain.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DisplayViewModel @Inject constructor(
    private val repo: ContentRepository
) : ViewModel() {

    private val _state = MutableStateFlow(Result())
    val state: StateFlow<Result> = _state.asStateFlow()

    init {
        getResult()
    }

    private fun getResult() {
        viewModelScope.launch {
            val reload = repo.getResult()
            _state.update {
                it.copy(
                    text = reload.text,
                    tableContent = reload.tableContent,
                    cbtQuestion = reload.cbtQuestion,
                    imageCountry = reload.imageCountry,
                    unorderedList = reload.unorderedList,
                )
            }
        }
    }
}