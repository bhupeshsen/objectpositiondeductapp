package org.tensorflow.codelabs.objectdetection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class MainTaskType : AppCompatActivity() {
    private lateinit var btnPositionSensor : MaterialButton
    private lateinit var btnObjectDeduction : MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_task_type)
        btnPositionSensor =findViewById(R.id.btnPositionSensor)
        btnObjectDeduction =findViewById(R.id.btnObjectDeduction)
        btnPositionSensor.setOnClickListener {v->
            val i= Intent(v.context,SensorActivity::class.java)
            v.context.startActivity(i)
        }
        btnObjectDeduction.setOnClickListener {v->
            val i= Intent(v.context,MainActivity::class.java)
            v.context.startActivity(i)
        }
    }

}