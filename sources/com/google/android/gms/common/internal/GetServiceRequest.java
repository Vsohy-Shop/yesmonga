package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C40785m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C40473a
@SafeParcelable.C40812a(creator = "GetServiceRequestCreator")
@SafeParcelable.C40818g({9})
public class GetServiceRequest extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C40863z1();

    /* renamed from: E0 */
    public static final Feature[] f103749E0 = new Feature[0];

    /* renamed from: Z */
    public static final Scope[] f103750Z = new Scope[0];
    @SafeParcelable.C40814c(getter = "isRequestingTelemetryConfiguration", mo134489id = 14)

    /* renamed from: X */
    public boolean f103751X;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getAttributionTag", mo134489id = 15)

    /* renamed from: Y */
    public String f103752Y;
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f103753a;
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: b */
    public final int f103754b;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: c */
    public int f103755c;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: d */
    public String f103756d;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: e */
    public IBinder f103757e;
    @SafeParcelable.C40814c(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", mo134489id = 6)

    /* renamed from: f */
    public Scope[] f103758f;
    @SafeParcelable.C40814c(defaultValueUnchecked = "new android.os.Bundle()", mo134489id = 7)

    /* renamed from: g */
    public Bundle f103759g;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 8)

    /* renamed from: v */
    public Account f103760v;
    @SafeParcelable.C40814c(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", mo134489id = 10)

    /* renamed from: w */
    public Feature[] f103761w;
    @SafeParcelable.C40814c(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", mo134489id = 11)

    /* renamed from: x */
    public Feature[] f103762x;
    @SafeParcelable.C40814c(mo134489id = 12)

    /* renamed from: y */
    public boolean f103763y;
    @SafeParcelable.C40814c(defaultValue = "0", mo134489id = 13)

    /* renamed from: z */
    public int f103764z;

    @SafeParcelable.C40813b
    public GetServiceRequest(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) int i3, @SafeParcelable.C40816e(mo134492id = 4) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) IBinder iBinder, @SafeParcelable.C40816e(mo134492id = 6) Scope[] scopeArr, @SafeParcelable.C40816e(mo134492id = 7) Bundle bundle, @C0363p0 @SafeParcelable.C40816e(mo134492id = 8) Account account, @SafeParcelable.C40816e(mo134492id = 10) Feature[] featureArr, @SafeParcelable.C40816e(mo134492id = 11) Feature[] featureArr2, @SafeParcelable.C40816e(mo134492id = 12) boolean z, @SafeParcelable.C40816e(mo134492id = 13) int i4, @SafeParcelable.C40816e(mo134492id = 14) boolean z2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 15) String str2) {
        scopeArr = scopeArr == null ? f103750Z : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f103749E0 : featureArr;
        featureArr2 = featureArr2 == null ? f103749E0 : featureArr2;
        this.f103753a = i;
        this.f103754b = i2;
        this.f103755c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f103756d = "com.google.android.gms";
        } else {
            this.f103756d = str;
        }
        if (i < 2) {
            this.f103760v = iBinder != null ? C40729a.m165753O0(C40785m.C40786a.m165965H0(iBinder)) : null;
        } else {
            this.f103757e = iBinder;
            this.f103760v = account;
        }
        this.f103758f = scopeArr;
        this.f103759g = bundle;
        this.f103761w = featureArr;
        this.f103762x = featureArr2;
        this.f103763y = z;
        this.f103764z = i4;
        this.f103751X = z2;
        this.f103752Y = str2;
    }

    @C40473a
    @C0359n0
    /* renamed from: M */
    public Bundle mo134282M() {
        return this.f103759g;
    }

    @C0363p0
    /* renamed from: Q */
    public final String mo134283Q() {
        return this.f103752Y;
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        C40863z1.m166220a(this, parcel, i);
    }
}
