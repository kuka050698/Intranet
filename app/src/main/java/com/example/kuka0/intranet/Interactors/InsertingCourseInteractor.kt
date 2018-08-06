package com.example.kuka0.intranet.Interactors

import com.example.kuka0.intranet.Common_APP.Common_funs
import com.example.kuka0.intranet.Database.Course
import com.google.firebase.database.FirebaseDatabase

class InsertingCourseInteractor:InsertingInteractorView {
    private var mDatabase = FirebaseDatabase.getInstance().reference
    override fun add(course: Course, listener: InsertingInteractorView.onFinishedListener) {
        var currentTeacherId = Common_funs.mAuth.currentUser?.uid
        mDatabase.child("Courses").child(currentTeacherId!!).setValue(course)
        listener.showMessage("Course Added")
        listener.onSuccess()
    }
}