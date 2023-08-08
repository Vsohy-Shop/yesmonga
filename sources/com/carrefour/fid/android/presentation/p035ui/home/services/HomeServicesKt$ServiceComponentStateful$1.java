package com.carrefour.fid.android.presentation.p035ui.home.services;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.ScrollState;
import com.carrefour.fid.android.design.components.compose.C37014m;
import com.carrefour.fid.android.design.components.compose.Service;
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
/* renamed from: com.carrefour.fid.android.presentation.ui.home.services.HomeServicesKt$ServiceComponentStateful$1 */
public final class HomeServicesKt$ServiceComponentStateful$1 extends Lambda implements C11300l<C37014m, C11079d2> {
    final /* synthetic */ C11300l<Service, C11079d2> $onButtonClicked;
    final /* synthetic */ C11289a<C11079d2> $onRetry;
    final /* synthetic */ C11289a<C11079d2> $onSelectSlotClicked;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ ScrollState $scrollState;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.home.services.HomeServicesKt$ServiceComponentStateful$1$1", mo22502f = "HomeServices.kt", mo22503i = {}, mo22504l = {74}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.presentation.ui.home.services.HomeServicesKt$ServiceComponentStateful$1$1 */
    public static final class C241861 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C241861(scrollState, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                ScrollState scrollState = scrollState;
                this.label = 1;
                if (ScrollState.m9070n(scrollState, 0, (C1968g) null, this, 2, (Object) null) == h) {
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
            return ((C241861) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeServicesKt$ServiceComponentStateful$1(C11300l<? super Service, C11079d2> lVar, C12074o0 o0Var, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, ScrollState scrollState) {
        super(1);
        this.$onButtonClicked = lVar;
        this.$scope = o0Var;
        this.$onRetry = aVar;
        this.$onSelectSlotClicked = aVar2;
        this.$scrollState = scrollState;
    }

    /* renamed from: a */
    public final void mo70792a(@C12579k C37014m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "action");
        if (mVar instanceof C37014m.C37016b) {
            this.$onButtonClicked.invoke(((C37014m.C37016b) mVar).mo112638d());
            C12074o0 o0Var = this.$scope;
            final ScrollState scrollState = this.$scrollState;
            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C241861((C11045c<? super C241861>) null), 3, (Object) null);
        } else if (Intrinsics.areEqual((Object) mVar, (Object) C37014m.C37015a.f92525a)) {
            this.$onRetry.invoke();
        } else if (Intrinsics.areEqual((Object) mVar, (Object) C37014m.C37017c.f92529a)) {
            this.$onSelectSlotClicked.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo70792a((C37014m) obj);
        return C11079d2.f28267a;
    }
}
