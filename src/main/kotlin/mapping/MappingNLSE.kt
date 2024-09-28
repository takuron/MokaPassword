package com.takuron.moka.kotlin.mapping

class MappingNLSE : ByteMappingI {
    override fun map(byte: Byte): Char {
        val index = (byte.toInt() + 128) % 64

        return if (index == 8) '!'
        else if (index == 37) '?'
        else if (index == 52) '*'
        else if (index == 14) '('
        else if (index == 40) ')'
        else if (index < 26) 'A' + index
        else if (index < 52) 'a' + (index - 26)
        else if (index < 62) '0' + (index - 52)
        else if (index == 62) '#'
        else ';'
    }
}