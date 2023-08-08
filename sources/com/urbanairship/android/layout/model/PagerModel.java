package com.urbanairship.android.layout.model;

import android.content.Context;
import android.view.View;
import com.google.android.gms.analytics.ecommerce.C40383c;
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
import com.urbanairship.android.layout.view.PagerView;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.json.JsonValue;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PagerModel extends BaseModel<PagerView, C35752b> {
    @C12579k

    /* renamed from: o */
    public final List<C35751a> f88342o;

    /* renamed from: p */
    public final boolean f88343p;
    @C12579k

    /* renamed from: q */
    public final C35607n<C35608o.C35612d> f88344q;

    /* renamed from: r */
    public final int f88345r;
    @C12579k

    /* renamed from: s */
    public final List<BaseModel<?, ?>> f88346s;
    @C12579k

    /* renamed from: t */
    public final Map<Integer, Integer> f88347t;

    /* renamed from: com.urbanairship.android.layout.model.PagerModel$a */
    public static final class C35751a {
        @C12579k

        /* renamed from: a */
        public final BaseModel<?, ?> f88348a;
        @C12579k

        /* renamed from: b */
        public final String f88349b;
        @C12580l

        /* renamed from: c */
        public final Map<String, JsonValue> f88350c;

        public C35751a(@C12579k BaseModel<?, ?> baseModel, @C12579k String str, @C12580l Map<String, ? extends JsonValue> map) {
            Intrinsics.checkNotNullParameter(baseModel, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(str, "identifier");
            this.f88348a = baseModel;
            this.f88349b = str;
            this.f88350c = map;
        }

        @C12580l
        /* renamed from: a */
        public final Map<String, JsonValue> mo107102a() {
            return this.f88350c;
        }

        @C12579k
        /* renamed from: b */
        public final String mo107103b() {
            return this.f88349b;
        }

        @C12579k
        /* renamed from: c */
        public final BaseModel<?, ?> mo107104c() {
            return this.f88348a;
        }
    }

    /* renamed from: com.urbanairship.android.layout.model.PagerModel$b */
    public interface C35752b extends BaseModel.C35725a {
        /* renamed from: d */
        void mo107105d(int i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagerModel(List list, boolean z, C35835f fVar, C35830c cVar, C35693v0 v0Var, List list2, List list3, C35607n nVar, ModelEnvironment modelEnvironment, C35804j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : fVar, (i & 8) != 0 ? null : cVar, (i & 16) != 0 ? null : v0Var, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : list3, nVar, modelEnvironment, jVar);
    }

    @C12579k
    /* renamed from: M */
    public final List<C35751a> mo107093M() {
        return this.f88342o;
    }

    /* renamed from: N */
    public final int mo107094N(int i) {
        Map<Integer, Integer> map = this.f88347t;
        Integer valueOf = Integer.valueOf(i);
        Integer num = map.get(valueOf);
        if (num == null) {
            num = Integer.valueOf(View.generateViewId());
            map.put(valueOf, num);
        }
        return num.intValue();
    }

    @C12579k
    /* renamed from: O */
    public final List<BaseModel<?, ?>> mo107095O() {
        return this.f88346s;
    }

    /* renamed from: P */
    public final int mo107096P() {
        return this.f88345r;
    }

    /* renamed from: Q */
    public final boolean mo107097Q() {
        return this.f88343p;
    }

    @C12579k
    /* renamed from: R */
    public PagerView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        PagerView pagerView = new PagerView(context, this, pVar);
        pagerView.setId(mo107003r());
        return pagerView;
    }

    /* renamed from: S */
    public void mo106983B(@C12579k PagerView pagerView) {
        Intrinsics.checkNotNullParameter(pagerView, C40383c.f102945c);
        C11723c2 unused = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new PagerModel$onViewAttached$1(this, (C11045c<? super PagerModel$onViewAttached$1>) null), 3, (Object) null);
        C11723c2 unused2 = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new PagerModel$onViewAttached$2(pagerView, this, (C11045c<? super PagerModel$onViewAttached$2>) null), 3, (Object) null);
    }

    /* renamed from: T */
    public final void mo107100T(C35608o.C35612d dVar) {
        C35869e q = dVar.mo106737q();
        mo106986E(new ReportingEvent.C35621g(q, dVar.mo106734n(), this.f88342o.get(dVar.mo106734n()).mo107103b(), dVar.mo106735o(), this.f88342o.get(dVar.mo106735o()).mo107103b()), C35603k.m146913i(mo106999n(), (C35867c) null, q, (String) null, 5, (Object) null));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PagerModel(@org.jetbrains.annotations.C12579k java.util.List<com.urbanairship.android.layout.model.PagerModel.C35751a> r13, boolean r14, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r15, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r16, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r17, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r18, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r19, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35612d> r20, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r21, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r22) {
        /*
            r12 = this;
            r9 = r12
            r10 = r13
            r11 = r20
            java.lang.String r0 = "items"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "pagerState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "environment"
            r7 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            r8 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.PAGER
            r0 = r12
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f88342o = r10
            r0 = r14
            r9.f88343p = r0
            r9.f88344q = r11
            int r0 = android.view.View.generateViewId()
            r9.f88345r = r0
            r0 = r10
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C10978t.m41495Y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x004a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r0.next()
            com.urbanairship.android.layout.model.PagerModel$a r2 = (com.urbanairship.android.layout.model.PagerModel.C35751a) r2
            com.urbanairship.android.layout.model.BaseModel r2 = r2.mo107104c()
            r1.add(r2)
            goto L_0x004a
        L_0x005e:
            r9.f88346s = r1
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r9.f88347t = r0
            com.urbanairship.android.layout.environment.n<com.urbanairship.android.layout.environment.o$d> r0 = r9.f88344q
            com.urbanairship.android.layout.model.PagerModel$1 r1 = new com.urbanairship.android.layout.model.PagerModel$1
            r1.<init>(r12)
            r0.mo106668c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.PagerModel.<init>(java.util.List, boolean, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PagerModel(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.info.C35656e0 r13, @org.jetbrains.annotations.C12579k java.util.List<com.urbanairship.android.layout.model.PagerModel.C35751a> r14, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35612d> r15, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r16, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r17) {
        /*
            r12 = this;
            java.lang.String r0 = "info"
            r1 = r13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "items"
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
            boolean r3 = r13.mo106801m()
            com.urbanairship.android.layout.property.f r4 = r13.getBackgroundColor()
            com.urbanairship.android.layout.property.c r5 = r13.mo106778h()
            com.urbanairship.android.layout.info.v0 r6 = r13.getVisibility()
            java.util.List r7 = r13.mo106779i()
            java.util.List r8 = r13.mo106774d()
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.PagerModel.<init>(com.urbanairship.android.layout.info.e0, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
