package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.a2 */
public final class C30314a2 implements Parcelable.Creator<ActivityTransitionEvent> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 2) {
                i2 = SafeParcelReader.m166042Z(parcel, X);
            } else if (O != 3) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                j = SafeParcelReader.m166048c0(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new ActivityTransitionEvent(i, i2, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionEvent[i];
    }
}
