package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.firebase.messaging.t0 */
public class C33243t0 implements Parcelable.Creator<RemoteMessage> {

    /* renamed from: a */
    public static final int f80832a = 0;

    /* renamed from: c */
    public static void m134078c(RemoteMessage remoteMessage, Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166129k(parcel, 2, remoteMessage.f80438a, false);
        C40820a.m166112b(parcel, a);
    }

    @C0363p0
    /* renamed from: a */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            if (SafeParcelReader.m166031O(X) != 2) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                bundle = SafeParcelReader.m166055g(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new RemoteMessage(bundle);
    }

    @C0363p0
    /* renamed from: b */
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
