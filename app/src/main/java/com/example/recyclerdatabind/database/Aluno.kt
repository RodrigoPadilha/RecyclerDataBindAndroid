package com.example.recyclerdatabind.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Aluno (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name ="id")
    val id: Long = 0,

    @ColumnInfo(name = "nome")
    val nome: String,

    @ColumnInfo(name = "sobrenome")
    val sobrenome: String,

    @ColumnInfo(name = "idade")
    val idade: Int
)