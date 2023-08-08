package com.urbanairship.android.layout.model;

import android.content.Context;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.property.C35838i;
import com.urbanairship.android.layout.util.ViewExtensionsKt;
import com.urbanairship.android.layout.view.CheckboxView;
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

public final class CheckboxModel extends C35793b<CheckboxView> {
    @C12579k

    /* renamed from: s */
    public final JsonValue f88322s;
    @C12579k

    /* renamed from: t */
    public final C35607n<C35608o.C35609a> f88323t;
    @C12579k

    /* renamed from: u */
    public final C35607n<C35608o.C35610b> f88324u;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CheckboxModel(com.urbanairship.android.layout.property.C35852s r17, com.urbanairship.json.JsonValue r18, java.lang.String r19, com.urbanairship.android.layout.property.C35835f r20, com.urbanairship.android.layout.property.C35830c r21, com.urbanairship.android.layout.info.C35693v0 r22, java.util.List r23, java.util.List r24, com.urbanairship.android.layout.environment.C35607n r25, com.urbanairship.android.layout.environment.C35607n r26, com.urbanairship.android.layout.environment.ModelEnvironment r27, com.urbanairship.android.layout.model.C35804j r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r19
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r20
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r21
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r22
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r10 = r2
            goto L_0x002b
        L_0x0029:
            r10 = r23
        L_0x002b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0031
            r11 = r2
            goto L_0x0033
        L_0x0031:
            r11 = r24
        L_0x0033:
            r3 = r16
            r4 = r17
            r5 = r18
            r12 = r25
            r13 = r26
            r14 = r27
            r15 = r28
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.CheckboxModel.<init>(com.urbanairship.android.layout.property.s, com.urbanairship.json.JsonValue, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @C12579k
    /* renamed from: T */
    public CheckboxView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        CheckboxView checkboxView = new CheckboxView(context, this);
        checkboxView.setId(mo107003r());
        return checkboxView;
    }

    /* renamed from: U */
    public void mo106983B(@C12579k CheckboxView checkboxView) {
        Intrinsics.checkNotNullParameter(checkboxView, C40383c.f102945c);
        C11723c2 unused = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new CheckboxModel$onViewAttached$1(this, (C11045c<? super CheckboxModel$onViewAttached$1>) null), 3, (Object) null);
        C11944n<Boolean> G1 = C11909g.m47368G1(ViewExtensionsKt.m148028c(checkboxView), mo107004s(), C11948r.f29534a.mo24272c(), 1);
        C11723c2 unused2 = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new CheckboxModel$onViewAttached$2(G1, this, (C11045c<? super CheckboxModel$onViewAttached$2>) null), 3, (Object) null);
        if (C35838i.m147766b(mo106998m())) {
            C11723c2 unused3 = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new CheckboxModel$onViewAttached$3(G1, this, (C11045c<? super CheckboxModel$onViewAttached$3>) null), 3, (Object) null);
        }
    }

    /* renamed from: V */
    public void mo106984C(@C12579k CheckboxView checkboxView) {
        Intrinsics.checkNotNullParameter(checkboxView, C40383c.f102945c);
        super.mo106984C(checkboxView);
        mo106982A(new CheckboxModel$onViewCreated$1(this, (C11045c<? super CheckboxModel$onViewCreated$1>) null));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CheckboxModel(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.property.C35852s r17, @org.jetbrains.annotations.C12579k com.urbanairship.json.JsonValue r18, @org.jetbrains.annotations.C12580l java.lang.String r19, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r20, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r21, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r22, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r23, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r24, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35609a> r25, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r26, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r27, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r28) {
        /*
            r16 = this;
            r12 = r16
            r13 = r18
            r14 = r25
            r15 = r26
            java.lang.String r0 = "toggleStyle"
            r2 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "reportingValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "checkboxState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "formState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "environment"
            r10 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "properties"
            r11 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.CHECKBOX
            com.urbanairship.android.layout.property.ToggleType r3 = r17.mo107377b()
            java.lang.String r0 = "toggleStyle.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r0 = r16
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f88322s = r13
            r12.f88323t = r14
            r12.f88324u = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.CheckboxModel.<init>(com.urbanairship.android.layout.property.s, com.urbanairship.json.JsonValue, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CheckboxModel(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.info.C35663i r15, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35609a> r16, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r17, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r18, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r19) {
        /*
            r14 = this;
            java.lang.String r0 = "info"
            r1 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "checkboxState"
            r10 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "formState"
            r11 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "env"
            r12 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "props"
            r13 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.urbanairship.android.layout.property.s r2 = r15.mo106802c()
            com.urbanairship.json.JsonValue r3 = r15.mo106810k()
            java.lang.String r4 = r15.getContentDescription()
            com.urbanairship.android.layout.property.f r5 = r15.getBackgroundColor()
            com.urbanairship.android.layout.property.c r6 = r15.mo106778h()
            com.urbanairship.android.layout.info.v0 r7 = r15.getVisibility()
            java.util.List r8 = r15.mo106779i()
            java.util.List r9 = r15.mo106774d()
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.CheckboxModel.<init>(com.urbanairship.android.layout.info.i, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
