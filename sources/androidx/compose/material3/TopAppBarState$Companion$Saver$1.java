package androidx.compose.material3;

import androidx.compose.runtime.saveable.C8629f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/material3/TopAppBarState;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/material3/TopAppBarState;)Ljava/util/List;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TopAppBarState$Companion$Saver$1 extends Lambda implements C11304p<C8629f, TopAppBarState, List<? extends Float>> {

    /* renamed from: f */
    public static final TopAppBarState$Companion$Saver$1 f19966f = new TopAppBarState$Companion$Saver$1();

    public TopAppBarState$Companion$Saver$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final List<Float> invoke(@C12579k C8629f fVar, @C12579k TopAppBarState topAppBarState) {
        Intrinsics.checkNotNullParameter(fVar, "$this$listSaver");
        Intrinsics.checkNotNullParameter(topAppBarState, "it");
        return CollectionsKt__CollectionsKt.m40448L(Float.valueOf(topAppBarState.mo12414e()), Float.valueOf(topAppBarState.mo12413d()), Float.valueOf(topAppBarState.mo12412c()));
    }
}
