package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.f */
public final class C40422f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList<Scope> arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2 = null;
        String str3 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    i = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m166028L(parcel, X, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m166019C(parcel, X, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m166032P(parcel, X);
                    break;
                case 5:
                    z2 = SafeParcelReader.m166032P(parcel, X);
                    break;
                case 6:
                    z3 = SafeParcelReader.m166032P(parcel, X);
                    break;
                case 7:
                    str = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 8:
                    str2 = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m166028L(parcel, X, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.m166023G(parcel, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new GoogleSignInOptions(i, (ArrayList) arrayList, account, z, z2, z3, str, str2, (ArrayList) arrayList2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
