package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo22516d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 176)
@C11363r0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$3\n*L\n1#1,423:1\n*E\n"})
public final class LazyDslKt$items$3 extends Lambda implements C11300l<Integer, Object> {
    final /* synthetic */ C11300l<T, Object> $contentType;
    final /* synthetic */ List<T> $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyDslKt$items$3(C11300l<? super T, ? extends Object> lVar, List<? extends T> list) {
        super(1);
        this.$contentType = lVar;
        this.$items = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @C12580l
    public final Object invoke(int i) {
        return this.$contentType.invoke(this.$items.get(i));
    }
}
