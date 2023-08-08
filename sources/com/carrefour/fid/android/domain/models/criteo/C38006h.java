package com.carrefour.fid.android.domain.models.criteo;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.criteo.h */
public final class C38006h {
    @C12579k

    /* renamed from: a */
    public final CriteoPageType f95737a;
    @C12579k

    /* renamed from: b */
    public final CriteoEventType f95738b;
    @C12580l

    /* renamed from: c */
    public final String f95739c;
    @C12580l

    /* renamed from: d */
    public final List<String> f95740d;
    @C12580l

    /* renamed from: e */
    public final List<String> f95741e;
    @C12580l

    /* renamed from: f */
    public final List<Double> f95742f;
    @C12580l

    /* renamed from: g */
    public final List<Double> f95743g;
    @C12580l

    /* renamed from: h */
    public final List<Integer> f95744h;
    @C12580l

    /* renamed from: i */
    public final Integer f95745i;
    @C12580l

    /* renamed from: j */
    public final Integer f95746j;
    @C12580l

    /* renamed from: k */
    public final Boolean f95747k;
    @C12580l

    /* renamed from: l */
    public final String f95748l;

    /* renamed from: m */
    public final boolean f95749m;

    /* renamed from: n */
    public final boolean f95750n;

    /* renamed from: o */
    public final boolean f95751o;

    public C38006h(@C12579k CriteoPageType criteoPageType, @C12579k CriteoEventType criteoEventType, @C12580l String str, @C12580l List<String> list, @C12580l List<String> list2, @C12580l List<Double> list3, @C12580l List<Double> list4, @C12580l List<Integer> list5, @C12580l Integer num, @C12580l Integer num2, @C12580l Boolean bool, @C12580l String str2, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(criteoPageType, "pageType");
        Intrinsics.checkNotNullParameter(criteoEventType, "eventType");
        this.f95737a = criteoPageType;
        this.f95738b = criteoEventType;
        this.f95739c = str;
        this.f95740d = list;
        this.f95741e = list2;
        this.f95742f = list3;
        this.f95743g = list4;
        this.f95744h = list5;
        this.f95745i = num;
        this.f95746j = num2;
        this.f95747k = bool;
        this.f95748l = str2;
        this.f95749m = z;
        this.f95750n = z2;
        this.f95751o = z3;
    }

    /* renamed from: q */
    public static /* synthetic */ C38006h m156554q(C38006h hVar, CriteoPageType criteoPageType, CriteoEventType criteoEventType, String str, List list, List list2, List list3, List list4, List list5, Integer num, Integer num2, Boolean bool, String str2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        C38006h hVar2 = hVar;
        int i2 = i;
        return hVar.mo117490p((i2 & 1) != 0 ? hVar2.f95737a : criteoPageType, (i2 & 2) != 0 ? hVar2.f95738b : criteoEventType, (i2 & 4) != 0 ? hVar2.f95739c : str, (i2 & 8) != 0 ? hVar2.f95740d : list, (i2 & 16) != 0 ? hVar2.f95741e : list2, (i2 & 32) != 0 ? hVar2.f95742f : list3, (i2 & 64) != 0 ? hVar2.f95743g : list4, (i2 & 128) != 0 ? hVar2.f95744h : list5, (i2 & 256) != 0 ? hVar2.f95745i : num, (i2 & 512) != 0 ? hVar2.f95746j : num2, (i2 & 1024) != 0 ? hVar2.f95747k : bool, (i2 & 2048) != 0 ? hVar2.f95748l : str2, (i2 & 4096) != 0 ? hVar2.f95749m : z, (i2 & 8192) != 0 ? hVar2.f95750n : z2, (i2 & 16384) != 0 ? hVar2.f95751o : z3);
    }

    @C12580l
    /* renamed from: A */
    public final List<Double> mo117467A() {
        return this.f95742f;
    }

    @C12580l
    /* renamed from: B */
    public final List<Integer> mo117468B() {
        return this.f95744h;
    }

    @C12580l
    /* renamed from: C */
    public final String mo117469C() {
        return this.f95748l;
    }

    /* renamed from: D */
    public final boolean mo117470D() {
        return this.f95751o;
    }

    /* renamed from: E */
    public final boolean mo117471E() {
        return this.f95749m;
    }

    /* renamed from: F */
    public final boolean mo117472F() {
        return this.f95750n;
    }

