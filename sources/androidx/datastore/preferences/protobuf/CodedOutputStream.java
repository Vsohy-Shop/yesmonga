package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

public abstract class CodedOutputStream extends C18864t {

    /* renamed from: c */
    public static final Logger f47485c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d */
    public static final boolean f47486d = C18923z3.m88372S();
    @Deprecated

    /* renamed from: e */
    public static final int f47487e = 4;

    /* renamed from: f */
    public static final int f47488f = 4096;

    /* renamed from: a */
    public C18907y f47489a;

    /* renamed from: b */
    public boolean f47490b;

    public static class OutOfSpaceException extends IOException {

        /* renamed from: a */
        public static final String f47491a = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        public OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$b */
    public static abstract class C18619b extends CodedOutputStream {

        /* renamed from: g */
        public final byte[] f47492g;

        /* renamed from: h */
        public final int f47493h;

        /* renamed from: i */
        public int f47494i;

        /* renamed from: j */
        public int f47495j;

        public C18619b(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f47492g = bArr;
                this.f47493h = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* renamed from: f1 */
        public final int mo53836f1() {
            return this.f47495j;
        }

        /* renamed from: j2 */
        public final void mo53862j2(byte b) {
            byte[] bArr = this.f47492g;
            int i = this.f47494i;
            this.f47494i = i + 1;
            bArr[i] = b;
            this.f47495j++;
        }

        /* renamed from: k2 */
        public final void mo53863k2(int i) {
            byte[] bArr = this.f47492g;
            int i2 = this.f47494i;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f47494i = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f47495j += 4;
        }

        /* renamed from: l2 */
        public final void mo53864l2(long j) {
            byte[] bArr = this.f47492g;
            int i = this.f47494i;
            int i2 = i + 1;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f47494i = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f47495j += 8;
        }

        /* renamed from: m2 */
        public final void mo53865m2(int i) {
            if (i >= 0) {
                mo53867o2(i);
            } else {
                mo53868p2((long) i);
            }
        }

        /* renamed from: n2 */
        public final void mo53866n2(int i, int i2) {
            mo53867o2(WireFormat.m85346c(i, i2));
        }

        /* renamed from: o2 */
        public final void mo53867o2(int i) {
            if (CodedOutputStream.f47486d) {
                long j = (long) this.f47494i;
                while ((i & -128) != 0) {
                    byte[] bArr = this.f47492g;
                    int i2 = this.f47494i;
                    this.f47494i = i2 + 1;
                    C18923z3.m88387d0(bArr, (long) i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f47492g;
                int i3 = this.f47494i;
                this.f47494i = i3 + 1;
                C18923z3.m88387d0(bArr2, (long) i3, (byte) i);
                this.f47495j += (int) (((long) this.f47494i) - j);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.f47492g;
                int i4 = this.f47494i;
                this.f47494i = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f47495j++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f47492g;
            int i5 = this.f47494i;
            this.f47494i = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f47495j++;
        }

        /* renamed from: p2 */
        public final void mo53868p2(long j) {
            if (CodedOutputStream.f47486d) {
                long j2 = (long) this.f47494i;
                while ((j & -128) != 0) {
                    byte[] bArr = this.f47492g;
                    int i = this.f47494i;
                    this.f47494i = i + 1;
                    C18923z3.m88387d0(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f47492g;
                int i2 = this.f47494i;
                this.f47494i = i2 + 1;
                C18923z3.m88387d0(bArr2, (long) i2, (byte) ((int) j));
                this.f47495j += (int) (((long) this.f47494i) - j2);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f47492g;
                int i3 = this.f47494i;
                this.f47494i = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f47495j++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f47492g;
            int i4 = this.f47494i;
            this.f47494i = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
            this.f47495j++;
        }

        /* renamed from: r1 */
        public final int mo53849r1() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$c */
    public static class C18620c extends CodedOutputStream {

        /* renamed from: g */
        public final byte[] f47496g;

        /* renamed from: h */
        public final int f47497h;

        /* renamed from: i */
        public final int f47498i;

        /* renamed from: j */
        public int f47499j;

        public C18620c(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f47496g = bArr;
                    this.f47497h = i;
                    this.f47499j = i;
                    this.f47498i = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: C1 */
        public final void mo53794C1(int i) throws IOException {
            try {
                byte[] bArr = this.f47496g;
                int i2 = this.f47499j;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f47499j = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f47499j), Integer.valueOf(this.f47498i), 1}), e);
            }
        }

        /* renamed from: D1 */
        public final void mo53795D1(long j) throws IOException {
            try {
                byte[] bArr = this.f47496g;
                int i = this.f47499j;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f47499j = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f47499j), Integer.valueOf(this.f47498i), 1}), e);
            }
        }

        /* renamed from: J1 */
        public final void mo53803J1(int i) throws IOException {
            if (i >= 0) {
                mo53842h2(i);
            } else {
                mo53844i2((long) i);
            }
        }

        /* renamed from: L1 */
        public final void mo53806L1(int i, C18920z1 z1Var) throws IOException {
            mo53840g2(i, 2);
            mo53808N1(z1Var);
        }

        /* renamed from: M1 */
        public final void mo53807M1(int i, C18920z1 z1Var, C18905x2 x2Var) throws IOException {
            mo53840g2(i, 2);
            mo53842h2(((C18665a) z1Var).mo54251r(x2Var));
            x2Var.mo54459i(z1Var, this.f47489a);
        }

        /* renamed from: N1 */
        public final void mo53808N1(C18920z1 z1Var) throws IOException {
            mo53842h2(z1Var.getSerializedSize());
            z1Var.mo53979J(this);
        }

        /* renamed from: O */
        public final void mo53809O(int i, ByteString byteString) throws IOException {
            mo53840g2(i, 2);
            mo53861z1(byteString);
        }

        /* renamed from: O1 */
        public final void mo53810O1(C18920z1 z1Var, C18905x2 x2Var) throws IOException {
            mo53842h2(((C18665a) z1Var).mo54251r(x2Var));
            x2Var.mo54459i(z1Var, this.f47489a);
        }

        /* renamed from: P1 */
        public final void mo53811P1(int i, C18920z1 z1Var) throws IOException {
            mo53840g2(1, 3);
            mo53847p(2, i);
            mo53806L1(3, z1Var);
            mo53840g2(1, 4);
        }

        /* renamed from: T */
        public final void mo53815T(byte b) throws IOException {
            try {
                byte[] bArr = this.f47496g;
                int i = this.f47499j;
                this.f47499j = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f47499j), Integer.valueOf(this.f47498i), 1}), e);
            }
        }

        /* renamed from: T1 */
        public final void mo53816T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo53819V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo53817U(duplicate);
        }

        /* renamed from: U */
        public final void mo53817U(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f47496g, this.f47499j, remaining);
                this.f47499j += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f47499j), Integer.valueOf(this.f47498i), Integer.valueOf(remaining)}), e);
            }
        }

        /* renamed from: V */
        public final void mo53819V(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f47496g, this.f47499j, i2);
                this.f47499j += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f47499j), Integer.valueOf(this.f47498i), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: W */
        public final void mo53821W(ByteBuffer byteBuffer) throws IOException {
            mo53817U(byteBuffer);
        }

        /* renamed from: X */
        public final void mo53823X(byte[] bArr, int i, int i2) throws IOException {
            mo53819V(bArr, i, i2);
        }

        /* renamed from: Y1 */
        public final void mo53825Y1(int i, ByteString byteString) throws IOException {
            mo53840g2(1, 3);
            mo53847p(2, i);
            mo53809O(3, byteString);
            mo53840g2(1, 4);
        }

        /* renamed from: c */
        public final void mo53830c(int i, int i2) throws IOException {
            mo53840g2(i, 5);
            mo53794C1(i2);
        }

        /* renamed from: e1 */
        public void mo53833e1() {
        }

        /* renamed from: f */
        public final void mo53835f(int i, String str) throws IOException {
            mo53840g2(i, 2);
            mo53837f2(str);
        }

        /* renamed from: f1 */
        public final int mo53836f1() {
            return this.f47499j - this.f47497h;
        }

        /* renamed from: f2 */
        public final void mo53837f2(String str) throws IOException {
            int i = this.f47499j;
            try {
                int Z0 = CodedOutputStream.m84495Z0(str.length() * 3);
                int Z02 = CodedOutputStream.m84495Z0(str.length());
                if (Z02 == Z0) {
                    int i2 = i + Z02;
                    this.f47499j = i2;
                    int i3 = Utf8.m85198i(str, this.f47496g, i2, mo53849r1());
                    this.f47499j = i;
                    mo53842h2((i3 - i) - Z02);
                    this.f47499j = i3;
                    return;
                }
                mo53842h2(Utf8.m85200k(str));
                this.f47499j = Utf8.m85198i(str, this.f47496g, this.f47499j, mo53849r1());
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f47499j = i;
                mo53839g1(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: g */
        public final void mo53838g(int i, long j) throws IOException {
            mo53840g2(i, 0);
            mo53844i2(j);
        }

        /* renamed from: g2 */
        public final void mo53840g2(int i, int i2) throws IOException {
            mo53842h2(WireFormat.m85346c(i, i2));
        }

        /* renamed from: h2 */
        public final void mo53842h2(int i) throws IOException {
            if (!CodedOutputStream.f47486d || C18712e.m85800c() || mo53849r1() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f47496g;
                    int i2 = this.f47499j;
                    this.f47499j = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f47496g;
                    int i3 = this.f47499j;
                    this.f47499j = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f47499j), Integer.valueOf(this.f47498i), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f47496g;
                int i4 = this.f47499j;
                this.f47499j = i4 + 1;
                C18923z3.m88387d0(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f47496g;
                int i5 = this.f47499j;
                this.f47499j = i5 + 1;
                C18923z3.m88387d0(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f47496g;
                    int i7 = this.f47499j;
                    this.f47499j = i7 + 1;
                    C18923z3.m88387d0(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f47496g;
                int i8 = this.f47499j;
                this.f47499j = i8 + 1;
                C18923z3.m88387d0(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f47496g;
                    int i10 = this.f47499j;
                    this.f47499j = i10 + 1;
                    C18923z3.m88387d0(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f47496g;
                int i11 = this.f47499j;
                this.f47499j = i11 + 1;
                C18923z3.m88387d0(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f47496g;
                    int i13 = this.f47499j;
                    this.f47499j = i13 + 1;
                    C18923z3.m88387d0(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f47496g;
                int i14 = this.f47499j;
                this.f47499j = i14 + 1;
                C18923z3.m88387d0(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f47496g;
                int i15 = this.f47499j;
                this.f47499j = i15 + 1;
                C18923z3.m88387d0(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: i */
        public final void mo53843i(int i, int i2) throws IOException {
            mo53840g2(i, 0);
            mo53803J1(i2);
        }

        /* renamed from: i2 */
        public final void mo53844i2(long j) throws IOException {
            if (!CodedOutputStream.f47486d || mo53849r1() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f47496g;
                    int i = this.f47499j;
                    this.f47499j = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f47496g;
                    int i2 = this.f47499j;
                    this.f47499j = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f47499j), Integer.valueOf(this.f47498i), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f47496g;
                    int i3 = this.f47499j;
                    this.f47499j = i3 + 1;
                    C18923z3.m88387d0(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f47496g;
                int i4 = this.f47499j;
                this.f47499j = i4 + 1;
                C18923z3.m88387d0(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: p */
        public final void mo53847p(int i, int i2) throws IOException {
            mo53840g2(i, 0);
            mo53842h2(i2);
        }

        /* renamed from: r1 */
        public final int mo53849r1() {
            return this.f47498i - this.f47499j;
        }

        /* renamed from: t */
        public final void mo53851t(int i, long j) throws IOException {
            mo53840g2(i, 1);
            mo53795D1(j);
        }

        /* renamed from: u1 */
        public final void mo53853u1(int i, byte[] bArr) throws IOException {
            mo53854v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public final void mo53854v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo53840g2(i, 2);
            mo53857x1(bArr, i2, i3);
        }

        /* renamed from: x1 */
        public final void mo53857x1(byte[] bArr, int i, int i2) throws IOException {
            mo53842h2(i2);
            mo53819V(bArr, i, i2);
        }

        /* renamed from: y */
        public final void mo53858y(int i, boolean z) throws IOException {
            mo53840g2(i, 0);
            mo53815T(z ? (byte) 1 : 0);
        }

        /* renamed from: y1 */
        public final void mo53859y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo53840g2(i, 2);
            mo53842h2(byteBuffer.capacity());
            mo53816T1(byteBuffer);
        }

        /* renamed from: z1 */
        public final void mo53861z1(ByteString byteString) throws IOException {
            mo53842h2(byteString.size());
            byteString.mo53742X0(this);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$d */
    public static final class C18621d extends C18619b {

        /* renamed from: k */
        public final C18864t f47500k;

        public C18621d(C18864t tVar, int i) {
            super(i);
            if (tVar != null) {
                this.f47500k = tVar;
                return;
            }
            throw new NullPointerException("out");
        }

        /* renamed from: C1 */
        public void mo53794C1(int i) throws IOException {
            mo53870r2(4);
            mo53863k2(i);
        }

        /* renamed from: D1 */
        public void mo53795D1(long j) throws IOException {
            mo53870r2(8);
            mo53864l2(j);
        }

        /* renamed from: J1 */
        public void mo53803J1(int i) throws IOException {
            if (i >= 0) {
                mo53842h2(i);
            } else {
                mo53844i2((long) i);
            }
        }

        /* renamed from: L1 */
        public void mo53806L1(int i, C18920z1 z1Var) throws IOException {
            mo53840g2(i, 2);
            mo53808N1(z1Var);
        }

        /* renamed from: M1 */
        public void mo53807M1(int i, C18920z1 z1Var, C18905x2 x2Var) throws IOException {
            mo53840g2(i, 2);
            mo53810O1(z1Var, x2Var);
        }

        /* renamed from: N1 */
        public void mo53808N1(C18920z1 z1Var) throws IOException {
            mo53842h2(z1Var.getSerializedSize());
            z1Var.mo53979J(this);
        }

        /* renamed from: O */
        public void mo53809O(int i, ByteString byteString) throws IOException {
            mo53840g2(i, 2);
            mo53861z1(byteString);
        }

        /* renamed from: O1 */
        public void mo53810O1(C18920z1 z1Var, C18905x2 x2Var) throws IOException {
            mo53842h2(((C18665a) z1Var).mo54251r(x2Var));
            x2Var.mo54459i(z1Var, this.f47489a);
        }

        /* renamed from: P1 */
        public void mo53811P1(int i, C18920z1 z1Var) throws IOException {
            mo53840g2(1, 3);
            mo53847p(2, i);
            mo53806L1(3, z1Var);
            mo53840g2(1, 4);
        }

        /* renamed from: T */
        public void mo53815T(byte b) throws IOException {
            if (this.f47494i == this.f47493h) {
                mo53869q2();
            }
            mo53862j2(b);
        }

        /* renamed from: T1 */
        public void mo53816T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo53819V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo53817U(duplicate);
        }

        /* renamed from: U */
        public void mo53817U(ByteBuffer byteBuffer) throws IOException {
            mo53833e1();
            int remaining = byteBuffer.remaining();
            this.f47500k.mo53817U(byteBuffer);
            this.f47495j += remaining;
        }

        /* renamed from: V */
        public void mo53819V(byte[] bArr, int i, int i2) throws IOException {
            mo53833e1();
            this.f47500k.mo53819V(bArr, i, i2);
            this.f47495j += i2;
        }

        /* renamed from: W */
        public void mo53821W(ByteBuffer byteBuffer) throws IOException {
            mo53833e1();
            int remaining = byteBuffer.remaining();
            this.f47500k.mo53821W(byteBuffer);
            this.f47495j += remaining;
        }

        /* renamed from: X */
        public void mo53823X(byte[] bArr, int i, int i2) throws IOException {
            mo53833e1();
            this.f47500k.mo53823X(bArr, i, i2);
            this.f47495j += i2;
        }

        /* renamed from: Y1 */
        public void mo53825Y1(int i, ByteString byteString) throws IOException {
            mo53840g2(1, 3);
            mo53847p(2, i);
            mo53809O(3, byteString);
            mo53840g2(1, 4);
        }

        /* renamed from: c */
        public void mo53830c(int i, int i2) throws IOException {
            mo53870r2(14);
            mo53866n2(i, 5);
            mo53863k2(i2);
        }

        /* renamed from: e1 */
        public void mo53833e1() throws IOException {
            if (this.f47494i > 0) {
                mo53869q2();
            }
        }

        /* renamed from: f */
        public void mo53835f(int i, String str) throws IOException {
            mo53840g2(i, 2);
            mo53837f2(str);
        }

        /* renamed from: f2 */
        public void mo53837f2(String str) throws IOException {
            int length = str.length() * 3;
            int Z0 = CodedOutputStream.m84495Z0(length);
            int i = Z0 + length;
            int i2 = this.f47493h;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int i3 = Utf8.m85198i(str, bArr, 0, length);
                mo53842h2(i3);
                mo53823X(bArr, 0, i3);
                return;
            }
            if (i > i2 - this.f47494i) {
                mo53869q2();
            }
            int i4 = this.f47494i;
            try {
                int Z02 = CodedOutputStream.m84495Z0(str.length());
                if (Z02 == Z0) {
                    int i5 = i4 + Z02;
                    this.f47494i = i5;
                    int i6 = Utf8.m85198i(str, this.f47492g, i5, this.f47493h - i5);
                    this.f47494i = i4;
                    int i7 = (i6 - i4) - Z02;
                    mo53867o2(i7);
                    this.f47494i = i6;
                    this.f47495j += i7;
                    return;
                }
                int k = Utf8.m85200k(str);
                mo53867o2(k);
                this.f47494i = Utf8.m85198i(str, this.f47492g, this.f47494i, k);
                this.f47495j += k;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f47495j -= this.f47494i - i4;
                this.f47494i = i4;
                mo53839g1(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: g */
        public void mo53838g(int i, long j) throws IOException {
            mo53870r2(20);
            mo53866n2(i, 0);
            mo53868p2(j);
        }

        /* renamed from: g2 */
        public void mo53840g2(int i, int i2) throws IOException {
            mo53842h2(WireFormat.m85346c(i, i2));
        }

        /* renamed from: h2 */
        public void mo53842h2(int i) throws IOException {
            mo53870r2(5);
            mo53867o2(i);
        }

        /* renamed from: i */
        public void mo53843i(int i, int i2) throws IOException {
            mo53870r2(20);
            mo53866n2(i, 0);
            mo53865m2(i2);
        }

        /* renamed from: i2 */
        public void mo53844i2(long j) throws IOException {
            mo53870r2(10);
            mo53868p2(j);
        }

        /* renamed from: p */
        public void mo53847p(int i, int i2) throws IOException {
            mo53870r2(20);
            mo53866n2(i, 0);
            mo53867o2(i2);
        }

        /* renamed from: q2 */
        public final void mo53869q2() throws IOException {
            this.f47500k.mo53819V(this.f47492g, 0, this.f47494i);
            this.f47494i = 0;
        }

        /* renamed from: r2 */
        public final void mo53870r2(int i) throws IOException {
            if (this.f47493h - this.f47494i < i) {
                mo53869q2();
            }
        }

        /* renamed from: t */
        public void mo53851t(int i, long j) throws IOException {
            mo53870r2(18);
            mo53866n2(i, 1);
            mo53864l2(j);
        }

        /* renamed from: u1 */
        public void mo53853u1(int i, byte[] bArr) throws IOException {
            mo53854v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public void mo53854v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo53840g2(i, 2);
            mo53857x1(bArr, i2, i3);
        }

        /* renamed from: x1 */
        public void mo53857x1(byte[] bArr, int i, int i2) throws IOException {
            mo53842h2(i2);
            mo53819V(bArr, i, i2);
        }

        /* renamed from: y */
        public void mo53858y(int i, boolean z) throws IOException {
            mo53870r2(11);
            mo53866n2(i, 0);
            mo53862j2(z ? (byte) 1 : 0);
        }

        /* renamed from: y1 */
        public void mo53859y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo53840g2(i, 2);
            mo53842h2(byteBuffer.capacity());
            mo53816T1(byteBuffer);
        }

        /* renamed from: z1 */
        public void mo53861z1(ByteString byteString) throws IOException {
            mo53842h2(byteString.size());
            byteString.mo53742X0(this);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$e */
    public static final class C18622e extends C18620c {

        /* renamed from: k */
        public final ByteBuffer f47501k;

        /* renamed from: l */
        public int f47502l;

        public C18622e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f47501k = byteBuffer;
            this.f47502l = byteBuffer.position();
        }

        /* renamed from: e1 */
        public void mo53833e1() {
            this.f47501k.position(this.f47502l + mo53836f1());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$f */
    public static final class C18623f extends C18619b {

        /* renamed from: k */
        public final OutputStream f47503k;

        public C18623f(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f47503k = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        /* renamed from: C1 */
        public void mo53794C1(int i) throws IOException {
            mo53872r2(4);
            mo53863k2(i);
        }

        /* renamed from: D1 */
        public void mo53795D1(long j) throws IOException {
            mo53872r2(8);
            mo53864l2(j);
        }

        /* renamed from: J1 */
        public void mo53803J1(int i) throws IOException {
            if (i >= 0) {
                mo53842h2(i);
            } else {
                mo53844i2((long) i);
            }
        }

        /* renamed from: L1 */
        public void mo53806L1(int i, C18920z1 z1Var) throws IOException {
            mo53840g2(i, 2);
            mo53808N1(z1Var);
        }

        /* renamed from: M1 */
        public void mo53807M1(int i, C18920z1 z1Var, C18905x2 x2Var) throws IOException {
            mo53840g2(i, 2);
            mo53810O1(z1Var, x2Var);
        }

        /* renamed from: N1 */
        public void mo53808N1(C18920z1 z1Var) throws IOException {
            mo53842h2(z1Var.getSerializedSize());
            z1Var.mo53979J(this);
        }

        /* renamed from: O */
        public void mo53809O(int i, ByteString byteString) throws IOException {
            mo53840g2(i, 2);
            mo53861z1(byteString);
        }

        /* renamed from: O1 */
        public void mo53810O1(C18920z1 z1Var, C18905x2 x2Var) throws IOException {
            mo53842h2(((C18665a) z1Var).mo54251r(x2Var));
            x2Var.mo54459i(z1Var, this.f47489a);
        }

        /* renamed from: P1 */
        public void mo53811P1(int i, C18920z1 z1Var) throws IOException {
            mo53840g2(1, 3);
            mo53847p(2, i);
            mo53806L1(3, z1Var);
            mo53840g2(1, 4);
        }

        /* renamed from: T */
        public void mo53815T(byte b) throws IOException {
            if (this.f47494i == this.f47493h) {
                mo53871q2();
            }
            mo53862j2(b);
        }

        /* renamed from: T1 */
        public void mo53816T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo53819V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo53817U(duplicate);
        }

        /* renamed from: U */
        public void mo53817U(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i = this.f47493h;
            int i2 = this.f47494i;
            if (i - i2 >= remaining) {
                byteBuffer.get(this.f47492g, i2, remaining);
                this.f47494i += remaining;
                this.f47495j += remaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.f47492g, i2, i3);
            int i4 = remaining - i3;
            this.f47494i = this.f47493h;
            this.f47495j += i3;
            mo53871q2();
            while (true) {
                int i5 = this.f47493h;
                if (i4 > i5) {
                    byteBuffer.get(this.f47492g, 0, i5);
                    this.f47503k.write(this.f47492g, 0, this.f47493h);
                    int i6 = this.f47493h;
                    i4 -= i6;
                    this.f47495j += i6;
                } else {
                    byteBuffer.get(this.f47492g, 0, i4);
                    this.f47494i = i4;
                    this.f47495j += i4;
                    return;
                }
            }
        }

        /* renamed from: V */
        public void mo53819V(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f47493h;
            int i4 = this.f47494i;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f47492g, i4, i2);
                this.f47494i += i2;
                this.f47495j += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.f47492g, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f47494i = this.f47493h;
            this.f47495j += i5;
            mo53871q2();
            if (i7 <= this.f47493h) {
                System.arraycopy(bArr, i6, this.f47492g, 0, i7);
                this.f47494i = i7;
            } else {
                this.f47503k.write(bArr, i6, i7);
            }
            this.f47495j += i7;
        }

        /* renamed from: W */
        public void mo53821W(ByteBuffer byteBuffer) throws IOException {
            mo53817U(byteBuffer);
        }

        /* renamed from: X */
        public void mo53823X(byte[] bArr, int i, int i2) throws IOException {
            mo53819V(bArr, i, i2);
        }

        /* renamed from: Y1 */
        public void mo53825Y1(int i, ByteString byteString) throws IOException {
            mo53840g2(1, 3);
            mo53847p(2, i);
            mo53809O(3, byteString);
            mo53840g2(1, 4);
        }

        /* renamed from: c */
        public void mo53830c(int i, int i2) throws IOException {
            mo53872r2(14);
            mo53866n2(i, 5);
            mo53863k2(i2);
        }

        /* renamed from: e1 */
        public void mo53833e1() throws IOException {
            if (this.f47494i > 0) {
                mo53871q2();
            }
        }

        /* renamed from: f */
        public void mo53835f(int i, String str) throws IOException {
            mo53840g2(i, 2);
            mo53837f2(str);
        }

        /* renamed from: f2 */
        public void mo53837f2(String str) throws IOException {
            int i;
            int i2;
            try {
                int length = str.length() * 3;
                int Z0 = CodedOutputStream.m84495Z0(length);
                int i3 = Z0 + length;
                int i4 = this.f47493h;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int i5 = Utf8.m85198i(str, bArr, 0, length);
                    mo53842h2(i5);
                    mo53823X(bArr, 0, i5);
                    return;
                }
                if (i3 > i4 - this.f47494i) {
                    mo53871q2();
                }
                int Z02 = CodedOutputStream.m84495Z0(str.length());
                i = this.f47494i;
                if (Z02 == Z0) {
                    int i6 = i + Z02;
                    this.f47494i = i6;
                    int i7 = Utf8.m85198i(str, this.f47492g, i6, this.f47493h - i6);
                    this.f47494i = i;
                    i2 = (i7 - i) - Z02;
                    mo53867o2(i2);
                    this.f47494i = i7;
                } else {
                    i2 = Utf8.m85200k(str);
                    mo53867o2(i2);
                    this.f47494i = Utf8.m85198i(str, this.f47492g, this.f47494i, i2);
                }
                this.f47495j += i2;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f47495j -= this.f47494i - i;
                this.f47494i = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            } catch (Utf8.UnpairedSurrogateException e3) {
                mo53839g1(str, e3);
            }
        }

        /* renamed from: g */
        public void mo53838g(int i, long j) throws IOException {
            mo53872r2(20);
            mo53866n2(i, 0);
            mo53868p2(j);
        }

        /* renamed from: g2 */
        public void mo53840g2(int i, int i2) throws IOException {
            mo53842h2(WireFormat.m85346c(i, i2));
        }

        /* renamed from: h2 */
        public void mo53842h2(int i) throws IOException {
            mo53872r2(5);
            mo53867o2(i);
        }

        /* renamed from: i */
        public void mo53843i(int i, int i2) throws IOException {
            mo53872r2(20);
            mo53866n2(i, 0);
            mo53865m2(i2);
        }

        /* renamed from: i2 */
        public void mo53844i2(long j) throws IOException {
            mo53872r2(10);
            mo53868p2(j);
        }

        /* renamed from: p */
        public void mo53847p(int i, int i2) throws IOException {
            mo53872r2(20);
            mo53866n2(i, 0);
            mo53867o2(i2);
        }

        /* renamed from: q2 */
        public final void mo53871q2() throws IOException {
            this.f47503k.write(this.f47492g, 0, this.f47494i);
            this.f47494i = 0;
        }

        /* renamed from: r2 */
        public final void mo53872r2(int i) throws IOException {
            if (this.f47493h - this.f47494i < i) {
                mo53871q2();
            }
        }

        /* renamed from: t */
        public void mo53851t(int i, long j) throws IOException {
            mo53872r2(18);
            mo53866n2(i, 1);
            mo53864l2(j);
        }

        /* renamed from: u1 */
        public void mo53853u1(int i, byte[] bArr) throws IOException {
            mo53854v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public void mo53854v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo53840g2(i, 2);
            mo53857x1(bArr, i2, i3);
        }

        /* renamed from: x1 */
        public void mo53857x1(byte[] bArr, int i, int i2) throws IOException {
            mo53842h2(i2);
            mo53819V(bArr, i, i2);
        }

        /* renamed from: y */
        public void mo53858y(int i, boolean z) throws IOException {
            mo53872r2(11);
            mo53866n2(i, 0);
            mo53862j2(z ? (byte) 1 : 0);
        }

        /* renamed from: y1 */
        public void mo53859y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo53840g2(i, 2);
            mo53842h2(byteBuffer.capacity());
            mo53816T1(byteBuffer);
        }

        /* renamed from: z1 */
        public void mo53861z1(ByteString byteString) throws IOException {
            mo53842h2(byteString.size());
            byteString.mo53742X0(this);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$g */
    public static final class C18624g extends CodedOutputStream {

        /* renamed from: g */
        public final ByteBuffer f47504g;

        /* renamed from: h */
        public final ByteBuffer f47505h;

        /* renamed from: i */
        public final int f47506i;

        public C18624g(ByteBuffer byteBuffer) {
            super();
            this.f47504g = byteBuffer;
            this.f47505h = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f47506i = byteBuffer.position();
        }

        /* renamed from: C1 */
        public void mo53794C1(int i) throws IOException {
            try {
                this.f47505h.putInt(i);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: D1 */
        public void mo53795D1(long j) throws IOException {
            try {
                this.f47505h.putLong(j);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: J1 */
        public void mo53803J1(int i) throws IOException {
            if (i >= 0) {
                mo53842h2(i);
            } else {
                mo53844i2((long) i);
            }
        }

        /* renamed from: L1 */
        public void mo53806L1(int i, C18920z1 z1Var) throws IOException {
            mo53840g2(i, 2);
            mo53808N1(z1Var);
        }

        /* renamed from: M1 */
        public void mo53807M1(int i, C18920z1 z1Var, C18905x2 x2Var) throws IOException {
            mo53840g2(i, 2);
            mo53810O1(z1Var, x2Var);
        }

        /* renamed from: N1 */
        public void mo53808N1(C18920z1 z1Var) throws IOException {
            mo53842h2(z1Var.getSerializedSize());
            z1Var.mo53979J(this);
        }

        /* renamed from: O */
        public void mo53809O(int i, ByteString byteString) throws IOException {
            mo53840g2(i, 2);
            mo53861z1(byteString);
        }

        /* renamed from: O1 */
        public void mo53810O1(C18920z1 z1Var, C18905x2 x2Var) throws IOException {
            mo53842h2(((C18665a) z1Var).mo54251r(x2Var));
            x2Var.mo54459i(z1Var, this.f47489a);
        }

        /* renamed from: P1 */
        public void mo53811P1(int i, C18920z1 z1Var) throws IOException {
            mo53840g2(1, 3);
            mo53847p(2, i);
            mo53806L1(3, z1Var);
            mo53840g2(1, 4);
        }

        /* renamed from: T */
        public void mo53815T(byte b) throws IOException {
            try {
                this.f47505h.put(b);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: T1 */
        public void mo53816T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo53819V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo53817U(duplicate);
        }

        /* renamed from: U */
        public void mo53817U(ByteBuffer byteBuffer) throws IOException {
            try {
                this.f47505h.put(byteBuffer);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: V */
        public void mo53819V(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f47505h.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: W */
        public void mo53821W(ByteBuffer byteBuffer) throws IOException {
            mo53817U(byteBuffer);
        }

        /* renamed from: X */
        public void mo53823X(byte[] bArr, int i, int i2) throws IOException {
            mo53819V(bArr, i, i2);
        }

        /* renamed from: Y1 */
        public void mo53825Y1(int i, ByteString byteString) throws IOException {
            mo53840g2(1, 3);
            mo53847p(2, i);
            mo53809O(3, byteString);
            mo53840g2(1, 4);
        }

        /* renamed from: c */
        public void mo53830c(int i, int i2) throws IOException {
            mo53840g2(i, 5);
            mo53794C1(i2);
        }

        /* renamed from: e1 */
        public void mo53833e1() {
            this.f47504g.position(this.f47505h.position());
        }

        /* renamed from: f */
        public void mo53835f(int i, String str) throws IOException {
            mo53840g2(i, 2);
            mo53837f2(str);
        }

        /* renamed from: f1 */
        public int mo53836f1() {
            return this.f47505h.position() - this.f47506i;
        }

        /* renamed from: f2 */
        public void mo53837f2(String str) throws IOException {
            int position = this.f47505h.position();
            try {
                int Z0 = CodedOutputStream.m84495Z0(str.length() * 3);
                int Z02 = CodedOutputStream.m84495Z0(str.length());
                if (Z02 == Z0) {
                    int position2 = this.f47505h.position() + Z02;
                    this.f47505h.position(position2);
                    mo53873j2(str);
                    int position3 = this.f47505h.position();
                    this.f47505h.position(position);
                    mo53842h2(position3 - position2);
                    this.f47505h.position(position3);
                    return;
                }
                mo53842h2(Utf8.m85200k(str));
                mo53873j2(str);
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f47505h.position(position);
                mo53839g1(str, e);
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: g */
        public void mo53838g(int i, long j) throws IOException {
            mo53840g2(i, 0);
            mo53844i2(j);
        }

        /* renamed from: g2 */
        public void mo53840g2(int i, int i2) throws IOException {
            mo53842h2(WireFormat.m85346c(i, i2));
        }

        /* renamed from: h2 */
        public void mo53842h2(int i) throws IOException {
            while ((i & -128) != 0) {
                this.f47505h.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f47505h.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: i */
        public void mo53843i(int i, int i2) throws IOException {
            mo53840g2(i, 0);
            mo53803J1(i2);
        }

        /* renamed from: i2 */
        public void mo53844i2(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.f47505h.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f47505h.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: j2 */
        public final void mo53873j2(String str) throws IOException {
            try {
                Utf8.m85199j(str, this.f47505h);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: p */
        public void mo53847p(int i, int i2) throws IOException {
            mo53840g2(i, 0);
            mo53842h2(i2);
        }

        /* renamed from: r1 */
        public int mo53849r1() {
            return this.f47505h.remaining();
        }

        /* renamed from: t */
        public void mo53851t(int i, long j) throws IOException {
            mo53840g2(i, 1);
            mo53795D1(j);
        }

        /* renamed from: u1 */
        public void mo53853u1(int i, byte[] bArr) throws IOException {
            mo53854v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public void mo53854v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo53840g2(i, 2);
            mo53857x1(bArr, i2, i3);
        }

        /* renamed from: x1 */
        public void mo53857x1(byte[] bArr, int i, int i2) throws IOException {
            mo53842h2(i2);
            mo53819V(bArr, i, i2);
        }

        /* renamed from: y */
        public void mo53858y(int i, boolean z) throws IOException {
            mo53840g2(i, 0);
            mo53815T(z ? (byte) 1 : 0);
        }

        /* renamed from: y1 */
        public void mo53859y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo53840g2(i, 2);
            mo53842h2(byteBuffer.capacity());
            mo53816T1(byteBuffer);
        }

        /* renamed from: z1 */
        public void mo53861z1(ByteString byteString) throws IOException {
            mo53842h2(byteString.size());
            byteString.mo53742X0(this);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$h */
    public static final class C18625h extends CodedOutputStream {

        /* renamed from: g */
        public final ByteBuffer f47507g;

        /* renamed from: h */
        public final ByteBuffer f47508h;

        /* renamed from: i */
        public final long f47509i;

        /* renamed from: j */
        public final long f47510j;

        /* renamed from: k */
        public final long f47511k;

        /* renamed from: l */
        public final long f47512l;

        /* renamed from: m */
        public long f47513m;

        public C18625h(ByteBuffer byteBuffer) {
            super();
            this.f47507g = byteBuffer;
            this.f47508h = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long i = C18923z3.m88396i(byteBuffer);
            this.f47509i = i;
            long position = ((long) byteBuffer.position()) + i;
            this.f47510j = position;
            long limit = i + ((long) byteBuffer.limit());
            this.f47511k = limit;
            this.f47512l = limit - 10;
            this.f47513m = position;
        }

        /* renamed from: k2 */
        public static boolean m84756k2() {
            return C18923z3.m88373T();
        }

        /* renamed from: C1 */
        public void mo53794C1(int i) throws IOException {
            this.f47508h.putInt(mo53874j2(this.f47513m), i);
            this.f47513m += 4;
        }

        /* renamed from: D1 */
        public void mo53795D1(long j) throws IOException {
            this.f47508h.putLong(mo53874j2(this.f47513m), j);
            this.f47513m += 8;
        }

        /* renamed from: J1 */
        public void mo53803J1(int i) throws IOException {
            if (i >= 0) {
                mo53842h2(i);
            } else {
                mo53844i2((long) i);
            }
        }

        /* renamed from: L1 */
        public void mo53806L1(int i, C18920z1 z1Var) throws IOException {
            mo53840g2(i, 2);
            mo53808N1(z1Var);
        }

        /* renamed from: M1 */
        public void mo53807M1(int i, C18920z1 z1Var, C18905x2 x2Var) throws IOException {
            mo53840g2(i, 2);
            mo53810O1(z1Var, x2Var);
        }

        /* renamed from: N1 */
        public void mo53808N1(C18920z1 z1Var) throws IOException {
            mo53842h2(z1Var.getSerializedSize());
            z1Var.mo53979J(this);
        }

        /* renamed from: O */
        public void mo53809O(int i, ByteString byteString) throws IOException {
            mo53840g2(i, 2);
            mo53861z1(byteString);
        }

        /* renamed from: O1 */
        public void mo53810O1(C18920z1 z1Var, C18905x2 x2Var) throws IOException {
            mo53842h2(((C18665a) z1Var).mo54251r(x2Var));
            x2Var.mo54459i(z1Var, this.f47489a);
        }

        /* renamed from: P1 */
        public void mo53811P1(int i, C18920z1 z1Var) throws IOException {
            mo53840g2(1, 3);
            mo53847p(2, i);
            mo53806L1(3, z1Var);
            mo53840g2(1, 4);
        }

        /* renamed from: T */
        public void mo53815T(byte b) throws IOException {
            long j = this.f47513m;
            if (j < this.f47511k) {
                this.f47513m = 1 + j;
                C18923z3.m88383b0(j, b);
                return;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f47513m), Long.valueOf(this.f47511k), 1}));
        }

        /* renamed from: T1 */
        public void mo53816T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo53819V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo53817U(duplicate);
        }

        /* renamed from: U */
        public void mo53817U(ByteBuffer byteBuffer) throws IOException {
            try {
                int remaining = byteBuffer.remaining();
                mo53875l2(this.f47513m);
                this.f47508h.put(byteBuffer);
                this.f47513m += (long) remaining;
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: V */
        public void mo53819V(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                long j2 = this.f47513m;
                if (this.f47511k - j >= j2) {
                    C18923z3.m88408o(bArr, (long) i, j2, j);
                    this.f47513m += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f47513m), Long.valueOf(this.f47511k), Integer.valueOf(i2)}));
        }

        /* renamed from: W */
        public void mo53821W(ByteBuffer byteBuffer) throws IOException {
            mo53817U(byteBuffer);
        }

        /* renamed from: X */
        public void mo53823X(byte[] bArr, int i, int i2) throws IOException {
            mo53819V(bArr, i, i2);
        }

        /* renamed from: Y1 */
        public void mo53825Y1(int i, ByteString byteString) throws IOException {
            mo53840g2(1, 3);
            mo53847p(2, i);
            mo53809O(3, byteString);
            mo53840g2(1, 4);
        }

        /* renamed from: c */
        public void mo53830c(int i, int i2) throws IOException {
            mo53840g2(i, 5);
            mo53794C1(i2);
        }

        /* renamed from: e1 */
        public void mo53833e1() {
            this.f47507g.position(mo53874j2(this.f47513m));
        }

        /* renamed from: f */
        public void mo53835f(int i, String str) throws IOException {
            mo53840g2(i, 2);
            mo53837f2(str);
        }

        /* renamed from: f1 */
        public int mo53836f1() {
            return (int) (this.f47513m - this.f47510j);
        }

        /* renamed from: f2 */
        public void mo53837f2(String str) throws IOException {
            long j = this.f47513m;
            try {
                int Z0 = CodedOutputStream.m84495Z0(str.length() * 3);
                int Z02 = CodedOutputStream.m84495Z0(str.length());
                if (Z02 == Z0) {
                    int j2 = mo53874j2(this.f47513m) + Z02;
                    this.f47508h.position(j2);
                    Utf8.m85199j(str, this.f47508h);
                    int position = this.f47508h.position() - j2;
                    mo53842h2(position);
                    this.f47513m += (long) position;
                    return;
                }
                int k = Utf8.m85200k(str);
                mo53842h2(k);
                mo53875l2(this.f47513m);
                Utf8.m85199j(str, this.f47508h);
                this.f47513m += (long) k;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f47513m = j;
                mo53875l2(j);
                mo53839g1(str, e);
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            }
        }

        /* renamed from: g */
        public void mo53838g(int i, long j) throws IOException {
            mo53840g2(i, 0);
            mo53844i2(j);
        }

        /* renamed from: g2 */
        public void mo53840g2(int i, int i2) throws IOException {
            mo53842h2(WireFormat.m85346c(i, i2));
        }

        /* renamed from: h2 */
        public void mo53842h2(int i) throws IOException {
            if (this.f47513m <= this.f47512l) {
                while ((i & -128) != 0) {
                    long j = this.f47513m;
                    this.f47513m = j + 1;
                    C18923z3.m88383b0(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.f47513m;
                this.f47513m = 1 + j2;
                C18923z3.m88383b0(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.f47513m;
                if (j3 >= this.f47511k) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f47513m), Long.valueOf(this.f47511k), 1}));
                } else if ((i & -128) == 0) {
                    this.f47513m = 1 + j3;
                    C18923z3.m88383b0(j3, (byte) i);
                    return;
                } else {
                    this.f47513m = j3 + 1;
                    C18923z3.m88383b0(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        /* renamed from: i */
        public void mo53843i(int i, int i2) throws IOException {
            mo53840g2(i, 0);
            mo53803J1(i2);
        }

        /* renamed from: i2 */
        public void mo53844i2(long j) throws IOException {
            if (this.f47513m <= this.f47512l) {
                while ((j & -128) != 0) {
                    long j2 = this.f47513m;
                    this.f47513m = j2 + 1;
                    C18923z3.m88383b0(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f47513m;
                this.f47513m = 1 + j3;
                C18923z3.m88383b0(j3, (byte) ((int) j));
                return;
            }
            while (true) {
                long j4 = this.f47513m;
                if (j4 >= this.f47511k) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f47513m), Long.valueOf(this.f47511k), 1}));
                } else if ((j & -128) == 0) {
                    this.f47513m = 1 + j4;
                    C18923z3.m88383b0(j4, (byte) ((int) j));
                    return;
                } else {
                    this.f47513m = j4 + 1;
                    C18923z3.m88383b0(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        /* renamed from: j2 */
        public final int mo53874j2(long j) {
            return (int) (j - this.f47509i);
        }

        /* renamed from: l2 */
        public final void mo53875l2(long j) {
            this.f47508h.position(mo53874j2(j));
        }

        /* renamed from: p */
        public void mo53847p(int i, int i2) throws IOException {
            mo53840g2(i, 0);
            mo53842h2(i2);
        }

        /* renamed from: r1 */
        public int mo53849r1() {
            return (int) (this.f47511k - this.f47513m);
        }

        /* renamed from: t */
        public void mo53851t(int i, long j) throws IOException {
            mo53840g2(i, 1);
            mo53795D1(j);
        }

        /* renamed from: u1 */
        public void mo53853u1(int i, byte[] bArr) throws IOException {
            mo53854v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public void mo53854v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo53840g2(i, 2);
            mo53857x1(bArr, i2, i3);
        }

        /* renamed from: x1 */
        public void mo53857x1(byte[] bArr, int i, int i2) throws IOException {
            mo53842h2(i2);
            mo53819V(bArr, i, i2);
        }

        /* renamed from: y */
        public void mo53858y(int i, boolean z) throws IOException {
            mo53840g2(i, 0);
            mo53815T(z ? (byte) 1 : 0);
        }

        /* renamed from: y1 */
        public void mo53859y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo53840g2(i, 2);
            mo53842h2(byteBuffer.capacity());
            mo53816T1(byteBuffer);
        }

        /* renamed from: z1 */
        public void mo53861z1(ByteString byteString) throws IOException {
            mo53842h2(byteString.size());
            byteString.mo53742X0(this);
        }
    }

    /* renamed from: A0 */
    public static int m84469A0(int i, C18797l1 l1Var) {
        return (m84492X0(1) * 2) + m84494Y0(2, i) + m84470B0(3, l1Var);
    }

    /* renamed from: B0 */
    public static int m84470B0(int i, C18797l1 l1Var) {
        return m84492X0(i) + m84471C0(l1Var);
    }

    /* renamed from: C0 */
    public static int m84471C0(C18797l1 l1Var) {
        return m84472D0(l1Var.mo54926f());
    }

    /* renamed from: D0 */
    public static int m84472D0(int i) {
        return m84495Z0(i) + i;
    }

    /* renamed from: E0 */
    public static int m84473E0(int i, C18920z1 z1Var) {
        return (m84492X0(1) * 2) + m84494Y0(2, i) + m84474F0(3, z1Var);
    }

    /* renamed from: F0 */
    public static int m84474F0(int i, C18920z1 z1Var) {
        return m84492X0(i) + m84476H0(z1Var);
    }

    /* renamed from: G0 */
    public static int m84475G0(int i, C18920z1 z1Var, C18905x2 x2Var) {
        return m84492X0(i) + m84477I0(z1Var, x2Var);
    }

    /* renamed from: H0 */
    public static int m84476H0(C18920z1 z1Var) {
        return m84472D0(z1Var.getSerializedSize());
    }

    /* renamed from: I0 */
    public static int m84477I0(C18920z1 z1Var, C18905x2 x2Var) {
        return m84472D0(((C18665a) z1Var).mo54251r(x2Var));
    }

    /* renamed from: J0 */
    public static int m84478J0(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: K0 */
    public static int m84479K0(int i, ByteString byteString) {
        return (m84492X0(1) * 2) + m84494Y0(2, i) + m84506g0(3, byteString);
    }

    @Deprecated
    /* renamed from: L0 */
    public static int m84480L0(int i) {
        return m84495Z0(i);
    }

    @Deprecated
    /* renamed from: M0 */
    public static int m84481M0(long j) {
        return m84499b1(j);
    }

    /* renamed from: N0 */
    public static int m84482N0(int i, int i2) {
        return m84492X0(i) + m84483O0(i2);
    }

    /* renamed from: O0 */
    public static int m84483O0(int i) {
        return 4;
    }

    /* renamed from: P0 */
    public static int m84484P0(int i, long j) {
        return m84492X0(i) + m84485Q0(j);
    }

    /* renamed from: Q0 */
    public static int m84485Q0(long j) {
        return 8;
    }

    /* renamed from: R0 */
    public static int m84486R0(int i, int i2) {
        return m84492X0(i) + m84487S0(i2);
    }

    /* renamed from: S0 */
    public static int m84487S0(int i) {
        return m84495Z0(m84501c1(i));
    }

    /* renamed from: T0 */
    public static int m84488T0(int i, long j) {
        return m84492X0(i) + m84489U0(j);
    }

    /* renamed from: U0 */
    public static int m84489U0(long j) {
        return m84499b1(m84503d1(j));
    }

    /* renamed from: V0 */
    public static int m84490V0(int i, String str) {
        return m84492X0(i) + m84491W0(str);
    }

    /* renamed from: W0 */
    public static int m84491W0(String str) {
        int i;
        try {
            i = Utf8.m85200k(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            i = str.getBytes(C18753i1.f47860a).length;
        }
        return m84472D0(i);
    }

    /* renamed from: X0 */
    public static int m84492X0(int i) {
        return m84495Z0(WireFormat.m85346c(i, 0));
    }

    /* renamed from: Y0 */
    public static int m84494Y0(int i, int i2) {
        return m84492X0(i) + m84495Z0(i2);
    }

    /* renamed from: Z0 */
    public static int m84495Z0(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: a0 */
    public static int m84496a0(int i, boolean z) {
        return m84492X0(i) + m84498b0(z);
    }

    /* renamed from: a1 */
    public static int m84497a1(int i, long j) {
        return m84492X0(i) + m84499b1(j);
    }

    /* renamed from: b0 */
    public static int m84498b0(boolean z) {
        return 1;
    }

    /* renamed from: b1 */
    public static int m84499b1(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((CoroutineScheduler.f29765M0 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: c0 */
    public static int m84500c0(int i, byte[] bArr) {
        return m84492X0(i) + m84502d0(bArr);
    }

    /* renamed from: c1 */
    public static int m84501c1(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: d0 */
    public static int m84502d0(byte[] bArr) {
        return m84472D0(bArr.length);
    }

    /* renamed from: d1 */
    public static long m84503d1(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: e0 */
    public static int m84504e0(int i, ByteBuffer byteBuffer) {
        return m84492X0(i) + m84505f0(byteBuffer);
    }

    /* renamed from: f0 */
    public static int m84505f0(ByteBuffer byteBuffer) {
        return m84472D0(byteBuffer.capacity());
    }

    /* renamed from: g0 */
    public static int m84506g0(int i, ByteString byteString) {
        return m84492X0(i) + m84507h0(byteString);
    }

    /* renamed from: h0 */
    public static int m84507h0(ByteString byteString) {
        return m84472D0(byteString.size());
    }

    /* renamed from: i0 */
    public static int m84508i0(int i, double d) {
        return m84492X0(i) + m84510j0(d);
    }

    /* renamed from: i1 */
    public static CodedOutputStream m84509i1(C18864t tVar, int i) {
        if (i >= 0) {
            return new C18621d(tVar, i);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    /* renamed from: j0 */
    public static int m84510j0(double d) {
        return 8;
    }

    /* renamed from: j1 */
    public static CodedOutputStream m84511j1(OutputStream outputStream) {
        return m84513k1(outputStream, 4096);
    }

    /* renamed from: k0 */
    public static int m84512k0(int i, int i2) {
        return m84492X0(i) + m84514l0(i2);
    }

    /* renamed from: k1 */
    public static CodedOutputStream m84513k1(OutputStream outputStream, int i) {
        return new C18623f(outputStream, i);
    }

    /* renamed from: l0 */
    public static int m84514l0(int i) {
        return m84532x0(i);
    }

    /* renamed from: l1 */
    public static CodedOutputStream m84515l1(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C18622e(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (C18625h.m84756k2()) {
            return m84525q1(byteBuffer);
        } else {
            return m84523p1(byteBuffer);
        }
    }

    /* renamed from: m0 */
    public static int m84516m0(int i, int i2) {
        return m84492X0(i) + m84518n0(i2);
    }

    @Deprecated
    /* renamed from: m1 */
    public static CodedOutputStream m84517m1(ByteBuffer byteBuffer, int i) {
        return m84515l1(byteBuffer);
    }

    /* renamed from: n0 */
    public static int m84518n0(int i) {
        return 4;
    }

    /* renamed from: n1 */
    public static CodedOutputStream m84519n1(byte[] bArr) {
        return m84521o1(bArr, 0, bArr.length);
    }

    /* renamed from: o0 */
    public static int m84520o0(int i, long j) {
        return m84492X0(i) + m84522p0(j);
    }

    /* renamed from: o1 */
    public static CodedOutputStream m84521o1(byte[] bArr, int i, int i2) {
        return new C18620c(bArr, i, i2);
    }

    /* renamed from: p0 */
    public static int m84522p0(long j) {
        return 8;
    }

    /* renamed from: p1 */
    public static CodedOutputStream m84523p1(ByteBuffer byteBuffer) {
        return new C18624g(byteBuffer);
    }

    /* renamed from: q0 */
    public static int m84524q0(int i, float f) {
        return m84492X0(i) + m84526r0(f);
    }

    /* renamed from: q1 */
    public static CodedOutputStream m84525q1(ByteBuffer byteBuffer) {
        return new C18625h(byteBuffer);
    }

    /* renamed from: r0 */
    public static int m84526r0(float f) {
        return 4;
    }

    @Deprecated
    /* renamed from: s0 */
    public static int m84527s0(int i, C18920z1 z1Var) {
        return (m84492X0(i) * 2) + m84529u0(z1Var);
    }

    @Deprecated
    /* renamed from: t0 */
    public static int m84528t0(int i, C18920z1 z1Var, C18905x2 x2Var) {
        return (m84492X0(i) * 2) + m84530v0(z1Var, x2Var);
    }

    @Deprecated
    /* renamed from: u0 */
    public static int m84529u0(C18920z1 z1Var) {
        return z1Var.getSerializedSize();
    }

    @Deprecated
    /* renamed from: v0 */
    public static int m84530v0(C18920z1 z1Var, C18905x2 x2Var) {
        return ((C18665a) z1Var).mo54251r(x2Var);
    }

    /* renamed from: w0 */
    public static int m84531w0(int i, int i2) {
        return m84492X0(i) + m84532x0(i2);
    }

    /* renamed from: x0 */
    public static int m84532x0(int i) {
        if (i >= 0) {
            return m84495Z0(i);
        }
        return 10;
    }

    /* renamed from: y0 */
    public static int m84533y0(int i, long j) {
        return m84492X0(i) + m84534z0(j);
    }

    /* renamed from: z0 */
    public static int m84534z0(long j) {
        return m84499b1(j);
    }

    /* renamed from: A1 */
    public final void mo53792A1(double d) throws IOException {
        mo53795D1(Double.doubleToRawLongBits(d));
    }

    /* renamed from: B1 */
    public final void mo53793B1(int i) throws IOException {
        mo53803J1(i);
    }

    /* renamed from: C1 */
    public abstract void mo53794C1(int i) throws IOException;

    /* renamed from: D1 */
    public abstract void mo53795D1(long j) throws IOException;

    /* renamed from: E1 */
    public final void mo53796E1(float f) throws IOException {
        mo53794C1(Float.floatToRawIntBits(f));
    }

    /* renamed from: F */
    public final void mo53797F(int i, float f) throws IOException {
        mo53830c(i, Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* renamed from: F1 */
    public final void mo53798F1(int i, C18920z1 z1Var) throws IOException {
        mo53840g2(i, 3);
        mo53800H1(z1Var);
        mo53840g2(i, 4);
    }

    @Deprecated
    /* renamed from: G1 */
    public final void mo53799G1(int i, C18920z1 z1Var, C18905x2 x2Var) throws IOException {
        mo53840g2(i, 3);
        mo53802I1(z1Var, x2Var);
        mo53840g2(i, 4);
    }

    @Deprecated
    /* renamed from: H1 */
    public final void mo53800H1(C18920z1 z1Var) throws IOException {
        z1Var.mo53979J(this);
    }

    /* renamed from: I */
    public final void mo53801I(int i, int i2) throws IOException {
        mo53843i(i, i2);
    }

    @Deprecated
    /* renamed from: I1 */
    public final void mo53802I1(C18920z1 z1Var, C18905x2 x2Var) throws IOException {
        x2Var.mo54459i(z1Var, this.f47489a);
    }

    /* renamed from: J1 */
    public abstract void mo53803J1(int i) throws IOException;

    /* renamed from: K1 */
    public final void mo53804K1(long j) throws IOException {
        mo53844i2(j);
    }

    /* renamed from: L */
    public final void mo53805L(int i, int i2) throws IOException {
        mo53847p(i, m84501c1(i2));
    }

    /* renamed from: L1 */
    public abstract void mo53806L1(int i, C18920z1 z1Var) throws IOException;

    /* renamed from: M1 */
    public abstract void mo53807M1(int i, C18920z1 z1Var, C18905x2 x2Var) throws IOException;

    /* renamed from: N1 */
    public abstract void mo53808N1(C18920z1 z1Var) throws IOException;

    /* renamed from: O */
    public abstract void mo53809O(int i, ByteString byteString) throws IOException;

    /* renamed from: O1 */
    public abstract void mo53810O1(C18920z1 z1Var, C18905x2 x2Var) throws IOException;

    /* renamed from: P1 */
    public abstract void mo53811P1(int i, C18920z1 z1Var) throws IOException;

    /* renamed from: Q1 */
    public final void mo53812Q1(byte b) throws IOException {
        mo53815T(b);
    }

    /* renamed from: R1 */
    public final void mo53813R1(int i) throws IOException {
        mo53815T((byte) i);
    }

    /* renamed from: S1 */
    public final void mo53814S1(ByteString byteString) throws IOException {
        byteString.mo53742X0(this);
    }

    /* renamed from: T */
    public abstract void mo53815T(byte b) throws IOException;

    /* renamed from: T1 */
    public abstract void mo53816T1(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: U */
    public abstract void mo53817U(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: U1 */
    public final void mo53818U1(byte[] bArr) throws IOException {
        mo53819V(bArr, 0, bArr.length);
    }

    /* renamed from: V */
    public abstract void mo53819V(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: V1 */
    public final void mo53820V1(byte[] bArr, int i, int i2) throws IOException {
        mo53819V(bArr, i, i2);
    }

    /* renamed from: W */
    public abstract void mo53821W(ByteBuffer byteBuffer) throws IOException;

    @Deprecated
    /* renamed from: W1 */
    public final void mo53822W1(int i) throws IOException {
        mo53794C1(i);
    }

    /* renamed from: X */
    public abstract void mo53823X(byte[] bArr, int i, int i2) throws IOException;

    @Deprecated
    /* renamed from: X1 */
    public final void mo53824X1(long j) throws IOException {
        mo53795D1(j);
    }

    /* renamed from: Y1 */
    public abstract void mo53825Y1(int i, ByteString byteString) throws IOException;

    /* renamed from: Z */
    public final void mo53826Z() {
        if (mo53849r1() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    /* renamed from: Z1 */
    public final void mo53827Z1(int i) throws IOException {
        mo53842h2(i);
    }

    @Deprecated
    /* renamed from: a2 */
    public final void mo53828a2(long j) throws IOException {
        mo53844i2(j);
    }

    /* renamed from: b2 */
    public final void mo53829b2(int i) throws IOException {
        mo53794C1(i);
    }

    /* renamed from: c */
    public abstract void mo53830c(int i, int i2) throws IOException;

    /* renamed from: c2 */
    public final void mo53831c2(long j) throws IOException {
        mo53795D1(j);
    }

    /* renamed from: d2 */
    public final void mo53832d2(int i) throws IOException {
        mo53842h2(m84501c1(i));
    }

    /* renamed from: e1 */
    public abstract void mo53833e1() throws IOException;

    /* renamed from: e2 */
    public final void mo53834e2(long j) throws IOException {
        mo53844i2(m84503d1(j));
    }

    /* renamed from: f */
    public abstract void mo53835f(int i, String str) throws IOException;

    /* renamed from: f1 */
    public abstract int mo53836f1();

    /* renamed from: f2 */
    public abstract void mo53837f2(String str) throws IOException;

    /* renamed from: g */
    public abstract void mo53838g(int i, long j) throws IOException;

    /* renamed from: g1 */
    public final void mo53839g1(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f47485c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", unpairedSurrogateException);
        byte[] bytes = str.getBytes(C18753i1.f47860a);
        try {
            mo53842h2(bytes.length);
            mo53823X(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException((Throwable) e);
        } catch (OutOfSpaceException e2) {
            throw e2;
        }
    }

    /* renamed from: g2 */
    public abstract void mo53840g2(int i, int i2) throws IOException;

    /* renamed from: h1 */
    public boolean mo53841h1() {
        return this.f47490b;
    }

    /* renamed from: h2 */
    public abstract void mo53842h2(int i) throws IOException;

    /* renamed from: i */
    public abstract void mo53843i(int i, int i2) throws IOException;

    /* renamed from: i2 */
    public abstract void mo53844i2(long j) throws IOException;

    /* renamed from: j */
    public final void mo53845j(int i, long j) throws IOException {
        mo53851t(i, j);
    }

    /* renamed from: n */
    public final void mo53846n(int i, long j) throws IOException {
        mo53838g(i, m84503d1(j));
    }

    /* renamed from: p */
    public abstract void mo53847p(int i, int i2) throws IOException;

    /* renamed from: q */
    public final void mo53848q(int i, double d) throws IOException {
        mo53851t(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r1 */
    public abstract int mo53849r1();

    /* renamed from: s1 */
    public void mo53850s1() {
        this.f47490b = true;
    }

    /* renamed from: t */
    public abstract void mo53851t(int i, long j) throws IOException;

    /* renamed from: t1 */
    public final void mo53852t1(boolean z) throws IOException {
        mo53815T(z ? (byte) 1 : 0);
    }

    /* renamed from: u1 */
    public abstract void mo53853u1(int i, byte[] bArr) throws IOException;

    /* renamed from: v1 */
    public abstract void mo53854v1(int i, byte[] bArr, int i2, int i3) throws IOException;

    /* renamed from: w1 */
    public final void mo53855w1(byte[] bArr) throws IOException {
        mo53857x1(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public final void mo53856x(int i, long j) throws IOException {
        mo53838g(i, j);
    }

    /* renamed from: x1 */
    public abstract void mo53857x1(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: y */
    public abstract void mo53858y(int i, boolean z) throws IOException;

    /* renamed from: y1 */
    public abstract void mo53859y1(int i, ByteBuffer byteBuffer) throws IOException;

    /* renamed from: z */
    public final void mo53860z(int i, int i2) throws IOException {
        mo53830c(i, i2);
    }

    /* renamed from: z1 */
    public abstract void mo53861z1(ByteString byteString) throws IOException;

    public CodedOutputStream() {
    }
}
