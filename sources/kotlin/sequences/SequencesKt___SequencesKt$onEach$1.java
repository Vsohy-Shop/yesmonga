package kotlin.sequences;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"<anonymous>", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SequencesKt___SequencesKt$onEach$1 extends Lambda implements C11300l<T, T> {
    final /* synthetic */ C11300l<T, C11079d2> $action;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$onEach$1(C11300l<? super T, C11079d2> lVar) {
        super(1);
        this.$action = lVar;
    }

    public final T invoke(T t) {
        this.$action.invoke(t);
        return t;
    }
}
