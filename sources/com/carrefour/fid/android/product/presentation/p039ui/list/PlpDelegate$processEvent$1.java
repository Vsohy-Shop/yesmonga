package com.carrefour.fid.android.product.presentation.p039ui.list;

import com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$processEvent$1", mo22502f = "PlpDelegate.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPlpDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlpDelegate.kt\ncom/carrefour/fid/android/product/presentation/ui/list/PlpDelegate$processEvent$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,689:1\n53#2:690\n55#2:694\n50#3:691\n55#3:693\n106#4:692\n*S KotlinDebug\n*F\n+ 1 PlpDelegate.kt\ncom/carrefour/fid/android/product/presentation/ui/list/PlpDelegate$processEvent$1\n*L\n532#1:690\n532#1:694\n532#1:691\n532#1:693\n532#1:692\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$processEvent$1 */
public final class PlpDelegate$processEvent$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<PlpViewModel.C28170a, C11079d2> $action;
    final /* synthetic */ BaseMVIViewModel<?, ?> $viewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpDelegate$processEvent$1(BaseMVIViewModel<?, ?> baseMVIViewModel, C11300l<? super PlpViewModel.C28170a, C11079d2> lVar, C11045c<? super PlpDelegate$processEvent$1> cVar) {
        super(2, cVar);
        this.$viewModel = baseMVIViewModel;
        this.$action = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        PlpDelegate$processEvent$1 plpDelegate$processEvent$1 = new PlpDelegate$processEvent$1(this.$viewModel, this.$action, cVar);
        plpDelegate$processEvent$1.L$0 = obj;
        return plpDelegate$processEvent$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C11909g.m47412V0(new PlpDelegate$processEvent$1$invokeSuspend$$inlined$map$1(this.$viewModel.getUiEvent(), this.$action), (C12074o0) this.L$0);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PlpDelegate$processEvent$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
