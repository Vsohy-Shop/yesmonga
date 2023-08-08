package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j;
import com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28131a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2", mo22502f = "NonFoodProductDetailsScreen.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2 */
public final class NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<C27870j, C11079d2> $actioner;
    final /* synthetic */ C8700z0<Boolean> $displayBasketLoader;
    final /* synthetic */ C11907e<C28131a> $sideEffect;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2$1", mo22502f = "NonFoodProductDetailsScreen.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2$1 */
    public static final class C278431 extends SuspendLambda implements C11304p<C28131a, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C278431 r0 = new C278431(z0Var, lVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C28131a aVar, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C278431) create(aVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C28131a aVar = (C28131a) this.L$0;
                if (aVar instanceof C28131a.C28133b) {
                    z0Var.setValue(C11064a.m42615a(false));
                    lVar.invoke(new C27870j.C27877d(((C28131a.C28133b) aVar).mo81758d()));
                } else if (aVar instanceof C28131a.C28132a) {
                    z0Var.setValue(C11064a.m42615a(false));
                    C28131a.C28132a aVar2 = (C28131a.C28132a) aVar;
                    lVar.invoke(new C27870j.C27871a.C27872a(aVar2.mo81754l(), aVar2.mo81749h(), aVar2.mo81752j(), aVar2.mo81753k(), aVar2.mo81751i()));
                } else if (Intrinsics.areEqual((Object) aVar, (Object) C28131a.C28134c.f68136a)) {
                    z0Var.setValue(C11064a.m42615a(true));
                }
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2(C11907e<? extends C28131a> eVar, C8700z0<Boolean> z0Var, C11300l<? super C27870j, C11079d2> lVar, C11045c<? super NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2> cVar) {
        super(2, cVar);
        this.$sideEffect = eVar;
        this.$displayBasketLoader = z0Var;
        this.$actioner = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2 nonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2 = new NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2(this.$sideEffect, this.$displayBasketLoader, this.$actioner, cVar);
        nonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2.L$0 = obj;
        return nonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C11907e<C28131a> eVar = this.$sideEffect;
            final C8700z0<Boolean> z0Var = this.$displayBasketLoader;
            final C11300l<C27870j, C11079d2> lVar = this.$actioner;
            C11909g.m47412V0(C11909g.m47448f1(eVar, new C278431((C11045c<? super C278431>) null)), (C12074o0) this.L$0);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
