package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.CompositionLocalKt;
import java.util.Map;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SelectionRegistrarKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<C2837n> f7394a = CompositionLocalKt.m29858d((C8410b2) null, SelectionRegistrarKt$LocalSelectionRegistrar$1.f7395f, 1, (Object) null);

    @C12579k
    /* renamed from: a */
    public static final C8550i1<C2837n> m12853a() {
        return f7394a;
    }

    /* renamed from: b */
    public static final boolean m12854b(@C12580l C2837n nVar, long j) {
        Map<Long, C2830i> c;
        if (nVar == null || (c = nVar.mo9702c()) == null) {
            return false;
        }
        return c.containsKey(Long.valueOf(j));
    }
}
