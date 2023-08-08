package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.z1 */
public final class C40863z1 implements Parcelable.Creator {
    /* renamed from: a */
    public static void m166220a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, getServiceRequest.f103753a);
        C40820a.m166089F(parcel, 2, getServiceRequest.f103754b);
        C40820a.m166089F(parcel, 3, getServiceRequest.f103755c);
        C40820a.m166108Y(parcel, 4, getServiceRequest.f103756d, false);
        C40820a.m166085B(parcel, 5, getServiceRequest.f103757e, false);
        C40820a.m166115c0(parcel, 6, getServiceRequest.f103758f, i, false);
        C40820a.m166129k(parcel, 7, getServiceRequest.f103759g, false);
        C40820a.m166102S(parcel, 8, getServiceRequest.f103760v, i, false);
        C40820a.m166115c0(parcel, 10, getServiceRequest.f103761w, i, false);
        C40820a.m166115c0(parcel, 11, getServiceRequest.f103762x, i, false);
        C40820a.m166122g(parcel, 12, getServiceRequest.f103763y);
        C40820a.m166089F(parcel, 13, getServiceRequest.f103764z);
        C40820a.m166122g(parcel, 14, getServiceRequest.f103751X);
        C40820a.m166108Y(parcel, 15, getServiceRequest.mo134283Q(), false);
        C40820a.m166112b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        Scope[] scopeArr = GetServiceRequest.f103750Z;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f103749E0;
        Feature[] featureArr2 = featureArr;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    i = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 2:
                    i2 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 3:
                    i3 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 4:
                    str = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m166041Y(parcel2, X);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m166027K(parcel2, X, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m166055g(parcel2, X);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.m166019C(parcel2, X, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.m166027K(parcel2, X, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.m166027K(parcel2, X, Feature.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 13:
                    i4 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 14:
                    z2 = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 15:
                    str2 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
