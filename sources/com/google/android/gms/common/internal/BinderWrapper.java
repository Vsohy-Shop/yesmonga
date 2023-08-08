package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
@C40473a
public final class BinderWrapper implements Parcelable {
    @C0359n0
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C40848v1();

    /* renamed from: a */
    public IBinder f103738a;

    @C40473a
    public BinderWrapper(@C0359n0 IBinder iBinder) {
        this.f103738a = iBinder;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f103738a);
    }

    public /* synthetic */ BinderWrapper(Parcel parcel, C40851w1 w1Var) {
        this.f103738a = parcel.readStrongBinder();
    }
}
