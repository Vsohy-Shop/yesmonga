package com.carrefour.fid.android.product.presentation.analytics;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.analytics.c */
public final class C27633c {

    /* renamed from: l */
    public static final int f67125l = 0;
    @C12580l

    /* renamed from: a */
    public final String f67126a;
    @C12579k

    /* renamed from: b */
    public final String f67127b;
    @C12580l

    /* renamed from: c */
    public final String f67128c;
    @C12580l

    /* renamed from: d */
    public final String f67129d;
    @C12579k

    /* renamed from: e */
    public final String f67130e;
    @C12580l

    /* renamed from: f */
    public final Integer f67131f;

    /* renamed from: g */
    public final int f67132g;
    @C12580l

    /* renamed from: h */
    public final String f67133h;
    @C12580l

    /* renamed from: i */
    public final String f67134i;
    @C12580l

    /* renamed from: j */
    public final String f67135j;
    @C12580l

    /* renamed from: k */
    public final String f67136k;

    public C27633c(@C12580l String str, @C12579k String str2, @C12580l String str3, @C12580l String str4, @C12579k String str5, @C12580l Integer num, int i, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9) {
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(str5, "price");
        this.f67126a = str;
        this.f67127b = str2;
        this.f67128c = str3;
        this.f67129d = str4;
        this.f67130e = str5;
        this.f67131f = num;
        this.f67132g = i;
        this.f67133h = str6;
        this.f67134i = str7;
        this.f67135j = str8;
        this.f67136k = str9;
    }

    /* renamed from: m */
    public static /* synthetic */ C27633c m116226m(C27633c cVar, String str, String str2, String str3, String str4, String str5, Integer num, int i, String str6, String str7, String str8, String str9, int i2, Object obj) {
        C27633c cVar2 = cVar;
        int i3 = i2;
        return cVar.mo80263l((i3 & 1) != 0 ? cVar2.f67126a : str, (i3 & 2) != 0 ? cVar2.f67127b : str2, (i3 & 4) != 0 ? cVar2.f67128c : str3, (i3 & 8) != 0 ? cVar2.f67129d : str4, (i3 & 16) != 0 ? cVar2.f67130e : str5, (i3 & 32) != 0 ? cVar2.f67131f : num, (i3 & 64) != 0 ? cVar2.f67132g : i, (i3 & 128) != 0 ? cVar2.f67133h : str6, (i3 & 256) != 0 ? cVar2.f67134i : str7, (i3 & 512) != 0 ? cVar2.f67135j : str8, (i3 & 1024) != 0 ? cVar2.f67136k : str9);
    }

