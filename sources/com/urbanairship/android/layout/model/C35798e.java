package com.urbanairship.android.layout.model;

import android.content.Context;
import android.view.View;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.reporting.FormData;
import com.urbanairship.iam.events.C9175a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.model.e */
public final class C35798e extends BaseFormController<View> {
    @C12579k

    /* renamed from: v */
    public final BaseModel<?, ?> f88411v;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C35798e(com.urbanairship.android.layout.model.BaseModel r20, com.urbanairship.android.layout.environment.C35607n r21, com.urbanairship.android.layout.environment.C35607n r22, com.urbanairship.android.layout.environment.C35607n r23, java.lang.String r24, java.lang.String r25, com.urbanairship.android.layout.property.FormBehaviorType r26, java.util.List r27, com.urbanairship.android.layout.property.C35835f r28, com.urbanairship.android.layout.property.C35830c r29, com.urbanairship.android.layout.info.C35693v0 r30, java.util.List r31, java.util.List r32, com.urbanairship.android.layout.environment.ModelEnvironment r33, com.urbanairship.android.layout.model.C35804j r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r11 = r2
            goto L_0x000b
        L_0x0009:
            r11 = r27
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0011
            r12 = r2
            goto L_0x0013
        L_0x0011:
            r12 = r28
        L_0x0013:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0019
            r13 = r2
            goto L_0x001b
        L_0x0019:
            r13 = r29
        L_0x001b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0021
            r14 = r2
            goto L_0x0023
        L_0x0021:
            r14 = r30
        L_0x0023:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0029
            r15 = r2
            goto L_0x002b
        L_0x0029:
            r15 = r31
        L_0x002b:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0032
            r16 = r2
            goto L_0x0034
        L_0x0032:
            r16 = r32
        L_0x0034:
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r17 = r33
            r18 = r34
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35798e.<init>(com.urbanairship.android.layout.model.BaseModel, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, java.lang.String, java.lang.String, com.urbanairship.android.layout.property.FormBehaviorType, java.util.List, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @C12579k
    /* renamed from: S */
    public BaseModel<?, ?> mo106957S() {
        return this.f88411v;
    }

    @C12579k
    /* renamed from: X */
    public FormData.C35859d mo106954P(@C12579k C35608o.C35610b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "state");
        return new FormData.C35859d(mo106955Q(), mo106956R(), CollectionsKt___CollectionsKt.m40582V5(bVar.mo106704r().values()));
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
    public C35798e(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.BaseModel<?, ?> r19, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r20, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r21, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35612d> r22, @org.jetbrains.annotations.C12579k java.lang.String r23, @org.jetbrains.annotations.C12580l java.lang.String r24, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.FormBehaviorType r25, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r26, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r27, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r28, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r29, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r30, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r31, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r32, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r33) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "formState"
            r13 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "identifier"
            r4 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            java.lang.String r1 = "environment"
            r15 = r32
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            java.lang.String r1 = "properties"
            r14 = r33
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            com.urbanairship.android.layout.property.ViewType r3 = com.urbanairship.android.layout.property.ViewType.FORM_CONTROLLER
            r2 = r18
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r14 = r21
            r15 = r22
            r16 = r32
            r17 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r18
            r1.f88411v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35798e.<init>(com.urbanairship.android.layout.model.BaseModel, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, java.lang.String, java.lang.String, com.urbanairship.android.layout.property.FormBehaviorType, java.util.List, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35798e(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.info.C35677p r18, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.BaseModel<?, ?> r19, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r20, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r21, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35612d> r22, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r23, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r24) {
        /*
            r17 = this;
            java.lang.String r0 = "info"
            r1 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "view"
            r2 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "formState"
            r3 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "env"
            r15 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "props"
            r14 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r6 = r18.mo106791a()
            java.lang.String r7 = r18.getResponseType()
            com.urbanairship.android.layout.property.FormBehaviorType r8 = r18.mo106825g()
            java.util.List r9 = r18.mo106824e()
            com.urbanairship.android.layout.property.f r10 = r18.getBackgroundColor()
            com.urbanairship.android.layout.property.c r11 = r18.mo106778h()
            com.urbanairship.android.layout.info.v0 r12 = r18.getVisibility()
            java.util.List r13 = r18.mo106779i()
            java.util.List r0 = r18.mo106774d()
            r1 = r17
            r4 = r21
            r5 = r22
            r14 = r0
            r16 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35798e.<init>(com.urbanairship.android.layout.info.p, com.urbanairship.android.layout.model.BaseModel, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
