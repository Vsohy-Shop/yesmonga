package kotlin.sequences;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "", "index", "element", "a", "(ILjava/lang/Object;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SequencesKt___SequencesKt$onEachIndexed$1 extends Lambda implements C11304p<Integer, T, T> {
    final /* synthetic */ C11304p<Integer, T, C11079d2> $action;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$onEachIndexed$1(C11304p<? super Integer, ? super T, C11079d2> pVar) {
        super(2);
        this.$action = pVar;
    }

    /* renamed from: a */
    public final T mo23186a(int i, T t) {
        this.$action.invoke(Integer.valueOf(i), t);
        return t;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo23186a(((Number) obj).intValue(), obj2);
    }
}
