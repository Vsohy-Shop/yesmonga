package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.property.ViewType;
import java.util.List;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.e0 */
public final class C35656e0 extends C35684s0<C35658f0> implements C35682r0 {

    /* renamed from: b */
    public final /* synthetic */ C35682r0 f88132b;
    @C12579k

    /* renamed from: c */
    public final List<C35658f0> f88133c;

    /* renamed from: d */
    public final boolean f88134d;
    @C12579k

    /* renamed from: e */
    public final List<C35658f0> f88135e;

    /* JADX WARNING: type inference failed for: r2v21, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r2v23, types: [java.lang.Double] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35656e0(@org.jetbrains.annotations.C12579k com.urbanairship.json.C9323b r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            r0.<init>(r2)
            com.urbanairship.android.layout.info.r0 r3 = com.urbanairship.android.layout.info.C35691u0.m147171l(r19)
            r0.f88132b = r3
            java.lang.String r3 = "items"
            com.urbanairship.json.JsonValue r4 = r1.mo18812k(r3)
            if (r4 == 0) goto L_0x023b
            java.lang.String r6 = "get(key) ?: throw JsonEx… required field: '$key'\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            java.lang.Class<com.urbanairship.json.a> r6 = com.urbanairship.json.C9322a.class
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            java.lang.String r10 = "' for field '"
            java.lang.String r11 = "Invalid type '"
            java.lang.Class<com.urbanairship.json.JsonValue> r12 = com.urbanairship.json.JsonValue.class
            java.lang.Class<com.urbanairship.json.b> r13 = com.urbanairship.json.C9323b.class
            java.lang.Class<java.lang.Integer> r15 = java.lang.Integer.class
            r17 = r3
            r2 = 0
            java.lang.String r5 = "null cannot be cast to non-null type com.urbanairship.json.JsonList"
            r14 = 0
            if (r9 == 0) goto L_0x0053
            java.lang.String r4 = r4.mo18750B()
            if (r4 == 0) goto L_0x004d
            com.urbanairship.json.a r4 = (com.urbanairship.json.C9322a) r4
            goto L_0x00f7
        L_0x004d:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x0053:
            java.lang.Class r9 = java.lang.Boolean.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x006b
            boolean r4 = r4.mo18757c(r14)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            com.urbanairship.json.a r4 = (com.urbanairship.json.C9322a) r4
            goto L_0x00f7
        L_0x006b:
            java.lang.Class r9 = java.lang.Long.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0083
            long r4 = r4.mo18766i(r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.urbanairship.json.a r4 = (com.urbanairship.json.C9322a) r4
            goto L_0x00f7
        L_0x0083:
            java.lang.Class r9 = java.lang.Double.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x009d
            r2 = 0
            double r4 = r4.mo18758d(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r4 = r2
            com.urbanairship.json.a r4 = (com.urbanairship.json.C9322a) r4
            goto L_0x00f7
        L_0x009d:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x00b3
            int r2 = r4.mo18762f(r14)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = r2
            com.urbanairship.json.a r4 = (com.urbanairship.json.C9322a) r4
            goto L_0x00f7
        L_0x00b3:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x00ca
            com.urbanairship.json.a r4 = r4.mo18784z()
            if (r4 == 0) goto L_0x00c4
            goto L_0x00f7
        L_0x00c4:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x00ca:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x00e4
            com.urbanairship.json.b r2 = r4.mo18749A()
            if (r2 == 0) goto L_0x00de
            r4 = r2
            com.urbanairship.json.a r4 = (com.urbanairship.json.C9322a) r4
            goto L_0x00f7
        L_0x00de:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x00e4:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0215
            com.urbanairship.json.JsonValue r2 = r4.mo17264q()
            if (r2 == 0) goto L_0x020f
            r4 = r2
            com.urbanairship.json.a r4 = (com.urbanairship.json.C9322a) r4
        L_0x00f7:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C10978t.m41495Y(r4, r3)
            r2.<init>(r3)
            java.util.Iterator r3 = r4.iterator()
        L_0x0106:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0124
            java.lang.Object r4 = r3.next()
            com.urbanairship.json.JsonValue r4 = (com.urbanairship.json.JsonValue) r4
            com.urbanairship.android.layout.info.f0 r5 = new com.urbanairship.android.layout.info.f0
            com.urbanairship.json.b r4 = r4.mo18752E()
            java.lang.String r7 = "it.requireMap()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)
            r5.<init>(r4)
            r2.add(r5)
            goto L_0x0106
        L_0x0124:
            r0.f88133c = r2
            java.lang.String r3 = "disable_swipe"
            com.urbanairship.json.JsonValue r1 = r1.mo18812k(r3)
            if (r1 != 0) goto L_0x0132
            r16 = 0
            goto L_0x01e0
        L_0x0132:
            java.lang.String r4 = "get(key) ?: return null"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x014f
            java.lang.String r1 = r1.mo18750B()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L_0x01de
        L_0x014f:
            java.lang.Class r7 = java.lang.Boolean.TYPE
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0165
            boolean r1 = r1.mo18757c(r14)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x01de
        L_0x0165:
            java.lang.Class r7 = java.lang.Long.TYPE
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x017e
            r7 = 0
            long r3 = r1.mo18766i(r7)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L_0x01de
        L_0x017e:
            java.lang.Class r7 = java.lang.Double.TYPE
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0197
            r7 = 0
            double r3 = r1.mo18758d(r7)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L_0x01de
        L_0x0197:
            kotlin.reflect.d r7 = kotlin.jvm.internal.C11342l0.m43547d(r15)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x01ac
            int r1 = r1.mo18762f(r14)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L_0x01de
        L_0x01ac:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x01bd
            com.urbanairship.json.a r1 = r1.mo18784z()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L_0x01de
        L_0x01bd:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x01ce
            com.urbanairship.json.b r1 = r1.mo18749A()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L_0x01de
        L_0x01ce:
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x01eb
            com.urbanairship.json.JsonValue r1 = r1.mo17264q()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L_0x01de:
            r16 = r1
        L_0x01e0:
            if (r16 == 0) goto L_0x01e6
            boolean r14 = r16.booleanValue()
        L_0x01e6:
            r0.f88134d = r14
            r0.f88135e = r2
            return
        L_0x01eb:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r4 = r4.getSimpleName()
            r2.append(r4)
            r2.append(r10)
            r2.append(r3)
            r3 = 39
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x020f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x0215:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r3 = r6.getSimpleName()
            r2.append(r3)
            r2.append(r10)
            r3 = r17
            r2.append(r3)
            r4 = 39
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x023b:
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
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.info.C35656e0.<init>(com.urbanairship.json.b):void");
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88132b.mo106774d();
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88132b.getBackgroundColor();
    }

    @C12579k
    public ViewType getType() {
        return this.f88132b.getType();
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88132b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88132b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88132b.mo106779i();
    }

    @C12579k
    /* renamed from: k */
    public List<C35658f0> mo106789k() {
        return this.f88135e;
    }

    @C12579k
    /* renamed from: l */
    public final List<C35658f0> mo106800l() {
        return this.f88133c;
    }

    /* renamed from: m */
    public final boolean mo106801m() {
        return this.f88134d;
    }
}
