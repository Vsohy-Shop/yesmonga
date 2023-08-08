package com.urbanairship.android.layout.info;

import com.urbanairship.json.JsonValue;
import java.util.Map;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.f0 */
public final class C35658f0 extends C35689u implements C35681r {

    /* renamed from: c */
    public final /* synthetic */ C35681r f88136c;
    @C12580l

    /* renamed from: d */
    public final Map<String, JsonValue> f88137d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35658f0(@org.jetbrains.annotations.C12579k com.urbanairship.json.C9323b r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.urbanairship.android.layout.info.t0$a r2 = com.urbanairship.android.layout.info.C35686t0.f88201a
            java.lang.String r3 = "view"
            com.urbanairship.json.JsonValue r4 = r1.mo18812k(r3)
            if (r4 == 0) goto L_0x0226
            java.lang.String r6 = "get(key) ?: throw JsonEx… required field: '$key'\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            java.lang.Class<com.urbanairship.json.b> r6 = com.urbanairship.json.C9323b.class
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            java.lang.String r10 = "' for field '"
            java.lang.String r11 = "Invalid type '"
            java.lang.Class<com.urbanairship.json.JsonValue> r12 = com.urbanairship.json.JsonValue.class
            java.lang.Class<com.urbanairship.json.a> r13 = com.urbanairship.json.C9322a.class
            java.lang.Class<java.lang.Integer> r16 = java.lang.Integer.class
            r17 = r6
            r5 = 0
            r14 = 0
            java.lang.String r15 = "null cannot be cast to non-null type com.urbanairship.json.JsonMap"
            if (r9 == 0) goto L_0x004b
            java.lang.String r3 = r4.mo18750B()
            if (r3 == 0) goto L_0x0045
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00eb
        L_0x0045:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r15)
            throw r1
        L_0x004b:
            java.lang.Class r9 = java.lang.Boolean.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0063
            boolean r3 = r4.mo18757c(r14)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00eb
        L_0x0063:
            java.lang.Class r9 = java.lang.Long.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x007b
            long r3 = r4.mo18766i(r5)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00eb
        L_0x007b:
            java.lang.Class r9 = java.lang.Double.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0094
            r5 = 0
            double r3 = r4.mo18758d(r5)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00eb
        L_0x0094:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r16)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00a9
            int r3 = r4.mo18762f(r14)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00eb
        L_0x00a9:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00c2
            com.urbanairship.json.a r3 = r4.mo18784z()
            if (r3 == 0) goto L_0x00bc
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00eb
        L_0x00bc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r15)
            throw r1
        L_0x00c2:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00d9
            com.urbanairship.json.b r3 = r4.mo18749A()
            if (r3 == 0) goto L_0x00d3
            goto L_0x00eb
        L_0x00d3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r15)
            throw r1
        L_0x00d9:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0202
            com.urbanairship.json.JsonValue r3 = r4.mo17264q()
            if (r3 == 0) goto L_0x01fc
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
        L_0x00eb:
            com.urbanairship.android.layout.info.t0 r2 = r2.mo106835a(r3)
            r3 = 0
            r0.<init>(r2, r3)
            com.urbanairship.android.layout.info.r r2 = com.urbanairship.android.layout.info.C35691u0.m147168i(r19)
            r0.f88136c = r2
            java.lang.String r2 = "display_actions"
            com.urbanairship.json.JsonValue r1 = r1.mo18812k(r2)
            if (r1 != 0) goto L_0x0104
            r1 = r3
            goto L_0x01c9
        L_0x0104:
            java.lang.String r4 = "get(key) ?: return null"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0127
            java.lang.String r1 = r1.mo18750B()
            if (r1 == 0) goto L_0x0121
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x01c9
        L_0x0121:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r15)
            throw r1
        L_0x0127:
            java.lang.Class r5 = java.lang.Boolean.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x013f
            boolean r1 = r1.mo18757c(r14)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x01c9
        L_0x013f:
            java.lang.Class r5 = java.lang.Long.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0159
            r5 = 0
            long r1 = r1.mo18766i(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x01c9
        L_0x0159:
            java.lang.Class r5 = java.lang.Double.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0172
            r5 = 0
            double r1 = r1.mo18758d(r5)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x01c9
        L_0x0172:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r16)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0187
            int r1 = r1.mo18762f(r14)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x01c9
        L_0x0187:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x01a0
            com.urbanairship.json.a r1 = r1.mo18784z()
            if (r1 == 0) goto L_0x019a
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x01c9
        L_0x019a:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r15)
            throw r1
        L_0x01a0:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x01b7
            com.urbanairship.json.b r1 = r1.mo18749A()
            if (r1 == 0) goto L_0x01b1
            goto L_0x01c9
        L_0x01b1:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r15)
            throw r1
        L_0x01b7:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x01d8
            com.urbanairship.json.JsonValue r1 = r1.mo17264q()
            if (r1 == 0) goto L_0x01d2
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
        L_0x01c9:
            if (r1 == 0) goto L_0x01cf
            java.util.Map r3 = r1.mo18813r()
        L_0x01cf:
            r0.f88137d = r3
            return
        L_0x01d2:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r15)
            throw r1
        L_0x01d8:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            java.lang.String r4 = r17.getSimpleName()
            r3.append(r4)
            r3.append(r10)
            r3.append(r2)
            r2 = 39
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x01fc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r15)
            throw r1
        L_0x0202:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r4 = r17.getSimpleName()
            r2.append(r4)
            r2.append(r10)
            r2.append(r3)
            r4 = 39
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0226:
            r4 = 39
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Missing required field: '"
            r2.append(r5)
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.info.C35658f0.<init>(com.urbanairship.json.b):void");
    }

    @C12579k
    /* renamed from: a */
    public String mo106791a() {
        return this.f88136c.mo106791a();
    }

    @C12580l
    /* renamed from: b */
    public final Map<String, JsonValue> mo106803b() {
        return this.f88137d;
    }
}
