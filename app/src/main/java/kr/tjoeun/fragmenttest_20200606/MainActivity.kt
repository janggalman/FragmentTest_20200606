package kr.tjoeun.fragmenttest_20200606

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.tjoeun.fragmenttest_20200606.adapters.MyViewPagerAdapter

class MainActivity : BaseActivity() {
    lateinit var mainAdapter: MyViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        mainAdapter = MyViewPagerAdapter(supportFragmentManager)
        myViewPager.adapter = mainAdapter

        myTabLayout.setupWithViewPager(myViewPager)

    }

}
