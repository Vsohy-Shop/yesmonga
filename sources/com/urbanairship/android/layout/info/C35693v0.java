package com.urbanairship.android.layout.info;

import com.urbanairship.json.C9329d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.v0 */
public final class C35693v0 {
    @C12579k

    /* renamed from: a */
    public final C9329d f88205a;

    /* renamed from: b */
    public final boolean f88206b;

    public C35693v0(@C12579k C9329d dVar, boolean z) {
        Intrinsics.checkNotNullParameter(dVar, "invertWhenStateMatcher");
        this.f88205a = dVar;
        this.f88206b = z;
    }

    /* renamed from: d */
    public static /* synthetic */ C35693v0 m147173d(C35693v0 v0Var, C9329d dVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = v0Var.f88205a;
        }
        if ((i & 2) != 0) {
            z = v0Var.f88206b;
        }
        return v0Var.mo106841c(dVar, z);
    }

    @C12579k
    /* renamed from: a */
    public final C9329d mo106839a() {
        return this.f88205a;
    }

    /* renamed from: b */
    public final boolean mo106840b() {
        return this.f88206b;
    }

    @C12579k
    /* renamed from: c */
    public final C35693v0 mo106841c(@C12579k C9329d dVar, boolean z) {
        Intrinsics.checkNotNullParameter(dVar, "invertWhenStateMatcher");
        return new C35693v0(dVar, z);
    }

    /* renamed from: e */
    public final boolean mo106842e() {
        return this.f88206b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35693v0)) {
            return false;
        }
        C35693v0 v0Var = (C35693v0) obj;
        return Intrinsics.areEqual((Object) this.f88205a, (Object) v0Var.f88205a) && this.f88206b == v0Var.f88206b;
    }

    @C12579k
    /* renamed from: f */
    public final C9329d mo106844f() {
        return this.f88205a;
    }

    public int hashCode() {
        int hashCode = this.f88205a.hashCode() * 31;
        boolean z = this.f88206b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        return "VisibilityInfo(invertWhenStateMatcher=" + this.f88205a + ", default=" + this.f88206b + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35693v0(@org.jetbrains.annotations.C12579k com.urbanairship.json.C9323b r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "invert_when_state_matches"
            com.urbanairship.json.JsonValue r2 = r0.mo18812k(r1)
            java.lang.String r3 = "Missing required field: '"
            if (r2 == 0) goto L_0x0220
            java.lang.String r5 = "get(key) ?: throw JsonEx… required field: '$key'\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.Class<com.urbanairship.json.JsonValue> r6 = com.urbanairship.json.JsonValue.class
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            java.lang.String r10 = "' for field '"
            java.lang.String r11 = "Invalid type '"
            java.lang.Class<com.urbanairship.json.b> r12 = com.urbanairship.json.C9323b.class
            java.lang.Class<com.urbanairship.json.a> r13 = com.urbanairship.json.C9322a.class
            java.lang.Class<java.lang.Integer> r15 = java.lang.Integer.class
            r16 = r5
            r4 = 0
            r14 = 0
            if (r9 == 0) goto L_0x003f
            java.lang.String r1 = r2.mo18750B()
            com.urbanairship.json.JsonValue r1 = (com.urbanairship.json.JsonValue) r1
            goto L_0x00cc
        L_0x003f:
            java.lang.Class r9 = java.lang.Boolean.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0057
            boolean r1 = r2.mo18757c(r14)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.urbanairship.json.JsonValue r1 = (com.urbanairship.json.JsonValue) r1
            goto L_0x00cc
        L_0x0057:
            java.lang.Class r9 = java.lang.Long.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x006e
            long r1 = r2.mo18766i(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.urbanairship.json.JsonValue r1 = (com.urbanairship.json.JsonValue) r1
            goto L_0x00cc
        L_0x006e:
            java.lang.Class r9 = java.lang.Double.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0087
            r4 = 0
            double r1 = r2.mo18758d(r4)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            com.urbanairship.json.JsonValue r1 = (com.urbanairship.json.JsonValue) r1
            goto L_0x00cc
        L_0x0087:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x009c
            int r1 = r2.mo18762f(r14)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.urbanairship.json.JsonValue r1 = (com.urbanairship.json.JsonValue) r1
            goto L_0x00cc
        L_0x009c:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x00ad
            com.urbanairship.json.a r1 = r2.mo18784z()
            com.urbanairship.json.JsonValue r1 = (com.urbanairship.json.JsonValue) r1
            goto L_0x00cc
        L_0x00ad:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x00be
            com.urbanairship.json.b r1 = r2.mo18749A()
            com.urbanairship.json.JsonValue r1 = (com.urbanairship.json.JsonValue) r1
            goto L_0x00cc
        L_0x00be:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x01fa
            com.urbanairship.json.JsonValue r1 = r2.mo17264q()
        L_0x00cc:
            com.urbanairship.json.d r1 = com.urbanairship.json.C9329d.m35055d(r1)
            java.lang.String r2 = "parse(\n            json.…ert_when_state_matches\"))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = "default"
            com.urbanairship.json.JsonValue r0 = r0.mo18812k(r2)
            if (r0 == 0) goto L_0x01de
            r4 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r3)
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Boolean"
            if (r5 == 0) goto L_0x0104
            java.lang.String r0 = r0.mo18750B()
            if (r0 == 0) goto L_0x00fe
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x01a6
        L_0x00fe:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x0104:
            java.lang.Class r5 = java.lang.Boolean.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x011a
            boolean r0 = r0.mo18757c(r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x01a6
        L_0x011a:
            java.lang.Class r5 = java.lang.Long.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0134
            r8 = 0
            long r2 = r0.mo18766i(r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x01a6
        L_0x0134:
            java.lang.Class r5 = java.lang.Double.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x014d
            r8 = 0
            double r2 = r0.mo18758d(r8)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x01a6
        L_0x014d:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0162
            int r0 = r0.mo18762f(r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x01a6
        L_0x0162:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x017b
            com.urbanairship.json.a r0 = r0.mo18784z()
            if (r0 == 0) goto L_0x0175
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x01a6
        L_0x0175:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x017b:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0194
            com.urbanairship.json.b r0 = r0.mo18749A()
            if (r0 == 0) goto L_0x018e
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x01a6
        L_0x018e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x0194:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x01b8
            com.urbanairship.json.JsonValue r0 = r0.mo17264q()
            if (r0 == 0) goto L_0x01b0
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L_0x01a6:
            boolean r0 = r0.booleanValue()
            r4 = r17
            r4.<init>(r1, r0)
            return
        L_0x01b0:
            r4 = r17
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x01b8:
            r4 = r17
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            r1.append(r10)
            r1.append(r2)
            r5 = 39
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01de:
            r4 = r17
            r5 = 39
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01fa:
            r4 = r17
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r3 = r6.getSimpleName()
            r2.append(r3)
            r2.append(r10)
            r2.append(r1)
            r5 = 39
            r2.append(r5)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0220:
            r4 = r17
            r5 = 39
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.info.C35693v0.<init>(com.urbanairship.json.b):void");
    }
}
