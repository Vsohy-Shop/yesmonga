package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.property.C35840k;
import com.urbanairship.android.layout.property.Size;
import com.urbanairship.json.C9323b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.z */
public final class C35698z extends C35689u {
    @C12579k

    /* renamed from: c */
    public final C9323b f88221c;
    @C12579k

    /* renamed from: d */
    public final Size f88222d;
    @C12580l

    /* renamed from: e */
    public final C35840k f88223e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35698z(@org.jetbrains.annotations.C12579k com.urbanairship.json.C9323b r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.urbanairship.android.layout.info.t0$a r2 = com.urbanairship.android.layout.info.C35686t0.f88201a
            java.lang.String r3 = "view"
            com.urbanairship.json.JsonValue r4 = r1.mo18812k(r3)
            java.lang.String r5 = "Missing required field: '"
            if (r4 == 0) goto L_0x0347
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
            r6 = 0
            java.lang.String r7 = "null cannot be cast to non-null type com.urbanairship.json.JsonMap"
            if (r11 == 0) goto L_0x004a
            java.lang.String r3 = r4.mo18750B()
            if (r3 == 0) goto L_0x0044
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x0060
        L_0x0044:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r7)
            throw r1
        L_0x004a:
            java.lang.Class r11 = java.lang.Boolean.TYPE
            kotlin.reflect.d r11 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)
            if (r11 == 0) goto L_0x0063
            boolean r3 = r4.mo18757c(r6)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
        L_0x0060:
            r11 = r7
            goto L_0x00f0
        L_0x0063:
            java.lang.Class r11 = java.lang.Long.TYPE
            kotlin.reflect.d r11 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)
            if (r11 == 0) goto L_0x007e
            r11 = r7
            r6 = 0
            long r3 = r4.mo18766i(r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00f0
        L_0x007e:
            r11 = r7
            java.lang.Class r6 = java.lang.Double.TYPE
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0098
            r6 = 0
            double r3 = r4.mo18758d(r6)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00f0
        L_0x0098:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x00ae
            r6 = 0
            int r3 = r4.mo18762f(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00f0
        L_0x00ae:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x00c7
            com.urbanairship.json.a r3 = r4.mo18784z()
            if (r3 == 0) goto L_0x00c1
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00f0
        L_0x00c1:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x00c7:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x00de
            com.urbanairship.json.b r3 = r4.mo18749A()
            if (r3 == 0) goto L_0x00d8
            goto L_0x00f0
        L_0x00d8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x00de:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0323
            com.urbanairship.json.JsonValue r3 = r4.mo17264q()
            if (r3 == 0) goto L_0x031d
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
        L_0x00f0:
            com.urbanairship.android.layout.info.t0 r2 = r2.mo106835a(r3)
            r3 = 0
            r0.<init>(r2, r3)
            r0.f88221c = r1
            java.lang.String r2 = "size"
            com.urbanairship.json.JsonValue r4 = r1.mo18812k(r2)
            if (r4 == 0) goto L_0x0303
            r6 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0125
            java.lang.String r2 = r4.mo18750B()
            if (r2 == 0) goto L_0x011f
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01c9
        L_0x011f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x0125:
            java.lang.Class r6 = java.lang.Boolean.TYPE
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x013e
            r6 = 0
            boolean r2 = r4.mo18757c(r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01c9
        L_0x013e:
            java.lang.Class r6 = java.lang.Long.TYPE
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0158
            r6 = 0
            long r4 = r4.mo18766i(r6)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01c9
        L_0x0158:
            java.lang.Class r6 = java.lang.Double.TYPE
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0171
            r6 = 0
            double r4 = r4.mo18758d(r6)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01c9
        L_0x0171:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0187
            r6 = 0
            int r2 = r4.mo18762f(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01c9
        L_0x0187:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x01a0
            com.urbanairship.json.a r2 = r4.mo18784z()
            if (r2 == 0) goto L_0x019a
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01c9
        L_0x019a:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x01a0:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x01b7
            com.urbanairship.json.b r2 = r4.mo18749A()
            if (r2 == 0) goto L_0x01b1
            goto L_0x01c9
        L_0x01b1:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x01b7:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x02df
            com.urbanairship.json.JsonValue r2 = r4.mo17264q()
            if (r2 == 0) goto L_0x02d9
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
        L_0x01c9:
            com.urbanairship.android.layout.property.Size r2 = com.urbanairship.android.layout.property.Size.m147685a(r2)
            java.lang.String r4 = "fromJson(json.requireField(\"size\"))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r0.f88222d = r2
            java.lang.String r2 = "margin"
            com.urbanairship.json.JsonValue r1 = r1.mo18812k(r2)
            if (r1 != 0) goto L_0x01df
            r1 = r3
            goto L_0x02a6
        L_0x01df:
            java.lang.String r4 = "get(key) ?: return null"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0202
            java.lang.String r1 = r1.mo18750B()
            if (r1 == 0) goto L_0x01fc
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x02a6
        L_0x01fc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x0202:
            java.lang.Class r5 = java.lang.Boolean.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x021b
            r5 = 0
            boolean r1 = r1.mo18757c(r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x02a6
        L_0x021b:
            java.lang.Class r5 = java.lang.Long.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0235
            r5 = 0
            long r1 = r1.mo18766i(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x02a6
        L_0x0235:
            java.lang.Class r5 = java.lang.Double.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x024e
            r5 = 0
            double r1 = r1.mo18758d(r5)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x02a6
        L_0x024e:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0264
            r5 = 0
            int r1 = r1.mo18762f(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x02a6
        L_0x0264:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x027d
            com.urbanairship.json.a r1 = r1.mo18784z()
            if (r1 == 0) goto L_0x0277
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x02a6
        L_0x0277:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x027d:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0294
            com.urbanairship.json.b r1 = r1.mo18749A()
            if (r1 == 0) goto L_0x028e
            goto L_0x02a6
        L_0x028e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x0294:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x02b5
            com.urbanairship.json.JsonValue r1 = r1.mo17264q()
            if (r1 == 0) goto L_0x02af
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
        L_0x02a6:
            if (r1 == 0) goto L_0x02ac
            com.urbanairship.android.layout.property.k r3 = com.urbanairship.android.layout.property.C35840k.m147768a(r1)
        L_0x02ac:
            r0.f88223e = r3
            return
        L_0x02af:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x02b5:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            java.lang.String r4 = r8.getSimpleName()
            r3.append(r4)
            r3.append(r12)
            r3.append(r2)
            r2 = 39
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x02d9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x02df:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            java.lang.String r4 = r8.getSimpleName()
            r3.append(r4)
            r3.append(r12)
            r3.append(r2)
            r4 = 39
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0303:
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
        L_0x031d:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x0323:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            java.lang.String r4 = r8.getSimpleName()
            r2.append(r4)
            r2.append(r12)
            r2.append(r3)
            r4 = 39
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0347:
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
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.info.C35698z.<init>(com.urbanairship.json.b):void");
    }

    @C12579k
    /* renamed from: i */
    public final C9323b mo106863i() {
        return this.f88221c;
    }

    @C12580l
    /* renamed from: j */
    public final C35840k mo106864j() {
        return this.f88223e;
    }

    @C12579k
    /* renamed from: k */
    public final Size mo106865k() {
        return this.f88222d;
    }
}
