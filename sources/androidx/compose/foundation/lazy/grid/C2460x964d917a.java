package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1 */
public final class C2460x964d917a extends Lambda implements C11300l<Integer, Integer> {
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ List<C2492h> $visibleItems;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2460x964d917a(boolean z, List<? extends C2492h> list) {
        super(1);
        this.$isVertical = z;
        this.$visibleItems = list;
    }

    @C12579k
    /* renamed from: a */
    public final Integer mo8407a(int i) {
        return Integer.valueOf(this.$isVertical ? this.$visibleItems.get(i).mo8583c() : this.$visibleItems.get(i).mo8584d());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo8407a(((Number) obj).intValue());
    }
}
