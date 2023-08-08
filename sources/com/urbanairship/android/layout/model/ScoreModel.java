package com.urbanairship.android.layout.model;

import android.content.Context;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.environment.C35605l;
import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35838i;
import com.urbanairship.android.layout.property.C35844o;
import com.urbanairship.android.layout.reporting.C35865a;
import com.urbanairship.android.layout.reporting.FormData;
import com.urbanairship.android.layout.view.ScoreView;
import com.urbanairship.iam.events.C9175a;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ScoreModel extends BaseModel<ScoreView, C35772a> {
    @C12579k

    /* renamed from: o */
    public final C35844o f88374o;
    @C12579k

    /* renamed from: p */
    public final String f88375p;

    /* renamed from: q */
    public final boolean f88376q;
    @C12580l

    /* renamed from: r */
    public final String f88377r;
    @C12580l

    /* renamed from: s */
    public final C35865a f88378s;
    @C12579k

    /* renamed from: t */
    public final C35607n<C35608o.C35610b> f88379t;

    /* renamed from: com.urbanairship.android.layout.model.ScoreModel$a */
    public interface C35772a extends BaseModel.C35725a {
        /* renamed from: a */
        void mo107141a(@C12580l Integer num);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ScoreModel(com.urbanairship.android.layout.property.C35844o r17, java.lang.String r18, boolean r19, java.lang.String r20, com.urbanairship.android.layout.reporting.C35865a r21, com.urbanairship.android.layout.property.C35835f r22, com.urbanairship.android.layout.property.C35830c r23, com.urbanairship.android.layout.info.C35693v0 r24, java.util.List r25, java.util.List r26, com.urbanairship.android.layout.environment.C35607n r27, com.urbanairship.android.layout.environment.ModelEnvironment r28, com.urbanairship.android.layout.model.C35804j r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r5 = r1
            goto L_0x000b
        L_0x0009:
            r5 = r19
        L_0x000b:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0012
            r6 = r2
            goto L_0x0014
        L_0x0012:
            r6 = r20
        L_0x0014:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001a
            r7 = r2
            goto L_0x001c
        L_0x001a:
            r7 = r21
        L_0x001c:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0022
            r8 = r2
            goto L_0x0024
        L_0x0022:
            r8 = r22
        L_0x0024:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002a
            r9 = r2
            goto L_0x002c
        L_0x002a:
            r9 = r23
        L_0x002c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0032
            r10 = r2
            goto L_0x0034
        L_0x0032:
            r10 = r24
        L_0x0034:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003a
            r11 = r2
            goto L_0x003c
        L_0x003a:
            r11 = r25
        L_0x003c:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0042
            r12 = r2
            goto L_0x0044
        L_0x0042:
            r12 = r26
        L_0x0044:
            r2 = r16
            r3 = r17
            r4 = r18
            r13 = r27
            r14 = r28
            r15 = r29
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.ScoreModel.<init>(com.urbanairship.android.layout.property.o, java.lang.String, boolean, java.lang.String, com.urbanairship.android.layout.reporting.a, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @C12580l
    /* renamed from: M */
    public final String mo107133M() {
        return this.f88377r;
    }

    @C12579k
    /* renamed from: N */
    public final String mo107134N() {
        return this.f88375p;
    }

    @C12579k
    /* renamed from: O */
    public final C35844o mo107135O() {
        return this.f88374o;
    }

    /* renamed from: P */
    public final boolean mo107136P() {
        return this.f88376q;
    }

    @C12579k
    /* renamed from: Q */
    public ScoreView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Integer p;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        ScoreView scoreView = new ScoreView(context, this);
        scoreView.setId(mo107003r());
        FormData.C35862g gVar = (FormData.C35862g) C35605l.m146922a(this.f88379t, this.f88375p);
        if (!(gVar == null || (p = gVar.mo107386f()) == null)) {
            scoreView.setSelectedScore(Integer.valueOf(p.intValue()));
        }
        return scoreView;
    }

    /* renamed from: R */
    public void mo106983B(@C12579k ScoreView scoreView) {
        Intrinsics.checkNotNullParameter(scoreView, C40383c.f102945c);
        C11723c2 unused = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new ScoreModel$onViewAttached$1(scoreView, this, (C11045c<? super ScoreModel$onViewAttached$1>) null), 3, (Object) null);
        if (C35838i.m147766b(mo106998m())) {
            C11723c2 unused2 = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new ScoreModel$onViewAttached$2(scoreView, this, (C11045c<? super ScoreModel$onViewAttached$2>) null), 3, (Object) null);
        }
        C11723c2 unused3 = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new ScoreModel$onViewAttached$3(this, (C11045c<? super ScoreModel$onViewAttached$3>) null), 3, (Object) null);
    }

    /* renamed from: S */
    public void mo106984C(@C12579k ScoreView scoreView) {
        Intrinsics.checkNotNullParameter(scoreView, C40383c.f102945c);
        super.mo106984C(scoreView);
        mo106982A(new ScoreModel$onViewCreated$1(this, (C11045c<? super ScoreModel$onViewCreated$1>) null));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ScoreModel(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.property.C35844o r14, @org.jetbrains.annotations.C12579k java.lang.String r15, boolean r16, @org.jetbrains.annotations.C12580l java.lang.String r17, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.reporting.C35865a r18, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r19, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r20, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r21, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r22, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r23, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r24, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r25, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r26) {
        /*
            r13 = this;
            r9 = r13
            r10 = r14
            r11 = r15
            r12 = r24
            java.lang.String r0 = "style"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "formState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "environment"
            r7 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            r8 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.SCORE
            r0 = r13
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f88374o = r10
            r9.f88375p = r11
            r0 = r16
            r9.f88376q = r0
            r0 = r17
            r9.f88377r = r0
            r0 = r18
            r9.f88378s = r0
            r9.f88379t = r12
            com.urbanairship.android.layout.model.ScoreModel$1 r0 = new com.urbanairship.android.layout.model.ScoreModel$1
            r0.<init>(r13)
            r12.mo106668c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.ScoreModel.<init>(com.urbanairship.android.layout.property.o, java.lang.String, boolean, java.lang.String, com.urbanairship.android.layout.reporting.a, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ScoreModel(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.info.C35668k0 r16, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r17, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r18, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r19) {
        /*
            r15 = this;
            java.lang.String r0 = "info"
            r1 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "formState"
            r12 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "env"
            r13 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "props"
            r14 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            com.urbanairship.android.layout.property.o r2 = r16.mo106817l()
            java.lang.String r3 = r16.mo106791a()
            boolean r4 = r16.isRequired()
            java.lang.String r5 = r16.getContentDescription()
            com.urbanairship.android.layout.reporting.a r6 = r16.mo106816k()
            com.urbanairship.android.layout.property.f r7 = r16.getBackgroundColor()
            com.urbanairship.android.layout.property.c r8 = r16.mo106778h()
            com.urbanairship.android.layout.info.v0 r9 = r16.getVisibility()
            java.util.List r10 = r16.mo106779i()
            java.util.List r11 = r16.mo106774d()
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.ScoreModel.<init>(com.urbanairship.android.layout.info.k0, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
