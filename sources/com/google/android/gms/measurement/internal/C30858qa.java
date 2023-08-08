package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.qa */
public final class C30858qa implements Parcelable.Creator {
    /* renamed from: a */
    public static void m124152a(zzli zzli, Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, zzli.f74167a);
        C40820a.m166108Y(parcel, 2, zzli.f74168b, false);
        C40820a.m166094K(parcel, 3, zzli.f74169c);
        C40820a.m166097N(parcel, 4, zzli.f74170d, false);
        C40820a.m166144z(parcel, 5, (Float) null, false);
        C40820a.m166108Y(parcel, 6, zzli.f74171e, false);
        C40820a.m166108Y(parcel, 7, zzli.f74172f, false);
        C40820a.m166139u(parcel, 8, zzli.f74173g, false);
        C40820a.m166112b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    i = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 2:
                    str = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 3:
                    j = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 4:
                    l = SafeParcelReader.m166050d0(parcel2, X);
                    break;
                case 5:
                    f = SafeParcelReader.m166039W(parcel2, X);
                    break;
                case 6:
                    str2 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 7:
                    str3 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 8:
                    d = SafeParcelReader.m166037U(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new zzli(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzli[i];
    }
}
