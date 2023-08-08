package okio;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.b0 */
public final class C12463b0 implements C12510p0 {

    /* renamed from: a */
    public final InputStream f30399a;

    /* renamed from: b */
    public final C12516r0 f30400b;

    public C12463b0(@C12579k InputStream inputStream, @C12579k C12516r0 r0Var) {
        Intrinsics.checkNotNullParameter(inputStream, "input");
        Intrinsics.checkNotNullParameter(r0Var, "timeout");
        this.f30399a = inputStream;
        this.f30400b = r0Var;
    }

    public void close() {
        this.f30399a.close();
    }

    public long read(@C12579k C12500m mVar, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                this.f30400b.throwIfReached();
                C12498l0 q0 = mVar.mo27380q0(1);
                int read = this.f30399a.read(q0.f30457a, q0.f30459c, (int) Math.min(j, (long) (8192 - q0.f30459c)));
                if (read != -1) {
                    q0.f30459c += read;
                    long j2 = (long) read;
                    mVar.mo27354V(mVar.mo27362c0() + j2);
                    return j2;
                } else if (q0.f30458b != q0.f30459c) {
                    return -1;
                } else {
                    mVar.f30464a = q0.mo27321b();
                    C12504m0.m50967d(q0);
                    return -1;
                }
            } catch (AssertionError e) {
                if (C12465c0.m50488k(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    @C12579k
    public C12516r0 timeout() {
        return this.f30400b;
    }

    @C12579k
    public String toString() {
        return "source(" + this.f30399a + ')';
    }
}
