package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import com.carrefour.fid.android.product.presentation.p039ui.facet.facets.C28007b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$FacetStateful$2", mo22502f = "FacetStateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$FacetStateful$2 */
public final class FacetStatefulKt$FacetStateful$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11289a<C11079d2> $displayErrorSnackbar;
    final /* synthetic */ C11907e<C28007b> $sideEffect;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$FacetStateful$2$1", mo22502f = "FacetStateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$FacetStateful$2$1 */
    public static final class C279871 extends SuspendLambda implements C11304p<C28007b, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C279871 r0 = new C279871(aVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C28007b bVar, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C279871) create(bVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                if (((C28007b) this.L$0) instanceof C28007b.C28008a) {
                    aVar.invoke();
                }
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetStatefulKt$FacetStateful$2(C11907e<? extends C28007b> eVar, C11289a<C11079d2> aVar, C11045c<? super FacetStatefulKt$FacetStateful$2> cVar) {
        super(2, cVar);
        this.$sideEffect = eVar;
        this.$displayErrorSnackbar = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        FacetStatefulKt$FacetStateful$2 facetStatefulKt$FacetStateful$2 = new FacetStatefulKt$FacetStateful$2(this.$sideEffect, this.$displayErrorSnackbar, cVar);
        facetStatefulKt$FacetStateful$2.L$0 = obj;
        return facetStatefulKt$FacetStateful$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C11907e<C28007b> eVar = this.$sideEffect;
            final C11289a<C11079d2> aVar = this.$displayErrorSnackbar;
            C11909g.m47412V0(C11909g.m47448f1(eVar, new C279871((C11045c<? super C279871>) null)), (C12074o0) this.L$0);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FacetStatefulKt$FacetStateful$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
