package com.urbanairship.android.layout.model;

import android.content.Context;
import android.view.View;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.info.C35648b0;
import com.urbanairship.android.layout.reporting.FormData;
import com.urbanairship.iam.events.C9175a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.model.k */
public final class C35805k extends BaseFormController<View> {
    @C12579k

    /* renamed from: v */
    public final BaseModel<?, ?> f88424v;
    @C12579k

    /* renamed from: w */
    public final String f88425w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C35805k(com.urbanairship.android.layout.model.BaseModel r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, com.urbanairship.android.layout.property.FormBehaviorType r25, java.util.List r26, com.urbanairship.android.layout.property.C35835f r27, com.urbanairship.android.layout.property.C35830c r28, com.urbanairship.android.layout.info.C35693v0 r29, java.util.List r30, java.util.List r31, com.urbanairship.android.layout.environment.C35607n r32, com.urbanairship.android.layout.environment.C35607n r33, com.urbanairship.android.layout.environment.C35607n r34, com.urbanairship.android.layout.environment.ModelEnvironment r35, com.urbanairship.android.layout.model.C35804j r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = r2
            goto L_0x000b
        L_0x0009:
            r9 = r26
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r10 = r2
            goto L_0x0013
        L_0x0011:
            r10 = r27
        L_0x0013:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0019
            r11 = r2
            goto L_0x001b
        L_0x0019:
            r11 = r28
        L_0x001b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0021
            r12 = r2
            goto L_0x0023
        L_0x0021:
            r12 = r29
        L_0x0023:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0029
            r13 = r2
            goto L_0x002b
        L_0x0029:
            r13 = r30
        L_0x002b:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0031
            r14 = r2
            goto L_0x0033
        L_0x0031:
            r14 = r31
        L_0x0033:
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r15 = r32
            r16 = r33
            r17 = r34
            r18 = r35
            r19 = r36
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35805k.<init>(com.urbanairship.android.layout.model.BaseModel, java.lang.String, java.lang.String, java.lang.String, com.urbanairship.android.layout.property.FormBehaviorType, java.util.List, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @C12579k
    /* renamed from: S */
    public BaseModel<?, ?> mo106957S() {
        return this.f88424v;
    }

    @C12579k
    /* renamed from: X */
    public FormData.C35860e mo106954P(@C12579k C35608o.C35610b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "state");
        return new FormData.C35860e(mo106955Q(), this.f88425w, mo106956R(), CollectionsKt___CollectionsKt.m40582V5(bVar.mo106704r().values()));
    }

    @C12579k
    /* renamed from: z */
    public View mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        return mo106957S().mo106993h(context, pVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35805k(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.BaseModel<?, ?> r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k java.lang.String r19, @org.jetbrains.annotations.C12580l java.lang.String r20, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.FormBehaviorType r21, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r22, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r23, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r24, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r25, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r26, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r27, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r28, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r29, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35612d> r30, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r31, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r32) {
        /*
            r16 = this;
            r15 = r16
            r14 = r17
            r13 = r18
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "npsIdentifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "identifier"
            r2 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "formState"
            r11 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "environment"
            r12 = r31
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "properties"
            r10 = r32
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.NPS_FORM_CONTROLLER
            r0 = r16
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r12 = r29
            r13 = r30
            r14 = r31
            r15 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r17
            r0.f88424v = r1
            r1 = r18
            r0.f88425w = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35805k.<init>(com.urbanairship.android.layout.model.BaseModel, java.lang.String, java.lang.String, java.lang.String, com.urbanairship.android.layout.property.FormBehaviorType, java.util.List, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C35805k(@C12579k C35648b0 b0Var, @C12579k BaseModel<?, ?> baseModel, @C12579k C35607n<C35608o.C35610b> nVar, @C12580l C35607n<C35608o.C35610b> nVar2, @C12580l C35607n<C35608o.C35612d> nVar3, @C12579k ModelEnvironment modelEnvironment, @C12579k C35804j jVar) {
        this(baseModel, b0Var.mo106790l(), b0Var.mo106791a(), b0Var.getResponseType(), b0Var.mo106825g(), b0Var.mo106824e(), b0Var.getBackgroundColor(), b0Var.mo106778h(), b0Var.getVisibility(), b0Var.mo106779i(), b0Var.mo106774d(), nVar, nVar2, nVar3, modelEnvironment, jVar);
        Intrinsics.checkNotNullParameter(b0Var, C28531e0.f69094x);
        Intrinsics.checkNotNullParameter(baseModel, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(nVar, "formState");
        Intrinsics.checkNotNullParameter(modelEnvironment, "env");
        Intrinsics.checkNotNullParameter(jVar, "props");
    }
}
