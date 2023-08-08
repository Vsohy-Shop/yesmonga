package com.urbanairship.android.layout.model;

import android.content.Context;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.view.LabelButtonView;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.model.g */
public final class C35800g extends ButtonModel<LabelButtonView> {
    @C12579k

    /* renamed from: v */
    public final C35801h f88414v;
    @C12579k

    /* renamed from: w */
    public final String f88415w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C35800g(java.lang.String r19, com.urbanairship.android.layout.model.C35801h r20, java.util.Map r21, java.util.List r22, java.lang.String r23, com.urbanairship.android.layout.property.C35835f r24, com.urbanairship.android.layout.property.C35830c r25, com.urbanairship.android.layout.info.C35693v0 r26, java.util.List r27, java.util.List r28, com.urbanairship.android.layout.environment.C35607n r29, com.urbanairship.android.layout.environment.C35607n r30, com.urbanairship.android.layout.environment.ModelEnvironment r31, com.urbanairship.android.layout.model.C35804j r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r21
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r23
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r24
        L_0x001b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r25
        L_0x0023:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r26
        L_0x002b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0031
            r12 = r2
            goto L_0x0033
        L_0x0031:
            r12 = r27
        L_0x0033:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0039
            r13 = r2
            goto L_0x003b
        L_0x0039:
            r13 = r28
        L_0x003b:
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r14 = r29
            r15 = r30
            r16 = r31
            r17 = r32
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35800g.<init>(java.lang.String, com.urbanairship.android.layout.model.h, java.util.Map, java.util.List, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @C12579k
    /* renamed from: U */
    public String mo107034U() {
        return this.f88415w;
    }

    @C12579k
    /* renamed from: a0 */
    public final C35801h mo107212a0() {
        return this.f88414v;
    }

    @C12579k
    /* renamed from: b0 */
    public LabelButtonView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        LabelButtonView labelButtonView = new LabelButtonView(context, this);
        labelButtonView.setId(mo107003r());
        return labelButtonView;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35800g(@org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35801h r18, @org.jetbrains.annotations.C12580l java.util.Map<java.lang.String, ? extends com.urbanairship.json.JsonValue> r19, @org.jetbrains.annotations.C12579k java.util.List<? extends com.urbanairship.android.layout.property.ButtonClickBehaviorType> r20, @org.jetbrains.annotations.C12580l java.lang.String r21, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r22, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r23, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r24, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r25, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r26, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r27, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35612d> r28, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r29, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r30) {
        /*
            r16 = this;
            r15 = r16
            r14 = r18
            java.lang.String r0 = "identifier"
            r13 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "clickBehaviors"
            r4 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "environment"
            r12 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "properties"
            r11 = r30
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.LABEL_BUTTON
            r0 = r16
            r2 = r17
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r18
            r15.f88414v = r0
            if (r21 != 0) goto L_0x005c
            java.lang.String r0 = r18.mo107215L()
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0056
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            if (r1 == 0) goto L_0x005e
            r0 = r17
            goto L_0x005e
        L_0x005c:
            r0 = r21
        L_0x005e:
            r15.f88415w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35800g.<init>(java.lang.String, com.urbanairship.android.layout.model.h, java.util.Map, java.util.List, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35800g(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.info.C35692v r17, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35801h r18, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r19, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35612d> r20, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r21, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r22) {
        /*
            r16 = this;
            java.lang.String r0 = "info"
            r1 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "label"
            r3 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "env"
            r14 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "props"
            r15 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r2 = r17.mo106791a()
            java.util.Map r4 = r17.mo106792b()
            java.util.List r5 = r17.mo106793f()
            java.lang.String r6 = r17.getContentDescription()
            com.urbanairship.android.layout.property.f r7 = r17.getBackgroundColor()
            com.urbanairship.android.layout.property.c r8 = r17.mo106778h()
            com.urbanairship.android.layout.info.v0 r9 = r17.getVisibility()
            java.util.List r10 = r17.mo106779i()
            java.util.List r0 = r17.mo106774d()
            if (r0 != 0) goto L_0x0046
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0046:
            r11 = r0
            r1 = r16
            r3 = r18
            r12 = r19
            r13 = r20
            r14 = r21
            r15 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35800g.<init>(com.urbanairship.android.layout.info.v, com.urbanairship.android.layout.model.h, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
