package okio;

import com.contentsquare.android.api.C14092c;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.x */
public final class C12525x implements C12510p0 {

    /* renamed from: a */
    public byte f30516a;

    /* renamed from: b */
    public final C12495k0 f30517b;

    /* renamed from: c */
    public final Inflater f30518c;

    /* renamed from: d */
    public final C12461a0 f30519d;

    /* renamed from: e */
    public final CRC32 f30520e = new CRC32();

    public C12525x(@C12579k C12510p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "source");
        C12495k0 k0Var = new C12495k0(p0Var);
        this.f30517b = k0Var;
        Inflater inflater = new Inflater(true);
        this.f30518c = inflater;
        this.f30519d = new C12461a0((C12507o) k0Var, inflater);
    }

    /* renamed from: a */
    public final void mo27455a(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: b */
    public final void mo27456b() throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        this.f30517b.mo27293f2(10);
        byte D = this.f30517b.f30450a.mo27330D(3);
        boolean z4 = true;
        if (((D >> 1) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo27458d(this.f30517b.f30450a, 0, 10);
        }
        mo27455a("ID1ID2", 8075, this.f30517b.readShort());
        this.f30517b.skip(8);
        if (((D >> 2) & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f30517b.mo27293f2(2);
            if (z) {
                mo27458d(this.f30517b.f30450a, 0, 2);
            }
            long R1 = (long) this.f30517b.f30450a.mo27280R1();
            this.f30517b.mo27293f2(R1);
            if (z) {
                mo27458d(this.f30517b.f30450a, 0, R1);
            }
            this.f30517b.skip(R1);
        }
        if (((D >> 3) & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            long i2 = this.f30517b.mo27295i2((byte) 0);
            if (i2 != -1) {
                if (z) {
                    mo27458d(this.f30517b.f30450a, 0, i2 + 1);
                }
                this.f30517b.skip(i2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((D >> 4) & 1) != 1) {
            z4 = false;
        }
        if (z4) {
            long i22 = this.f30517b.mo27295i2((byte) 0);
            if (i22 != -1) {
                if (z) {
                    mo27458d(this.f30517b.f30450a, 0, i22 + 1);
                }
                this.f30517b.skip(i22 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            mo27455a("FHCRC", this.f30517b.mo27280R1(), (short) ((int) this.f30520e.getValue()));
            this.f30520e.reset();
        }
    }

    /* renamed from: c */
    public final void mo27457c() throws IOException {
        mo27455a(C14092c.C14093a.f34736S, this.f30517b.mo27314y3(), (int) this.f30520e.getValue());
        mo27455a("ISIZE", this.f30517b.mo27314y3(), (int) this.f30518c.getBytesWritten());
    }

    public void close() throws IOException {
        this.f30519d.close();
    }

    /* renamed from: d */
    public final void mo27458d(C12500m mVar, long j, long j2) {
        C12498l0 l0Var = mVar.f30464a;
        Intrinsics.checkNotNull(l0Var);
        while (true) {
            int i = l0Var.f30459c;
            int i2 = l0Var.f30458b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            l0Var = l0Var.f30462f;
            Intrinsics.checkNotNull(l0Var);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) l0Var.f30458b) + j);
            int min = (int) Math.min((long) (l0Var.f30459c - i3), j2);
            this.f30520e.update(l0Var.f30457a, i3, min);
            j2 -= (long) min;
            l0Var = l0Var.f30462f;
            Intrinsics.checkNotNull(l0Var);
            j = 0;
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
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f30516a == 0) {
                mo27456b();
                this.f30516a = 1;
            }
            if (this.f30516a == 1) {
                long c0 = mVar.mo27362c0();
                long read = this.f30519d.read(mVar, j);
                if (read != -1) {
                    mo27458d(mVar, c0, read);
                    return read;
                }
                this.f30516a = 2;
            }
            if (this.f30516a == 2) {
                mo27457c();
                this.f30516a = 3;
                if (!this.f30517b.mo27275J2()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    @C12579k
    public C12516r0 timeout() {
        return this.f30517b.timeout();
    }
}
