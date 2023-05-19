package com.codenesia.kopindo.model

data class Kopi(
    val id: String,
    val name: String,
    val desc: String? = null,
    val photoUrl: String,
)

object KopiData {
    val kopi = listOf(
        Kopi(
            "1",
            "Toraja Coffe",
            "Kopi toraja adalah kopi khas sulawesi selatan",
            "https://images.unsplash.com/photo-1442411210769-b95c4632195e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8dG9yYWphJTIwY29mZmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=400&q=60"
        ),
        Kopi(
            "2",
            "Arabica Coffe",
            "Kopi Arabica adalah kopi dari arab yang di produksi lokal",
            "https://images.unsplash.com/photo-1587985782608-20062892559d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=774&q=80"
        ),
        Kopi(
            "3",
            "Mandalika Coffe",
            "Kopi Mandalika adalah kopi yang di berasal dari nusa tenggara",
            "https://images.unsplash.com/photo-1587738108001-570c22f9063d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=774&q=80"
        ),
        Kopi(
            "4",
            "Robusta Coffe",
            "Kopi Robusta adalah kopi yang telah melalui berbagai jenis campuran",
            "https://images.unsplash.com/photo-1654202751843-5e6fc2c07c84?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80"
        ),
        Kopi(
            "5",
            "Wonosalam Coffe",
            "Kopi Wonosalam adalah kopi yang berasal dari kabupaten wonosalam",
            "https://images.unsplash.com/photo-1497935586351-b67a49e012bf?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=871&q=80"
        ),
        Kopi(
            "6",
            "Malino Coffe",
            "Kopi Malino adalah kopi yang diproduksi oleh kabupaten gowa",
            "https://images.unsplash.com/photo-1493925410384-84f842e616fb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=465&q=80"
        ),
        Kopi(
            "7",
            "Bugis Coffe",
            "Kopi Bugis adalah kopi turun-temurun dari masyarakat bugis",
            "https://images.unsplash.com/photo-1603719461446-3c44df22d274?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"
        ),
        Kopi(
            "8",
            "Bandung Coffe",
            "Kopi Bandung adalah salah satu kopi terbaik di nusantara",
            "https://images.unsplash.com/photo-1626779503098-6703404a584e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80"
        ),
        Kopi(
            "9",
            "Minang Coffe",
            "Kopi Minang adalah kopi yang berasal dari bukit tinggi",
            "https://images.unsplash.com/photo-1590082871875-064201a27373?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=435&q=80"
        ),
        Kopi(
            "10",
            "Simalungun Coffe",
            "Kopi Simalungun adalah kopi yang berasal dari sumatera utara",
            "https://images.unsplash.com/photo-1494314671902-399b18174975?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"
        ),
        Kopi(
            "11",
            "Melayu Coffe",
            "Kopi Melayu adalah kopi yang berasal dari tanah melayu",
            "https://images.unsplash.com/photo-1625021659159-f63f546d74a7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mzh8fGNvZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=400&q=60"
        ),

        Kopi(
            "12",
            "Betawi Coffe",
            "Kopi yang berasal dari daerah jabodetabek",
            "https://images.unsplash.com/photo-1620820186187-fc32e79adb74?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=386&q=80"
        ),

    )
}