package com.urbanairship.android.layout.model;

import android.content.Context;
import android.view.View;
import androidx.annotation.C0344h1;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.C36059m;
import com.urbanairship.android.layout.environment.C35603k;
import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.environment.LayoutEvent;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.event.ReportingEvent;
import com.urbanairship.android.layout.info.C35693v0;
import com.urbanairship.android.layout.model.BaseModel.C35725a;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.C35837h;
import com.urbanairship.android.layout.property.C35838i;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.property.StateAction;
import com.urbanairship.android.layout.property.ViewType;
import com.urbanairship.android.layout.reporting.C35865a;
import com.urbanairship.android.layout.reporting.C35867c;
import com.urbanairship.android.layout.reporting.C35868d;
import com.urbanairship.android.layout.reporting.C35869e;
import com.urbanairship.android.layout.util.C35915i;
import com.urbanairship.android.layout.widget.C36026n;
import com.urbanairship.android.layout.widget.CheckableView;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.json.C9329d;
import com.urbanairship.json.JsonValue;
import com.usabilla.sdk.ubform.net.C9851c;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11702a0;
import kotlinx.coroutines.C11719b3;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11968h2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public abstract class BaseModel<T extends View, L extends C35725a> {
    @C12579k

    /* renamed from: a */
    public final ViewType f88277a;
    @C12580l

    /* renamed from: b */
    public final C35835f f88278b;
    @C12580l

    /* renamed from: c */
    public final C35830c f88279c;
    @C12580l

    /* renamed from: d */
    public final C35693v0 f88280d;
    @C12580l

    /* renamed from: e */
    public final List<EventHandler> f88281e;
    @C12580l

    /* renamed from: f */
    public final List<EnableBehaviorType> f88282f;
    @C12579k

    /* renamed from: g */
    public final ModelEnvironment f88283g;
    @C12579k

    /* renamed from: h */
    public final C35804j f88284h;
    @C12580l

    /* renamed from: i */
    public L f88285i;

    /* renamed from: j */
    public final int f88286j;
    @C12579k

    /* renamed from: k */
    public final C12074o0 f88287k;
    @C12579k

    /* renamed from: l */
    public final C11702a0 f88288l;
    @C12579k

    /* renamed from: m */
    public final C12074o0 f88289m;
    @C12579k

    /* renamed from: n */
    public final C35603k f88290n;

    /* renamed from: com.urbanairship.android.layout.model.BaseModel$a */
    public interface C35725a {
        /* renamed from: f */
        void mo107011f(boolean z);

        void setEnabled(boolean z);
    }

    /* renamed from: com.urbanairship.android.layout.model.BaseModel$b */
    public static final class C35726b implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ BaseModel<T, L> f88291a;

        /* renamed from: b */
        public final /* synthetic */ T f88292b;

        public C35726b(BaseModel<T, L> baseModel, T t) {
            this.f88291a = baseModel;
            this.f88292b = t;
        }

        public void onViewAttachedToWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
            this.f88291a.mo106989I(this.f88292b);
            this.f88291a.mo106983B(this.f88292b);
        }

        public void onViewDetachedFromWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
            this.f88291a.mo106985D(this.f88292b);
            C11968h2.m47702v(this.f88291a.f88288l, (CancellationException) null, 1, (Object) null);
        }
    }

    public BaseModel(@C12579k ViewType viewType, @C12580l C35835f fVar, @C12580l C35830c cVar, @C12580l C35693v0 v0Var, @C12580l List<EventHandler> list, @C12580l List<? extends EnableBehaviorType> list2, @C12579k ModelEnvironment modelEnvironment, @C12579k C35804j jVar) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(modelEnvironment, C28534f.f69167m0);
        Intrinsics.checkNotNullParameter(jVar, "properties");
        this.f88277a = viewType;
        this.f88278b = fVar;
        this.f88279c = cVar;
        this.f88280d = v0Var;
        this.f88281e = list;
        this.f88282f = list2;
        this.f88283g = modelEnvironment;
        this.f88284h = jVar;
        this.f88286j = View.generateViewId();
        this.f88287k = modelEnvironment.mo106633g();
        C11702a0 c = C11719b3.m46155c((C11723c2) null, 1, (Object) null);
        this.f88288l = c;
        this.f88289m = C12079p0.m48260a(C11768d1.m46783e().mo23706a0().mo7443Q(c));
        this.f88290n = modelEnvironment.mo106632f();
    }

    /* renamed from: G */
    public static /* synthetic */ void m147326G(BaseModel baseModel, Map map, C35868d dVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                dVar = C35603k.m146913i(baseModel.f88290n, (C35867c) null, (C35869e) null, (String) null, 7, (Object) null);
            }
            baseModel.mo106987F(map, dVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runActions");
    }

    /* renamed from: y */
    public static /* synthetic */ void m147332y(BaseModel baseModel, EventHandler.Type type, Object obj, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                obj = null;
            }
            baseModel.mo107009x(type, obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleViewEvent");
    }

    /* renamed from: A */
    public final void mo106982A(@C12579k C11304p<? super Boolean, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        if (this.f88277a.mo107325r()) {
            C11723c2 unused = C12038j.m48061f(this.f88287k, (CoroutineContext) null, (CoroutineStart) null, new BaseModel$onFormInputDisplayed$1(this, pVar, (C11045c<? super BaseModel$onFormInputDisplayed$1>) null), 3, (Object) null);
        }
    }

    @C0344h1(otherwise = 4)
    /* renamed from: B */
    public void mo106983B(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, C40383c.f102945c);
    }

    /* renamed from: C */
    public void mo106984C(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, C40383c.f102945c);
    }

    @C0344h1(otherwise = 4)
    /* renamed from: D */
    public void mo106985D(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, C40383c.f102945c);
    }

    /* renamed from: E */
    public final void mo106986E(@C12579k ReportingEvent reportingEvent, @C12579k C35868d dVar) {
        Intrinsics.checkNotNullParameter(reportingEvent, "event");
        Intrinsics.checkNotNullParameter(dVar, "state");
        this.f88283g.mo106634h().mo106647a(reportingEvent, dVar);
    }

    /* renamed from: F */
    public final void mo106987F(@C12579k Map<String, ? extends JsonValue> map, @C12579k C35868d dVar) {
        Intrinsics.checkNotNullParameter(map, "actions");
        Intrinsics.checkNotNullParameter(dVar, "state");
        this.f88283g.mo106627a().mo106638a(map, dVar);
    }

    /* renamed from: H */
    public void mo106988H(@C12580l L l) {
        this.f88285i = l;
    }

    /* renamed from: I */
    public final void mo106989I(T t) {
        if (C35838i.m147766b(this.f88281e) && !(t instanceof C36026n) && !(t instanceof CheckableView)) {
            C11723c2 unused = C12038j.m48061f(this.f88289m, (CoroutineContext) null, (CoroutineStart) null, new BaseModel$setupViewListeners$1(t, this, (C11045c<? super BaseModel$setupViewListeners$1>) null), 3, (Object) null);
        }
        if (this.f88280d != null) {
            C11723c2 unused2 = C12038j.m48061f(this.f88289m, (CoroutineContext) null, (CoroutineStart) null, new BaseModel$setupViewListeners$2(this, (C11045c<? super BaseModel$setupViewListeners$2>) null), 3, (Object) null);
        }
    }

    /* renamed from: J */
    public final void mo106990J(@C12579k Map<C35865a, ? extends JsonValue> map) {
        Intrinsics.checkNotNullParameter(map, "attributes");
        this.f88283g.mo106628b().mo106607b(map);
    }

    @C12579k
    /* renamed from: f */
    public final C11723c2 mo106991f(@C12579k LayoutEvent layoutEvent) {
        Intrinsics.checkNotNullParameter(layoutEvent, "event");
        return C12038j.m48061f(this.f88287k, (CoroutineContext) null, (CoroutineStart) null, new BaseModel$broadcast$1(this, layoutEvent, (C11045c<? super BaseModel$broadcast$1>) null), 3, (Object) null);
    }

    /* renamed from: g */
    public final boolean mo106992g(C35608o.C35611c cVar) {
        C9329d f;
        C35693v0 v0Var = this.f88280d;
        if (v0Var == null || (f = v0Var.mo106844f()) == null) {
            return true;
        }
        if (f.apply(C35915i.m148082f(cVar.mo106716d()))) {
            return this.f88280d.mo106842e();
        }
        if (!this.f88280d.mo106842e()) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: h */
    public final T mo106993h(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        T z = mo107010z(context, pVar);
        mo106984C(z);
        z.addOnAttachStateChangeListener(new C35726b(this, z));
        List<EnableBehaviorType> list = this.f88282f;
        if (list != null) {
            if (C35837h.m147764b(list)) {
                if (this.f88290n.mo106661d() != null) {
                    C11723c2 unused = C12038j.m48061f(this.f88287k, (CoroutineContext) null, (CoroutineStart) null, new BaseModel$createView$3(this, (C11045c<? super BaseModel$createView$3>) null), 3, (Object) null);
                } else {
                    throw new IllegalStateException("Pager state is required for pager behaviors".toString());
                }
            }
            if (C35837h.m147763a(this.f88282f)) {
                if (this.f88290n.mo106659b() != null) {
                    C11723c2 unused2 = C12038j.m48061f(this.f88287k, (CoroutineContext) null, (CoroutineStart) null, new BaseModel$createView$5(this, (C11045c<? super BaseModel$createView$5>) null), 3, (Object) null);
                } else {
                    throw new IllegalStateException("Form state is required for form behaviors".toString());
                }
            }
        }
        return z;
    }

    @C12580l
    /* renamed from: i */
    public final C35835f mo106994i() {
        return this.f88278b;
    }

    @C12580l
    /* renamed from: j */
    public final C35830c mo106995j() {
        return this.f88279c;
    }

    @C12580l
    /* renamed from: k */
    public final List<EnableBehaviorType> mo106996k() {
        return this.f88282f;
    }

    @C12579k
    /* renamed from: l */
    public final ModelEnvironment mo106997l() {
        return this.f88283g;
    }

    @C12580l
    /* renamed from: m */
    public final List<EventHandler> mo106998m() {
        return this.f88281e;
    }

    @C12579k
    /* renamed from: n */
    public final C35603k mo106999n() {
        return this.f88290n;
    }

    @C12580l
    /* renamed from: o */
    public L mo107000o() {
        return this.f88285i;
    }

    @C12579k
    /* renamed from: p */
    public final C12074o0 mo107001p() {
        return this.f88287k;
    }

    @C12579k
    /* renamed from: q */
    public final C35804j mo107002q() {
        return this.f88284h;
    }

    /* renamed from: r */
    public final int mo107003r() {
        return this.f88286j;
    }

    @C12579k
    /* renamed from: s */
    public final C12074o0 mo107004s() {
        return this.f88289m;
    }

    @C12579k
    /* renamed from: t */
    public final ViewType mo107005t() {
        return this.f88277a;
    }

    @C12580l
    /* renamed from: u */
    public final C35693v0 mo107006u() {
        return this.f88280d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r4 != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r6.mo106713z() == false) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107007v(com.urbanairship.android.layout.environment.C35608o.C35610b r6) {
        /*
            r5 = this;
            java.util.List<com.urbanairship.android.layout.property.EnableBehaviorType> r0 = r5.f88282f
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.urbanairship.android.layout.property.EnableBehaviorType r1 = com.urbanairship.android.layout.property.EnableBehaviorType.FORM_VALIDATION
            boolean r1 = r0.contains(r1)
            com.urbanairship.android.layout.property.EnableBehaviorType r2 = com.urbanairship.android.layout.property.EnableBehaviorType.FORM_SUBMISSION
            boolean r0 = r0.contains(r2)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            boolean r4 = r6.mo106683A()
            if (r4 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r4 = r2
            goto L_0x001f
        L_0x001e:
            r4 = r3
        L_0x001f:
            if (r0 == 0) goto L_0x002c
            if (r1 == 0) goto L_0x002c
            boolean r6 = r6.mo106713z()
            if (r6 != 0) goto L_0x003a
            if (r4 == 0) goto L_0x003a
            goto L_0x0039
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            boolean r6 = r6.mo106713z()
            if (r6 != 0) goto L_0x003a
            goto L_0x0039
        L_0x0035:
            if (r1 == 0) goto L_0x0039
            r2 = r4
            goto L_0x003a
        L_0x0039:
            r2 = r3
        L_0x003a:
            com.urbanairship.android.layout.model.BaseModel$a r6 = r5.mo107000o()
            if (r6 == 0) goto L_0x0043
            r6.setEnabled(r2)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.BaseModel.mo107007v(com.urbanairship.android.layout.environment.o$b):void");
    }

    /* renamed from: w */
    public final void mo107008w(C35608o.C35612d dVar) {
        boolean z;
        List<EnableBehaviorType> list = this.f88282f;
        if (list != null) {
            boolean contains = list.contains(EnableBehaviorType.PAGER_NEXT);
            boolean contains2 = list.contains(EnableBehaviorType.PAGER_PREVIOUS);
            if ((!contains || !dVar.mo106731k()) && (!contains2 || !dVar.mo106732l())) {
                z = false;
            } else {
                z = true;
            }
            C35725a o = mo107000o();
            if (o != null) {
                o.setEnabled(z);
            }
        }
    }

    /* renamed from: x */
    public final void mo107009x(@C12579k EventHandler.Type type, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(type, "type");
        List<EventHandler> list = this.f88281e;
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        for (EventHandler next : list) {
            if (next.mo107266f() == type) {
                for (StateAction next2 : next.mo107264e()) {
                    C11079d2 d2Var = null;
                    if (next2 instanceof StateAction.C35826c) {
                        C35607n<C35608o.C35611c> c = this.f88290n.mo106660c();
                        if (c != null) {
                            C36059m.m148419o("StateAction: SetFormValue " + ((StateAction.C35826c) next2).mo107306e() + " = " + JsonValue.m34975U(obj), new Object[0]);
                            c.mo106668c(new BaseModel$handleViewEvent$1$1(next2, obj));
                            d2Var = C11079d2.f28267a;
                        }
                        if (d2Var == null) {
                            C36059m.m148421q("StateAction: SetFormValue skipped. Missing State Controller!", new Object[0]);
                        }
                    } else if (next2 instanceof StateAction.C35827d) {
                        C35607n<C35608o.C35611c> c2 = this.f88290n.mo106660c();
                        if (c2 != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("StateAction: SetState ");
                            StateAction.C35827d dVar = (StateAction.C35827d) next2;
                            sb.append(dVar.mo107314f());
                            sb.append(" = ");
                            sb.append(dVar.mo107315g());
                            C36059m.m148419o(sb.toString(), new Object[0]);
                            c2.mo106668c(new BaseModel$handleViewEvent$2$1(next2));
                            d2Var = C11079d2.f28267a;
                        }
                        if (d2Var == null) {
                            C36059m.m148421q("StateAction: SetState skipped. Missing State Controller!", new Object[0]);
                        }
                    } else if (Intrinsics.areEqual((Object) next2, (Object) StateAction.C35823a.f88526c)) {
                        C35607n<C35608o.C35611c> c3 = this.f88290n.mo106660c();
                        if (c3 != null) {
                            C36059m.m148419o("StateAction: ClearState", new Object[0]);
                            c3.mo106668c(BaseModel$handleViewEvent$3$1.f88295f);
                            d2Var = C11079d2.f28267a;
                        }
                        if (d2Var == null) {
                            C36059m.m148421q("StateAction: ClearState skipped. Missing State Controller!", new Object[0]);
                        }
                    }
                }
            }
        }
    }

    @C12579k
    /* renamed from: z */
    public abstract T mo107010z(@C12579k Context context, @C12579k C35614p pVar);

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseModel(ViewType viewType, C35835f fVar, C35830c cVar, C35693v0 v0Var, List list, List list2, ModelEnvironment modelEnvironment, C35804j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewType, (i & 2) != 0 ? null : fVar, (i & 4) != 0 ? null : cVar, (i & 8) != 0 ? null : v0Var, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, modelEnvironment, jVar);
    }
}
