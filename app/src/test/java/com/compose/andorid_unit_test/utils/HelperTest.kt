package com.compose.andorid_unit_test.utils

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {

    lateinit var helper: Helper

    @Before
    fun setUp(){
        helper= Helper()
    }

    @Test
    fun isPalindrome() {

        //Arrange
         helper = Helper()
        //Act
        val result = helper.isPalindrome("hello")

        //Assert
        assertEquals(false,result)
    }

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {

        //Arrange
         helper = Helper()
        //Act
        val result = helper.isPalindrome("level")

        //Assert
        assertEquals(true,result)
    }
}