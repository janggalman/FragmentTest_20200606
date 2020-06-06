package kr.tjoeun.fragmenttest_20200606.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.tjoeun.fragmenttest_20200606.R.id
import kr.tjoeun.fragmenttest_20200606.R.layout
import kr.tjoeun.fragmenttest_20200606.datas.Student

class StudentAdapter(context: Context, resId: Int, list: Array<Student> ) : ArrayAdapter<Student>(context , resId, list) {
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from (mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        getView는 한줄한줄의 모양 / 데이터를 설정 함수.
//        어떤 모양일지만 먼저 결정 (뼈대 작업)
//        그 모양에 어떤 값을 적어줄지 결정(실제 데이터 출력 작업)
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(layout.student_list_item, null)
        }

        val row = tempRow!!

//        리턴해주기 전에 필요한 데이터를 셋팅하고 리턴하도록.

//         자리에 맞는 데이터 불러오기.
        val data = mList.get(position)

//        XML에서 데이터가 뿌려질 뷰를 가져오자.
        val nameAndAgeTxt = row.findViewById<TextView>(id.nameAndAgeTxt)
        var gender = "남성"

        if (!data.isMale) {
            gender = "여성"
        }


//       상황에 맞는 데이터 셋팅.
        nameAndAgeTxt.text = "${data.name}(${data.getKoreanAge(2020)}세, ${gender})"
        return row
    }
}