package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.location.c0 */
public final class C41756c0 implements Parcelable.Creator<zzbc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 1;
        zzba zzba = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    i = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 2:
                    zzba = (zzba) SafeParcelReader.m166019C(parcel, X, zzba.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.m166041Y(parcel, X);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.m166019C(parcel, X, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = SafeParcelReader.m166041Y(parcel, X);
                    break;
                case 6:
                    iBinder3 = SafeParcelReader.m166041Y(parcel, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzbc(i, zzba, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzbc[i];
    }
}
