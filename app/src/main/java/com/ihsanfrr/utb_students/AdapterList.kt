package com.ihsanfrr.utb_students

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AdapterList(private val studentList: kotlin.collections.List<StudentList>): RecyclerView.Adapter<AdapterList.ViewHolder>() {
    class ViewHolder(studentView: View): RecyclerView.ViewHolder(studentView) {
        val image: ImageView = studentView.findViewById(R.id.studentImage)
        val name: TextView = studentView.findViewById(R.id.studentName)
        val major: TextView = studentView.findViewById(R.id.studentMajor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterList.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.student_data, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterList.ViewHolder, position: Int) {
        val student = studentList[position]
//        Glide.with(holder.image.context).load(student.image).into(holder.image)
        holder.name.text = student.name
        holder.major.text = student.major
    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}