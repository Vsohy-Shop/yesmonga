package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"S", "Landroidx/compose/animation/core/Transition$b;", "Landroidx/compose/animation/core/d0;", "Landroidx/compose/ui/unit/q;", "a", "(Landroidx/compose/animation/core/Transition$b;)Landroidx/compose/animation/core/d0;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AnimatedContentScope$SizeModifier$measure$size$1 extends Lambda implements C11300l<Transition.C1927b<S>, C1956d0<C16500q>> {
    final /* synthetic */ AnimatedContentScope<S> this$0;
    final /* synthetic */ AnimatedContentScope<S>.SizeModifier this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentScope$SizeModifier$measure$size$1(AnimatedContentScope<S> animatedContentScope, AnimatedContentScope<S>.SizeModifier sizeModifier) {
        super(1);
        this.this$0 = animatedContentScope;
        this.this$1 = sizeModifier;
    }

    @C12579k
    /* renamed from: a */
    public final C1956d0<C16500q> invoke(@C12579k Transition.C1927b<S> bVar) {
        long j;
        long j2;
        C1956d0<C16500q> f;
        Intrinsics.checkNotNullParameter(bVar, "$this$animate");
        C8578k2 k2Var = this.this$0.mo6418p().get(bVar.mo6410c());
        if (k2Var != null) {
            j = ((C16500q) k2Var.getValue()).mo47895q();
        } else {
            j = C16500q.f40900b.mo47897a();
        }
        C8578k2 k2Var2 = this.this$0.mo6418p().get(bVar.mo6409a());
        if (k2Var2 != null) {
            j2 = ((C16500q) k2Var2.getValue()).mo47895q();
        } else {
            j2 = C16500q.f40900b.mo47897a();
        }
        C2041q value = this.this$1.mo6429b().getValue();
        if (value == null || (f = value.mo7075f(j, j2)) == null) {
            return C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        return f;
    }
}
