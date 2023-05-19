package com.codenesia.kopindo.data

import com.codenesia.kopindo.model.Kopi
import com.codenesia.kopindo.model.KopiData

class KopiRepository {
    fun getKopi(): List<Kopi> {
        return KopiData.kopi
    }

    fun searchKopi(query: String): List<Kopi> {
        return KopiData.kopi.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }

    fun searchKopibyId(id: String): Kopi {
        val kopi = KopiData.kopi.single { it.id == id }
        return Kopi(
            kopi.id,
            kopi.name,
            kopi.desc,
            kopi.photoUrl
        )
    }
}