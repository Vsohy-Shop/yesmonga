package com.urbanairship.android.layout.model;

import android.content.Context;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.property.C35838i;
import com.urbanairship.android.layout.util.ViewExtensionsKt;
import com.urbanairship.android.layout.view.RadioInputView;
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

public final class RadioInputModel extends C35793b<RadioInputView> {
    @C12579k

    /* renamed from: s */
    public final JsonValue f88363s;
    @C12580l

    /* renamed from: t */
    public final JsonValue f88364t;
    @C12579k

    /* renamed from: u */
    public final C35607n<C35608o.C35613e> f88365u;
    @C12579k

    /* renamed from: v */
    public final C35607n<C35608o.C35610b> f88366v;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RadioInputModel(com.urbanairship.android.layout.property.C35852s r18, com.urbanairship.json.JsonValue r19, com.urbanairship.json.JsonValue r20, java.lang.String r21, com.urbanairship.android.layout.property.C35835f r22, com.urbanairship.android.layout.property.C35830c r23, com.urbanairship.android.layout.info.C35693v0 r24, java.util.List r25, java.util.List r26, com.urbanairship.android.layout.environment.C35607n r27, com.urbanairship.android.layout.environment.C35607n r28, com.urbanairship.android.layout.environment.ModelEnvironment r29, com.urbanairship.android.layout.model.C35804j r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r20
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r21
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r22
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r23
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r10 = r2
            goto L_0x002b
        L_0x0029:
            r10 = r24
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r11 = r2
            goto L_0x0033
        L_0x0031:
            r11 = r25
        L_0x0033:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0039
            r12 = r2
            goto L_0x003b
        L_0x0039:
            r12 = r26
        L_0x003b:
            r3 = r17
            r4 = r18
            r5 = r19
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.RadioInputModel.<init>(com.urbanairship.android.layout.property.s, com.urbanairship.json.JsonValue, com.urbanairship.json.JsonValue, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @C12579k
    /* renamed from: U */
    public RadioInputView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        RadioInputView radioInputView = new RadioInputView(context, this);
        radioInputView.setId(mo107003r());
        return radioInputView;
    }

    /* renamed from: V */
    public void mo106983B(@C12579k RadioInputView radioInputView) {
        Intrinsics.checkNotNullParameter(radioInputView, C40383c.f102945c);
        C11723c2 unused = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new RadioInputModel$onViewAttached$1(this, (C11045c<? super RadioInputModel$onViewAttached$1>) null), 3, (Object) null);
        C11944n<Boolean> G1 = C11909g.m47368G1(ViewExtensionsKt.m148028c(radioInputView), mo107004s(), C11948r.f29534a.mo24272c(), 1);
        C11723c2 unused2 = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new RadioInputModel$onViewAttached$2(G1, this, (C11045c<? super RadioInputModel$onViewAttached$2>) null), 3, (Object) null);
        if (C35838i.m147766b(mo106998m())) {
            C11723c2 unused3 = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new RadioInputModel$onViewAttached$3(G1, this, (C11045c<? super RadioInputModel$onViewAttached$3>) null), 3, (Object) null);
        }
    }

    /* renamed from: W */
    public void mo106984C(@C12579k RadioInputView radioInputView) {
        Intrinsics.checkNotNullParameter(radioInputView, C40383c.f102945c);
        super.mo106984C(radioInputView);
        mo106982A(new RadioInputModel$onViewCreated$1(this, (C11045c<? super RadioInputModel$onViewCreated$1>) null));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RadioInputModel(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.property.C35852s r17, @org.jetbrains.annotations.C12579k com.urbanairship.json.JsonValue r18, @org.jetbrains.annotations.C12580l com.urbanairship.json.JsonValue r19, @org.jetbrains.annotations.C12580l java.lang.String r20, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r21, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r22, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r23, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r24, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r25, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35613e> r26, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r27, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r28, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r29) {
        /*
            r16 = this;
            r12 = r16
            r13 = r18
            r14 = r26
            r15 = r27
            java.lang.String r0 = "toggleStyle"
            r2 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "reportingValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "radioState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "formState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "environment"
            r10 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "properties"
            r11 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.RADIO_INPUT
            com.urbanairship.android.layout.property.ToggleType r3 = r17.mo107377b()
            java.lang.String r0 = "toggleStyle.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r0 = r16
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f88363s = r13
            r0 = r19
            r12.f88364t = r0
            r12.f88365u = r14
            r12.f88366v = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.RadioInputModel.<init>(com.urbanairship.android.layout.property.s, com.urbanairship.json.JsonValue, com.urbanairship.json.JsonValue, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RadioInputModel(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.info.C35662h0 r16, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35613e> r17, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r18, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r19, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r20) {
        /*
            r15 = this;
            java.lang.String r0 = "info"
            r1 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "radioState"
            r11 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "formState"
            r12 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "env"
            r13 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "props"
            r14 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            com.urbanairship.android.layout.property.s r2 = r16.mo106802c()
            com.urbanairship.json.JsonValue r3 = r16.mo106809l()
            com.urbanairship.json.JsonValue r4 = r16.mo106808k()
            java.lang.String r5 = r16.getContentDescription()
            com.urbanairship.android.layout.property.f r6 = r16.getBackgroundColor()
            com.urbanairship.android.layout.property.c r7 = r16.mo106778h()
            com.urbanairship.android.layout.info.v0 r8 = r16.getVisibility()
            java.util.List r9 = r16.mo106779i()
            java.util.List r10 = r16.mo106774d()
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.RadioInputModel.<init>(com.urbanairship.android.layout.info.h0, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
