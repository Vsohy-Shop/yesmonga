package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzs;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.x0 */
public final class C41808x0 implements Parcelable.Creator<zzj> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        zzs zzs = zzj.f105972e;
        List<ClientIdentity> list = zzj.f105971d;
        String str = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                zzs = (zzs) SafeParcelReader.m166019C(parcel, X, zzs.CREATOR);
            } else if (O == 2) {
                list = SafeParcelReader.m166028L(parcel, X, ClientIdentity.CREATOR);
            } else if (O != 3) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                str = SafeParcelReader.m166023G(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzj(zzs, list, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
