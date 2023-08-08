package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.h1 */
public final class C11967h1 extends C12060m {
    @C12579k

    /* renamed from: a */
    public final C11962g1 f29546a;

    public C11967h1(@C12579k C11962g1 g1Var) {
        this.f29546a = g1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo24071j((Throwable) obj);
        return C11079d2.f28267a;
    }

    /* renamed from: j */
    public void mo24071j(@C12580l Throwable th) {
        this.f29546a.mo23720g();
    }

    @C12579k
    public String toString() {
        return "DisposeOnCancel[" + this.f29546a + C12361b.f30261l;
    }
}
