package com.urbanairship.android.layout.model;

import android.view.View;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35852s;
import com.urbanairship.android.layout.property.ToggleType;
import kotlin.C11079d2;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.model.b */
public abstract class C35793b<T extends View> extends BaseModel<T, C35794a> {
    @C12579k

    /* renamed from: o */
    public final C35852s f88404o;
    @C12579k

    /* renamed from: p */
    public final ToggleType f88405p;
    @C12580l

    /* renamed from: q */
    public final String f88406q;

    /* renamed from: r */
    public final int f88407r;

    /* renamed from: com.urbanairship.android.layout.model.b$a */
    public interface C35794a extends BaseModel.C35725a {
        void setChecked(boolean z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C35793b(com.urbanairship.android.layout.property.ViewType r16, com.urbanairship.android.layout.property.C35852s r17, com.urbanairship.android.layout.property.ToggleType r18, java.lang.String r19, com.urbanairship.android.layout.property.C35835f r20, com.urbanairship.android.layout.property.C35830c r21, com.urbanairship.android.layout.info.C35693v0 r22, java.util.List r23, java.util.List r24, com.urbanairship.android.layout.environment.ModelEnvironment r25, com.urbanairship.android.layout.model.C35804j r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r19
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r20
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r21
        L_0x001b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r22
        L_0x0023:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r23
        L_0x002b:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0031
            r12 = r2
            goto L_0x0033
        L_0x0031:
            r12 = r24
        L_0x0033:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r13 = r25
            r14 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35793b.<init>(com.urbanairship.android.layout.property.ViewType, com.urbanairship.android.layout.property.s, com.urbanairship.android.layout.property.ToggleType, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: K */
    public final int mo107191K() {
        return this.f88407r;
    }

    @C12580l
    /* renamed from: L */
    public final String mo107192L() {
        return this.f88406q;
    }

    @C12579k
    /* renamed from: M */
    public final C35852s mo107193M() {
        return this.f88404o;
    }

    @C12579k
    /* renamed from: N */
    public final ToggleType mo107194N() {
        return this.f88405p;
    }

    @C12580l
    /* renamed from: O */
    public final C11079d2 mo107195O(boolean z) {
        C35794a aVar = (C35794a) mo107000o();
        if (aVar == null) {
            return null;
        }
        aVar.setChecked(z);
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: P */
    public final C11079d2 mo107196P(boolean z) {
        C35794a aVar = (C35794a) mo107000o();
        if (aVar == null) {
            return null;
        }
        aVar.setEnabled(z);
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35793b(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.property.ViewType r13, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.property.C35852s r14, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.property.ToggleType r15, @org.jetbrains.annotations.C12580l java.lang.String r16, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r17, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r18, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r19, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r20, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r21, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r22, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r23) {
        /*
            r12 = this;
            r9 = r12
            r10 = r14
            r11 = r15
            java.lang.String r0 = "viewType"
            r1 = r13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "style"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "toggleType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "environment"
            r7 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            r8 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r12
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f88404o = r10
            r9.f88405p = r11
            r0 = r16
            r9.f88406q = r0
            int r0 = android.view.View.generateViewId()
            r9.f88407r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35793b.<init>(com.urbanairship.android.layout.property.ViewType, com.urbanairship.android.layout.property.s, com.urbanairship.android.layout.property.ToggleType, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
