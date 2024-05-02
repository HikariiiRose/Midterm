package com.example.hikarii.chars

import com.example.hikarii.R
import com.example.hikarii.models.faces

class data(){
    fun a(): List<faces>{
        return listOf<faces>(
            faces(R.string.persona1, R.drawable.makoto/*persona3*/),
            faces(R.string.persona2, R.drawable.yu/*persona3*/),
            faces(R.string.persona3, R.drawable.ren/*persona3*/),
        )

    }
}

