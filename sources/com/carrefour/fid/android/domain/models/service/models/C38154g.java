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
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12439o
/* renamed from: com.carrefour.fid.android.domain.models.service.models.g */
public final class C38154g {
    @C12579k
    public static final C38156b Companion = new C38156b((DefaultConstructorMarker) null);
    @C12579k
    @C11287e

    /* renamed from: f */
    public static final C12248g<Object>[] f96640f = {null, null, null, null, new C12269f(C38147b.C38148a.f96628a)};
    @C12579k

    /* renamed from: a */
    public final String f96641a;
    @C12579k

    /* renamed from: b */
    public final String f96642b;
    @C12579k

    /* renamed from: c */
    public final String f96643c;
    @C12579k

    /* renamed from: d */
    public final String f96644d;
    @C12579k

    /* renamed from: e */
    public final List<C38147b> f96645e;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    /* renamed from: com.carrefour.fid.android.domain.models.service.models.g$a */
    public static final class C38155a implements C12327y<C38154g> {
        @C12579k

        /* renamed from: a */
        public static final C38155a f96646a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f96647b;

        static {
            C38155a aVar = new C38155a();
            f96646a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.domain.models.service.models.OpeningExceptionalPattern", aVar, 5);
            pluginGeneratedSerialDescriptor.mo24966k("description", true);
            pluginGeneratedSerialDescriptor.mo24966k("statusCode", true);
            pluginGeneratedSerialDescriptor.mo24966k("typeCode", true);
            pluginGeneratedSerialDescriptor.mo24966k("date", true);
            pluginGeneratedSerialDescriptor.mo24966k("dayTimeRange", true);
            f96647b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.carrefour.fid.android.domain.models.service.models.C38154g deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r17) {
            /*
                r16 = this;
                r0 = r17
                java.lang.String r1 = "decoder"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                kotlinx.serialization.descriptors.f r1 = r16.getDescriptor()
                kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
                kotlinx.serialization.g[] r2 = com.carrefour.fid.android.domain.models.service.models.C38154g.f96640f
                boolean r3 = r0.mo24886p()
                r4 = 3
                r5 = 2
                r6 = 4
                r7 = 1
                r8 = 0
                r9 = 0
                if (r3 == 0) goto L_0x003d
                java.lang.String r3 = r0.mo24884m(r1, r8)
                java.lang.String r7 = r0.mo24884m(r1, r7)
                java.lang.String r5 = r0.mo24884m(r1, r5)
                java.lang.String r4 = r0.mo24884m(r1, r4)
                r2 = r2[r6]
                java.lang.Object r2 = r0.mo24895y(r1, r6, r2, r9)
                r6 = 31
                r8 = r4
                r4 = r6
                r6 = r7
                r7 = r5
                r5 = r3
                goto L_0x008c
            L_0x003d:
                r14 = r7
                r3 = r8
                r10 = r9
                r11 = r10
                r12 = r11
                r13 = r12
            L_0x0043:
                if (r14 == 0) goto L_0x0086
                int r15 = r0.mo24931o(r1)
                r8 = -1
                if (r15 == r8) goto L_0x0083
                if (r15 == 0) goto L_0x007b
                if (r15 == r7) goto L_0x0073
                if (r15 == r5) goto L_0x006c
                if (r15 == r4) goto L_0x0065
                if (r15 != r6) goto L_0x005f
                r8 = r2[r6]
                java.lang.Object r13 = r0.mo24895y(r1, r6, r8, r13)
                r3 = r3 | 16
                goto L_0x0079
            L_0x005f:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>((int) r15)
                throw r0
            L_0x0065:
                java.lang.String r12 = r0.mo24884m(r1, r4)
                r3 = r3 | 8
                goto L_0x0079
            L_0x006c:
                java.lang.String r11 = r0.mo24884m(r1, r5)
                r3 = r3 | 4
                goto L_0x0079
            L_0x0073:
                java.lang.String r10 = r0.mo24884m(r1, r7)
                r3 = r3 | 2
            L_0x0079:
                r8 = 0
                goto L_0x0043
            L_0x007b:
                r8 = 0
                java.lang.String r9 = r0.mo24884m(r1, r8)
                r3 = r3 | 1
                goto L_0x0043
            L_0x0083:
                r8 = 0
                r14 = r8
                goto L_0x0043
            L_0x0086:
                r4 = r3
                r5 = r9
                r6 = r10
                r7 = r11
                r8 = r12
                r2 = r13
            L_0x008c:
                r0.mo24876c(r1)
                com.carrefour.fid.android.domain.models.service.models.g r0 = new com.carrefour.fid.android.domain.models.service.models.g
                r9 = r2
                java.util.List r9 = (java.util.List) r9
                r10 = 0
                r3 = r0
                r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.util.List) r9, (kotlinx.serialization.internal.C12295n1) r10)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.service.models.C38154g.C38155a.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.domain.models.service.models.g");
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k C38154g gVar2) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(gVar2, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            C38154g.m158119n(gVar2, b, descriptor);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            C12248g<?>[] a = C38154g.f96640f;
            C12310s1 s1Var = C12310s1.f30117a;
            return new C12248g[]{s1Var, s1Var, s1Var, s1Var, a[4]};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f96647b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.service.models.g$b */
    public static final class C38156b {
        public /* synthetic */ C38156b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<C38154g> serializer() {
            return C38155a.f96646a;
        }

        public C38156b() {
        }
    }

    public C38154g() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: h */
    public static /* synthetic */ C38154g m158118h(C38154g gVar, String str, String str2, String str3, String str4, List<C38147b> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gVar.f96641a;
        }
        if ((i & 2) != 0) {
            str2 = gVar.f96642b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = gVar.f96643c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = gVar.f96644d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = gVar.f96645e;
        }
        return gVar.mo119297g(str, str5, str6, str7, list);
    }

