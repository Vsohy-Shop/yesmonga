package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1886l;
import androidx.customview.view.AbsSavedState;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new C31603a();
    @C0359n0

    /* renamed from: c */
    public final C1886l<String, Bundle> f76701c;

    /* renamed from: com.google.android.material.stateful.ExtendableSavedState$a */
    public class C31603a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        @C0363p0
        /* renamed from: a */
        public ExtendableSavedState createFromParcel(@C0359n0 Parcel parcel) {
            return new ExtendableSavedState(parcel, (ClassLoader) null, (C31603a) null);
        }

        @C0359n0
        /* renamed from: b */
        public ExtendableSavedState createFromParcel(@C0359n0 Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, (C31603a) null);
        }

        @C0359n0
        /* renamed from: c */
        public ExtendableSavedState[] newArray(int i) {
            return new ExtendableSavedState[i];
        }
    }

    public /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, C31603a aVar) {
        this(parcel, classLoader);
    }

    @C0359n0
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f76701c + "}";
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f76701c.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f76701c.mo6334j(i2);
            bundleArr[i2] = this.f76701c.mo6338o(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f76701c = new C1886l<>();
    }

    public ExtendableSavedState(@C0359n0 Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f76701c = new C1886l<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f76701c.put(strArr[i], bundleArr[i]);
        }
    }
}
