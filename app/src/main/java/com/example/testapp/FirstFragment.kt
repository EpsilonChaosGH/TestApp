package com.example.testapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.testapp.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var counter: Counter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        counter = Counter()
        binding.incrementButton.setOnClickListener {
            increment()
            renderState()
        }
        return binding.root
    }

    private fun increment() {
        counter.counter += 1
        counter.o1 = check(counter.o1)

        if (counter.o1 == 0) {
            counter.o2 = check(counter.o2)

            if (counter.o2 == 0) {
                counter.o3 = check(counter.o3)

                if (counter.o3 == 0) {
                    counter.o4 = check(counter.o4)

                    if (counter.o4 == 0) {
                        counter.o5 = check(counter.o5)

                        if (counter.o5 == 0) {
                            counter.o6 = check(counter.o6)

                            if (counter.o6 == 0) {
                                counter.o7 = check(counter.o7)

                                if (counter.o7 == 0) {
                                    counter.o8 = check(counter.o8)
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private fun check(i: Int): Int {
        return if (i == 1) 0
        else {
            i + 1
        }
    }

    private fun renderState() {
        with(binding) {
            counterTextView.text = counter.counter.toString()
            textView1.text = counter.o1.toString()
            textView2.text = counter.o2.toString()
            textView3.text = counter.o3.toString()
            textView4.text = counter.o4.toString()
            textView5.text = counter.o5.toString()
            textView6.text = counter.o6.toString()
            textView7.text = counter.o7.toString()
            textView8.text = counter.o8.toString()
        }
    }

    data class Counter(
        var counter: Int = 0,
        var o1: Int = 0,
        var o2: Int = 0,
        var o3: Int = 0,
        var o4: Int = 0,
        var o5: Int = 0,
        var o6: Int = 0,
        var o7: Int = 0,
        var o8: Int = 0,
    )
}