package com.urbanairship.android.layout.model;

import android.content.Context;
import android.view.View;
import com.urbanairship.android.layout.environment.C35603k;
import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.event.ReportingEvent;
import com.urbanairship.android.layout.info.C35693v0;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.reporting.C35867c;
import com.urbanairship.android.layout.reporting.C35869e;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class PagerController extends BaseModel<View, BaseModel.C35725a> {
    @C12579k

    /* renamed from: o */
    public final BaseModel<?, ?> f88333o;
    @C12579k

    /* renamed from: p */
    public final String f88334p;
    @C12579k

    /* renamed from: q */
    public final C35607n<C35608o.C35612d> f88335q;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagerController(BaseModel baseModel, String str, C35835f fVar, C35830c cVar, C35693v0 v0Var, List list, List list2, C35607n nVar, ModelEnvironment modelEnvironment, C35804j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseModel, str, (i & 4) != 0 ? null : fVar, (i & 8) != 0 ? null : cVar, (i & 16) != 0 ? null : v0Var, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, nVar, modelEnvironment, jVar);
    }

    @C12579k
    /* renamed from: M */
    public final String mo107078M() {
        return this.f88334p;
    }

    @C12579k
    /* renamed from: N */
    public final BaseModel<?, ?> mo107079N() {
        return this.f88333o;
    }

    /* renamed from: O */
    public final void mo107080O(C35608o.C35612d dVar) {
        C35869e q = dVar.mo106737q();
        mo106986E(new ReportingEvent.C35622h(q, mo106997l().mo106629c().mo107378b()), C35603k.m146913i(mo106999n(), (C35867c) null, q, (String) null, 5, (Object) null));
    }

    @C12579k
    /* renamed from: z */
    public View mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        return this.f88333o.mo106993h(context, pVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PagerController(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.BaseModel<?, ?> r14, @org.jetbrains.annotations.C12579k java.lang.String r15, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r16, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r17, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r18, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r19, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r20, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35612d> r21, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r22, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r23) {
        /*
            r13 = this;
            r9 = r13
            r10 = r14
            r11 = r15
            r12 = r21
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "pagerState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "environment"
            r7 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            r8 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.PAGER_CONTROLLER
            r0 = r13
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f88333o = r10
            r9.f88334p = r11
            r9.f88335q = r12
            kotlinx.coroutines.o0 r0 = r13.mo107001p()
            r1 = 0
            r2 = 0
            com.urbanairship.android.layout.model.PagerController$1 r3 = new com.urbanairship.android.layout.model.PagerController$1
            r4 = 0
            r3.<init>(r13, r4)
            r4 = 3
            r5 = 0
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.PagerController.<init>(com.urbanairship.android.layout.model.BaseModel, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PagerController(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.info.C35650c0 r13, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.BaseModel<?, ?> r14, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35612d> r15, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r16, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r17) {
        /*
            r12 = this;
            java.lang.String r0 = "info"
            r1 = r13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "view"
            r2 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "pagerState"
            r9 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "env"
            r10 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "props"
            r11 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r3 = r13.mo106791a()
            com.urbanairship.android.layout.property.f r4 = r13.getBackgroundColor()
            com.urbanairship.android.layout.property.c r5 = r13.mo106778h()
            com.urbanairship.android.layout.info.v0 r6 = r13.getVisibility()
            java.util.List r7 = r13.mo106779i()
            java.util.List r8 = r13.mo106774d()
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.PagerController.<init>(com.urbanairship.android.layout.info.c0, com.urbanairship.android.layout.model.BaseModel, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
