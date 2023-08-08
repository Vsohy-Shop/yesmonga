package okio;

import java.io.IOException;
import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.q */
public final class C12511q implements C12510p0 {

    /* renamed from: a */
    public final int f30485a;

    /* renamed from: b */
    public final C12500m f30486b = new C12500m();

    /* renamed from: c */
    public boolean f30487c;

    /* renamed from: d */
    public boolean f30488d;

    /* renamed from: e */
    public final C12507o f30489e;
    @C12579k

    /* renamed from: f */
    public final Cipher f30490f;

    public C12511q(@C12579k C12507o oVar, @C12579k Cipher cipher) {
        boolean z;
        Intrinsics.checkNotNullParameter(oVar, "source");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.f30489e = oVar;
        this.f30490f = cipher;
        int blockSize = cipher.getBlockSize();
        this.f30485a = blockSize;
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
    public final void mo27413a() {
        int outputSize = this.f30490f.getOutputSize(0);
        if (outputSize != 0) {
            C12498l0 q0 = this.f30486b.mo27380q0(outputSize);
            int doFinal = this.f30490f.doFinal(q0.f30457a, q0.f30458b);
            q0.f30459c += doFinal;
            C12500m mVar = this.f30486b;
            mVar.mo27354V(mVar.mo27362c0() + ((long) doFinal));
            if (q0.f30458b == q0.f30459c) {
                this.f30486b.f30464a = q0.mo27321b();
                C12504m0.m50967d(q0);
            }
        }
    }

    @C12579k
    /* renamed from: b */
    public final Cipher mo27414b() {
        return this.f30490f;
    }

    /* renamed from: c */
    public final void mo27415c() {
        while (this.f30486b.mo27362c0() == 0) {
            if (this.f30489e.mo27275J2()) {
                this.f30487c = true;
                mo27413a();
                return;
            }
            mo27416d();
        }
    }

    public void close() throws IOException {
        this.f30488d = true;
        this.f30489e.close();
    }

    /* renamed from: d */
    public final void mo27416d() {
        boolean z;
        C12498l0 l0Var = this.f30489e.mo27292e().f30464a;
        Intrinsics.checkNotNull(l0Var);
        int i = l0Var.f30459c - l0Var.f30458b;
        int outputSize = this.f30490f.getOutputSize(i);
        while (outputSize > 8192) {
            int i2 = this.f30485a;
            if (i > i2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i -= i2;
                outputSize = this.f30490f.getOutputSize(i);
            } else {
                throw new IllegalStateException(("Unexpected output size " + outputSize + " for input size " + i).toString());
            }
        }
        C12498l0 q0 = this.f30486b.mo27380q0(outputSize);
        int update = this.f30490f.update(l0Var.f30457a, l0Var.f30458b, i, q0.f30457a, q0.f30458b);
        this.f30489e.skip((long) i);
        q0.f30459c += update;
        C12500m mVar = this.f30486b;
        mVar.mo27354V(mVar.mo27362c0() + ((long) update));
        if (q0.f30458b == q0.f30459c) {
            this.f30486b.f30464a = q0.mo27321b();
            C12504m0.m50967d(q0);
        }
    }

    public long read(@C12579k C12500m mVar, long j) throws IOException {
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
        } else if (!(true ^ this.f30488d)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f30487c) {
                return this.f30486b.read(mVar, j);
            }
            mo27415c();
            return this.f30486b.read(mVar, j);
        }
    }

    @C12579k
    public C12516r0 timeout() {
        return this.f30489e.timeout();
    }
}
