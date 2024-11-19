package jp.ac.it_college.std.s23024.pokequiz.data.repository

import jp.ac.it_college.std.s23024.pokequiz.data.entity.GenerationEntity
import kotlinx.coroutines.flow.Flow


interface GenerationsRepository {
    fun getAllGenerationStream(): Flow<List<GenerationEntity>>
    fun getGenerationStream(id: Int): Flow<GenerationEntity?>
    fun getGenerationCount(): Flow<Int>
    suspend fun upsertGeneration(generation: GenerationEntity)
}