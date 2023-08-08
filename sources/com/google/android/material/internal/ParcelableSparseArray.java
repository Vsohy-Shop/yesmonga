package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ParcelableSparseArray extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseArray> CREATOR = new C31381a();

    /* renamed from: com.google.android.material.internal.ParcelableSparseArray$a */
    public class C31381a implements Parcelable.ClassLoaderCreator<ParcelableSparseArray> {
        @C0363p0
        /* renamed from: a */
        public ParcelableSparseArray createFromParcel(@C0359n0 Parcel parcel) {
            return new ParcelableSparseArray(parcel, (ClassLoader) null);
        }

        @C0359n0
        /* renamed from: b */
        public ParcelableSparseArray createFromParcel(@C0359n0 Parcel parcel, ClassLoader classLoader) {
            return new ParcelableSparseArray(parcel, classLoader);
        }

        @C0359n0
        /* renamed from: c */
        public ParcelableSparseArray[] newArray(int i) {
            return new ParcelableSparseArray[i];
        }
    }

    public ParcelableSparseArray() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    public ParcelableSparseArray(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }
}
