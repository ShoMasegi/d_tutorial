package com.sho.masegi.network.adapter

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import org.threeten.bp.ZonedDateTime
import org.threeten.bp.format.DateTimeFormatter
import org.threeten.bp.format.DateTimeFormatterBuilder

class ZonedDateTimeJsonAdapter : JsonAdapter<ZonedDateTime>() {
    override fun fromJson(reader: JsonReader): ZonedDateTime? =
        if (reader.peek() != JsonReader.Token.NULL)
            ZonedDateTime.parse(reader.nextString(), formatter)
        else
            reader.nextNull()

    override fun toJson(writer: JsonWriter, value: ZonedDateTime?) {
        if (value == null) writer.nullValue() else writer.value(value.format(formatter))
    }

    companion object {
        private val formatter = DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
            .toFormatter()
    }
}