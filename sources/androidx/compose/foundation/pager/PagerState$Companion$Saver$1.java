package androidx.compose.foundation.pager;

import androidx.compose.runtime.saveable.C8629f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/foundation/pager/PagerState;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/foundation/pager/PagerState;)Ljava/util/List;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PagerState$Companion$Saver$1 extends Lambda implements C11304p<C8629f, PagerState, List<? extends Object>> {

    /* renamed from: f */
    public static final PagerState$Companion$Saver$1 f6999f = new PagerState$Companion$Saver$1();

    public PagerState$Companion$Saver$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final List<Object> invoke(@C12579k C8629f fVar, @C12579k PagerState pagerState) {
        Intrinsics.checkNotNullParameter(fVar, "$this$listSaver");
        Intrinsics.checkNotNullParameter(pagerState, "it");
        return CollectionsKt__CollectionsKt.m40448L(Integer.valueOf(pagerState.mo9095w()), Float.valueOf(pagerState.mo9096x()));
    }
}
