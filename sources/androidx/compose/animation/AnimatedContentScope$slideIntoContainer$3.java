package androidx.compose.animation;

import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16502r;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AnimatedContentScope$slideIntoContainer$3 extends Lambda implements C11300l<Integer, Integer> {
    final /* synthetic */ C11300l<Integer, Integer> $initialOffset;
    final /* synthetic */ AnimatedContentScope<S> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentScope$slideIntoContainer$3(C11300l<? super Integer, Integer> lVar, AnimatedContentScope<S> animatedContentScope) {
        super(1);
        this.$initialOffset = lVar;
        this.this$0 = animatedContentScope;
    }

    @C12579k
    /* renamed from: a */
    public final Integer mo6454a(int i) {
        return this.$initialOffset.invoke(Integer.valueOf((-C16494m.m74581m(this.this$0.mo6411g(C16502r.m74668a(i, i), this.this$0.mo6415m()))) - i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo6454a(((Number) obj).intValue());
    }
}
