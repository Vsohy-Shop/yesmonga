package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27052b;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27055e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$1", mo22502f = "OrderOnlineScreen.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderOnlineScreenKt$OrderOnlineStateful$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C27052b $analytics;
    final /* synthetic */ C11289a<C11079d2> $onDisplaySnackBar;
    final /* synthetic */ C11300l<String, C11079d2> $onNavigateToOrdersSuccessHandleFragment;
    final /* synthetic */ C11907e<C27055e> $sideEffect;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$1$1", mo22502f = "OrderOnlineScreen.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$1$1 */
    public static final class C270911 extends SuspendLambda implements C11304p<C27055e, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C270911 r0 = new C270911(bVar, lVar, aVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C27055e eVar, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C270911) create(eVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C27055e eVar = (C27055e) this.L$0;
                if (eVar instanceof C27055e.C27056a) {
                    C27055e.C27056a aVar = (C27055e.C27056a) eVar;
                    bVar.mo78562a(aVar.mo78584f());
                    lVar.invoke(aVar.mo78582e());
                } else if (eVar instanceof C27055e.C27057b) {
                    aVar.invoke();
                }
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineScreenKt$OrderOnlineStateful$1(C11907e<? extends C27055e> eVar, C27052b bVar, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar, C11045c<? super OrderOnlineScreenKt$OrderOnlineStateful$1> cVar) {
        super(2, cVar);
        this.$sideEffect = eVar;
        this.$analytics = bVar;
        this.$onNavigateToOrdersSuccessHandleFragment = lVar;
        this.$onDisplaySnackBar = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        OrderOnlineScreenKt$OrderOnlineStateful$1 orderOnlineScreenKt$OrderOnlineStateful$1 = new OrderOnlineScreenKt$OrderOnlineStateful$1(this.$sideEffect, this.$analytics, this.$onNavigateToOrdersSuccessHandleFragment, this.$onDisplaySnackBar, cVar);
        orderOnlineScreenKt$OrderOnlineStateful$1.L$0 = obj;
        return orderOnlineScreenKt$OrderOnlineStateful$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C11907e<C27055e> eVar = this.$sideEffect;
            final C27052b bVar = this.$analytics;
            final C11300l<String, C11079d2> lVar = this.$onNavigateToOrdersSuccessHandleFragment;
            final C11289a<C11079d2> aVar = this.$onDisplaySnackBar;
            C11909g.m47412V0(C11909g.m47448f1(eVar, new C270911((C11045c<? super C270911>) null)), (C12074o0) this.L$0);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((OrderOnlineScreenKt$OrderOnlineStateful$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
