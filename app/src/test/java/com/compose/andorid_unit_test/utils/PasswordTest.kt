package com.compose.andorid_unit_test.utils

import org.junit.Assert.assertEquals
import org.junit.Test

class PasswordTest {

    @Test
    fun validatePassword_blankInput_expectedRequiredField(){
        val sut = Helper()
        val result = sut.validatePassword("  ")
        assertEquals("password is required field",result)
    }

    @Test
    fun validatePassword_2CharInput_expectedvalidationMsg(){
        val sut = Helper()
        val result = sut.validatePassword("ab")
        assertEquals("Length of the password should be greater than 6",result)
    }

    @Test
    fun validatePassword_CorrectInput_expectedValidPassword(){
        val sut = Helper()
        val result = sut.validatePassword("Pass123")
        assertEquals("Valid",result)
    }
}