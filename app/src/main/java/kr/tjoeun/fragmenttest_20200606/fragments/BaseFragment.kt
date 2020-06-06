package kr.tjoeun.fragmenttest_20200606.fragments

import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    abstract fun setupEvents()
    abstract fun setValues()

}