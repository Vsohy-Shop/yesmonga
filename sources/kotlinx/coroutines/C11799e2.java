package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
/* renamed from: kotlinx.coroutines.e2 */
public class C11799e2 extends JobSupport implements C11702a0 {

    /* renamed from: c */
    public final boolean f29267c = mo24074N1();

    public C11799e2(@C12580l C11723c2 c2Var) {
        super(true);
        mo23625c1(c2Var);
    }

    /* renamed from: N1 */
    public final boolean mo24074N1() {
        C12158v vVar;
        JobSupport A;
        C12158v vVar2;
        C12152u Y0 = mo23619Y0();
        if (Y0 instanceof C12158v) {
            vVar = (C12158v) Y0;
        } else {
            vVar = null;
        }
        if (!(vVar == null || (A = vVar.mo24296A()) == null)) {
            while (!A.mo23615S0()) {
                C12152u Y02 = A.mo23619Y0();
                if (Y02 instanceof C12158v) {
                    vVar2 = (C12158v) Y02;
                } else {
                    vVar2 = null;
                }
                if (vVar2 != null) {
                    A = vVar2.mo24296A();
                    if (A == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: S0 */
    public boolean mo23615S0() {
        return this.f29267c;
    }

    /* renamed from: V0 */
    public boolean mo23617V0() {
        return true;
    }

    /* renamed from: i */
    public boolean mo23696i(@C12579k Throwable th) {
        return mo23639l1(new C11721c0(th, false, 2, (DefaultConstructorMarker) null));
    }

    /* renamed from: k */
    public boolean mo23697k() {
        return mo23639l1(C11079d2.f28267a);
    }
}
