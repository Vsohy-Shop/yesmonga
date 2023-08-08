package com.urbanairship.android.layout.model;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35838i;
import com.urbanairship.android.layout.property.MediaType;
import com.urbanairship.android.layout.view.MediaView;
import com.urbanairship.iam.events.C9175a;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class MediaModel extends BaseModel<MediaView, BaseModel.C35725a> {
    @C12579k

    /* renamed from: o */
    public final String f88328o;
    @C12579k

    /* renamed from: p */
    public final MediaType f88329p;
    @C12579k

    /* renamed from: q */
    public final ImageView.ScaleType f88330q;
    @C12580l

    /* renamed from: r */
    public final String f88331r;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MediaModel(java.lang.String r16, com.urbanairship.android.layout.property.MediaType r17, android.widget.ImageView.ScaleType r18, java.lang.String r19, com.urbanairship.android.layout.property.C35835f r20, com.urbanairship.android.layout.property.C35830c r21, com.urbanairship.android.layout.info.C35693v0 r22, java.util.List r23, java.util.List r24, com.urbanairship.android.layout.environment.ModelEnvironment r25, com.urbanairship.android.layout.model.C35804j r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.MediaModel.<init>(java.lang.String, com.urbanairship.android.layout.property.MediaType, android.widget.ImageView$ScaleType, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @C12580l
    /* renamed from: K */
    public final String mo107070K() {
        return this.f88331r;
    }

    @C12579k
    /* renamed from: L */
    public final MediaType mo107071L() {
        return this.f88329p;
    }

    @C12579k
    /* renamed from: M */
    public final ImageView.ScaleType mo107072M() {
        return this.f88330q;
    }

    @C12579k
    /* renamed from: N */
    public final String mo107073N() {
        return this.f88328o;
    }

    @C12579k
    /* renamed from: O */
    public MediaView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        MediaView mediaView = new MediaView(context, this, pVar);
        mediaView.setId(mo107003r());
        return mediaView;
    }

    /* renamed from: P */
    public void mo106983B(@C12579k MediaView mediaView) {
        Intrinsics.checkNotNullParameter(mediaView, C40383c.f102945c);
        if (C35838i.m147766b(mo106998m())) {
            C11723c2 unused = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new MediaModel$onViewAttached$1(mediaView, this, (C11045c<? super MediaModel$onViewAttached$1>) null), 3, (Object) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaModel(@org.jetbrains.annotations.C12579k java.lang.String r14, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.property.MediaType r15, @org.jetbrains.annotations.C12579k android.widget.ImageView.ScaleType r16, @org.jetbrains.annotations.C12580l java.lang.String r17, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r18, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r19, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r20, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r21, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r22, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r23, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r24) {
        /*
            r13 = this;
            r9 = r13
            r10 = r14
            r11 = r15
            r12 = r16
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "mediaType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "scaleType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "environment"
            r7 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            r8 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.MEDIA
            r0 = r13
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f88328o = r10
            r9.f88329p = r11
            r9.f88330q = r12
            r0 = r17
            r9.f88331r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.MediaModel.<init>(java.lang.String, com.urbanairship.android.layout.property.MediaType, android.widget.ImageView$ScaleType, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaModel(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.info.C35646a0 r14, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r15, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r16) {
        /*
            r13 = this;
            java.lang.String r0 = "info"
            r1 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "env"
            r11 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "props"
            r12 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r2 = r14.mo106782m()
            com.urbanairship.android.layout.property.MediaType r3 = r14.mo106780k()
            android.widget.ImageView$ScaleType r4 = r14.mo106781l()
            java.lang.String r5 = r14.getContentDescription()
            com.urbanairship.android.layout.property.f r6 = r14.getBackgroundColor()
            com.urbanairship.android.layout.property.c r7 = r14.mo106778h()
            com.urbanairship.android.layout.info.v0 r8 = r14.getVisibility()
            java.util.List r9 = r14.mo106779i()
            java.util.List r10 = r14.mo106774d()
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.MediaModel.<init>(com.urbanairship.android.layout.info.a0, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
