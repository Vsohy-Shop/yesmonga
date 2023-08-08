package com.urbanairship.android.layout.info;

import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.C35573b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.x */
public final class C35696x {

    /* renamed from: a */
    public final int f88213a;
    @C12579k

    /* renamed from: b */
    public final C35573b f88214b;
    @C12579k

    /* renamed from: c */
    public final C35686t0 f88215c;

    public C35696x(int i, @C12579k C35573b bVar, @C12579k C35686t0 t0Var) {
        Intrinsics.checkNotNullParameter(bVar, "presentation");
        Intrinsics.checkNotNullParameter(t0Var, C40383c.f102945c);
        this.f88213a = i;
        this.f88214b = bVar;
        this.f88215c = t0Var;
    }

    /* renamed from: e */
    public static /* synthetic */ C35696x m147188e(C35696x xVar, int i, C35573b bVar, C35686t0 t0Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = xVar.f88213a;
        }
        if ((i2 & 2) != 0) {
            bVar = xVar.f88214b;
        }
        if ((i2 & 4) != 0) {
            t0Var = xVar.f88215c;
        }
        return xVar.mo106853d(i, bVar, t0Var);
    }

    /* renamed from: a */
    public final int mo106850a() {
        return this.f88213a;
    }

    @C12579k
    /* renamed from: b */
    public final C35573b mo106851b() {
        return this.f88214b;
    }

    @C12579k
    /* renamed from: c */
    public final C35686t0 mo106852c() {
        return this.f88215c;
    }

    @C12579k
    /* renamed from: d */
    public final C35696x mo106853d(int i, @C12579k C35573b bVar, @C12579k C35686t0 t0Var) {
        Intrinsics.checkNotNullParameter(bVar, "presentation");
        Intrinsics.checkNotNullParameter(t0Var, C40383c.f102945c);
        return new C35696x(i, bVar, t0Var);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35696x)) {
            return false;
        }
        C35696x xVar = (C35696x) obj;
        return this.f88213a == xVar.f88213a && Intrinsics.areEqual((Object) this.f88214b, (Object) xVar.f88214b) && Intrinsics.areEqual((Object) this.f88215c, (Object) xVar.f88215c);
    }

    @C12579k
    /* renamed from: f */
    public final C35573b mo106855f() {
        return this.f88214b;
    }

    /* renamed from: g */
    public final int mo106856g() {
        return this.f88213a;
    }

    @C12579k
    /* renamed from: h */
    public final C35686t0 mo106857h() {
        return this.f88215c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f88213a) * 31) + this.f88214b.hashCode()) * 31) + this.f88215c.hashCode();
    }

    @C12579k
    public String toString() {
        return "LayoutInfo(version=" + this.f88213a + ", presentation=" + this.f88214b + ", view=" + this.f88215c + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35696x(@org.jetbrains.annotations.C12579k com.urbanairship.json.C9323b r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "version"
            com.urbanairship.json.JsonValue r2 = r0.mo18812k(r1)
            java.lang.String r3 = "Missing required field: '"
            if (r2 == 0) goto L_0x0365
            java.lang.String r5 = "get(key) ?: throw JsonEx… required field: '$key'\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            java.lang.String r10 = "' for field '"
            java.lang.String r11 = "Invalid type '"
            java.lang.Class<com.urbanairship.json.JsonValue> r12 = com.urbanairship.json.JsonValue.class
            java.lang.Class<com.urbanairship.json.a> r13 = com.urbanairship.json.C9322a.class
            r16 = r5
            r4 = 0
            java.lang.String r14 = "null cannot be cast to non-null type kotlin.Int"
            r15 = 0
            java.lang.Class<com.urbanairship.json.b> r17 = com.urbanairship.json.C9323b.class
            if (r9 == 0) goto L_0x0049
            java.lang.String r1 = r2.mo18750B()
            if (r1 == 0) goto L_0x0043
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x00e9
        L_0x0043:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x0049:
            java.lang.Class r9 = java.lang.Boolean.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0061
            boolean r1 = r2.mo18757c(r15)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x00e9
        L_0x0061:
            java.lang.Class r9 = java.lang.Long.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0079
            long r1 = r2.mo18766i(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x00e9
        L_0x0079:
            java.lang.Class r9 = java.lang.Double.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0092
            r4 = 0
            double r1 = r2.mo18758d(r4)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x00e9
        L_0x0092:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x00a5
            int r1 = r2.mo18762f(r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00e9
        L_0x00a5:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x00be
            com.urbanairship.json.a r1 = r2.mo18784z()
            if (r1 == 0) goto L_0x00b8
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x00e9
        L_0x00b8:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x00be:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x00d7
            com.urbanairship.json.b r1 = r2.mo18749A()
            if (r1 == 0) goto L_0x00d1
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x00e9
        L_0x00d1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x00d7:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x033f
            com.urbanairship.json.JsonValue r1 = r2.mo17264q()
            if (r1 == 0) goto L_0x0337
            java.lang.Integer r1 = (java.lang.Integer) r1
        L_0x00e9:
            int r1 = r1.intValue()
            java.lang.String r2 = "presentation"
            com.urbanairship.json.JsonValue r4 = r0.mo18812k(r2)
            if (r4 == 0) goto L_0x031a
            r5 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            java.lang.String r14 = "null cannot be cast to non-null type com.urbanairship.json.JsonMap"
            if (r9 == 0) goto L_0x0119
            java.lang.String r2 = r4.mo18750B()
            if (r2 == 0) goto L_0x0113
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x012f
        L_0x0113:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x0119:
            java.lang.Class r9 = java.lang.Boolean.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0132
            boolean r2 = r4.mo18757c(r15)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
        L_0x012f:
            r9 = r3
            goto L_0x01c0
        L_0x0132:
            java.lang.Class r9 = java.lang.Long.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x014d
            r9 = r3
            r2 = 0
            long r18 = r4.mo18766i(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r18)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01c0
        L_0x014d:
            r16 = r2
            r9 = r3
            java.lang.Class r2 = java.lang.Double.TYPE
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r2)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0169
            r2 = 0
            double r18 = r4.mo18758d(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r18)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01c0
        L_0x0169:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x017e
            int r2 = r4.mo18762f(r15)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01c0
        L_0x017e:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0197
            com.urbanairship.json.a r2 = r4.mo18784z()
            if (r2 == 0) goto L_0x0191
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01c0
        L_0x0191:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x0197:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x01ae
            com.urbanairship.json.b r2 = r4.mo18749A()
            if (r2 == 0) goto L_0x01a8
            goto L_0x01c0
        L_0x01a8:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x01ae:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x02f2
            com.urbanairship.json.JsonValue r2 = r4.mo17264q()
            if (r2 == 0) goto L_0x02ea
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
        L_0x01c0:
            com.urbanairship.android.layout.b r2 = com.urbanairship.android.layout.C35573b.m146835a(r2)
            java.lang.String r3 = "fromJson(json.requireField(\"presentation\"))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.urbanairship.android.layout.info.t0$a r3 = com.urbanairship.android.layout.info.C35686t0.f88201a
            java.lang.String r4 = "view"
            com.urbanairship.json.JsonValue r0 = r0.mo18812k(r4)
            if (r0 == 0) goto L_0x02ce
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x01f4
            java.lang.String r0 = r0.mo18750B()
            if (r0 == 0) goto L_0x01ee
            com.urbanairship.json.b r0 = (com.urbanairship.json.C9323b) r0
            goto L_0x0296
        L_0x01ee:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x01f4:
            java.lang.Class r7 = java.lang.Boolean.TYPE
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x020c
            boolean r0 = r0.mo18757c(r15)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.urbanairship.json.b r0 = (com.urbanairship.json.C9323b) r0
            goto L_0x0296
        L_0x020c:
            java.lang.Class r7 = java.lang.Long.TYPE
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0226
            r7 = 0
            long r4 = r0.mo18766i(r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            com.urbanairship.json.b r0 = (com.urbanairship.json.C9323b) r0
            goto L_0x0296
        L_0x0226:
            java.lang.Class r7 = java.lang.Double.TYPE
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x023f
            r7 = 0
            double r4 = r0.mo18758d(r7)
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            com.urbanairship.json.b r0 = (com.urbanairship.json.C9323b) r0
            goto L_0x0296
        L_0x023f:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0254
            int r0 = r0.mo18762f(r15)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.urbanairship.json.b r0 = (com.urbanairship.json.C9323b) r0
            goto L_0x0296
        L_0x0254:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x026d
            com.urbanairship.json.a r0 = r0.mo18784z()
            if (r0 == 0) goto L_0x0267
            com.urbanairship.json.b r0 = (com.urbanairship.json.C9323b) r0
            goto L_0x0296
        L_0x0267:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x026d:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0284
            com.urbanairship.json.b r0 = r0.mo18749A()
            if (r0 == 0) goto L_0x027e
            goto L_0x0296
        L_0x027e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x0284:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x02a8
            com.urbanairship.json.JsonValue r0 = r0.mo17264q()
            if (r0 == 0) goto L_0x02a0
            com.urbanairship.json.b r0 = (com.urbanairship.json.C9323b) r0
        L_0x0296:
            com.urbanairship.android.layout.info.t0 r0 = r3.mo106835a(r0)
            r3 = r20
            r3.<init>(r1, r2, r0)
            return
        L_0x02a0:
            r3 = r20
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x02a8:
            r3 = r20
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = r17.getSimpleName()
            r1.append(r2)
            r1.append(r10)
            r1.append(r4)
            r2 = 39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02ce:
            r3 = r20
            r2 = 39
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02ea:
            r3 = r20
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x02f2:
            r3 = r20
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = r17.getSimpleName()
            r1.append(r2)
            r1.append(r10)
            r2 = r16
            r1.append(r2)
            r4 = 39
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x031a:
            r9 = r3
            r4 = 39
            r3 = r20
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0337:
            r3 = r20
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x033f:
            r3 = r20
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r4 = r6.getSimpleName()
            r2.append(r4)
            r2.append(r10)
            r2.append(r1)
            r4 = 39
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0365:
            r9 = r3
            r4 = 39
            r3 = r20
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.info.C35696x.<init>(com.urbanairship.json.b):void");
    }
}
