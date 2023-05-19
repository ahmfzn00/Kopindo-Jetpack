package com.codenesia.kopindo.ui

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.codenesia.kopindo.data.KopiRepository
import com.codenesia.kopindo.model.Kopi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DetailViewModel(private val repository: KopiRepository): ViewModel() {

    private val _id: MutableStateFlow<String> = MutableStateFlow("")
    val id: StateFlow<String> get() = _id

    private val _detailKopi: MutableStateFlow<Kopi> = MutableStateFlow(
        Kopi(
            "", "", "", ""
        )
    )

    val detailKopi: StateFlow<Kopi> get() = _detailKopi

    fun getDetailKopi(kopiId: String) {
        val response = repository.searchKopibyId(kopiId)
        _detailKopi.value = response
    }


}