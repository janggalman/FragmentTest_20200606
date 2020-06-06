package kr.tjoeun.fragmenttest_20200606.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.tjoeun.fragmenttest_20200606.fragments.FirstFragment
import kr.tjoeun.fragmenttest_20200606.fragments.SecondFragment

class MyViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        if(position == 0)
        {
            return FirstFragment()
        } else {
            return SecondFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}