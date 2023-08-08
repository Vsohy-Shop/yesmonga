package com.google.protobuf;

import com.contentsquare.android.api.C14092c;
import com.google.protobuf.C34363f1;
import com.google.protobuf.C34471v0;
import com.google.protobuf.Utf8;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import com.urbanairship.push.notifications.C9527p;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: com.google.protobuf.l */
public abstract class C34405l extends C34437q implements Writer {

    /* renamed from: e */
    public static final int f83355e = 4096;

    /* renamed from: f */
    public static final int f83356f = 1;

    /* renamed from: g */
    public static final int f83357g = 2;

    /* renamed from: a */
    public final C34423o f83358a;

    /* renamed from: b */
    public final int f83359b;

    /* renamed from: c */
    public final ArrayDeque<C34347d> f83360c;

    /* renamed from: d */
    public int f83361d;

    /* renamed from: com.google.protobuf.l$a */
    public static /* synthetic */ class C34406a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83362a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f83362a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f83362a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34405l.C34406a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.l$b */
    public static final class C34407b extends C34405l {

        /* renamed from: h */
        public ByteBuffer f83363h;

        /* renamed from: i */
        public int f83364i;

        /* renamed from: j */
        public int f83365j;

        public C34407b(C34423o oVar, int i) {
            super(oVar, i, (C34406a) null);
            mo101280Z0();
        }

        /* renamed from: A */
        public void mo100787A(int i) {
            mo101256R0(i, 3);
        }

        /* renamed from: A0 */
        public void mo101240A0(long j) {
            int i = this.f83365j - 8;
            this.f83365j = i;
            this.f83363h.putLong(i + 1, j);
        }

        /* renamed from: E */
        public void mo100791E(int i, Object obj) throws IOException {
            mo101256R0(i, 4);
            C34325a2.m138828a().mo100883k(obj, this);
            mo101256R0(i, 3);
        }

        /* renamed from: F0 */
        public void mo101245F0(int i) {
            if (i >= 0) {
                mo101261W0(i);
            } else {
                mo101262X0((long) i);
            }
        }

        /* renamed from: G */
        public void mo100793G(int i) {
            mo101256R0(i, 4);
        }

        /* renamed from: K0 */
        public void mo101249K0(int i) {
            mo101261W0(CodedOutputStream.m137375c1(i));
        }

        /* renamed from: L */
        public void mo100798L(int i, int i2) {
            mo101270r0(10);
            mo101249K0(i2);
            mo101256R0(i, 0);
        }

        /* renamed from: N0 */
        public void mo101252N0(long j) {
            mo101262X0(CodedOutputStream.m137377d1(j));
        }

        /* renamed from: O */
        public void mo100801O(int i, Object obj, C34372g2 g2Var) throws IOException {
            mo101256R0(i, 4);
            g2Var.mo101121h(obj, this);
            mo101256R0(i, 3);
        }

        /* renamed from: P */
        public void mo100802P(int i, ByteString byteString) {
            try {
                byteString.mo99234e1(this);
                mo101270r0(10);
                mo101261W0(byteString.size());
                mo101256R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: Q0 */
        public void mo101255Q0(String str) {
            int i;
            int i2;
            int i3;
            char charAt;
            mo101270r0(str.length());
            int length = str.length() - 1;
            this.f83365j -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f83363h.put(this.f83365j + length, (byte) charAt);
                length--;
            }
            if (length == -1) {
                this.f83365j--;
                return;
            }
            this.f83365j += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i3 = this.f83365j) >= 0) {
                    ByteBuffer byteBuffer = this.f83363h;
                    this.f83365j = i3 - 1;
                    byteBuffer.put(i3, (byte) charAt2);
                } else if (charAt2 < 2048 && (i2 = this.f83365j) > 0) {
                    ByteBuffer byteBuffer2 = this.f83363h;
                    this.f83365j = i2 - 1;
                    byteBuffer2.put(i2, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.f83363h;
                    int i4 = this.f83365j;
                    this.f83365j = i4 - 1;
                    byteBuffer3.put(i4, (byte) ((charAt2 >>> 6) | C14092c.f34671x0));
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i = this.f83365j) > 1) {
                    ByteBuffer byteBuffer4 = this.f83363h;
                    this.f83365j = i - 1;
                    byteBuffer4.put(i, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.f83363h;
                    int i5 = this.f83365j;
                    this.f83365j = i5 - 1;
                    byteBuffer5.put(i5, (byte) (((charAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.f83363h;
                    int i6 = this.f83365j;
                    this.f83365j = i6 - 1;
                    byteBuffer6.put(i6, (byte) ((charAt2 >>> 12) | C14092c.f34573Y0));
                } else if (this.f83365j > 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            ByteBuffer byteBuffer7 = this.f83363h;
                            int i7 = this.f83365j;
                            this.f83365j = i7 - 1;
                            byteBuffer7.put(i7, (byte) ((codePoint & 63) | 128));
                            ByteBuffer byteBuffer8 = this.f83363h;
                            int i8 = this.f83365j;
                            this.f83365j = i8 - 1;
                            byteBuffer8.put(i8, (byte) (((codePoint >>> 6) & 63) | 128));
                            ByteBuffer byteBuffer9 = this.f83363h;
                            int i9 = this.f83365j;
                            this.f83365j = i9 - 1;
                            byteBuffer9.put(i9, (byte) (((codePoint >>> 12) & 63) | 128));
                            ByteBuffer byteBuffer10 = this.f83363h;
                            int i10 = this.f83365j;
                            this.f83365j = i10 - 1;
                            byteBuffer10.put(i10, (byte) ((codePoint >>> 18) | C9527p.f26031b));
                        }
                    }
                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                } else {
                    mo101270r0(length);
                    length++;
                }
                length--;
            }
        }

        /* renamed from: R */
        public void mo100804R(int i, Object obj, C34372g2 g2Var) throws IOException {
            int c0 = mo101265c0();
            g2Var.mo101121h(obj, this);
            mo101270r0(10);
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
        }

        /* renamed from: R0 */
        public void mo101256R0(int i, int i2) {
            mo101261W0(WireFormat.m138723c(i, i2));
        }

        /* renamed from: T */
        public void mo99306T(byte b) {
            ByteBuffer byteBuffer = this.f83363h;
            int i = this.f83365j;
            this.f83365j = i - 1;
            byteBuffer.put(i, b);
        }

        /* renamed from: U */
        public void mo99308U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo101283c1() < remaining) {
                mo101281a1(remaining);
            }
            int i = this.f83365j - remaining;
            this.f83365j = i;
            this.f83363h.position(i + 1);
            this.f83363h.put(byteBuffer);
        }

        /* renamed from: V */
        public void mo99310V(byte[] bArr, int i, int i2) {
            if (mo101283c1() < i2) {
                mo101281a1(i2);
            }
            int i3 = this.f83365j - i2;
            this.f83365j = i3;
            this.f83363h.position(i3 + 1);
            this.f83363h.put(bArr, i, i2);
        }

