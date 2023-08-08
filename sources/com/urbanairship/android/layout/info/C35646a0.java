package com.urbanairship.android.layout.info;

import android.widget.ImageView;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.property.MediaType;
import com.urbanairship.android.layout.property.ViewType;
import java.util.List;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.a0 */
public final class C35646a0 extends C35686t0 implements C35682r0, C35645a {

    /* renamed from: b */
    public final /* synthetic */ C35682r0 f88102b;

    /* renamed from: c */
    public final /* synthetic */ C35645a f88103c;
    @C12579k

    /* renamed from: d */
    public final String f88104d;
    @C12579k

    /* renamed from: e */
    public final MediaType f88105e;
    @C12579k

    /* renamed from: f */
    public final ImageView.ScaleType f88106f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35646a0(@org.jetbrains.annotations.C12579k com.urbanairship.json.C9323b r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            r0.<init>(r2)
            com.urbanairship.android.layout.info.r0 r2 = com.urbanairship.android.layout.info.C35691u0.m147171l(r19)
            r0.f88102b = r2
            com.urbanairship.android.layout.info.a r2 = com.urbanairship.android.layout.info.C35691u0.m147166g(r19)
            r0.f88103c = r2
            java.lang.String r2 = "url"
            com.urbanairship.json.JsonValue r3 = r1.mo18812k(r2)
            java.lang.String r4 = "Missing required field: '"
            if (r3 == 0) goto L_0x036a
            java.lang.String r6 = "get(key) ?: throw JsonEx… required field: '$key'\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            kotlin.reflect.d r8 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            java.lang.String r10 = "' for field '"
            java.lang.String r11 = "Invalid type '"
            java.lang.Class<com.urbanairship.json.JsonValue> r12 = com.urbanairship.json.JsonValue.class
            java.lang.Class<com.urbanairship.json.b> r13 = com.urbanairship.json.C9323b.class
            java.lang.Class<com.urbanairship.json.a> r14 = com.urbanairship.json.C9322a.class
            r16 = r6
            java.lang.Class<java.lang.Integer> r17 = java.lang.Integer.class
            r15 = 0
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            if (r9 == 0) goto L_0x0058
            java.lang.String r2 = r3.mo18750B()
            if (r2 == 0) goto L_0x0052
        L_0x004f:
            r6 = r10
            goto L_0x00fd
        L_0x0052:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x0058:
            java.lang.Class r6 = java.lang.Boolean.TYPE
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x006f
            boolean r2 = r3.mo18757c(r15)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x004f
        L_0x006f:
            java.lang.Class r6 = java.lang.Long.TYPE
            kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r6)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x008a
            r6 = r10
            r9 = 0
            long r2 = r3.mo18766i(r9)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00fd
        L_0x008a:
            r6 = r10
            java.lang.Class r9 = java.lang.Double.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x00a4
            r9 = 0
            double r2 = r3.mo18758d(r9)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00fd
        L_0x00a4:
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x00b9
            int r2 = r3.mo18762f(r15)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00fd
        L_0x00b9:
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x00d2
            com.urbanairship.json.a r2 = r3.mo18784z()
            if (r2 == 0) goto L_0x00cc
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00fd
        L_0x00cc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x00d2:
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x00eb
            com.urbanairship.json.b r2 = r3.mo18749A()
            if (r2 == 0) goto L_0x00e5
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00fd
        L_0x00e5:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x00eb:
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r8 == 0) goto L_0x0345
            com.urbanairship.json.JsonValue r2 = r3.mo17264q()
            if (r2 == 0) goto L_0x033f
            java.lang.String r2 = (java.lang.String) r2
        L_0x00fd:
            r0.f88104d = r2
            java.lang.String r2 = "media_type"
            com.urbanairship.json.JsonValue r3 = r1.mo18812k(r2)
            if (r3 == 0) goto L_0x0325
            r8 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r8)
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x012a
            java.lang.String r2 = r3.mo18750B()
            if (r2 == 0) goto L_0x0124
        L_0x0120:
            r16 = r11
            goto L_0x01d1
        L_0x0124:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x012a:
            java.lang.Class r10 = java.lang.Boolean.TYPE
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0141
            boolean r2 = r3.mo18757c(r15)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0120
        L_0x0141:
            java.lang.Class r10 = java.lang.Long.TYPE
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x015d
            r16 = r11
            r10 = 0
            long r2 = r3.mo18766i(r10)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x01d1
        L_0x015d:
            r16 = r11
            java.lang.Class r10 = java.lang.Double.TYPE
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r10)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0178
            r10 = 0
            double r2 = r3.mo18758d(r10)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x01d1
        L_0x0178:
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x018d
            int r2 = r3.mo18762f(r15)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x01d1
        L_0x018d:
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x01a6
            com.urbanairship.json.a r2 = r3.mo18784z()
            if (r2 == 0) goto L_0x01a0
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x01d1
        L_0x01a0:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x01a6:
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x01bf
            com.urbanairship.json.b r2 = r3.mo18749A()
            if (r2 == 0) goto L_0x01b9
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x01d1
        L_0x01b9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x01bf:
            kotlin.reflect.d r10 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x02ff
            com.urbanairship.json.JsonValue r2 = r3.mo17264q()
            if (r2 == 0) goto L_0x02f9
            java.lang.String r2 = (java.lang.String) r2
        L_0x01d1:
            com.urbanairship.android.layout.property.MediaType r2 = com.urbanairship.android.layout.property.MediaType.m147680b(r2)
            java.lang.String r3 = "from(json.requireField(\"media_type\"))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r0.f88105e = r2
            java.lang.String r2 = "media_fit"
            com.urbanairship.json.JsonValue r1 = r1.mo18812k(r2)
            if (r1 == 0) goto L_0x02df
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r8)
            kotlin.reflect.d r3 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0203
            java.lang.String r1 = r1.mo18750B()
            if (r1 == 0) goto L_0x01fd
            goto L_0x02a7
        L_0x01fd:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x0203:
            java.lang.Class r4 = java.lang.Boolean.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x021b
            boolean r1 = r1.mo18757c(r15)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x02a7
        L_0x021b:
            java.lang.Class r4 = java.lang.Long.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0235
            r8 = 0
            long r1 = r1.mo18766i(r8)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x02a7
        L_0x0235:
            java.lang.Class r4 = java.lang.Double.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x024e
            r8 = 0
            double r1 = r1.mo18758d(r8)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x02a7
        L_0x024e:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0263
            int r1 = r1.mo18762f(r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x02a7
        L_0x0263:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x027c
            com.urbanairship.json.a r1 = r1.mo18784z()
            if (r1 == 0) goto L_0x0276
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x02a7
        L_0x0276:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x027c:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0295
            com.urbanairship.json.b r1 = r1.mo18749A()
            if (r1 == 0) goto L_0x028f
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x02a7
        L_0x028f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x0295:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x02b9
            com.urbanairship.json.JsonValue r1 = r1.mo17264q()
            if (r1 == 0) goto L_0x02b3
            java.lang.String r1 = (java.lang.String) r1
        L_0x02a7:
            android.widget.ImageView$ScaleType r1 = com.urbanairship.android.layout.property.MediaFit.m147677b(r1)
            java.lang.String r2 = "asScaleType(json.requireField(\"media_fit\"))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.f88106f = r1
            return
        L_0x02b3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x02b9:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r16
            r3.append(r4)
            java.lang.String r4 = r7.getSimpleName()
            r3.append(r4)
            r3.append(r6)
            r3.append(r2)
            r5 = 39
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x02df:
            r5 = 39
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x02f9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x02ff:
            r4 = r16
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = r7.getSimpleName()
            r3.append(r4)
            r3.append(r6)
            r3.append(r2)
            r5 = 39
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0325:
            r5 = 39
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x033f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x0345:
            r4 = r11
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = r7.getSimpleName()
            r3.append(r4)
            r3.append(r6)
            r3.append(r2)
            r5 = 39
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x036a:
            r5 = 39
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.info.C35646a0.<init>(com.urbanairship.json.b):void");
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88102b.mo106774d();
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88102b.getBackgroundColor();
    }

    @C12580l
    public String getContentDescription() {
        return this.f88103c.getContentDescription();
    }

    @C12579k
    public ViewType getType() {
        return this.f88102b.getType();
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88102b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88102b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88102b.mo106779i();
    }

    @C12579k
    /* renamed from: k */
    public final MediaType mo106780k() {
        return this.f88105e;
    }

    @C12579k
    /* renamed from: l */
    public final ImageView.ScaleType mo106781l() {
        return this.f88106f;
    }

    @C12579k
    /* renamed from: m */
    public final String mo106782m() {
        return this.f88104d;
    }
}
