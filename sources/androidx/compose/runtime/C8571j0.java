package androidx.compose.runtime;

import androidx.compose.runtime.tooling.C8680b;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.j0 */
public final class C8571j0 implements Iterator<C8680b>, C11345a {
    @C12579k

    /* renamed from: a */
    public final C8692w1 f23002a;

    /* renamed from: b */
    public final int f23003b;

    /* renamed from: c */
    public int f23004c;

    /* renamed from: d */
    public final int f23005d;

    public C8571j0(@C12579k C8692w1 w1Var, int i, int i2) {
        Intrinsics.checkNotNullParameter(w1Var, "table");
        this.f23002a = w1Var;
        this.f23003b = i2;
        this.f23004c = i;
        this.f23005d = w1Var.mo16862t0();
        if (w1Var.mo16863u0()) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: b */
    public final int mo16224b() {
        return this.f23003b;
    }

    @C12579k
    /* renamed from: c */
    public final C8692w1 mo16225c() {
        return this.f23002a;
    }

    @C12579k
    /* renamed from: d */
    public C8680b next() {
        mo16227e();
        int i = this.f23004c;
        this.f23004c = C8698y1.m32074Q(this.f23002a.mo16859p0(), i) + i;
        return new C8695x1(this.f23002a, i, this.f23005d);
    }

    /* renamed from: e */
    public final void mo16227e() {
        if (this.f23002a.mo16862t0() != this.f23005d) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        return this.f23004c < this.f23003b;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
