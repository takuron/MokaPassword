package com.takuron.moka.kotlin.mapping

class MappingNL : ByteMappingI {
    override fun map(byte: Byte): Char {
        val index = (byte.toInt() + 128) % 64
        val p = (byte.toInt()+128) / 64

        if (index < 26) return 'A' + index
        else if (index < 52) return 'a' + (index - 26)
        else if (index < 62) return '0' + (index - 52)
        else if (index == 62) when (p) {
            0 -> return 'e'
            1 -> return 'a'
            2 -> return 'i'
            3 -> return 'r'
        }
        else when (p) {
            0 -> return 'E'
            1 -> return 'A'
            2 -> return 'I'
            3 -> return 'R'
        }
        return 'O'
    }
}