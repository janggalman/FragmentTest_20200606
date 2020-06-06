package kr.tjoeun.fragmenttest_20200606.datas

import java.io.Serializable

class Student (inputName : String, iby : Int , gender : String) : Serializable {

    val name = inputName
    val birthYear = iby
    val isMale = gender

    fun getKoreanAge(year : Int) : Int {

        return year - this.birthYear + 1
    }
}