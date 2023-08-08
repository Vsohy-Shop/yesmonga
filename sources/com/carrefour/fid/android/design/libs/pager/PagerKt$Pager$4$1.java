package com.carrefour.fid.android.design.libs.pager;

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
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$4$1", mo22502f = "Pager.kt", mo22503i = {}, mo22504l = {218}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\ncom/carrefour/fid/android/design/libs/pager/PagerKt$Pager$4$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,367:1\n21#2:368\n23#2:372\n50#3:369\n55#3:371\n106#4:370\n*S KotlinDebug\n*F\n+ 1 Pager.kt\ncom/carrefour/fid/android/design/libs/pager/PagerKt$Pager$4$1\n*L\n214#1:368\n214#1:372\n214#1:369\n214#1:371\n214#1:370\n*E\n"})
public final class PagerKt$Pager$4$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ PagerState $state;
    int label;

    /* renamed from: com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$4$1$a */
    public static final class C37458a implements C11908f<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ PagerState f94080a;

        public C37458a(PagerState pagerState) {
            this.f94080a = pagerState;
        }

        @C12580l
        /* renamed from: c */
        public final Object mo114090c(boolean z, @C12579k C11045c<? super C11079d2> cVar) {
            this.f94080a.mo114100A();
            return C11079d2.f28267a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, C11045c cVar) {
            return mo114090c(((Boolean) obj).booleanValue(), cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerKt$Pager$4$1(PagerState pagerState, C11045c<? super PagerKt$Pager$4$1> cVar) {
        super(2, cVar);
        this.$state = pagerState;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PagerKt$Pager$4$1(this.$state, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final PagerState pagerState = this.$state;
            C11907e j0 = C11909g.m47462j0(new PagerKt$Pager$4$1$invokeSuspend$$inlined$filter$1(C8415c2.m30253v(new C11289a<Boolean>() {
                @C12579k
                public final Boolean invoke() {
                    return Boolean.valueOf(pagerState.mo7251e());
                }
            })), 1);
            C37458a aVar = new C37458a(this.$state);
            this.label = 1;
            if (j0.collect(aVar, this) == h) {
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
        return ((PagerKt$Pager$4$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
