package com.urbanairship.android.layout.model;

import android.content.Context;
import android.view.View;
import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.json.JsonValue;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class CheckboxController extends BaseModel<View, BaseModel.C35725a> {
    @C12579k

    /* renamed from: o */
    public final BaseModel<?, ?> f88311o;
    @C12579k

    /* renamed from: p */
    public final String f88312p;

    /* renamed from: q */
    public final boolean f88313q;

    /* renamed from: r */
    public final int f88314r;

    /* renamed from: s */
    public final int f88315s;
    @C12580l

    /* renamed from: t */
    public final String f88316t;
    @C12579k

    /* renamed from: u */
    public final C35607n<C35608o.C35610b> f88317u;
    @C12579k

    /* renamed from: v */
    public final C35607n<C35608o.C35609a> f88318v;

    /* JADX WARNING: type inference failed for: r22v0, types: [int] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CheckboxController(com.urbanairship.android.layout.model.BaseModel r19, java.lang.String r20, boolean r21, int r22, int r23, java.lang.String r24, com.urbanairship.android.layout.property.C35835f r25, com.urbanairship.android.layout.property.C35830c r26, com.urbanairship.android.layout.info.C35693v0 r27, java.util.List r28, java.util.List r29, com.urbanairship.android.layout.environment.C35607n r30, com.urbanairship.android.layout.environment.C35607n r31, com.urbanairship.android.layout.environment.ModelEnvironment r32, com.urbanairship.android.layout.model.C35804j r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r18 = this;
            r0 = r34
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r5 = r1
            goto L_0x000b
        L_0x0009:
            r5 = r21
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r6 = r5
            goto L_0x0013
        L_0x0011:
            r6 = r22
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001c
            r1 = 2147483647(0x7fffffff, float:NaN)
            r7 = r1
            goto L_0x001e
        L_0x001c:
            r7 = r23
        L_0x001e:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0025
            r8 = r2
            goto L_0x0027
        L_0x0025:
            r8 = r24
        L_0x0027:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002d
            r9 = r2
            goto L_0x002f
        L_0x002d:
            r9 = r25
        L_0x002f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0035
            r10 = r2
            goto L_0x0037
        L_0x0035:
            r10 = r26
        L_0x0037:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003d
            r11 = r2
            goto L_0x003f
        L_0x003d:
            r11 = r27
        L_0x003f:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0045
            r12 = r2
            goto L_0x0047
        L_0x0045:
            r12 = r28
        L_0x0047:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x004d
            r13 = r2
            goto L_0x004f
        L_0x004d:
            r13 = r29
        L_0x004f:
            r2 = r18
            r3 = r19
            r4 = r20
            r14 = r30
            r15 = r31
            r16 = r32
            r17 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.CheckboxController.<init>(com.urbanairship.android.layout.model.BaseModel, java.lang.String, boolean, int, int, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @C12580l
    /* renamed from: N */
    public final String mo107048N() {
        return this.f88316t;
    }

    @C12579k
    /* renamed from: O */
    public final String mo107049O() {
        return this.f88312p;
    }

    @C12579k
    /* renamed from: P */
    public final BaseModel<?, ?> mo107050P() {
        return this.f88311o;
    }

    /* renamed from: Q */
    public final boolean mo107051Q(Set<? extends JsonValue> set) {
        boolean z;
        boolean z2;
        int size = set.size();
        int i = this.f88314r;
        if (size > this.f88315s || i > size) {
            z = false;
        } else {
            z = true;
        }
        if (size != 0 || this.f88313q) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: z */
    public View mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        return this.f88311o.mo106993h(context, pVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CheckboxController(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.BaseModel<?, ?> r15, @org.jetbrains.annotations.C12579k java.lang.String r16, boolean r17, int r18, int r19, @org.jetbrains.annotations.C12580l java.lang.String r20, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r21, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r22, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r23, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r24, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r25, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r26, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35609a> r27, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r28, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r29) {
        /*
            r14 = this;
            r9 = r14
            r10 = r15
            r11 = r16
            r12 = r26
            r13 = r27
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "formState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "checkboxState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "environment"
            r7 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            r8 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.CHECKBOX_CONTROLLER
            r0 = r14
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f88311o = r10
            r9.f88312p = r11
            r0 = r17
            r9.f88313q = r0
            r0 = r18
            r9.f88314r = r0
            r0 = r19
            r9.f88315s = r0
            r0 = r20
            r9.f88316t = r0
            r9.f88317u = r12
            r9.f88318v = r13
            kotlinx.coroutines.o0 r0 = r14.mo107001p()
            r1 = 0
            r2 = 0
            com.urbanairship.android.layout.model.CheckboxController$1 r3 = new com.urbanairship.android.layout.model.CheckboxController$1
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
            com.urbanairship.android.layout.model.CheckboxController$2 r3 = new com.urbanairship.android.layout.model.CheckboxController$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.CheckboxController.<init>(com.urbanairship.android.layout.model.BaseModel, java.lang.String, boolean, int, int, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CheckboxController(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.info.C35661h r18, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.BaseModel<?, ?> r19, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r20, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35609a> r21, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r22, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r23) {
        /*
            r17 = this;
            java.lang.String r0 = "info"
            r1 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "view"
            r2 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "formState"
            r13 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "checkboxState"
            r14 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "env"
            r15 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "props"
            r12 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r3 = r18.mo106791a()
            boolean r4 = r18.isRequired()
            int r5 = r18.mo106807m()
            int r6 = r18.mo106806l()
            java.lang.String r7 = r18.getContentDescription()
            com.urbanairship.android.layout.property.f r8 = r18.getBackgroundColor()
            com.urbanairship.android.layout.property.c r9 = r18.mo106778h()
            com.urbanairship.android.layout.info.v0 r10 = r18.getVisibility()
            java.util.List r11 = r18.mo106779i()
            java.util.List r0 = r18.mo106774d()
            r1 = r17
            r12 = r0
            r16 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.CheckboxController.<init>(com.urbanairship.android.layout.info.h, com.urbanairship.android.layout.model.BaseModel, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
