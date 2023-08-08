package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C40473a
@SafeParcelable.C40812a(creator = "MethodInvocationCreator")
public class MethodInvocation extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C40844u0();
    @SafeParcelable.C40814c(getter = "getMethodKey", mo134489id = 1)

    /* renamed from: a */
    public final int f103765a;
    @SafeParcelable.C40814c(getter = "getResultStatusCode", mo134489id = 2)

    /* renamed from: b */
    public final int f103766b;
    @SafeParcelable.C40814c(getter = "getConnectionResultStatusCode", mo134489id = 3)

    /* renamed from: c */
    public final int f103767c;
    @SafeParcelable.C40814c(getter = "getStartTimeMillis", mo134489id = 4)

    /* renamed from: d */
    public final long f103768d;
    @SafeParcelable.C40814c(getter = "getEndTimeMillis", mo134489id = 5)

    /* renamed from: e */
    public final long f103769e;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getCallingModuleId", mo134489id = 6)

    /* renamed from: f */
    public final String f103770f;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getCallingEntryPoint", mo134489id = 7)

    /* renamed from: g */
    public final String f103771g;
    @SafeParcelable.C40814c(defaultValue = "0", getter = "getServiceId", mo134489id = 8)

    /* renamed from: v */
    public final int f103772v;
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getLatencyMillis", mo134489id = 9)

    /* renamed from: w */
    public final int f103773w;

    @C40473a
    @Deprecated
    public MethodInvocation(int i, int i2, int i3, long j, long j2, @C0363p0 String str, @C0363p0 String str2, int i4) {
        this(i, i2, i3, j, j2, str, str2, i4, -1);
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f103765a);
        C40820a.m166089F(parcel, 2, this.f103766b);
        C40820a.m166089F(parcel, 3, this.f103767c);
        C40820a.m166094K(parcel, 4, this.f103768d);
        C40820a.m166094K(parcel, 5, this.f103769e);
        C40820a.m166108Y(parcel, 6, this.f103770f, false);
        C40820a.m166108Y(parcel, 7, this.f103771g, false);
        C40820a.m166089F(parcel, 8, this.f103772v);
        C40820a.m166089F(parcel, 9, this.f103773w);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public MethodInvocation(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) int i3, @SafeParcelable.C40816e(mo134492id = 4) long j, @SafeParcelable.C40816e(mo134492id = 5) long j2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 6) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 7) String str2, @SafeParcelable.C40816e(mo134492id = 8) int i4, @SafeParcelable.C40816e(mo134492id = 9) int i5) {
        this.f103765a = i;
        this.f103766b = i2;
        this.f103767c = i3;
        this.f103768d = j;
        this.f103769e = j2;
        this.f103770f = str;
        this.f103771g = str2;
        this.f103772v = i4;
        this.f103773w = i5;
    }
}
