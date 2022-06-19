package com.example.ordermenu

import android.os.Parcel
import android.os.Parcelable

data class popularFood(val foodImage:Int,val foodName:String) : Parcelable {
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

    companion object CREATOR : Parcelable.Creator<popularFood> {
        override fun createFromParcel(parcel: Parcel): popularFood {
            return popularFood(parcel)
        }

        override fun newArray(size: Int): Array<popularFood?> {
            return arrayOfNulls(size)
        }
    }
}

