package okio;

import androidx.constraintlayout.core.motion.utils.C16717v;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.j0 */
public final class C12488j0 implements C12505n {
    @C12579k
    @C11287e

    /* renamed from: a */
    public final C12500m f30442a = new C12500m();
    @C11287e

    /* renamed from: b */
    public boolean f30443b;
    @C12579k
    @C11287e

    /* renamed from: c */
    public final C12506n0 f30444c;

    public C12488j0(@C12579k C12506n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "sink");
        this.f30444c = n0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ void m50762a() {
    }

    @C12579k
    /* renamed from: B0 */
    public C12505n mo27220B0(long j) {
        if (!this.f30443b) {
            this.f30442a.mo27220B0(j);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: B2 */
    public C12505n mo27221B2(@C12579k ByteString byteString, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!this.f30443b) {
            this.f30442a.mo27221B2(byteString, i, i2);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: G3 */
    public C12505n mo27222G3(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!this.f30443b) {
            this.f30442a.mo27222G3(byteString);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: H */
    public C12500m mo27223H() {
        return this.f30442a;
    }

    @C12579k
    /* renamed from: H2 */
    public C12505n mo27224H2(int i) {
        if (!this.f30443b) {
            this.f30442a.mo27224H2(i);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: K2 */
    public C12505n mo27225K2(int i) {
        if (!this.f30443b) {
            this.f30442a.mo27225K2(i);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: Q1 */
    public C12505n mo27226Q1(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "source");
        if (!this.f30443b) {
            this.f30442a.mo27226Q1(bArr);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: T3 */
    public C12505n mo27227T3(long j) {
        if (!this.f30443b) {
            this.f30442a.mo27227T3(j);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: W3 */
    public OutputStream mo27228W3() {
        return new C12489a(this);
    }

    @C12579k
    /* renamed from: Y0 */
    public C12505n mo27229Y0() {
        if (!this.f30443b) {
            long j = this.f30442a.mo27373j();
            if (j > 0) {
                this.f30444c.write(this.f30442a, j);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: Y2 */
    public C12505n mo27230Y2(int i) {
        if (!this.f30443b) {
            this.f30442a.mo27230Y2(i);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: b2 */
    public C12505n mo27231b2(@C12579k String str, int i, int i2, @C12579k Charset charset) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!this.f30443b) {
            this.f30442a.mo27231b2(str, i, i2, charset);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f30443b) {
            try {
                if (this.f30442a.mo27362c0() > 0) {
                    C12506n0 n0Var = this.f30444c;
                    C12500m mVar = this.f30442a;
                    n0Var.write(mVar, mVar.mo27362c0());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f30444c.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f30443b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @C12579k
    /* renamed from: e */
    public C12500m mo27232e() {
        return this.f30442a;
    }

    public void flush() {
        if (!this.f30443b) {
            if (this.f30442a.mo27362c0() > 0) {
                C12506n0 n0Var = this.f30444c;
                C12500m mVar = this.f30442a;
                n0Var.write(mVar, mVar.mo27362c0());
            }
            this.f30444c.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: g2 */
    public C12505n mo27233g2(long j) {
        if (!this.f30443b) {
            this.f30442a.mo27233g2(j);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f30443b;
    }

    @C12579k
    /* renamed from: k3 */
    public C12505n mo27235k3(@C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "source");
        if (!this.f30443b) {
            this.f30442a.mo27235k3(bArr, i, i2);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: l1 */
    public C12505n mo27236l1(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        if (!this.f30443b) {
            this.f30442a.mo27236l1(str);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: m3 */
    public C12505n mo27237m3(long j) {
        if (!this.f30443b) {
            this.f30442a.mo27237m3(j);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: o3 */
    public C12505n mo27238o3(@C12579k String str, @C12579k Charset charset) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!this.f30443b) {
            this.f30442a.mo27238o3(str, charset);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: s3 */
    public C12505n mo27239s3(@C12579k C12510p0 p0Var, long j) {
        Intrinsics.checkNotNullParameter(p0Var, "source");
        while (j > 0) {
            long read = p0Var.read(this.f30442a, j);
            if (read != -1) {
                j -= read;
                mo27229Y0();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    @C12579k
    public C12516r0 timeout() {
        return this.f30444c.timeout();
    }

    @C12579k
    public String toString() {
        return "buffer(" + this.f30444c + ')';
    }

    @C12579k
    /* renamed from: u0 */
    public C12505n mo27241u0() {
        if (!this.f30443b) {
            long c0 = this.f30442a.mo27362c0();
            if (c0 > 0) {
                this.f30444c.write(this.f30442a, c0);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: v1 */
    public C12505n mo27242v1(@C12579k String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        if (!this.f30443b) {
            this.f30442a.mo27242v1(str, i, i2);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: w0 */
    public C12505n mo27243w0(int i) {
        if (!this.f30443b) {
            this.f30442a.mo27243w0(i);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    public int write(@C12579k ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "source");
        if (!this.f30443b) {
            int write = this.f30442a.write(byteBuffer);
            mo27229Y0();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: x1 */
    public long mo27245x1(@C12579k C12510p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "source");
        long j = 0;
        while (true) {
            long read = p0Var.read(this.f30442a, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            mo27229Y0();
        }
    }

    @C12579k
    /* renamed from: z0 */
    public C12505n mo27246z0(int i) {
        if (!this.f30443b) {
            this.f30442a.mo27246z0(i);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: z2 */
    public C12505n mo27247z2(int i) {
        if (!this.f30443b) {
            this.f30442a.mo27247z2(i);
            return mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: okio.j0$a */
    public static final class C12489a extends OutputStream {

        /* renamed from: a */
        public final /* synthetic */ C12488j0 f30445a;

        public C12489a(C12488j0 j0Var) {
            this.f30445a = j0Var;
        }

        public void close() {
            this.f30445a.close();
        }

        public void flush() {
            C12488j0 j0Var = this.f30445a;
            if (!j0Var.f30443b) {
                j0Var.flush();
            }
        }

        @C12579k
        public String toString() {
            return this.f30445a + ".outputStream()";
        }

        public void write(int i) {
            C12488j0 j0Var = this.f30445a;
            if (!j0Var.f30443b) {
                j0Var.f30442a.mo27225K2((byte) i);
                this.f30445a.mo27229Y0();
                return;
            }
            throw new IOException("closed");
        }

        public void write(@C12579k byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "data");
            C12488j0 j0Var = this.f30445a;
            if (!j0Var.f30443b) {
                j0Var.f30442a.mo27235k3(bArr, i, i2);
                this.f30445a.mo27229Y0();
                return;
            }
            throw new IOException("closed");
        }
    }

    public void write(@C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "source");
        if (!this.f30443b) {
            this.f30442a.write(mVar, j);
            mo27229Y0();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
