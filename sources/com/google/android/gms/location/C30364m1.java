package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.m1 */
public final class C30364m1 implements Parcelable.Creator<SleepClassifyEvent> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        int i8 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    i = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 2:
                    i2 = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 3:
                    i3 = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 4:
                    i4 = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 5:
                    i5 = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 6:
                    i6 = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 7:
                    i7 = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 8:
                    z = SafeParcelReader.m166032P(parcel, X);
                    break;
                case 9:
                    i8 = SafeParcelReader.m166042Z(parcel, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new SleepClassifyEvent(i, i2, i3, i4, i5, i6, i7, z, i8);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SleepClassifyEvent[i];
    }
}
