package com.nestdev.solid_practice.structure_patterns.adapter

data class InetDataProvider(val providersArray: ArrayList<String> = arrayListOf("from inet1", "from inet2", "from inet3")) {

    fun getData(providerId: Int? = null) : String {
       val requestedId = providerId ?: DEFAULT_PROVIDER_ID
        return if (providersArray.isNotEmpty())
            providersArray[requestedId]
        else
            "Empty"
    }

    companion object {
        const val DEFAULT_PROVIDER_ID = 1
    }
}