package com.example.geoquiz

import org.junit.Assert.*

import androidx.lifecycle.SavedStateHandle
import org.junit.Assert.assertEquals
import org.junit.Test
class QuizViewModelTest {
    @Test
    fun providesExpectedQuestionText() {
        val savedStateHandle = SavedStateHandle()
        val quizViewModel = QuizViewModel(savedStateHandle)
        assertEquals(R.string.question_australia, quizViewModel.currentQuestionText)
    }@Test
    fun wrapsAroundQuestionBank() {
        val savedStateHandle = SavedStateHandle(mapOf(CURRENT_INDEX_KEY to 5))
        val quizViewModel = QuizViewModel(savedStateHandle)
        assertEquals(R.string.question_asia, quizViewModel.currentQuestionText)
        quizViewModel.moveToNext()
        assertEquals(R.string.question_australia, quizViewModel.currentQuestionText)
    }@Test
    fun Question1Answer() {
        val savedStateHandle = SavedStateHandle(mapOf(CURRENT_INDEX_KEY to 0))
        val quizViewModel = QuizViewModel(savedStateHandle)
        assertEquals(R.string.question_australia, quizViewModel.currentQuestionText)
        assertTrue(quizViewModel.currentQuestionAnswer)
    }@Test
    fun Question2Answer() {
        val savedStateHandle = SavedStateHandle(mapOf(CURRENT_INDEX_KEY to 1))
        val quizViewModel = QuizViewModel(savedStateHandle)
        assertEquals(R.string.question_oceans, quizViewModel.currentQuestionText)
        assertTrue(quizViewModel.currentQuestionAnswer)
    }@Test
    fun Question3Answer() {
        val savedStateHandle = SavedStateHandle(mapOf(CURRENT_INDEX_KEY to 2))
        val quizViewModel = QuizViewModel(savedStateHandle)
        assertEquals(R.string.question_mideast, quizViewModel.currentQuestionText)
        assertFalse(quizViewModel.currentQuestionAnswer)
    }@Test
    fun Question4Answer() {
        val savedStateHandle = SavedStateHandle(mapOf(CURRENT_INDEX_KEY to 3))
        val quizViewModel = QuizViewModel(savedStateHandle)
        assertEquals(R.string.question_africa, quizViewModel.currentQuestionText)
        assertFalse(quizViewModel.currentQuestionAnswer)
    }@Test
    fun Question5Answer() {
        val savedStateHandle = SavedStateHandle(mapOf(CURRENT_INDEX_KEY to 4))
        val quizViewModel = QuizViewModel(savedStateHandle)
        assertEquals(R.string.question_americas, quizViewModel.currentQuestionText)
        assertTrue(quizViewModel.currentQuestionAnswer)
    }@Test
    fun Question6Answer() {
        val savedStateHandle = SavedStateHandle(mapOf(CURRENT_INDEX_KEY to 5))
        val quizViewModel = QuizViewModel(savedStateHandle)
        assertEquals(R.string.question_asia, quizViewModel.currentQuestionText)
        assertTrue(quizViewModel.currentQuestionAnswer)
    }
}