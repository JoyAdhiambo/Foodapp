package com.example.ordermenu

import android.os.Parcel
import android.os.Parcelable

data class Asia(val foodImage:Int,val foodName:String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(foodImage)
        parcel.writeString(foodName)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Asia> {
        override fun createFromParcel(parcel: Parcel): Asia {
            return Asia(parcel)
        }

        override fun newArray(size: Int): Array<Asia?> {
            return arrayOfNulls(size)
        }
    }
}
