package com.carrefour.fid.android.domain.models.service.models;

import com.carrefour.fid.android.domain.models.service.models.C38147b;
import java.util.List;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12439o
/* renamed from: com.carrefour.fid.android.domain.models.service.models.h */
public final class C38157h {
    @C12579k
    public static final C38159b Companion = new C38159b((DefaultConstructorMarker) null);
    @C12579k
    @C11287e

    /* renamed from: k */
    public static final C12248g<Object>[] f96648k;

    /* renamed from: a */
    public final int f96649a;
    @C12579k

    /* renamed from: b */
    public final String f96650b;
    @C12579k

    /* renamed from: c */
    public final String f96651c;
    @C12579k

    /* renamed from: d */
    public final List<C38147b> f96652d;
    @C12579k

    /* renamed from: e */
    public final List<C38147b> f96653e;
    @C12579k

    /* renamed from: f */
    public final List<C38147b> f96654f;
    @C12579k

    /* renamed from: g */
    public final List<C38147b> f96655g;
    @C12579k

    /* renamed from: h */
    public final List<C38147b> f96656h;
    @C12579k

    /* renamed from: i */
    public final List<C38147b> f96657i;
    @C12579k

    /* renamed from: j */
    public final List<C38147b> f96658j;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    /* renamed from: com.carrefour.fid.android.domain.models.service.models.h$a */
    public static final class C38158a implements C12327y<C38157h> {
        @C12579k

        /* renamed from: a */
        public static final C38158a f96659a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f96660b;

