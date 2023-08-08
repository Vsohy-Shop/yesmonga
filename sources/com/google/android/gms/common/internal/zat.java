package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ResolveAccountRequestCreator")
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new C40731a1();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f103967a;
    @SafeParcelable.C40814c(getter = "getAccount", mo134489id = 2)

    /* renamed from: b */
    public final Account f103968b;
    @SafeParcelable.C40814c(getter = "getSessionId", mo134489id = 3)

    /* renamed from: c */
    public final int f103969c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getSignInAccountHint", mo134489id = 4)

    /* renamed from: d */
    public final GoogleSignInAccount f103970d;

    @SafeParcelable.C40813b
    public zat(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) Account account, @SafeParcelable.C40816e(mo134492id = 3) int i2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) GoogleSignInAccount googleSignInAccount) {
        this.f103967a = i;
        this.f103968b = account;
        this.f103969c = i2;
        this.f103970d = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f103967a);
        C40820a.m166102S(parcel, 2, this.f103968b, i, false);
        C40820a.m166089F(parcel, 3, this.f103969c);
        C40820a.m166102S(parcel, 4, this.f103970d, i, false);
        C40820a.m166112b(parcel, a);
    }

    public zat(Account account, int i, @C0363p0 GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
