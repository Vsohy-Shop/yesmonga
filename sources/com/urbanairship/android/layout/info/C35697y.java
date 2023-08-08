package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.Direction;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.property.ViewType;
import java.util.List;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.y */
public final class C35697y extends C35684s0<C35698z> implements C35682r0 {

    /* renamed from: b */
    public final /* synthetic */ C35682r0 f88216b;

    /* renamed from: c */
    public final boolean f88217c;
    @C12579k

    /* renamed from: d */
    public final Direction f88218d;
    @C12579k

    /* renamed from: e */
    public final List<C35698z> f88219e;
    @C12579k

    /* renamed from: f */
    public final List<C35698z> f88220f;

    /* JADX WARNING: type inference failed for: r2v29, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r2v31, types: [java.lang.Double] */
    /* JADX WARNING: type inference failed for: r2v33, types: [java.lang.Long] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35697y(@org.jetbrains.annotations.C12579k com.urbanairship.json.C9323b r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            r0.<init>(r2)
            com.urbanairship.android.layout.info.r0 r3 = com.urbanairship.android.layout.info.C35691u0.m147171l(r20)
            r0.f88216b = r3
            java.lang.String r3 = "randomize_children"
            com.urbanairship.json.JsonValue r4 = r1.mo18812k(r3)
            java.lang.String r5 = "' for field '"
            java.lang.String r6 = "Invalid type '"
            java.lang.Class<com.urbanairship.json.JsonValue> r7 = com.urbanairship.json.JsonValue.class
            java.lang.Class<com.urbanairship.json.b> r8 = com.urbanairship.json.C9323b.class
            java.lang.Class<java.lang.Integer> r11 = java.lang.Integer.class
            r12 = 0
            java.lang.Class<com.urbanairship.json.a> r14 = com.urbanairship.json.C9322a.class
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r2 = 0
            if (r4 != 0) goto L_0x002f
            r3 = 0
            goto L_0x00d9
        L_0x002f:
            java.lang.String r15 = "get(key) ?: return null"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r15)
            java.lang.Class<java.lang.Boolean> r15 = java.lang.Boolean.class
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r16)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x004c
            java.lang.String r3 = r4.mo18750B()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            goto L_0x00d9
        L_0x004c:
            java.lang.Class r10 = java.lang.Boolean.TYPE
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0062
            boolean r3 = r4.mo18757c(r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x00d9
        L_0x0062:
            java.lang.Class r10 = java.lang.Long.TYPE
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0079
            long r3 = r4.mo18766i(r12)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            goto L_0x00d9
        L_0x0079:
            java.lang.Class r10 = java.lang.Double.TYPE
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0092
            r12 = 0
            double r3 = r4.mo18758d(r12)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            goto L_0x00d9
        L_0x0092:
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x00a7
            int r3 = r4.mo18762f(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            goto L_0x00d9
        L_0x00a7:
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x00b8
            com.urbanairship.json.a r3 = r4.mo18784z()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            goto L_0x00d9
        L_0x00b8:
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x00c9
            com.urbanairship.json.b r3 = r4.mo18749A()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            goto L_0x00d9
        L_0x00c9:
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x035c
            com.urbanairship.json.JsonValue r3 = r4.mo17264q()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
        L_0x00d9:
            if (r3 == 0) goto L_0x00e0
            boolean r3 = r3.booleanValue()
            goto L_0x00e1
        L_0x00e0:
            r3 = r2
        L_0x00e1:
            r0.f88217c = r3
            java.lang.String r3 = "direction"
            com.urbanairship.json.JsonValue r4 = r1.mo18812k(r3)
            java.lang.String r9 = "Missing required field: '"
            if (r4 == 0) goto L_0x0342
            java.lang.String r10 = "get(key) ?: throw JsonEx… required field: '$key'\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r10)
            kotlin.reflect.d r12 = kotlin.jvm.internal.C11342l0.m43547d(r16)
            kotlin.reflect.d r13 = kotlin.jvm.internal.C11342l0.m43547d(r16)
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            java.lang.String r15 = "null cannot be cast to non-null type kotlin.String"
            if (r13 == 0) goto L_0x0110
            java.lang.String r3 = r4.mo18750B()
            if (r3 == 0) goto L_0x010a
            goto L_0x01bd
        L_0x010a:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r15)
            throw r1
        L_0x0110:
            java.lang.Class r13 = java.lang.Boolean.TYPE
            kotlin.reflect.d r13 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r13 == 0) goto L_0x0128
            boolean r3 = r4.mo18757c(r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x01bd
        L_0x0128:
            java.lang.Class r13 = java.lang.Long.TYPE
            kotlin.reflect.d r13 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r13 == 0) goto L_0x0143
            r2 = 0
            long r17 = r4.mo18766i(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r17)
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x01bd
        L_0x0143:
            r17 = r3
            java.lang.Class r2 = java.lang.Double.TYPE
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r2)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x015f
            r2 = 0
            double r17 = r4.mo18758d(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r17)
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x01bd
        L_0x015f:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0176
            r2 = 0
            int r3 = r4.mo18762f(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x01bd
        L_0x0176:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0190
            com.urbanairship.json.a r2 = r4.mo18784z()
            if (r2 == 0) goto L_0x018a
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x01bd
        L_0x018a:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r15)
            throw r1
        L_0x0190:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x01aa
            com.urbanairship.json.b r2 = r4.mo18749A()
            if (r2 == 0) goto L_0x01a4
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x01bd
        L_0x01a4:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r15)
            throw r1
        L_0x01aa:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x031c
            com.urbanairship.json.JsonValue r2 = r4.mo17264q()
            if (r2 == 0) goto L_0x0316
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        L_0x01bd:
            com.urbanairship.android.layout.property.Direction r2 = com.urbanairship.android.layout.property.Direction.m147646b(r3)
            java.lang.String r3 = "from(json.requireField(\"direction\"))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r0.f88218d = r2
            java.lang.String r2 = "items"
            com.urbanairship.json.JsonValue r1 = r1.mo18812k(r2)
            if (r1 == 0) goto L_0x02fc
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r10)
            kotlin.reflect.d r3 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r16)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            java.lang.String r9 = "null cannot be cast to non-null type com.urbanairship.json.JsonList"
            if (r4 == 0) goto L_0x01f3
            java.lang.String r1 = r1.mo18750B()
            if (r1 == 0) goto L_0x01ed
            com.urbanairship.json.a r1 = (com.urbanairship.json.C9322a) r1
            goto L_0x0298
        L_0x01ed:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r9)
            throw r1
        L_0x01f3:
            java.lang.Class r4 = java.lang.Boolean.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x020c
            r4 = 0
            boolean r1 = r1.mo18757c(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.urbanairship.json.a r1 = (com.urbanairship.json.C9322a) r1
            goto L_0x0298
        L_0x020c:
            java.lang.Class r4 = java.lang.Long.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0226
            r13 = 0
            long r1 = r1.mo18766i(r13)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.urbanairship.json.a r1 = (com.urbanairship.json.C9322a) r1
            goto L_0x0298
        L_0x0226:
            r10 = r14
            java.lang.Class r12 = java.lang.Double.TYPE
            kotlin.reflect.d r12 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r12)
            if (r12 == 0) goto L_0x0240
            r12 = 0
            double r1 = r1.mo18758d(r12)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            com.urbanairship.json.a r1 = (com.urbanairship.json.C9322a) r1
            goto L_0x0298
        L_0x0240:
            kotlin.reflect.d r11 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r11)
            if (r11 == 0) goto L_0x0256
            r4 = 0
            int r1 = r1.mo18762f(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.urbanairship.json.a r1 = (com.urbanairship.json.C9322a) r1
            goto L_0x0298
        L_0x0256:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x026d
            com.urbanairship.json.a r1 = r1.mo18784z()
            if (r1 == 0) goto L_0x0267
            goto L_0x0298
        L_0x0267:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r9)
            throw r1
        L_0x026d:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0286
            com.urbanairship.json.b r1 = r1.mo18749A()
            if (r1 == 0) goto L_0x0280
            com.urbanairship.json.a r1 = (com.urbanairship.json.C9322a) r1
            goto L_0x0298
        L_0x0280:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r9)
            throw r1
        L_0x0286:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x02d8
            com.urbanairship.json.JsonValue r1 = r1.mo17264q()
            if (r1 == 0) goto L_0x02d2
            com.urbanairship.json.a r1 = (com.urbanairship.json.C9322a) r1
        L_0x0298:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C10978t.m41495Y(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x02a7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02c5
            java.lang.Object r3 = r1.next()
            com.urbanairship.json.JsonValue r3 = (com.urbanairship.json.JsonValue) r3
            com.urbanairship.android.layout.info.z r4 = new com.urbanairship.android.layout.info.z
            com.urbanairship.json.b r3 = r3.mo18752E()
            java.lang.String r5 = "it.requireMap()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            r4.<init>(r3)
            r2.add(r4)
            goto L_0x02a7
        L_0x02c5:
            boolean r1 = r0.f88217c
            if (r1 == 0) goto L_0x02cd
            java.util.List r2 = kotlin.collections.C10976s.m41420l(r2)
        L_0x02cd:
            r0.f88219e = r2
            r0.f88220f = r2
            return
        L_0x02d2:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r9)
            throw r1
        L_0x02d8:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r4 = r10.getSimpleName()
            r3.append(r4)
            r3.append(r5)
            r3.append(r2)
            r4 = 39
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x02fc:
            r4 = 39
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0316:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r15)
            throw r1
        L_0x031c:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r3 = r16.getSimpleName()
            r2.append(r3)
            r2.append(r5)
            r3 = r17
            r2.append(r3)
            r4 = 39
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0342:
            r4 = 39
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x035c:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r4 = r15.getSimpleName()
            r2.append(r4)
            r2.append(r5)
            r2.append(r3)
            r3 = 39
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.info.C35697y.<init>(com.urbanairship.json.b):void");
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88216b.mo106774d();
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88216b.getBackgroundColor();
    }

    @C12579k
    public ViewType getType() {
        return this.f88216b.getType();
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88216b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88216b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88216b.mo106779i();
    }

    @C12579k
    /* renamed from: k */
    public List<C35698z> mo106789k() {
        return this.f88220f;
    }

    @C12579k
    /* renamed from: l */
    public final Direction mo106860l() {
        return this.f88218d;
    }

    @C12579k
    /* renamed from: m */
    public final List<C35698z> mo106861m() {
        return this.f88219e;
    }

    /* renamed from: n */
    public final boolean mo106862n() {
        return this.f88217c;
    }
}
