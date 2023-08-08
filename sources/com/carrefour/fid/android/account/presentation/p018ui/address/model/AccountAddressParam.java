package com.carrefour.fid.android.account.presentation.p018ui.address.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J?\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b#\u0010!¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/ui/address/model/AccountAddressParam;", "Landroid/os/Parcelable;", "", "a", "b", "", "c", "d", "e", "telephone", "postalCode", "hasBillingAddress", "isDeliveryAddress", "isDriveSelected", "f", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "i", "Z", "h", "()Z", "k", "l", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZ)V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.model.AccountAddressParam */
public final class AccountAddressParam implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<AccountAddressParam> CREATOR = new C13474a();

    /* renamed from: f */
    public static final int f32936f = 0;
    @C12580l

    /* renamed from: a */
    public final String f32937a;
    @C12580l

    /* renamed from: b */
    public final String f32938b;

    /* renamed from: c */
    public final boolean f32939c;

    /* renamed from: d */
    public final boolean f32940d;

    /* renamed from: e */
    public final boolean f32941e;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.model.AccountAddressParam$a */
    public static final class C13474a implements Parcelable.Creator<AccountAddressParam> {
        @C12579k
        /* renamed from: a */
        public final AccountAddressParam createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountAddressParam(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final AccountAddressParam[] newArray(int i) {
            return new AccountAddressParam[i];
        }
    }

    public AccountAddressParam() {
        this((String) null, (String) null, false, false, false, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static /* synthetic */ AccountAddressParam m57951g(AccountAddressParam accountAddressParam, String str, String str2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountAddressParam.f32937a;
        }
        if ((i & 2) != 0) {
            str2 = accountAddressParam.f32938b;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = accountAddressParam.f32939c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = accountAddressParam.f32940d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = accountAddressParam.f32941e;
        }
        return accountAddressParam.mo31985f(str, str3, z4, z5, z3);
    }

    @C12580l
    /* renamed from: a */
    public final String mo31978a() {
        return this.f32937a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo31979b() {
        return this.f32938b;
    }

    /* renamed from: c */
    public final boolean mo31980c() {
        return this.f32939c;
    }

    /* renamed from: d */
    public final boolean mo31981d() {
        return this.f32940d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo31983e() {
        return this.f32941e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAddressParam)) {
            return false;
        }
        AccountAddressParam accountAddressParam = (AccountAddressParam) obj;
        return Intrinsics.areEqual((Object) this.f32937a, (Object) accountAddressParam.f32937a) && Intrinsics.areEqual((Object) this.f32938b, (Object) accountAddressParam.f32938b) && this.f32939c == accountAddressParam.f32939c && this.f32940d == accountAddressParam.f32940d && this.f32941e == accountAddressParam.f32941e;
    }

    @C12579k
    /* renamed from: f */
    public final AccountAddressParam mo31985f(@C12580l String str, @C12580l String str2, boolean z, boolean z2, boolean z3) {
        return new AccountAddressParam(str, str2, z, z2, z3);
    }

    /* renamed from: h */
    public final boolean mo31986h() {
        return this.f32939c;
    }

    public int hashCode() {
        String str = this.f32937a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f32938b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f32939c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f32940d;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f32941e;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    @C12580l
    /* renamed from: i */
    public final String mo31988i() {
        return this.f32938b;
    }

    @C12580l
    /* renamed from: j */
    public final String mo31989j() {
        return this.f32937a;
    }

    /* renamed from: k */
    public final boolean mo31990k() {
        return this.f32940d;
    }

    /* renamed from: l */
    public final boolean mo31991l() {
        return this.f32941e;
    }

    @C12579k
    public String toString() {
        String str = this.f32937a;
        String str2 = this.f32938b;
        boolean z = this.f32939c;
        boolean z2 = this.f32940d;
        boolean z3 = this.f32941e;
        return "AccountAddressParam(telephone=" + str + ", postalCode=" + str2 + ", hasBillingAddress=" + z + ", isDeliveryAddress=" + z2 + ", isDriveSelected=" + z3 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f32937a);
        parcel.writeString(this.f32938b);
        parcel.writeInt(this.f32939c ? 1 : 0);
        parcel.writeInt(this.f32940d ? 1 : 0);
        parcel.writeInt(this.f32941e ? 1 : 0);
    }

    public AccountAddressParam(@C12580l String str, @C12580l String str2, boolean z, boolean z2, boolean z3) {
        this.f32937a = str;
        this.f32938b = str2;
        this.f32939c = z;
        this.f32940d = z2;
        this.f32941e = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AccountAddressParam(java.lang.String r4, java.lang.String r5, boolean r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L_0x0007
            r10 = r0
            goto L_0x0008
        L_0x0007:
            r10 = r4
        L_0x0008:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r5
        L_0x000e:
            r4 = r9 & 4
            r5 = 0
            if (r4 == 0) goto L_0x0015
            r1 = r5
            goto L_0x0016
        L_0x0015:
            r1 = r6
        L_0x0016:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001c
            r2 = r5
            goto L_0x001d
        L_0x001c:
            r2 = r7
        L_0x001d:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0023
            r9 = r5
            goto L_0x0024
        L_0x0023:
            r9 = r8
        L_0x0024:
            r4 = r3
            r5 = r10
            r6 = r0
            r7 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.p018ui.address.model.AccountAddressParam.<init>(java.lang.String, java.lang.String, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
