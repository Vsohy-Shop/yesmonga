package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"T", "Landroidx/compose/foundation/lazy/grid/l;", "", "it", "Landroidx/compose/foundation/lazy/grid/d;", "a", "(Landroidx/compose/foundation/lazy/grid/l;I)J"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$3\n*L\n1#1,493:1\n*E\n"})
public final class LazyGridDslKt$itemsIndexed$3 extends Lambda implements C11304p<C2497l, Integer, C2488d> {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ C11305q<C2497l, Integer, T, C2488d> $span;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$itemsIndexed$3(C11305q<? super C2497l, ? super Integer, ? super T, C2488d> qVar, List<? extends T> list) {
        super(2);
        this.$span = qVar;
        this.$items = list;
    }

    /* renamed from: a */
    public final long mo8423a(@C12579k C2497l lVar, int i) {
        Intrinsics.checkNotNullParameter(lVar, "$this$null");
        return this.$span.invoke(lVar, Integer.valueOf(i), this.$items.get(i)).mo8563i();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C2488d.m11156a(mo8423a((C2497l) obj, ((Number) obj2).intValue()));
    }
}