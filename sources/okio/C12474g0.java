package okio;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.g0 */
public final class C12474g0 implements C12506n0 {

    /* renamed from: a */
    public final OutputStream f30417a;

    /* renamed from: b */
    public final C12516r0 f30418b;

    public C12474g0(@C12579k OutputStream outputStream, @C12579k C12516r0 r0Var) {
        Intrinsics.checkNotNullParameter(outputStream, "out");
        Intrinsics.checkNotNullParameter(r0Var, "timeout");
        this.f30417a = outputStream;
        this.f30418b = r0Var;
    }

    public void close() {
        this.f30417a.close();
    }

    public void flush() {
        this.f30417a.flush();
    }

    @C12579k
    public C12516r0 timeout() {
        return this.f30418b;
    }

    @C12579k
    public String toString() {
        return "sink(" + this.f30417a + ')';
    }

    public void write(@C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "source");
        C12487j.m50748e(mVar.mo27362c0(), 0, j);
        while (j > 0) {
            this.f30418b.throwIfReached();
            C12498l0 l0Var = mVar.f30464a;
            Intrinsics.checkNotNull(l0Var);
            int min = (int) Math.min(j, (long) (l0Var.f30459c - l0Var.f30458b));
            this.f30417a.write(l0Var.f30457a, l0Var.f30458b, min);
            l0Var.f30458b += min;
            long j2 = (long) min;
            j -= j2;
            mVar.mo27354V(mVar.mo27362c0() - j2);
            if (l0Var.f30458b == l0Var.f30459c) {
                mVar.f30464a = l0Var.mo27321b();
                C12504m0.m50967d(l0Var);
            }
        }
    }
}
