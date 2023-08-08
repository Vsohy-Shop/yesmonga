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
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", mo22502f = "SnackbarHost.kt", mo22503i = {}, mo22504l = {363}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnackbarHostKt$animatedScale$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C1968g<Float> $animation;
    final /* synthetic */ Animatable<Float, C1983k> $scale;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedScale$1(Animatable<Float, C1983k> animatable, boolean z, C1968g<Float> gVar, C11045c<? super SnackbarHostKt$animatedScale$1> cVar) {
        super(2, cVar);
        this.$scale = animatable;
        this.$visible = z;
        this.$animation = gVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SnackbarHostKt$animatedScale$1(this.$scale, this.$visible, this.$animation, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        float f;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Animatable<Float, C1983k> animatable = this.$scale;
            if (this.$visible) {
                f = 1.0f;
            } else {
                f = 0.8f;
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
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SnackbarHostKt$animatedScale$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
