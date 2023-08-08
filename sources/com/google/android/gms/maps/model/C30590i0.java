package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.i0 */
public final class C30590i0 implements Parcelable.Creator<TileOverlayOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        IBinder iBinder = null;
        boolean z = false;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = true;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 2) {
                iBinder = SafeParcelReader.m166041Y(parcel, X);
            } else if (O == 3) {
                z = SafeParcelReader.m166032P(parcel, X);
            } else if (O == 4) {
                f = SafeParcelReader.m166038V(parcel, X);
            } else if (O == 5) {
                z2 = SafeParcelReader.m166032P(parcel, X);
            } else if (O != 6) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                f2 = SafeParcelReader.m166038V(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new TileOverlayOptions(iBinder, z, f, z2, f2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
