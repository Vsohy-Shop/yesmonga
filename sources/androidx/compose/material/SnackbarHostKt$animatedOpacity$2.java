package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1983k;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2", mo22502f = "SnackbarHost.kt", mo22503i = {}, mo22504l = {350}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnackbarHostKt$animatedOpacity$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Animatable<Float, C1983k> $alpha;
    final /* synthetic */ C1968g<Float> $animation;
    final /* synthetic */ C11289a<C11079d2> $onAnimationFinish;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedOpacity$2(Animatable<Float, C1983k> animatable, boolean z, C1968g<Float> gVar, C11289a<C11079d2> aVar, C11045c<? super SnackbarHostKt$animatedOpacity$2> cVar) {
        super(2, cVar);
        this.$alpha = animatable;
        this.$visible = z;
        this.$animation = gVar;
        this.$onAnimationFinish = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SnackbarHostKt$animatedOpacity$2(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        float f;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Animatable<Float, C1983k> animatable = this.$alpha;
            if (this.$visible) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            Float e = C11064a.m42619e(f);
            C1968g<Float> gVar = this.$animation;
            this.label = 1;
            if (Animatable.m7942i(animatable, e, gVar, (Object) null, (C11300l) null, this, 12, (Object) null) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$onAnimationFinish.invoke();
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SnackbarHostKt$animatedOpacity$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
