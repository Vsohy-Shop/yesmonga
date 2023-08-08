package com.urbanairship.android.layout.model;

import android.content.Context;
import android.view.View;
import androidx.annotation.C0366r;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.info.C35652d0;
import com.urbanairship.android.layout.info.C35693v0;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.view.PagerIndicatorView;
import com.urbanairship.iam.events.C9175a;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PagerIndicatorModel extends BaseModel<PagerIndicatorView, C35748a> {
    @C12579k

    /* renamed from: o */
    public final C35652d0.C35654b f88337o;

    /* renamed from: p */
    public final int f88338p;
    @C12580l

    /* renamed from: q */
    public C35748a f88339q;
    @C12579k

    /* renamed from: r */
    public final HashMap<Integer, Integer> f88340r;

    /* renamed from: com.urbanairship.android.layout.model.PagerIndicatorModel$a */
    public interface C35748a extends BaseModel.C35725a {
        /* renamed from: c */
        void mo107090c(int i, int i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagerIndicatorModel(C35652d0.C35654b bVar, int i, C35835f fVar, C35830c cVar, C35693v0 v0Var, List list, List list2, ModelEnvironment modelEnvironment, C35804j jVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, i, (i2 & 4) != 0 ? null : fVar, (i2 & 8) != 0 ? null : cVar, (i2 & 16) != 0 ? null : v0Var, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : list2, modelEnvironment, jVar);
    }

    @C12579k
    /* renamed from: K */
    public final C35652d0.C35654b mo107083K() {
        return this.f88337o;
    }

    @C0366r(unit = 0)
    /* renamed from: L */
    public final int mo107084L() {
        return this.f88338p;
    }

    /* renamed from: M */
    public final int mo107085M(int i) {
        HashMap<Integer, Integer> hashMap = this.f88340r;
        Integer valueOf = Integer.valueOf(i);
        Integer num = hashMap.get(valueOf);
        if (num == null) {
            num = Integer.valueOf(View.generateViewId());
            hashMap.put(valueOf, num);
        }
        return num.intValue();
    }

    @C12580l
    /* renamed from: N */
    public C35748a mo107000o() {
        return this.f88339q;
    }

    @C12579k
    /* renamed from: O */
    public PagerIndicatorView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        PagerIndicatorView pagerIndicatorView = new PagerIndicatorView(context, this);
        pagerIndicatorView.setId(mo107003r());
        return pagerIndicatorView;
    }

    /* renamed from: P */
    public void mo106983B(@C12579k PagerIndicatorView pagerIndicatorView) {
        Intrinsics.checkNotNullParameter(pagerIndicatorView, C40383c.f102945c);
        C11723c2 unused = C12038j.m48061f(mo107001p(), (CoroutineContext) null, (CoroutineStart) null, new PagerIndicatorModel$onViewAttached$1(this, (C11045c<? super PagerIndicatorModel$onViewAttached$1>) null), 3, (Object) null);
    }

    /* renamed from: Q */
    public void mo106988H(@C12580l C35748a aVar) {
        C11952u<C35608o.C35612d> a;
        C35608o.C35612d value;
        C35748a N;
        this.f88339q = aVar;
        C35607n<C35608o.C35612d> d = mo106999n().mo106661d();
        if (d != null && (a = d.mo106666a()) != null && (value = a.getValue()) != null && (N = mo107000o()) != null) {
            N.mo107090c(value.mo106736p().size(), value.mo106735o());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PagerIndicatorModel(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.info.C35652d0.C35654b r12, int r13, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r14, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r15, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r16, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r17, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r18, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r19, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r20) {
        /*
            r11 = this;
            r9 = r11
            r10 = r12
            java.lang.String r0 = "bindings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "environment"
            r7 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            r8 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.PAGER_INDICATOR
            r0 = r11
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f88337o = r10
            r0 = r13
            r9.f88338p = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.f88340r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.PagerIndicatorModel.<init>(com.urbanairship.android.layout.info.d0$b, int, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PagerIndicatorModel(@C12579k C35652d0 d0Var, @C12579k ModelEnvironment modelEnvironment, @C12579k C35804j jVar) {
        this(d0Var.mo106794k(), d0Var.mo106795l(), d0Var.getBackgroundColor(), d0Var.mo106778h(), d0Var.getVisibility(), d0Var.mo106779i(), d0Var.mo106774d(), modelEnvironment, jVar);
        Intrinsics.checkNotNullParameter(d0Var, C28531e0.f69094x);
        Intrinsics.checkNotNullParameter(modelEnvironment, "env");
        Intrinsics.checkNotNullParameter(jVar, "props");
    }
}
