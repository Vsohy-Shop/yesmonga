package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.r */
public final class C12515r implements C12506n0 {

    /* renamed from: a */
    public boolean f30499a;

    /* renamed from: b */
    public final C12505n f30500b;

    /* renamed from: c */
    public final Deflater f30501c;

    public C12515r(@C12579k C12505n nVar, @C12579k Deflater deflater) {
        Intrinsics.checkNotNullParameter(nVar, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f30500b = nVar;
        this.f30501c = deflater;
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    public final void mo27427a(boolean z) {
        C12498l0 q0;
        int i;
        C12500m e = this.f30500b.mo27232e();
        while (true) {
            q0 = e.mo27380q0(1);
            if (z) {
                Deflater deflater = this.f30501c;
                byte[] bArr = q0.f30457a;
                int i2 = q0.f30459c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f30501c;
                byte[] bArr2 = q0.f30457a;
                int i3 = q0.f30459c;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                q0.f30459c += i;
                e.mo27354V(e.mo27362c0() + ((long) i));
                this.f30500b.mo27229Y0();
            } else if (this.f30501c.needsInput()) {
                break;
            }
        }
        if (q0.f30458b == q0.f30459c) {
            e.f30464a = q0.mo27321b();
            C12504m0.m50967d(q0);
        }
    }

    /* renamed from: b */
    public final void mo27428b() {
        this.f30501c.finish();
        mo27427a(false);
    }

    public void close() throws IOException {
        if (!this.f30499a) {
            try {
                mo27428b();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f30501c.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.f30500b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f30499a = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() throws IOException {
        mo27427a(true);
        this.f30500b.flush();
    }

    @C12579k
    public C12516r0 timeout() {
        return this.f30500b.timeout();
    }

    @C12579k
    public String toString() {
        return "DeflaterSink(" + this.f30500b + ')';
    }

    public void write(@C12579k C12500m mVar, long j) throws IOException {
        Intrinsics.checkNotNullParameter(mVar, "source");
        C12487j.m50748e(mVar.mo27362c0(), 0, j);
        while (j > 0) {
            C12498l0 l0Var = mVar.f30464a;
            Intrinsics.checkNotNull(l0Var);
            int min = (int) Math.min(j, (long) (l0Var.f30459c - l0Var.f30458b));
            this.f30501c.setInput(l0Var.f30457a, l0Var.f30458b, min);
            mo27427a(false);
            long j2 = (long) min;
            mVar.mo27354V(mVar.mo27362c0() - j2);
            int i = l0Var.f30458b + min;
            l0Var.f30458b = i;
            if (i == l0Var.f30459c) {
                mVar.f30464a = l0Var.mo27321b();
                C12504m0.m50967d(l0Var);
            }
            j -= j2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12515r(@C12579k C12506n0 n0Var, @C12579k Deflater deflater) {
        this(C12465c0.m50480c(n0Var), deflater);
        Intrinsics.checkNotNullParameter(n0Var, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
    }
}
