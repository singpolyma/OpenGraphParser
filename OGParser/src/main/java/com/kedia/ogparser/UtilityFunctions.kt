package com.kedia.ogparser

import java.net.URI
import java.net.URL

fun checkNullParserResult(openGraphResult: OpenGraphResult?): Boolean {
    return (openGraphResult?.title.isNullOrEmpty() || openGraphResult?.title == "null") &&
            (openGraphResult?.description.isNullOrEmpty() || openGraphResult?.description == "null")
}
