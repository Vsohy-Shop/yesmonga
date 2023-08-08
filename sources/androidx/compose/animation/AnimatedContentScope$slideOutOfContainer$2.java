package androidx.compose.animation;

import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AnimatedContentScope$slideOutOfContainer$2 extends Lambda implements C11300l<Integer, Integer> {
    final /* synthetic */ C11300l<Integer, Integer> $targetOffset;
    final /* synthetic */ AnimatedContentScope<S> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentScope$slideOutOfContainer$2(AnimatedContentScope<S> animatedContentScope, C11300l<? super Integer, Integer> lVar) {
        super(1);
        this.this$0 = animatedContentScope;
        this.$targetOffset = lVar;
    }

    @C12579k
    /* renamed from: a */
    public final Integer mo6458a(int i) {
        long j;
        C8578k2 k2Var = this.this$0.mo6418p().get(this.this$0.mo6419q().mo6706o());
        if (k2Var != null) {
            j = ((C16500q) k2Var.getValue()).mo47895q();
        } else {
            j = C16500q.f40900b.mo47897a();
        }
        return this.$targetOffset.invoke(Integer.valueOf((-C16494m.m74581m(this.this$0.mo6411g(C16502r.m74668a(i, i), j))) - i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo6458a(((Number) obj).intValue());
    }
}
