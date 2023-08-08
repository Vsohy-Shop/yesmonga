package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.property.ButtonClickBehaviorType;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.property.ViewType;
import com.urbanairship.json.JsonValue;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.e */
public class C35655e extends C35686t0 implements C35651d, C35682r0, C35645a, C35681r {

    /* renamed from: b */
    public final /* synthetic */ C35682r0 f88127b;

    /* renamed from: c */
    public final /* synthetic */ C35645a f88128c;

    /* renamed from: d */
    public final /* synthetic */ C35681r f88129d;
    @C12579k

    /* renamed from: e */
    public final List<ButtonClickBehaviorType> f88130e;
    @C12580l

    /* renamed from: f */
    public final Map<String, JsonValue> f88131f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0102, code lost:
        r3 = com.urbanairship.android.layout.property.ButtonClickBehaviorType.f88434a.mo107245b(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35655e(@org.jetbrains.annotations.C12579k com.urbanairship.json.C9323b r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            r0.<init>(r2)
            com.urbanairship.android.layout.info.r0 r3 = com.urbanairship.android.layout.info.C35691u0.m147171l(r19)
            r0.f88127b = r3
            com.urbanairship.android.layout.info.a r3 = com.urbanairship.android.layout.info.C35691u0.m147166g(r19)
            r0.f88128c = r3
            com.urbanairship.android.layout.info.r r3 = com.urbanairship.android.layout.info.C35691u0.m147168i(r19)
            r0.f88129d = r3
            java.lang.String r3 = "button_click"
            com.urbanairship.json.JsonValue r4 = r1.mo18812k(r3)
            java.lang.String r6 = "' for field '"
            java.lang.String r7 = "Invalid type '"
            java.lang.Class<com.urbanairship.json.JsonValue> r8 = com.urbanairship.json.JsonValue.class
            java.lang.Class<java.lang.Integer> r11 = java.lang.Integer.class
            r12 = 0
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.String r15 = "get(key) ?: return null"
            java.lang.Class<com.urbanairship.json.b> r16 = com.urbanairship.json.C9323b.class
            r2 = 0
            java.lang.Class<com.urbanairship.json.a> r17 = com.urbanairship.json.C9322a.class
            if (r4 != 0) goto L_0x003d
            r3 = 0
            goto L_0x0100
        L_0x003d:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r15)
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r9)
            java.lang.String r10 = "null cannot be cast to non-null type com.urbanairship.json.JsonList"
            if (r9 == 0) goto L_0x0060
            java.lang.String r3 = r4.mo18750B()
            if (r3 == 0) goto L_0x005a
            com.urbanairship.json.a r3 = (com.urbanairship.json.C9322a) r3
            goto L_0x0100
        L_0x005a:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r10)
            throw r1
        L_0x0060:
            java.lang.Class r9 = java.lang.Boolean.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0078
            boolean r3 = r4.mo18757c(r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.urbanairship.json.a r3 = (com.urbanairship.json.C9322a) r3
            goto L_0x0100
        L_0x0078:
            java.lang.Class r9 = java.lang.Long.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0090
            long r3 = r4.mo18766i(r12)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.urbanairship.json.a r3 = (com.urbanairship.json.C9322a) r3
            goto L_0x0100
        L_0x0090:
            java.lang.Class r9 = java.lang.Double.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x00a9
            r12 = 0
            double r3 = r4.mo18758d(r12)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            com.urbanairship.json.a r3 = (com.urbanairship.json.C9322a) r3
            goto L_0x0100
        L_0x00a9:
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x00be
            int r3 = r4.mo18762f(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.urbanairship.json.a r3 = (com.urbanairship.json.C9322a) r3
            goto L_0x0100
        L_0x00be:
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x00d5
            com.urbanairship.json.a r3 = r4.mo18784z()
            if (r3 == 0) goto L_0x00cf
            goto L_0x0100
        L_0x00cf:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r10)
            throw r1
        L_0x00d5:
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r16)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x00ee
            com.urbanairship.json.b r3 = r4.mo18749A()
            if (r3 == 0) goto L_0x00e8
            com.urbanairship.json.a r3 = (com.urbanairship.json.C9322a) r3
            goto L_0x0100
        L_0x00e8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r10)
            throw r1
        L_0x00ee:
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r9)
            if (r5 == 0) goto L_0x021c
            com.urbanairship.json.JsonValue r3 = r4.mo17264q()
            if (r3 == 0) goto L_0x0216
            com.urbanairship.json.a r3 = (com.urbanairship.json.C9322a) r3
        L_0x0100:
            if (r3 == 0) goto L_0x010b
            com.urbanairship.android.layout.property.ButtonClickBehaviorType$a r4 = com.urbanairship.android.layout.property.ButtonClickBehaviorType.f88434a
            java.util.List r3 = r4.mo107245b(r3)
            if (r3 == 0) goto L_0x010b
            goto L_0x010f
        L_0x010b:
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x010f:
            r0.f88130e = r3
            java.lang.String r3 = "actions"
            com.urbanairship.json.JsonValue r1 = r1.mo18812k(r3)
            if (r1 != 0) goto L_0x011c
            r1 = 0
            goto L_0x01e1
        L_0x011c:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r15)
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r16)
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r14)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            java.lang.String r9 = "null cannot be cast to non-null type com.urbanairship.json.JsonMap"
            if (r5 == 0) goto L_0x013f
            java.lang.String r1 = r1.mo18750B()
            if (r1 == 0) goto L_0x0139
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x01e1
        L_0x0139:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r9)
            throw r1
        L_0x013f:
            java.lang.Class r5 = java.lang.Boolean.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0157
            boolean r1 = r1.mo18757c(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x01e1
        L_0x0157:
            java.lang.Class r5 = java.lang.Long.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0171
            r12 = 0
            long r1 = r1.mo18766i(r12)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x01e1
        L_0x0171:
            java.lang.Class r5 = java.lang.Double.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x018a
            r12 = 0
            double r1 = r1.mo18758d(r12)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x01e1
        L_0x018a:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r11)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x019f
            int r1 = r1.mo18762f(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x01e1
        L_0x019f:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r17)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x01b8
            com.urbanairship.json.a r1 = r1.mo18784z()
            if (r1 == 0) goto L_0x01b2
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            goto L_0x01e1
        L_0x01b2:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r9)
            throw r1
        L_0x01b8:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r16)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x01cf
            com.urbanairship.json.b r1 = r1.mo18749A()
            if (r1 == 0) goto L_0x01c9
            goto L_0x01e1
        L_0x01c9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r9)
            throw r1
        L_0x01cf:
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r8)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x01f2
            com.urbanairship.json.JsonValue r1 = r1.mo17264q()
            if (r1 == 0) goto L_0x01ec
            com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
        L_0x01e1:
            if (r1 == 0) goto L_0x01e8
            java.util.Map r2 = r1.mo18813r()
            goto L_0x01e9
        L_0x01e8:
            r2 = 0
        L_0x01e9:
            r0.f88131f = r2
            return
        L_0x01ec:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r9)
            throw r1
        L_0x01f2:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r4 = r16.getSimpleName()
            r2.append(r4)
            r2.append(r6)
            r2.append(r3)
            r3 = 39
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0216:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r10)
            throw r1
        L_0x021c:
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r4 = r17.getSimpleName()
            r2.append(r4)
            r2.append(r6)
            r2.append(r3)
            r3 = 39
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.info.C35655e.<init>(com.urbanairship.json.b):void");
    }

    @C12579k
    /* renamed from: a */
    public String mo106791a() {
        return this.f88129d.mo106791a();
    }

    @C12580l
    /* renamed from: b */
    public Map<String, JsonValue> mo106792b() {
        return this.f88131f;
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88127b.mo106774d();
    }

    @C12579k
    /* renamed from: f */
    public List<ButtonClickBehaviorType> mo106793f() {
        return this.f88130e;
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88127b.getBackgroundColor();
    }

    @C12580l
    public String getContentDescription() {
        return this.f88128c.getContentDescription();
    }

    @C12579k
    public ViewType getType() {
        return this.f88127b.getType();
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88127b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88127b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88127b.mo106779i();
    }
}
