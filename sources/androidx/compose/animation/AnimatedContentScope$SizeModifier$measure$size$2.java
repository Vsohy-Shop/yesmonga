package androidx.compose.animation;

import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"S", "it", "Landroidx/compose/ui/unit/q;", "a", "(Ljava/lang/Object;)J"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AnimatedContentScope$SizeModifier$measure$size$2 extends Lambda implements C11300l<S, C16500q> {
    final /* synthetic */ AnimatedContentScope<S> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentScope$SizeModifier$measure$size$2(AnimatedContentScope<S> animatedContentScope) {
        super(1);
        this.this$0 = animatedContentScope;
    }

    /* renamed from: a */
    public final long mo6451a(S s) {
        C8578k2 k2Var = this.this$0.mo6418p().get(s);
        return k2Var != null ? ((C16500q) k2Var.getValue()).mo47895q() : C16500q.f40900b.mo47897a();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return C16500q.m74651b(mo6451a(obj));
    }
}
