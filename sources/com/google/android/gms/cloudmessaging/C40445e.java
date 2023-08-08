package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.cloudmessaging.e */
public final class C40445e implements Parcelable.Creator<CloudMessage> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            if (SafeParcelReader.m166031O(X) != 1) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                intent = (Intent) SafeParcelReader.m166019C(parcel, X, Intent.CREATOR);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new CloudMessage(intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CloudMessage[i];
    }
}
