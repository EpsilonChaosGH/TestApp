package com.example.testapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        counter.decimal1 = checkDecimal(counter.decimal1)

        if (counter.decimal1 == 0) {
            counter.decimal2 = checkDecimal(counter.decimal2)

            if (counter.decimal2 == 0) {
                counter.decimal3 = checkDecimal(counter.decimal3)

                if (counter.decimal3 == 0) {
                    counter.decimal4 = checkDecimal(counter.decimal4)

                    if (counter.decimal4 == 0) {
                        counter.decimal5 = checkDecimal(counter.decimal5)

                        if (counter.decimal5 == 0) {
                            counter.decimal6 = checkDecimal(counter.decimal6)

                            if (counter.decimal6 == 0) {
                                counter.decimal7 = checkDecimal(counter.decimal7)

                                if (counter.decimal7 == 0) {
                                    counter.decimal8 = checkDecimal(counter.decimal8)
                                }
                            }
                        }
                    }
                }
            }
        }

        counter.binary1 = checkBinary(counter.binary1)
        if (counter.binary1 == 0) {
            counter.binary2 = checkBinary(counter.binary2)

            if (counter.binary2 == 0) {
                counter.binary3 = checkBinary(counter.binary3)

                if (counter.binary3 == 0) {
                    counter.binary4 = checkBinary(counter.binary4)

                    if (counter.binary4 == 0) {
                        counter.binary5 = checkBinary(counter.binary5)

                        if (counter.binary5 == 0) {
                            counter.binary6 = checkBinary(counter.binary6)

                            if (counter.binary6 == 0) {
                                counter.binary7 = checkBinary(counter.binary7)

                                if (counter.binary7 == 0) {
                                    counter.binary8 = checkBinary(counter.binary8)
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private fun checkDecimal(i: Int): Int {
        return if (i == 9) 0
        else {
            i + 1
        }
    }

    private fun checkBinary(i: Int): Int {
        return if (i == 1) 0
        else {
            i + 1
        }
    }

    private fun renderState() {
        with(binding) {
            counterTextView.text = counter.counter.toString()

            textView1.text = counter.binary1.toString()
            textView2.text = counter.binary2.toString()
            textView3.text = counter.binary3.toString()
            textView4.text = counter.binary4.toString()
            textView5.text = counter.binary5.toString()
            textView6.text = counter.binary6.toString()
            textView7.text = counter.binary7.toString()
            textView8.text = counter.binary8.toString()

            textViewDNS1.text = counter.decimal1.toString()
            textViewDNS2.text = counter.decimal2.toString()
            textViewDNS3.text = counter.decimal3.toString()
            textViewDNS4.text = counter.decimal4.toString()
            textViewDNS5.text = counter.decimal5.toString()
            textViewDNS6.text = counter.decimal6.toString()
            textViewDNS7.text = counter.decimal7.toString()
            textViewDNS8.text = counter.decimal8.toString()
        }
    }

    data class Counter(
        var counter: Int = 0,

        var decimal1: Int = 0,
        var decimal2: Int = 0,
        var decimal3: Int = 0,
        var decimal4: Int = 0,
        var decimal5: Int = 0,
        var decimal6: Int = 0,
        var decimal7: Int = 0,
        var decimal8: Int = 0,

        var binary1: Int = 0,
        var binary2: Int = 0,
        var binary3: Int = 0,
        var binary4: Int = 0,
        var binary5: Int = 0,
        var binary6: Int = 0,
        var binary7: Int = 0,
        var binary8: Int = 0,
    )
}