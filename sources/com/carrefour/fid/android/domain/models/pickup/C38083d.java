package com.carrefour.fid.android.domain.models.pickup;

import androidx.core.app.C17239t;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.pickup.d */
public final class C38083d {
    @C12579k

    /* renamed from: a */
    public final String f96218a;
    @C12579k

    /* renamed from: b */
    public final String f96219b;
    @C12579k

    /* renamed from: c */
    public final List<C38082c> f96220c;
    @C12579k

    /* renamed from: d */
    public final List<C38082c> f96221d;
    @C12579k

    /* renamed from: e */
    public final List<C38082c> f96222e;
    @C12579k

    /* renamed from: f */
    public final List<C38082c> f96223f;
    @C12579k

    /* renamed from: g */
    public final List<C38082c> f96224g;
    @C12579k

    /* renamed from: h */
    public final List<C38082c> f96225h;
    @C12579k

    /* renamed from: i */
    public final List<C38082c> f96226i;

    public C38083d() {
        this((String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, C17239t.f45525u, (DefaultConstructorMarker) null);
    }

    /* renamed from: k */
    public static /* synthetic */ C38083d m157256k(C38083d dVar, String str, String str2, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i, Object obj) {
        C38083d dVar2 = dVar;
        int i2 = i;
        return dVar.mo118323j((i2 & 1) != 0 ? dVar2.f96218a : str, (i2 & 2) != 0 ? dVar2.f96219b : str2, (i2 & 4) != 0 ? dVar2.f96220c : list, (i2 & 8) != 0 ? dVar2.f96221d : list2, (i2 & 16) != 0 ? dVar2.f96222e : list3, (i2 & 32) != 0 ? dVar2.f96223f : list4, (i2 & 64) != 0 ? dVar2.f96224g : list5, (i2 & 128) != 0 ? dVar2.f96225h : list6, (i2 & 256) != 0 ? dVar2.f96226i : list7);
    }

    @C12579k
    /* renamed from: a */
    public final String mo118312a() {
        return this.f96218a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo118313b() {
        return this.f96219b;
    }

    @C12579k
    /* renamed from: c */
    public final List<C38082c> mo118314c() {
        return this.f96220c;
    }

    @C12579k
    /* renamed from: d */
    public final List<C38082c> mo118315d() {
        return this.f96221d;
    }

    @C12579k
    /* renamed from: e */
    public final List<C38082c> mo118316e() {
        return this.f96222e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38083d)) {
            return false;
        }
        C38083d dVar = (C38083d) obj;
        return Intrinsics.areEqual((Object) this.f96218a, (Object) dVar.f96218a) && Intrinsics.areEqual((Object) this.f96219b, (Object) dVar.f96219b) && Intrinsics.areEqual((Object) this.f96220c, (Object) dVar.f96220c) && Intrinsics.areEqual((Object) this.f96221d, (Object) dVar.f96221d) && Intrinsics.areEqual((Object) this.f96222e, (Object) dVar.f96222e) && Intrinsics.areEqual((Object) this.f96223f, (Object) dVar.f96223f) && Intrinsics.areEqual((Object) this.f96224g, (Object) dVar.f96224g) && Intrinsics.areEqual((Object) this.f96225h, (Object) dVar.f96225h) && Intrinsics.areEqual((Object) this.f96226i, (Object) dVar.f96226i);
    }

    @C12579k
    /* renamed from: f */
    public final List<C38082c> mo118318f() {
        return this.f96223f;
    }

    @C12579k
    /* renamed from: g */
    public final List<C38082c> mo118319g() {
        return this.f96224g;
    }

    @C12579k
    /* renamed from: h */
    public final List<C38082c> mo118320h() {
        return this.f96225h;
    }

