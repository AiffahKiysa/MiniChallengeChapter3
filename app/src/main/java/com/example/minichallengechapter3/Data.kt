package com.example.minichallengechapter3

import android.os.Parcel
import android.os.Parcelable

data class Data(
    val nama_lengkap: String?,
    val nama_panggilan: String?,
    val usia: Int?,
    val alamat: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama_lengkap)
        parcel.writeString(nama_panggilan)
        parcel.writeValue(usia)
        parcel.writeString(alamat)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Data> {
        override fun createFromParcel(parcel: Parcel): Data {
            return Data(parcel)
        }

        override fun newArray(size: Int): Array<Data?> {
            return arrayOfNulls(size)
        }
    }
}