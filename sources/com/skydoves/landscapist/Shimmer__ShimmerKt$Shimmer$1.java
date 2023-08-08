package com.skydoves.landscapist;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1947b0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.C1984k0;
import androidx.compose.animation.core.RepeatMode;
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
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.skydoves.landscapist.Shimmer__ShimmerKt$Shimmer$1", mo22502f = "Shimmer.kt", mo22503i = {}, mo22504l = {73}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class Shimmer__ShimmerKt$Shimmer$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Animatable<Float, C1983k> $animatedProgress;
    final /* synthetic */ int $durationMillis;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Shimmer__ShimmerKt$Shimmer$1(Animatable<Float, C1983k> animatable, int i, C11045c<? super Shimmer__ShimmerKt$Shimmer$1> cVar) {
        super(2, cVar);
        this.$animatedProgress = animatable;
        this.$durationMillis = i;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new Shimmer__ShimmerKt$Shimmer$1(this.$animatedProgress, this.$durationMillis, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Animatable<Float, C1983k> animatable = this.$animatedProgress;
            Float e = C11064a.m42619e(1.0f);
            C1984k0 f = C1972h.m8381f(C1972h.m8392q(this.$durationMillis, 0, C1947b0.m8291c(), 2, (Object) null), (RepeatMode) null, 0, 6, (Object) null);
            this.label = 1;
            if (Animatable.m7942i(animatable, e, f, (Object) null, (C11300l) null, this, 12, (Object) null) == h) {
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
        return ((Shimmer__ShimmerKt$Shimmer$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
