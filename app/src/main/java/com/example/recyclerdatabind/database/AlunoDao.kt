package com.example.recyclerdatabind.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AlunoDao {

    @Query("SELECT * FROM Aluno")
    fun selectAll(): List<Aluno>

    @Insert
    fun add(vararg aluno: Aluno)
}