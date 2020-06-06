package kr.tjoeun.fragmenttest_20200606.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    lateinit var mContext: Context

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        프래그먼트를 들고있는 액티비티의 제작이 완료 된 후에 mContext를 대입해주자.
        mContext = activity as Context
    }
    abstract fun setupEvents()
    abstract fun setValues()

}