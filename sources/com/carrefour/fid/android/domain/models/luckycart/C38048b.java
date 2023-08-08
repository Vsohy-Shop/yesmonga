package com.carrefour.fid.android.domain.models.luckycart;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.luckycart.b */
public final class C38048b {
    @C12580l

    /* renamed from: a */
    public final String f95929a;
    @C12580l

    /* renamed from: b */
    public final LuckyCartPageType f95930b;
    @C12580l

    /* renamed from: c */
    public final String f95931c;
    @C12580l

    /* renamed from: d */
    public final String f95932d;
    @C12580l

    /* renamed from: e */
    public final String f95933e;

    /* renamed from: f */
    public final boolean f95934f;

    public C38048b() {
        this((String) null, (LuckyCartPageType) null, (String) null, (String) null, (String) null, false, 63, (DefaultConstructorMarker) null);
    }

    /* renamed from: h */
    public static /* synthetic */ C38048b m156926h(C38048b bVar, String str, LuckyCartPageType luckyCartPageType, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f95929a;
        }
        if ((i & 2) != 0) {
            luckyCartPageType = bVar.f95930b;
        }
        LuckyCartPageType luckyCartPageType2 = luckyCartPageType;
        if ((i & 4) != 0) {
            str2 = bVar.f95931c;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = bVar.f95932d;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = bVar.f95933e;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            z = bVar.f95934f;
        }
        return bVar.mo117908g(str, luckyCartPageType2, str5, str6, str7, z);
    }

    @C12580l
    /* renamed from: a */
    public final String mo117901a() {
        return this.f95929a;
    }

    @C12580l
    /* renamed from: b */
    public final LuckyCartPageType mo117902b() {
        return this.f95930b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo117903c() {
        return this.f95931c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo117904d() {
        return this.f95932d;
    }

    @C12580l
    /* renamed from: e */
    public final String mo117905e() {
        return this.f95933e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38048b)) {
            return false;
        }
        C38048b bVar = (C38048b) obj;
        return Intrinsics.areEqual((Object) this.f95929a, (Object) bVar.f95929a) && this.f95930b == bVar.f95930b && Intrinsics.areEqual((Object) this.f95931c, (Object) bVar.f95931c) && Intrinsics.areEqual((Object) this.f95932d, (Object) bVar.f95932d) && Intrinsics.areEqual((Object) this.f95933e, (Object) bVar.f95933e) && this.f95934f == bVar.f95934f;
    }

    /* renamed from: f */
    public final boolean mo117907f() {
        return this.f95934f;
    }

    @C12579k
    /* renamed from: g */
    public final C38048b mo117908g(@C12580l String str, @C12580l LuckyCartPageType luckyCartPageType, @C12580l String str2, @C12580l String str3, @C12580l String str4, boolean z) {
        return new C38048b(str, luckyCartPageType, str2, str3, str4, z);
    }

    public int hashCode() {
        String str = this.f95929a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        LuckyCartPageType luckyCartPageType = this.f95930b;
        int hashCode2 = (hashCode + (luckyCartPageType == null ? 0 : luckyCartPageType.hashCode())) * 31;
        String str2 = this.f95931c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95932d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95933e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.f95934f;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @C12580l
    /* renamed from: i */
    public final String mo117910i() {
        return this.f95931c;
    }

    @C12580l
    /* renamed from: j */
    public final String mo117911j() {
        return this.f95929a;
    }

    @C12580l
    /* renamed from: k */
    public final LuckyCartPageType mo117912k() {
        return this.f95930b;
    }

    @C12580l
    /* renamed from: l */
    public final String mo117913l() {
        return this.f95932d;
    }

    @C12580l
    /* renamed from: m */
    public final String mo117914m() {
        return this.f95933e;
    }

    /* renamed from: n */
    public final boolean mo117915n() {
        return this.f95934f;
    }

    @C12579k
    public String toString() {
        String str = this.f95929a;
        LuckyCartPageType luckyCartPageType = this.f95930b;
        String str2 = this.f95931c;
        String str3 = this.f95932d;
        String str4 = this.f95933e;
        boolean z = this.f95934f;
        return "LuckyCartParameters(customerId=" + str + ", pageType=" + luckyCartPageType + ", bannerId=" + str2 + ", store=" + str3 + ", storeType=" + str4 + ", isLuckyCartEnabled=" + z + ")";
    }

    public C38048b(@C12580l String str, @C12580l LuckyCartPageType luckyCartPageType, @C12580l String str2, @C12580l String str3, @C12580l String str4, boolean z) {
        this.f95929a = str;
        this.f95930b = luckyCartPageType;
        this.f95931c = str2;
        this.f95932d = str3;
        this.f95933e = str4;
        this.f95934f = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38048b(java.lang.String r5, com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0007
            r12 = r0
            goto L_0x0008
        L_0x0007:
            r12 = r5
        L_0x0008:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r11 & 16
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r0 = r9
        L_0x0023:
            r5 = r11 & 32
            if (r5 == 0) goto L_0x0028
            r10 = 0
        L_0x0028:
            r11 = r10
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r2
            r9 = r3
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.luckycart.C38048b.<init>(java.lang.String, com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
