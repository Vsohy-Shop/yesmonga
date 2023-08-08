package kotlin.sequences;

import kotlin.C11076d0;
import kotlin.collections.C10942h0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "Lkotlin/collections/h0;", "it", "", "a", "(Lkotlin/collections/h0;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SequencesKt___SequencesKt$filterIndexed$1 extends Lambda implements C11300l<C10942h0<? extends T>, Boolean> {
    final /* synthetic */ C11304p<Integer, T, Boolean> $predicate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$filterIndexed$1(C11304p<? super Integer, ? super T, Boolean> pVar) {
        super(1);
        this.$predicate = pVar;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12579k C10942h0<? extends T> h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "it");
        return this.$predicate.invoke(Integer.valueOf(h0Var.mo22279e()), h0Var.mo22281f());
    }
}
