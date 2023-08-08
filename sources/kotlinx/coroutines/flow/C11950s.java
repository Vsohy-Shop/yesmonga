package kotlinx.coroutines.flow;

import kotlin.time.C11636e;
import kotlinx.coroutines.flow.C11948r;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.flow.s */
public final class C11950s {
    @C12579k
    /* renamed from: a */
    public static final C11948r m47625a(@C12579k C11948r.C11949a aVar, long j, long j2) {
        return new StartedWhileSubscribed(C11636e.m45480k1(j), C11636e.m45480k1(j2));
    }

    /* renamed from: b */
    public static /* synthetic */ C11948r m47626b(C11948r.C11949a aVar, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = C11636e.f28954b.mo23447W();
        }
        if ((i & 2) != 0) {
            j2 = C11636e.f28954b.mo23477q();
        }
        return m47625a(aVar, j, j2);
    }
}