    public int hashCode() {
        return (((((((((((((((this.f96218a.hashCode() * 31) + this.f96219b.hashCode()) * 31) + this.f96220c.hashCode()) * 31) + this.f96221d.hashCode()) * 31) + this.f96222e.hashCode()) * 31) + this.f96223f.hashCode()) * 31) + this.f96224g.hashCode()) * 31) + this.f96225h.hashCode()) * 31) + this.f96226i.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final List<C38082c> mo118322i() {
        return this.f96226i;
    }

    @C12579k
    /* renamed from: j */
    public final C38083d mo118323j(@C12579k String str, @C12579k String str2, @C12579k List<C38082c> list, @C12579k List<C38082c> list2, @C12579k List<C38082c> list3, @C12579k List<C38082c> list4, @C12579k List<C38082c> list5, @C12579k List<C38082c> list6, @C12579k List<C38082c> list7) {
        Intrinsics.checkNotNullParameter(str, "beginDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        Intrinsics.checkNotNullParameter(list, "mondayTimeRange");
        Intrinsics.checkNotNullParameter(list2, "tuesayTimeRange");
        List<C38082c> list8 = list3;
        Intrinsics.checkNotNullParameter(list8, "wednesdayTimeRange");
        List<C38082c> list9 = list4;
        Intrinsics.checkNotNullParameter(list9, "thursdayTimeRange");
        List<C38082c> list10 = list5;
        Intrinsics.checkNotNullParameter(list10, "fridayTimeRange");
        List<C38082c> list11 = list6;
        Intrinsics.checkNotNullParameter(list11, "saturdayTimeRange");
        List<C38082c> list12 = list7;
        Intrinsics.checkNotNullParameter(list12, "sundayTimeRange");
        return new C38083d(str, str2, list, list2, list8, list9, list10, list11, list12);
    }

    @C12579k
    /* renamed from: l */
    public final String mo118324l() {
        return this.f96218a;
    }

    @C12579k
    /* renamed from: m */
    public final String mo118325m() {
        return this.f96219b;
    }

    @C12579k
    /* renamed from: n */
    public final List<C38082c> mo118326n() {
        return this.f96224g;
    }

    @C12579k
    /* renamed from: o */
    public final List<C38082c> mo118327o() {
        return this.f96220c;
    }

    @C12579k
    /* renamed from: p */
    public final List<C38082c> mo118328p() {
        return this.f96225h;
    }

    @C12579k
    /* renamed from: q */
    public final List<C38082c> mo118329q() {
        return this.f96226i;
    }

    @C12579k
    /* renamed from: r */
    public final List<C38082c> mo118330r() {
        return this.f96223f;
    }

    @C12579k
    /* renamed from: s */
    public final List<C38082c> mo118331s() {
        return this.f96221d;
    }

    @C12579k
    /* renamed from: t */
    public final List<C38082c> mo118332t() {
        return this.f96222e;
    }

    @C12579k
    public String toString() {
        String str = this.f96218a;
        String str2 = this.f96219b;
        List<C38082c> list = this.f96220c;
        List<C38082c> list2 = this.f96221d;
        List<C38082c> list3 = this.f96222e;
        List<C38082c> list4 = this.f96223f;
        List<C38082c> list5 = this.f96224g;
        List<C38082c> list6 = this.f96225h;
        List<C38082c> list7 = this.f96226i;
        return "WeekPattern(beginDate=" + str + ", endDate=" + str2 + ", mondayTimeRange=" + list + ", tuesayTimeRange=" + list2 + ", wednesdayTimeRange=" + list3 + ", thursdayTimeRange=" + list4 + ", fridayTimeRange=" + list5 + ", saturdayTimeRange=" + list6 + ", sundayTimeRange=" + list7 + ")";
    }

    public C38083d(@C12579k String str, @C12579k String str2, @C12579k List<C38082c> list, @C12579k List<C38082c> list2, @C12579k List<C38082c> list3, @C12579k List<C38082c> list4, @C12579k List<C38082c> list5, @C12579k List<C38082c> list6, @C12579k List<C38082c> list7) {
        Intrinsics.checkNotNullParameter(str, "beginDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        Intrinsics.checkNotNullParameter(list, "mondayTimeRange");
        Intrinsics.checkNotNullParameter(list2, "tuesayTimeRange");
        Intrinsics.checkNotNullParameter(list3, "wednesdayTimeRange");
        Intrinsics.checkNotNullParameter(list4, "thursdayTimeRange");
        Intrinsics.checkNotNullParameter(list5, "fridayTimeRange");
        Intrinsics.checkNotNullParameter(list6, "saturdayTimeRange");
        Intrinsics.checkNotNullParameter(list7, "sundayTimeRange");
        this.f96218a = str;
        this.f96219b = str2;
        this.f96220c = list;
        this.f96221d = list2;
        this.f96222e = list3;
        this.f96223f = list4;
        this.f96224g = list5;
        this.f96225h = list6;
        this.f96226i = list7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38083d(java.lang.String r10, java.lang.String r11, java.util.List r12, java.util.List r13, java.util.List r14, java.util.List r15, java.util.List r16, java.util.List r17, java.util.List r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r10
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r2 = r11
        L_0x0011:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x001a
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x001b
        L_0x001a:
            r3 = r12
        L_0x001b:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0024
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0025
        L_0x0024:
            r4 = r13
        L_0x0025:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x002e
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x002f
        L_0x002e:
            r5 = r14
        L_0x002f:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0038
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0039
        L_0x0038:
            r6 = r15
        L_0x0039:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0042
            java.util.List r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0044
        L_0x0042:
            r7 = r16
        L_0x0044:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x004d
            java.util.List r8 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x004f
        L_0x004d:
            r8 = r17
        L_0x004f:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0058
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x005a
        L_0x0058:
            r0 = r18
        L_0x005a:
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.pickup.C38083d.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
