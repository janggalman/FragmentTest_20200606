package kr.tjoeun.fragmenttest_20200606.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.*
import kr.tjoeun.fragmenttest_20200606.R

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first , container , false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        telBtn.setOnClickListener {
            val inputPhoneNum = telEdt.text.toString()

            //Log.d("입력번호" , inputPhoneNum)

            val myUri = Uri.parse("tel:$inputPhoneNum")
            val myIntent = Intent(Intent.ACTION_DIAL , myUri)
            startActivity(myIntent)
        }
    }

}