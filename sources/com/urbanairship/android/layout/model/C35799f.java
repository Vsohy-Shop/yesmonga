package com.urbanairship.android.layout.model;

import android.content.Context;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.property.Image;
import com.urbanairship.android.layout.view.ImageButtonView;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.model.f */
public final class C35799f extends ButtonModel<ImageButtonView> {
    @C12579k

    /* renamed from: v */
    public final Image f88412v;
    @C12579k

    /* renamed from: w */
    public final String f88413w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C35799f(java.lang.String r19, com.urbanairship.android.layout.property.Image r20, java.util.Map r21, java.util.List r22, java.lang.String r23, com.urbanairship.android.layout.property.C35835f r24, com.urbanairship.android.layout.property.C35830c r25, com.urbanairship.android.layout.info.C35693v0 r26, java.util.List r27, java.util.List r28, com.urbanairship.android.layout.environment.C35607n r29, com.urbanairship.android.layout.environment.C35607n r30, com.urbanairship.android.layout.environment.ModelEnvironment r31, com.urbanairship.android.layout.model.C35804j r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35799f.<init>(java.lang.String, com.urbanairship.android.layout.property.Image, java.util.Map, java.util.List, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @C12579k
    /* renamed from: U */
    public String mo107034U() {
        return this.f88413w;
    }

    @C12579k
    /* renamed from: a0 */
    public final Image mo107210a0() {
        return this.f88412v;
    }

    @C12579k
    /* renamed from: b0 */
    public ImageButtonView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        ImageButtonView imageButtonView = new ImageButtonView(context, this, pVar);
        imageButtonView.setId(mo107003r());
        return imageButtonView;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35799f(@org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.property.Image r18, @org.jetbrains.annotations.C12580l java.util.Map<java.lang.String, ? extends com.urbanairship.json.JsonValue> r19, @org.jetbrains.annotations.C12579k java.util.List<? extends com.urbanairship.android.layout.property.ButtonClickBehaviorType> r20, @org.jetbrains.annotations.C12580l java.lang.String r21, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r22, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r23, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r24, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r25, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r26, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r27, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35612d> r28, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r29, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r30) {
        /*
            r16 = this;
            r15 = r16
            r14 = r18
            java.lang.String r0 = "identifier"
            r13 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "image"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "buttonClickBehaviors"
            r4 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "environment"
            r12 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "properties"
            r11 = r30
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.IMAGE_BUTTON
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
            r15.f88412v = r0
            if (r21 != 0) goto L_0x004d
            r0 = r17
            goto L_0x004f
        L_0x004d:
            r0 = r21
        L_0x004f:
            r15.f88413w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35799f.<init>(java.lang.String, com.urbanairship.android.layout.property.Image, java.util.Map, java.util.List, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35799f(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.info.C35685t r17, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r18, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35612d> r19, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r20, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r21) {
        /*
            r16 = this;
            java.lang.String r0 = "info"
            r1 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "env"
            r14 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "props"
            r15 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r2 = r17.mo106791a()
            com.urbanairship.android.layout.property.Image r3 = r17.mo106834k()
            java.util.Map r4 = r17.mo106792b()
            java.util.List r5 = r17.mo106793f()
            java.lang.String r6 = r17.getContentDescription()
            com.urbanairship.android.layout.property.f r7 = r17.getBackgroundColor()
            com.urbanairship.android.layout.property.c r8 = r17.mo106778h()
            com.urbanairship.android.layout.info.v0 r9 = r17.getVisibility()
            java.util.List r10 = r17.mo106779i()
            java.util.List r11 = r17.mo106774d()
            r1 = r16
            r12 = r18
            r13 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35799f.<init>(com.urbanairship.android.layout.info.t, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
