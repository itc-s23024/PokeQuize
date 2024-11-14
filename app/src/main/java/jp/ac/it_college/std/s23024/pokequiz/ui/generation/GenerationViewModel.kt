package jp.ac.it_college.std.s23024.pokequiz.ui.generation

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import jp.ac.it_college.std.s23024.pokequiz.data.entity.GenerationEntity
import jp.ac.it_college.std.s23024.pokequiz.data.repository.GenerationsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class GenerationViewModel @Inject constructor(
    private val repository: GenerationsRepository
) : ViewModel() {
    val generations: Flow<List<GenerationEntity>> =
        repository.getAllGenerationStream()

    suspend fun insert(generation: GenerationEntity) =
        repository.upsertGeneration(generation)
}