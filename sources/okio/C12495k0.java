package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11600b;
import okio.internal.C12481a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: okio.k0 */
public final class C12495k0 implements C12507o {
    @C12579k
    @C11287e

    /* renamed from: a */
    public final C12500m f30450a = new C12500m();
    @C11287e

    /* renamed from: b */
    public boolean f30451b;
    @C12579k
    @C11287e

    /* renamed from: c */
    public final C12510p0 f30452c;

    public C12495k0(@C12579k C12510p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "source");
        this.f30452c = p0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ void m50796a() {
    }

    @C12579k
    /* renamed from: B3 */
    public String mo27268B3() {
        this.f30450a.mo27245x1(this.f30452c);
        return this.f30450a.mo27268B3();
    }

    /* renamed from: E1 */
    public boolean mo27269E1(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!this.f30451b) {
            while (this.f30450a.mo27362c0() < j) {
                if (this.f30452c.read(this.f30450a, (long) 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @C12579k
    /* renamed from: E3 */
    public String mo27270E3(long j, @C12579k Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        mo27293f2(j);
        return this.f30450a.mo27270E3(j, charset);
    }

    @C12579k
    /* renamed from: G2 */
    public byte[] mo27271G2() {
        this.f30450a.mo27245x1(this.f30452c);
        return this.f30450a.mo27271G2();
    }

    @C12579k
    /* renamed from: H */
    public C12500m mo27272H() {
        return this.f30450a;
    }

    /* renamed from: J0 */
    public long mo27273J0(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "bytes");
        return mo27299m0(byteString, 0);
    }

    @C12579k
    /* renamed from: J1 */
    public String mo27274J1() {
        return mo27290b1(Long.MAX_VALUE);
    }

    /* renamed from: J2 */
    public boolean mo27275J2() {
        if (!(!this.f30451b)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f30450a.mo27275J2() || this.f30452c.read(this.f30450a, (long) 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: M3 */
    public long mo27276M3(@C12579k C12506n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "sink");
        long j = 0;
        while (this.f30452c.read(this.f30450a, (long) 8192) != -1) {
            long j2 = this.f30450a.mo27373j();
            if (j2 > 0) {
                j += j2;
                n0Var.write(this.f30450a, j2);
            }
        }
        if (this.f30450a.mo27362c0() <= 0) {
            return j;
        }
        long c0 = j + this.f30450a.mo27362c0();
        C12500m mVar = this.f30450a;
        n0Var.write(mVar, mVar.mo27362c0());
        return c0;
    }

    /* renamed from: N1 */
    public boolean mo27277N1(long j, @C12579k ByteString byteString, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "bytes");
        if (!this.f30451b) {
            if (j >= 0 && i >= 0 && i2 >= 0 && byteString.size() - i >= i2) {
                int i3 = 0;
                while (i3 < i2) {
                    long j2 = ((long) i3) + j;
                    if (mo27269E1(1 + j2) && this.f30450a.mo27330D(j2) == byteString.mo27126f0(i + i3)) {
                        i3++;
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: O1 */
    public byte[] mo27278O1(long j) {
        mo27293f2(j);
        return this.f30450a.mo27278O1(j);
    }

    /* renamed from: O2 */
    public long mo27279O2() {
        int i;
        mo27293f2(1);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!mo27269E1(j2)) {
                break;
            }
            byte D = this.f30450a.mo27330D(j);
            if ((D >= ((byte) 48) && D <= ((byte) 57)) || (j == 0 && D == ((byte) 45))) {
                j = j2;
            } else if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9] or '-' character but was 0x");
                String num = Integer.toString(D, C11600b.m45172a(C11600b.m45172a(16)));
                Intrinsics.checkNotNullExpressionValue(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sb.append(num);
                throw new NumberFormatException(sb.toString());
            }
        }
        return this.f30450a.mo27279O2();
    }

    /* renamed from: R1 */
    public short mo27280R1() {
        mo27293f2(2);
        return this.f30450a.mo27280R1();
    }

    @C12579k
    /* renamed from: R3 */
    public C12507o mo27281R3() {
        return C12465c0.m50481d(new C12476h0(this));
    }

    /* renamed from: S0 */
    public long mo27282S0(byte b, long j) {
        return mo27285V0(b, j, Long.MAX_VALUE);
    }

    /* renamed from: T0 */
    public void mo27283T0(@C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "sink");
        try {
            mo27293f2(j);
            this.f30450a.mo27283T0(mVar, j);
        } catch (EOFException e) {
            mVar.mo27245x1(this.f30450a);
            throw e;
        }
    }

    /* renamed from: U1 */
    public long mo27284U1() {
        mo27293f2(8);
        return this.f30450a.mo27284U1();
    }

    /* renamed from: V0 */
    public long mo27285V0(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f30451b) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long V0 = this.f30450a.mo27285V0(b, j, j2);
                    if (V0 != -1) {
                        return V0;
                    }
                    long c0 = this.f30450a.mo27362c0();
                    if (c0 >= j2 || this.f30452c.read(this.f30450a, (long) 8192) == -1) {
                        return -1;
                    }
                    j = Math.max(j, c0);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: W0 */
    public long mo27286W0(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "targetBytes");
        return mo27291d2(byteString, 0);
    }

    @C12580l
    /* renamed from: X0 */
    public String mo27287X0() {
        long i2 = mo27295i2((byte) 10);
        if (i2 != -1) {
            return C12481a.m50610i0(this.f30450a, i2);
        }
        if (this.f30450a.mo27362c0() != 0) {
            return mo27300n2(this.f30450a.mo27362c0());
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: X3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo27288X3() {
        /*
            r5 = this;
            r0 = 1
            r5.mo27293f2(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.mo27269E1(r2)
            if (r2 == 0) goto L_0x0064
            okio.m r2 = r5.f30450a
            long r3 = (long) r0
            byte r2 = r2.mo27330D(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0064
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            int r3 = kotlin.text.C11600b.m45172a(r3)
            int r3 = kotlin.text.C11600b.m45172a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0064:
            okio.m r0 = r5.f30450a
            long r0 = r0.mo27288X3()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C12495k0.mo27288X3():long");
    }

    /* renamed from: Y3 */
    public int mo27289Y3(@C12579k C12471f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "options");
        if (!this.f30451b) {
            while (true) {
                int k0 = C12481a.m50614k0(this.f30450a, f0Var, true);
                if (k0 == -2) {
                    if (this.f30452c.read(this.f30450a, (long) 8192) == -1) {
                        break;
                    }
                } else if (k0 != -1) {
                    this.f30450a.skip((long) f0Var.mo27195q()[k0].size());
                    return k0;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: b1 */
    public String mo27290b1(long j) {
        boolean z;
        long j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long V0 = mo27285V0(b, 0, j2);
            if (V0 != -1) {
                return C12481a.m50610i0(this.f30450a, V0);
            }
            if (j2 < Long.MAX_VALUE && mo27269E1(j2) && this.f30450a.mo27330D(j2 - 1) == ((byte) 13) && mo27269E1(1 + j2) && this.f30450a.mo27330D(j2) == b) {
                return C12481a.m50610i0(this.f30450a, j2);
            }
            C12500m mVar = new C12500m();
            C12500m mVar2 = this.f30450a;
            mVar2.mo27383s(mVar, 0, Math.min((long) 32, mVar2.mo27362c0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f30450a.mo27362c0(), j) + " content=" + mVar.mo27301n3().mo27150t0() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    public void close() {
        if (!this.f30451b) {
            this.f30451b = true;
            this.f30452c.close();
            this.f30450a.mo27367f();
        }
    }

    /* renamed from: d2 */
    public long mo27291d2(@C12579k ByteString byteString, long j) {
        Intrinsics.checkNotNullParameter(byteString, "targetBytes");
        if (!this.f30451b) {
            while (true) {
                long d2 = this.f30450a.mo27291d2(byteString, j);
                if (d2 != -1) {
                    return d2;
                }
                long c0 = this.f30450a.mo27362c0();
                if (this.f30452c.read(this.f30450a, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, c0);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @C12579k
    /* renamed from: e */
    public C12500m mo27292e() {
        return this.f30450a;
    }

    /* renamed from: f2 */
    public void mo27293f2(long j) {
        if (!mo27269E1(j)) {
            throw new EOFException();
        }
    }

    @C12579k
    /* renamed from: h0 */
    public InputStream mo27294h0() {
        return new C12496a(this);
    }

    /* renamed from: i2 */
    public long mo27295i2(byte b) {
        return mo27285V0(b, 0, Long.MAX_VALUE);
    }

    @C12579k
    /* renamed from: i3 */
    public String mo27296i3(@C12579k Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f30450a.mo27245x1(this.f30452c);
        return this.f30450a.mo27296i3(charset);
    }

    public boolean isOpen() {
        return !this.f30451b;
    }

    /* renamed from: l3 */
    public int mo27298l3() {
        mo27293f2(1);
        byte D = this.f30450a.mo27330D(0);
        if ((D & 224) == 192) {
            mo27293f2(2);
        } else if ((D & 240) == 224) {
            mo27293f2(3);
        } else if ((D & 248) == 240) {
            mo27293f2(4);
        }
        return this.f30450a.mo27298l3();
    }

    /* renamed from: m0 */
    public long mo27299m0(@C12579k ByteString byteString, long j) {
        Intrinsics.checkNotNullParameter(byteString, "bytes");
        if (!this.f30451b) {
            while (true) {
                long m0 = this.f30450a.mo27299m0(byteString, j);
                if (m0 != -1) {
                    return m0;
                }
                long c0 = this.f30450a.mo27362c0();
                if (this.f30452c.read(this.f30450a, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (c0 - ((long) byteString.size())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @C12579k
    /* renamed from: n2 */
    public String mo27300n2(long j) {
        mo27293f2(j);
        return this.f30450a.mo27300n2(j);
    }

    @C12579k
    /* renamed from: n3 */
    public ByteString mo27301n3() {
        this.f30450a.mo27245x1(this.f30452c);
        return this.f30450a.mo27301n3();
    }

    /* renamed from: o1 */
    public boolean mo27302o1(long j, @C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "bytes");
        return mo27277N1(j, byteString, 0, byteString.size());
    }

    public int read(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    public byte readByte() {
        mo27293f2(1);
        return this.f30450a.readByte();
    }

    public void readFully(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "sink");
        try {
            mo27293f2((long) bArr.length);
            this.f30450a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f30450a.mo27362c0() > 0) {
                C12500m mVar = this.f30450a;
                int read = mVar.read(bArr, i, (int) mVar.mo27362c0());
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public int readInt() {
        mo27293f2(4);
        return this.f30450a.readInt();
    }

    public long readLong() {
        mo27293f2(8);
        return this.f30450a.readLong();
    }

    public short readShort() {
        mo27293f2(2);
        return this.f30450a.readShort();
    }

    public void skip(long j) {
        if (!this.f30451b) {
            while (j > 0) {
                if (this.f30450a.mo27362c0() == 0 && this.f30452c.read(this.f30450a, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f30450a.mo27362c0());
                this.f30450a.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: t2 */
    public ByteString mo27312t2(long j) {
        mo27293f2(j);
        return this.f30450a.mo27312t2(j);
    }

    @C12579k
    public C12516r0 timeout() {
        return this.f30452c.timeout();
    }

    @C12579k
    public String toString() {
        return "buffer(" + this.f30452c + ')';
    }

    /* renamed from: y3 */
    public int mo27314y3() {
        mo27293f2(4);
        return this.f30450a.mo27314y3();
    }

    public long read(@C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!this.f30451b)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f30450a.mo27362c0() == 0 && this.f30452c.read(this.f30450a, (long) 8192) == -1) {
            return -1;
        } else {
            return this.f30450a.read(mVar, Math.min(j, this.f30450a.mo27362c0()));
        }
    }

    /* renamed from: okio.k0$a */
    public static final class C12496a extends InputStream {

        /* renamed from: a */
        public final /* synthetic */ C12495k0 f30453a;

        public C12496a(C12495k0 k0Var) {
            this.f30453a = k0Var;
        }

        public int available() {
            C12495k0 k0Var = this.f30453a;
            if (!k0Var.f30451b) {
                return (int) Math.min(k0Var.f30450a.mo27362c0(), (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f30453a.close();
        }

        public int read() {
            C12495k0 k0Var = this.f30453a;
            if (!k0Var.f30451b) {
                if (k0Var.f30450a.mo27362c0() == 0) {
                    C12495k0 k0Var2 = this.f30453a;
                    if (k0Var2.f30452c.read(k0Var2.f30450a, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f30453a.f30450a.readByte() & 255;
            }
            throw new IOException("closed");
        }

        @C12579k
        public String toString() {
            return this.f30453a + ".inputStream()";
        }

        public int read(@C12579k byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "data");
            if (!this.f30453a.f30451b) {
                C12487j.m50748e((long) bArr.length, (long) i, (long) i2);
                if (this.f30453a.f30450a.mo27362c0() == 0) {
                    C12495k0 k0Var = this.f30453a;
                    if (k0Var.f30452c.read(k0Var.f30450a, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f30453a.f30450a.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    public int read(@C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "sink");
        long j = (long) i2;
        C12487j.m50748e((long) bArr.length, (long) i, j);
        if (this.f30450a.mo27362c0() == 0 && this.f30452c.read(this.f30450a, (long) 8192) == -1) {
            return -1;
        }
        return this.f30450a.read(bArr, i, (int) Math.min(j, this.f30450a.mo27362c0()));
    }

    public int read(@C12579k ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "sink");
        if (this.f30450a.mo27362c0() == 0 && this.f30452c.read(this.f30450a, (long) 8192) == -1) {
            return -1;
        }
        return this.f30450a.read(byteBuffer);
    }
}
