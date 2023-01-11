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
    private var hexadecimalArray =
        arrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F')

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        counter = Counter()
        binding.incrementButton.setOnClickListener {
            counter.counter += 1
            incrementDecimal()
            incrementBinary()
            incrementHexadecimal()
            renderState()
        }
        return binding.root
    }

    private fun incrementDecimal() {
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
    }

    private fun incrementBinary() {
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

    private fun incrementHexadecimal() {
        counter.hexadecimal1 = checkHexadecimal(counter.hexadecimal1)

        if (counter.hexadecimal1 == '0') {
            counter.hexadecimal2 = checkHexadecimal(counter.hexadecimal2)

            if (counter.hexadecimal2 == '0') {
                counter.hexadecimal3 = checkHexadecimal(counter.hexadecimal3)

                if (counter.hexadecimal3 == '0') {
                    counter.hexadecimal4 = checkHexadecimal(counter.hexadecimal4)

                    if (counter.hexadecimal4 == '0') {
                        counter.hexadecimal5 = checkHexadecimal(counter.hexadecimal5)

                        if (counter.hexadecimal5 == '0') {
                            counter.hexadecimal6 = checkHexadecimal(counter.hexadecimal6)

                            if (counter.hexadecimal6 == '0') {
                                counter.hexadecimal7 = checkHexadecimal(counter.hexadecimal7)

                                if (counter.hexadecimal7 == '0') {
                                    counter.hexadecimal8 = checkHexadecimal(counter.hexadecimal8)
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

    private fun checkHexadecimal(i: Char): Char {
        return if (i == 'F') '0'
        else {
            val index = hexadecimalArray.indexOfFirst { it == i }
            hexadecimalArray[index + 1]
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

            textViewHEX1.text = counter.hexadecimal1.toString()
            textViewHEX2.text = counter.hexadecimal2.toString()
            textViewHEX3.text = counter.hexadecimal3.toString()
            textViewHEX4.text = counter.hexadecimal4.toString()
            textViewHEX5.text = counter.hexadecimal5.toString()
            textViewHEX6.text = counter.hexadecimal6.toString()
            textViewHEX7.text = counter.hexadecimal7.toString()
            textViewHEX8.text = counter.hexadecimal8.toString()
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

        var hexadecimal1: Char = '0',
        var hexadecimal2: Char = '0',
        var hexadecimal3: Char = '0',
        var hexadecimal4: Char = '0',
        var hexadecimal5: Char = '0',
        var hexadecimal6: Char = '0',
        var hexadecimal7: Char = '0',
        var hexadecimal8: Char = '0',

        )
}