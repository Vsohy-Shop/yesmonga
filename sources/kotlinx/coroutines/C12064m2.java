package kotlinx.coroutines;

import kotlinx.coroutines.internal.C12015r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.m2 */
public abstract class C12064m2 extends CoroutineDispatcher {
    @C12579k
    /* renamed from: V */
    public CoroutineDispatcher mo23566V(int i) {
        C12015r.m47943a(i);
        return this;
    }

    @C12579k
    /* renamed from: a0 */
    public abstract C12064m2 mo23706a0();

    @C12177y1
    @C12580l
    /* renamed from: b0 */
    public final String mo24519b0() {
        C12064m2 m2Var;
        C12064m2 e = C11768d1.m46783e();
        if (this == e) {
            return "Dispatchers.Main";
        }
        try {
            m2Var = e.mo23706a0();
        } catch (UnsupportedOperationException unused) {
            m2Var = null;
        }
        if (this == m2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @C12579k
    public String toString() {
        String b0 = mo24519b0();
        if (b0 != null) {
            return b0;
        }
        return C12090r0.m48300a(this) + '@' + C12090r0.m48301b(this);
    }
}
