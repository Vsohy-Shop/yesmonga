package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.property.C35840k;
import com.urbanairship.android.layout.property.C35843n;
import com.urbanairship.android.layout.property.Size;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.k */
public final class C35667k extends C35689u implements C35664i0 {

    /* renamed from: c */
    public final /* synthetic */ C35664i0 f88159c;
    @C12579k

    /* renamed from: d */
    public final C35843n f88160d;
    @C12579k

    /* renamed from: e */
    public final Size f88161e;
    @C12580l

    /* renamed from: f */
    public final C35840k f88162f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35667k(@org.jetbrains.annotations.C12579k com.urbanairship.json.C9323b r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.urbanairship.android.layout.info.t0$a r2 = com.urbanairship.android.layout.info.C35686t0.f88201a
            java.lang.String r3 = "view"
            com.urbanairship.json.JsonValue r4 = r1.mo18812k(r3)
            java.lang.String r5 = "Missing required field: '"
            if (r4 == 0) goto L_0x046e
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
            if (r6 == 0) goto L_0x044a
            com.urbanairship.json.JsonValue r3 = r4.mo17264q()
            if (r3 == 0) goto L_0x0444
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
        L_0x00f0:
            com.urbanairship.android.layout.info.t0 r2 = r2.mo106835a(r3)
            r3 = 0
            r0.<init>(r2, r3)
            com.urbanairship.android.layout.info.i0 r2 = com.urbanairship.android.layout.info.C35691u0.m147169j(r21)
            r0.f88159c = r2
            java.lang.String r2 = "position"
            com.urbanairship.json.JsonValue r4 = r1.mo18812k(r2)
            if (r4 == 0) goto L_0x0429
            r6 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0129
            java.lang.String r2 = r4.mo18750B()
            if (r2 == 0) goto L_0x0123
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01cf
        L_0x0123:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x0129:
            java.lang.Class r9 = java.lang.Boolean.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0142
            r9 = 0
            boolean r2 = r4.mo18757c(r9)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01cf
        L_0x0142:
            java.lang.Class r9 = java.lang.Long.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x015c
            r2 = 0
            long r18 = r4.mo18766i(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r18)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01cf
        L_0x015c:
            r16 = r2
            java.lang.Class r2 = java.lang.Double.TYPE
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r2)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0177
            r2 = 0
            double r18 = r4.mo18758d(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r18)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01cf
        L_0x0177:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x018d
            r2 = 0
            int r3 = r4.mo18762f(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01cf
        L_0x018d:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x01a6
            com.urbanairship.json.a r2 = r4.mo18784z()
            if (r2 == 0) goto L_0x01a0
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x01cf
        L_0x01a0:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x01a6:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x01bd
            com.urbanairship.json.b r2 = r4.mo18749A()
            if (r2 == 0) goto L_0x01b7
            goto L_0x01cf
        L_0x01b7:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x01bd:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0403
            com.urbanairship.json.JsonValue r2 = r4.mo17264q()
            if (r2 == 0) goto L_0x03fd
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
        L_0x01cf:
            com.urbanairship.android.layout.property.n r2 = com.urbanairship.android.layout.property.C35843n.m147785a(r2)
            java.lang.String r3 = "fromJson(json.requireField(\"position\"))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r0.f88160d = r2
            java.lang.String r2 = "size"
            com.urbanairship.json.JsonValue r3 = r1.mo18812k(r2)
            if (r3 == 0) goto L_0x03e3
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0203
            java.lang.String r2 = r3.mo18750B()
            if (r2 == 0) goto L_0x01fd
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x02a7
        L_0x01fd:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x0203:
            java.lang.Class r5 = java.lang.Boolean.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x021c
            r5 = 0
            boolean r2 = r3.mo18757c(r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x02a7
        L_0x021c:
            java.lang.Class r5 = java.lang.Long.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0236
            r5 = 0
            long r2 = r3.mo18766i(r5)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x02a7
        L_0x0236:
            java.lang.Class r5 = java.lang.Double.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x024f
            r5 = 0
            double r2 = r3.mo18758d(r5)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x02a7
        L_0x024f:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0265
            r5 = 0
            int r2 = r3.mo18762f(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x02a7
        L_0x0265:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x027e
            com.urbanairship.json.a r2 = r3.mo18784z()
            if (r2 == 0) goto L_0x0278
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
            goto L_0x02a7
        L_0x0278:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x027e:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0295
            com.urbanairship.json.b r2 = r3.mo18749A()
            if (r2 == 0) goto L_0x028f
            goto L_0x02a7
        L_0x028f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x0295:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x03bf
            com.urbanairship.json.JsonValue r2 = r3.mo17264q()
            if (r2 == 0) goto L_0x03b9
            com.urbanairship.json.b r2 = (com.urbanairship.json.C9323b) r2
        L_0x02a7:
            com.urbanairship.android.layout.property.Size r2 = com.urbanairship.android.layout.property.Size.m147685a(r2)
            java.lang.String r3 = "fromJson(json.requireField(\"size\"))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r0.f88161e = r2
            java.lang.String r2 = "margin"
            com.urbanairship.json.JsonValue r1 = r1.mo18812k(r2)
            if (r1 != 0) goto L_0x02bd
            r1 = 0
            goto L_0x0384
        L_0x02bd:
            java.lang.String r3 = "get(key) ?: return null"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            kotlin.reflect.d r3 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x02e0
            java.lang.String r1 = r1.mo18750B()
            if (r1 == 0) goto L_0x02da
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x0384
        L_0x02da:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x02e0:
            java.lang.Class r4 = java.lang.Boolean.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x02f9
            r4 = 0
            boolean r1 = r1.mo18757c(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x0384
        L_0x02f9:
            java.lang.Class r4 = java.lang.Long.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0313
            r4 = 0
            long r1 = r1.mo18766i(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x0384
        L_0x0313:
            java.lang.Class r4 = java.lang.Double.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x032c
            r4 = 0
            double r1 = r1.mo18758d(r4)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x0384
        L_0x032c:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0342
            r4 = 0
            int r1 = r1.mo18762f(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x0384
        L_0x0342:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x035b
            com.urbanairship.json.a r1 = r1.mo18784z()
            if (r1 == 0) goto L_0x0355
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x0384
        L_0x0355:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x035b:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0372
            com.urbanairship.json.b r1 = r1.mo18749A()
            if (r1 == 0) goto L_0x036c
            goto L_0x0384
        L_0x036c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x0372:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x0395
            com.urbanairship.json.JsonValue r1 = r1.mo17264q()
            if (r1 == 0) goto L_0x038f
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
        L_0x0384:
            if (r1 == 0) goto L_0x038b
            com.urbanairship.android.layout.property.k r3 = com.urbanairship.android.layout.property.C35840k.m147768a(r1)
            goto L_0x038c
        L_0x038b:
            r3 = 0
        L_0x038c:
            r0.f88162f = r3
            return
        L_0x038f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x0395:
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
        L_0x03b9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x03bf:
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
        L_0x03e3:
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
        L_0x03fd:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x0403:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            java.lang.String r3 = r8.getSimpleName()
            r2.append(r3)
            r2.append(r12)
            r3 = r16
            r2.append(r3)
            r4 = 39
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0429:
            r3 = r2
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
        L_0x0444:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r11)
            throw r1
        L_0x044a:
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
        L_0x046e:
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
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.info.C35667k.<init>(com.urbanairship.json.b):void");
    }

    /* renamed from: c */
    public boolean mo106811c() {
        return this.f88159c.mo106811c();
    }

    @C12580l
    /* renamed from: i */
    public final C35840k mo106813i() {
        return this.f88162f;
    }

    @C12579k
    /* renamed from: j */
    public final C35843n mo106814j() {
        return this.f88160d;
    }

    @C12579k
    /* renamed from: k */
    public final Size mo106815k() {
        return this.f88161e;
    }
}
