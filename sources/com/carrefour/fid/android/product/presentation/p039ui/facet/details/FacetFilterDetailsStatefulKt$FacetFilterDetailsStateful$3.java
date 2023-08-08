package com.carrefour.fid.android.product.presentation.p039ui.facet.details;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import com.carrefour.fid.android.product.presentation.p039ui.facet.facets.C28007b;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.C28160a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3", mo22502f = "FacetFilterDetailsStateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3 */
public final class FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C27950a $analytics;
    final /* synthetic */ C11289a<C11079d2> $displayErrorSnackbar;
    final /* synthetic */ C8700z0<Boolean> $isApplyingModification;
    final /* synthetic */ C11907e<C28007b> $sideEffect;
    final /* synthetic */ C8578k2<C28160a> $state;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3$1", mo22502f = "FacetFilterDetailsStateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3$1 */
    public static final class C279621 extends SuspendLambda implements C11304p<C28007b, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C279621 r0 = new C279621(z0Var, aVar, aVar2, k2Var, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C28007b bVar, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C279621) create(bVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C28007b bVar = (C28007b) this.L$0;
                if (Intrinsics.areEqual((Object) bVar, (Object) C28007b.C28009b.f67854a)) {
                    z0Var.setValue(C11064a.m42615a(true));
                } else if (bVar instanceof C28007b.C28008a) {
                    z0Var.setValue(C11064a.m42615a(false));
                    aVar.invoke();
                } else if (Intrinsics.areEqual((Object) bVar, (Object) C28007b.C28010c.f67856a)) {
                    aVar2.mo81378b(k2Var.getValue().mo81899e().mo118662e());
                    z0Var.setValue(C11064a.m42615a(false));
                }
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3(C11907e<? extends C28007b> eVar, C8700z0<Boolean> z0Var, C11289a<C11079d2> aVar, C27950a aVar2, C8578k2<C28160a> k2Var, C11045c<? super FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3> cVar) {
        super(2, cVar);
        this.$sideEffect = eVar;
        this.$isApplyingModification = z0Var;
        this.$displayErrorSnackbar = aVar;
        this.$analytics = aVar2;
        this.$state = k2Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3 facetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3 = new FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3(this.$sideEffect, this.$isApplyingModification, this.$displayErrorSnackbar, this.$analytics, this.$state, cVar);
        facetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3.L$0 = obj;
        return facetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C11907e<C28007b> eVar = this.$sideEffect;
            final C8700z0<Boolean> z0Var = this.$isApplyingModification;
            final C11289a<C11079d2> aVar = this.$displayErrorSnackbar;
            final C27950a aVar2 = this.$analytics;
            final C8578k2<C28160a> k2Var = this.$state;
            C11909g.m47412V0(C11909g.m47448f1(eVar, new C279621((C11045c<? super C279621>) null)), (C12074o0) this.L$0);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
