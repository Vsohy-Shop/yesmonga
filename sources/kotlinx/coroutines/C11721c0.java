package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11394v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.c0 */
public class C11721c0 {
    @C12579k

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f29064b = AtomicIntegerFieldUpdater.newUpdater(C11721c0.class, "_handled");
    @C11394v
    private volatile int _handled;
    @C12579k
    @C11287e

    /* renamed from: a */
    public final Throwable f29065a;

    public C11721c0(@C12579k Throwable th, boolean z) {
        this.f29065a = th;
        this._handled = z ? 1 : 0;
    }

    /* renamed from: a */
    public final boolean mo23744a() {
        if (f29064b.get(this) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo23745b() {
        return f29064b.compareAndSet(this, 0, 1);
    }

    @C12579k
    public String toString() {
        return C12090r0.m48300a(this) + C12361b.f30260k + this.f29065a + C12361b.f30261l;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11721c0(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
