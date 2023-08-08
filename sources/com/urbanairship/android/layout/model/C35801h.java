package com.urbanairship.android.layout.model;

import android.content.Context;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.info.C35694w;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35850q;
import com.urbanairship.android.layout.view.LabelView;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.model.h */
public final class C35801h extends BaseModel<LabelView, BaseModel.C35725a> {
    @C12579k

    /* renamed from: o */
    public final String f88416o;
    @C12579k

    /* renamed from: p */
    public final C35850q f88417p;
    @C12580l

    /* renamed from: q */
    public final String f88418q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C35801h(java.lang.String r15, com.urbanairship.android.layout.property.C35850q r16, java.lang.String r17, com.urbanairship.android.layout.property.C35835f r18, com.urbanairship.android.layout.property.C35830c r19, com.urbanairship.android.layout.info.C35693v0 r20, java.util.List r21, java.util.List r22, com.urbanairship.android.layout.environment.ModelEnvironment r23, com.urbanairship.android.layout.model.C35804j r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r17
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r18
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r19
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r20
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r10 = r2
            goto L_0x002b
        L_0x0029:
            r10 = r21
        L_0x002b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0031
            r11 = r2
            goto L_0x0033
        L_0x0031:
            r11 = r22
        L_0x0033:
            r3 = r14
            r4 = r15
            r5 = r16
            r12 = r23
            r13 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35801h.<init>(java.lang.String, com.urbanairship.android.layout.property.q, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @C12580l
    /* renamed from: K */
    public final String mo107214K() {
        return this.f88418q;
    }

    @C12579k
    /* renamed from: L */
    public final String mo107215L() {
        return this.f88416o;
    }

    @C12579k
    /* renamed from: M */
    public final C35850q mo107216M() {
        return this.f88417p;
    }

    @C12579k
    /* renamed from: N */
    public LabelView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        LabelView labelView = new LabelView(context, this);
        labelView.setId(mo107003r());
        return labelView;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35801h(@org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.property.C35850q r14, @org.jetbrains.annotations.C12580l java.lang.String r15, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r16, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r17, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r18, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r19, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r20, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r21, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r22) {
        /*
            r12 = this;
            r9 = r12
            r10 = r13
            r11 = r14
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "textAppearance"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "environment"
            r7 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            r8 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.LABEL
            r0 = r12
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f88416o = r10
            r9.f88417p = r11
            r0 = r15
            r9.f88418q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35801h.<init>(java.lang.String, com.urbanairship.android.layout.property.q, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C35801h(@C12579k C35694w wVar, @C12579k ModelEnvironment modelEnvironment, @C12579k C35804j jVar) {
        this(wVar.mo106847k(), wVar.mo106848l(), wVar.getContentDescription(), wVar.getBackgroundColor(), wVar.mo106778h(), wVar.getVisibility(), wVar.mo106779i(), wVar.mo106774d(), modelEnvironment, jVar);
        Intrinsics.checkNotNullParameter(wVar, C28531e0.f69094x);
        Intrinsics.checkNotNullParameter(modelEnvironment, "env");
        Intrinsics.checkNotNullParameter(jVar, "props");
    }
}
