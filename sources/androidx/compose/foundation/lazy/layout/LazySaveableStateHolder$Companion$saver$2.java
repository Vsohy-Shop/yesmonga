package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.C8624c;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"", "", "", "", "restored", "Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "a", "(Ljava/util/Map;)Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LazySaveableStateHolder$Companion$saver$2 extends Lambda implements C11300l<Map<String, ? extends List<? extends Object>>, LazySaveableStateHolder> {
    final /* synthetic */ C8624c $parentRegistry;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolder$Companion$saver$2(C8624c cVar) {
        super(1);
        this.$parentRegistry = cVar;
    }

    @C12580l
    /* renamed from: a */
    public final LazySaveableStateHolder invoke(@C12579k Map<String, ? extends List<? extends Object>> map) {
        Intrinsics.checkNotNullParameter(map, "restored");
        return new LazySaveableStateHolder(this.$parentRegistry, map);
    }
}
