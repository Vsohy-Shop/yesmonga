package com.urbanairship.android.layout.model;

import android.content.Context;
import android.view.View;
import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.reporting.C35865a;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class RadioInputController extends BaseModel<View, BaseModel.C35725a> {
    @C12579k

    /* renamed from: o */
    public final BaseModel<?, ?> f88353o;
    @C12579k

    /* renamed from: p */
    public final String f88354p;

    /* renamed from: q */
    public final boolean f88355q;
    @C12580l

    /* renamed from: r */
    public final C35865a f88356r;
    @C12580l

    /* renamed from: s */
    public final String f88357s;
    @C12579k

    /* renamed from: t */
    public final C35607n<C35608o.C35610b> f88358t;
    @C12579k

    /* renamed from: u */
    public final C35607n<C35608o.C35613e> f88359u;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RadioInputController(com.urbanairship.android.layout.model.BaseModel r18, java.lang.String r19, boolean r20, com.urbanairship.android.layout.reporting.C35865a r21, java.lang.String r22, com.urbanairship.android.layout.property.C35835f r23, com.urbanairship.android.layout.property.C35830c r24, com.urbanairship.android.layout.info.C35693v0 r25, java.util.List r26, java.util.List r27, com.urbanairship.android.layout.environment.C35607n r28, com.urbanairship.android.layout.environment.C35607n r29, com.urbanairship.android.layout.environment.ModelEnvironment r30, com.urbanairship.android.layout.model.C35804j r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
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
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0042
            r12 = r2
            goto L_0x0044
        L_0x0042:
            r12 = r27
        L_0x0044:
            r2 = r17
            r3 = r18
            r4 = r19
            r13 = r28
            r14 = r29
            r15 = r30
            r16 = r31
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.RadioInputController.<init>(com.urbanairship.android.layout.model.BaseModel, java.lang.String, boolean, com.urbanairship.android.layout.reporting.a, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @C12580l
    /* renamed from: N */
    public final String mo107111N() {
        return this.f88357s;
    }

    @C12579k
    /* renamed from: O */
    public final String mo107112O() {
        return this.f88354p;
    }

    @C12579k
    /* renamed from: P */
    public final BaseModel<?, ?> mo107113P() {
        return this.f88353o;
    }

    /* renamed from: Q */
    public final boolean mo107114Q() {
        return this.f88355q;
    }

    @C12579k
    /* renamed from: z */
    public View mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        return this.f88353o.mo106993h(context, pVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RadioInputController(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.BaseModel<?, ?> r15, @org.jetbrains.annotations.C12579k java.lang.String r16, boolean r17, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.reporting.C35865a r18, @org.jetbrains.annotations.C12580l java.lang.String r19, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r20, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r21, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r22, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r23, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r24, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r25, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35613e> r26, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r27, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r28) {
        /*
            r14 = this;
            r9 = r14
            r10 = r15
            r11 = r16
            r12 = r25
            r13 = r26
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "formState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "radioState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "environment"
            r7 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            r8 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.RADIO_INPUT_CONTROLLER
            r0 = r14
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f88353o = r10
            r9.f88354p = r11
            r0 = r17
            r9.f88355q = r0
            r0 = r18
            r9.f88356r = r0
            r0 = r19
            r9.f88357s = r0
            r9.f88358t = r12
            r9.f88359u = r13
            kotlinx.coroutines.o0 r0 = r14.mo107001p()
            r1 = 0
            r2 = 0
            com.urbanairship.android.layout.model.RadioInputController$1 r3 = new com.urbanairship.android.layout.model.RadioInputController$1
            r4 = 0
            r3.<init>(r14, r5, r4)
            r5 = 3
            r6 = 0
            r15 = r0
            r16 = r1
            r17 = r2
            r18 = r3
            r19 = r5
            r20 = r6
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r15, r16, r17, r18, r19, r20)
            kotlinx.coroutines.o0 r0 = r14.mo107001p()
            com.urbanairship.android.layout.model.RadioInputController$2 r3 = new com.urbanairship.android.layout.model.RadioInputController$2
            r3.<init>(r14, r4)
            r4 = 3
            r5 = 0
            r15 = r0
            r18 = r3
            r19 = r4
            r20 = r5
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.RadioInputController.<init>(com.urbanairship.android.layout.model.BaseModel, java.lang.String, boolean, com.urbanairship.android.layout.reporting.a, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RadioInputController(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.info.C35660g0 r17, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.BaseModel<?, ?> r18, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r19, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35613e> r20, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r21, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r22) {
        /*
            r16 = this;
            java.lang.String r0 = "info"
            r1 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "view"
            r2 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "formState"
            r12 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "radioState"
            r13 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "env"
            r14 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "props"
            r15 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r3 = r17.mo106791a()
            boolean r4 = r17.isRequired()
            com.urbanairship.android.layout.reporting.a r5 = r17.mo106805l()
            java.lang.String r6 = r17.getContentDescription()
            com.urbanairship.android.layout.property.f r7 = r17.getBackgroundColor()
            com.urbanairship.android.layout.property.c r8 = r17.mo106778h()
            com.urbanairship.android.layout.info.v0 r9 = r17.getVisibility()
            java.util.List r10 = r17.mo106779i()
            java.util.List r11 = r17.mo106774d()
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.RadioInputController.<init>(com.urbanairship.android.layout.info.g0, com.urbanairship.android.layout.model.BaseModel, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
