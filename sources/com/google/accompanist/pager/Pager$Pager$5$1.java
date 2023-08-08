package com.google.accompanist.pager;

import androidx.compose.foundation.lazy.C2517l;
import androidx.compose.runtime.C8415c2;
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
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.google.accompanist.pager.Pager$Pager$5$1", mo22502f = "Pager.kt", mo22503i = {}, mo22504l = {406}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class Pager$Pager$5$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ PagerState $state;
    int label;

    /* renamed from: com.google.accompanist.pager.Pager$Pager$5$1$a */
    public static final class C15023a implements C11908f<Integer> {

        /* renamed from: a */
        public final /* synthetic */ PagerState f37131a;

        public C15023a(PagerState pagerState) {
            this.f37131a = pagerState;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12580l Integer num, @C12579k C11045c<? super C11079d2> cVar) {
            this.f37131a.mo42006M();
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pager$Pager$5$1(PagerState pagerState, C11045c<? super Pager$Pager$5$1> cVar) {
        super(2, cVar);
        this.$state = pagerState;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new Pager$Pager$5$1(this.$state, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final PagerState pagerState = this.$state;
            C11907e g0 = C11909g.m47451g0(C8415c2.m30253v(new C11289a<Integer>() {
                @C12580l
                public final Integer invoke() {
                    C2517l w = pagerState.mo42018w();
                    if (w != null) {
                        return Integer.valueOf(w.getIndex());
                    }
                    return null;
                }
            }));
            C15023a aVar = new C15023a(this.$state);
            this.label = 1;
            if (g0.collect(aVar, this) == h) {
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
        return ((Pager$Pager$5$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
