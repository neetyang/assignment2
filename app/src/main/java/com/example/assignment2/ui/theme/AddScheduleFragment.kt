package com.example.assignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast

class AddScheduleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_schedule, container, false)

        val dateSpinner: Spinner = view.findViewById(R.id.date_spinner)
        val scheduleEditText: EditText = view.findViewById(R.id.schedule_edit_text)
        val saveButton: Button = view.findViewById(R.id.save_button)

        saveButton.setOnClickListener {
            val date = dateSpinner.selectedItem.toString()
            val schedule = scheduleEditText.text.toString()
            saveSchedule(date, schedule)
        }

        return view
    }

    private fun saveSchedule(date: String, schedule: String) {
        Toast.makeText(context, "Schedule saved: $date - $schedule", Toast.LENGTH_SHORT).show()
    }
}