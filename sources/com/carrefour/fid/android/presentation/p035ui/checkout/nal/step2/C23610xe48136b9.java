package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.C23617b;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics.C23614a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$actioner$1 */
public final class C23610xe48136b9 extends Lambda implements C11300l<C23617b, C11079d2> {
    final /* synthetic */ C23614a $analytics;
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ C8700z0<Boolean> $displayCardFidDialog;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ C11300l<Double, C11079d2> $onAddPickupClicked;
    final /* synthetic */ C11289a<C11079d2> $onAddressValidated;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11289a<C11079d2> $onCgvClicked;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23610xe48136b9(NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, C11300l<? super Double, C11079d2> lVar, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C23614a aVar3, C11289a<C11079d2> aVar4, C8700z0<Boolean> z0Var, C12074o0 o0Var, LazyListState lazyListState) {
        super(1);
        this.$viewModel = nonFoodCheckoutStep2ViewModel;
        this.$onAddPickupClicked = lVar;
        this.$onCgvClicked = aVar;
        this.$onBackPressed = aVar2;
        this.$analytics = aVar3;
        this.$onAddressValidated = aVar4;
        this.$displayCardFidDialog = z0Var;
        this.$coroutineScope = o0Var;
        this.$listState = lazyListState;
    }

    /* renamed from: a */
    public final void mo69128a(@C12579k C23617b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "action");
        if (Intrinsics.areEqual((Object) bVar, (Object) C23617b.C23631g.f59596a)) {
            this.$viewModel.mo75995Z0();
        } else if (bVar instanceof C23617b.C23627c) {
            this.$onAddPickupClicked.invoke(Double.valueOf(((C23617b.C23627c) bVar).mo69192d()));
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C23617b.C23629e.f59592a)) {
            this.$onCgvClicked.invoke();
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C23617b.C23628d.f59590a)) {
            this.$onBackPressed.invoke();
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C23617b.C23630f.f59594a)) {
            this.$viewModel.mo75998c1();
        } else if (bVar instanceof C23617b.C23623b) {
            NonFoodCheckoutStep2ScreenKt.m104870L((C23617b.C23623b) bVar, this.$analytics, this.$viewModel, this.$onAddressValidated);
        } else if (bVar instanceof C23617b.C23632h) {
            C23614a aVar = this.$analytics;
            NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel = this.$viewModel;
            final C12074o0 o0Var = this.$coroutineScope;
            final LazyListState lazyListState = this.$listState;
            NonFoodCheckoutStep2ScreenKt.m104871M((C23617b.C23632h) bVar, aVar, nonFoodCheckoutStep2ViewModel, new C11300l<Integer, C11079d2>() {

                @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$actioner$1$1$1", mo22502f = "NonFoodCheckoutStep2Screen.kt", mo22503i = {}, mo22504l = {155}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
                @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
                /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$actioner$1$1$1 */
                public static final class C236121 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        return new C236121(lazyListState, i, cVar);
                    }

                    @C12580l
                    public final Object invokeSuspend(@C12579k Object obj) {
                        Object h = C11063b.m42612h();
                        int i = this.label;
                        if (i == 0) {
                            C11661u0.m45747n(obj);
                            LazyListState lazyListState = lazyListState;
                            int i2 = i;
                            this.label = 1;
                            if (LazyListState.m10849H(lazyListState, i2, 0, this, 2, (Object) null) == h) {
                                return h;
                            }
                        } else if (i == 1) {
                            C11661u0.m45747n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return C11079d2.f28267a;
                    }

                    @C12580l
                    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
                        return ((C236121) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
                    }
                }

                /* renamed from: a */
                public final void mo69129a(final int i) {
                    C12074o0 o0Var = o0Var;
                    final LazyListState lazyListState = lazyListState;
                    C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C236121((C11045c<? super C236121>) null), 3, (Object) null);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo69129a(((Number) obj).intValue());
                    return C11079d2.f28267a;
                }
            });
        } else if (bVar instanceof C23617b.C23618a) {
            NonFoodCheckoutStep2ScreenKt.m104869K((C23617b.C23618a) bVar, this.$viewModel, this.$displayCardFidDialog);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo69128a((C23617b) obj);
        return C11079d2.f28267a;
    }
}
