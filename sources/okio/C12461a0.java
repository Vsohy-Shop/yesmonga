package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.a0 */
public final class C12461a0 implements C12510p0 {

    /* renamed from: a */
    public int f30395a;

    /* renamed from: b */
    public boolean f30396b;

    /* renamed from: c */
    public final C12507o f30397c;

    /* renamed from: d */
    public final Inflater f30398d;

    public C12461a0(@C12579k C12507o oVar, @C12579k Inflater inflater) {
        Intrinsics.checkNotNullParameter(oVar, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f30397c = oVar;
        this.f30398d = inflater;
    }

    /* renamed from: a */
    public final long mo27175a(@C12579k C12500m mVar, long j) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!this.f30396b)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0;
        } else {
            try {
                C12498l0 q0 = mVar.mo27380q0(1);
                mo27176b();
                int inflate = this.f30398d.inflate(q0.f30457a, q0.f30459c, (int) Math.min(j, (long) (8192 - q0.f30459c)));
                mo27177c();
                if (inflate > 0) {
                    q0.f30459c += inflate;
                    long j2 = (long) inflate;
                    mVar.mo27354V(mVar.mo27362c0() + j2);
                    return j2;
                }
                if (q0.f30458b == q0.f30459c) {
                    mVar.f30464a = q0.mo27321b();
                    C12504m0.m50967d(q0);
                }
                return 0;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo27176b() throws IOException {
        if (!this.f30398d.needsInput()) {
            return false;
        }
        if (this.f30397c.mo27275J2()) {
            return true;
        }
        C12498l0 l0Var = this.f30397c.mo27292e().f30464a;
        Intrinsics.checkNotNull(l0Var);
        int i = l0Var.f30459c;
        int i2 = l0Var.f30458b;
        int i3 = i - i2;
        this.f30395a = i3;
        this.f30398d.setInput(l0Var.f30457a, i2, i3);
        return false;
    }

    /* renamed from: c */
    public final void mo27177c() {
        int i = this.f30395a;
        if (i != 0) {
            int remaining = i - this.f30398d.getRemaining();
            this.f30395a -= remaining;
            this.f30397c.skip((long) remaining);
        }
    }

    public void close() throws IOException {
        if (!this.f30396b) {
            this.f30398d.end();
            this.f30396b = true;
            this.f30397c.close();
        }
    }

    public long read(@C12579k C12500m mVar, long j) throws IOException {
        Intrinsics.checkNotNullParameter(mVar, "sink");
        do {
            long a = mo27175a(mVar, j);
            if (a > 0) {
                return a;
            }
            if (this.f30398d.finished() || this.f30398d.needsDictionary()) {
                return -1;
            }
        } while (!this.f30397c.mo27275J2());
        throw new EOFException("source exhausted prematurely");
    }

    @C12579k
    public C12516r0 timeout() {
        return this.f30397c.timeout();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12461a0(@C12579k C12510p0 p0Var, @C12579k Inflater inflater) {
        this(C12465c0.m50481d(p0Var), inflater);
        Intrinsics.checkNotNullParameter(p0Var, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