        static {
            C38158a aVar = new C38158a();
            f96659a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.domain.models.service.models.OpeningPattern", aVar, 10);
            pluginGeneratedSerialDescriptor.mo24966k("patternId", true);
            pluginGeneratedSerialDescriptor.mo24966k("beginDate", true);
            pluginGeneratedSerialDescriptor.mo24966k("endDate", true);
            pluginGeneratedSerialDescriptor.mo24966k("mondayTimeRange", true);
            pluginGeneratedSerialDescriptor.mo24966k("tuesayTimeRange", true);
            pluginGeneratedSerialDescriptor.mo24966k("wednesdayTimeRange", true);
            pluginGeneratedSerialDescriptor.mo24966k("thursdayTimeRange", true);
            pluginGeneratedSerialDescriptor.mo24966k("fridayTimeRange", true);
            pluginGeneratedSerialDescriptor.mo24966k("saturdayTimeRange", true);
            pluginGeneratedSerialDescriptor.mo24966k("sundayTimeRange", true);
            f96660b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.carrefour.fid.android.domain.models.service.models.C38157h deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r22) {
            /*
                r21 = this;
                r0 = r22
                java.lang.String r1 = "decoder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                kotlinx.serialization.descriptors.f r1 = r21.getDescriptor()
                kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
                kotlinx.serialization.g[] r2 = com.carrefour.fid.android.domain.models.service.models.C38157h.f96648k
                boolean r3 = r0.mo24886p()
                r4 = 2
                r5 = 9
                r6 = 7
                r7 = 6
                r8 = 5
                r9 = 3
                r10 = 8
                r11 = 4
                r12 = 1
                r13 = 0
                r14 = 0
                if (r3 == 0) goto L_0x006b
                int r3 = r0.mo24880i(r1, r13)
                java.lang.String r12 = r0.mo24884m(r1, r12)
                java.lang.String r4 = r0.mo24884m(r1, r4)
                r13 = r2[r9]
                java.lang.Object r9 = r0.mo24895y(r1, r9, r13, r14)
                r13 = r2[r11]
                java.lang.Object r11 = r0.mo24895y(r1, r11, r13, r14)
                r13 = r2[r8]
                java.lang.Object r8 = r0.mo24895y(r1, r8, r13, r14)
                r13 = r2[r7]
                java.lang.Object r7 = r0.mo24895y(r1, r7, r13, r14)
                r13 = r2[r6]
                java.lang.Object r6 = r0.mo24895y(r1, r6, r13, r14)
                r13 = r2[r10]
                java.lang.Object r10 = r0.mo24895y(r1, r10, r13, r14)
                r2 = r2[r5]
                java.lang.Object r2 = r0.mo24895y(r1, r5, r2, r14)
                r5 = 1023(0x3ff, float:1.434E-42)
                r13 = r9
                r9 = r7
                r7 = r4
                r4 = r5
                r5 = r3
                r20 = r11
                r11 = r6
                r6 = r12
                r12 = r20
                goto L_0x0108
            L_0x006b:
                r19 = r12
                r3 = r13
                r4 = r14
                r7 = r4
                r8 = r7
                r9 = r8
                r11 = r9
                r12 = r11
                r15 = r12
                r16 = r15
                r13 = r16
                r14 = r3
            L_0x007a:
                if (r19 == 0) goto L_0x0100
                int r6 = r0.mo24931o(r1)
                switch(r6) {
                    case -1: goto L_0x00f3;
                    case 0: goto L_0x00e5;
                    case 1: goto L_0x00d9;
                    case 2: goto L_0x00d0;
                    case 3: goto L_0x00c6;
                    case 4: goto L_0x00bc;
                    case 5: goto L_0x00b2;
                    case 6: goto L_0x00a8;
                    case 7: goto L_0x009c;
                    case 8: goto L_0x0093;
                    case 9: goto L_0x0089;
                    default: goto L_0x0083;
                }
            L_0x0083:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>((int) r6)
                throw r0
            L_0x0089:
                r6 = r2[r5]
                java.lang.Object r7 = r0.mo24895y(r1, r5, r6, r7)
                r14 = r14 | 512(0x200, float:7.175E-43)
                goto L_0x00fd
            L_0x0093:
                r6 = r2[r10]
                java.lang.Object r8 = r0.mo24895y(r1, r10, r6, r8)
                r14 = r14 | 256(0x100, float:3.59E-43)
                goto L_0x00fd
            L_0x009c:
                r6 = 7
                r5 = r2[r6]
                java.lang.Object r11 = r0.mo24895y(r1, r6, r5, r11)
                r14 = r14 | 128(0x80, float:1.794E-43)
                r5 = 9
                goto L_0x007a
            L_0x00a8:
                r5 = 6
                r6 = r2[r5]
                java.lang.Object r9 = r0.mo24895y(r1, r5, r6, r9)
                r14 = r14 | 64
                goto L_0x00fb
            L_0x00b2:
                r6 = 5
                r5 = r2[r6]
                java.lang.Object r4 = r0.mo24895y(r1, r6, r5, r4)
                r14 = r14 | 32
                goto L_0x00fb
            L_0x00bc:
                r5 = 4
                r6 = r2[r5]
                java.lang.Object r12 = r0.mo24895y(r1, r5, r6, r12)
                r14 = r14 | 16
                goto L_0x00fb
            L_0x00c6:
                r6 = 3
                r5 = r2[r6]
                java.lang.Object r13 = r0.mo24895y(r1, r6, r5, r13)
                r14 = r14 | 8
                goto L_0x00fb
            L_0x00d0:
                r5 = 2
                r6 = 3
                java.lang.String r16 = r0.mo24884m(r1, r5)
                r14 = r14 | 4
                goto L_0x00fb
            L_0x00d9:
                r5 = 2
                r6 = 3
                r15 = 1
                java.lang.String r17 = r0.mo24884m(r1, r15)
                r14 = r14 | 2
                r15 = r17
                goto L_0x00fb
            L_0x00e5:
                r3 = 0
                r5 = 2
                r6 = 3
                r17 = 1
                int r18 = r0.mo24880i(r1, r3)
                r14 = r14 | 1
                r3 = r18
                goto L_0x00fb
            L_0x00f3:
                r5 = 2
                r6 = 3
                r17 = 1
                r18 = 0
                r19 = r18
            L_0x00fb:
                r5 = 9
            L_0x00fd:
                r6 = 7
                goto L_0x007a
            L_0x0100:
                r5 = r3
                r2 = r7
                r10 = r8
                r6 = r15
                r7 = r16
                r8 = r4
                r4 = r14
            L_0x0108:
                r0.mo24876c(r1)
                com.carrefour.fid.android.domain.models.service.models.h r0 = new com.carrefour.fid.android.domain.models.service.models.h
                r1 = r13
                java.util.List r1 = (java.util.List) r1
                java.util.List r12 = (java.util.List) r12
                r13 = r8
                java.util.List r13 = (java.util.List) r13
                r14 = r9
                java.util.List r14 = (java.util.List) r14
                r15 = r11
                java.util.List r15 = (java.util.List) r15
                r16 = r10
                java.util.List r16 = (java.util.List) r16
                java.util.List r2 = (java.util.List) r2
                r17 = 0
                r3 = r0
                r8 = r1
                r9 = r12
                r10 = r13
                r11 = r14
                r12 = r15
                r13 = r16
                r14 = r2
                r15 = r17
                r3.<init>((int) r4, (int) r5, (java.lang.String) r6, (java.lang.String) r7, (java.util.List) r8, (java.util.List) r9, (java.util.List) r10, (java.util.List) r11, (java.util.List) r12, (java.util.List) r13, (java.util.List) r14, (kotlinx.serialization.internal.C12295n1) r15)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.service.models.C38157h.C38158a.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.domain.models.service.models.h");
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k C38157h hVar) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(hVar, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            C38157h.m158135x(hVar, b, descriptor);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            C12248g<?>[] a = C38157h.f96648k;
            C12310s1 s1Var = C12310s1.f30117a;
            return new C12248g[]{C12276h0.f30067a, s1Var, s1Var, a[3], a[4], a[5], a[6], a[7], a[8], a[9]};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f96660b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.service.models.h$b */
    public static final class C38159b {
        public /* synthetic */ C38159b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<C38157h> serializer() {
            return C38158a.f96659a;
        }

        public C38159b() {
        }
    }

    static {
        C38147b.C38148a aVar = C38147b.C38148a.f96628a;
        f96648k = new C12248g[]{null, null, null, new C12269f(aVar), new C12269f(aVar), new C12269f(aVar), new C12269f(aVar), new C12269f(aVar), new C12269f(aVar), new C12269f(aVar)};
    }

    public C38157h() {
        this(0, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 1023, (DefaultConstructorMarker) null);
    }

    /* renamed from: m */
    public static /* synthetic */ C38157h m158134m(C38157h hVar, int i, String str, String str2, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i2, Object obj) {
        C38157h hVar2 = hVar;
        int i3 = i2;
        return hVar.mo119320l((i3 & 1) != 0 ? hVar2.f96649a : i, (i3 & 2) != 0 ? hVar2.f96650b : str, (i3 & 4) != 0 ? hVar2.f96651c : str2, (i3 & 8) != 0 ? hVar2.f96652d : list, (i3 & 16) != 0 ? hVar2.f96653e : list2, (i3 & 32) != 0 ? hVar2.f96654f : list3, (i3 & 64) != 0 ? hVar2.f96655g : list4, (i3 & 128) != 0 ? hVar2.f96656h : list5, (i3 & 256) != 0 ? hVar2.f96657i : list6, (i3 & 512) != 0 ? hVar2.f96658j : list7);
    }

    @C11384m
    /* renamed from: x */
    public static final /* synthetic */ void m158135x(C38157h hVar, C12239d dVar, C12217f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        C12248g<Object>[] gVarArr = f96648k;
        boolean z10 = false;
        if (!dVar.mo24897A(fVar, 0) && hVar.f96649a == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            dVar.mo24927x(fVar, 0, hVar.f96649a);
        }
        if (!dVar.mo24897A(fVar, 1) && Intrinsics.areEqual((Object) hVar.f96650b, (Object) "")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            dVar.mo24929z(fVar, 1, hVar.f96650b);
        }
        if (!dVar.mo24897A(fVar, 2) && Intrinsics.areEqual((Object) hVar.f96651c, (Object) "")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            dVar.mo24929z(fVar, 2, hVar.f96651c);
        }
        if (!dVar.mo24897A(fVar, 3) && Intrinsics.areEqual((Object) hVar.f96652d, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            dVar.mo24899D(fVar, 3, gVarArr[3], hVar.f96652d);
        }
        if (!dVar.mo24897A(fVar, 4) && Intrinsics.areEqual((Object) hVar.f96653e, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            dVar.mo24899D(fVar, 4, gVarArr[4], hVar.f96653e);
        }
        if (!dVar.mo24897A(fVar, 5) && Intrinsics.areEqual((Object) hVar.f96654f, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            dVar.mo24899D(fVar, 5, gVarArr[5], hVar.f96654f);
        }
        if (!dVar.mo24897A(fVar, 6) && Intrinsics.areEqual((Object) hVar.f96655g, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z7) {
            dVar.mo24899D(fVar, 6, gVarArr[6], hVar.f96655g);
        }
        if (!dVar.mo24897A(fVar, 7) && Intrinsics.areEqual((Object) hVar.f96656h, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8) {
            dVar.mo24899D(fVar, 7, gVarArr[7], hVar.f96656h);
        }
        if (!dVar.mo24897A(fVar, 8) && Intrinsics.areEqual((Object) hVar.f96657i, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            dVar.mo24899D(fVar, 8, gVarArr[8], hVar.f96657i);
        }
        if (dVar.mo24897A(fVar, 9) || !Intrinsics.areEqual((Object) hVar.f96658j, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z10 = true;
        }
        if (z10) {
            dVar.mo24899D(fVar, 9, gVarArr[9], hVar.f96658j);
        }
    }

    /* renamed from: b */
    public final int mo119308b() {
        return this.f96649a;
    }

    @C12579k
    /* renamed from: c */
    public final List<C38147b> mo119309c() {
        return this.f96658j;
    }

    @C12579k
    /* renamed from: d */
    public final String mo119310d() {
        return this.f96650b;
    }

    @C12579k
    /* renamed from: e */
    public final String mo119311e() {
        return this.f96651c;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38157h)) {
            return false;
        }
        C38157h hVar = (C38157h) obj;
        return this.f96649a == hVar.f96649a && Intrinsics.areEqual((Object) this.f96650b, (Object) hVar.f96650b) && Intrinsics.areEqual((Object) this.f96651c, (Object) hVar.f96651c) && Intrinsics.areEqual((Object) this.f96652d, (Object) hVar.f96652d) && Intrinsics.areEqual((Object) this.f96653e, (Object) hVar.f96653e) && Intrinsics.areEqual((Object) this.f96654f, (Object) hVar.f96654f) && Intrinsics.areEqual((Object) this.f96655g, (Object) hVar.f96655g) && Intrinsics.areEqual((Object) this.f96656h, (Object) hVar.f96656h) && Intrinsics.areEqual((Object) this.f96657i, (Object) hVar.f96657i) && Intrinsics.areEqual((Object) this.f96658j, (Object) hVar.f96658j);
    }

    @C12579k
    /* renamed from: f */
    public final List<C38147b> mo119313f() {
        return this.f96652d;
    }

    @C12579k
    /* renamed from: g */
    public final List<C38147b> mo119314g() {
        return this.f96653e;
    }

    @C12579k
    /* renamed from: h */
    public final List<C38147b> mo119315h() {
        return this.f96654f;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.f96649a) * 31) + this.f96650b.hashCode()) * 31) + this.f96651c.hashCode()) * 31) + this.f96652d.hashCode()) * 31) + this.f96653e.hashCode()) * 31) + this.f96654f.hashCode()) * 31) + this.f96655g.hashCode()) * 31) + this.f96656h.hashCode()) * 31) + this.f96657i.hashCode()) * 31) + this.f96658j.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final List<C38147b> mo119317i() {
        return this.f96655g;
    }

    @C12579k
    /* renamed from: j */
    public final List<C38147b> mo119318j() {
        return this.f96656h;
    }

    @C12579k
    /* renamed from: k */
    public final List<C38147b> mo119319k() {
        return this.f96657i;
    }

    @C12579k
    /* renamed from: l */
    public final C38157h mo119320l(int i, @C12579k String str, @C12579k String str2, @C12579k List<C38147b> list, @C12579k List<C38147b> list2, @C12579k List<C38147b> list3, @C12579k List<C38147b> list4, @C12579k List<C38147b> list5, @C12579k List<C38147b> list6, @C12579k List<C38147b> list7) {
        Intrinsics.checkNotNullParameter(str, "beginDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        List<C38147b> list8 = list;
        Intrinsics.checkNotNullParameter(list8, "mondayTimeRange");
        List<C38147b> list9 = list2;
        Intrinsics.checkNotNullParameter(list9, "tuesayTimeRange");
        List<C38147b> list10 = list3;
        Intrinsics.checkNotNullParameter(list10, "wednesdayTimeRange");
        List<C38147b> list11 = list4;
        Intrinsics.checkNotNullParameter(list11, "thursdayTimeRange");
        List<C38147b> list12 = list5;
        Intrinsics.checkNotNullParameter(list12, "fridayTimeRange");
        List<C38147b> list13 = list6;
        Intrinsics.checkNotNullParameter(list13, "saturdayTimeRange");
        List<C38147b> list14 = list7;
        Intrinsics.checkNotNullParameter(list14, "sundayTimeRange");
        return new C38157h(i, str, str2, list8, list9, list10, list11, list12, list13, list14);
    }

    @C12579k
    /* renamed from: n */
    public final String mo119321n() {
        return this.f96650b;
    }

    @C12579k
    /* renamed from: o */
    public final String mo119322o() {
        return this.f96651c;
    }

    @C12579k
    /* renamed from: p */
    public final List<C38147b> mo119323p() {
        return this.f96656h;
    }

    @C12579k
    /* renamed from: q */
    public final List<C38147b> mo119324q() {
        return this.f96652d;
    }

    /* renamed from: r */
    public final int mo119325r() {
        return this.f96649a;
    }

    @C12579k
    /* renamed from: s */
    public final List<C38147b> mo119326s() {
        return this.f96657i;
    }

    @C12579k
    /* renamed from: t */
    public final List<C38147b> mo119327t() {
        return this.f96658j;
    }

    @C12579k
    public String toString() {
        int i = this.f96649a;
        String str = this.f96650b;
        String str2 = this.f96651c;
        List<C38147b> list = this.f96652d;
        List<C38147b> list2 = this.f96653e;
        List<C38147b> list3 = this.f96654f;
        List<C38147b> list4 = this.f96655g;
        List<C38147b> list5 = this.f96656h;
        List<C38147b> list6 = this.f96657i;
        List<C38147b> list7 = this.f96658j;
        return "OpeningPattern(patternId=" + i + ", beginDate=" + str + ", endDate=" + str2 + ", mondayTimeRange=" + list + ", tuesayTimeRange=" + list2 + ", wednesdayTimeRange=" + list3 + ", thursdayTimeRange=" + list4 + ", fridayTimeRange=" + list5 + ", saturdayTimeRange=" + list6 + ", sundayTimeRange=" + list7 + ")";
    }

    @C12579k
    /* renamed from: u */
    public final List<C38147b> mo119329u() {
        return this.f96655g;
    }

    @C12579k
    /* renamed from: v */
    public final List<C38147b> mo119330v() {
        return this.f96653e;
    }

    @C12579k
    /* renamed from: w */
    public final List<C38147b> mo119331w() {
        return this.f96654f;
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ C38157h(int i, int i2, String str, String str2, List list, List list2, List list3, List list4, List list5, List list6, List list7, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, C38158a.f96659a.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.f96649a = 0;
        } else {
            this.f96649a = i2;
        }
        if ((i & 2) == 0) {
            this.f96650b = "";
        } else {
            this.f96650b = str;
        }
        if ((i & 4) == 0) {
            this.f96651c = "";
        } else {
            this.f96651c = str2;
        }
        if ((i & 8) == 0) {
            this.f96652d = CollectionsKt__CollectionsKt.m40441E();
        } else {
            this.f96652d = list;
        }
        if ((i & 16) == 0) {
            this.f96653e = CollectionsKt__CollectionsKt.m40441E();
        } else {
            this.f96653e = list2;
        }
        if ((i & 32) == 0) {
            this.f96654f = CollectionsKt__CollectionsKt.m40441E();
        } else {
            this.f96654f = list3;
        }
        if ((i & 64) == 0) {
            this.f96655g = CollectionsKt__CollectionsKt.m40441E();
        } else {
            this.f96655g = list4;
        }
        if ((i & 128) == 0) {
            this.f96656h = CollectionsKt__CollectionsKt.m40441E();
        } else {
            this.f96656h = list5;
        }
        if ((i & 256) == 0) {
            this.f96657i = CollectionsKt__CollectionsKt.m40441E();
        } else {
            this.f96657i = list6;
        }
        if ((i & 512) == 0) {
            this.f96658j = CollectionsKt__CollectionsKt.m40441E();
        } else {
            this.f96658j = list7;
        }
    }

    public C38157h(int i, @C12579k String str, @C12579k String str2, @C12579k List<C38147b> list, @C12579k List<C38147b> list2, @C12579k List<C38147b> list3, @C12579k List<C38147b> list4, @C12579k List<C38147b> list5, @C12579k List<C38147b> list6, @C12579k List<C38147b> list7) {
        Intrinsics.checkNotNullParameter(str, "beginDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        Intrinsics.checkNotNullParameter(list, "mondayTimeRange");
        Intrinsics.checkNotNullParameter(list2, "tuesayTimeRange");
        Intrinsics.checkNotNullParameter(list3, "wednesdayTimeRange");
        Intrinsics.checkNotNullParameter(list4, "thursdayTimeRange");
        Intrinsics.checkNotNullParameter(list5, "fridayTimeRange");
        Intrinsics.checkNotNullParameter(list6, "saturdayTimeRange");
        Intrinsics.checkNotNullParameter(list7, "sundayTimeRange");
        this.f96649a = i;
        this.f96650b = str;
        this.f96651c = str2;
        this.f96652d = list;
        this.f96653e = list2;
        this.f96654f = list3;
        this.f96655g = list4;
        this.f96656h = list5;
        this.f96657i = list6;
        this.f96658j = list7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38157h(int r11, java.lang.String r12, java.lang.String r13, java.util.List r14, java.util.List r15, java.util.List r16, java.util.List r17, java.util.List r18, java.util.List r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r10 = this;
            r0 = r21
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x0009
        L_0x0008:
            r1 = r11
        L_0x0009:
            r2 = r0 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r12
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r3 = r13
        L_0x0018:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0021
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0022
        L_0x0021:
            r4 = r14
        L_0x0022:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x002b
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x002c
        L_0x002b:
            r5 = r15
        L_0x002c:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0035
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0037
        L_0x0035:
            r6 = r16
        L_0x0037:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0040
            java.util.List r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0042
        L_0x0040:
            r7 = r17
        L_0x0042:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x004b
            java.util.List r8 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x004d
        L_0x004b:
            r8 = r18
        L_0x004d:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0056
            java.util.List r9 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0058
        L_0x0056:
            r9 = r19
        L_0x0058:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0061
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0063
        L_0x0061:
            r0 = r20
        L_0x0063:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.service.models.C38157h.<init>(int, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
