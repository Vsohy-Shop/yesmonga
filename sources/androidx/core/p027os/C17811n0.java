package androidx.core.p027os;

import android.os.PersistableBundle;
import androidx.annotation.C0376v0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.os.n0 */
public final class C17811n0 {
    @C0376v0(21)
    @C12579k
    /* renamed from: a */
    public static final PersistableBundle m81206a() {
        return C17805l0.m81197a(0);
    }

    @C0376v0(21)
    @C12579k
    /* renamed from: b */
    public static final PersistableBundle m81207b(@C12579k Pair<String, ? extends Object>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        PersistableBundle a = C17805l0.m81197a(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            C17805l0.m81198b(a, pair.mo21846a(), pair.mo21847b());
        }
        return a;
    }

    @C0376v0(21)
    @C12579k
    /* renamed from: c */
    public static final PersistableBundle m81208c(@C12579k Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        PersistableBundle a = C17805l0.m81197a(map.size());
        for (Map.Entry next : map.entrySet()) {
            C17805l0.m81198b(a, (String) next.getKey(), next.getValue());
        }
        return a;
    }
}
