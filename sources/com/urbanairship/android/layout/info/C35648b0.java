package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.info.C35689u;
import java.util.List;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.info.b0 */
public final class C35648b0 extends C35679q {
    @C12579k

    /* renamed from: f */
    public final C35686t0 f88108f;
    @C12579k

    /* renamed from: g */
    public final List<C35689u.C35690a> f88109g;
    @C12579k

    /* renamed from: h */
    public final String f88110h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35648b0(@org.jetbrains.annotations.C12579k com.urbanairship.json.C9323b r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r18.<init>(r19)
            com.urbanairship.android.layout.info.t0$a r2 = com.urbanairship.android.layout.info.C35686t0.f88201a
            java.lang.String r3 = "view"
            com.urbanairship.json.JsonValue r4 = r1.mo18812k(r3)
            java.lang.String r5 = "Missing required field: '"
            if (r4 == 0) goto L_0x024a
            java.lang.String r7 = "get(key) ?: throw JsonEx… required field: '$key'\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)
            java.lang.Class<com.urbanairship.json.b> r8 = com.urbanairship.json.C9323b.class
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            kotlin.reflect.d r11 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)
            java.lang.String r12 = "' for field '"
            java.lang.String r13 = "Invalid type '"
            java.lang.Class<com.urbanairship.json.JsonValue> r14 = com.urbanairship.json.JsonValue.class
            java.lang.Class<com.urbanairship.json.a> r15 = com.urbanairship.json.C9322a.class
            r16 = r7
            java.lang.Class<java.lang.Integer> r17 = java.lang.Integer.class
            java.lang.String r6 = "null cannot be cast to non-null type com.urbanairship.json.JsonMap"
            r7 = 0
            if (r11 == 0) goto L_0x004d
            java.lang.String r3 = r4.mo18750B()
            if (r3 == 0) goto L_0x0047
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x0063
        L_0x0047:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x004d:
            java.lang.Class r11 = java.lang.Boolean.TYPE
            kotlin.reflect.d r11 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)
            if (r11 == 0) goto L_0x0066
            boolean r3 = r4.mo18757c(r7)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
        L_0x0063:
            r11 = r8
            goto L_0x00f3
        L_0x0066:
            java.lang.Class r11 = java.lang.Long.TYPE
            kotlin.reflect.d r11 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)
            if (r11 == 0) goto L_0x0081
            r11 = r8
            r7 = 0
            long r3 = r4.mo18766i(r7)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00f3
        L_0x0081:
            r11 = r8
            java.lang.Class r7 = java.lang.Double.TYPE
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x009b
            r7 = 0
            double r3 = r4.mo18758d(r7)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00f3
        L_0x009b:
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x00b1
            r7 = 0
            int r3 = r4.mo18762f(r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00f3
        L_0x00b1:
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x00ca
            com.urbanairship.json.a r3 = r4.mo18784z()
            if (r3 == 0) goto L_0x00c4
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00f3
        L_0x00c4:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x00ca:
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x00e1
            com.urbanairship.json.b r3 = r4.mo18749A()
            if (r3 == 0) goto L_0x00db
            goto L_0x00f3
        L_0x00db:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x00e1:
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0226
            com.urbanairship.json.JsonValue r3 = r4.mo17264q()
            if (r3 == 0) goto L_0x0220
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
        L_0x00f3:
            com.urbanairship.android.layout.info.t0 r2 = r2.mo106835a(r3)
            r0.f88108f = r2
            com.urbanairship.android.layout.info.u$a r2 = new com.urbanairship.android.layout.info.u$a
            com.urbanairship.android.layout.info.t0 r3 = r18.getView()
            r2.<init>(r3)
            java.util.List r2 = kotlin.collections.C10976s.m41419k(r2)
            r0.f88109g = r2
            java.lang.String r2 = "nps_identifier"
            com.urbanairship.json.JsonValue r1 = r1.mo18812k(r2)
            if (r1 == 0) goto L_0x0206
            r3 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            kotlin.reflect.d r3 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            if (r4 == 0) goto L_0x0133
            java.lang.String r1 = r1.mo18750B()
            if (r1 == 0) goto L_0x012d
            goto L_0x01d9
        L_0x012d:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x0133:
            java.lang.Class r4 = java.lang.Boolean.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x014c
            r4 = 0
            boolean r1 = r1.mo18757c(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01d9
        L_0x014c:
            java.lang.Class r4 = java.lang.Long.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0166
            r6 = 0
            long r1 = r1.mo18766i(r6)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01d9
        L_0x0166:
            java.lang.Class r4 = java.lang.Double.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x017f
            r6 = 0
            double r1 = r1.mo18758d(r6)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01d9
        L_0x017f:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0195
            r4 = 0
            int r1 = r1.mo18762f(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01d9
        L_0x0195:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x01ae
            com.urbanairship.json.a r1 = r1.mo18784z()
            if (r1 == 0) goto L_0x01a8
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01d9
        L_0x01a8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x01ae:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x01c7
            com.urbanairship.json.b r1 = r1.mo18749A()
            if (r1 == 0) goto L_0x01c1
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01d9
        L_0x01c1:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x01c7:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x01e2
            com.urbanairship.json.JsonValue r1 = r1.mo17264q()
            if (r1 == 0) goto L_0x01dc
            java.lang.String r1 = (java.lang.String) r1
        L_0x01d9:
            r0.f88110h = r1
            return
        L_0x01dc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x01e2:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            java.lang.String r4 = r10.getSimpleName()
            r3.append(r4)
            r3.append(r12)
            r3.append(r2)
            r4 = 39
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0206:
            r4 = 39
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0220:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x0226:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            java.lang.String r4 = r11.getSimpleName()
            r2.append(r4)
            r2.append(r12)
            r2.append(r3)
            r4 = 39
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x024a:
            r4 = 39
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.info.C35648b0.<init>(com.urbanairship.json.b):void");
    }

    @C12579k
    public C35686t0 getView() {
        return this.f88108f;
    }

    @C12579k
    /* renamed from: k */
    public List<C35689u.C35690a> mo106789k() {
        return this.f88109g;
    }

    @C12579k
    /* renamed from: l */
    public final String mo106790l() {
        return this.f88110h;
    }
}
