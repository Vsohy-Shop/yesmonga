package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.c */
public final class C40419c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
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
                    str2 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 4:
                    str3 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 5:
                    str4 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m166019C(parcel2, X, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 8:
                    j = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 9:
                    str6 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 10:
                    arrayList = SafeParcelReader.m166028L(parcel2, X, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 12:
                    str8 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
