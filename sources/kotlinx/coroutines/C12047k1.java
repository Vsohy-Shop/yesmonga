package kotlinx.coroutines;

import kotlin.collections.C10944i;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.internal.C12015r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
/* renamed from: kotlinx.coroutines.k1 */
public abstract class C12047k1 extends CoroutineDispatcher {

    /* renamed from: c */
    public long f29688c;

    /* renamed from: d */
    public boolean f29689d;
    @C12580l

    /* renamed from: e */
    public C10944i<C11704a1<?>> f29690e;

    /* renamed from: b0 */
    public static /* synthetic */ void m48085b0(C12047k1 k1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            k1Var.mo24481a0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    /* renamed from: t0 */
    public static /* synthetic */ void m48086t0(C12047k1 k1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            k1Var.mo24486n0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: A0 */
    public final boolean mo24476A0() {
        return this.f29688c >= mo24482c0(true);
    }

    /* renamed from: C0 */
    public final boolean mo24477C0() {
        C10944i<C11704a1<?>> iVar = this.f29690e;
        if (iVar != null) {
            return iVar.isEmpty();
        }
        return true;
    }

    /* renamed from: D0 */
    public long mo24478D0() {
        return !mo24479E0() ? Long.MAX_VALUE : 0;
    }

    /* renamed from: E0 */
    public final boolean mo24479E0() {
        C11704a1 p0;
        C10944i<C11704a1<?>> iVar = this.f29690e;
        if (iVar == null || (p0 = iVar.mo22307p0()) == null) {
            return false;
        }
        p0.run();
        return true;
    }

    /* renamed from: F0 */
    public boolean mo24480F0() {
        return false;
    }

    @C12579k
    /* renamed from: V */
    public final CoroutineDispatcher mo23566V(int i) {
        C12015r.m47943a(i);
        return this;
    }

    /* renamed from: a0 */
    public final void mo24481a0(boolean z) {
        long c0 = this.f29688c - mo24482c0(z);
        this.f29688c = c0;
        if (c0 <= 0 && this.f29689d) {
            shutdown();
        }
    }

    /* renamed from: c0 */
    public final long mo24482c0(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: d */
    public final boolean mo24483d() {
        return this.f29688c > 0;
    }

    /* renamed from: d0 */
    public final void mo24484d0(@C12579k C11704a1<?> a1Var) {
        C10944i<C11704a1<?>> iVar = this.f29690e;
        if (iVar == null) {
            iVar = new C10944i<>();
            this.f29690e = iVar;
        }
        iVar.mo22308q(a1Var);
    }

    /* renamed from: e0 */
    public long mo24485e0() {
        C10944i<C11704a1<?>> iVar = this.f29690e;
        if (iVar != null && !iVar.isEmpty()) {
            return 0;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: n0 */
    public final void mo24486n0(boolean z) {
        this.f29688c += mo24482c0(z);
        if (!z) {
            this.f29689d = true;
        }
    }

    public void shutdown() {
    }

    /* renamed from: x0 */
    public boolean mo24488x0() {
        return mo24477C0();
    }
}
