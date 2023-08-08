package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.C27728a;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.C27739f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$2", mo22502f = "AlternativeProductsBottomSheetStateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$2 */
public final class C27708xce62a29 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<C27728a, C11079d2> $actioner;
    final /* synthetic */ C11907e<C27739f> $sideEffect;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$2$1", mo22502f = "AlternativeProductsBottomSheetStateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$2$1 */
    public static final class C277091 extends SuspendLambda implements C11304p<C27739f, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C277091 r0 = new C277091(lVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C27739f fVar, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C277091) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C27739f fVar = (C27739f) this.L$0;
                if (fVar instanceof C27739f.C27740a) {
                    lVar.invoke(new C27728a.C27734f(((C27739f.C27740a) fVar).mo80539d()));
                }
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27708xce62a29(C11907e<? extends C27739f> eVar, C11300l<? super C27728a, C11079d2> lVar, C11045c<? super C27708xce62a29> cVar) {
        super(2, cVar);
        this.$sideEffect = eVar;
        this.$actioner = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        C27708xce62a29 alternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$2 = new C27708xce62a29(this.$sideEffect, this.$actioner, cVar);
        alternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$2.L$0 = obj;
        return alternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C11907e<C27739f> eVar = this.$sideEffect;
            final C11300l<C27728a, C11079d2> lVar = this.$actioner;
            C11909g.m47412V0(C11909g.m47448f1(eVar, new C277091((C11045c<? super C277091>) null)), (C12074o0) this.L$0);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((C27708xce62a29) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
