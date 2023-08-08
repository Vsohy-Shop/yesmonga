package okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.w */
public final class C12524w implements C12506n0 {

    /* renamed from: a */
    public final C12488j0 f30511a;
    @C12579k

    /* renamed from: b */
    public final Deflater f30512b;

    /* renamed from: c */
    public final C12515r f30513c;

    /* renamed from: d */
    public boolean f30514d;

    /* renamed from: e */
    public final CRC32 f30515e = new CRC32();

    public C12524w(@C12579k C12506n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "sink");
        C12488j0 j0Var = new C12488j0(n0Var);
        this.f30511a = j0Var;
        Deflater deflater = new Deflater(-1, true);
        this.f30512b = deflater;
        this.f30513c = new C12515r((C12505n) j0Var, deflater);
        C12500m mVar = j0Var.f30442a;
        mVar.mo27247z2(8075);
        mVar.mo27225K2(8);
        mVar.mo27225K2(0);
        mVar.mo27246z0(0);
        mVar.mo27225K2(0);
        mVar.mo27225K2(0);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "deflater", imports = {}))
    @C11314h(name = "-deprecated_deflater")
    @C12579k
    /* renamed from: a */
    public final Deflater mo27451a() {
        return this.f30512b;
    }

    @C11314h(name = "deflater")
    @C12579k
    /* renamed from: b */
    public final Deflater mo27452b() {
        return this.f30512b;
    }

    /* renamed from: c */
    public final void mo27453c(C12500m mVar, long j) {
        C12498l0 l0Var = mVar.f30464a;
        Intrinsics.checkNotNull(l0Var);
        while (j > 0) {
            int min = (int) Math.min(j, (long) (l0Var.f30459c - l0Var.f30458b));
            this.f30515e.update(l0Var.f30457a, l0Var.f30458b, min);
            j -= (long) min;
            l0Var = l0Var.f30462f;
            Intrinsics.checkNotNull(l0Var);
        }
    }

    public void close() throws IOException {
        if (!this.f30514d) {
            try {
                this.f30513c.mo27428b();
                mo27454d();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f30512b.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.f30511a.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f30514d = true;
            if (th != null) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void mo27454d() {
        this.f30511a.mo27224H2((int) this.f30515e.getValue());
        this.f30511a.mo27224H2((int) this.f30512b.getBytesRead());
    }

    public void flush() throws IOException {
        this.f30513c.flush();
    }

    @C12579k
    public C12516r0 timeout() {
        return this.f30511a.timeout();
    }

    public void write(@C12579k C12500m mVar, long j) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "source");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (i != 0) {
            mo27453c(mVar, j);
            this.f30513c.write(mVar, j);
        }
    }
}
