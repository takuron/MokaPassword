package com.takuron.moka.kotlin

import com.takuron.moka.kotlin.mapping.ByteMappingI
import com.takuron.moka.kotlin.mapping.MappingNLSE
import com.takuron.moka.kotlin.mapping.MappingNL

const val PLATFORM = "takuron.com"
const val VERSIONNAME = "MokaV1"

enum class MokaPassType(val methodId:Int,val mapping:ByteMappingI){
    NUMBER_LETTER_SYMBOL(1,MappingNL()),
    NUMBER_LETTER(2,MappingNL()),
    NUMBER_LETTER_SYMBOL_EXCLUDE(3, MappingNLSE()),
}