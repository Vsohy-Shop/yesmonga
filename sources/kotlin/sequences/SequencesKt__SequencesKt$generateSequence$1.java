package kotlin.sequences;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SequencesKt__SequencesKt$generateSequence$1 extends Lambda implements C11300l<T, T> {
    final /* synthetic */ C11289a<T> $nextFunction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$generateSequence$1(C11289a<? extends T> aVar) {
        super(1);
        this.$nextFunction = aVar;
    }

    @C12580l
    public final T invoke(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, "it");
        return this.$nextFunction.invoke();
    }
}
