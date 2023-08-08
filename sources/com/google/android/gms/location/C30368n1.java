package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.n1 */
public final class C30368n1 implements Parcelable.Creator<SleepSegmentEvent> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                j = SafeParcelReader.m166048c0(parcel, X);
            } else if (O == 2) {
                j2 = SafeParcelReader.m166048c0(parcel, X);
            } else if (O == 3) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 4) {
                i2 = SafeParcelReader.m166042Z(parcel, X);
            } else if (O != 5) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                i3 = SafeParcelReader.m166042Z(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new SleepSegmentEvent(j, j2, i, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SleepSegmentEvent[i];
    }
}