    @C12579k
    /* renamed from: a */
    public final CriteoPageType mo117473a() {
        return this.f95737a;
    }

    @C12580l
    /* renamed from: b */
    public final Integer mo117474b() {
        return this.f95746j;
    }

    @C12580l
    /* renamed from: c */
    public final Boolean mo117475c() {
        return this.f95747k;
    }

    @C12580l
    /* renamed from: d */
    public final String mo117476d() {
        return this.f95748l;
    }

    /* renamed from: e */
    public final boolean mo117477e() {
        return this.f95749m;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38006h)) {
            return false;
        }
        C38006h hVar = (C38006h) obj;
        return this.f95737a == hVar.f95737a && this.f95738b == hVar.f95738b && Intrinsics.areEqual((Object) this.f95739c, (Object) hVar.f95739c) && Intrinsics.areEqual((Object) this.f95740d, (Object) hVar.f95740d) && Intrinsics.areEqual((Object) this.f95741e, (Object) hVar.f95741e) && Intrinsics.areEqual((Object) this.f95742f, (Object) hVar.f95742f) && Intrinsics.areEqual((Object) this.f95743g, (Object) hVar.f95743g) && Intrinsics.areEqual((Object) this.f95744h, (Object) hVar.f95744h) && Intrinsics.areEqual((Object) this.f95745i, (Object) hVar.f95745i) && Intrinsics.areEqual((Object) this.f95746j, (Object) hVar.f95746j) && Intrinsics.areEqual((Object) this.f95747k, (Object) hVar.f95747k) && Intrinsics.areEqual((Object) this.f95748l, (Object) hVar.f95748l) && this.f95749m == hVar.f95749m && this.f95750n == hVar.f95750n && this.f95751o == hVar.f95751o;
    }

    /* renamed from: f */
    public final boolean mo117479f() {
        return this.f95750n;
    }

    /* renamed from: g */
    public final boolean mo117480g() {
        return this.f95751o;
    }

    @C12579k
    /* renamed from: h */
    public final CriteoEventType mo117481h() {
        return this.f95738b;
    }

    public int hashCode() {
        int hashCode = ((this.f95737a.hashCode() * 31) + this.f95738b.hashCode()) * 31;
        String str = this.f95739c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.f95740d;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f95741e;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Double> list3 = this.f95742f;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Double> list4 = this.f95743g;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Integer> list5 = this.f95744h;
        int hashCode7 = (hashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num = this.f95745i;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f95746j;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f95747k;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f95748l;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode10 + i) * 31;
        boolean z = this.f95749m;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f95750n;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f95751o;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    @C12580l
    /* renamed from: i */
    public final String mo117483i() {
        return this.f95739c;
    }

    @C12580l
    /* renamed from: j */
    public final List<String> mo117484j() {
        return this.f95740d;
    }

    @C12580l
    /* renamed from: k */
    public final List<String> mo117485k() {
        return this.f95741e;
    }

    @C12580l
    /* renamed from: l */
    public final List<Double> mo117486l() {
        return this.f95742f;
    }

    @C12580l
    /* renamed from: m */
    public final List<Double> mo117487m() {
        return this.f95743g;
    }

    @C12580l
    /* renamed from: n */
    public final List<Integer> mo117488n() {
        return this.f95744h;
    }

    @C12580l
    /* renamed from: o */
    public final Integer mo117489o() {
        return this.f95745i;
    }

    @C12579k
    /* renamed from: p */
    public final C38006h mo117490p(@C12579k CriteoPageType criteoPageType, @C12579k CriteoEventType criteoEventType, @C12580l String str, @C12580l List<String> list, @C12580l List<String> list2, @C12580l List<Double> list3, @C12580l List<Double> list4, @C12580l List<Integer> list5, @C12580l Integer num, @C12580l Integer num2, @C12580l Boolean bool, @C12580l String str2, boolean z, boolean z2, boolean z3) {
        CriteoPageType criteoPageType2 = criteoPageType;
        Intrinsics.checkNotNullParameter(criteoPageType2, "pageType");
        CriteoEventType criteoEventType2 = criteoEventType;
        Intrinsics.checkNotNullParameter(criteoEventType2, "eventType");
        return new C38006h(criteoPageType2, criteoEventType2, str, list, list2, list3, list4, list5, num, num2, bool, str2, z, z2, z3);
    }

    @C12580l
    /* renamed from: r */
    public final Boolean mo117491r() {
        return this.f95747k;
    }

    @C12580l
    /* renamed from: s */
    public final List<String> mo117492s() {
        return this.f95741e;
    }

    @C12579k
    /* renamed from: t */
    public final CriteoEventType mo117493t() {
        return this.f95738b;
    }

    @C12579k
    public String toString() {
        CriteoPageType criteoPageType = this.f95737a;
        CriteoEventType criteoEventType = this.f95738b;
        String str = this.f95739c;
        List<String> list = this.f95740d;
        List<String> list2 = this.f95741e;
        List<Double> list3 = this.f95742f;
        List<Double> list4 = this.f95743g;
        List<Integer> list5 = this.f95744h;
        Integer num = this.f95745i;
        Integer num2 = this.f95746j;
        Boolean bool = this.f95747k;
        String str2 = this.f95748l;
        boolean z = this.f95749m;
        boolean z2 = this.f95750n;
        boolean z3 = this.f95751o;
        return "CriteoParameters(pageType=" + criteoPageType + ", eventType=" + criteoEventType + ", keyWords=" + str + ", items=" + list + ", categories=" + list2 + ", prices=" + list3 + ", listPrices=" + list4 + ", quantities=" + list5 + ", listSize=" + num + ", pageNumber=" + num2 + ", availability=" + bool + ", transactionId=" + str2 + ", isCriteoEnabled=" + z + ", isCriteoFlagshipEnabled=" + z2 + ", isCriteoAccepted=" + z3 + ")";
    }

    @C12580l
    /* renamed from: u */
    public final List<String> mo117495u() {
        return this.f95740d;
    }

    @C12580l
    /* renamed from: v */
    public final String mo117496v() {
        return this.f95739c;
    }

    @C12580l
    /* renamed from: w */
    public final List<Double> mo117497w() {
        return this.f95743g;
    }

    @C12580l
    /* renamed from: x */
    public final Integer mo117498x() {
        return this.f95745i;
    }

    @C12580l
    /* renamed from: y */
    public final Integer mo117499y() {
        return this.f95746j;
    }

    @C12579k
    /* renamed from: z */
    public final CriteoPageType mo117500z() {
        return this.f95737a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38006h(com.carrefour.fid.android.domain.models.criteo.CriteoPageType r19, com.carrefour.fid.android.domain.models.criteo.CriteoEventType r20, java.lang.String r21, java.util.List r22, java.util.List r23, java.util.List r24, java.util.List r25, java.util.List r26, java.lang.Integer r27, java.lang.Integer r28, java.lang.Boolean r29, java.lang.String r30, boolean r31, boolean r32, boolean r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r18 = this;
            r0 = r34
            r1 = r0 & 4
            if (r1 == 0) goto L_0x000d
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r5 = r1
            goto L_0x000f
        L_0x000d:
            r5 = r21
        L_0x000f:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0016
            r6 = r2
            goto L_0x0018
        L_0x0016:
            r6 = r22
        L_0x0018:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0022
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r7 = r1
            goto L_0x0024
        L_0x0022:
            r7 = r23
        L_0x0024:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002e
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r8 = r1
            goto L_0x0030
        L_0x002e:
            r8 = r24
        L_0x0030:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x003a
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r9 = r1
            goto L_0x003c
        L_0x003a:
            r9 = r25
        L_0x003c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0046
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r10 = r1
            goto L_0x0048
        L_0x0046:
            r10 = r26
        L_0x0048:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r27
        L_0x0050:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0056
            r12 = r2
            goto L_0x0058
        L_0x0056:
            r12 = r28
        L_0x0058:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x005e
            r13 = r2
            goto L_0x0060
        L_0x005e:
            r13 = r29
        L_0x0060:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0066
            r14 = r2
            goto L_0x0068
        L_0x0066:
            r14 = r30
        L_0x0068:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r2 = 0
            if (r1 == 0) goto L_0x006f
            r15 = r2
            goto L_0x0071
        L_0x006f:
            r15 = r31
        L_0x0071:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0078
            r16 = r2
            goto L_0x007a
        L_0x0078:
            r16 = r32
        L_0x007a:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0081
            r17 = r2
            goto L_0x0083
        L_0x0081:
            r17 = r33
        L_0x0083:
            r2 = r18
            r3 = r19
            r4 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.criteo.C38006h.<init>(com.carrefour.fid.android.domain.models.criteo.CriteoPageType, com.carrefour.fid.android.domain.models.criteo.CriteoEventType, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.String, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