        /* renamed from: W */
        public void mo99312W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo101283c1() < remaining) {
                this.f83361d += remaining;
                this.f83360c.addFirst(C34347d.m139111j(byteBuffer));
                mo101280Z0();
                return;
            }
            int i = this.f83365j - remaining;
            this.f83365j = i;
            this.f83363h.position(i + 1);
            this.f83363h.put(byteBuffer);
        }

        /* renamed from: W0 */
        public void mo101261W0(int i) {
            if ((i & -128) == 0) {
                mo101286f1(i);
            } else if ((i & -16384) == 0) {
                mo101288h1(i);
            } else if ((-2097152 & i) == 0) {
                mo101287g1(i);
            } else if ((-268435456 & i) == 0) {
                mo101285e1(i);
            } else {
                mo101284d1(i);
            }
        }

        /* renamed from: X */
        public void mo99314X(byte[] bArr, int i, int i2) {
            if (mo101283c1() < i2) {
                this.f83361d += i2;
                this.f83360c.addFirst(C34347d.m139113l(bArr, i, i2));
                mo101280Z0();
                return;
            }
            int i3 = this.f83365j - i2;
            this.f83365j = i3;
            this.f83363h.position(i3 + 1);
            this.f83363h.put(bArr, i, i2);
        }

        /* renamed from: X0 */
        public void mo101262X0(long j) {
            switch (C34405l.m139580a0(j)) {
                case 1:
                    mo101294n1(j);
                    return;
                case 2:
                    mo101299s1(j);
                    return;
                case 3:
                    mo101298r1(j);
                    return;
                case 4:
                    mo101292l1(j);
                    return;
                case 5:
                    mo101291k1(j);
                    return;
                case 6:
                    mo101296p1(j);
                    return;
                case 7:
                    mo101295o1(j);
                    return;
                case 8:
                    mo101289i1(j);
                    return;
                case 9:
                    mo101293m1(j);
                    return;
                case 10:
                    mo101297q1(j);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: Y0 */
        public final int mo101279Y0() {
            return this.f83364i - this.f83365j;
        }

        /* renamed from: Z0 */
        public final void mo101280Z0() {
            mo101282b1(mo101266f0());
        }

        /* renamed from: a1 */
        public final void mo101281a1(int i) {
            mo101282b1(mo101267g0(i));
        }

        /* renamed from: b0 */
        public void mo101264b0() {
            if (this.f83363h != null) {
                this.f83361d += mo101279Y0();
                this.f83363h.position(this.f83365j + 1);
                this.f83363h = null;
                this.f83365j = 0;
                this.f83364i = 0;
            }
        }

        /* renamed from: b1 */
        public final void mo101282b1(C34347d dVar) {
            if (dVar.mo101014d()) {
                ByteBuffer f = dVar.mo101016f();
                if (f.isDirect()) {
                    mo101264b0();
                    this.f83360c.addFirst(dVar);
                    this.f83363h = f;
                    f.limit(f.capacity());
                    this.f83363h.position(0);
                    this.f83363h.order(ByteOrder.LITTLE_ENDIAN);
                    int limit = this.f83363h.limit() - 1;
                    this.f83364i = limit;
                    this.f83365j = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        /* renamed from: c */
        public void mo100808c(int i, int i2) {
            mo101270r0(9);
            mo101276x0(i2);
            mo101256R0(i, 5);
        }

        /* renamed from: c0 */
        public int mo101265c0() {
            return this.f83361d + mo101279Y0();
        }

        /* renamed from: c1 */
        public final int mo101283c1() {
            return this.f83365j + 1;
        }

        /* renamed from: d1 */
        public final void mo101284d1(int i) {
            ByteBuffer byteBuffer = this.f83363h;
            int i2 = this.f83365j;
            this.f83365j = i2 - 1;
            byteBuffer.put(i2, (byte) (i >>> 28));
            int i3 = this.f83365j - 4;
            this.f83365j = i3;
            this.f83363h.putInt(i3 + 1, (i & 127) | 128 | ((((i >>> 21) & 127) | 128) << 24) | ((((i >>> 14) & 127) | 128) << 16) | ((((i >>> 7) & 127) | 128) << 8));
        }

        /* renamed from: e1 */
        public final void mo101285e1(int i) {
            int i2 = this.f83365j - 4;
            this.f83365j = i2;
            this.f83363h.putInt(i2 + 1, (i & 127) | 128 | ((266338304 & i) << 3) | (((2080768 & i) | 2097152) << 2) | (((i & 16256) | 16384) << 1));
        }

        /* renamed from: f */
        public void mo100811f(int i, String str) {
            int c0 = mo101265c0();
            mo101255Q0(str);
            mo101270r0(10);
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
        }

        /* renamed from: f1 */
        public final void mo101286f1(int i) {
            ByteBuffer byteBuffer = this.f83363h;
            int i2 = this.f83365j;
            this.f83365j = i2 - 1;
            byteBuffer.put(i2, (byte) i);
        }

        /* renamed from: g */
        public void mo100812g(int i, long j) {
            mo101270r0(15);
            mo101262X0(j);
            mo101256R0(i, 0);
        }

        /* renamed from: g1 */
        public final void mo101287g1(int i) {
            int i2 = this.f83365j - 3;
            this.f83365j = i2;
            this.f83363h.putInt(i2, (((i & 127) | 128) << 8) | ((2080768 & i) << 10) | (((i & 16256) | 16384) << 9));
        }

        /* renamed from: h1 */
        public final void mo101288h1(int i) {
            int i2 = this.f83365j - 2;
            this.f83365j = i2;
            this.f83363h.putShort(i2 + 1, (short) ((i & 127) | 128 | ((i & 16256) << 1)));
        }

        /* renamed from: i */
        public void mo100814i(int i, int i2) {
            mo101270r0(15);
            mo101245F0(i2);
            mo101256R0(i, 0);
        }

        /* renamed from: i1 */
        public final void mo101289i1(long j) {
            int i = this.f83365j - 8;
            this.f83365j = i;
            this.f83363h.putLong(i + 1, (j & 127) | 128 | ((71494644084506624L & j) << 7) | (((558551906910208L & j) | 562949953421312L) << 6) | (((4363686772736L & j) | 4398046511104L) << 5) | (((34091302912L & j) | 34359738368L) << 4) | (((266338304 & j) | 268435456) << 3) | (((2080768 & j) | 2097152) << 2) | (((16256 & j) | 16384) << 1));
        }

        /* renamed from: j1 */
        public final void mo101290j1(long j) {
            int i = this.f83365j - 8;
            this.f83365j = i;
            this.f83363h.putLong(i + 1, (j & 127) | 128 | (((71494644084506624L & j) | 72057594037927936L) << 7) | (((558551906910208L & j) | 562949953421312L) << 6) | (((4363686772736L & j) | 4398046511104L) << 5) | (((34091302912L & j) | 34359738368L) << 4) | (((266338304 & j) | 268435456) << 3) | (((2080768 & j) | 2097152) << 2) | (((16256 & j) | 16384) << 1));
        }

        /* renamed from: k1 */
        public final void mo101291k1(long j) {
            int i = this.f83365j - 5;
            this.f83365j = i;
            this.f83363h.putLong(i - 2, (((j & 127) | 128) << 24) | ((34091302912L & j) << 28) | (((266338304 & j) | 268435456) << 27) | (((2080768 & j) | 2097152) << 26) | (((16256 & j) | 16384) << 25));
        }

        /* renamed from: l1 */
        public final void mo101292l1(long j) {
            mo101285e1((int) j);
        }

        /* renamed from: m1 */
        public final void mo101293m1(long j) {
            ByteBuffer byteBuffer = this.f83363h;
            int i = this.f83365j;
            this.f83365j = i - 1;
            byteBuffer.put(i, (byte) ((int) (j >>> 56)));
            mo101290j1(j & 72057594037927935L);
        }

        /* renamed from: n */
        public void mo100819n(int i, long j) {
            mo101270r0(15);
            mo101252N0(j);
            mo101256R0(i, 0);
        }

        /* renamed from: n1 */
        public final void mo101294n1(long j) {
            mo101286f1((int) j);
        }

        /* renamed from: o1 */
        public final void mo101295o1(long j) {
            int i = this.f83365j - 7;
            this.f83365j = i;
            this.f83363h.putLong(i, (((j & 127) | 128) << 8) | ((558551906910208L & j) << 14) | (((4363686772736L & j) | 4398046511104L) << 13) | (((34091302912L & j) | 34359738368L) << 12) | (((266338304 & j) | 268435456) << 11) | (((2080768 & j) | 2097152) << 10) | (((16256 & j) | 16384) << 9));
        }

        /* renamed from: p */
        public void mo100821p(int i, int i2) {
            mo101270r0(10);
            mo101261W0(i2);
            mo101256R0(i, 0);
        }

        /* renamed from: p1 */
        public final void mo101296p1(long j) {
            int i = this.f83365j - 6;
            this.f83365j = i;
            this.f83363h.putLong(i - 1, (((j & 127) | 128) << 16) | ((4363686772736L & j) << 21) | (((34091302912L & j) | 34359738368L) << 20) | (((266338304 & j) | 268435456) << 19) | (((2080768 & j) | 2097152) << 18) | (((16256 & j) | 16384) << 17));
        }

        /* renamed from: q1 */
        public final void mo101297q1(long j) {
            ByteBuffer byteBuffer = this.f83363h;
            int i = this.f83365j;
            this.f83365j = i - 1;
            byteBuffer.put(i, (byte) ((int) (j >>> 63)));
            ByteBuffer byteBuffer2 = this.f83363h;
            int i2 = this.f83365j;
            this.f83365j = i2 - 1;
            byteBuffer2.put(i2, (byte) ((int) (((j >>> 56) & 127) | 128)));
            mo101290j1(j & 72057594037927935L);
        }

        /* renamed from: r0 */
        public void mo101270r0(int i) {
            if (mo101283c1() < i) {
                mo101281a1(i);
            }
        }

        /* renamed from: r1 */
        public final void mo101298r1(long j) {
            mo101287g1((int) j);
        }

        /* renamed from: s0 */
        public void mo101271s0(boolean z) {
            mo99306T(z ? (byte) 1 : 0);
        }

        /* renamed from: s1 */
        public final void mo101299s1(long j) {
            mo101288h1((int) j);
        }

        /* renamed from: t */
        public void mo100825t(int i, long j) {
            mo101270r0(13);
            mo101240A0(j);
            mo101256R0(i, 1);
        }

        /* renamed from: w */
        public void mo100828w(int i, Object obj) throws IOException {
            int c0 = mo101265c0();
            C34325a2.m138828a().mo100883k(obj, this);
            mo101270r0(10);
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
        }

        /* renamed from: x0 */
        public void mo101276x0(int i) {
            int i2 = this.f83365j - 4;
            this.f83365j = i2;
            this.f83363h.putInt(i2 + 1, i);
        }

        /* renamed from: y */
        public void mo100830y(int i, boolean z) {
            mo101270r0(6);
            mo99306T(z ? (byte) 1 : 0);
            mo101256R0(i, 0);
        }
    }

    /* renamed from: com.google.protobuf.l$c */
    public static final class C34408c extends C34405l {

        /* renamed from: h */
        public C34347d f83366h;

        /* renamed from: i */
        public byte[] f83367i;

        /* renamed from: j */
        public int f83368j;

        /* renamed from: k */
        public int f83369k;

        /* renamed from: l */
        public int f83370l;

        /* renamed from: m */
        public int f83371m;

        /* renamed from: n */
        public int f83372n;

        public C34408c(C34423o oVar, int i) {
            super(oVar, i, (C34406a) null);
            mo101301Z0();
        }

        /* renamed from: A */
        public void mo100787A(int i) {
            mo101256R0(i, 3);
        }

        /* renamed from: A0 */
        public void mo101240A0(long j) {
            byte[] bArr = this.f83367i;
            int i = this.f83372n;
            int i2 = i - 1;
            bArr[i] = (byte) (((int) (j >> 56)) & 255);
            int i3 = i2 - 1;
            bArr[i2] = (byte) (((int) (j >> 48)) & 255);
            int i4 = i3 - 1;
            bArr[i3] = (byte) (((int) (j >> 40)) & 255);
            int i5 = i4 - 1;
            bArr[i4] = (byte) (((int) (j >> 32)) & 255);
            int i6 = i5 - 1;
            bArr[i5] = (byte) (((int) (j >> 24)) & 255);
            int i7 = i6 - 1;
            bArr[i6] = (byte) (((int) (j >> 16)) & 255);
            int i8 = i7 - 1;
            bArr[i7] = (byte) (((int) (j >> 8)) & 255);
            this.f83372n = i8 - 1;
            bArr[i8] = (byte) (((int) j) & 255);
        }

        /* renamed from: E */
        public void mo100791E(int i, Object obj) throws IOException {
            mo101256R0(i, 4);
            C34325a2.m138828a().mo100883k(obj, this);
            mo101256R0(i, 3);
        }

        /* renamed from: F0 */
        public void mo101245F0(int i) {
            if (i >= 0) {
                mo101261W0(i);
            } else {
                mo101262X0((long) i);
            }
        }

        /* renamed from: G */
        public void mo100793G(int i) {
            mo101256R0(i, 4);
        }

        /* renamed from: K0 */
        public void mo101249K0(int i) {
            mo101261W0(CodedOutputStream.m137375c1(i));
        }

        /* renamed from: L */
        public void mo100798L(int i, int i2) throws IOException {
            mo101270r0(10);
            mo101249K0(i2);
            mo101256R0(i, 0);
        }

        /* renamed from: N0 */
        public void mo101252N0(long j) {
            mo101262X0(CodedOutputStream.m137377d1(j));
        }

        /* renamed from: O */
        public void mo100801O(int i, Object obj, C34372g2 g2Var) throws IOException {
            mo101256R0(i, 4);
            g2Var.mo101121h(obj, this);
            mo101256R0(i, 3);
        }

        /* renamed from: P */
        public void mo100802P(int i, ByteString byteString) throws IOException {
            try {
                byteString.mo99234e1(this);
                mo101270r0(10);
                mo101261W0(byteString.size());
                mo101256R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: Q0 */
        public void mo101255Q0(String str) {
            int i;
            int i2;
            int i3;
            char charAt;
            mo101270r0(str.length());
            int length = str.length() - 1;
            this.f83372n -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f83367i[this.f83372n + length] = (byte) charAt;
                length--;
            }
            if (length == -1) {
                this.f83372n--;
                return;
            }
            this.f83372n += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i3 = this.f83372n) > this.f83370l) {
                    byte[] bArr = this.f83367i;
                    this.f83372n = i3 - 1;
                    bArr[i3] = (byte) charAt2;
                } else if (charAt2 < 2048 && (i2 = this.f83372n) > this.f83368j) {
                    byte[] bArr2 = this.f83367i;
                    int i4 = i2 - 1;
                    bArr2[i2] = (byte) ((charAt2 & '?') | 128);
                    this.f83372n = i4 - 1;
                    bArr2[i4] = (byte) ((charAt2 >>> 6) | C14092c.f34671x0);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i = this.f83372n) > this.f83368j + 1) {
                    byte[] bArr3 = this.f83367i;
                    int i5 = i - 1;
                    bArr3[i] = (byte) ((charAt2 & '?') | 128);
                    int i6 = i5 - 1;
                    bArr3[i5] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    this.f83372n = i6 - 1;
                    bArr3[i6] = (byte) ((charAt2 >>> 12) | C14092c.f34573Y0);
                } else if (this.f83372n > this.f83368j + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            byte[] bArr4 = this.f83367i;
                            int i7 = this.f83372n;
                            int i8 = i7 - 1;
                            bArr4[i7] = (byte) ((codePoint & 63) | 128);
                            int i9 = i8 - 1;
                            bArr4[i8] = (byte) (((codePoint >>> 6) & 63) | 128);
                            int i10 = i9 - 1;
                            bArr4[i9] = (byte) (((codePoint >>> 12) & 63) | 128);
                            this.f83372n = i10 - 1;
                            bArr4[i10] = (byte) ((codePoint >>> 18) | C9527p.f26031b);
                        }
                    }
                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                } else {
                    mo101270r0(length);
                    length++;
                }
                length--;
            }
        }

        /* renamed from: R */
        public void mo100804R(int i, Object obj, C34372g2 g2Var) throws IOException {
            int c0 = mo101265c0();
            g2Var.mo101121h(obj, this);
            mo101270r0(10);
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
        }

        /* renamed from: R0 */
        public void mo101256R0(int i, int i2) {
            mo101261W0(WireFormat.m138723c(i, i2));
        }

        /* renamed from: T */
        public void mo99306T(byte b) {
            byte[] bArr = this.f83367i;
            int i = this.f83372n;
            this.f83372n = i - 1;
            bArr[i] = b;
        }

        /* renamed from: U */
        public void mo99308U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo101304c1() < remaining) {
                mo101302a1(remaining);
            }
            int i = this.f83372n - remaining;
            this.f83372n = i;
            byteBuffer.get(this.f83367i, i + 1, remaining);
        }

        /* renamed from: V */
        public void mo99310V(byte[] bArr, int i, int i2) {
            if (mo101304c1() < i2) {
                mo101302a1(i2);
            }
            int i3 = this.f83372n - i2;
            this.f83372n = i3;
            System.arraycopy(bArr, i, this.f83367i, i3 + 1, i2);
        }

        /* renamed from: W */
        public void mo99312W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo101304c1() < remaining) {
                this.f83361d += remaining;
                this.f83360c.addFirst(C34347d.m139111j(byteBuffer));
                mo101301Z0();
            }
            int i = this.f83372n - remaining;
            this.f83372n = i;
            byteBuffer.get(this.f83367i, i + 1, remaining);
        }

        /* renamed from: W0 */
        public void mo101261W0(int i) {
            if ((i & -128) == 0) {
                mo101307f1(i);
            } else if ((i & -16384) == 0) {
                mo101309h1(i);
            } else if ((-2097152 & i) == 0) {
                mo101308g1(i);
            } else if ((-268435456 & i) == 0) {
                mo101306e1(i);
            } else {
                mo101305d1(i);
            }
        }

        /* renamed from: X */
        public void mo99314X(byte[] bArr, int i, int i2) {
            if (mo101304c1() < i2) {
                this.f83361d += i2;
                this.f83360c.addFirst(C34347d.m139113l(bArr, i, i2));
                mo101301Z0();
                return;
            }
            int i3 = this.f83372n - i2;
            this.f83372n = i3;
            System.arraycopy(bArr, i, this.f83367i, i3 + 1, i2);
        }

        /* renamed from: X0 */
        public void mo101262X0(long j) {
            switch (C34405l.m139580a0(j)) {
                case 1:
                    mo101314m1(j);
                    return;
                case 2:
                    mo101319r1(j);
                    return;
                case 3:
                    mo101318q1(j);
                    return;
                case 4:
                    mo101312k1(j);
                    return;
                case 5:
                    mo101311j1(j);
                    return;
                case 6:
                    mo101316o1(j);
                    return;
                case 7:
                    mo101315n1(j);
                    return;
                case 8:
                    mo101310i1(j);
                    return;
                case 9:
                    mo101313l1(j);
                    return;
                case 10:
                    mo101317p1(j);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: Y0 */
        public int mo101300Y0() {
            return this.f83371m - this.f83372n;
        }

        /* renamed from: Z0 */
        public final void mo101301Z0() {
            mo101303b1(mo101268j0());
        }

        /* renamed from: a1 */
        public final void mo101302a1(int i) {
            mo101303b1(mo101269k0(i));
        }

        /* renamed from: b0 */
        public void mo101264b0() {
            if (this.f83366h != null) {
                this.f83361d += mo101300Y0();
                C34347d dVar = this.f83366h;
                dVar.mo101018h((this.f83372n - dVar.mo101012b()) + 1);
                this.f83366h = null;
                this.f83372n = 0;
                this.f83371m = 0;
            }
        }

        /* renamed from: b1 */
        public final void mo101303b1(C34347d dVar) {
            if (dVar.mo101013c()) {
                mo101264b0();
                this.f83360c.addFirst(dVar);
                this.f83366h = dVar;
                this.f83367i = dVar.mo101011a();
                int b = dVar.mo101012b();
                this.f83369k = dVar.mo101015e() + b;
                int g = b + dVar.mo101017g();
                this.f83368j = g;
                this.f83370l = g - 1;
                int i = this.f83369k - 1;
                this.f83371m = i;
                this.f83372n = i;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        /* renamed from: c */
        public void mo100808c(int i, int i2) throws IOException {
            mo101270r0(9);
            mo101276x0(i2);
            mo101256R0(i, 5);
        }

        /* renamed from: c0 */
        public int mo101265c0() {
            return this.f83361d + mo101300Y0();
        }

        /* renamed from: c1 */
        public int mo101304c1() {
            return this.f83372n - this.f83370l;
        }

        /* renamed from: d1 */
        public final void mo101305d1(int i) {
            byte[] bArr = this.f83367i;
            int i2 = this.f83372n;
            int i3 = i2 - 1;
            bArr[i2] = (byte) (i >>> 28);
            int i4 = i3 - 1;
            bArr[i3] = (byte) (((i >>> 21) & 127) | 128);
            int i5 = i4 - 1;
            bArr[i4] = (byte) (((i >>> 14) & 127) | 128);
            int i6 = i5 - 1;
            bArr[i5] = (byte) (((i >>> 7) & 127) | 128);
            this.f83372n = i6 - 1;
            bArr[i6] = (byte) ((i & 127) | 128);
        }

        /* renamed from: e1 */
        public final void mo101306e1(int i) {
            byte[] bArr = this.f83367i;
            int i2 = this.f83372n;
            int i3 = i2 - 1;
            bArr[i2] = (byte) (i >>> 21);
            int i4 = i3 - 1;
            bArr[i3] = (byte) (((i >>> 14) & 127) | 128);
            int i5 = i4 - 1;
            bArr[i4] = (byte) (((i >>> 7) & 127) | 128);
            this.f83372n = i5 - 1;
            bArr[i5] = (byte) ((i & 127) | 128);
        }

        /* renamed from: f */
        public void mo100811f(int i, String str) throws IOException {
            int c0 = mo101265c0();
            mo101255Q0(str);
            mo101270r0(10);
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
        }

        /* renamed from: f1 */
        public final void mo101307f1(int i) {
            byte[] bArr = this.f83367i;
            int i2 = this.f83372n;
            this.f83372n = i2 - 1;
            bArr[i2] = (byte) i;
        }

        /* renamed from: g */
        public void mo100812g(int i, long j) throws IOException {
            mo101270r0(15);
            mo101262X0(j);
            mo101256R0(i, 0);
        }

        /* renamed from: g1 */
        public final void mo101308g1(int i) {
            byte[] bArr = this.f83367i;
            int i2 = this.f83372n;
            int i3 = i2 - 1;
            bArr[i2] = (byte) (i >>> 14);
            int i4 = i3 - 1;
            bArr[i3] = (byte) (((i >>> 7) & 127) | 128);
            this.f83372n = i4 - 1;
            bArr[i4] = (byte) ((i & 127) | 128);
        }

        /* renamed from: h1 */
        public final void mo101309h1(int i) {
            byte[] bArr = this.f83367i;
            int i2 = this.f83372n;
            int i3 = i2 - 1;
            bArr[i2] = (byte) (i >>> 7);
            this.f83372n = i3 - 1;
            bArr[i3] = (byte) ((i & 127) | 128);
        }

        /* renamed from: i */
        public void mo100814i(int i, int i2) throws IOException {
            mo101270r0(15);
            mo101245F0(i2);
            mo101256R0(i, 0);
        }

        /* renamed from: i1 */
        public final void mo101310i1(long j) {
            byte[] bArr = this.f83367i;
            int i = this.f83372n;
            int i2 = i - 1;
            bArr[i] = (byte) ((int) (j >>> 49));
            int i3 = i2 - 1;
            bArr[i2] = (byte) ((int) (((j >>> 42) & 127) | 128));
            int i4 = i3 - 1;
            bArr[i3] = (byte) ((int) (((j >>> 35) & 127) | 128));
            int i5 = i4 - 1;
            bArr[i4] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i6 = i5 - 1;
            bArr[i5] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i7 = i6 - 1;
            bArr[i6] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i8 = i7 - 1;
            bArr[i7] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f83372n = i8 - 1;
            bArr[i8] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: j1 */
        public final void mo101311j1(long j) {
            byte[] bArr = this.f83367i;
            int i = this.f83372n;
            int i2 = i - 1;
            bArr[i] = (byte) ((int) (j >>> 28));
            int i3 = i2 - 1;
            bArr[i2] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i4 = i3 - 1;
            bArr[i3] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i5 = i4 - 1;
            bArr[i4] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f83372n = i5 - 1;
            bArr[i5] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: k1 */
        public final void mo101312k1(long j) {
            byte[] bArr = this.f83367i;
            int i = this.f83372n;
            int i2 = i - 1;
            bArr[i] = (byte) ((int) (j >>> 21));
            int i3 = i2 - 1;
            bArr[i2] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i4 = i3 - 1;
            bArr[i3] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f83372n = i4 - 1;
            bArr[i4] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: l1 */
        public final void mo101313l1(long j) {
            byte[] bArr = this.f83367i;
            int i = this.f83372n;
            int i2 = i - 1;
            bArr[i] = (byte) ((int) (j >>> 56));
            int i3 = i2 - 1;
            bArr[i2] = (byte) ((int) (((j >>> 49) & 127) | 128));
            int i4 = i3 - 1;
            bArr[i3] = (byte) ((int) (((j >>> 42) & 127) | 128));
            int i5 = i4 - 1;
            bArr[i4] = (byte) ((int) (((j >>> 35) & 127) | 128));
            int i6 = i5 - 1;
            bArr[i5] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i7 = i6 - 1;
            bArr[i6] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i8 = i7 - 1;
            bArr[i7] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i9 = i8 - 1;
            bArr[i8] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f83372n = i9 - 1;
            bArr[i9] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: m1 */
        public final void mo101314m1(long j) {
            byte[] bArr = this.f83367i;
            int i = this.f83372n;
            this.f83372n = i - 1;
            bArr[i] = (byte) ((int) j);
        }

        /* renamed from: n */
        public void mo100819n(int i, long j) throws IOException {
            mo101270r0(15);
            mo101252N0(j);
            mo101256R0(i, 0);
        }

        /* renamed from: n1 */
        public final void mo101315n1(long j) {
            byte[] bArr = this.f83367i;
            int i = this.f83372n;
            int i2 = i - 1;
            bArr[i] = (byte) ((int) (j >>> 42));
            int i3 = i2 - 1;
            bArr[i2] = (byte) ((int) (((j >>> 35) & 127) | 128));
            int i4 = i3 - 1;
            bArr[i3] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i5 = i4 - 1;
            bArr[i4] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i6 = i5 - 1;
            bArr[i5] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i7 = i6 - 1;
            bArr[i6] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f83372n = i7 - 1;
            bArr[i7] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: o1 */
        public final void mo101316o1(long j) {
            byte[] bArr = this.f83367i;
            int i = this.f83372n;
            int i2 = i - 1;
            bArr[i] = (byte) ((int) (j >>> 35));
            int i3 = i2 - 1;
            bArr[i2] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i4 = i3 - 1;
            bArr[i3] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i5 = i4 - 1;
            bArr[i4] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i6 = i5 - 1;
            bArr[i5] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f83372n = i6 - 1;
            bArr[i6] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: p */
        public void mo100821p(int i, int i2) throws IOException {
            mo101270r0(10);
            mo101261W0(i2);
            mo101256R0(i, 0);
        }

        /* renamed from: p1 */
        public final void mo101317p1(long j) {
            byte[] bArr = this.f83367i;
            int i = this.f83372n;
            int i2 = i - 1;
            bArr[i] = (byte) ((int) (j >>> 63));
            int i3 = i2 - 1;
            bArr[i2] = (byte) ((int) (((j >>> 56) & 127) | 128));
            int i4 = i3 - 1;
            bArr[i3] = (byte) ((int) (((j >>> 49) & 127) | 128));
            int i5 = i4 - 1;
            bArr[i4] = (byte) ((int) (((j >>> 42) & 127) | 128));
            int i6 = i5 - 1;
            bArr[i5] = (byte) ((int) (((j >>> 35) & 127) | 128));
            int i7 = i6 - 1;
            bArr[i6] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i8 = i7 - 1;
            bArr[i7] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i9 = i8 - 1;
            bArr[i8] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i10 = i9 - 1;
            bArr[i9] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f83372n = i10 - 1;
            bArr[i10] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: q1 */
        public final void mo101318q1(long j) {
            byte[] bArr = this.f83367i;
            int i = this.f83372n;
            int i2 = i - 1;
            bArr[i] = (byte) (((int) j) >>> 14);
            int i3 = i2 - 1;
            bArr[i2] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f83372n = i3 - 1;
            bArr[i3] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: r0 */
        public void mo101270r0(int i) {
            if (mo101304c1() < i) {
                mo101302a1(i);
            }
        }

        /* renamed from: r1 */
        public final void mo101319r1(long j) {
            byte[] bArr = this.f83367i;
            int i = this.f83372n;
            int i2 = i - 1;
            bArr[i] = (byte) ((int) (j >>> 7));
            this.f83372n = i2 - 1;
            bArr[i2] = (byte) ((((int) j) & 127) | 128);
        }

        /* renamed from: s0 */
        public void mo101271s0(boolean z) {
            mo99306T(z ? (byte) 1 : 0);
        }

        /* renamed from: t */
        public void mo100825t(int i, long j) throws IOException {
            mo101270r0(13);
            mo101240A0(j);
            mo101256R0(i, 1);
        }

        /* renamed from: w */
        public void mo100828w(int i, Object obj) throws IOException {
            int c0 = mo101265c0();
            C34325a2.m138828a().mo100883k(obj, this);
            mo101270r0(10);
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
        }

        /* renamed from: x0 */
        public void mo101276x0(int i) {
            byte[] bArr = this.f83367i;
            int i2 = this.f83372n;
            int i3 = i2 - 1;
            bArr[i2] = (byte) ((i >> 24) & 255);
            int i4 = i3 - 1;
            bArr[i3] = (byte) ((i >> 16) & 255);
            int i5 = i4 - 1;
            bArr[i4] = (byte) ((i >> 8) & 255);
            this.f83372n = i5 - 1;
            bArr[i5] = (byte) (i & 255);
        }

        /* renamed from: y */
        public void mo100830y(int i, boolean z) throws IOException {
            mo101270r0(6);
            mo99306T(z ? (byte) 1 : 0);
            mo101256R0(i, 0);
        }
    }

    /* renamed from: com.google.protobuf.l$d */
    public static final class C34409d extends C34405l {

        /* renamed from: h */
        public ByteBuffer f83373h;

        /* renamed from: i */
        public long f83374i;

        /* renamed from: j */
        public long f83375j;

        /* renamed from: k */
        public long f83376k;

        public C34409d(C34423o oVar, int i) {
            super(oVar, i, (C34406a) null);
            mo101322c1();
        }

        /* renamed from: b1 */
        public static boolean m139769b1() {
            return C34341c3.m138972V();
        }

        /* renamed from: A */
        public void mo100787A(int i) {
            mo101256R0(i, 3);
        }

        /* renamed from: A0 */
        public void mo101240A0(long j) {
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) (((int) (j >> 56)) & 255));
            long j3 = this.f83376k;
            this.f83376k = j3 - 1;
            C34341c3.m138986e0(j3, (byte) (((int) (j >> 48)) & 255));
            long j4 = this.f83376k;
            this.f83376k = j4 - 1;
            C34341c3.m138986e0(j4, (byte) (((int) (j >> 40)) & 255));
            long j5 = this.f83376k;
            this.f83376k = j5 - 1;
            C34341c3.m138986e0(j5, (byte) (((int) (j >> 32)) & 255));
            long j6 = this.f83376k;
            this.f83376k = j6 - 1;
            C34341c3.m138986e0(j6, (byte) (((int) (j >> 24)) & 255));
            long j7 = this.f83376k;
            this.f83376k = j7 - 1;
            C34341c3.m138986e0(j7, (byte) (((int) (j >> 16)) & 255));
            long j8 = this.f83376k;
            this.f83376k = j8 - 1;
            C34341c3.m138986e0(j8, (byte) (((int) (j >> 8)) & 255));
            long j9 = this.f83376k;
            this.f83376k = j9 - 1;
            C34341c3.m138986e0(j9, (byte) (((int) j) & 255));
        }

        /* renamed from: E */
        public void mo100791E(int i, Object obj) throws IOException {
            mo101256R0(i, 4);
            C34325a2.m138828a().mo100883k(obj, this);
            mo101256R0(i, 3);
        }

        /* renamed from: F0 */
        public void mo101245F0(int i) {
            if (i >= 0) {
                mo101261W0(i);
            } else {
                mo101262X0((long) i);
            }
        }

        /* renamed from: G */
        public void mo100793G(int i) {
            mo101256R0(i, 4);
        }

        /* renamed from: K0 */
        public void mo101249K0(int i) {
            mo101261W0(CodedOutputStream.m137375c1(i));
        }

        /* renamed from: L */
        public void mo100798L(int i, int i2) {
            mo101270r0(10);
            mo101249K0(i2);
            mo101256R0(i, 0);
        }

        /* renamed from: N0 */
        public void mo101252N0(long j) {
            mo101262X0(CodedOutputStream.m137377d1(j));
        }

        /* renamed from: O */
        public void mo100801O(int i, Object obj, C34372g2 g2Var) throws IOException {
            mo101256R0(i, 4);
            g2Var.mo101121h(obj, this);
            mo101256R0(i, 3);
        }

        /* renamed from: P */
        public void mo100802P(int i, ByteString byteString) {
            try {
                byteString.mo99234e1(this);
                mo101270r0(10);
                mo101261W0(byteString.size());
                mo101256R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: Q0 */
        public void mo101255Q0(String str) {
            char charAt;
            mo101270r0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length >= 0 && (charAt = str.charAt(length)) < 128) {
                    long j = this.f83376k;
                    this.f83376k = j - 1;
                    C34341c3.m138986e0(j, (byte) charAt);
                }
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j2 = this.f83376k;
                        if (j2 >= this.f83374i) {
                            this.f83376k = j2 - 1;
                            C34341c3.m138986e0(j2, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j3 = this.f83376k;
                        if (j3 > this.f83374i) {
                            this.f83376k = j3 - 1;
                            C34341c3.m138986e0(j3, (byte) ((charAt2 & '?') | 128));
                            long j4 = this.f83376k;
                            this.f83376k = j4 - 1;
                            C34341c3.m138986e0(j4, (byte) ((charAt2 >>> 6) | C14092c.f34671x0));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j5 = this.f83376k;
                        if (j5 > this.f83374i + 1) {
                            this.f83376k = j5 - 1;
                            C34341c3.m138986e0(j5, (byte) ((charAt2 & '?') | 128));
                            long j6 = this.f83376k;
                            this.f83376k = j6 - 1;
                            C34341c3.m138986e0(j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                            long j7 = this.f83376k;
                            this.f83376k = j7 - 1;
                            C34341c3.m138986e0(j7, (byte) ((charAt2 >>> 12) | C14092c.f34573Y0));
                            length--;
                        }
                    }
                    if (this.f83376k > this.f83374i + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                long j8 = this.f83376k;
                                this.f83376k = j8 - 1;
                                C34341c3.m138986e0(j8, (byte) ((codePoint & 63) | 128));
                                long j9 = this.f83376k;
                                this.f83376k = j9 - 1;
                                C34341c3.m138986e0(j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j10 = this.f83376k;
                                this.f83376k = j10 - 1;
                                C34341c3.m138986e0(j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j11 = this.f83376k;
                                this.f83376k = j11 - 1;
                                C34341c3.m138986e0(j11, (byte) ((codePoint >>> 18) | C9527p.f26031b));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    mo101270r0(length);
                    length++;
                    length--;
                }
            }
        }

        /* renamed from: R */
        public void mo100804R(int i, Object obj, C34372g2 g2Var) throws IOException {
            int c0 = mo101265c0();
            g2Var.mo101121h(obj, this);
            mo101270r0(10);
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
        }

        /* renamed from: R0 */
        public void mo101256R0(int i, int i2) {
            mo101261W0(WireFormat.m138723c(i, i2));
        }

        /* renamed from: T */
        public void mo99306T(byte b) {
            long j = this.f83376k;
            this.f83376k = j - 1;
            C34341c3.m138986e0(j, b);
        }

        /* renamed from: U */
        public void mo99308U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo101325f1() < remaining) {
                mo101323d1(remaining);
            }
            this.f83376k -= (long) remaining;
            this.f83373h.position(mo101320Z0() + 1);
            this.f83373h.put(byteBuffer);
        }

        /* renamed from: V */
        public void mo99310V(byte[] bArr, int i, int i2) {
            if (mo101325f1() < i2) {
                mo101323d1(i2);
            }
            this.f83376k -= (long) i2;
            this.f83373h.position(mo101320Z0() + 1);
            this.f83373h.put(bArr, i, i2);
        }

        /* renamed from: W */
        public void mo99312W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo101325f1() < remaining) {
                this.f83361d += remaining;
                this.f83360c.addFirst(C34347d.m139111j(byteBuffer));
                mo101322c1();
                return;
            }
            this.f83376k -= (long) remaining;
            this.f83373h.position(mo101320Z0() + 1);
            this.f83373h.put(byteBuffer);
        }

        /* renamed from: W0 */
        public void mo101261W0(int i) {
            if ((i & -128) == 0) {
                mo101328i1(i);
            } else if ((i & -16384) == 0) {
                mo101330k1(i);
            } else if ((-2097152 & i) == 0) {
                mo101329j1(i);
            } else if ((-268435456 & i) == 0) {
                mo101327h1(i);
            } else {
                mo101326g1(i);
            }
        }

        /* renamed from: X */
        public void mo99314X(byte[] bArr, int i, int i2) {
            if (mo101325f1() < i2) {
                this.f83361d += i2;
                this.f83360c.addFirst(C34347d.m139113l(bArr, i, i2));
                mo101322c1();
                return;
            }
            this.f83376k -= (long) i2;
            this.f83373h.position(mo101320Z0() + 1);
            this.f83373h.put(bArr, i, i2);
        }

        /* renamed from: X0 */
        public void mo101262X0(long j) {
            switch (C34405l.m139580a0(j)) {
                case 1:
                    mo101335p1(j);
                    return;
                case 2:
                    mo101340u1(j);
                    return;
                case 3:
                    mo101339t1(j);
                    return;
                case 4:
                    mo101333n1(j);
                    return;
                case 5:
                    mo101332m1(j);
                    return;
                case 6:
                    mo101337r1(j);
                    return;
                case 7:
                    mo101336q1(j);
                    return;
                case 8:
                    mo101331l1(j);
                    return;
                case 9:
                    mo101334o1(j);
                    return;
                case 10:
                    mo101338s1(j);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: Z0 */
        public final int mo101320Z0() {
            return (int) (this.f83376k - this.f83374i);
        }

        /* renamed from: a1 */
        public final int mo101321a1() {
            return (int) (this.f83375j - this.f83376k);
        }

        /* renamed from: b0 */
        public void mo101264b0() {
            if (this.f83373h != null) {
                this.f83361d += mo101321a1();
                this.f83373h.position(mo101320Z0() + 1);
                this.f83373h = null;
                this.f83376k = 0;
                this.f83375j = 0;
            }
        }

        /* renamed from: c */
        public void mo100808c(int i, int i2) {
            mo101270r0(9);
            mo101276x0(i2);
            mo101256R0(i, 5);
        }

        /* renamed from: c0 */
        public int mo101265c0() {
            return this.f83361d + mo101321a1();
        }

        /* renamed from: c1 */
        public final void mo101322c1() {
            mo101324e1(mo101266f0());
        }

        /* renamed from: d1 */
        public final void mo101323d1(int i) {
            mo101324e1(mo101267g0(i));
        }

        /* renamed from: e1 */
        public final void mo101324e1(C34347d dVar) {
            if (dVar.mo101014d()) {
                ByteBuffer f = dVar.mo101016f();
                if (f.isDirect()) {
                    mo101264b0();
                    this.f83360c.addFirst(dVar);
                    this.f83373h = f;
                    f.limit(f.capacity());
                    this.f83373h.position(0);
                    long k = C34341c3.m138997k(this.f83373h);
                    this.f83374i = k;
                    long limit = k + ((long) (this.f83373h.limit() - 1));
                    this.f83375j = limit;
                    this.f83376k = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        /* renamed from: f */
        public void mo100811f(int i, String str) {
            int c0 = mo101265c0();
            mo101255Q0(str);
            mo101270r0(10);
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
        }

        /* renamed from: f1 */
        public final int mo101325f1() {
            return mo101320Z0() + 1;
        }

        /* renamed from: g */
        public void mo100812g(int i, long j) {
            mo101270r0(15);
            mo101262X0(j);
            mo101256R0(i, 0);
        }

        /* renamed from: g1 */
        public final void mo101326g1(int i) {
            long j = this.f83376k;
            this.f83376k = j - 1;
            C34341c3.m138986e0(j, (byte) (i >>> 28));
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) (((i >>> 21) & 127) | 128));
            long j3 = this.f83376k;
            this.f83376k = j3 - 1;
            C34341c3.m138986e0(j3, (byte) (((i >>> 14) & 127) | 128));
            long j4 = this.f83376k;
            this.f83376k = j4 - 1;
            C34341c3.m138986e0(j4, (byte) (((i >>> 7) & 127) | 128));
            long j5 = this.f83376k;
            this.f83376k = j5 - 1;
            C34341c3.m138986e0(j5, (byte) ((i & 127) | 128));
        }

        /* renamed from: h1 */
        public final void mo101327h1(int i) {
            long j = this.f83376k;
            this.f83376k = j - 1;
            C34341c3.m138986e0(j, (byte) (i >>> 21));
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) (((i >>> 14) & 127) | 128));
            long j3 = this.f83376k;
            this.f83376k = j3 - 1;
            C34341c3.m138986e0(j3, (byte) (((i >>> 7) & 127) | 128));
            long j4 = this.f83376k;
            this.f83376k = j4 - 1;
            C34341c3.m138986e0(j4, (byte) ((i & 127) | 128));
        }

        /* renamed from: i */
        public void mo100814i(int i, int i2) {
            mo101270r0(15);
            mo101245F0(i2);
            mo101256R0(i, 0);
        }

        /* renamed from: i1 */
        public final void mo101328i1(int i) {
            long j = this.f83376k;
            this.f83376k = j - 1;
            C34341c3.m138986e0(j, (byte) i);
        }

        /* renamed from: j1 */
        public final void mo101329j1(int i) {
            long j = this.f83376k;
            this.f83376k = j - 1;
            C34341c3.m138986e0(j, (byte) (i >>> 14));
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) (((i >>> 7) & 127) | 128));
            long j3 = this.f83376k;
            this.f83376k = j3 - 1;
            C34341c3.m138986e0(j3, (byte) ((i & 127) | 128));
        }

        /* renamed from: k1 */
        public final void mo101330k1(int i) {
            long j = this.f83376k;
            this.f83376k = j - 1;
            C34341c3.m138986e0(j, (byte) (i >>> 7));
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) ((i & 127) | 128));
        }

        /* renamed from: l1 */
        public final void mo101331l1(long j) {
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) ((int) (j >>> 49)));
            long j3 = this.f83376k;
            this.f83376k = j3 - 1;
            C34341c3.m138986e0(j3, (byte) ((int) (((j >>> 42) & 127) | 128)));
            long j4 = this.f83376k;
            this.f83376k = j4 - 1;
            C34341c3.m138986e0(j4, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j5 = this.f83376k;
            this.f83376k = j5 - 1;
            C34341c3.m138986e0(j5, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j6 = this.f83376k;
            this.f83376k = j6 - 1;
            C34341c3.m138986e0(j6, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j7 = this.f83376k;
            this.f83376k = j7 - 1;
            C34341c3.m138986e0(j7, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j8 = this.f83376k;
            this.f83376k = j8 - 1;
            C34341c3.m138986e0(j8, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j9 = this.f83376k;
            this.f83376k = j9 - 1;
            C34341c3.m138986e0(j9, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: m1 */
        public final void mo101332m1(long j) {
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) ((int) (j >>> 28)));
            long j3 = this.f83376k;
            this.f83376k = j3 - 1;
            C34341c3.m138986e0(j3, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j4 = this.f83376k;
            this.f83376k = j4 - 1;
            C34341c3.m138986e0(j4, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j5 = this.f83376k;
            this.f83376k = j5 - 1;
            C34341c3.m138986e0(j5, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j6 = this.f83376k;
            this.f83376k = j6 - 1;
            C34341c3.m138986e0(j6, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: n */
        public void mo100819n(int i, long j) {
            mo101270r0(15);
            mo101252N0(j);
            mo101256R0(i, 0);
        }

        /* renamed from: n1 */
        public final void mo101333n1(long j) {
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) ((int) (j >>> 21)));
            long j3 = this.f83376k;
            this.f83376k = j3 - 1;
            C34341c3.m138986e0(j3, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j4 = this.f83376k;
            this.f83376k = j4 - 1;
            C34341c3.m138986e0(j4, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j5 = this.f83376k;
            this.f83376k = j5 - 1;
            C34341c3.m138986e0(j5, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: o1 */
        public final void mo101334o1(long j) {
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) ((int) (j >>> 56)));
            long j3 = this.f83376k;
            this.f83376k = j3 - 1;
            C34341c3.m138986e0(j3, (byte) ((int) (((j >>> 49) & 127) | 128)));
            long j4 = this.f83376k;
            this.f83376k = j4 - 1;
            C34341c3.m138986e0(j4, (byte) ((int) (((j >>> 42) & 127) | 128)));
            long j5 = this.f83376k;
            this.f83376k = j5 - 1;
            C34341c3.m138986e0(j5, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j6 = this.f83376k;
            this.f83376k = j6 - 1;
            C34341c3.m138986e0(j6, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j7 = this.f83376k;
            this.f83376k = j7 - 1;
            C34341c3.m138986e0(j7, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j8 = this.f83376k;
            this.f83376k = j8 - 1;
            C34341c3.m138986e0(j8, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j9 = this.f83376k;
            this.f83376k = j9 - 1;
            C34341c3.m138986e0(j9, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j10 = this.f83376k;
            this.f83376k = j10 - 1;
            C34341c3.m138986e0(j10, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: p */
        public void mo100821p(int i, int i2) {
            mo101270r0(10);
            mo101261W0(i2);
            mo101256R0(i, 0);
        }

        /* renamed from: p1 */
        public final void mo101335p1(long j) {
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) ((int) j));
        }

        /* renamed from: q1 */
        public final void mo101336q1(long j) {
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) ((int) (j >>> 42)));
            long j3 = this.f83376k;
            this.f83376k = j3 - 1;
            C34341c3.m138986e0(j3, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j4 = this.f83376k;
            this.f83376k = j4 - 1;
            C34341c3.m138986e0(j4, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j5 = this.f83376k;
            this.f83376k = j5 - 1;
            C34341c3.m138986e0(j5, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j6 = this.f83376k;
            this.f83376k = j6 - 1;
            C34341c3.m138986e0(j6, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j7 = this.f83376k;
            this.f83376k = j7 - 1;
            C34341c3.m138986e0(j7, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j8 = this.f83376k;
            this.f83376k = j8 - 1;
            C34341c3.m138986e0(j8, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: r0 */
        public void mo101270r0(int i) {
            if (mo101325f1() < i) {
                mo101323d1(i);
            }
        }

        /* renamed from: r1 */
        public final void mo101337r1(long j) {
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) ((int) (j >>> 35)));
            long j3 = this.f83376k;
            this.f83376k = j3 - 1;
            C34341c3.m138986e0(j3, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j4 = this.f83376k;
            this.f83376k = j4 - 1;
            C34341c3.m138986e0(j4, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j5 = this.f83376k;
            this.f83376k = j5 - 1;
            C34341c3.m138986e0(j5, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j6 = this.f83376k;
            this.f83376k = j6 - 1;
            C34341c3.m138986e0(j6, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j7 = this.f83376k;
            this.f83376k = j7 - 1;
            C34341c3.m138986e0(j7, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: s0 */
        public void mo101271s0(boolean z) {
            mo99306T(z ? (byte) 1 : 0);
        }

        /* renamed from: s1 */
        public final void mo101338s1(long j) {
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) ((int) (j >>> 63)));
            long j3 = this.f83376k;
            this.f83376k = j3 - 1;
            C34341c3.m138986e0(j3, (byte) ((int) (((j >>> 56) & 127) | 128)));
            long j4 = this.f83376k;
            this.f83376k = j4 - 1;
            C34341c3.m138986e0(j4, (byte) ((int) (((j >>> 49) & 127) | 128)));
            long j5 = this.f83376k;
            this.f83376k = j5 - 1;
            C34341c3.m138986e0(j5, (byte) ((int) (((j >>> 42) & 127) | 128)));
            long j6 = this.f83376k;
            this.f83376k = j6 - 1;
            C34341c3.m138986e0(j6, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j7 = this.f83376k;
            this.f83376k = j7 - 1;
            C34341c3.m138986e0(j7, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j8 = this.f83376k;
            this.f83376k = j8 - 1;
            C34341c3.m138986e0(j8, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j9 = this.f83376k;
            this.f83376k = j9 - 1;
            C34341c3.m138986e0(j9, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j10 = this.f83376k;
            this.f83376k = j10 - 1;
            C34341c3.m138986e0(j10, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j11 = this.f83376k;
            this.f83376k = j11 - 1;
            C34341c3.m138986e0(j11, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: t */
        public void mo100825t(int i, long j) {
            mo101270r0(13);
            mo101240A0(j);
            mo101256R0(i, 1);
        }

        /* renamed from: t1 */
        public final void mo101339t1(long j) {
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) (((int) j) >>> 14));
            long j3 = this.f83376k;
            this.f83376k = j3 - 1;
            C34341c3.m138986e0(j3, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j4 = this.f83376k;
            this.f83376k = j4 - 1;
            C34341c3.m138986e0(j4, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: u1 */
        public final void mo101340u1(long j) {
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) ((int) (j >>> 7)));
            long j3 = this.f83376k;
            this.f83376k = j3 - 1;
            C34341c3.m138986e0(j3, (byte) ((((int) j) & 127) | 128));
        }

        /* renamed from: w */
        public void mo100828w(int i, Object obj) throws IOException {
            int c0 = mo101265c0();
            C34325a2.m138828a().mo100883k(obj, this);
            mo101270r0(10);
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
        }

        /* renamed from: x0 */
        public void mo101276x0(int i) {
            long j = this.f83376k;
            this.f83376k = j - 1;
            C34341c3.m138986e0(j, (byte) ((i >> 24) & 255));
            long j2 = this.f83376k;
            this.f83376k = j2 - 1;
            C34341c3.m138986e0(j2, (byte) ((i >> 16) & 255));
            long j3 = this.f83376k;
            this.f83376k = j3 - 1;
            C34341c3.m138986e0(j3, (byte) ((i >> 8) & 255));
            long j4 = this.f83376k;
            this.f83376k = j4 - 1;
            C34341c3.m138986e0(j4, (byte) (i & 255));
        }

        /* renamed from: y */
        public void mo100830y(int i, boolean z) {
            mo101270r0(6);
            mo99306T(z ? (byte) 1 : 0);
            mo101256R0(i, 0);
        }
    }

    /* renamed from: com.google.protobuf.l$e */
    public static final class C34410e extends C34405l {

        /* renamed from: h */
        public C34347d f83377h;

        /* renamed from: i */
        public byte[] f83378i;

        /* renamed from: j */
        public long f83379j;

        /* renamed from: k */
        public long f83380k;

        /* renamed from: l */
        public long f83381l;

        /* renamed from: m */
        public long f83382m;

        /* renamed from: n */
        public long f83383n;

        public C34410e(C34423o oVar, int i) {
            super(oVar, i, (C34406a) null);
            mo101343b1();
        }

        /* renamed from: a1 */
        public static boolean m139825a1() {
            return C34341c3.m138971U();
        }

        /* renamed from: A */
        public void mo100787A(int i) {
            mo101256R0(i, 3);
        }

        /* renamed from: A0 */
        public void mo101240A0(long j) {
            byte[] bArr = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr, j2, (byte) (((int) (j >> 56)) & 255));
            byte[] bArr2 = this.f83378i;
            long j3 = this.f83383n;
            this.f83383n = j3 - 1;
            C34341c3.m138990g0(bArr2, j3, (byte) (((int) (j >> 48)) & 255));
            byte[] bArr3 = this.f83378i;
            long j4 = this.f83383n;
            this.f83383n = j4 - 1;
            C34341c3.m138990g0(bArr3, j4, (byte) (((int) (j >> 40)) & 255));
            byte[] bArr4 = this.f83378i;
            long j5 = this.f83383n;
            this.f83383n = j5 - 1;
            C34341c3.m138990g0(bArr4, j5, (byte) (((int) (j >> 32)) & 255));
            byte[] bArr5 = this.f83378i;
            long j6 = this.f83383n;
            this.f83383n = j6 - 1;
            C34341c3.m138990g0(bArr5, j6, (byte) (((int) (j >> 24)) & 255));
            byte[] bArr6 = this.f83378i;
            long j7 = this.f83383n;
            this.f83383n = j7 - 1;
            C34341c3.m138990g0(bArr6, j7, (byte) (((int) (j >> 16)) & 255));
            byte[] bArr7 = this.f83378i;
            long j8 = this.f83383n;
            this.f83383n = j8 - 1;
            C34341c3.m138990g0(bArr7, j8, (byte) (((int) (j >> 8)) & 255));
            byte[] bArr8 = this.f83378i;
            long j9 = this.f83383n;
            this.f83383n = j9 - 1;
            C34341c3.m138990g0(bArr8, j9, (byte) (((int) j) & 255));
        }

        /* renamed from: E */
        public void mo100791E(int i, Object obj) throws IOException {
            mo101256R0(i, 4);
            C34325a2.m138828a().mo100883k(obj, this);
            mo101256R0(i, 3);
        }

        /* renamed from: F0 */
        public void mo101245F0(int i) {
            if (i >= 0) {
                mo101261W0(i);
            } else {
                mo101262X0((long) i);
            }
        }

        /* renamed from: G */
        public void mo100793G(int i) {
            mo101256R0(i, 4);
        }

        /* renamed from: K0 */
        public void mo101249K0(int i) {
            mo101261W0(CodedOutputStream.m137375c1(i));
        }

        /* renamed from: L */
        public void mo100798L(int i, int i2) {
            mo101270r0(10);
            mo101249K0(i2);
            mo101256R0(i, 0);
        }

        /* renamed from: N0 */
        public void mo101252N0(long j) {
            mo101262X0(CodedOutputStream.m137377d1(j));
        }

        /* renamed from: O */
        public void mo100801O(int i, Object obj, C34372g2 g2Var) throws IOException {
            mo101256R0(i, 4);
            g2Var.mo101121h(obj, this);
            mo101256R0(i, 3);
        }

        /* renamed from: P */
        public void mo100802P(int i, ByteString byteString) {
            try {
                byteString.mo99234e1(this);
                mo101270r0(10);
                mo101261W0(byteString.size());
                mo101256R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: Q0 */
        public void mo101255Q0(String str) {
            char charAt;
            mo101270r0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length >= 0 && (charAt = str.charAt(length)) < 128) {
                    byte[] bArr = this.f83378i;
                    long j = this.f83383n;
                    this.f83383n = j - 1;
                    C34341c3.m138990g0(bArr, j, (byte) charAt);
                }
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j2 = this.f83383n;
                        if (j2 > this.f83381l) {
                            byte[] bArr2 = this.f83378i;
                            this.f83383n = j2 - 1;
                            C34341c3.m138990g0(bArr2, j2, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j3 = this.f83383n;
                        if (j3 > this.f83379j) {
                            byte[] bArr3 = this.f83378i;
                            this.f83383n = j3 - 1;
                            C34341c3.m138990g0(bArr3, j3, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr4 = this.f83378i;
                            long j4 = this.f83383n;
                            this.f83383n = j4 - 1;
                            C34341c3.m138990g0(bArr4, j4, (byte) ((charAt2 >>> 6) | C14092c.f34671x0));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j5 = this.f83383n;
                        if (j5 > this.f83379j + 1) {
                            byte[] bArr5 = this.f83378i;
                            this.f83383n = j5 - 1;
                            C34341c3.m138990g0(bArr5, j5, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr6 = this.f83378i;
                            long j6 = this.f83383n;
                            this.f83383n = j6 - 1;
                            C34341c3.m138990g0(bArr6, j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                            byte[] bArr7 = this.f83378i;
                            long j7 = this.f83383n;
                            this.f83383n = j7 - 1;
                            C34341c3.m138990g0(bArr7, j7, (byte) ((charAt2 >>> 12) | C14092c.f34573Y0));
                            length--;
                        }
                    }
                    if (this.f83383n > this.f83379j + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr8 = this.f83378i;
                                long j8 = this.f83383n;
                                this.f83383n = j8 - 1;
                                C34341c3.m138990g0(bArr8, j8, (byte) ((codePoint & 63) | 128));
                                byte[] bArr9 = this.f83378i;
                                long j9 = this.f83383n;
                                this.f83383n = j9 - 1;
                                C34341c3.m138990g0(bArr9, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                byte[] bArr10 = this.f83378i;
                                long j10 = this.f83383n;
                                this.f83383n = j10 - 1;
                                C34341c3.m138990g0(bArr10, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                byte[] bArr11 = this.f83378i;
                                long j11 = this.f83383n;
                                this.f83383n = j11 - 1;
                                C34341c3.m138990g0(bArr11, j11, (byte) ((codePoint >>> 18) | C9527p.f26031b));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    mo101270r0(length);
                    length++;
                    length--;
                }
            }
        }

        /* renamed from: R */
        public void mo100804R(int i, Object obj, C34372g2 g2Var) throws IOException {
            int c0 = mo101265c0();
            g2Var.mo101121h(obj, this);
            mo101270r0(10);
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
        }

        /* renamed from: R0 */
        public void mo101256R0(int i, int i2) {
            mo101261W0(WireFormat.m138723c(i, i2));
        }

        /* renamed from: T */
        public void mo99306T(byte b) {
            byte[] bArr = this.f83378i;
            long j = this.f83383n;
            this.f83383n = j - 1;
            C34341c3.m138990g0(bArr, j, b);
        }

        /* renamed from: U */
        public void mo99308U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            mo101270r0(remaining);
            this.f83383n -= (long) remaining;
            byteBuffer.get(this.f83378i, mo101341Y0() + 1, remaining);
        }

        /* renamed from: V */
        public void mo99310V(byte[] bArr, int i, int i2) {
            if (i < 0 || i + i2 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            mo101270r0(i2);
            this.f83383n -= (long) i2;
            System.arraycopy(bArr, i, this.f83378i, mo101341Y0() + 1, i2);
        }

        /* renamed from: W */
        public void mo99312W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo101346e1() < remaining) {
                this.f83361d += remaining;
                this.f83360c.addFirst(C34347d.m139111j(byteBuffer));
                mo101343b1();
            }
            this.f83383n -= (long) remaining;
            byteBuffer.get(this.f83378i, mo101341Y0() + 1, remaining);
        }

        /* renamed from: W0 */
        public void mo101261W0(int i) {
            if ((i & -128) == 0) {
                mo101349h1(i);
            } else if ((i & -16384) == 0) {
                mo101351j1(i);
            } else if ((-2097152 & i) == 0) {
                mo101350i1(i);
            } else if ((-268435456 & i) == 0) {
                mo101348g1(i);
            } else {
                mo101347f1(i);
            }
        }

        /* renamed from: X */
        public void mo99314X(byte[] bArr, int i, int i2) {
            if (i < 0 || i + i2 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            } else if (mo101346e1() < i2) {
                this.f83361d += i2;
                this.f83360c.addFirst(C34347d.m139113l(bArr, i, i2));
                mo101343b1();
            } else {
                this.f83383n -= (long) i2;
                System.arraycopy(bArr, i, this.f83378i, mo101341Y0() + 1, i2);
            }
        }

        /* renamed from: X0 */
        public void mo101262X0(long j) {
            switch (C34405l.m139580a0(j)) {
                case 1:
                    mo101356o1(j);
                    return;
                case 2:
                    mo101361t1(j);
                    return;
                case 3:
                    mo101360s1(j);
                    return;
                case 4:
                    mo101354m1(j);
                    return;
                case 5:
                    mo101353l1(j);
                    return;
                case 6:
                    mo101358q1(j);
                    return;
                case 7:
                    mo101357p1(j);
                    return;
                case 8:
                    mo101352k1(j);
                    return;
                case 9:
                    mo101355n1(j);
                    return;
                case 10:
                    mo101359r1(j);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: Y0 */
        public final int mo101341Y0() {
            return (int) this.f83383n;
        }

        /* renamed from: Z0 */
        public int mo101342Z0() {
            return (int) (this.f83382m - this.f83383n);
        }

        /* renamed from: b0 */
        public void mo101264b0() {
            if (this.f83377h != null) {
                this.f83361d += mo101342Z0();
                this.f83377h.mo101018h((mo101341Y0() - this.f83377h.mo101012b()) + 1);
                this.f83377h = null;
                this.f83383n = 0;
                this.f83382m = 0;
            }
        }

        /* renamed from: b1 */
        public final void mo101343b1() {
            mo101345d1(mo101268j0());
        }

        /* renamed from: c */
        public void mo100808c(int i, int i2) {
            mo101270r0(9);
            mo101276x0(i2);
            mo101256R0(i, 5);
        }

        /* renamed from: c0 */
        public int mo101265c0() {
            return this.f83361d + mo101342Z0();
        }

        /* renamed from: c1 */
        public final void mo101344c1(int i) {
            mo101345d1(mo101269k0(i));
        }

        /* renamed from: d1 */
        public final void mo101345d1(C34347d dVar) {
            if (dVar.mo101013c()) {
                mo101264b0();
                this.f83360c.addFirst(dVar);
                this.f83377h = dVar;
                this.f83378i = dVar.mo101011a();
                int b = dVar.mo101012b();
                this.f83380k = (long) (dVar.mo101015e() + b);
                long g = (long) (b + dVar.mo101017g());
                this.f83379j = g;
                this.f83381l = g - 1;
                long j = this.f83380k - 1;
                this.f83382m = j;
                this.f83383n = j;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        /* renamed from: e1 */
        public int mo101346e1() {
            return (int) (this.f83383n - this.f83381l);
        }

        /* renamed from: f */
        public void mo100811f(int i, String str) {
            int c0 = mo101265c0();
            mo101255Q0(str);
            mo101270r0(10);
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
        }

        /* renamed from: f1 */
        public final void mo101347f1(int i) {
            byte[] bArr = this.f83378i;
            long j = this.f83383n;
            this.f83383n = j - 1;
            C34341c3.m138990g0(bArr, j, (byte) (i >>> 28));
            byte[] bArr2 = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr2, j2, (byte) (((i >>> 21) & 127) | 128));
            byte[] bArr3 = this.f83378i;
            long j3 = this.f83383n;
            this.f83383n = j3 - 1;
            C34341c3.m138990g0(bArr3, j3, (byte) (((i >>> 14) & 127) | 128));
            byte[] bArr4 = this.f83378i;
            long j4 = this.f83383n;
            this.f83383n = j4 - 1;
            C34341c3.m138990g0(bArr4, j4, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr5 = this.f83378i;
            long j5 = this.f83383n;
            this.f83383n = j5 - 1;
            C34341c3.m138990g0(bArr5, j5, (byte) ((i & 127) | 128));
        }

        /* renamed from: g */
        public void mo100812g(int i, long j) {
            mo101270r0(15);
            mo101262X0(j);
            mo101256R0(i, 0);
        }

        /* renamed from: g1 */
        public final void mo101348g1(int i) {
            byte[] bArr = this.f83378i;
            long j = this.f83383n;
            this.f83383n = j - 1;
            C34341c3.m138990g0(bArr, j, (byte) (i >>> 21));
            byte[] bArr2 = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr2, j2, (byte) (((i >>> 14) & 127) | 128));
            byte[] bArr3 = this.f83378i;
            long j3 = this.f83383n;
            this.f83383n = j3 - 1;
            C34341c3.m138990g0(bArr3, j3, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr4 = this.f83378i;
            long j4 = this.f83383n;
            this.f83383n = j4 - 1;
            C34341c3.m138990g0(bArr4, j4, (byte) ((i & 127) | 128));
        }

        /* renamed from: h1 */
        public final void mo101349h1(int i) {
            byte[] bArr = this.f83378i;
            long j = this.f83383n;
            this.f83383n = j - 1;
            C34341c3.m138990g0(bArr, j, (byte) i);
        }

        /* renamed from: i */
        public void mo100814i(int i, int i2) {
            mo101270r0(15);
            mo101245F0(i2);
            mo101256R0(i, 0);
        }

        /* renamed from: i1 */
        public final void mo101350i1(int i) {
            byte[] bArr = this.f83378i;
            long j = this.f83383n;
            this.f83383n = j - 1;
            C34341c3.m138990g0(bArr, j, (byte) (i >>> 14));
            byte[] bArr2 = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr2, j2, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr3 = this.f83378i;
            long j3 = this.f83383n;
            this.f83383n = j3 - 1;
            C34341c3.m138990g0(bArr3, j3, (byte) ((i & 127) | 128));
        }

        /* renamed from: j1 */
        public final void mo101351j1(int i) {
            byte[] bArr = this.f83378i;
            long j = this.f83383n;
            this.f83383n = j - 1;
            C34341c3.m138990g0(bArr, j, (byte) (i >>> 7));
            byte[] bArr2 = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr2, j2, (byte) ((i & 127) | 128));
        }

        /* renamed from: k1 */
        public final void mo101352k1(long j) {
            byte[] bArr = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr, j2, (byte) ((int) (j >>> 49)));
            byte[] bArr2 = this.f83378i;
            long j3 = this.f83383n;
            this.f83383n = j3 - 1;
            C34341c3.m138990g0(bArr2, j3, (byte) ((int) (((j >>> 42) & 127) | 128)));
            byte[] bArr3 = this.f83378i;
            long j4 = this.f83383n;
            this.f83383n = j4 - 1;
            C34341c3.m138990g0(bArr3, j4, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr4 = this.f83378i;
            long j5 = this.f83383n;
            this.f83383n = j5 - 1;
            C34341c3.m138990g0(bArr4, j5, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr5 = this.f83378i;
            long j6 = this.f83383n;
            this.f83383n = j6 - 1;
            C34341c3.m138990g0(bArr5, j6, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr6 = this.f83378i;
            long j7 = this.f83383n;
            this.f83383n = j7 - 1;
            C34341c3.m138990g0(bArr6, j7, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr7 = this.f83378i;
            long j8 = this.f83383n;
            this.f83383n = j8 - 1;
            C34341c3.m138990g0(bArr7, j8, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr8 = this.f83378i;
            long j9 = this.f83383n;
            this.f83383n = j9 - 1;
            C34341c3.m138990g0(bArr8, j9, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: l1 */
        public final void mo101353l1(long j) {
            byte[] bArr = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr, j2, (byte) ((int) (j >>> 28)));
            byte[] bArr2 = this.f83378i;
            long j3 = this.f83383n;
            this.f83383n = j3 - 1;
            C34341c3.m138990g0(bArr2, j3, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr3 = this.f83378i;
            long j4 = this.f83383n;
            this.f83383n = j4 - 1;
            C34341c3.m138990g0(bArr3, j4, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr4 = this.f83378i;
            long j5 = this.f83383n;
            this.f83383n = j5 - 1;
            C34341c3.m138990g0(bArr4, j5, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr5 = this.f83378i;
            long j6 = this.f83383n;
            this.f83383n = j6 - 1;
            C34341c3.m138990g0(bArr5, j6, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: m1 */
        public final void mo101354m1(long j) {
            byte[] bArr = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr, j2, (byte) ((int) (j >>> 21)));
            byte[] bArr2 = this.f83378i;
            long j3 = this.f83383n;
            this.f83383n = j3 - 1;
            C34341c3.m138990g0(bArr2, j3, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr3 = this.f83378i;
            long j4 = this.f83383n;
            this.f83383n = j4 - 1;
            C34341c3.m138990g0(bArr3, j4, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr4 = this.f83378i;
            long j5 = this.f83383n;
            this.f83383n = j5 - 1;
            C34341c3.m138990g0(bArr4, j5, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: n */
        public void mo100819n(int i, long j) {
            mo101270r0(15);
            mo101252N0(j);
            mo101256R0(i, 0);
        }

        /* renamed from: n1 */
        public final void mo101355n1(long j) {
            byte[] bArr = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr, j2, (byte) ((int) (j >>> 56)));
            byte[] bArr2 = this.f83378i;
            long j3 = this.f83383n;
            this.f83383n = j3 - 1;
            C34341c3.m138990g0(bArr2, j3, (byte) ((int) (((j >>> 49) & 127) | 128)));
            byte[] bArr3 = this.f83378i;
            long j4 = this.f83383n;
            this.f83383n = j4 - 1;
            C34341c3.m138990g0(bArr3, j4, (byte) ((int) (((j >>> 42) & 127) | 128)));
            byte[] bArr4 = this.f83378i;
            long j5 = this.f83383n;
            this.f83383n = j5 - 1;
            C34341c3.m138990g0(bArr4, j5, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr5 = this.f83378i;
            long j6 = this.f83383n;
            this.f83383n = j6 - 1;
            C34341c3.m138990g0(bArr5, j6, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr6 = this.f83378i;
            long j7 = this.f83383n;
            this.f83383n = j7 - 1;
            C34341c3.m138990g0(bArr6, j7, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr7 = this.f83378i;
            long j8 = this.f83383n;
            this.f83383n = j8 - 1;
            C34341c3.m138990g0(bArr7, j8, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr8 = this.f83378i;
            long j9 = this.f83383n;
            this.f83383n = j9 - 1;
            C34341c3.m138990g0(bArr8, j9, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr9 = this.f83378i;
            long j10 = this.f83383n;
            this.f83383n = j10 - 1;
            C34341c3.m138990g0(bArr9, j10, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: o1 */
        public final void mo101356o1(long j) {
            byte[] bArr = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr, j2, (byte) ((int) j));
        }

        /* renamed from: p */
        public void mo100821p(int i, int i2) {
            mo101270r0(10);
            mo101261W0(i2);
            mo101256R0(i, 0);
        }

        /* renamed from: p1 */
        public final void mo101357p1(long j) {
            byte[] bArr = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr, j2, (byte) ((int) (j >>> 42)));
            byte[] bArr2 = this.f83378i;
            long j3 = this.f83383n;
            this.f83383n = j3 - 1;
            C34341c3.m138990g0(bArr2, j3, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr3 = this.f83378i;
            long j4 = this.f83383n;
            this.f83383n = j4 - 1;
            C34341c3.m138990g0(bArr3, j4, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr4 = this.f83378i;
            long j5 = this.f83383n;
            this.f83383n = j5 - 1;
            C34341c3.m138990g0(bArr4, j5, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr5 = this.f83378i;
            long j6 = this.f83383n;
            this.f83383n = j6 - 1;
            C34341c3.m138990g0(bArr5, j6, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr6 = this.f83378i;
            long j7 = this.f83383n;
            this.f83383n = j7 - 1;
            C34341c3.m138990g0(bArr6, j7, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr7 = this.f83378i;
            long j8 = this.f83383n;
            this.f83383n = j8 - 1;
            C34341c3.m138990g0(bArr7, j8, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: q1 */
        public final void mo101358q1(long j) {
            byte[] bArr = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr, j2, (byte) ((int) (j >>> 35)));
            byte[] bArr2 = this.f83378i;
            long j3 = this.f83383n;
            this.f83383n = j3 - 1;
            C34341c3.m138990g0(bArr2, j3, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr3 = this.f83378i;
            long j4 = this.f83383n;
            this.f83383n = j4 - 1;
            C34341c3.m138990g0(bArr3, j4, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr4 = this.f83378i;
            long j5 = this.f83383n;
            this.f83383n = j5 - 1;
            C34341c3.m138990g0(bArr4, j5, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr5 = this.f83378i;
            long j6 = this.f83383n;
            this.f83383n = j6 - 1;
            C34341c3.m138990g0(bArr5, j6, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr6 = this.f83378i;
            long j7 = this.f83383n;
            this.f83383n = j7 - 1;
            C34341c3.m138990g0(bArr6, j7, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: r0 */
        public void mo101270r0(int i) {
            if (mo101346e1() < i) {
                mo101344c1(i);
            }
        }

        /* renamed from: r1 */
        public final void mo101359r1(long j) {
            byte[] bArr = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr, j2, (byte) ((int) (j >>> 63)));
            byte[] bArr2 = this.f83378i;
            long j3 = this.f83383n;
            this.f83383n = j3 - 1;
            C34341c3.m138990g0(bArr2, j3, (byte) ((int) (((j >>> 56) & 127) | 128)));
            byte[] bArr3 = this.f83378i;
            long j4 = this.f83383n;
            this.f83383n = j4 - 1;
            C34341c3.m138990g0(bArr3, j4, (byte) ((int) (((j >>> 49) & 127) | 128)));
            byte[] bArr4 = this.f83378i;
            long j5 = this.f83383n;
            this.f83383n = j5 - 1;
            C34341c3.m138990g0(bArr4, j5, (byte) ((int) (((j >>> 42) & 127) | 128)));
            byte[] bArr5 = this.f83378i;
            long j6 = this.f83383n;
            this.f83383n = j6 - 1;
            C34341c3.m138990g0(bArr5, j6, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr6 = this.f83378i;
            long j7 = this.f83383n;
            this.f83383n = j7 - 1;
            C34341c3.m138990g0(bArr6, j7, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr7 = this.f83378i;
            long j8 = this.f83383n;
            this.f83383n = j8 - 1;
            C34341c3.m138990g0(bArr7, j8, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr8 = this.f83378i;
            long j9 = this.f83383n;
            this.f83383n = j9 - 1;
            C34341c3.m138990g0(bArr8, j9, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr9 = this.f83378i;
            long j10 = this.f83383n;
            this.f83383n = j10 - 1;
            C34341c3.m138990g0(bArr9, j10, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr10 = this.f83378i;
            long j11 = this.f83383n;
            this.f83383n = j11 - 1;
            C34341c3.m138990g0(bArr10, j11, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: s0 */
        public void mo101271s0(boolean z) {
            mo99306T(z ? (byte) 1 : 0);
        }

        /* renamed from: s1 */
        public final void mo101360s1(long j) {
            byte[] bArr = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr, j2, (byte) (((int) j) >>> 14));
            byte[] bArr2 = this.f83378i;
            long j3 = this.f83383n;
            this.f83383n = j3 - 1;
            C34341c3.m138990g0(bArr2, j3, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr3 = this.f83378i;
            long j4 = this.f83383n;
            this.f83383n = j4 - 1;
            C34341c3.m138990g0(bArr3, j4, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: t */
        public void mo100825t(int i, long j) {
            mo101270r0(13);
            mo101240A0(j);
            mo101256R0(i, 1);
        }

        /* renamed from: t1 */
        public final void mo101361t1(long j) {
            byte[] bArr = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr, j2, (byte) ((int) (j >>> 7)));
            byte[] bArr2 = this.f83378i;
            long j3 = this.f83383n;
            this.f83383n = j3 - 1;
            C34341c3.m138990g0(bArr2, j3, (byte) ((((int) j) & 127) | 128));
        }

        /* renamed from: w */
        public void mo100828w(int i, Object obj) throws IOException {
            int c0 = mo101265c0();
            C34325a2.m138828a().mo100883k(obj, this);
            mo101270r0(10);
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
        }

        /* renamed from: x0 */
        public void mo101276x0(int i) {
            byte[] bArr = this.f83378i;
            long j = this.f83383n;
            this.f83383n = j - 1;
            C34341c3.m138990g0(bArr, j, (byte) ((i >> 24) & 255));
            byte[] bArr2 = this.f83378i;
            long j2 = this.f83383n;
            this.f83383n = j2 - 1;
            C34341c3.m138990g0(bArr2, j2, (byte) ((i >> 16) & 255));
            byte[] bArr3 = this.f83378i;
            long j3 = this.f83383n;
            this.f83383n = j3 - 1;
            C34341c3.m138990g0(bArr3, j3, (byte) ((i >> 8) & 255));
            byte[] bArr4 = this.f83378i;
            long j4 = this.f83383n;
            this.f83383n = j4 - 1;
            C34341c3.m138990g0(bArr4, j4, (byte) (i & 255));
        }

        /* renamed from: y */
        public void mo100830y(int i, boolean z) {
            mo101270r0(6);
            mo99306T(z ? (byte) 1 : 0);
            mo101256R0(i, 0);
        }
    }

    public /* synthetic */ C34405l(C34423o oVar, int i, C34406a aVar) {
        this(oVar, i);
    }

    /* renamed from: J0 */
    public static final void m139578J0(Writer writer, int i, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (C34406a.f83362a[fieldType.ordinal()]) {
            case 1:
                writer.mo100830y(i, ((Boolean) obj).booleanValue());
                return;
            case 2:
                writer.mo100808c(i, ((Integer) obj).intValue());
                return;
            case 3:
                writer.mo100825t(i, ((Long) obj).longValue());
                return;
            case 4:
                writer.mo100814i(i, ((Integer) obj).intValue());
                return;
            case 5:
                writer.mo100829x(i, ((Long) obj).longValue());
                return;
            case 6:
                writer.mo100831z(i, ((Integer) obj).intValue());
                return;
            case 7:
                writer.mo100815j(i, ((Long) obj).longValue());
                return;
            case 8:
                writer.mo100798L(i, ((Integer) obj).intValue());
                return;
            case 9:
                writer.mo100819n(i, ((Long) obj).longValue());
                return;
            case 10:
                writer.mo100811f(i, (String) obj);
                return;
            case 11:
                writer.mo100821p(i, ((Integer) obj).intValue());
                return;
            case 12:
                writer.mo100812g(i, ((Long) obj).longValue());
                return;
            case 13:
                writer.mo100792F(i, ((Float) obj).floatValue());
                return;
            case 14:
                writer.mo100822q(i, ((Double) obj).doubleValue());
                return;
            case 15:
                writer.mo100828w(i, obj);
                return;
            case 16:
                writer.mo100802P(i, (ByteString) obj);
                return;
            case 17:
                if (obj instanceof C34471v0.C34474c) {
                    writer.mo100795I(i, ((C34471v0.C34474c) obj).getNumber());
                    return;
                } else if (obj instanceof Integer) {
                    writer.mo100795I(i, ((Integer) obj).intValue());
                    return;
                } else {
                    throw new IllegalArgumentException("Unexpected type for enum in map.");
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    /* renamed from: a0 */
    public static byte m139580a0(long j) {
        byte b;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            b = (byte) 6;
            j >>>= 28;
        } else {
            b = 2;
        }
        if ((CoroutineScheduler.f29765M0 & j) != 0) {
            b = (byte) (b + 2);
            j >>>= 14;
        }
        return (j & -16384) != 0 ? (byte) (b + 1) : b;
    }

    /* renamed from: d0 */
    public static boolean m139581d0() {
        return C34409d.m139769b1();
    }

    /* renamed from: e0 */
    public static boolean m139582e0() {
        return C34410e.m139825a1();
    }

    /* renamed from: h0 */
    public static C34405l m139583h0(C34423o oVar) {
        return m139584i0(oVar, 4096);
    }

    /* renamed from: i0 */
    public static C34405l m139584i0(C34423o oVar, int i) {
        if (m139581d0()) {
            return m139589p0(oVar, i);
        }
        return m139587n0(oVar, i);
    }

    /* renamed from: l0 */
    public static C34405l m139585l0(C34423o oVar) {
        return m139586m0(oVar, 4096);
    }

    /* renamed from: m0 */
    public static C34405l m139586m0(C34423o oVar, int i) {
        if (m139582e0()) {
            return m139590q0(oVar, i);
        }
        return m139588o0(oVar, i);
    }

    /* renamed from: n0 */
    public static C34405l m139587n0(C34423o oVar, int i) {
        return new C34407b(oVar, i);
    }

    /* renamed from: o0 */
    public static C34405l m139588o0(C34423o oVar, int i) {
        return new C34408c(oVar, i);
    }

    /* renamed from: p0 */
    public static C34405l m139589p0(C34423o oVar, int i) {
        if (m139581d0()) {
            return new C34409d(oVar, i);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    /* renamed from: q0 */
    public static C34405l m139590q0(C34423o oVar, int i) {
        if (m139582e0()) {
            return new C34410e(oVar, i);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    /* renamed from: A0 */
    public abstract void mo101240A0(long j);

    /* renamed from: B */
    public final void mo100788B(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof C34351d1) {
            mo101241B0(i, (C34351d1) list, z);
        } else {
            mo101242C0(i, list, z);
        }
    }

    /* renamed from: B0 */
    public final void mo101241B0(int i, C34351d1 d1Var, boolean z) throws IOException {
        if (z) {
            mo101270r0((d1Var.size() * 8) + 10);
            int c0 = mo101265c0();
            for (int size = d1Var.size() - 1; size >= 0; size--) {
                mo101240A0(d1Var.getLong(size));
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = d1Var.size() - 1; size2 >= 0; size2--) {
            mo100825t(i, d1Var.getLong(size2));
        }
    }

    /* renamed from: C */
    public final void mo100789C(int i, List<Integer> list, boolean z) throws IOException {
        mo100816k(i, list, z);
    }

    /* renamed from: C0 */
    public final void mo101242C0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            mo101270r0((list.size() * 8) + 10);
            int c0 = mo101265c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo101240A0(list.get(size).longValue());
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo100825t(i, list.get(size2).longValue());
        }
    }

    /* renamed from: D */
    public final void mo100790D(int i, List<Boolean> list, boolean z) throws IOException {
        if (list instanceof C34419n) {
            mo101272t0(i, (C34419n) list, z);
        } else {
            mo101273u0(i, list, z);
        }
    }

    /* renamed from: D0 */
    public final void mo101243D0(int i, C34433p0 p0Var, boolean z) throws IOException {
        if (z) {
            mo101270r0((p0Var.size() * 4) + 10);
            int c0 = mo101265c0();
            for (int size = p0Var.size() - 1; size >= 0; size--) {
                mo101276x0(Float.floatToRawIntBits(p0Var.getFloat(size)));
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = p0Var.size() - 1; size2 >= 0; size2--) {
            mo100792F(i, p0Var.getFloat(size2));
        }
    }

    /* renamed from: E0 */
    public final void mo101244E0(int i, List<Float> list, boolean z) throws IOException {
        if (z) {
            mo101270r0((list.size() * 4) + 10);
            int c0 = mo101265c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo101276x0(Float.floatToRawIntBits(list.get(size).floatValue()));
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo100792F(i, list.get(size2).floatValue());
        }
    }

    /* renamed from: F */
    public final void mo100792F(int i, float f) throws IOException {
        mo100808c(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: F0 */
    public abstract void mo101245F0(int i);

    /* renamed from: G0 */
    public final void mo101246G0(int i, C34467u0 u0Var, boolean z) throws IOException {
        if (z) {
            mo101270r0((u0Var.size() * 10) + 10);
            int c0 = mo101265c0();
            for (int size = u0Var.size() - 1; size >= 0; size--) {
                mo101245F0(u0Var.getInt(size));
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = u0Var.size() - 1; size2 >= 0; size2--) {
            mo100814i(i, u0Var.getInt(size2));
        }
    }

    /* renamed from: H */
    public final void mo100794H(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof C34467u0) {
            mo101250L0(i, (C34467u0) list, z);
        } else {
            mo101251M0(i, list, z);
        }
    }

    /* renamed from: H0 */
    public final void mo101247H0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo101270r0((list.size() * 10) + 10);
            int c0 = mo101265c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo101245F0(list.get(size).intValue());
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo100814i(i, list.get(size2).intValue());
        }
    }

    /* renamed from: I */
    public final void mo100795I(int i, int i2) throws IOException {
        mo100814i(i, i2);
    }

    /* renamed from: I0 */
    public final void mo101248I0(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            mo100811f(i, (String) obj);
        } else {
            mo100802P(i, (ByteString) obj);
        }
    }

    /* renamed from: J */
    public final void mo100796J(int i, List<Long> list, boolean z) throws IOException {
        mo100824s(i, list, z);
    }

    /* renamed from: K */
    public final void mo100797K(int i, List<Double> list, boolean z) throws IOException {
        if (list instanceof C34470v) {
            mo101274v0(i, (C34470v) list, z);
        } else {
            mo101275w0(i, list, z);
        }
    }

    /* renamed from: K0 */
    public abstract void mo101249K0(int i);

    /* renamed from: L0 */
    public final void mo101250L0(int i, C34467u0 u0Var, boolean z) throws IOException {
        if (z) {
            mo101270r0((u0Var.size() * 5) + 10);
            int c0 = mo101265c0();
            for (int size = u0Var.size() - 1; size >= 0; size--) {
                mo101249K0(u0Var.getInt(size));
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = u0Var.size() - 1; size2 >= 0; size2--) {
            mo100798L(i, u0Var.getInt(size2));
        }
    }

    /* renamed from: M */
    public final void mo100799M(int i, List<ByteString> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo100802P(i, list.get(size));
        }
    }

    /* renamed from: M0 */
    public final void mo101251M0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo101270r0((list.size() * 5) + 10);
            int c0 = mo101265c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo101249K0(list.get(size).intValue());
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo100798L(i, list.get(size2).intValue());
        }
    }

    /* renamed from: N */
    public final void mo100800N(int i, List<?> list, C34372g2 g2Var) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo100804R(i, list.get(size), g2Var);
        }
    }

    /* renamed from: N0 */
    public abstract void mo101252N0(long j);

    /* renamed from: O0 */
    public final void mo101253O0(int i, C34351d1 d1Var, boolean z) throws IOException {
        if (z) {
            mo101270r0((d1Var.size() * 10) + 10);
            int c0 = mo101265c0();
            for (int size = d1Var.size() - 1; size >= 0; size--) {
                mo101252N0(d1Var.getLong(size));
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = d1Var.size() - 1; size2 >= 0; size2--) {
            mo100819n(i, d1Var.getLong(size2));
        }
    }

    /* renamed from: P0 */
    public final void mo101254P0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            mo101270r0((list.size() * 10) + 10);
            int c0 = mo101265c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo101252N0(list.get(size).longValue());
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo100819n(i, list.get(size2).longValue());
        }
    }

    /* renamed from: Q */
    public final void mo100803Q(int i, List<?> list, C34372g2 g2Var) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo100801O(i, list.get(size), g2Var);
        }
    }

    /* renamed from: Q0 */
    public abstract void mo101255Q0(String str);

    /* renamed from: R0 */
    public abstract void mo101256R0(int i, int i2);

    /* renamed from: S */
    public <K, V> void mo100805S(int i, C34363f1.C34365b<K, V> bVar, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            int c0 = mo101265c0();
            m139578J0(this, 2, bVar.f83270c, next.getValue());
            m139578J0(this, 1, bVar.f83268a, next.getKey());
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
        }
    }

    /* renamed from: S0 */
    public final void mo101257S0(int i, C34467u0 u0Var, boolean z) throws IOException {
        if (z) {
            mo101270r0((u0Var.size() * 5) + 10);
            int c0 = mo101265c0();
            for (int size = u0Var.size() - 1; size >= 0; size--) {
                mo101261W0(u0Var.getInt(size));
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = u0Var.size() - 1; size2 >= 0; size2--) {
            mo100821p(i, u0Var.getInt(size2));
        }
    }

    /* renamed from: T0 */
    public final void mo101258T0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo101270r0((list.size() * 5) + 10);
            int c0 = mo101265c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo101261W0(list.get(size).intValue());
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo100821p(i, list.get(size2).intValue());
        }
    }

    /* renamed from: U0 */
    public final void mo101259U0(int i, C34351d1 d1Var, boolean z) throws IOException {
        if (z) {
            mo101270r0((d1Var.size() * 10) + 10);
            int c0 = mo101265c0();
            for (int size = d1Var.size() - 1; size >= 0; size--) {
                mo101262X0(d1Var.getLong(size));
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = d1Var.size() - 1; size2 >= 0; size2--) {
            mo100812g(i, d1Var.getLong(size2));
        }
    }

    /* renamed from: V0 */
    public final void mo101260V0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            mo101270r0((list.size() * 10) + 10);
            int c0 = mo101265c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo101262X0(list.get(size).longValue());
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo100812g(i, list.get(size2).longValue());
        }
    }

    /* renamed from: W0 */
    public abstract void mo101261W0(int i);

    /* renamed from: X0 */
    public abstract void mo101262X0(long j);

    /* renamed from: Z */
    public final Queue<C34347d> mo101263Z() {
        mo101264b0();
        return this.f83360c;
    }

    /* renamed from: a */
    public final void mo100806a(int i, List<Float> list, boolean z) throws IOException {
        if (list instanceof C34433p0) {
            mo101243D0(i, (C34433p0) list, z);
        } else {
            mo101244E0(i, list, z);
        }
    }

    /* renamed from: b */
    public final void mo100807b(int i, Object obj) throws IOException {
        mo101256R0(1, 4);
        if (obj instanceof ByteString) {
            mo100802P(3, (ByteString) obj);
        } else {
            mo100828w(3, obj);
        }
        mo100821p(2, i);
        mo101256R0(1, 3);
    }

    /* renamed from: b0 */
    public abstract void mo101264b0();

    /* renamed from: c0 */
    public abstract int mo101265c0();

    /* renamed from: d */
    public final void mo100809d(int i, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo100791E(i, list.get(size));
        }
    }

    /* renamed from: e */
    public final void mo100810e(int i, List<String> list) throws IOException {
        if (list instanceof C34324a1) {
            C34324a1 a1Var = (C34324a1) list;
            for (int size = list.size() - 1; size >= 0; size--) {
                mo101248I0(i, a1Var.mo100871g0(size));
            }
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo100811f(i, list.get(size2));
        }
    }

    /* renamed from: f0 */
    public final C34347d mo101266f0() {
        return this.f83358a.mo101378a(this.f83359b);
    }

    /* renamed from: g0 */
    public final C34347d mo101267g0(int i) {
        return this.f83358a.mo101378a(Math.max(i, this.f83359b));
    }

    /* renamed from: h */
    public final void mo100813h(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof C34467u0) {
            mo101246G0(i, (C34467u0) list, z);
        } else {
            mo101247H0(i, list, z);
        }
    }

    /* renamed from: j */
    public final void mo100815j(int i, long j) throws IOException {
        mo100825t(i, j);
    }

    /* renamed from: j0 */
    public final C34347d mo101268j0() {
        return this.f83358a.mo101379b(this.f83359b);
    }

    /* renamed from: k */
    public final void mo100816k(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof C34467u0) {
            mo101277y0(i, (C34467u0) list, z);
        } else {
            mo101278z0(i, list, z);
        }
    }

    /* renamed from: k0 */
    public final C34347d mo101269k0(int i) {
        return this.f83358a.mo101379b(Math.max(i, this.f83359b));
    }

    /* renamed from: l */
    public final void mo100817l(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof C34467u0) {
            mo101257S0(i, (C34467u0) list, z);
        } else {
            mo101258T0(i, list, z);
        }
    }

    /* renamed from: m */
    public final void mo100818m(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof C34351d1) {
            mo101253O0(i, (C34351d1) list, z);
        } else {
            mo101254P0(i, list, z);
        }
    }

    /* renamed from: o */
    public final void mo100820o(int i, List<Integer> list, boolean z) throws IOException {
        mo100813h(i, list, z);
    }

    /* renamed from: q */
    public final void mo100822q(int i, double d) throws IOException {
        mo100825t(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void mo100823r(int i, List<Long> list, boolean z) throws IOException {
        mo100788B(i, list, z);
    }

    /* renamed from: r0 */
    public abstract void mo101270r0(int i);

    /* renamed from: s */
    public final void mo100824s(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof C34351d1) {
            mo101259U0(i, (C34351d1) list, z);
        } else {
            mo101260V0(i, list, z);
        }
    }

    /* renamed from: s0 */
    public abstract void mo101271s0(boolean z);

    /* renamed from: t0 */
    public final void mo101272t0(int i, C34419n nVar, boolean z) throws IOException {
        if (z) {
            mo101270r0(nVar.size() + 10);
            int c0 = mo101265c0();
            for (int size = nVar.size() - 1; size >= 0; size--) {
                mo101271s0(nVar.mo101363C(size));
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = nVar.size() - 1; size2 >= 0; size2--) {
            mo100830y(i, nVar.mo101363C(size2));
        }
    }

    /* renamed from: u */
    public final Writer.FieldOrder mo100826u() {
        return Writer.FieldOrder.DESCENDING;
    }

    /* renamed from: u0 */
    public final void mo101273u0(int i, List<Boolean> list, boolean z) throws IOException {
        if (z) {
            mo101270r0(list.size() + 10);
            int c0 = mo101265c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo101271s0(list.get(size).booleanValue());
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo100830y(i, list.get(size2).booleanValue());
        }
    }

    /* renamed from: v */
    public final void mo100827v(int i, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo100828w(i, list.get(size));
        }
    }

    /* renamed from: v0 */
    public final void mo101274v0(int i, C34470v vVar, boolean z) throws IOException {
        if (z) {
            mo101270r0((vVar.size() * 8) + 10);
            int c0 = mo101265c0();
            for (int size = vVar.size() - 1; size >= 0; size--) {
                mo101240A0(Double.doubleToRawLongBits(vVar.getDouble(size)));
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = vVar.size() - 1; size2 >= 0; size2--) {
            mo100822q(i, vVar.getDouble(size2));
        }
    }

    /* renamed from: w0 */
    public final void mo101275w0(int i, List<Double> list, boolean z) throws IOException {
        if (z) {
            mo101270r0((list.size() * 8) + 10);
            int c0 = mo101265c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo101240A0(Double.doubleToRawLongBits(list.get(size).doubleValue()));
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo100822q(i, list.get(size2).doubleValue());
        }
    }

    /* renamed from: x */
    public final void mo100829x(int i, long j) throws IOException {
        mo100812g(i, j);
    }

    /* renamed from: x0 */
    public abstract void mo101276x0(int i);

    /* renamed from: y0 */
    public final void mo101277y0(int i, C34467u0 u0Var, boolean z) throws IOException {
        if (z) {
            mo101270r0((u0Var.size() * 4) + 10);
            int c0 = mo101265c0();
            for (int size = u0Var.size() - 1; size >= 0; size--) {
                mo101276x0(u0Var.getInt(size));
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = u0Var.size() - 1; size2 >= 0; size2--) {
            mo100808c(i, u0Var.getInt(size2));
        }
    }

    /* renamed from: z */
    public final void mo100831z(int i, int i2) throws IOException {
        mo100808c(i, i2);
    }

    /* renamed from: z0 */
    public final void mo101278z0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo101270r0((list.size() * 4) + 10);
            int c0 = mo101265c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo101276x0(list.get(size).intValue());
            }
            mo101261W0(mo101265c0() - c0);
            mo101256R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo100808c(i, list.get(size2).intValue());
        }
    }

    public C34405l(C34423o oVar, int i) {
        this.f83360c = new ArrayDeque<>(4);
        if (i > 0) {
            this.f83358a = (C34423o) C34471v0.m140574e(oVar, "alloc");
            this.f83359b = i;
            return;
        }
        throw new IllegalArgumentException("chunkSize must be > 0");
    }
}
