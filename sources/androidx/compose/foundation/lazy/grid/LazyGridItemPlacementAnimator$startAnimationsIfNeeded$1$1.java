package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1986l;
import androidx.compose.animation.core.C2014v0;
import androidx.compose.p004ui.unit.C16494m;
import java.util.concurrent.CancellationException;
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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1", mo22502f = "LazyGridItemPlacementAnimator.kt", mo22503i = {}, mo22504l = {357}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C1956d0<C16494m> $animationSpec;
    final /* synthetic */ C2483a0 $placeableInfo;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(C2483a0 a0Var, C1956d0<C16494m> d0Var, C11045c<? super LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1> cVar) {
        super(2, cVar);
        this.$placeableInfo = a0Var;
        this.$animationSpec = d0Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(this.$placeableInfo, this.$animationSpec, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C1968g gVar;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            if (this.$placeableInfo.mo8539a().mo6616x()) {
                C1956d0<C16494m> d0Var = this.$animationSpec;
                if (d0Var instanceof C2014v0) {
                    gVar = (C2014v0) d0Var;
                } else {
                    gVar = C2494i.f6606a;
                }
            } else {
                gVar = this.$animationSpec;
            }
            C1968g gVar2 = gVar;
            Animatable<C16494m, C1986l> a = this.$placeableInfo.mo8539a();
            C16494m b = C16494m.m74570b(this.$placeableInfo.mo8542d());
            this.label = 1;
            if (Animatable.m7942i(a, b, gVar2, (Object) null, (C11300l) null, this, 12, (Object) null) == h) {
                return h;
            }
        } else if (i == 1) {
            try {
                C11661u0.m45747n(obj);
            } catch (CancellationException unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$placeableInfo.mo8543e(false);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
