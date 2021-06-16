package com.example.WorldBestBin

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_amount.*


class AmountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amount)


        // 데이터베이스에서 데이터를 읽거나 쓰려면 DatabaseReference의 인스턴스가 필요하다.
        val database: FirebaseDatabase = FirebaseDatabase.getInstance()
        val canamout: DatabaseReference = database.getReference("can")
        val petamount: DatabaseReference = database.getReference("pet")

        // setValue()로 데이터를 추가
//         canamout.setValue("안녕 반가워!123")

        // read from the database
        canamout.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val data1 = dataSnapshot.value
//                can_text.setText("$data1")
                if(data1.toString() == "0"){
                    can_image.setImageResource(R.drawable.can_default)
                    can_text.setText("비었습니다")}
                else {
                    can_image.setImageResource(R.drawable.can_full)
                    can_text.setText("가득찼습니다")
                }
            }

            // 읽어오기에 실패했을 때
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
            }
        })

        petamount.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val data2 = dataSnapshot.value
//                pet.setText("$data2")
                if(data2.toString() == "0"){
                    pet_image.setImageResource(R.drawable.pet_default)
                    pet_text.setText("비었습니다")}
                else {
                    pet_image.setImageResource(R.drawable.pet_full)
                    pet_text.setText("가득찼습니다")
                }
            }

            // 읽어오기에 실패했을 때
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
            }
        })


    }
}