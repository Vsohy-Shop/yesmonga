package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import com.urbanairship.util.C9650g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.q */
public final class C38119q {

    /* renamed from: f */
    public static final int f96462f = 0;
    @C12579k

    /* renamed from: a */
    public final String f96463a;
    @C12579k

    /* renamed from: b */
    public final String f96464b;
    @C12579k

    /* renamed from: c */
    public final String f96465c;
    @C12579k

    /* renamed from: d */
    public final String f96466d;
    @C12579k

    /* renamed from: e */
    public final String f96467e;

    public C38119q() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static /* synthetic */ C38119q m157778g(C38119q qVar, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qVar.f96463a;
        }
        if ((i & 2) != 0) {
            str2 = qVar.f96464b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = qVar.f96465c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = qVar.f96466d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = qVar.f96467e;
        }
        return qVar.mo118922f(str, str6, str7, str8, str5);
    }

    @C12579k
    /* renamed from: a */
    public final String mo118916a() {
        return this.f96463a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo118917b() {
        return this.f96464b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo118918c() {
        return this.f96465c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo118919d() {
        return this.f96466d;
    }

    @C12579k
    /* renamed from: e */
    public final String mo118920e() {
        return this.f96467e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38119q)) {
            return false;
        }
        C38119q qVar = (C38119q) obj;
        return Intrinsics.areEqual((Object) this.f96463a, (Object) qVar.f96463a) && Intrinsics.areEqual((Object) this.f96464b, (Object) qVar.f96464b) && Intrinsics.areEqual((Object) this.f96465c, (Object) qVar.f96465c) && Intrinsics.areEqual((Object) this.f96466d, (Object) qVar.f96466d) && Intrinsics.areEqual((Object) this.f96467e, (Object) qVar.f96467e);
    }

    @C12579k
    /* renamed from: f */
    public final C38119q mo118922f(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "streetAddressOne");
        Intrinsics.checkNotNullParameter(str2, "streetAddressTwo");
        Intrinsics.checkNotNullParameter(str3, "streetAddressThree");
        Intrinsics.checkNotNullParameter(str4, "cityCode");
        Intrinsics.checkNotNullParameter(str5, C9650g.f26444g);
        return new C38119q(str, str2, str3, str4, str5);
    }

    @C12579k
    /* renamed from: h */
    public final String mo118923h() {
        return this.f96467e;
    }

    public int hashCode() {
        return (((((((this.f96463a.hashCode() * 31) + this.f96464b.hashCode()) * 31) + this.f96465c.hashCode()) * 31) + this.f96466d.hashCode()) * 31) + this.f96467e.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo118925i() {
        return this.f96466d;
    }

    @C12579k
    /* renamed from: j */
    public final String mo118926j() {
        return this.f96463a;
    }

    @C12579k
    /* renamed from: k */
    public final String mo118927k() {
        return this.f96465c;
    }

    @C12579k
    /* renamed from: l */
    public final String mo118928l() {
        return this.f96464b;
    }

    @C12579k
    public String toString() {
        String str = this.f96463a;
        String str2 = this.f96464b;
        String str3 = this.f96465c;
        String str4 = this.f96466d;
        String str5 = this.f96467e;
        return "OrdersOnlineDetailsDeliveryAddressDomain(streetAddressOne=" + str + ", streetAddressTwo=" + str2 + ", streetAddressThree=" + str3 + ", cityCode=" + str4 + ", city=" + str5 + ")";
    }

    public C38119q(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "streetAddressOne");
        Intrinsics.checkNotNullParameter(str2, "streetAddressTwo");
        Intrinsics.checkNotNullParameter(str3, "streetAddressThree");
        Intrinsics.checkNotNullParameter(str4, "cityCode");
        Intrinsics.checkNotNullParameter(str5, C9650g.f26444g);
        this.f96463a = str;
        this.f96464b = str2;
        this.f96465c = str3;
        this.f96466d = str4;
        this.f96467e = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38119q(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x0008
            r11 = r0
            goto L_0x0009
        L_0x0008:
            r11 = r5
        L_0x0009:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r6
        L_0x0010:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r7
        L_0x0017:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001d
            r3 = r0
            goto L_0x001e
        L_0x001d:
            r3 = r8
        L_0x001e:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0024
            r10 = r0
            goto L_0x0025
        L_0x0024:
            r10 = r9
        L_0x0025:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.C38119q.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
