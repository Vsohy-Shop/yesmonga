package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.Nullable;

@C40473a
@SafeParcelable.C40812a(creator = "WakeLockEventCreator")
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    @C0359n0
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C40958f();

    /* renamed from: E0 */
    public long f104180E0 = -1;
    @SafeParcelable.C40814c(getter = "getBeginPowerPercentage", mo134489id = 15)

    /* renamed from: X */
    public final float f104181X;
    @SafeParcelable.C40814c(getter = "getTimeout", mo134489id = 16)

    /* renamed from: Y */
    public final long f104182Y;
    @SafeParcelable.C40814c(getter = "getAcquiredWithTimeout", mo134489id = 18)

    /* renamed from: Z */
    public final boolean f104183Z;
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f104184a;
    @SafeParcelable.C40814c(getter = "getTimeMillis", mo134489id = 2)

    /* renamed from: b */
    public final long f104185b;
    @SafeParcelable.C40814c(getter = "getEventType", mo134489id = 11)

    /* renamed from: c */
    public int f104186c;
    @SafeParcelable.C40814c(getter = "getWakeLockName", mo134489id = 4)

    /* renamed from: d */
    public final String f104187d;
    @SafeParcelable.C40814c(getter = "getSecondaryWakeLockName", mo134489id = 10)

    /* renamed from: e */
    public final String f104188e;
    @SafeParcelable.C40814c(getter = "getCodePackage", mo134489id = 17)

    /* renamed from: f */
    public final String f104189f;
    @SafeParcelable.C40814c(getter = "getWakeLockType", mo134489id = 5)

    /* renamed from: g */
    public final int f104190g;
    @Nullable
    @SafeParcelable.C40814c(getter = "getCallingPackages", mo134489id = 6)

    /* renamed from: v */
    public final List f104191v;
    @SafeParcelable.C40814c(getter = "getEventKey", mo134489id = 12)

    /* renamed from: w */
    public final String f104192w;
    @SafeParcelable.C40814c(getter = "getElapsedRealtime", mo134489id = 8)

    /* renamed from: x */
    public final long f104193x;
    @SafeParcelable.C40814c(getter = "getDeviceState", mo134489id = 14)

    /* renamed from: y */
    public int f104194y;
    @SafeParcelable.C40814c(getter = "getHostPackage", mo134489id = 13)

    /* renamed from: z */
    public final String f104195z;

    @SafeParcelable.C40813b
    public WakeLockEvent(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) long j, @SafeParcelable.C40816e(mo134492id = 11) int i2, @SafeParcelable.C40816e(mo134492id = 4) String str, @SafeParcelable.C40816e(mo134492id = 5) int i3, @SafeParcelable.C40816e(mo134492id = 6) @Nullable List list, @SafeParcelable.C40816e(mo134492id = 12) String str2, @SafeParcelable.C40816e(mo134492id = 8) long j2, @SafeParcelable.C40816e(mo134492id = 14) int i4, @SafeParcelable.C40816e(mo134492id = 10) String str3, @SafeParcelable.C40816e(mo134492id = 13) String str4, @SafeParcelable.C40816e(mo134492id = 15) float f, @SafeParcelable.C40816e(mo134492id = 16) long j3, @SafeParcelable.C40816e(mo134492id = 17) String str5, @SafeParcelable.C40816e(mo134492id = 18) boolean z) {
        this.f104184a = i;
        this.f104185b = j;
        this.f104186c = i2;
        this.f104187d = str;
        this.f104188e = str3;
        this.f104189f = str5;
        this.f104190g = i3;
        this.f104191v = list;
        this.f104192w = str2;
        this.f104193x = j2;
        this.f104194y = i4;
        this.f104195z = str4;
        this.f104181X = f;
        this.f104182Y = j3;
        this.f104183Z = z;
    }

    /* renamed from: M */
    public final int mo134745M() {
        return this.f104186c;
    }

    /* renamed from: Q */
    public final long mo134746Q() {
        return this.f104180E0;
    }

    /* renamed from: W */
    public final long mo134747W() {
        return this.f104185b;
    }

    @C0359n0
    /* renamed from: X */
    public final String mo134748X() {
        String str;
        List list = this.f104191v;
        String str2 = this.f104187d;
        int i = this.f104190g;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(",", list);
        }
        int i2 = this.f104194y;
        String str4 = this.f104188e;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.f104195z;
        if (str5 == null) {
            str5 = str3;
        }
        float f = this.f104181X;
        String str6 = this.f104189f;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.f104183Z;
        return "\t" + str2 + "\t" + i + "\t" + str + "\t" + i2 + "\t" + str4 + "\t" + str5 + "\t" + f + "\t" + str3 + "\t" + z;
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f104184a);
        C40820a.m166094K(parcel, 2, this.f104185b);
        C40820a.m166108Y(parcel, 4, this.f104187d, false);
        C40820a.m166089F(parcel, 5, this.f104190g);
        C40820a.m166111a0(parcel, 6, this.f104191v, false);
        C40820a.m166094K(parcel, 8, this.f104193x);
        C40820a.m166108Y(parcel, 10, this.f104188e, false);
        C40820a.m166089F(parcel, 11, this.f104186c);
        C40820a.m166108Y(parcel, 12, this.f104192w, false);
        C40820a.m166108Y(parcel, 13, this.f104195z, false);
        C40820a.m166089F(parcel, 14, this.f104194y);
        C40820a.m166141w(parcel, 15, this.f104181X);
        C40820a.m166094K(parcel, 16, this.f104182Y);
        C40820a.m166108Y(parcel, 17, this.f104189f, false);
        C40820a.m166122g(parcel, 18, this.f104183Z);
        C40820a.m166112b(parcel, a);
    }
}
