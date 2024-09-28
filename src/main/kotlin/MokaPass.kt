package com.takuron.moka.kotlin

import asia.hombre.keccak.KeccakHash
import asia.hombre.keccak.KeccakParameter

class MokaPass(
    var parameters: MokaPassParameters,
    val platformId:String = PLATFORM,
    val versionName:String = VERSIONNAME
) {
    var distinguishCode = ""
    var passwordSource = ""

    //$versionName:$platformId:$distinguishCode:$passwordSource:$methodId:$passwordLength
    val sourceTemplate = "$versionName:$platformId:%s:%s:%d:%d"

    @OptIn(ExperimentalStdlibApi::class)
    fun generate():String {
        if(distinguishCode=="") throw Exception("Distinguish code is empty")
        if(passwordSource=="") throw Exception("Password source is empty")

        val source = sourceTemplate.format(
            distinguishCode,
            passwordSource,
            parameters.type.methodId,
            parameters.length
        )

        val shaBytes = KeccakHash.generate(KeccakParameter.SHA3_512, source.toByteArray())
        val result = StringBuilder()
        for(i in shaBytes){
            result.append(parameters.type.mapping.map(i))
        }

        return result.substring(0,parameters.length).toString()
    }
}