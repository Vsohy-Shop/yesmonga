package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "", "index", "Landroidx/compose/foundation/lazy/staggeredgrid/v;", "a", "(I)Landroidx/compose/foundation/lazy/staggeredgrid/v;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$4$1\n*L\n1#1,434:1\n*E\n"})
public final class LazyStaggeredGridDslKt$itemsIndexed$4$1 extends Lambda implements C11300l<Integer, C2617v> {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ C11304p<Integer, T, C2617v> $span;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$itemsIndexed$4$1(C11304p<? super Integer, ? super T, C2617v> pVar, List<? extends T> list) {
        super(1);
        this.$span = pVar;
        this.$items = list;
    }

    @C12579k
    /* renamed from: a */
    public final C2617v mo8855a(int i) {
        return this.$span.invoke(Integer.valueOf(i), this.$items.get(i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo8855a(((Number) obj).intValue());
    }
}
