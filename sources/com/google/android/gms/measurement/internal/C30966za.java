package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.za */
public final class C30966za implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = "";
        String str11 = str10;
        boolean z4 = true;
        boolean z5 = true;
        long j7 = -2147483648L;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 2:
                    str = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 3:
                    str2 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 4:
                    str3 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 5:
                    str4 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 6:
                    j = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 7:
                    j2 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 8:
                    str5 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 9:
                    z4 = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 10:
                    z = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 11:
                    j7 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 12:
                    str6 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 13:
                    j3 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 14:
                    j4 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 15:
                    i = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 16:
                    z5 = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 18:
                    z2 = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 19:
                    str7 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 21:
                    bool = SafeParcelReader.m166033Q(parcel2, X);
                    break;
                case 22:
                    j5 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 23:
                    arrayList = SafeParcelReader.m166025I(parcel2, X);
                    break;
                case 24:
                    str8 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 25:
                    str10 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 26:
                    str11 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 27:
                    str9 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 28:
                    z3 = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 29:
                    j6 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new zzq(str, str2, str3, str4, j, j2, str5, z4, z, j7, str6, j3, j4, i, z5, z2, str7, bool, j5, (List) arrayList, str8, str10, str11, str9, z3, j6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
