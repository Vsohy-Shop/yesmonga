package androidx.compose.foundation.lazy;

import androidx.compose.runtime.saveable.C8629f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/foundation/lazy/LazyListState;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/foundation/lazy/LazyListState;)Ljava/util/List;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LazyListState$Companion$Saver$1 extends Lambda implements C11304p<C8629f, LazyListState, List<? extends Integer>> {

    /* renamed from: f */
    public static final LazyListState$Companion$Saver$1 f6451f = new LazyListState$Companion$Saver$1();

    public LazyListState$Companion$Saver$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final List<Integer> invoke(@C12579k C8629f fVar, @C12579k LazyListState lazyListState) {
        Intrinsics.checkNotNullParameter(fVar, "$this$listSaver");
        Intrinsics.checkNotNullParameter(lazyListState, "it");
        return CollectionsKt__CollectionsKt.m40448L(Integer.valueOf(lazyListState.mo8339q()), Integer.valueOf(lazyListState.mo8340r()));
    }
}
