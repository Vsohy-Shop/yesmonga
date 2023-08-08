package okio;

import java.io.IOException;
import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.p */
public final class C12509p implements C12506n0 {

    /* renamed from: a */
    public final int f30481a;

    /* renamed from: b */
    public boolean f30482b;

    /* renamed from: c */
    public final C12505n f30483c;
    @C12579k

    /* renamed from: d */
    public final Cipher f30484d;

    public C12509p(@C12579k C12505n nVar, @C12579k Cipher cipher) {
        boolean z;
        Intrinsics.checkNotNullParameter(nVar, "sink");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.f30483c = nVar;
        this.f30484d = cipher;
        int blockSize = cipher.getBlockSize();
        this.f30481a = blockSize;
        if (blockSize > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
        }
    }

    /* renamed from: a */
    public final Throwable mo27410a() {
        int outputSize = this.f30484d.getOutputSize(0);
        Throwable th = null;
        if (outputSize == 0) {
            return null;
        }
        C12500m e = this.f30483c.mo27232e();
        C12498l0 q0 = e.mo27380q0(outputSize);
        try {
            int doFinal = this.f30484d.doFinal(q0.f30457a, q0.f30459c);
            q0.f30459c += doFinal;
            e.mo27354V(e.mo27362c0() + ((long) doFinal));
        } catch (Throwable th2) {
            th = th2;
        }
        if (q0.f30458b == q0.f30459c) {
            e.f30464a = q0.mo27321b();
            C12504m0.m50967d(q0);
        }
        return th;
    }

    @C12579k
    /* renamed from: b */
    public final Cipher mo27411b() {
        return this.f30484d;
    }

    /* renamed from: c */
    public final int mo27412c(C12500m mVar, long j) {
        boolean z;
        C12498l0 l0Var = mVar.f30464a;
        Intrinsics.checkNotNull(l0Var);
        int min = (int) Math.min(j, (long) (l0Var.f30459c - l0Var.f30458b));
        C12500m e = this.f30483c.mo27232e();
        int outputSize = this.f30484d.getOutputSize(min);
        while (outputSize > 8192) {
            int i = this.f30481a;
            if (min > i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                min -= i;
                outputSize = this.f30484d.getOutputSize(min);
            } else {
                throw new IllegalStateException(("Unexpected output size " + outputSize + " for input size " + min).toString());
            }
        }
        C12498l0 q0 = e.mo27380q0(outputSize);
        int update = this.f30484d.update(l0Var.f30457a, l0Var.f30458b, min, q0.f30457a, q0.f30459c);
        q0.f30459c += update;
        e.mo27354V(e.mo27362c0() + ((long) update));
        if (q0.f30458b == q0.f30459c) {
            e.f30464a = q0.mo27321b();
            C12504m0.m50967d(q0);
        }
        this.f30483c.mo27229Y0();
        mVar.mo27354V(mVar.mo27362c0() - ((long) min));
        int i2 = l0Var.f30458b + min;
        l0Var.f30458b = i2;
        if (i2 == l0Var.f30459c) {
            mVar.f30464a = l0Var.mo27321b();
            C12504m0.m50967d(l0Var);
        }
        return min;
    }

    public void close() throws IOException {
        if (!this.f30482b) {
            this.f30482b = true;
            Throwable a = mo27410a();
            try {
                this.f30483c.close();
            } catch (Throwable th) {
                if (a == null) {
                    a = th;
                }
            }
            if (a != null) {
                throw a;
            }
        }
    }

    public void flush() {
        this.f30483c.flush();
    }

    @C12579k
    public C12516r0 timeout() {
        return this.f30483c.timeout();
    }

    public void write(@C12579k C12500m mVar, long j) throws IOException {
        Intrinsics.checkNotNullParameter(mVar, "source");
        C12487j.m50748e(mVar.mo27362c0(), 0, j);
        if (!this.f30482b) {
            while (j > 0) {
                j -= (long) mo27412c(mVar, j);
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
