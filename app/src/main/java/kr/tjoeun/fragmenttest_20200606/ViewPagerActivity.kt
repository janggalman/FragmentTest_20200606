package kr.tjoeun.fragmenttest_20200606

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.tjoeun.fragmenttest_20200606.adapters.MyViewPagerAdapter

class ViewPagerActivity : BaseActivity() {

    lateinit var myAdapter: MyViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        myAdapter = MyViewPagerAdapter(supportFragmentManager)
        myViewPager.adapter = myAdapter

    }
}
