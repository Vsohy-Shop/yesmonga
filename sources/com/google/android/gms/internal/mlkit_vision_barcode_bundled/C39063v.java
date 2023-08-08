package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v */
public final class C39063v implements Parcelable.Creator<zzas> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    str = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 2:
                    str2 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 3:
                    str3 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 4:
                    str4 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 5:
                    str5 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 6:
                    str6 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 7:
                    str7 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 8:
                    str8 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 9:
                    str9 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 10:
                    str10 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 11:
                    str11 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 12:
                    str12 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 13:
                    str13 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 14:
                    str14 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new zzas(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzas[i];
    }
}
