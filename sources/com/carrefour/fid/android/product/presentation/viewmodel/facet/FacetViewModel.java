package com.carrefour.fid.android.product.presentation.viewmodel.facet;

import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.product.C37750b;
import com.carrefour.fid.android.domain.models.product.C38104c;
import com.carrefour.fid.android.domain.models.product.C38105d;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Sort;
import com.carrefour.fid.android.product.domain.interactors.C27565j;
import com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductUpdateSortUseCase;
import com.carrefour.fid.android.product.presentation.p039ui.facet.facets.C28007b;
import com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource;
import com.carrefour.fid.android.shared.type.C28892e;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11948r;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000*8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010.R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:038\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u00105R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020:0=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020D0C8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006N"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/viewmodel/facet/FacetViewModel;", "Landroidx/lifecycle/v0;", "Lkotlin/d2;", "n0", "l0", "p0", "()V", "Lcom/carrefour/fid/android/domain/models/product/Sort;", "sortField", "r0", "(Lcom/carrefour/fid/android/domain/models/product/Sort;)V", "Lcom/carrefour/fid/android/domain/models/product/d;", "filterSelection", "q0", "(Lcom/carrefour/fid/android/domain/models/product/d;)V", "Lkotlinx/coroutines/c2;", "o0", "m0", "Lcom/carrefour/fid/android/product/domain/interactors/ProductUpdateSortUseCase;", "a", "Lcom/carrefour/fid/android/product/domain/interactors/ProductUpdateSortUseCase;", "productUpdateSortUseCase", "Lcom/carrefour/fid/android/product/domain/interactors/ProductUpdateFilterUseCase;", "b", "Lcom/carrefour/fid/android/product/domain/interactors/ProductUpdateFilterUseCase;", "productUpdateFilterUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/b;", "c", "Lcom/carrefour/fid/android/domain/interactors/product/b;", "clearFacetUseCase", "Lcom/carrefour/fid/android/product/domain/interactors/j;", "d", "Lcom/carrefour/fid/android/product/domain/interactors/j;", "getCurrentFacet", "Lcom/carrefour/fid/android/product/domain/interactors/ProductUpdateFacetUseCase;", "e", "Lcom/carrefour/fid/android/product/domain/interactors/ProductUpdateFacetUseCase;", "productUpdateFacetUseCase", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "f", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "productListSource", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/shared/type/e;", "Lcom/carrefour/fid/android/domain/models/product/Facet;", "g", "Lkotlinx/coroutines/flow/j;", "_facet", "Lcom/carrefour/fid/android/domain/models/product/c;", "h", "_currentSelection", "Lkotlinx/coroutines/channels/g;", "i", "Lkotlinx/coroutines/channels/g;", "_filtersJobQueue", "j", "Lkotlinx/coroutines/c2;", "jobQueue", "Lcom/carrefour/fid/android/product/presentation/ui/facet/facets/b;", "k", "_sideEffect", "Lkotlinx/coroutines/flow/e;", "l", "Lkotlinx/coroutines/flow/e;", "getSideEffect", "()Lkotlinx/coroutines/flow/e;", "sideEffect", "Lkotlinx/coroutines/flow/u;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/facet/a;", "m", "Lkotlinx/coroutines/flow/u;", "getState", "()Lkotlinx/coroutines/flow/u;", "state", "Landroidx/lifecycle/p0;", "savedStateHandle", "<init>", "(Lcom/carrefour/fid/android/product/domain/interactors/ProductUpdateSortUseCase;Lcom/carrefour/fid/android/product/domain/interactors/ProductUpdateFilterUseCase;Lcom/carrefour/fid/android/domain/interactors/product/b;Lcom/carrefour/fid/android/product/domain/interactors/j;Lcom/carrefour/fid/android/product/domain/interactors/ProductUpdateFacetUseCase;Landroidx/lifecycle/p0;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFacetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/facet/FacetViewModel\n+ 2 NavArguments.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/facet/NavArgumentsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,155:1\n7#2:156\n230#3,5:157\n230#3,5:162\n230#3,5:167\n230#3,5:172\n*S KotlinDebug\n*F\n+ 1 FacetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/facet/FacetViewModel\n*L\n41#1:156\n82#1:157,5\n84#1:162,5\n85#1:167,5\n88#1:172,5\n*E\n"})
public final class FacetViewModel extends C19476v0 {
    @C12579k

    /* renamed from: a */
    public final ProductUpdateSortUseCase f68194a;
    @C12579k

    /* renamed from: b */
    public final ProductUpdateFilterUseCase f68195b;
    @C12579k

    /* renamed from: c */
    public final C37750b f68196c;
    @C12579k

    /* renamed from: d */
    public final C27565j f68197d;
    @C12579k

    /* renamed from: e */
    public final ProductUpdateFacetUseCase f68198e;
    @C12579k

    /* renamed from: f */
    public final ProductListSource f68199f;
    @C12579k

    /* renamed from: g */
    public final C11940j<C28892e<Facet>> f68200g;
    @C12579k

    /* renamed from: h */
    public final C11940j<C38104c> f68201h;
    @C12579k

    /* renamed from: i */
    public final C11744g<C11723c2> f68202i = C11748i.m46625d(Integer.MAX_VALUE, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
    @C12580l

    /* renamed from: j */
    public C11723c2 f68203j;
    @C12579k

    /* renamed from: k */
    public final C11744g<C28007b> f68204k;
    @C12579k

    /* renamed from: l */
    public final C11907e<C28007b> f68205l;
    @C12579k

    /* renamed from: m */
    public final C11952u<C28160a> f68206m;

    @Inject
    public FacetViewModel(@C12579k ProductUpdateSortUseCase productUpdateSortUseCase, @C12579k ProductUpdateFilterUseCase productUpdateFilterUseCase, @C12579k C37750b bVar, @C12579k C27565j jVar, @C12579k ProductUpdateFacetUseCase productUpdateFacetUseCase, @C12579k C19456p0 p0Var) {
        Intrinsics.checkNotNullParameter(productUpdateSortUseCase, "productUpdateSortUseCase");
        Intrinsics.checkNotNullParameter(productUpdateFilterUseCase, "productUpdateFilterUseCase");
        Intrinsics.checkNotNullParameter(bVar, "clearFacetUseCase");
        Intrinsics.checkNotNullParameter(jVar, "getCurrentFacet");
        Intrinsics.checkNotNullParameter(productUpdateFacetUseCase, "productUpdateFacetUseCase");
        Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
        this.f68194a = productUpdateSortUseCase;
        this.f68195b = productUpdateFilterUseCase;
        this.f68196c = bVar;
        this.f68197d = jVar;
        this.f68198e = productUpdateFacetUseCase;
        Object h = p0Var.mo57648h("source");
        Intrinsics.checkNotNull(h);
        this.f68199f = (ProductListSource) h;
        C11940j<C28892e<Facet>> a = C11953v.m47628a(C28892e.C28896d.f70785b);
        this.f68200g = a;
        C11940j<C38104c> a2 = C11953v.m47628a(new C38104c(CollectionsKt__CollectionsKt.m40441E(), CollectionsKt__CollectionsKt.m40441E()));
        this.f68201h = a2;
        C11744g<C28007b> d = C11748i.m46625d(-2, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this.f68204k = d;
        this.f68205l = C11909g.m47490s1(d);
        this.f68206m = C11909g.m47392O1(C11909g.m47357D(a, a2, new FacetViewModel$state$1((C11045c<? super FacetViewModel$state$1>) null)), C19500w0.m90846a(this), C11948r.f29534a.mo24272c(), new C28160a((C28892e) null, (C38104c) null, 3, (DefaultConstructorMarker) null));
        mo81883m0();
    }

    @C12579k
    public final C11907e<C28007b> getSideEffect() {
        return this.f68205l;
    }

    @C12579k
    public final C11952u<C28160a> getState() {
        return this.f68206m;
    }

    /* renamed from: l0 */
    public final void mo81882l0() {
        C11723c2 c2Var = this.f68203j;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: m0 */
    public final void mo81883m0() {
        C28892e<Facet> value;
        C28892e<Facet> value2;
        C28892e<Facet> value3;
        C38104c value4;
        C11940j<C28892e<Facet>> jVar = this.f68200g;
        do {
            value = jVar.getValue();
            C28892e eVar = value;
        } while (!jVar.mo24216e(value, C28892e.C28894b.f70781b));
        Object b = this.f68197d.mo80042b();
        if (Result.m38710j(b)) {
            Pair pair = (Pair) b;
            C11940j<C28892e<Facet>> jVar2 = this.f68200g;
            do {
                value3 = jVar2.getValue();
                C28892e eVar2 = value3;
            } while (!jVar2.mo24216e(value3, new C28892e.C28895c(pair.mo21849e())));
            C11940j<C38104c> jVar3 = this.f68201h;
            do {
                value4 = jVar3.getValue();
                C38104c cVar = value4;
            } while (!jVar3.mo24216e(value4, (C38104c) pair.mo21851f()));
        }
        Throwable e = Result.m38705e(b);
        if (e != null) {
            C11940j<C28892e<Facet>> jVar4 = this.f68200g;
            do {
                value2 = jVar4.getValue();
                C28892e eVar3 = value2;
            } while (!jVar4.mo24216e(value2, new C28892e.C28893a(e)));
        }
    }

    /* renamed from: n0 */
    public final void mo81884n0() {
        C11723c2 c2Var = this.f68203j;
        boolean z = false;
        if (c2Var != null && c2Var.mo23627d()) {
            z = true;
        }
        if (!z) {
            this.f68203j = mo81885o0();
        }
    }

    /* renamed from: o0 */
    public final C11723c2 mo81885o0() {
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new FacetViewModel$launchNewQueueJob$1(this, (C11045c<? super FacetViewModel$launchNewQueueJob$1>) null), 3, (Object) null);
    }

    /* renamed from: p0 */
    public final void mo81886p0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new FacetViewModel$resetFilters$1(this, (C11045c<? super FacetViewModel$resetFilters$1>) null), 3, (Object) null);
    }

    /* renamed from: q0 */
    public final void mo81887q0(@C12579k C38105d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "filterSelection");
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new FacetViewModel$selectFilterField$1(this, C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, CoroutineStart.LAZY, new FacetViewModel$selectFilterField$job$1(this, dVar, (C11045c<? super FacetViewModel$selectFilterField$job$1>) null), 1, (Object) null), (C11045c<? super FacetViewModel$selectFilterField$1>) null), 3, (Object) null);
    }

    /* renamed from: r0 */
    public final void mo81888r0(@C12579k Sort sort) {
        Intrinsics.checkNotNullParameter(sort, "sortField");
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new FacetViewModel$selectSortField$1(this, C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, CoroutineStart.LAZY, new FacetViewModel$selectSortField$job$1(this, sort, (C11045c<? super FacetViewModel$selectSortField$job$1>) null), 1, (Object) null), (C11045c<? super FacetViewModel$selectSortField$1>) null), 3, (Object) null);
    }
}
