package com.urbanairship.android.layout.model;

import android.content.Context;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.property.C35838i;
import com.urbanairship.android.layout.reporting.C35865a;
import com.urbanairship.android.layout.util.ViewExtensionsKt;
import com.urbanairship.android.layout.view.ToggleView;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.json.JsonValue;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11944n;
import kotlinx.coroutines.flow.C11948r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ToggleModel extends C35793b<ToggleView> {
    @C12579k

    /* renamed from: s */
    public final String f88393s;

    /* renamed from: t */
    public final boolean f88394t;
    @C12580l

    /* renamed from: u */
    public final C35865a f88395u;
    @C12580l

    /* renamed from: v */
    public final JsonValue f88396v;
    @C12579k

    /* renamed from: w */
    public final C35607n<C35608o.C35610b> f88397w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ToggleModel(java.lang.String r18, com.urbanairship.android.layout.property.C35852s r19, boolean r20, com.urbanairship.android.layout.reporting.C35865a r21, com.urbanairship.json.JsonValue r22, java.lang.String r23, com.urbanairship.android.layout.property.C35835f r24, com.urbanairship.android.layout.property.C35830c r25, com.urbanairship.android.layout.info.C35693v0 r26, java.util.List r27, java.util.List r28, com.urbanairship.android.layout.environment.C35607n r29, com.urbanairship.android.layout.environment.ModelEnvironment r30, com.urbanairship.android.layout.model.C35804j r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r17 = this;
            r0 = r32
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r5 = r1
            goto L_0x000b
        L_0x0009:
            r5 = r20
        L_0x000b:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0012
            r6 = r2
            goto L_0x0014
        L_0x0012:
            r6 = r21
        L_0x0014:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001a
            r7 = r2
            goto L_0x001c
        L_0x001a:
            r7 = r22
        L_0x001c:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0022
            r8 = r2
            goto L_0x0024
        L_0x0022:
            r8 = r23
        L_0x0024:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002a
            r9 = r2
            goto L_0x002c
        L_0x002a:
            r9 = r24
        L_0x002c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0032
            r10 = r2
            goto L_0x0034
        L_0x0032:
            r10 = r25
        L_0x0034:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003a
            r11 = r2
            goto L_0x003c
        L_0x003a:
            r11 = r26
        L_0x003c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0042
            r12 = r2
            goto L_0x0044
        L_0x0042:
            r12 = r27
        L_0x0044:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x004a
            r13 = r2
            goto L_0x004c
        L_0x004a:
            r13 = r28
        L_0x004c:
            r2 = r17
            r3 = r18
            r4 = r19
            r14 = r29
            r15 = r30
            r16 = r31
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.ToggleModel.<init>(java.lang.String, com.urbanairship.android.layout.property.s, boolean, com.urbanairship.android.layout.reporting.a, com.urbanairship.json.JsonValue, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @C12579k
    /* renamed from: U */
    public final String mo107170U() {
        return this.f88393s;
    }

    @C12579k
    /* renamed from: V */
    public ToggleView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        ToggleView toggleView = new ToggleView(context, this);
        toggleView.setId(mo107003r());
        return toggleView;
    }

    /* renamed from: W */
    public void mo106983B(@C12579k ToggleView toggleView) {
        Intrinsics.checkNotNullParameter(toggleView, C40383c.f102945c);
        C11944n<Boolean> G1 = C11909g.m47368G1(ViewExtensionsKt.m148028c(toggleView), mo107004s(), C11948r.f29534a.mo24272c(), 1);
        C11723c2 unused = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new ToggleModel$onViewAttached$1(G1, this, (C11045c<? super ToggleModel$onViewAttached$1>) null), 3, (Object) null);
        if (C35838i.m147766b(mo106998m())) {
            C11723c2 unused2 = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new ToggleModel$onViewAttached$2(G1, this, (C11045c<? super ToggleModel$onViewAttached$2>) null), 3, (Object) null);
        }
        C11723c2 unused3 = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new ToggleModel$onViewAttached$3(this, (C11045c<? super ToggleModel$onViewAttached$3>) null), 3, (Object) null);
    }

    /* renamed from: X */
    public void mo106984C(@C12579k ToggleView toggleView) {
        Intrinsics.checkNotNullParameter(toggleView, C40383c.f102945c);
        super.mo106984C(toggleView);
        mo106982A(new ToggleModel$onViewCreated$1(this, (C11045c<? super ToggleModel$onViewCreated$1>) null));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ToggleModel(@org.jetbrains.annotations.C12579k java.lang.String r16, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.property.C35852s r17, boolean r18, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.reporting.C35865a r19, @org.jetbrains.annotations.C12580l com.urbanairship.json.JsonValue r20, @org.jetbrains.annotations.C12580l java.lang.String r21, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r22, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r23, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r24, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r25, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r26, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r27, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r28, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r29) {
        /*
            r15 = this;
            r12 = r15
            r13 = r16
            r14 = r27
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "toggleStyle"
            r2 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "formState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "environment"
            r10 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "properties"
            r11 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.TOGGLE
            com.urbanairship.android.layout.property.ToggleType r3 = r17.mo107377b()
            java.lang.String r0 = "toggleStyle.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r0 = r15
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f88393s = r13
            r0 = r18
            r12.f88394t = r0
            r0 = r19
            r12.f88395u = r0
            r0 = r20
            r12.f88396v = r0
            r12.f88397w = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.ToggleModel.<init>(java.lang.String, com.urbanairship.android.layout.property.s, boolean, com.urbanairship.android.layout.reporting.a, com.urbanairship.json.JsonValue, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ToggleModel(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.info.C35676o0 r17, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r18, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r19, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r20) {
        /*
            r16 = this;
            java.lang.String r0 = "info"
            r1 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "formState"
            r13 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "env"
            r14 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "props"
            r15 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r2 = r17.mo106791a()
            com.urbanairship.android.layout.property.s r3 = r17.mo106802c()
            boolean r4 = r17.isRequired()
            com.urbanairship.android.layout.reporting.a r5 = r17.mo106827k()
            com.urbanairship.json.JsonValue r6 = r17.mo106828l()
            java.lang.String r7 = r17.getContentDescription()
            com.urbanairship.android.layout.property.f r8 = r17.getBackgroundColor()
            com.urbanairship.android.layout.property.c r9 = r17.mo106778h()
            com.urbanairship.android.layout.info.v0 r10 = r17.getVisibility()
            java.util.List r11 = r17.mo106779i()
            java.util.List r12 = r17.mo106774d()
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.ToggleModel.<init>(com.urbanairship.android.layout.info.o0, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
