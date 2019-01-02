package com.github.xch168.kotlindemo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by XuCanHui on 2019/1/2.
 */
@Parcelize
data class User(val name: String): Parcelable