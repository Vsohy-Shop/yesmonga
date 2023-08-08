package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.C8629f;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "it", "", "", "", "", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;)Ljava/util/Map;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion$saver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
public final class LazySaveableStateHolder$Companion$saver$1 extends Lambda implements C11304p<C8629f, LazySaveableStateHolder, Map<String, ? extends List<? extends Object>>> {

    /* renamed from: f */
    public static final LazySaveableStateHolder$Companion$saver$1 f6708f = new LazySaveableStateHolder$Companion$saver$1();

    public LazySaveableStateHolder$Companion$saver$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final Map<String, List<Object>> invoke(@C12579k C8629f fVar, @C12579k LazySaveableStateHolder lazySaveableStateHolder) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        Intrinsics.checkNotNullParameter(lazySaveableStateHolder, "it");
        Map<String, List<Object>> e = lazySaveableStateHolder.mo8712e();
        if (e.isEmpty()) {
            return null;
        }
        return e;
    }
}
