package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1986l;
import androidx.compose.animation.core.C2014v0;
import androidx.compose.p004ui.geometry.C15094f;
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

@C11067d(mo22501c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", mo22502f = "SelectionMagnifier.kt", mo22503i = {}, mo22504l = {102}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2 */
public final class C2797x2d93455c extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Animatable<C15094f, C1986l> $animatable;
    final /* synthetic */ long $targetValue;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2797x2d93455c(Animatable<C15094f, C1986l> animatable, long j, C11045c<? super C2797x2d93455c> cVar) {
        super(2, cVar);
        this.$animatable = animatable;
        this.$targetValue = j;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new C2797x2d93455c(this.$animatable, this.$targetValue, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Animatable<C15094f, C1986l> animatable = this.$animatable;
            C15094f d = C15094f.m64868d(this.$targetValue);
            C2014v0 a = SelectionMagnifierKt.f7354d;
            this.label = 1;
            if (Animatable.m7942i(animatable, d, a, (Object) null, (C11300l) null, this, 12, (Object) null) == h) {
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
        return ((C2797x2d93455c) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
