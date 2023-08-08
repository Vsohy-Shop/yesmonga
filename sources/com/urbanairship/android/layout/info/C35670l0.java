package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.info.C35689u;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.Direction;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.property.ViewType;
import java.util.List;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.l0 */
public final class C35670l0 extends C35684s0<C35689u.C35690a> implements C35682r0 {

    /* renamed from: b */
    public final /* synthetic */ C35682r0 f88169b;
    @C12579k

    /* renamed from: c */
    public final C35686t0 f88170c;
    @C12579k

    /* renamed from: d */
    public final Direction f88171d;
    @C12579k

    /* renamed from: e */
    public final List<C35689u.C35690a> f88172e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0212  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35670l0(@org.jetbrains.annotations.C12579k com.urbanairship.json.C9323b r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            r0.<init>(r2)
            com.urbanairship.android.layout.info.r0 r2 = com.urbanairship.android.layout.info.C35691u0.m147171l(r19)
            r0.f88169b = r2
            com.urbanairship.android.layout.info.t0$a r2 = com.urbanairship.android.layout.info.C35686t0.f88201a
            java.lang.String r3 = "view"
            com.urbanairship.json.JsonValue r4 = r1.mo18812k(r3)
            java.lang.String r5 = "Missing required field: '"
            if (r4 == 0) goto L_0x0256
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
            if (r11 == 0) goto L_0x0054
            java.lang.String r3 = r4.mo18750B()
            if (r3 == 0) goto L_0x004e
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x006a
        L_0x004e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x0054:
            java.lang.Class r11 = java.lang.Boolean.TYPE
            kotlin.reflect.d r11 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)
            if (r11 == 0) goto L_0x006d
            boolean r3 = r4.mo18757c(r7)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
        L_0x006a:
            r11 = r8
            goto L_0x00fa
        L_0x006d:
            java.lang.Class r11 = java.lang.Long.TYPE
            kotlin.reflect.d r11 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)
            if (r11 == 0) goto L_0x0088
            r11 = r8
            r7 = 0
            long r3 = r4.mo18766i(r7)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00fa
        L_0x0088:
            r11 = r8
            java.lang.Class r7 = java.lang.Double.TYPE
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x00a2
            r7 = 0
            double r3 = r4.mo18758d(r7)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00fa
        L_0x00a2:
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x00b8
            r7 = 0
            int r3 = r4.mo18762f(r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00fa
        L_0x00b8:
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x00d1
            com.urbanairship.json.a r3 = r4.mo18784z()
            if (r3 == 0) goto L_0x00cb
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            goto L_0x00fa
        L_0x00cb:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x00d1:
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x00e8
            com.urbanairship.json.b r3 = r4.mo18749A()
            if (r3 == 0) goto L_0x00e2
            goto L_0x00fa
        L_0x00e2:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x00e8:
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0232
            com.urbanairship.json.JsonValue r3 = r4.mo17264q()
            if (r3 == 0) goto L_0x022c
            com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
        L_0x00fa:
            com.urbanairship.android.layout.info.t0 r2 = r2.mo106835a(r3)
            r0.f88170c = r2
            java.lang.String r3 = "direction"
            com.urbanairship.json.JsonValue r1 = r1.mo18812k(r3)
            if (r1 == 0) goto L_0x0212
            r4 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            if (r5 == 0) goto L_0x012b
            java.lang.String r1 = r1.mo18750B()
            if (r1 == 0) goto L_0x0125
            goto L_0x01d1
        L_0x0125:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x012b:
            java.lang.Class r5 = java.lang.Boolean.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0144
            r5 = 0
            boolean r1 = r1.mo18757c(r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01d1
        L_0x0144:
            java.lang.Class r5 = java.lang.Long.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x015e
            r7 = 0
            long r3 = r1.mo18766i(r7)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01d1
        L_0x015e:
            java.lang.Class r5 = java.lang.Double.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0177
            r7 = 0
            double r3 = r1.mo18758d(r7)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01d1
        L_0x0177:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x018d
            r5 = 0
            int r1 = r1.mo18762f(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01d1
        L_0x018d:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x01a6
            com.urbanairship.json.a r1 = r1.mo18784z()
            if (r1 == 0) goto L_0x01a0
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01d1
        L_0x01a0:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x01a6:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x01bf
            com.urbanairship.json.b r1 = r1.mo18749A()
            if (r1 == 0) goto L_0x01b9
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01d1
        L_0x01b9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x01bf:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x01ee
            com.urbanairship.json.JsonValue r1 = r1.mo17264q()
            if (r1 == 0) goto L_0x01e8
            java.lang.String r1 = (java.lang.String) r1
        L_0x01d1:
            com.urbanairship.android.layout.property.Direction r1 = com.urbanairship.android.layout.property.Direction.m147646b(r1)
            java.lang.String r3 = "from(json.requireField(\"direction\"))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r0.f88171d = r1
            com.urbanairship.android.layout.info.u$a r1 = new com.urbanairship.android.layout.info.u$a
            r1.<init>(r2)
            java.util.List r1 = kotlin.collections.C10976s.m41419k(r1)
            r0.f88172e = r1
            return
        L_0x01e8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x01ee:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            java.lang.String r4 = r10.getSimpleName()
            r2.append(r4)
            r2.append(r12)
            r2.append(r3)
            r4 = 39
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0212:
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
        L_0x022c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x0232:
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
        L_0x0256:
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
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.info.C35670l0.<init>(com.urbanairship.json.b):void");
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88169b.mo106774d();
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88169b.getBackgroundColor();
    }

    @C12579k
    public ViewType getType() {
        return this.f88169b.getType();
    }

    @C12579k
    public final C35686t0 getView() {
        return this.f88170c;
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88169b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88169b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88169b.mo106779i();
    }

    @C12579k
    /* renamed from: k */
    public List<C35689u.C35690a> mo106789k() {
        return this.f88172e;
    }

    @C12579k
    /* renamed from: l */
    public final Direction mo106819l() {
        return this.f88171d;
    }
}
