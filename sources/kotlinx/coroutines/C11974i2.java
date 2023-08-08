package kotlinx.coroutines;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.i2 */
public abstract class C11974i2 extends C11797e0 implements C11962g1, C12166w1 {

    /* renamed from: d */
    public JobSupport f29551d;

    @C12579k
    /* renamed from: A */
    public final JobSupport mo24296A() {
        JobSupport jobSupport = this.f29551d;
        if (jobSupport != null) {
            return jobSupport;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    /* renamed from: B */
    public final void mo24297B(@C12579k JobSupport jobSupport) {
        this.f29551d = jobSupport;
    }

    @C12580l
    /* renamed from: a */
    public C12070n2 mo23671a() {
        return null;
    }

    /* renamed from: d */
    public boolean mo23674d() {
        return true;
    }

    /* renamed from: g */
    public void mo23720g() {
        mo24296A().mo23586B1(this);
    }

    @C12579k
    public String toString() {
        return C12090r0.m48300a(this) + '@' + C12090r0.m48301b(this) + "[job@" + C12090r0.m48301b(mo24296A()) + C12361b.f30261l;
    }
}
