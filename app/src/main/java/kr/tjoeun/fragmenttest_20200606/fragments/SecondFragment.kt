package kr.tjoeun.fragmenttest_20200606.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_second.*
import kr.tjoeun.fragmenttest_20200606.R
import kr.tjoeun.fragmenttest_20200606.adapters.StudentAdapter
import kr.tjoeun.fragmenttest_20200606.datas.Student

class SecondFragment : Fragment() {

    val students = ArrayList<Student>()
    // onCreate 실행된 이후에 내용을 채워야함.
//    변수는 멤버변수로 만드어두면 차후에 편리함.
//    만드는건 지금 만들지만, 채우는건 나중에 하겠다 => Lateinit
    lateinit var studentAdapter:StudentAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        students.add(Student("조경진", 1988, true))
        students.add(Student("김광철", 1966, true))
        students.add(Student("김재환", 1993, true))
        students.add(Student("박수정", 1994, false))
        students.add(Student("신용성", 1988, true))
        students.add(Student("엄곤지", 1984, false))
        students.add(Student("이승원", 1978, true))
        students.add(Student("이현호", 1981, true))

        //studentAdapter = StudentAdapter(activity , R.layout.student_list_item, students)

        studentListView.adapter =studentAdapter

        return inflater.inflate(R.layout.fragment_second , container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }
}