    @C11384m
    /* renamed from: n */
    public static final /* synthetic */ void m158119n(C38154g gVar, C12239d dVar, C12217f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C12248g<Object>[] gVarArr = f96640f;
        boolean z5 = false;
        if (!dVar.mo24897A(fVar, 0) && Intrinsics.areEqual((Object) gVar.f96641a, (Object) "")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            dVar.mo24929z(fVar, 0, gVar.f96641a);
        }
        if (!dVar.mo24897A(fVar, 1) && Intrinsics.areEqual((Object) gVar.f96642b, (Object) "")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            dVar.mo24929z(fVar, 1, gVar.f96642b);
        }
        if (!dVar.mo24897A(fVar, 2) && Intrinsics.areEqual((Object) gVar.f96643c, (Object) "")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            dVar.mo24929z(fVar, 2, gVar.f96643c);
        }
        if (!dVar.mo24897A(fVar, 3) && Intrinsics.areEqual((Object) gVar.f96644d, (Object) "")) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            dVar.mo24929z(fVar, 3, gVar.f96644d);
        }
        if (dVar.mo24897A(fVar, 4) || !Intrinsics.areEqual((Object) gVar.f96645e, (Object) CollectionsKt__CollectionsKt.m40441E())) {
            z5 = true;
        }
        if (z5) {
            dVar.mo24899D(fVar, 4, gVarArr[4], gVar.f96645e);
        }
    }

    @C12579k
    /* renamed from: b */
    public final String mo119291b() {
        return this.f96641a;
    }

    @C12579k
    /* renamed from: c */
    public final String mo119292c() {
        return this.f96642b;
    }

    @C12579k
    /* renamed from: d */
    public final String mo119293d() {
        return this.f96643c;
    }

    @C12579k
    /* renamed from: e */
    public final String mo119294e() {
        return this.f96644d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38154g)) {
            return false;
        }
        C38154g gVar = (C38154g) obj;
        return Intrinsics.areEqual((Object) this.f96641a, (Object) gVar.f96641a) && Intrinsics.areEqual((Object) this.f96642b, (Object) gVar.f96642b) && Intrinsics.areEqual((Object) this.f96643c, (Object) gVar.f96643c) && Intrinsics.areEqual((Object) this.f96644d, (Object) gVar.f96644d) && Intrinsics.areEqual((Object) this.f96645e, (Object) gVar.f96645e);
    }

    @C12579k
    /* renamed from: f */
    public final List<C38147b> mo119296f() {
        return this.f96645e;
    }

    @C12579k
    /* renamed from: g */
    public final C38154g mo119297g(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k List<C38147b> list) {
        Intrinsics.checkNotNullParameter(str, "description");
        Intrinsics.checkNotNullParameter(str2, "statusCode");
        Intrinsics.checkNotNullParameter(str3, "typeCode");
        Intrinsics.checkNotNullParameter(str4, "date");
        Intrinsics.checkNotNullParameter(list, "dayTimeRange");
        return new C38154g(str, str2, str3, str4, list);
    }

    public int hashCode() {
        return (((((((this.f96641a.hashCode() * 31) + this.f96642b.hashCode()) * 31) + this.f96643c.hashCode()) * 31) + this.f96644d.hashCode()) * 31) + this.f96645e.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo119299i() {
        return this.f96644d;
    }

    @C12579k
    /* renamed from: j */
    public final List<C38147b> mo119300j() {
        return this.f96645e;
    }

    @C12579k
    /* renamed from: k */
    public final String mo119301k() {
        return this.f96641a;
    }

    @C12579k
    /* renamed from: l */
    public final String mo119302l() {
        return this.f96642b;
    }

    @C12579k
    /* renamed from: m */
    public final String mo119303m() {
        return this.f96643c;
    }

    @C12579k
    public String toString() {
        String str = this.f96641a;
        String str2 = this.f96642b;
        String str3 = this.f96643c;
        String str4 = this.f96644d;
        List<C38147b> list = this.f96645e;
        return "OpeningExceptionalPattern(description=" + str + ", statusCode=" + str2 + ", typeCode=" + str3 + ", date=" + str4 + ", dayTimeRange=" + list + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ C38154g(int i, String str, String str2, String str3, String str4, List list, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, C38155a.f96646a.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.f96641a = "";
        } else {
            this.f96641a = str;
        }
        if ((i & 2) == 0) {
            this.f96642b = "";
        } else {
            this.f96642b = str2;
        }
        if ((i & 4) == 0) {
            this.f96643c = "";
        } else {
            this.f96643c = str3;
        }
        if ((i & 8) == 0) {
            this.f96644d = "";
        } else {
            this.f96644d = str4;
        }
        if ((i & 16) == 0) {
            this.f96645e = CollectionsKt__CollectionsKt.m40441E();
        } else {
            this.f96645e = list;
        }
    }

    public C38154g(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k List<C38147b> list) {
        Intrinsics.checkNotNullParameter(str, "description");
        Intrinsics.checkNotNullParameter(str2, "statusCode");
        Intrinsics.checkNotNullParameter(str3, "typeCode");
        Intrinsics.checkNotNullParameter(str4, "date");
        Intrinsics.checkNotNullParameter(list, "dayTimeRange");
        this.f96641a = str;
        this.f96642b = str2;
        this.f96643c = str3;
        this.f96644d = str4;
        this.f96645e = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38154g(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.List r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0008
            r10 = r0
            goto L_0x0009
        L_0x0008:
            r10 = r4
        L_0x0009:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r5
        L_0x0010:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r6
        L_0x0017:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r7
        L_0x001d:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0025
            java.util.List r8 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0025:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.service.models.C38154g.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
