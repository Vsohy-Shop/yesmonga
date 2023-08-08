package com.google.protobuf;

import com.google.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

public abstract class CodedOutputStream extends C34437q {

    /* renamed from: c */
    public static final Logger f82801c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d */
    public static final boolean f82802d = C34341c3.m138971U();
    @Deprecated

    /* renamed from: e */
    public static final int f82803e = 4;

    /* renamed from: f */
    public static final int f82804f = 4096;

    /* renamed from: a */
    public C34465u f82805a;

    /* renamed from: b */
    public boolean f82806b;

    public static class OutOfSpaceException extends IOException {

        /* renamed from: a */
        public static final String f82807a = "CodedOutputStream was writing to a flat byte array and ran out of space.";
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

    /* renamed from: com.google.protobuf.CodedOutputStream$b */
    public static abstract class C34166b extends CodedOutputStream {

        /* renamed from: g */
        public final byte[] f82808g;

        /* renamed from: h */
        public final int f82809h;

        /* renamed from: i */
        public int f82810i;

        /* renamed from: j */
        public int f82811j;

        public C34166b(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f82808g = bArr;
                this.f82809h = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* renamed from: f1 */
        public final int mo99327f1() {
            return this.f82811j;
        }

        /* renamed from: j2 */
        public final void mo99353j2(byte b) {
            byte[] bArr = this.f82808g;
            int i = this.f82810i;
            this.f82810i = i + 1;
            bArr[i] = b;
            this.f82811j++;
        }

        /* renamed from: k2 */
        public final void mo99354k2(int i) {
            byte[] bArr = this.f82808g;
            int i2 = this.f82810i;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f82810i = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f82811j += 4;
        }

        /* renamed from: l2 */
        public final void mo99355l2(long j) {
            byte[] bArr = this.f82808g;
            int i = this.f82810i;
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
            this.f82810i = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f82811j += 8;
        }

        /* renamed from: m2 */
        public final void mo99356m2(int i) {
            if (i >= 0) {
                mo99358o2(i);
            } else {
                mo99359p2((long) i);
            }
        }

        /* renamed from: n2 */
        public final void mo99357n2(int i, int i2) {
            mo99358o2(WireFormat.m138723c(i, i2));
        }

        /* renamed from: o2 */
        public final void mo99358o2(int i) {
            if (CodedOutputStream.f82802d) {
                long j = (long) this.f82810i;
                while ((i & -128) != 0) {
                    byte[] bArr = this.f82808g;
                    int i2 = this.f82810i;
                    this.f82810i = i2 + 1;
                    C34341c3.m138990g0(bArr, (long) i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f82808g;
                int i3 = this.f82810i;
                this.f82810i = i3 + 1;
                C34341c3.m138990g0(bArr2, (long) i3, (byte) i);
                this.f82811j += (int) (((long) this.f82810i) - j);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.f82808g;
                int i4 = this.f82810i;
                this.f82810i = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f82811j++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f82808g;
            int i5 = this.f82810i;
            this.f82810i = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f82811j++;
        }

        /* renamed from: p2 */
        public final void mo99359p2(long j) {
            if (CodedOutputStream.f82802d) {
                long j2 = (long) this.f82810i;
                while ((j & -128) != 0) {
                    byte[] bArr = this.f82808g;
                    int i = this.f82810i;
                    this.f82810i = i + 1;
                    C34341c3.m138990g0(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f82808g;
                int i2 = this.f82810i;
                this.f82810i = i2 + 1;
                C34341c3.m138990g0(bArr2, (long) i2, (byte) ((int) j));
                this.f82811j += (int) (((long) this.f82810i) - j2);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f82808g;
                int i3 = this.f82810i;
                this.f82810i = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f82811j++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f82808g;
            int i4 = this.f82810i;
            this.f82810i = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
            this.f82811j++;
        }

        /* renamed from: r1 */
        public final int mo99340r1() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$c */
    public static class C34167c extends CodedOutputStream {

        /* renamed from: g */
        public final byte[] f82812g;

        /* renamed from: h */
        public final int f82813h;

        /* renamed from: i */
        public final int f82814i;

        /* renamed from: j */
        public int f82815j;

        public C34167c(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f82812g = bArr;
                    this.f82813h = i;
                    this.f82815j = i;
                    this.f82814i = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: C1 */
        public final void mo99285C1(int i) throws IOException {
            try {
                byte[] bArr = this.f82812g;
                int i2 = this.f82815j;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f82815j = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f82815j), Integer.valueOf(this.f82814i), 1}), e);
            }
        }

        /* renamed from: D1 */
        public final void mo99286D1(long j) throws IOException {
            try {
                byte[] bArr = this.f82812g;
                int i = this.f82815j;
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
                this.f82815j = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f82815j), Integer.valueOf(this.f82814i), 1}), e);
            }
        }

        /* renamed from: J1 */
        public final void mo99294J1(int i) throws IOException {
            if (i >= 0) {
                mo99333h2(i);
            } else {
                mo99335i2((long) i);
            }
        }

        /* renamed from: L1 */
        public final void mo99297L1(int i, C34412l1 l1Var) throws IOException {
            mo99331g2(i, 2);
            mo99299N1(l1Var);
        }

        /* renamed from: M1 */
        public final void mo99298M1(int i, C34412l1 l1Var, C34372g2 g2Var) throws IOException {
            mo99331g2(i, 2);
            mo99333h2(((C34319a) l1Var).getSerializedSize(g2Var));
            g2Var.mo101121h(l1Var, this.f82805a);
        }

        /* renamed from: N1 */
        public final void mo99299N1(C34412l1 l1Var) throws IOException {
            mo99333h2(l1Var.getSerializedSize());
            l1Var.writeTo((CodedOutputStream) this);
        }

        /* renamed from: O1 */
        public final void mo99300O1(C34412l1 l1Var, C34372g2 g2Var) throws IOException {
            mo99333h2(((C34319a) l1Var).getSerializedSize(g2Var));
            g2Var.mo101121h(l1Var, this.f82805a);
        }

        /* renamed from: P */
        public final void mo99301P(int i, ByteString byteString) throws IOException {
            mo99331g2(i, 2);
            mo99352z1(byteString);
        }

        /* renamed from: P1 */
        public final void mo99302P1(int i, C34412l1 l1Var) throws IOException {
            mo99331g2(1, 3);
            mo99338p(2, i);
            mo99297L1(3, l1Var);
            mo99331g2(1, 4);
        }

        /* renamed from: T */
        public final void mo99306T(byte b) throws IOException {
            try {
                byte[] bArr = this.f82812g;
                int i = this.f82815j;
                this.f82815j = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f82815j), Integer.valueOf(this.f82814i), 1}), e);
            }
        }

        /* renamed from: T1 */
        public final void mo99307T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo99310V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo99308U(duplicate);
        }

        /* renamed from: U */
        public final void mo99308U(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f82812g, this.f82815j, remaining);
                this.f82815j += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f82815j), Integer.valueOf(this.f82814i), Integer.valueOf(remaining)}), e);
            }
        }

        /* renamed from: V */
        public final void mo99310V(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f82812g, this.f82815j, i2);
                this.f82815j += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f82815j), Integer.valueOf(this.f82814i), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: W */
        public final void mo99312W(ByteBuffer byteBuffer) throws IOException {
            mo99308U(byteBuffer);
        }

        /* renamed from: X */
        public final void mo99314X(byte[] bArr, int i, int i2) throws IOException {
            mo99310V(bArr, i, i2);
        }

        /* renamed from: Y1 */
        public final void mo99316Y1(int i, ByteString byteString) throws IOException {
            mo99331g2(1, 3);
            mo99338p(2, i);
            mo99301P(3, byteString);
            mo99331g2(1, 4);
        }

        /* renamed from: c */
        public final void mo99321c(int i, int i2) throws IOException {
            mo99331g2(i, 5);
            mo99285C1(i2);
        }

        /* renamed from: e1 */
        public void mo99324e1() {
        }

        /* renamed from: f */
        public final void mo99326f(int i, String str) throws IOException {
            mo99331g2(i, 2);
            mo99328f2(str);
        }

        /* renamed from: f1 */
        public final int mo99327f1() {
            return this.f82815j - this.f82813h;
        }

        /* renamed from: f2 */
        public final void mo99328f2(String str) throws IOException {
            int i = this.f82815j;
            try {
                int Z0 = CodedOutputStream.m137369Z0(str.length() * 3);
                int Z02 = CodedOutputStream.m137369Z0(str.length());
                if (Z02 == Z0) {
                    int i2 = i + Z02;
                    this.f82815j = i2;
                    int i3 = Utf8.m138631i(str, this.f82812g, i2, mo99340r1());
                    this.f82815j = i;
                    mo99333h2((i3 - i) - Z02);
                    this.f82815j = i3;
                    return;
                }
                mo99333h2(Utf8.m138633k(str));
                this.f82815j = Utf8.m138631i(str, this.f82812g, this.f82815j, mo99340r1());
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f82815j = i;
                mo99330g1(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: g */
        public final void mo99329g(int i, long j) throws IOException {
            mo99331g2(i, 0);
            mo99335i2(j);
        }

        /* renamed from: g2 */
        public final void mo99331g2(int i, int i2) throws IOException {
            mo99333h2(WireFormat.m138723c(i, i2));
        }

        /* renamed from: h2 */
        public final void mo99333h2(int i) throws IOException {
            if (!CodedOutputStream.f82802d || C34354e.m139158c() || mo99340r1() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f82812g;
                    int i2 = this.f82815j;
                    this.f82815j = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f82812g;
                    int i3 = this.f82815j;
                    this.f82815j = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f82815j), Integer.valueOf(this.f82814i), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f82812g;
                int i4 = this.f82815j;
                this.f82815j = i4 + 1;
                C34341c3.m138990g0(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f82812g;
                int i5 = this.f82815j;
                this.f82815j = i5 + 1;
                C34341c3.m138990g0(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f82812g;
                    int i7 = this.f82815j;
                    this.f82815j = i7 + 1;
                    C34341c3.m138990g0(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f82812g;
                int i8 = this.f82815j;
                this.f82815j = i8 + 1;
                C34341c3.m138990g0(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f82812g;
                    int i10 = this.f82815j;
                    this.f82815j = i10 + 1;
                    C34341c3.m138990g0(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f82812g;
                int i11 = this.f82815j;
                this.f82815j = i11 + 1;
                C34341c3.m138990g0(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f82812g;
                    int i13 = this.f82815j;
                    this.f82815j = i13 + 1;
                    C34341c3.m138990g0(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f82812g;
                int i14 = this.f82815j;
                this.f82815j = i14 + 1;
                C34341c3.m138990g0(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f82812g;
                int i15 = this.f82815j;
                this.f82815j = i15 + 1;
                C34341c3.m138990g0(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: i */
        public final void mo99334i(int i, int i2) throws IOException {
            mo99331g2(i, 0);
            mo99294J1(i2);
        }

        /* renamed from: i2 */
        public final void mo99335i2(long j) throws IOException {
            if (!CodedOutputStream.f82802d || mo99340r1() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f82812g;
                    int i = this.f82815j;
                    this.f82815j = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f82812g;
                    int i2 = this.f82815j;
                    this.f82815j = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f82815j), Integer.valueOf(this.f82814i), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f82812g;
                    int i3 = this.f82815j;
                    this.f82815j = i3 + 1;
                    C34341c3.m138990g0(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f82812g;
                int i4 = this.f82815j;
                this.f82815j = i4 + 1;
                C34341c3.m138990g0(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: p */
        public final void mo99338p(int i, int i2) throws IOException {
            mo99331g2(i, 0);
            mo99333h2(i2);
        }

        /* renamed from: r1 */
        public final int mo99340r1() {
            return this.f82814i - this.f82815j;
        }

        /* renamed from: t */
        public final void mo99342t(int i, long j) throws IOException {
            mo99331g2(i, 1);
            mo99286D1(j);
        }

        /* renamed from: u1 */
        public final void mo99344u1(int i, byte[] bArr) throws IOException {
            mo99345v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public final void mo99345v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo99331g2(i, 2);
            mo99348x1(bArr, i2, i3);
        }

        /* renamed from: x1 */
        public final void mo99348x1(byte[] bArr, int i, int i2) throws IOException {
            mo99333h2(i2);
            mo99310V(bArr, i, i2);
        }

        /* renamed from: y */
        public final void mo99349y(int i, boolean z) throws IOException {
            mo99331g2(i, 0);
            mo99306T(z ? (byte) 1 : 0);
        }

        /* renamed from: y1 */
        public final void mo99350y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo99331g2(i, 2);
            mo99333h2(byteBuffer.capacity());
            mo99307T1(byteBuffer);
        }

        /* renamed from: z1 */
        public final void mo99352z1(ByteString byteString) throws IOException {
            mo99333h2(byteString.size());
            byteString.mo99230Y0(this);
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$d */
    public static final class C34168d extends C34166b {

        /* renamed from: k */
        public final C34437q f82816k;

        public C34168d(C34437q qVar, int i) {
            super(i);
            if (qVar != null) {
                this.f82816k = qVar;
                return;
            }
            throw new NullPointerException("out");
        }

        /* renamed from: C1 */
        public void mo99285C1(int i) throws IOException {
            mo99361r2(4);
            mo99354k2(i);
        }

        /* renamed from: D1 */
        public void mo99286D1(long j) throws IOException {
            mo99361r2(8);
            mo99355l2(j);
        }

        /* renamed from: J1 */
        public void mo99294J1(int i) throws IOException {
            if (i >= 0) {
                mo99333h2(i);
            } else {
                mo99335i2((long) i);
            }
        }

        /* renamed from: L1 */
        public void mo99297L1(int i, C34412l1 l1Var) throws IOException {
            mo99331g2(i, 2);
            mo99299N1(l1Var);
        }

        /* renamed from: M1 */
        public void mo99298M1(int i, C34412l1 l1Var, C34372g2 g2Var) throws IOException {
            mo99331g2(i, 2);
            mo99300O1(l1Var, g2Var);
        }

        /* renamed from: N1 */
        public void mo99299N1(C34412l1 l1Var) throws IOException {
            mo99333h2(l1Var.getSerializedSize());
            l1Var.writeTo((CodedOutputStream) this);
        }

        /* renamed from: O1 */
        public void mo99300O1(C34412l1 l1Var, C34372g2 g2Var) throws IOException {
            mo99333h2(((C34319a) l1Var).getSerializedSize(g2Var));
            g2Var.mo101121h(l1Var, this.f82805a);
        }

        /* renamed from: P */
        public void mo99301P(int i, ByteString byteString) throws IOException {
            mo99331g2(i, 2);
            mo99352z1(byteString);
        }

        /* renamed from: P1 */
        public void mo99302P1(int i, C34412l1 l1Var) throws IOException {
            mo99331g2(1, 3);
            mo99338p(2, i);
            mo99297L1(3, l1Var);
            mo99331g2(1, 4);
        }

        /* renamed from: T */
        public void mo99306T(byte b) throws IOException {
            if (this.f82810i == this.f82809h) {
                mo99360q2();
            }
            mo99353j2(b);
        }

        /* renamed from: T1 */
        public void mo99307T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo99310V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo99308U(duplicate);
        }

        /* renamed from: U */
        public void mo99308U(ByteBuffer byteBuffer) throws IOException {
            mo99324e1();
            int remaining = byteBuffer.remaining();
            this.f82816k.mo99308U(byteBuffer);
            this.f82811j += remaining;
        }

        /* renamed from: V */
        public void mo99310V(byte[] bArr, int i, int i2) throws IOException {
            mo99324e1();
            this.f82816k.mo99310V(bArr, i, i2);
            this.f82811j += i2;
        }

        /* renamed from: W */
        public void mo99312W(ByteBuffer byteBuffer) throws IOException {
            mo99324e1();
            int remaining = byteBuffer.remaining();
            this.f82816k.mo99312W(byteBuffer);
            this.f82811j += remaining;
        }

        /* renamed from: X */
        public void mo99314X(byte[] bArr, int i, int i2) throws IOException {
            mo99324e1();
            this.f82816k.mo99314X(bArr, i, i2);
            this.f82811j += i2;
        }

        /* renamed from: Y1 */
        public void mo99316Y1(int i, ByteString byteString) throws IOException {
            mo99331g2(1, 3);
            mo99338p(2, i);
            mo99301P(3, byteString);
            mo99331g2(1, 4);
        }

        /* renamed from: c */
        public void mo99321c(int i, int i2) throws IOException {
            mo99361r2(14);
            mo99357n2(i, 5);
            mo99354k2(i2);
        }

        /* renamed from: e1 */
        public void mo99324e1() throws IOException {
            if (this.f82810i > 0) {
                mo99360q2();
            }
        }

        /* renamed from: f */
        public void mo99326f(int i, String str) throws IOException {
            mo99331g2(i, 2);
            mo99328f2(str);
        }

        /* renamed from: f2 */
        public void mo99328f2(String str) throws IOException {
            int length = str.length() * 3;
            int Z0 = CodedOutputStream.m137369Z0(length);
            int i = Z0 + length;
            int i2 = this.f82809h;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int i3 = Utf8.m138631i(str, bArr, 0, length);
                mo99333h2(i3);
                mo99314X(bArr, 0, i3);
                return;
            }
            if (i > i2 - this.f82810i) {
                mo99360q2();
            }
            int i4 = this.f82810i;
            try {
                int Z02 = CodedOutputStream.m137369Z0(str.length());
                if (Z02 == Z0) {
                    int i5 = i4 + Z02;
                    this.f82810i = i5;
                    int i6 = Utf8.m138631i(str, this.f82808g, i5, this.f82809h - i5);
                    this.f82810i = i4;
                    int i7 = (i6 - i4) - Z02;
                    mo99358o2(i7);
                    this.f82810i = i6;
                    this.f82811j += i7;
                    return;
                }
                int k = Utf8.m138633k(str);
                mo99358o2(k);
                this.f82810i = Utf8.m138631i(str, this.f82808g, this.f82810i, k);
                this.f82811j += k;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f82811j -= this.f82810i - i4;
                this.f82810i = i4;
                mo99330g1(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: g */
        public void mo99329g(int i, long j) throws IOException {
            mo99361r2(20);
            mo99357n2(i, 0);
            mo99359p2(j);
        }

        /* renamed from: g2 */
        public void mo99331g2(int i, int i2) throws IOException {
            mo99333h2(WireFormat.m138723c(i, i2));
        }

        /* renamed from: h2 */
        public void mo99333h2(int i) throws IOException {
            mo99361r2(5);
            mo99358o2(i);
        }

        /* renamed from: i */
        public void mo99334i(int i, int i2) throws IOException {
            mo99361r2(20);
            mo99357n2(i, 0);
            mo99356m2(i2);
        }

        /* renamed from: i2 */
        public void mo99335i2(long j) throws IOException {
            mo99361r2(10);
            mo99359p2(j);
        }

        /* renamed from: p */
        public void mo99338p(int i, int i2) throws IOException {
            mo99361r2(20);
            mo99357n2(i, 0);
            mo99358o2(i2);
        }

        /* renamed from: q2 */
        public final void mo99360q2() throws IOException {
            this.f82816k.mo99310V(this.f82808g, 0, this.f82810i);
            this.f82810i = 0;
        }

        /* renamed from: r2 */
        public final void mo99361r2(int i) throws IOException {
            if (this.f82809h - this.f82810i < i) {
                mo99360q2();
            }
        }

        /* renamed from: t */
        public void mo99342t(int i, long j) throws IOException {
            mo99361r2(18);
            mo99357n2(i, 1);
            mo99355l2(j);
        }

        /* renamed from: u1 */
        public void mo99344u1(int i, byte[] bArr) throws IOException {
            mo99345v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public void mo99345v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo99331g2(i, 2);
            mo99348x1(bArr, i2, i3);
        }

        /* renamed from: x1 */
        public void mo99348x1(byte[] bArr, int i, int i2) throws IOException {
            mo99333h2(i2);
            mo99310V(bArr, i, i2);
        }

        /* renamed from: y */
        public void mo99349y(int i, boolean z) throws IOException {
            mo99361r2(11);
            mo99357n2(i, 0);
            mo99353j2(z ? (byte) 1 : 0);
        }

        /* renamed from: y1 */
        public void mo99350y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo99331g2(i, 2);
            mo99333h2(byteBuffer.capacity());
            mo99307T1(byteBuffer);
        }

        /* renamed from: z1 */
        public void mo99352z1(ByteString byteString) throws IOException {
            mo99333h2(byteString.size());
            byteString.mo99230Y0(this);
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$e */
    public static final class C34169e extends C34167c {

        /* renamed from: k */
        public final ByteBuffer f82817k;

        /* renamed from: l */
        public int f82818l;

        public C34169e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f82817k = byteBuffer;
            this.f82818l = byteBuffer.position();
        }

        /* renamed from: e1 */
        public void mo99324e1() {
            this.f82817k.position(this.f82818l + mo99327f1());
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$f */
    public static final class C34170f extends C34166b {

        /* renamed from: k */
        public final OutputStream f82819k;

        public C34170f(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f82819k = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        /* renamed from: C1 */
        public void mo99285C1(int i) throws IOException {
            mo99363r2(4);
            mo99354k2(i);
        }

        /* renamed from: D1 */
        public void mo99286D1(long j) throws IOException {
            mo99363r2(8);
            mo99355l2(j);
        }

        /* renamed from: J1 */
        public void mo99294J1(int i) throws IOException {
            if (i >= 0) {
                mo99333h2(i);
            } else {
                mo99335i2((long) i);
            }
        }

        /* renamed from: L1 */
        public void mo99297L1(int i, C34412l1 l1Var) throws IOException {
            mo99331g2(i, 2);
            mo99299N1(l1Var);
        }

        /* renamed from: M1 */
        public void mo99298M1(int i, C34412l1 l1Var, C34372g2 g2Var) throws IOException {
            mo99331g2(i, 2);
            mo99300O1(l1Var, g2Var);
        }

        /* renamed from: N1 */
        public void mo99299N1(C34412l1 l1Var) throws IOException {
            mo99333h2(l1Var.getSerializedSize());
            l1Var.writeTo((CodedOutputStream) this);
        }

        /* renamed from: O1 */
        public void mo99300O1(C34412l1 l1Var, C34372g2 g2Var) throws IOException {
            mo99333h2(((C34319a) l1Var).getSerializedSize(g2Var));
            g2Var.mo101121h(l1Var, this.f82805a);
        }

        /* renamed from: P */
        public void mo99301P(int i, ByteString byteString) throws IOException {
            mo99331g2(i, 2);
            mo99352z1(byteString);
        }

        /* renamed from: P1 */
        public void mo99302P1(int i, C34412l1 l1Var) throws IOException {
            mo99331g2(1, 3);
            mo99338p(2, i);
            mo99297L1(3, l1Var);
            mo99331g2(1, 4);
        }

        /* renamed from: T */
        public void mo99306T(byte b) throws IOException {
            if (this.f82810i == this.f82809h) {
                mo99362q2();
            }
            mo99353j2(b);
        }

        /* renamed from: T1 */
        public void mo99307T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo99310V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo99308U(duplicate);
        }

        /* renamed from: U */
        public void mo99308U(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i = this.f82809h;
            int i2 = this.f82810i;
            if (i - i2 >= remaining) {
                byteBuffer.get(this.f82808g, i2, remaining);
                this.f82810i += remaining;
                this.f82811j += remaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.f82808g, i2, i3);
            int i4 = remaining - i3;
            this.f82810i = this.f82809h;
            this.f82811j += i3;
            mo99362q2();
            while (true) {
                int i5 = this.f82809h;
                if (i4 > i5) {
                    byteBuffer.get(this.f82808g, 0, i5);
                    this.f82819k.write(this.f82808g, 0, this.f82809h);
                    int i6 = this.f82809h;
                    i4 -= i6;
                    this.f82811j += i6;
                } else {
                    byteBuffer.get(this.f82808g, 0, i4);
                    this.f82810i = i4;
                    this.f82811j += i4;
                    return;
                }
            }
        }

        /* renamed from: V */
        public void mo99310V(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f82809h;
            int i4 = this.f82810i;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f82808g, i4, i2);
                this.f82810i += i2;
                this.f82811j += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.f82808g, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f82810i = this.f82809h;
            this.f82811j += i5;
            mo99362q2();
            if (i7 <= this.f82809h) {
                System.arraycopy(bArr, i6, this.f82808g, 0, i7);
                this.f82810i = i7;
            } else {
                this.f82819k.write(bArr, i6, i7);
            }
            this.f82811j += i7;
        }

        /* renamed from: W */
        public void mo99312W(ByteBuffer byteBuffer) throws IOException {
            mo99308U(byteBuffer);
        }

        /* renamed from: X */
        public void mo99314X(byte[] bArr, int i, int i2) throws IOException {
            mo99310V(bArr, i, i2);
        }

        /* renamed from: Y1 */
        public void mo99316Y1(int i, ByteString byteString) throws IOException {
            mo99331g2(1, 3);
            mo99338p(2, i);
            mo99301P(3, byteString);
            mo99331g2(1, 4);
        }

        /* renamed from: c */
        public void mo99321c(int i, int i2) throws IOException {
            mo99363r2(14);
            mo99357n2(i, 5);
            mo99354k2(i2);
        }

        /* renamed from: e1 */
        public void mo99324e1() throws IOException {
            if (this.f82810i > 0) {
                mo99362q2();
            }
        }

        /* renamed from: f */
        public void mo99326f(int i, String str) throws IOException {
            mo99331g2(i, 2);
            mo99328f2(str);
        }

        /* renamed from: f2 */
        public void mo99328f2(String str) throws IOException {
            int i;
            int i2;
            try {
                int length = str.length() * 3;
                int Z0 = CodedOutputStream.m137369Z0(length);
                int i3 = Z0 + length;
                int i4 = this.f82809h;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int i5 = Utf8.m138631i(str, bArr, 0, length);
                    mo99333h2(i5);
                    mo99314X(bArr, 0, i5);
                    return;
                }
                if (i3 > i4 - this.f82810i) {
                    mo99362q2();
                }
                int Z02 = CodedOutputStream.m137369Z0(str.length());
                i = this.f82810i;
                if (Z02 == Z0) {
                    int i6 = i + Z02;
                    this.f82810i = i6;
                    int i7 = Utf8.m138631i(str, this.f82808g, i6, this.f82809h - i6);
                    this.f82810i = i;
                    i2 = (i7 - i) - Z02;
                    mo99358o2(i2);
                    this.f82810i = i7;
                } else {
                    i2 = Utf8.m138633k(str);
                    mo99358o2(i2);
                    this.f82810i = Utf8.m138631i(str, this.f82808g, this.f82810i, i2);
                }
                this.f82811j += i2;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f82811j -= this.f82810i - i;
                this.f82810i = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            } catch (Utf8.UnpairedSurrogateException e3) {
                mo99330g1(str, e3);
            }
        }

        /* renamed from: g */
        public void mo99329g(int i, long j) throws IOException {
            mo99363r2(20);
            mo99357n2(i, 0);
            mo99359p2(j);
        }

        /* renamed from: g2 */
        public void mo99331g2(int i, int i2) throws IOException {
            mo99333h2(WireFormat.m138723c(i, i2));
        }

        /* renamed from: h2 */
        public void mo99333h2(int i) throws IOException {
            mo99363r2(5);
            mo99358o2(i);
        }

        /* renamed from: i */
        public void mo99334i(int i, int i2) throws IOException {
            mo99363r2(20);
            mo99357n2(i, 0);
            mo99356m2(i2);
        }

        /* renamed from: i2 */
        public void mo99335i2(long j) throws IOException {
            mo99363r2(10);
            mo99359p2(j);
        }

        /* renamed from: p */
        public void mo99338p(int i, int i2) throws IOException {
            mo99363r2(20);
            mo99357n2(i, 0);
            mo99358o2(i2);
        }

        /* renamed from: q2 */
        public final void mo99362q2() throws IOException {
            this.f82819k.write(this.f82808g, 0, this.f82810i);
            this.f82810i = 0;
        }

        /* renamed from: r2 */
        public final void mo99363r2(int i) throws IOException {
            if (this.f82809h - this.f82810i < i) {
                mo99362q2();
            }
        }

        /* renamed from: t */
        public void mo99342t(int i, long j) throws IOException {
            mo99363r2(18);
            mo99357n2(i, 1);
            mo99355l2(j);
        }

        /* renamed from: u1 */
        public void mo99344u1(int i, byte[] bArr) throws IOException {
            mo99345v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public void mo99345v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo99331g2(i, 2);
            mo99348x1(bArr, i2, i3);
        }

        /* renamed from: x1 */
        public void mo99348x1(byte[] bArr, int i, int i2) throws IOException {
            mo99333h2(i2);
            mo99310V(bArr, i, i2);
        }

        /* renamed from: y */
        public void mo99349y(int i, boolean z) throws IOException {
            mo99363r2(11);
            mo99357n2(i, 0);
            mo99353j2(z ? (byte) 1 : 0);
        }

        /* renamed from: y1 */
        public void mo99350y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo99331g2(i, 2);
            mo99333h2(byteBuffer.capacity());
            mo99307T1(byteBuffer);
        }

        /* renamed from: z1 */
        public void mo99352z1(ByteString byteString) throws IOException {
            mo99333h2(byteString.size());
            byteString.mo99230Y0(this);
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$g */
    public static final class C34171g extends CodedOutputStream {

        /* renamed from: g */
        public final ByteBuffer f82820g;

        /* renamed from: h */
        public final ByteBuffer f82821h;

        /* renamed from: i */
        public final int f82822i;

        public C34171g(ByteBuffer byteBuffer) {
            super();
            this.f82820g = byteBuffer;
            this.f82821h = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f82822i = byteBuffer.position();
        }

        /* renamed from: C1 */
        public void mo99285C1(int i) throws IOException {
            try {
                this.f82821h.putInt(i);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: D1 */
        public void mo99286D1(long j) throws IOException {
            try {
                this.f82821h.putLong(j);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: J1 */
        public void mo99294J1(int i) throws IOException {
            if (i >= 0) {
                mo99333h2(i);
            } else {
                mo99335i2((long) i);
            }
        }

        /* renamed from: L1 */
        public void mo99297L1(int i, C34412l1 l1Var) throws IOException {
            mo99331g2(i, 2);
            mo99299N1(l1Var);
        }

        /* renamed from: M1 */
        public void mo99298M1(int i, C34412l1 l1Var, C34372g2 g2Var) throws IOException {
            mo99331g2(i, 2);
            mo99300O1(l1Var, g2Var);
        }

        /* renamed from: N1 */
        public void mo99299N1(C34412l1 l1Var) throws IOException {
            mo99333h2(l1Var.getSerializedSize());
            l1Var.writeTo((CodedOutputStream) this);
        }

        /* renamed from: O1 */
        public void mo99300O1(C34412l1 l1Var, C34372g2 g2Var) throws IOException {
            mo99333h2(((C34319a) l1Var).getSerializedSize(g2Var));
            g2Var.mo101121h(l1Var, this.f82805a);
        }

        /* renamed from: P */
        public void mo99301P(int i, ByteString byteString) throws IOException {
            mo99331g2(i, 2);
            mo99352z1(byteString);
        }

        /* renamed from: P1 */
        public void mo99302P1(int i, C34412l1 l1Var) throws IOException {
            mo99331g2(1, 3);
            mo99338p(2, i);
            mo99297L1(3, l1Var);
            mo99331g2(1, 4);
        }

        /* renamed from: T */
        public void mo99306T(byte b) throws IOException {
            try {
                this.f82821h.put(b);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: T1 */
        public void mo99307T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo99310V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo99308U(duplicate);
        }

        /* renamed from: U */
        public void mo99308U(ByteBuffer byteBuffer) throws IOException {
            try {
                this.f82821h.put(byteBuffer);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: V */
        public void mo99310V(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f82821h.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: W */
        public void mo99312W(ByteBuffer byteBuffer) throws IOException {
            mo99308U(byteBuffer);
        }

        /* renamed from: X */
        public void mo99314X(byte[] bArr, int i, int i2) throws IOException {
            mo99310V(bArr, i, i2);
        }

        /* renamed from: Y1 */
        public void mo99316Y1(int i, ByteString byteString) throws IOException {
            mo99331g2(1, 3);
            mo99338p(2, i);
            mo99301P(3, byteString);
            mo99331g2(1, 4);
        }

        /* renamed from: c */
        public void mo99321c(int i, int i2) throws IOException {
            mo99331g2(i, 5);
            mo99285C1(i2);
        }

        /* renamed from: e1 */
        public void mo99324e1() {
            this.f82820g.position(this.f82821h.position());
        }

        /* renamed from: f */
        public void mo99326f(int i, String str) throws IOException {
            mo99331g2(i, 2);
            mo99328f2(str);
        }

        /* renamed from: f1 */
        public int mo99327f1() {
            return this.f82821h.position() - this.f82822i;
        }

        /* renamed from: f2 */
        public void mo99328f2(String str) throws IOException {
            int position = this.f82821h.position();
            try {
                int Z0 = CodedOutputStream.m137369Z0(str.length() * 3);
                int Z02 = CodedOutputStream.m137369Z0(str.length());
                if (Z02 == Z0) {
                    int position2 = this.f82821h.position() + Z02;
                    this.f82821h.position(position2);
                    mo99364j2(str);
                    int position3 = this.f82821h.position();
                    this.f82821h.position(position);
                    mo99333h2(position3 - position2);
                    this.f82821h.position(position3);
                    return;
                }
                mo99333h2(Utf8.m138633k(str));
                mo99364j2(str);
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f82821h.position(position);
                mo99330g1(str, e);
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: g */
        public void mo99329g(int i, long j) throws IOException {
            mo99331g2(i, 0);
            mo99335i2(j);
        }

        /* renamed from: g2 */
        public void mo99331g2(int i, int i2) throws IOException {
            mo99333h2(WireFormat.m138723c(i, i2));
        }

        /* renamed from: h2 */
        public void mo99333h2(int i) throws IOException {
            while ((i & -128) != 0) {
                this.f82821h.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f82821h.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: i */
        public void mo99334i(int i, int i2) throws IOException {
            mo99331g2(i, 0);
            mo99294J1(i2);
        }

        /* renamed from: i2 */
        public void mo99335i2(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.f82821h.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f82821h.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: j2 */
        public final void mo99364j2(String str) throws IOException {
            try {
                Utf8.m138632j(str, this.f82821h);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: p */
        public void mo99338p(int i, int i2) throws IOException {
            mo99331g2(i, 0);
            mo99333h2(i2);
        }

        /* renamed from: r1 */
        public int mo99340r1() {
            return this.f82821h.remaining();
        }

        /* renamed from: t */
        public void mo99342t(int i, long j) throws IOException {
            mo99331g2(i, 1);
            mo99286D1(j);
        }

        /* renamed from: u1 */
        public void mo99344u1(int i, byte[] bArr) throws IOException {
            mo99345v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public void mo99345v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo99331g2(i, 2);
            mo99348x1(bArr, i2, i3);
        }

        /* renamed from: x1 */
        public void mo99348x1(byte[] bArr, int i, int i2) throws IOException {
            mo99333h2(i2);
            mo99310V(bArr, i, i2);
        }

        /* renamed from: y */
        public void mo99349y(int i, boolean z) throws IOException {
            mo99331g2(i, 0);
            mo99306T(z ? (byte) 1 : 0);
        }

        /* renamed from: y1 */
        public void mo99350y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo99331g2(i, 2);
            mo99333h2(byteBuffer.capacity());
            mo99307T1(byteBuffer);
        }

        /* renamed from: z1 */
        public void mo99352z1(ByteString byteString) throws IOException {
            mo99333h2(byteString.size());
            byteString.mo99230Y0(this);
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$h */
    public static final class C34172h extends CodedOutputStream {

        /* renamed from: g */
        public final ByteBuffer f82823g;

        /* renamed from: h */
        public final ByteBuffer f82824h;

        /* renamed from: i */
        public final long f82825i;

        /* renamed from: j */
        public final long f82826j;

        /* renamed from: k */
        public final long f82827k;

        /* renamed from: l */
        public final long f82828l;

        /* renamed from: m */
        public long f82829m;

        public C34172h(ByteBuffer byteBuffer) {
            super();
            this.f82823g = byteBuffer;
            this.f82824h = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long k = C34341c3.m138997k(byteBuffer);
            this.f82825i = k;
            long position = ((long) byteBuffer.position()) + k;
            this.f82826j = position;
            long limit = k + ((long) byteBuffer.limit());
            this.f82827k = limit;
            this.f82828l = limit - 10;
            this.f82829m = position;
        }

        /* renamed from: k2 */
        public static boolean m137630k2() {
            return C34341c3.m138972V();
        }

        /* renamed from: C1 */
        public void mo99285C1(int i) throws IOException {
            this.f82824h.putInt(mo99365j2(this.f82829m), i);
            this.f82829m += 4;
        }

        /* renamed from: D1 */
        public void mo99286D1(long j) throws IOException {
            this.f82824h.putLong(mo99365j2(this.f82829m), j);
            this.f82829m += 8;
        }

        /* renamed from: J1 */
        public void mo99294J1(int i) throws IOException {
            if (i >= 0) {
                mo99333h2(i);
            } else {
                mo99335i2((long) i);
            }
        }

        /* renamed from: L1 */
        public void mo99297L1(int i, C34412l1 l1Var) throws IOException {
            mo99331g2(i, 2);
            mo99299N1(l1Var);
        }

        /* renamed from: M1 */
        public void mo99298M1(int i, C34412l1 l1Var, C34372g2 g2Var) throws IOException {
            mo99331g2(i, 2);
            mo99300O1(l1Var, g2Var);
        }

        /* renamed from: N1 */
        public void mo99299N1(C34412l1 l1Var) throws IOException {
            mo99333h2(l1Var.getSerializedSize());
            l1Var.writeTo((CodedOutputStream) this);
        }

        /* renamed from: O1 */
        public void mo99300O1(C34412l1 l1Var, C34372g2 g2Var) throws IOException {
            mo99333h2(((C34319a) l1Var).getSerializedSize(g2Var));
            g2Var.mo101121h(l1Var, this.f82805a);
        }

        /* renamed from: P */
        public void mo99301P(int i, ByteString byteString) throws IOException {
            mo99331g2(i, 2);
            mo99352z1(byteString);
        }

        /* renamed from: P1 */
        public void mo99302P1(int i, C34412l1 l1Var) throws IOException {
            mo99331g2(1, 3);
            mo99338p(2, i);
            mo99297L1(3, l1Var);
            mo99331g2(1, 4);
        }

        /* renamed from: T */
        public void mo99306T(byte b) throws IOException {
            long j = this.f82829m;
            if (j < this.f82827k) {
                this.f82829m = 1 + j;
                C34341c3.m138986e0(j, b);
                return;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f82829m), Long.valueOf(this.f82827k), 1}));
        }

        /* renamed from: T1 */
        public void mo99307T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo99310V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo99308U(duplicate);
        }

        /* renamed from: U */
        public void mo99308U(ByteBuffer byteBuffer) throws IOException {
            try {
                int remaining = byteBuffer.remaining();
                mo99366l2(this.f82829m);
                this.f82824h.put(byteBuffer);
                this.f82829m += (long) remaining;
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: V */
        public void mo99310V(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                long j2 = this.f82829m;
                if (this.f82827k - j >= j2) {
                    C34341c3.m139009q(bArr, (long) i, j2, j);
                    this.f82829m += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f82829m), Long.valueOf(this.f82827k), Integer.valueOf(i2)}));
        }

        /* renamed from: W */
        public void mo99312W(ByteBuffer byteBuffer) throws IOException {
            mo99308U(byteBuffer);
        }

        /* renamed from: X */
        public void mo99314X(byte[] bArr, int i, int i2) throws IOException {
            mo99310V(bArr, i, i2);
        }

        /* renamed from: Y1 */
        public void mo99316Y1(int i, ByteString byteString) throws IOException {
            mo99331g2(1, 3);
            mo99338p(2, i);
            mo99301P(3, byteString);
            mo99331g2(1, 4);
        }

        /* renamed from: c */
        public void mo99321c(int i, int i2) throws IOException {
            mo99331g2(i, 5);
            mo99285C1(i2);
        }

        /* renamed from: e1 */
        public void mo99324e1() {
            this.f82823g.position(mo99365j2(this.f82829m));
        }

        /* renamed from: f */
        public void mo99326f(int i, String str) throws IOException {
            mo99331g2(i, 2);
            mo99328f2(str);
        }

        /* renamed from: f1 */
        public int mo99327f1() {
            return (int) (this.f82829m - this.f82826j);
        }

        /* renamed from: f2 */
        public void mo99328f2(String str) throws IOException {
            long j = this.f82829m;
            try {
                int Z0 = CodedOutputStream.m137369Z0(str.length() * 3);
                int Z02 = CodedOutputStream.m137369Z0(str.length());
                if (Z02 == Z0) {
                    int j2 = mo99365j2(this.f82829m) + Z02;
                    this.f82824h.position(j2);
                    Utf8.m138632j(str, this.f82824h);
                    int position = this.f82824h.position() - j2;
                    mo99333h2(position);
                    this.f82829m += (long) position;
                    return;
                }
                int k = Utf8.m138633k(str);
                mo99333h2(k);
                mo99366l2(this.f82829m);
                Utf8.m138632j(str, this.f82824h);
                this.f82829m += (long) k;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f82829m = j;
                mo99366l2(j);
                mo99330g1(str, e);
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            }
        }

        /* renamed from: g */
        public void mo99329g(int i, long j) throws IOException {
            mo99331g2(i, 0);
            mo99335i2(j);
        }

        /* renamed from: g2 */
        public void mo99331g2(int i, int i2) throws IOException {
            mo99333h2(WireFormat.m138723c(i, i2));
        }

        /* renamed from: h2 */
        public void mo99333h2(int i) throws IOException {
            if (this.f82829m <= this.f82828l) {
                while ((i & -128) != 0) {
                    long j = this.f82829m;
                    this.f82829m = j + 1;
                    C34341c3.m138986e0(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.f82829m;
                this.f82829m = 1 + j2;
                C34341c3.m138986e0(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.f82829m;
                if (j3 >= this.f82827k) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f82829m), Long.valueOf(this.f82827k), 1}));
                } else if ((i & -128) == 0) {
                    this.f82829m = 1 + j3;
                    C34341c3.m138986e0(j3, (byte) i);
                    return;
                } else {
                    this.f82829m = j3 + 1;
                    C34341c3.m138986e0(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        /* renamed from: i */
        public void mo99334i(int i, int i2) throws IOException {
            mo99331g2(i, 0);
            mo99294J1(i2);
        }

        /* renamed from: i2 */
        public void mo99335i2(long j) throws IOException {
            if (this.f82829m <= this.f82828l) {
                while ((j & -128) != 0) {
                    long j2 = this.f82829m;
                    this.f82829m = j2 + 1;
                    C34341c3.m138986e0(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f82829m;
                this.f82829m = 1 + j3;
                C34341c3.m138986e0(j3, (byte) ((int) j));
                return;
            }
            while (true) {
                long j4 = this.f82829m;
                if (j4 >= this.f82827k) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f82829m), Long.valueOf(this.f82827k), 1}));
                } else if ((j & -128) == 0) {
                    this.f82829m = 1 + j4;
                    C34341c3.m138986e0(j4, (byte) ((int) j));
                    return;
                } else {
                    this.f82829m = j4 + 1;
                    C34341c3.m138986e0(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        /* renamed from: j2 */
        public final int mo99365j2(long j) {
            return (int) (j - this.f82825i);
        }

        /* renamed from: l2 */
        public final void mo99366l2(long j) {
            this.f82824h.position(mo99365j2(j));
        }

        /* renamed from: p */
        public void mo99338p(int i, int i2) throws IOException {
            mo99331g2(i, 0);
            mo99333h2(i2);
        }

        /* renamed from: r1 */
        public int mo99340r1() {
            return (int) (this.f82827k - this.f82829m);
        }

        /* renamed from: t */
        public void mo99342t(int i, long j) throws IOException {
            mo99331g2(i, 1);
            mo99286D1(j);
        }

        /* renamed from: u1 */
        public void mo99344u1(int i, byte[] bArr) throws IOException {
            mo99345v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public void mo99345v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo99331g2(i, 2);
            mo99348x1(bArr, i2, i3);
        }

        /* renamed from: x1 */
        public void mo99348x1(byte[] bArr, int i, int i2) throws IOException {
            mo99333h2(i2);
            mo99310V(bArr, i, i2);
        }

        /* renamed from: y */
        public void mo99349y(int i, boolean z) throws IOException {
            mo99331g2(i, 0);
            mo99306T(z ? (byte) 1 : 0);
        }

        /* renamed from: y1 */
        public void mo99350y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo99331g2(i, 2);
            mo99333h2(byteBuffer.capacity());
            mo99307T1(byteBuffer);
        }

        /* renamed from: z1 */
        public void mo99352z1(ByteString byteString) throws IOException {
            mo99333h2(byteString.size());
            byteString.mo99230Y0(this);
        }
    }

    /* renamed from: A0 */
    public static int m137343A0(int i, C34503y0 y0Var) {
        return (m137366X0(1) * 2) + m137368Y0(2, i) + m137344B0(3, y0Var);
    }

    /* renamed from: B0 */
    public static int m137344B0(int i, C34503y0 y0Var) {
        return m137366X0(i) + m137345C0(y0Var);
    }

    /* renamed from: C0 */
    public static int m137345C0(C34503y0 y0Var) {
        return m137346D0(y0Var.mo101697f());
    }

    /* renamed from: D0 */
    public static int m137346D0(int i) {
        return m137369Z0(i) + i;
    }

    /* renamed from: E0 */
    public static int m137347E0(int i, C34412l1 l1Var) {
        return (m137366X0(1) * 2) + m137368Y0(2, i) + m137348F0(3, l1Var);
    }

    /* renamed from: F0 */
    public static int m137348F0(int i, C34412l1 l1Var) {
        return m137366X0(i) + m137350H0(l1Var);
    }

    /* renamed from: G0 */
    public static int m137349G0(int i, C34412l1 l1Var, C34372g2 g2Var) {
        return m137366X0(i) + m137351I0(l1Var, g2Var);
    }

    /* renamed from: H0 */
    public static int m137350H0(C34412l1 l1Var) {
        return m137346D0(l1Var.getSerializedSize());
    }

    /* renamed from: I0 */
    public static int m137351I0(C34412l1 l1Var, C34372g2 g2Var) {
        return m137346D0(((C34319a) l1Var).getSerializedSize(g2Var));
    }

    /* renamed from: J0 */
    public static int m137352J0(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: K0 */
    public static int m137353K0(int i, ByteString byteString) {
        return (m137366X0(1) * 2) + m137368Y0(2, i) + m137380g0(3, byteString);
    }

    @Deprecated
    /* renamed from: L0 */
    public static int m137354L0(int i) {
        return m137369Z0(i);
    }

    @Deprecated
    /* renamed from: M0 */
    public static int m137355M0(long j) {
        return m137373b1(j);
    }

    /* renamed from: N0 */
    public static int m137356N0(int i, int i2) {
        return m137366X0(i) + m137357O0(i2);
    }

    /* renamed from: O0 */
    public static int m137357O0(int i) {
        return 4;
    }

    /* renamed from: P0 */
    public static int m137358P0(int i, long j) {
        return m137366X0(i) + m137359Q0(j);
    }

    /* renamed from: Q0 */
    public static int m137359Q0(long j) {
        return 8;
    }

    /* renamed from: R0 */
    public static int m137360R0(int i, int i2) {
        return m137366X0(i) + m137361S0(i2);
    }

    /* renamed from: S0 */
    public static int m137361S0(int i) {
        return m137369Z0(m137375c1(i));
    }

    /* renamed from: T0 */
    public static int m137362T0(int i, long j) {
        return m137366X0(i) + m137363U0(j);
    }

    /* renamed from: U0 */
    public static int m137363U0(long j) {
        return m137373b1(m137377d1(j));
    }

    /* renamed from: V0 */
    public static int m137364V0(int i, String str) {
        return m137366X0(i) + m137365W0(str);
    }

    /* renamed from: W0 */
    public static int m137365W0(String str) {
        int i;
        try {
            i = Utf8.m138633k(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            i = str.getBytes(C34471v0.f83529a).length;
        }
        return m137346D0(i);
    }

    /* renamed from: X0 */
    public static int m137366X0(int i) {
        return m137369Z0(WireFormat.m138723c(i, 0));
    }

    /* renamed from: Y0 */
    public static int m137368Y0(int i, int i2) {
        return m137366X0(i) + m137369Z0(i2);
    }

    /* renamed from: Z0 */
    public static int m137369Z0(int i) {
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
    public static int m137370a0(int i, boolean z) {
        return m137366X0(i) + m137372b0(z);
    }

    /* renamed from: a1 */
    public static int m137371a1(int i, long j) {
        return m137366X0(i) + m137373b1(j);
    }

    /* renamed from: b0 */
    public static int m137372b0(boolean z) {
        return 1;
    }

    /* renamed from: b1 */
    public static int m137373b1(long j) {
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
    public static int m137374c0(int i, byte[] bArr) {
        return m137366X0(i) + m137376d0(bArr);
    }

    /* renamed from: c1 */
    public static int m137375c1(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: d0 */
    public static int m137376d0(byte[] bArr) {
        return m137346D0(bArr.length);
    }

    /* renamed from: d1 */
    public static long m137377d1(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: e0 */
    public static int m137378e0(int i, ByteBuffer byteBuffer) {
        return m137366X0(i) + m137379f0(byteBuffer);
    }

    /* renamed from: f0 */
    public static int m137379f0(ByteBuffer byteBuffer) {
        return m137346D0(byteBuffer.capacity());
    }

    /* renamed from: g0 */
    public static int m137380g0(int i, ByteString byteString) {
        return m137366X0(i) + m137381h0(byteString);
    }

    /* renamed from: h0 */
    public static int m137381h0(ByteString byteString) {
        return m137346D0(byteString.size());
    }

    /* renamed from: i0 */
    public static int m137382i0(int i, double d) {
        return m137366X0(i) + m137384j0(d);
    }

    /* renamed from: i1 */
    public static CodedOutputStream m137383i1(C34437q qVar, int i) {
        if (i >= 0) {
            return new C34168d(qVar, i);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    /* renamed from: j0 */
    public static int m137384j0(double d) {
        return 8;
    }

    /* renamed from: j1 */
    public static CodedOutputStream m137385j1(OutputStream outputStream) {
        return m137387k1(outputStream, 4096);
    }

    /* renamed from: k0 */
    public static int m137386k0(int i, int i2) {
        return m137366X0(i) + m137388l0(i2);
    }

    /* renamed from: k1 */
    public static CodedOutputStream m137387k1(OutputStream outputStream, int i) {
        return new C34170f(outputStream, i);
    }

    /* renamed from: l0 */
    public static int m137388l0(int i) {
        return m137406x0(i);
    }

    /* renamed from: l1 */
    public static CodedOutputStream m137389l1(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C34169e(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (C34172h.m137630k2()) {
            return m137399q1(byteBuffer);
        } else {
            return m137397p1(byteBuffer);
        }
    }

    /* renamed from: m0 */
    public static int m137390m0(int i, int i2) {
        return m137366X0(i) + m137392n0(i2);
    }

    @Deprecated
    /* renamed from: m1 */
    public static CodedOutputStream m137391m1(ByteBuffer byteBuffer, int i) {
        return m137389l1(byteBuffer);
    }

    /* renamed from: n0 */
    public static int m137392n0(int i) {
        return 4;
    }

    /* renamed from: n1 */
    public static CodedOutputStream m137393n1(byte[] bArr) {
        return m137395o1(bArr, 0, bArr.length);
    }

    /* renamed from: o0 */
    public static int m137394o0(int i, long j) {
        return m137366X0(i) + m137396p0(j);
    }

    /* renamed from: o1 */
    public static CodedOutputStream m137395o1(byte[] bArr, int i, int i2) {
        return new C34167c(bArr, i, i2);
    }

    /* renamed from: p0 */
    public static int m137396p0(long j) {
        return 8;
    }

    /* renamed from: p1 */
    public static CodedOutputStream m137397p1(ByteBuffer byteBuffer) {
        return new C34171g(byteBuffer);
    }

    /* renamed from: q0 */
    public static int m137398q0(int i, float f) {
        return m137366X0(i) + m137400r0(f);
    }

    /* renamed from: q1 */
    public static CodedOutputStream m137399q1(ByteBuffer byteBuffer) {
        return new C34172h(byteBuffer);
    }

    /* renamed from: r0 */
    public static int m137400r0(float f) {
        return 4;
    }

    @Deprecated
    /* renamed from: s0 */
    public static int m137401s0(int i, C34412l1 l1Var) {
        return (m137366X0(i) * 2) + m137403u0(l1Var);
    }

    @Deprecated
    /* renamed from: t0 */
    public static int m137402t0(int i, C34412l1 l1Var, C34372g2 g2Var) {
        return (m137366X0(i) * 2) + m137404v0(l1Var, g2Var);
    }

    @Deprecated
    /* renamed from: u0 */
    public static int m137403u0(C34412l1 l1Var) {
        return l1Var.getSerializedSize();
    }

    @Deprecated
    /* renamed from: v0 */
    public static int m137404v0(C34412l1 l1Var, C34372g2 g2Var) {
        return ((C34319a) l1Var).getSerializedSize(g2Var);
    }

    /* renamed from: w0 */
    public static int m137405w0(int i, int i2) {
        return m137366X0(i) + m137406x0(i2);
    }

    /* renamed from: x0 */
    public static int m137406x0(int i) {
        if (i >= 0) {
            return m137369Z0(i);
        }
        return 10;
    }

    /* renamed from: y0 */
    public static int m137407y0(int i, long j) {
        return m137366X0(i) + m137408z0(j);
    }

    /* renamed from: z0 */
    public static int m137408z0(long j) {
        return m137373b1(j);
    }

    /* renamed from: A1 */
    public final void mo99283A1(double d) throws IOException {
        mo99286D1(Double.doubleToRawLongBits(d));
    }

    /* renamed from: B1 */
    public final void mo99284B1(int i) throws IOException {
        mo99294J1(i);
    }

    /* renamed from: C1 */
    public abstract void mo99285C1(int i) throws IOException;

    /* renamed from: D1 */
    public abstract void mo99286D1(long j) throws IOException;

    /* renamed from: E1 */
    public final void mo99287E1(float f) throws IOException {
        mo99285C1(Float.floatToRawIntBits(f));
    }

    /* renamed from: F */
    public final void mo99288F(int i, float f) throws IOException {
        mo99321c(i, Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* renamed from: F1 */
    public final void mo99289F1(int i, C34412l1 l1Var) throws IOException {
        mo99331g2(i, 3);
        mo99291H1(l1Var);
        mo99331g2(i, 4);
    }

    @Deprecated
    /* renamed from: G1 */
    public final void mo99290G1(int i, C34412l1 l1Var, C34372g2 g2Var) throws IOException {
        mo99331g2(i, 3);
        mo99293I1(l1Var, g2Var);
        mo99331g2(i, 4);
    }

    @Deprecated
    /* renamed from: H1 */
    public final void mo99291H1(C34412l1 l1Var) throws IOException {
        l1Var.writeTo(this);
    }

    /* renamed from: I */
    public final void mo99292I(int i, int i2) throws IOException {
        mo99334i(i, i2);
    }

    @Deprecated
    /* renamed from: I1 */
    public final void mo99293I1(C34412l1 l1Var, C34372g2 g2Var) throws IOException {
        g2Var.mo101121h(l1Var, this.f82805a);
    }

    /* renamed from: J1 */
    public abstract void mo99294J1(int i) throws IOException;

    /* renamed from: K1 */
    public final void mo99295K1(long j) throws IOException {
        mo99335i2(j);
    }

    /* renamed from: L */
    public final void mo99296L(int i, int i2) throws IOException {
        mo99338p(i, m137375c1(i2));
    }

    /* renamed from: L1 */
    public abstract void mo99297L1(int i, C34412l1 l1Var) throws IOException;

    /* renamed from: M1 */
    public abstract void mo99298M1(int i, C34412l1 l1Var, C34372g2 g2Var) throws IOException;

    /* renamed from: N1 */
    public abstract void mo99299N1(C34412l1 l1Var) throws IOException;

    /* renamed from: O1 */
    public abstract void mo99300O1(C34412l1 l1Var, C34372g2 g2Var) throws IOException;

    /* renamed from: P */
    public abstract void mo99301P(int i, ByteString byteString) throws IOException;

    /* renamed from: P1 */
    public abstract void mo99302P1(int i, C34412l1 l1Var) throws IOException;

    /* renamed from: Q1 */
    public final void mo99303Q1(byte b) throws IOException {
        mo99306T(b);
    }

    /* renamed from: R1 */
    public final void mo99304R1(int i) throws IOException {
        mo99306T((byte) i);
    }

    /* renamed from: S1 */
    public final void mo99305S1(ByteString byteString) throws IOException {
        byteString.mo99230Y0(this);
    }

    /* renamed from: T */
    public abstract void mo99306T(byte b) throws IOException;

    /* renamed from: T1 */
    public abstract void mo99307T1(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: U */
    public abstract void mo99308U(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: U1 */
    public final void mo99309U1(byte[] bArr) throws IOException {
        mo99310V(bArr, 0, bArr.length);
    }

    /* renamed from: V */
    public abstract void mo99310V(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: V1 */
    public final void mo99311V1(byte[] bArr, int i, int i2) throws IOException {
        mo99310V(bArr, i, i2);
    }

    /* renamed from: W */
    public abstract void mo99312W(ByteBuffer byteBuffer) throws IOException;

    @Deprecated
    /* renamed from: W1 */
    public final void mo99313W1(int i) throws IOException {
        mo99285C1(i);
    }

    /* renamed from: X */
    public abstract void mo99314X(byte[] bArr, int i, int i2) throws IOException;

    @Deprecated
    /* renamed from: X1 */
    public final void mo99315X1(long j) throws IOException {
        mo99286D1(j);
    }

    /* renamed from: Y1 */
    public abstract void mo99316Y1(int i, ByteString byteString) throws IOException;

    /* renamed from: Z */
    public final void mo99317Z() {
        if (mo99340r1() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    /* renamed from: Z1 */
    public final void mo99318Z1(int i) throws IOException {
        mo99333h2(i);
    }

    @Deprecated
    /* renamed from: a2 */
    public final void mo99319a2(long j) throws IOException {
        mo99335i2(j);
    }

    /* renamed from: b2 */
    public final void mo99320b2(int i) throws IOException {
        mo99285C1(i);
    }

    /* renamed from: c */
    public abstract void mo99321c(int i, int i2) throws IOException;

    /* renamed from: c2 */
    public final void mo99322c2(long j) throws IOException {
        mo99286D1(j);
    }

    /* renamed from: d2 */
    public final void mo99323d2(int i) throws IOException {
        mo99333h2(m137375c1(i));
    }

    /* renamed from: e1 */
    public abstract void mo99324e1() throws IOException;

    /* renamed from: e2 */
    public final void mo99325e2(long j) throws IOException {
        mo99335i2(m137377d1(j));
    }

    /* renamed from: f */
    public abstract void mo99326f(int i, String str) throws IOException;

    /* renamed from: f1 */
    public abstract int mo99327f1();

    /* renamed from: f2 */
    public abstract void mo99328f2(String str) throws IOException;

    /* renamed from: g */
    public abstract void mo99329g(int i, long j) throws IOException;

    /* renamed from: g1 */
    public final void mo99330g1(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f82801c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", unpairedSurrogateException);
        byte[] bytes = str.getBytes(C34471v0.f83529a);
        try {
            mo99333h2(bytes.length);
            mo99314X(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException((Throwable) e);
        } catch (OutOfSpaceException e2) {
            throw e2;
        }
    }

    /* renamed from: g2 */
    public abstract void mo99331g2(int i, int i2) throws IOException;

    /* renamed from: h1 */
    public boolean mo99332h1() {
        return this.f82806b;
    }

    /* renamed from: h2 */
    public abstract void mo99333h2(int i) throws IOException;

    /* renamed from: i */
    public abstract void mo99334i(int i, int i2) throws IOException;

    /* renamed from: i2 */
    public abstract void mo99335i2(long j) throws IOException;

    /* renamed from: j */
    public final void mo99336j(int i, long j) throws IOException {
        mo99342t(i, j);
    }

    /* renamed from: n */
    public final void mo99337n(int i, long j) throws IOException {
        mo99329g(i, m137377d1(j));
    }

    /* renamed from: p */
    public abstract void mo99338p(int i, int i2) throws IOException;

    /* renamed from: q */
    public final void mo99339q(int i, double d) throws IOException {
        mo99342t(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r1 */
    public abstract int mo99340r1();

    /* renamed from: s1 */
    public void mo99341s1() {
        this.f82806b = true;
    }

    /* renamed from: t */
    public abstract void mo99342t(int i, long j) throws IOException;

    /* renamed from: t1 */
    public final void mo99343t1(boolean z) throws IOException {
        mo99306T(z ? (byte) 1 : 0);
    }

    /* renamed from: u1 */
    public abstract void mo99344u1(int i, byte[] bArr) throws IOException;

    /* renamed from: v1 */
    public abstract void mo99345v1(int i, byte[] bArr, int i2, int i3) throws IOException;

    /* renamed from: w1 */
    public final void mo99346w1(byte[] bArr) throws IOException {
        mo99348x1(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public final void mo99347x(int i, long j) throws IOException {
        mo99329g(i, j);
    }

    /* renamed from: x1 */
    public abstract void mo99348x1(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: y */
    public abstract void mo99349y(int i, boolean z) throws IOException;

    /* renamed from: y1 */
    public abstract void mo99350y1(int i, ByteBuffer byteBuffer) throws IOException;

    /* renamed from: z */
    public final void mo99351z(int i, int i2) throws IOException {
        mo99321c(i, i2);
    }

    /* renamed from: z1 */
    public abstract void mo99352z1(ByteString byteString) throws IOException;

    public CodedOutputStream() {
    }
}