    @C12580l
    /* renamed from: a */
    public final String mo80250a() {
        return this.f67126a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo80251b() {
        return this.f67135j;
    }

    @C12580l
    /* renamed from: c */
    public final String mo80252c() {
        return this.f67136k;
    }

    @C12579k
    /* renamed from: d */
    public final String mo80253d() {
        return this.f67127b;
    }

    @C12580l
    /* renamed from: e */
    public final String mo80254e() {
        return this.f67128c;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27633c)) {
            return false;
        }
        C27633c cVar = (C27633c) obj;
        return Intrinsics.areEqual((Object) this.f67126a, (Object) cVar.f67126a) && Intrinsics.areEqual((Object) this.f67127b, (Object) cVar.f67127b) && Intrinsics.areEqual((Object) this.f67128c, (Object) cVar.f67128c) && Intrinsics.areEqual((Object) this.f67129d, (Object) cVar.f67129d) && Intrinsics.areEqual((Object) this.f67130e, (Object) cVar.f67130e) && Intrinsics.areEqual((Object) this.f67131f, (Object) cVar.f67131f) && this.f67132g == cVar.f67132g && Intrinsics.areEqual((Object) this.f67133h, (Object) cVar.f67133h) && Intrinsics.areEqual((Object) this.f67134i, (Object) cVar.f67134i) && Intrinsics.areEqual((Object) this.f67135j, (Object) cVar.f67135j) && Intrinsics.areEqual((Object) this.f67136k, (Object) cVar.f67136k);
    }

    @C12580l
    /* renamed from: f */
    public final String mo80256f() {
        return this.f67129d;
    }

    @C12579k
    /* renamed from: g */
    public final String mo80257g() {
        return this.f67130e;
    }

    @C12580l
    /* renamed from: h */
    public final Integer mo80258h() {
        return this.f67131f;
    }

    public int hashCode() {
        String str = this.f67126a;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f67127b.hashCode()) * 31;
        String str2 = this.f67128c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f67129d;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f67130e.hashCode()) * 31;
        Integer num = this.f67131f;
        int hashCode4 = (((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.f67132g)) * 31;
        String str4 = this.f67133h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f67134i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f67135j;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f67136k;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 + i;
    }

    /* renamed from: i */
    public final int mo80260i() {
        return this.f67132g;
    }

    @C12580l
    /* renamed from: j */
    public final String mo80261j() {
        return this.f67133h;
    }

    @C12580l
    /* renamed from: k */
    public final String mo80262k() {
        return this.f67134i;
    }

    @C12579k
    /* renamed from: l */
    public final C27633c mo80263l(@C12580l String str, @C12579k String str2, @C12580l String str3, @C12580l String str4, @C12579k String str5, @C12580l Integer num, int i, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9) {
        Intrinsics.checkNotNullParameter(str2, "id");
        String str10 = str5;
        Intrinsics.checkNotNullParameter(str10, "price");
        return new C27633c(str, str2, str3, str4, str10, num, i, str6, str7, str8, str9);
    }

    /* renamed from: n */
    public final int mo80264n() {
        return this.f67132g;
    }

    @C12580l
    /* renamed from: o */
    public final String mo80265o() {
        return this.f67128c;
    }

    @C12580l
    /* renamed from: p */
    public final String mo80266p() {
        return this.f67129d;
    }

    @C12580l
    /* renamed from: q */
    public final String mo80267q() {
        return this.f67136k;
    }

    @C12580l
    /* renamed from: r */
    public final String mo80268r() {
        return this.f67134i;
    }

    @C12580l
    /* renamed from: s */
    public final String mo80269s() {
        return this.f67133h;
    }

    @C12579k
    /* renamed from: t */
    public final String mo80270t() {
        return this.f67127b;
    }

    @C12579k
    public String toString() {
        String str = this.f67126a;
        String str2 = this.f67127b;
        String str3 = this.f67128c;
        String str4 = this.f67129d;
        String str5 = this.f67130e;
        Integer num = this.f67131f;
        int i = this.f67132g;
        String str6 = this.f67133h;
        String str7 = this.f67134i;
        String str8 = this.f67135j;
        String str9 = this.f67136k;
        return "OfferAnalytics(name=" + str + ", id=" + str2 + ", category=" + str3 + ", cdbase=" + str4 + ", price=" + str5 + ", quantity=" + num + ", business=" + i + ", discountType=" + str6 + ", discountLabel=" + str7 + ", productType=" + str8 + ", dimension=" + str9 + ")";
    }

    @C12580l
    /* renamed from: u */
    public final String mo80272u() {
        return this.f67126a;
    }

    @C12579k
    /* renamed from: v */
    public final String mo80273v() {
        return this.f67130e;
    }

    @C12580l
    /* renamed from: w */
    public final String mo80274w() {
        return this.f67135j;
    }

    @C12580l
    /* renamed from: x */
    public final Integer mo80275x() {
        return this.f67131f;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C27633c(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Integer r21, int r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r16
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r18
        L_0x0013:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0019
            r7 = r2
            goto L_0x001b
        L_0x0019:
            r7 = r19
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r21
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002a
            r1 = 2
            r10 = r1
            goto L_0x002c
        L_0x002a:
            r10 = r22
        L_0x002c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0032
            r11 = r2
            goto L_0x0034
        L_0x0032:
            r11 = r23
        L_0x0034:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003a
            r12 = r2
            goto L_0x003c
        L_0x003a:
            r12 = r24
        L_0x003c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0042
            r13 = r2
            goto L_0x0044
        L_0x0042:
            r13 = r25
        L_0x0044:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x004a
            r14 = r2
            goto L_0x004c
        L_0x004a:
            r14 = r26
        L_0x004c:
            r3 = r15
            r5 = r17
            r8 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.analytics.C27633c.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
