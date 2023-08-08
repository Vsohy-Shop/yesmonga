package com.google.protobuf;

import com.google.protobuf.C34412l1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C11354n;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.protobuf.s */
public abstract class C34448s {

    /* renamed from: f */
    public static final int f83458f = 4096;

    /* renamed from: g */
    public static final int f83459g = 100;

    /* renamed from: h */
    public static final int f83460h = Integer.MAX_VALUE;

    /* renamed from: a */
    public int f83461a;

    /* renamed from: b */
    public int f83462b;

    /* renamed from: c */
    public int f83463c;

    /* renamed from: d */
    public C34460t f83464d;

    /* renamed from: e */
    public boolean f83465e;

    /* renamed from: com.google.protobuf.s$b */
    public static final class C34450b extends C34448s {

        /* renamed from: i */
        public final byte[] f83466i;

        /* renamed from: j */
        public final boolean f83467j;

        /* renamed from: k */
        public int f83468k;

        /* renamed from: l */
        public int f83469l;

        /* renamed from: m */
        public int f83470m;

        /* renamed from: n */
        public int f83471n;

        /* renamed from: o */
        public int f83472o;

        /* renamed from: p */
        public boolean f83473p;

        /* renamed from: q */
        public int f83474q;

        /* renamed from: A */
        public int mo101503A() throws IOException {
            return mo101514L();
        }

        /* renamed from: B */
        public long mo101504B() throws IOException {
            return mo101515M();
        }

        /* renamed from: C */
        public float mo101505C() throws IOException {
            return Float.intBitsToFloat(mo101514L());
        }

        /* renamed from: D */
        public <T extends C34412l1> T mo101506D(int i, C34504y1<T> y1Var, C34368g0 g0Var) throws IOException {
            int i2 = this.f83461a;
            if (i2 < this.f83462b) {
                this.f83461a = i2 + 1;
                T t = (C34412l1) y1Var.mo100482z(this, g0Var);
                mo101527a(WireFormat.m138723c(i, 4));
                this.f83461a--;
                return t;
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: E */
        public void mo101507E(int i, C34412l1.C34413a aVar, C34368g0 g0Var) throws IOException {
            int i2 = this.f83461a;
            if (i2 < this.f83462b) {
                this.f83461a = i2 + 1;
                aVar.mo100459G1(this, g0Var);
                mo101527a(WireFormat.m138723c(i, 4));
                this.f83461a--;
                return;
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: F */
        public int mo101508F() throws IOException {
            return mo101516N();
        }

        /* renamed from: G */
        public long mo101509G() throws IOException {
            return mo101517Q();
        }

        /* renamed from: H */
        public <T extends C34412l1> T mo101510H(C34504y1<T> y1Var, C34368g0 g0Var) throws IOException {
            int N = mo101516N();
            if (this.f83461a < this.f83462b) {
                int t = mo101547t(N);
                this.f83461a++;
                T t2 = (C34412l1) y1Var.mo100482z(this, g0Var);
                mo101527a(0);
                this.f83461a--;
                if (mo101535f() == 0) {
                    mo101546s(t);
                    return t2;
                }
                throw InvalidProtocolBufferException.m138422n();
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: I */
        public void mo101511I(C34412l1.C34413a aVar, C34368g0 g0Var) throws IOException {
            int N = mo101516N();
            if (this.f83461a < this.f83462b) {
                int t = mo101547t(N);
                this.f83461a++;
                aVar.mo100459G1(this, g0Var);
                mo101527a(0);
                this.f83461a--;
                if (mo101535f() == 0) {
                    mo101546s(t);
                    return;
                }
                throw InvalidProtocolBufferException.m138422n();
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: J */
        public byte mo101512J() throws IOException {
            int i = this.f83470m;
            if (i != this.f83468k) {
                byte[] bArr = this.f83466i;
                this.f83470m = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m138422n();
        }

        /* renamed from: K */
        public byte[] mo101513K(int i) throws IOException {
            if (i > 0) {
                int i2 = this.f83468k;
                int i3 = this.f83470m;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f83470m = i4;
                    return Arrays.copyOfRange(this.f83466i, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.m138422n();
            } else if (i == 0) {
                return C34471v0.f83532d;
            } else {
                throw InvalidProtocolBufferException.m138418h();
            }
        }

        /* renamed from: L */
        public int mo101514L() throws IOException {
            int i = this.f83470m;
            if (this.f83468k - i >= 4) {
                byte[] bArr = this.f83466i;
                this.f83470m = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0);
            }
            throw InvalidProtocolBufferException.m138422n();
        }

        /* renamed from: M */
        public long mo101515M() throws IOException {
            int i = this.f83470m;
            if (this.f83468k - i >= 8) {
                byte[] bArr = this.f83466i;
                this.f83470m = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.m138422n();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo101516N() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f83470m
                int r1 = r5.f83468k
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f83466i
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f83470m = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo101518R()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f83470m = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34450b.mo101516N():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: Q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo101517Q() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f83470m
                int r1 = r11.f83468k
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f83466i
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f83470m = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo101518R()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f83470m = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34450b.mo101517Q():long");
        }

        /* renamed from: R */
        public long mo101518R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo101512J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & C11354n.f28471b) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m138417g();
        }

        /* renamed from: S */
        public int mo101519S() throws IOException {
            return mo101514L();
        }

        /* renamed from: T */
        public long mo101520T() throws IOException {
            return mo101515M();
        }

        /* renamed from: U */
        public int mo101521U() throws IOException {
            return C34448s.m140146b(mo101516N());
        }

        /* renamed from: V */
        public long mo101522V() throws IOException {
            return C34448s.m140147c(mo101517Q());
        }

        /* renamed from: W */
        public String mo101523W() throws IOException {
            int N = mo101516N();
            if (N > 0) {
                int i = this.f83468k;
                int i2 = this.f83470m;
                if (N <= i - i2) {
                    String str = new String(this.f83466i, i2, N, C34471v0.f83529a);
                    this.f83470m += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.m138418h();
            }
            throw InvalidProtocolBufferException.m138422n();
        }

        /* renamed from: X */
        public String mo101524X() throws IOException {
            int N = mo101516N();
            if (N > 0) {
                int i = this.f83468k;
                int i2 = this.f83470m;
                if (N <= i - i2) {
                    String h = Utf8.m138630h(this.f83466i, i2, N);
                    this.f83470m += N;
                    return h;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N <= 0) {
                throw InvalidProtocolBufferException.m138418h();
            }
            throw InvalidProtocolBufferException.m138422n();
        }

        /* renamed from: Y */
        public int mo101525Y() throws IOException {
            if (mo101541i()) {
                this.f83472o = 0;
                return 0;
            }
            int N = mo101516N();
            this.f83472o = N;
            if (WireFormat.m138721a(N) != 0) {
                return this.f83472o;
            }
            throw InvalidProtocolBufferException.m138414d();
        }

        /* renamed from: Z */
        public int mo101526Z() throws IOException {
            return mo101516N();
        }

        /* renamed from: a */
        public void mo101527a(int i) throws InvalidProtocolBufferException {
            if (this.f83472o != i) {
                throw InvalidProtocolBufferException.m138413c();
            }
        }

        /* renamed from: a0 */
        public long mo101528a0() throws IOException {
            return mo101517Q();
        }

        @Deprecated
        /* renamed from: b0 */
        public void mo101529b0(int i, C34412l1.C34413a aVar) throws IOException {
            mo101507E(i, aVar, C34368g0.m139242d());
        }

        /* renamed from: c0 */
        public void mo101530c0() {
            this.f83471n = this.f83470m;
        }

        /* renamed from: e */
        public void mo101533e(boolean z) {
            this.f83473p = z;
        }

        /* renamed from: f */
        public int mo101535f() {
            int i = this.f83474q;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo101539h();
        }

        /* renamed from: g */
        public int mo101537g() {
            return this.f83472o;
        }

        /* renamed from: g0 */
        public boolean mo101538g0(int i) throws IOException {
            int b = WireFormat.m138722b(i);
            if (b == 0) {
                mo101555n0();
                return true;
            } else if (b == 1) {
                mo101544k0(8);
                return true;
            } else if (b == 2) {
                mo101544k0(mo101516N());
                return true;
            } else if (b == 3) {
                mo101542i0();
                mo101527a(WireFormat.m138723c(WireFormat.m138721a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo101544k0(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m138416f();
            }
        }

        /* renamed from: h */
        public int mo101539h() {
            return this.f83470m - this.f83471n;
        }

        /* renamed from: h0 */
        public boolean mo101540h0(int i, CodedOutputStream codedOutputStream) throws IOException {
            int b = WireFormat.m138722b(i);
            if (b == 0) {
                long G = mo101509G();
                codedOutputStream.mo99318Z1(i);
                codedOutputStream.mo99335i2(G);
                return true;
            } else if (b == 1) {
                long M = mo101515M();
                codedOutputStream.mo99318Z1(i);
                codedOutputStream.mo99286D1(M);
                return true;
            } else if (b == 2) {
                ByteString x = mo101551x();
                codedOutputStream.mo99318Z1(i);
                codedOutputStream.mo99352z1(x);
                return true;
            } else if (b == 3) {
                codedOutputStream.mo99318Z1(i);
                mo101543j0(codedOutputStream);
                int c = WireFormat.m138723c(WireFormat.m138721a(i), 4);
                mo101527a(c);
                codedOutputStream.mo99318Z1(c);
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    int L = mo101514L();
                    codedOutputStream.mo99318Z1(i);
                    codedOutputStream.mo99285C1(L);
                    return true;
                }
                throw InvalidProtocolBufferException.m138416f();
            }
        }

        /* renamed from: i */
        public boolean mo101541i() throws IOException {
            return this.f83470m == this.f83468k;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: i0 */
        public void mo101542i0() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo101525Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo101538g0(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34450b.mo101542i0():void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: j0 */
        public void mo101543j0(com.google.protobuf.CodedOutputStream r2) throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo101525Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo101540h0(r0, r2)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34450b.mo101543j0(com.google.protobuf.CodedOutputStream):void");
        }

        /* renamed from: k0 */
        public void mo101544k0(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f83468k;
                int i3 = this.f83470m;
                if (i <= i2 - i3) {
                    this.f83470m = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.m138418h();
            }
            throw InvalidProtocolBufferException.m138422n();
        }

        /* renamed from: m0 */
        public final void mo101554m0() {
            int i = this.f83468k + this.f83469l;
            this.f83468k = i;
            int i2 = i - this.f83471n;
            int i3 = this.f83474q;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f83469l = i4;
                this.f83468k = i - i4;
                return;
            }
            this.f83469l = 0;
        }

        /* renamed from: n0 */
        public final void mo101555n0() throws IOException {
            if (this.f83468k - this.f83470m >= 10) {
                mo101556o0();
            } else {
                mo101557p0();
            }
        }

        /* renamed from: o0 */
        public final void mo101556o0() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f83466i;
                int i2 = this.f83470m;
                this.f83470m = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m138417g();
        }

        /* renamed from: p0 */
        public final void mo101557p0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo101512J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m138417g();
        }

        /* renamed from: s */
        public void mo101546s(int i) {
            this.f83474q = i;
            mo101554m0();
        }

        /* renamed from: t */
        public int mo101547t(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int h = i + mo101539h();
                if (h >= 0) {
                    int i2 = this.f83474q;
                    if (h <= i2) {
                        this.f83474q = h;
                        mo101554m0();
                        return i2;
                    }
                    throw InvalidProtocolBufferException.m138422n();
                }
                throw InvalidProtocolBufferException.m138419i();
            }
            throw InvalidProtocolBufferException.m138418h();
        }

        /* renamed from: u */
        public boolean mo101548u() throws IOException {
            return mo101517Q() != 0;
        }

        /* renamed from: v */
        public byte[] mo101549v() throws IOException {
            return mo101513K(mo101516N());
        }

        /* renamed from: w */
        public ByteBuffer mo101550w() throws IOException {
            ByteBuffer byteBuffer;
            int N = mo101516N();
            if (N > 0) {
                int i = this.f83468k;
                int i2 = this.f83470m;
                if (N <= i - i2) {
                    if (this.f83467j || !this.f83473p) {
                        byteBuffer = ByteBuffer.wrap(Arrays.copyOfRange(this.f83466i, i2, i2 + N));
                    } else {
                        byteBuffer = ByteBuffer.wrap(this.f83466i, i2, N).slice();
                    }
                    this.f83470m += N;
                    return byteBuffer;
                }
            }
            if (N == 0) {
                return C34471v0.f83533e;
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.m138418h();
            }
            throw InvalidProtocolBufferException.m138422n();
        }

        /* renamed from: x */
        public ByteString mo101551x() throws IOException {
            ByteString byteString;
            int N = mo101516N();
            if (N > 0) {
                int i = this.f83468k;
                int i2 = this.f83470m;
                if (N <= i - i2) {
                    if (!this.f83467j || !this.f83473p) {
                        byteString = ByteString.m137258Y(this.f83466i, i2, N);
                    } else {
                        byteString = ByteString.m137257X0(this.f83466i, i2, N);
                    }
                    this.f83470m += N;
                    return byteString;
                }
            }
            if (N == 0) {
                return ByteString.f82785d;
            }
            return ByteString.m137255W0(mo101513K(N));
        }

        /* renamed from: y */
        public double mo101552y() throws IOException {
            return Double.longBitsToDouble(mo101515M());
        }

        /* renamed from: z */
        public int mo101553z() throws IOException {
            return mo101516N();
        }

        public C34450b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f83474q = Integer.MAX_VALUE;
            this.f83466i = bArr;
            this.f83468k = i2 + i;
            this.f83470m = i;
            this.f83471n = i;
            this.f83467j = z;
        }
    }

    /* renamed from: com.google.protobuf.s$c */
    public static final class C34451c extends C34448s {

        /* renamed from: i */
        public Iterable<ByteBuffer> f83475i;

        /* renamed from: j */
        public Iterator<ByteBuffer> f83476j;

        /* renamed from: k */
        public ByteBuffer f83477k;

        /* renamed from: l */
        public boolean f83478l;

        /* renamed from: m */
        public boolean f83479m;

        /* renamed from: n */
        public int f83480n;

        /* renamed from: o */
        public int f83481o;

        /* renamed from: p */
        public int f83482p;

        /* renamed from: q */
        public int f83483q;

        /* renamed from: r */
        public int f83484r;

        /* renamed from: s */
        public int f83485s;

        /* renamed from: t */
        public long f83486t;

        /* renamed from: u */
        public long f83487u;

        /* renamed from: v */
        public long f83488v;

        /* renamed from: w */
        public long f83489w;

        /* renamed from: A */
        public int mo101503A() throws IOException {
            return mo101514L();
        }

        /* renamed from: B */
        public long mo101504B() throws IOException {
            return mo101515M();
        }

        /* renamed from: C */
        public float mo101505C() throws IOException {
            return Float.intBitsToFloat(mo101514L());
        }

        /* renamed from: D */
        public <T extends C34412l1> T mo101506D(int i, C34504y1<T> y1Var, C34368g0 g0Var) throws IOException {
            int i2 = this.f83461a;
            if (i2 < this.f83462b) {
                this.f83461a = i2 + 1;
                T t = (C34412l1) y1Var.mo100482z(this, g0Var);
                mo101527a(WireFormat.m138723c(i, 4));
                this.f83461a--;
                return t;
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: E */
        public void mo101507E(int i, C34412l1.C34413a aVar, C34368g0 g0Var) throws IOException {
            int i2 = this.f83461a;
            if (i2 < this.f83462b) {
                this.f83461a = i2 + 1;
                aVar.mo100459G1(this, g0Var);
                mo101527a(WireFormat.m138723c(i, 4));
                this.f83461a--;
                return;
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: F */
        public int mo101508F() throws IOException {
            return mo101516N();
        }

        /* renamed from: G */
        public long mo101509G() throws IOException {
            return mo101517Q();
        }

        /* renamed from: H */
        public <T extends C34412l1> T mo101510H(C34504y1<T> y1Var, C34368g0 g0Var) throws IOException {
            int N = mo101516N();
            if (this.f83461a < this.f83462b) {
                int t = mo101547t(N);
                this.f83461a++;
                T t2 = (C34412l1) y1Var.mo100482z(this, g0Var);
                mo101527a(0);
                this.f83461a--;
                if (mo101535f() == 0) {
                    mo101546s(t);
                    return t2;
                }
                throw InvalidProtocolBufferException.m138422n();
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: I */
        public void mo101511I(C34412l1.C34413a aVar, C34368g0 g0Var) throws IOException {
            int N = mo101516N();
            if (this.f83461a < this.f83462b) {
                int t = mo101547t(N);
                this.f83461a++;
                aVar.mo100459G1(this, g0Var);
                mo101527a(0);
                this.f83461a--;
                if (mo101535f() == 0) {
                    mo101546s(t);
                    return;
                }
                throw InvalidProtocolBufferException.m138422n();
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: J */
        public byte mo101512J() throws IOException {
            if (mo101558m0() == 0) {
                mo101559n0();
            }
            long j = this.f83486t;
            this.f83486t = 1 + j;
            return C34341c3.m138951A(j);
        }

        /* renamed from: K */
        public byte[] mo101513K(int i) throws IOException {
            if (i >= 0) {
                long j = (long) i;
                if (j <= mo101558m0()) {
                    byte[] bArr = new byte[i];
                    C34341c3.m139007p(this.f83486t, bArr, 0, j);
                    this.f83486t += j;
                    return bArr;
                }
            }
            if (i >= 0 && i <= mo101562q0()) {
                byte[] bArr2 = new byte[i];
                mo101560o0(bArr2, 0, i);
                return bArr2;
            } else if (i > 0) {
                throw InvalidProtocolBufferException.m138422n();
            } else if (i == 0) {
                return C34471v0.f83532d;
            } else {
                throw InvalidProtocolBufferException.m138418h();
            }
        }

        /* renamed from: L */
        public int mo101514L() throws IOException {
            if (mo101558m0() < 4) {
                return (mo101512J() & 255) | ((mo101512J() & 255) << 8) | ((mo101512J() & 255) << DateTimeFieldType.f30603E0) | ((mo101512J() & 255) << 24);
            }
            long j = this.f83486t;
            this.f83486t = 4 + j;
            return ((C34341c3.m138951A(j + 3) & 255) << 24) | (C34341c3.m138951A(j) & 255) | ((C34341c3.m138951A(1 + j) & 255) << 8) | ((C34341c3.m138951A(2 + j) & 255) << DateTimeFieldType.f30603E0);
        }

        /* renamed from: M */
        public long mo101515M() throws IOException {
            long J;
            byte J2;
            if (mo101558m0() >= 8) {
                long j = this.f83486t;
                this.f83486t = 8 + j;
                J = (((long) C34341c3.m138951A(j)) & 255) | ((((long) C34341c3.m138951A(1 + j)) & 255) << 8) | ((((long) C34341c3.m138951A(2 + j)) & 255) << 16) | ((((long) C34341c3.m138951A(3 + j)) & 255) << 24) | ((((long) C34341c3.m138951A(4 + j)) & 255) << 32) | ((((long) C34341c3.m138951A(5 + j)) & 255) << 40) | ((((long) C34341c3.m138951A(6 + j)) & 255) << 48);
                J2 = C34341c3.m138951A(j + 7);
            } else {
                J = (((long) mo101512J()) & 255) | ((((long) mo101512J()) & 255) << 8) | ((((long) mo101512J()) & 255) << 16) | ((((long) mo101512J()) & 255) << 24) | ((((long) mo101512J()) & 255) << 32) | ((((long) mo101512J()) & 255) << 40) | ((((long) mo101512J()) & 255) << 48);
                J2 = mo101512J();
            }
            return ((((long) J2) & 255) << 56) | J;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
            if (com.google.protobuf.C34341c3.m138951A(r4) < 0) goto L_0x008a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo101516N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f83486t
                long r2 = r10.f83489w
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x008a
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.C34341c3.m138951A(r0)
                if (r0 < 0) goto L_0x001a
                long r4 = r10.f83486t
                long r4 = r4 + r2
                r10.f83486t = r4
                return r0
            L_0x001a:
                long r6 = r10.f83489w
                long r8 = r10.f83486t
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0026
                goto L_0x008a
            L_0x0026:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0034
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0090
            L_0x0034:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0043
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x0041:
                r6 = r4
                goto L_0x0090
            L_0x0043:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0053
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x0090
            L_0x0053:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r4)
                if (r1 >= 0) goto L_0x0090
            L_0x008a:
                long r0 = r10.mo101518R()
                int r0 = (int) r0
                return r0
            L_0x0090:
                r10.f83486t = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34451c.mo101516N():int");
        }

        /* renamed from: Q */
        public long mo101517Q() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f83486t;
            if (this.f83489w != j4) {
                long j5 = j4 + 1;
                byte A = C34341c3.m138951A(j4);
                if (A >= 0) {
                    this.f83486t++;
                    return (long) A;
                } else if (this.f83489w - this.f83486t >= 10) {
                    long j6 = j5 + 1;
                    byte A2 = A ^ (C34341c3.m138951A(j5) << 7);
                    if (A2 < 0) {
                        b = A2 ^ C11354n.f28471b;
                    } else {
                        long j7 = j6 + 1;
                        byte A3 = A2 ^ (C34341c3.m138951A(j6) << DateTimeFieldType.f30624Y);
                        if (A3 >= 0) {
                            j = (long) (A3 ^ C11354n.f28471b);
                        } else {
                            j6 = j7 + 1;
                            byte A4 = A3 ^ (C34341c3.m138951A(j7) << DateTimeFieldType.f30608J0);
                            if (A4 < 0) {
                                b = A4 ^ C11354n.f28471b;
                            } else {
                                j7 = j6 + 1;
                                long A5 = ((long) A4) ^ (((long) C34341c3.m138951A(j6)) << 28);
                                if (A5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long A6 = A5 ^ (((long) C34341c3.m138951A(j7)) << 35);
                                    if (A6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        A5 = A6 ^ (((long) C34341c3.m138951A(j8)) << 42);
                                        if (A5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            A6 = A5 ^ (((long) C34341c3.m138951A(j7)) << 49);
                                            if (A6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (A6 ^ (((long) C34341c3.m138951A(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) C34341c3.m138951A(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f83486t = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = A6 ^ j2;
                                    j6 = j8;
                                    this.f83486t = j6;
                                    return j;
                                }
                                j = A5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f83486t = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f83486t = j6;
                    return j;
                }
            }
            return mo101518R();
        }

        /* renamed from: R */
        public long mo101518R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo101512J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & C11354n.f28471b) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m138417g();
        }

        /* renamed from: S */
        public int mo101519S() throws IOException {
            return mo101514L();
        }

        /* renamed from: T */
        public long mo101520T() throws IOException {
            return mo101515M();
        }

        /* renamed from: U */
        public int mo101521U() throws IOException {
            return C34448s.m140146b(mo101516N());
        }

        /* renamed from: V */
        public long mo101522V() throws IOException {
            return C34448s.m140147c(mo101517Q());
        }

        /* renamed from: W */
        public String mo101523W() throws IOException {
            int N = mo101516N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f83489w;
                long j3 = this.f83486t;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[N];
                    C34341c3.m139007p(j3, bArr, 0, j);
                    String str = new String(bArr, C34471v0.f83529a);
                    this.f83486t += j;
                    return str;
                }
            }
            if (N > 0 && N <= mo101562q0()) {
                byte[] bArr2 = new byte[N];
                mo101560o0(bArr2, 0, N);
                return new String(bArr2, C34471v0.f83529a);
            } else if (N == 0) {
                return "";
            } else {
                if (N < 0) {
                    throw InvalidProtocolBufferException.m138418h();
                }
                throw InvalidProtocolBufferException.m138422n();
            }
        }

        /* renamed from: X */
        public String mo101524X() throws IOException {
            int N = mo101516N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f83489w;
                long j3 = this.f83486t;
                if (j <= j2 - j3) {
                    String g = Utf8.m138629g(this.f83477k, (int) (j3 - this.f83487u), N);
                    this.f83486t += j;
                    return g;
                }
            }
            if (N >= 0 && N <= mo101562q0()) {
                byte[] bArr = new byte[N];
                mo101560o0(bArr, 0, N);
                return Utf8.m138630h(bArr, 0, N);
            } else if (N == 0) {
                return "";
            } else {
                if (N <= 0) {
                    throw InvalidProtocolBufferException.m138418h();
                }
                throw InvalidProtocolBufferException.m138422n();
            }
        }

        /* renamed from: Y */
        public int mo101525Y() throws IOException {
            if (mo101541i()) {
                this.f83483q = 0;
                return 0;
            }
            int N = mo101516N();
            this.f83483q = N;
            if (WireFormat.m138721a(N) != 0) {
                return this.f83483q;
            }
            throw InvalidProtocolBufferException.m138414d();
        }

        /* renamed from: Z */
        public int mo101526Z() throws IOException {
            return mo101516N();
        }

        /* renamed from: a */
        public void mo101527a(int i) throws InvalidProtocolBufferException {
            if (this.f83483q != i) {
                throw InvalidProtocolBufferException.m138413c();
            }
        }

        /* renamed from: a0 */
        public long mo101528a0() throws IOException {
            return mo101517Q();
        }

        @Deprecated
        /* renamed from: b0 */
        public void mo101529b0(int i, C34412l1.C34413a aVar) throws IOException {
            mo101507E(i, aVar, C34368g0.m139242d());
        }

        /* renamed from: c0 */
        public void mo101530c0() {
            this.f83485s = (int) ((((long) this.f83484r) + this.f83486t) - this.f83487u);
        }

        /* renamed from: e */
        public void mo101533e(boolean z) {
            this.f83479m = z;
        }

        /* renamed from: f */
        public int mo101535f() {
            int i = this.f83482p;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo101539h();
        }

        /* renamed from: g */
        public int mo101537g() {
            return this.f83483q;
        }

        /* renamed from: g0 */
        public boolean mo101538g0(int i) throws IOException {
            int b = WireFormat.m138722b(i);
            if (b == 0) {
                mo101563r0();
                return true;
            } else if (b == 1) {
                mo101544k0(8);
                return true;
            } else if (b == 2) {
                mo101544k0(mo101516N());
                return true;
            } else if (b == 3) {
                mo101542i0();
                mo101527a(WireFormat.m138723c(WireFormat.m138721a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo101544k0(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m138416f();
            }
        }

        /* renamed from: h */
        public int mo101539h() {
            return (int) ((((long) (this.f83484r - this.f83485s)) + this.f83486t) - this.f83487u);
        }

        /* renamed from: h0 */
        public boolean mo101540h0(int i, CodedOutputStream codedOutputStream) throws IOException {
            int b = WireFormat.m138722b(i);
            if (b == 0) {
                long G = mo101509G();
                codedOutputStream.mo99318Z1(i);
                codedOutputStream.mo99335i2(G);
                return true;
            } else if (b == 1) {
                long M = mo101515M();
                codedOutputStream.mo99318Z1(i);
                codedOutputStream.mo99286D1(M);
                return true;
            } else if (b == 2) {
                ByteString x = mo101551x();
                codedOutputStream.mo99318Z1(i);
                codedOutputStream.mo99352z1(x);
                return true;
            } else if (b == 3) {
                codedOutputStream.mo99318Z1(i);
                mo101543j0(codedOutputStream);
                int c = WireFormat.m138723c(WireFormat.m138721a(i), 4);
                mo101527a(c);
                codedOutputStream.mo99318Z1(c);
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    int L = mo101514L();
                    codedOutputStream.mo99318Z1(i);
                    codedOutputStream.mo99285C1(L);
                    return true;
                }
                throw InvalidProtocolBufferException.m138416f();
            }
        }

        /* renamed from: i */
        public boolean mo101541i() throws IOException {
            return (((long) this.f83484r) + this.f83486t) - this.f83487u == ((long) this.f83480n);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: i0 */
        public void mo101542i0() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo101525Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo101538g0(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34451c.mo101542i0():void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: j0 */
        public void mo101543j0(com.google.protobuf.CodedOutputStream r2) throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo101525Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo101540h0(r0, r2)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34451c.mo101543j0(com.google.protobuf.CodedOutputStream):void");
        }

        /* renamed from: k0 */
        public void mo101544k0(int i) throws IOException {
            if (i >= 0 && ((long) i) <= (((long) (this.f83480n - this.f83484r)) - this.f83486t) + this.f83487u) {
                while (i > 0) {
                    if (mo101558m0() == 0) {
                        mo101559n0();
                    }
                    int min = Math.min(i, (int) mo101558m0());
                    i -= min;
                    this.f83486t += (long) min;
                }
            } else if (i < 0) {
                throw InvalidProtocolBufferException.m138418h();
            } else {
                throw InvalidProtocolBufferException.m138422n();
            }
        }

        /* renamed from: m0 */
        public final long mo101558m0() {
            return this.f83489w - this.f83486t;
        }

        /* renamed from: n0 */
        public final void mo101559n0() throws InvalidProtocolBufferException {
            if (this.f83476j.hasNext()) {
                mo101565t0();
                return;
            }
            throw InvalidProtocolBufferException.m138422n();
        }

        /* renamed from: o0 */
        public final void mo101560o0(byte[] bArr, int i, int i2) throws IOException {
            if (i2 >= 0 && i2 <= mo101562q0()) {
                int i3 = i2;
                while (i3 > 0) {
                    if (mo101558m0() == 0) {
                        mo101559n0();
                    }
                    int min = Math.min(i3, (int) mo101558m0());
                    long j = (long) min;
                    C34341c3.m139007p(this.f83486t, bArr, (long) ((i2 - i3) + i), j);
                    i3 -= min;
                    this.f83486t += j;
                }
            } else if (i2 > 0) {
                throw InvalidProtocolBufferException.m138422n();
            } else if (i2 != 0) {
                throw InvalidProtocolBufferException.m138418h();
            }
        }

        /* renamed from: p0 */
        public final void mo101561p0() {
            int i = this.f83480n + this.f83481o;
            this.f83480n = i;
            int i2 = i - this.f83485s;
            int i3 = this.f83482p;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f83481o = i4;
                this.f83480n = i - i4;
                return;
            }
            this.f83481o = 0;
        }

        /* renamed from: q0 */
        public final int mo101562q0() {
            return (int) ((((long) (this.f83480n - this.f83484r)) - this.f83486t) + this.f83487u);
        }

        /* renamed from: r0 */
        public final void mo101563r0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo101512J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m138417g();
        }

        /* renamed from: s */
        public void mo101546s(int i) {
            this.f83482p = i;
            mo101561p0();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
            throw com.google.protobuf.InvalidProtocolBufferException.m138422n();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
            r3.f83477k.position(r0);
            r3.f83477k.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0029 */
        /* renamed from: s0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.nio.ByteBuffer mo101564s0(int r4, int r5) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f83477k
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f83477k
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f83477k     // Catch:{ IllegalArgumentException -> 0x0029 }
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r3.f83477k     // Catch:{ IllegalArgumentException -> 0x0029 }
                r4.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r3.f83477k     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r5 = r3.f83477k
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f83477k
                r5.limit(r1)
                return r4
            L_0x0027:
                r4 = move-exception
                goto L_0x002e
            L_0x0029:
                com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.m138422n()     // Catch:{ all -> 0x0027 }
                throw r4     // Catch:{ all -> 0x0027 }
            L_0x002e:
                java.nio.ByteBuffer r5 = r3.f83477k
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f83477k
                r5.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34451c.mo101564s0(int, int):java.nio.ByteBuffer");
        }

        /* renamed from: t */
        public int mo101547t(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int h = i + mo101539h();
                int i2 = this.f83482p;
                if (h <= i2) {
                    this.f83482p = h;
                    mo101561p0();
                    return i2;
                }
                throw InvalidProtocolBufferException.m138422n();
            }
            throw InvalidProtocolBufferException.m138418h();
        }

        /* renamed from: t0 */
        public final void mo101565t0() {
            ByteBuffer next = this.f83476j.next();
            this.f83477k = next;
            this.f83484r += (int) (this.f83486t - this.f83487u);
            long position = (long) next.position();
            this.f83486t = position;
            this.f83487u = position;
            this.f83489w = (long) this.f83477k.limit();
            long k = C34341c3.m138997k(this.f83477k);
            this.f83488v = k;
            this.f83486t += k;
            this.f83487u += k;
            this.f83489w += k;
        }

        /* renamed from: u */
        public boolean mo101548u() throws IOException {
            return mo101517Q() != 0;
        }

        /* renamed from: v */
        public byte[] mo101549v() throws IOException {
            return mo101513K(mo101516N());
        }

        /* renamed from: w */
        public ByteBuffer mo101550w() throws IOException {
            int N = mo101516N();
            if (N > 0) {
                long j = (long) N;
                if (j <= mo101558m0()) {
                    if (this.f83478l || !this.f83479m) {
                        byte[] bArr = new byte[N];
                        C34341c3.m139007p(this.f83486t, bArr, 0, j);
                        this.f83486t += j;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j2 = this.f83486t + j;
                    this.f83486t = j2;
                    long j3 = this.f83488v;
                    return mo101564s0((int) ((j2 - j3) - j), (int) (j2 - j3));
                }
            }
            if (N > 0 && N <= mo101562q0()) {
                byte[] bArr2 = new byte[N];
                mo101560o0(bArr2, 0, N);
                return ByteBuffer.wrap(bArr2);
            } else if (N == 0) {
                return C34471v0.f83533e;
            } else {
                if (N < 0) {
                    throw InvalidProtocolBufferException.m138418h();
                }
                throw InvalidProtocolBufferException.m138422n();
            }
        }

        /* renamed from: x */
        public ByteString mo101551x() throws IOException {
            int N = mo101516N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f83489w;
                long j3 = this.f83486t;
                if (j <= j2 - j3) {
                    if (!this.f83478l || !this.f83479m) {
                        byte[] bArr = new byte[N];
                        C34341c3.m139007p(j3, bArr, 0, j);
                        this.f83486t += j;
                        return ByteString.m137255W0(bArr);
                    }
                    int i = (int) (j3 - this.f83488v);
                    ByteString V0 = ByteString.m137253V0(mo101564s0(i, N + i));
                    this.f83486t += j;
                    return V0;
                }
            }
            if (N <= 0 || N > mo101562q0()) {
                if (N == 0) {
                    return ByteString.f82785d;
                }
                if (N < 0) {
                    throw InvalidProtocolBufferException.m138418h();
                }
                throw InvalidProtocolBufferException.m138422n();
            } else if (!this.f83478l || !this.f83479m) {
                byte[] bArr2 = new byte[N];
                mo101560o0(bArr2, 0, N);
                return ByteString.m137255W0(bArr2);
            } else {
                ArrayList arrayList = new ArrayList();
                while (N > 0) {
                    if (mo101558m0() == 0) {
                        mo101559n0();
                    }
                    int min = Math.min(N, (int) mo101558m0());
                    int i2 = (int) (this.f83486t - this.f83488v);
                    arrayList.add(ByteString.m137253V0(mo101564s0(i2, i2 + min)));
                    N -= min;
                    this.f83486t += (long) min;
                }
                return ByteString.m137243A(arrayList);
            }
        }

        /* renamed from: y */
        public double mo101552y() throws IOException {
            return Double.longBitsToDouble(mo101515M());
        }

        /* renamed from: z */
        public int mo101553z() throws IOException {
            return mo101516N();
        }

        public C34451c(Iterable<ByteBuffer> iterable, int i, boolean z) {
            super();
            this.f83482p = Integer.MAX_VALUE;
            this.f83480n = i;
            this.f83475i = iterable;
            this.f83476j = iterable.iterator();
            this.f83478l = z;
            this.f83484r = 0;
            this.f83485s = 0;
            if (i == 0) {
                this.f83477k = C34471v0.f83533e;
                this.f83486t = 0;
                this.f83487u = 0;
                this.f83489w = 0;
                this.f83488v = 0;
                return;
            }
            mo101565t0();
        }
    }

    /* renamed from: com.google.protobuf.s$d */
    public static final class C34452d extends C34448s {

        /* renamed from: i */
        public final InputStream f83490i;

        /* renamed from: j */
        public final byte[] f83491j;

        /* renamed from: k */
        public int f83492k;

        /* renamed from: l */
        public int f83493l;

        /* renamed from: m */
        public int f83494m;

        /* renamed from: n */
        public int f83495n;

        /* renamed from: o */
        public int f83496o;

        /* renamed from: p */
        public int f83497p;

        /* renamed from: q */
        public C34453a f83498q;

        /* renamed from: com.google.protobuf.s$d$a */
        public interface C34453a {
            /* renamed from: a */
            void mo101577a();
        }

        /* renamed from: com.google.protobuf.s$d$b */
        public class C34454b implements C34453a {

            /* renamed from: a */
            public int f83499a;

            /* renamed from: b */
            public ByteArrayOutputStream f83500b;

            public C34454b() {
                this.f83499a = C34452d.this.f83494m;
            }

            /* renamed from: a */
            public void mo101577a() {
                if (this.f83500b == null) {
                    this.f83500b = new ByteArrayOutputStream();
                }
                this.f83500b.write(C34452d.this.f83491j, this.f83499a, C34452d.this.f83494m - this.f83499a);
                this.f83499a = 0;
            }

            /* renamed from: b */
            public ByteBuffer mo101578b() {
                ByteArrayOutputStream byteArrayOutputStream = this.f83500b;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(C34452d.this.f83491j, this.f83499a, C34452d.this.f83494m - this.f83499a);
                }
                byteArrayOutputStream.write(C34452d.this.f83491j, this.f83499a, C34452d.this.f83494m);
                return ByteBuffer.wrap(this.f83500b.toByteArray());
            }
        }

        /* renamed from: o0 */
        public static int m140314o0(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e) {
                e.mo100517k();
                throw e;
            }
        }

        /* renamed from: p0 */
        public static int m140315p0(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (InvalidProtocolBufferException e) {
                e.mo100517k();
                throw e;
            }
        }

        /* renamed from: w0 */
        public static long m140316w0(InputStream inputStream, long j) throws IOException {
            try {
                return inputStream.skip(j);
            } catch (InvalidProtocolBufferException e) {
                e.mo100517k();
                throw e;
            }
        }

        /* renamed from: A */
        public int mo101503A() throws IOException {
            return mo101514L();
        }

        /* renamed from: A0 */
        public final void mo101566A0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo101512J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m138417g();
        }

        /* renamed from: B */
        public long mo101504B() throws IOException {
            return mo101515M();
        }

        /* renamed from: B0 */
        public final boolean mo101567B0(int i) throws IOException {
            int i2 = this.f83494m;
            if (i2 + i > this.f83492k) {
                int i3 = this.f83463c;
                int i4 = this.f83496o;
                if (i > (i3 - i4) - i2 || i4 + i2 + i > this.f83497p) {
                    return false;
                }
                C34453a aVar = this.f83498q;
                if (aVar != null) {
                    aVar.mo101577a();
                }
                int i5 = this.f83494m;
                if (i5 > 0) {
                    int i6 = this.f83492k;
                    if (i6 > i5) {
                        byte[] bArr = this.f83491j;
                        System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                    }
                    this.f83496o += i5;
                    this.f83492k -= i5;
                    this.f83494m = 0;
                }
                InputStream inputStream = this.f83490i;
                byte[] bArr2 = this.f83491j;
                int i7 = this.f83492k;
                int p0 = m140315p0(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.f83463c - this.f83496o) - i7));
                if (p0 == 0 || p0 < -1 || p0 > this.f83491j.length) {
                    throw new IllegalStateException(this.f83490i.getClass() + "#read(byte[]) returned invalid result: " + p0 + "\nThe InputStream implementation is buggy.");
                } else if (p0 <= 0) {
                    return false;
                } else {
                    this.f83492k += p0;
                    mo101572u0();
                    if (this.f83492k >= i) {
                        return true;
                    }
                    return mo101567B0(i);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
        }

        /* renamed from: C */
        public float mo101505C() throws IOException {
            return Float.intBitsToFloat(mo101514L());
        }

        /* renamed from: D */
        public <T extends C34412l1> T mo101506D(int i, C34504y1<T> y1Var, C34368g0 g0Var) throws IOException {
            int i2 = this.f83461a;
            if (i2 < this.f83462b) {
                this.f83461a = i2 + 1;
                T t = (C34412l1) y1Var.mo100482z(this, g0Var);
                mo101527a(WireFormat.m138723c(i, 4));
                this.f83461a--;
                return t;
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: E */
        public void mo101507E(int i, C34412l1.C34413a aVar, C34368g0 g0Var) throws IOException {
            int i2 = this.f83461a;
            if (i2 < this.f83462b) {
                this.f83461a = i2 + 1;
                aVar.mo100459G1(this, g0Var);
                mo101527a(WireFormat.m138723c(i, 4));
                this.f83461a--;
                return;
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: F */
        public int mo101508F() throws IOException {
            return mo101516N();
        }

        /* renamed from: G */
        public long mo101509G() throws IOException {
            return mo101517Q();
        }

        /* renamed from: H */
        public <T extends C34412l1> T mo101510H(C34504y1<T> y1Var, C34368g0 g0Var) throws IOException {
            int N = mo101516N();
            if (this.f83461a < this.f83462b) {
                int t = mo101547t(N);
                this.f83461a++;
                T t2 = (C34412l1) y1Var.mo100482z(this, g0Var);
                mo101527a(0);
                this.f83461a--;
                if (mo101535f() == 0) {
                    mo101546s(t);
                    return t2;
                }
                throw InvalidProtocolBufferException.m138422n();
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: I */
        public void mo101511I(C34412l1.C34413a aVar, C34368g0 g0Var) throws IOException {
            int N = mo101516N();
            if (this.f83461a < this.f83462b) {
                int t = mo101547t(N);
                this.f83461a++;
                aVar.mo100459G1(this, g0Var);
                mo101527a(0);
                this.f83461a--;
                if (mo101535f() == 0) {
                    mo101546s(t);
                    return;
                }
                throw InvalidProtocolBufferException.m138422n();
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: J */
        public byte mo101512J() throws IOException {
            if (this.f83494m == this.f83492k) {
                mo101573v0(1);
            }
            byte[] bArr = this.f83491j;
            int i = this.f83494m;
            this.f83494m = i + 1;
            return bArr[i];
        }

        /* renamed from: K */
        public byte[] mo101513K(int i) throws IOException {
            int i2 = this.f83494m;
            if (i > this.f83492k - i2 || i <= 0) {
                return mo101569r0(i, false);
            }
            int i3 = i + i2;
            this.f83494m = i3;
            return Arrays.copyOfRange(this.f83491j, i2, i3);
        }

        /* renamed from: L */
        public int mo101514L() throws IOException {
            int i = this.f83494m;
            if (this.f83492k - i < 4) {
                mo101573v0(4);
                i = this.f83494m;
            }
            byte[] bArr = this.f83491j;
            this.f83494m = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0);
        }

        /* renamed from: M */
        public long mo101515M() throws IOException {
            int i = this.f83494m;
            if (this.f83492k - i < 8) {
                mo101573v0(8);
                i = this.f83494m;
            }
            byte[] bArr = this.f83491j;
            this.f83494m = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo101516N() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f83494m
                int r1 = r5.f83492k
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f83491j
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f83494m = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo101518R()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f83494m = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34452d.mo101516N():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: Q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo101517Q() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f83494m
                int r1 = r11.f83492k
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f83491j
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f83494m = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo101518R()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f83494m = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34452d.mo101517Q():long");
        }

        /* renamed from: R */
        public long mo101518R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo101512J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & C11354n.f28471b) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m138417g();
        }

        /* renamed from: S */
        public int mo101519S() throws IOException {
            return mo101514L();
        }

        /* renamed from: T */
        public long mo101520T() throws IOException {
            return mo101515M();
        }

        /* renamed from: U */
        public int mo101521U() throws IOException {
            return C34448s.m140146b(mo101516N());
        }

        /* renamed from: V */
        public long mo101522V() throws IOException {
            return C34448s.m140147c(mo101517Q());
        }

        /* renamed from: W */
        public String mo101523W() throws IOException {
            int N = mo101516N();
            if (N > 0) {
                int i = this.f83492k;
                int i2 = this.f83494m;
                if (N <= i - i2) {
                    String str = new String(this.f83491j, i2, N, C34471v0.f83529a);
                    this.f83494m += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N > this.f83492k) {
                return new String(mo101569r0(N, false), C34471v0.f83529a);
            }
            mo101573v0(N);
            String str2 = new String(this.f83491j, this.f83494m, N, C34471v0.f83529a);
            this.f83494m += N;
            return str2;
        }

        /* renamed from: X */
        public String mo101524X() throws IOException {
            byte[] bArr;
            int N = mo101516N();
            int i = this.f83494m;
            int i2 = this.f83492k;
            if (N <= i2 - i && N > 0) {
                bArr = this.f83491j;
                this.f83494m = i + N;
            } else if (N == 0) {
                return "";
            } else {
                i = 0;
                if (N <= i2) {
                    mo101573v0(N);
                    bArr = this.f83491j;
                    this.f83494m = N + 0;
                } else {
                    bArr = mo101569r0(N, false);
                }
            }
            return Utf8.m138630h(bArr, i, N);
        }

        /* renamed from: Y */
        public int mo101525Y() throws IOException {
            if (mo101541i()) {
                this.f83495n = 0;
                return 0;
            }
            int N = mo101516N();
            this.f83495n = N;
            if (WireFormat.m138721a(N) != 0) {
                return this.f83495n;
            }
            throw InvalidProtocolBufferException.m138414d();
        }

        /* renamed from: Z */
        public int mo101526Z() throws IOException {
            return mo101516N();
        }

        /* renamed from: a */
        public void mo101527a(int i) throws InvalidProtocolBufferException {
            if (this.f83495n != i) {
                throw InvalidProtocolBufferException.m138413c();
            }
        }

        /* renamed from: a0 */
        public long mo101528a0() throws IOException {
            return mo101517Q();
        }

        @Deprecated
        /* renamed from: b0 */
        public void mo101529b0(int i, C34412l1.C34413a aVar) throws IOException {
            mo101507E(i, aVar, C34368g0.m139242d());
        }

        /* renamed from: c0 */
        public void mo101530c0() {
            this.f83496o = -this.f83494m;
        }

        /* renamed from: e */
        public void mo101533e(boolean z) {
        }

        /* renamed from: f */
        public int mo101535f() {
            int i = this.f83497p;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.f83496o + this.f83494m);
        }

        /* renamed from: g */
        public int mo101537g() {
            return this.f83495n;
        }

        /* renamed from: g0 */
        public boolean mo101538g0(int i) throws IOException {
            int b = WireFormat.m138722b(i);
            if (b == 0) {
                mo101575y0();
                return true;
            } else if (b == 1) {
                mo101544k0(8);
                return true;
            } else if (b == 2) {
                mo101544k0(mo101516N());
                return true;
            } else if (b == 3) {
                mo101542i0();
                mo101527a(WireFormat.m138723c(WireFormat.m138721a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo101544k0(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m138416f();
            }
        }

        /* renamed from: h */
        public int mo101539h() {
            return this.f83496o + this.f83494m;
        }

        /* renamed from: h0 */
        public boolean mo101540h0(int i, CodedOutputStream codedOutputStream) throws IOException {
            int b = WireFormat.m138722b(i);
            if (b == 0) {
                long G = mo101509G();
                codedOutputStream.mo99318Z1(i);
                codedOutputStream.mo99335i2(G);
                return true;
            } else if (b == 1) {
                long M = mo101515M();
                codedOutputStream.mo99318Z1(i);
                codedOutputStream.mo99286D1(M);
                return true;
            } else if (b == 2) {
                ByteString x = mo101551x();
                codedOutputStream.mo99318Z1(i);
                codedOutputStream.mo99352z1(x);
                return true;
            } else if (b == 3) {
                codedOutputStream.mo99318Z1(i);
                mo101543j0(codedOutputStream);
                int c = WireFormat.m138723c(WireFormat.m138721a(i), 4);
                mo101527a(c);
                codedOutputStream.mo99318Z1(c);
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    int L = mo101514L();
                    codedOutputStream.mo99318Z1(i);
                    codedOutputStream.mo99285C1(L);
                    return true;
                }
                throw InvalidProtocolBufferException.m138416f();
            }
        }

        /* renamed from: i */
        public boolean mo101541i() throws IOException {
            return this.f83494m == this.f83492k && !mo101567B0(1);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: i0 */
        public void mo101542i0() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo101525Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo101538g0(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34452d.mo101542i0():void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: j0 */
        public void mo101543j0(com.google.protobuf.CodedOutputStream r2) throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo101525Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo101540h0(r0, r2)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34452d.mo101543j0(com.google.protobuf.CodedOutputStream):void");
        }

        /* renamed from: k0 */
        public void mo101544k0(int i) throws IOException {
            int i2 = this.f83492k;
            int i3 = this.f83494m;
            if (i > i2 - i3 || i < 0) {
                mo101574x0(i);
            } else {
                this.f83494m = i3 + i;
            }
        }

        /* renamed from: q0 */
        public final ByteString mo101568q0(int i) throws IOException {
            byte[] s0 = mo101570s0(i);
            if (s0 != null) {
                return ByteString.m137256X(s0);
            }
            int i2 = this.f83494m;
            int i3 = this.f83492k;
            int i4 = i3 - i2;
            this.f83496o += i3;
            this.f83494m = 0;
            this.f83492k = 0;
            List<byte[]> t0 = mo101571t0(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f83491j, i2, bArr, 0, i4);
            for (byte[] next : t0) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return ByteString.m137255W0(bArr);
        }

        /* renamed from: r0 */
        public final byte[] mo101569r0(int i, boolean z) throws IOException {
            byte[] s0 = mo101570s0(i);
            if (s0 == null) {
                int i2 = this.f83494m;
                int i3 = this.f83492k;
                int i4 = i3 - i2;
                this.f83496o += i3;
                this.f83494m = 0;
                this.f83492k = 0;
                List<byte[]> t0 = mo101571t0(i - i4);
                byte[] bArr = new byte[i];
                System.arraycopy(this.f83491j, i2, bArr, 0, i4);
                for (byte[] next : t0) {
                    System.arraycopy(next, 0, bArr, i4, next.length);
                    i4 += next.length;
                }
                return bArr;
            } else if (z) {
                return (byte[]) s0.clone();
            } else {
                return s0;
            }
        }

        /* renamed from: s */
        public void mo101546s(int i) {
            this.f83497p = i;
            mo101572u0();
        }

        /* renamed from: s0 */
        public final byte[] mo101570s0(int i) throws IOException {
            if (i == 0) {
                return C34471v0.f83532d;
            }
            if (i >= 0) {
                int i2 = this.f83496o;
                int i3 = this.f83494m;
                int i4 = i2 + i3 + i;
                if (i4 - this.f83463c <= 0) {
                    int i5 = this.f83497p;
                    if (i4 <= i5) {
                        int i6 = this.f83492k - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > m140314o0(this.f83490i)) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f83491j, this.f83494m, bArr, 0, i6);
                        this.f83496o += this.f83492k;
                        this.f83494m = 0;
                        this.f83492k = 0;
                        while (i6 < i) {
                            int p0 = m140315p0(this.f83490i, bArr, i6, i - i6);
                            if (p0 != -1) {
                                this.f83496o += p0;
                                i6 += p0;
                            } else {
                                throw InvalidProtocolBufferException.m138422n();
                            }
                        }
                        return bArr;
                    }
                    mo101544k0((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.m138422n();
                }
                throw InvalidProtocolBufferException.m138421m();
            }
            throw InvalidProtocolBufferException.m138418h();
        }

        /* renamed from: t */
        public int mo101547t(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = i + this.f83496o + this.f83494m;
                int i3 = this.f83497p;
                if (i2 <= i3) {
                    this.f83497p = i2;
                    mo101572u0();
                    return i3;
                }
                throw InvalidProtocolBufferException.m138422n();
            }
            throw InvalidProtocolBufferException.m138418h();
        }

        /* renamed from: t0 */
        public final List<byte[]> mo101571t0(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f83490i.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f83496o += read;
                        i2 += read;
                    } else {
                        throw InvalidProtocolBufferException.m138422n();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: u */
        public boolean mo101548u() throws IOException {
            return mo101517Q() != 0;
        }

        /* renamed from: u0 */
        public final void mo101572u0() {
            int i = this.f83492k + this.f83493l;
            this.f83492k = i;
            int i2 = this.f83496o + i;
            int i3 = this.f83497p;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f83493l = i4;
                this.f83492k = i - i4;
                return;
            }
            this.f83493l = 0;
        }

        /* renamed from: v */
        public byte[] mo101549v() throws IOException {
            int N = mo101516N();
            int i = this.f83492k;
            int i2 = this.f83494m;
            if (N > i - i2 || N <= 0) {
                return mo101569r0(N, false);
            }
            byte[] copyOfRange = Arrays.copyOfRange(this.f83491j, i2, i2 + N);
            this.f83494m += N;
            return copyOfRange;
        }

        /* renamed from: v0 */
        public final void mo101573v0(int i) throws IOException {
            if (mo101567B0(i)) {
                return;
            }
            if (i > (this.f83463c - this.f83496o) - this.f83494m) {
                throw InvalidProtocolBufferException.m138421m();
            }
            throw InvalidProtocolBufferException.m138422n();
        }

        /* renamed from: w */
        public ByteBuffer mo101550w() throws IOException {
            int N = mo101516N();
            int i = this.f83492k;
            int i2 = this.f83494m;
            if (N <= i - i2 && N > 0) {
                ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f83491j, i2, i2 + N));
                this.f83494m += N;
                return wrap;
            } else if (N == 0) {
                return C34471v0.f83533e;
            } else {
                return ByteBuffer.wrap(mo101569r0(N, true));
            }
        }

        /* renamed from: x */
        public ByteString mo101551x() throws IOException {
            int N = mo101516N();
            int i = this.f83492k;
            int i2 = this.f83494m;
            if (N <= i - i2 && N > 0) {
                ByteString Y = ByteString.m137258Y(this.f83491j, i2, N);
                this.f83494m += N;
                return Y;
            } else if (N == 0) {
                return ByteString.f82785d;
            } else {
                return mo101568q0(N);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.f83490i.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: x0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo101574x0(int r9) throws java.io.IOException {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0097
                int r0 = r8.f83496o
                int r1 = r8.f83494m
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f83497p
                if (r2 > r3) goto L_0x008d
                com.google.protobuf.s$d$a r2 = r8.f83498q
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.f83496o = r0
                int r0 = r8.f83492k
                int r0 = r0 - r1
                r8.f83492k = r3
                r8.f83494m = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f83490i     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = m140316w0(r1, r4)     // Catch:{ all -> 0x005d }
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L_0x0038
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 > 0) goto L_0x0038
                if (r2 != 0) goto L_0x0035
                goto L_0x0067
            L_0x0035:
                int r0 = (int) r0     // Catch:{ all -> 0x005d }
                int r3 = r3 + r0
                goto L_0x001d
            L_0x0038:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
                r2.<init>()     // Catch:{ all -> 0x005d }
                java.io.InputStream r4 = r8.f83490i     // Catch:{ all -> 0x005d }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x005d }
                r2.append(r4)     // Catch:{ all -> 0x005d }
                java.lang.String r4 = "#skip returned invalid result: "
                r2.append(r4)     // Catch:{ all -> 0x005d }
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005d }
                r9.<init>(r0)     // Catch:{ all -> 0x005d }
                throw r9     // Catch:{ all -> 0x005d }
            L_0x005d:
                r9 = move-exception
                int r0 = r8.f83496o
                int r0 = r0 + r3
                r8.f83496o = r0
                r8.mo101572u0()
                throw r9
            L_0x0067:
                int r0 = r8.f83496o
                int r0 = r0 + r3
                r8.f83496o = r0
                r8.mo101572u0()
            L_0x006f:
                if (r3 >= r9) goto L_0x008c
                int r0 = r8.f83492k
                int r1 = r8.f83494m
                int r1 = r0 - r1
                r8.f83494m = r0
                r0 = 1
                r8.mo101573v0(r0)
            L_0x007d:
                int r2 = r9 - r1
                int r3 = r8.f83492k
                if (r2 <= r3) goto L_0x008a
                int r1 = r1 + r3
                r8.f83494m = r3
                r8.mo101573v0(r0)
                goto L_0x007d
            L_0x008a:
                r8.f83494m = r2
            L_0x008c:
                return
            L_0x008d:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.mo101544k0(r3)
                com.google.protobuf.InvalidProtocolBufferException r9 = com.google.protobuf.InvalidProtocolBufferException.m138422n()
                throw r9
            L_0x0097:
                com.google.protobuf.InvalidProtocolBufferException r9 = com.google.protobuf.InvalidProtocolBufferException.m138418h()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34452d.mo101574x0(int):void");
        }

        /* renamed from: y */
        public double mo101552y() throws IOException {
            return Double.longBitsToDouble(mo101515M());
        }

        /* renamed from: y0 */
        public final void mo101575y0() throws IOException {
            if (this.f83492k - this.f83494m >= 10) {
                mo101576z0();
            } else {
                mo101566A0();
            }
        }

        /* renamed from: z */
        public int mo101553z() throws IOException {
            return mo101516N();
        }

        /* renamed from: z0 */
        public final void mo101576z0() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f83491j;
                int i2 = this.f83494m;
                this.f83494m = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m138417g();
        }

        public C34452d(InputStream inputStream, int i) {
            super();
            this.f83497p = Integer.MAX_VALUE;
            this.f83498q = null;
            C34471v0.m140574e(inputStream, "input");
            this.f83490i = inputStream;
            this.f83491j = new byte[i];
            this.f83492k = 0;
            this.f83494m = 0;
            this.f83496o = 0;
        }
    }

    /* renamed from: com.google.protobuf.s$e */
    public static final class C34455e extends C34448s {

        /* renamed from: i */
        public final ByteBuffer f83502i;

        /* renamed from: j */
        public final boolean f83503j;

        /* renamed from: k */
        public final long f83504k;

        /* renamed from: l */
        public long f83505l;

        /* renamed from: m */
        public long f83506m;

        /* renamed from: n */
        public long f83507n;

        /* renamed from: o */
        public int f83508o;

        /* renamed from: p */
        public int f83509p;

        /* renamed from: q */
        public boolean f83510q;

        /* renamed from: r */
        public int f83511r;

        /* renamed from: n0 */
        public static boolean m140377n0() {
            return C34341c3.m138972V();
        }

        /* renamed from: A */
        public int mo101503A() throws IOException {
            return mo101514L();
        }

        /* renamed from: B */
        public long mo101504B() throws IOException {
            return mo101515M();
        }

        /* renamed from: C */
        public float mo101505C() throws IOException {
            return Float.intBitsToFloat(mo101514L());
        }

        /* renamed from: D */
        public <T extends C34412l1> T mo101506D(int i, C34504y1<T> y1Var, C34368g0 g0Var) throws IOException {
            int i2 = this.f83461a;
            if (i2 < this.f83462b) {
                this.f83461a = i2 + 1;
                T t = (C34412l1) y1Var.mo100482z(this, g0Var);
                mo101527a(WireFormat.m138723c(i, 4));
                this.f83461a--;
                return t;
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: E */
        public void mo101507E(int i, C34412l1.C34413a aVar, C34368g0 g0Var) throws IOException {
            int i2 = this.f83461a;
            if (i2 < this.f83462b) {
                this.f83461a = i2 + 1;
                aVar.mo100459G1(this, g0Var);
                mo101527a(WireFormat.m138723c(i, 4));
                this.f83461a--;
                return;
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: F */
        public int mo101508F() throws IOException {
            return mo101516N();
        }

        /* renamed from: G */
        public long mo101509G() throws IOException {
            return mo101517Q();
        }

        /* renamed from: H */
        public <T extends C34412l1> T mo101510H(C34504y1<T> y1Var, C34368g0 g0Var) throws IOException {
            int N = mo101516N();
            if (this.f83461a < this.f83462b) {
                int t = mo101547t(N);
                this.f83461a++;
                T t2 = (C34412l1) y1Var.mo100482z(this, g0Var);
                mo101527a(0);
                this.f83461a--;
                if (mo101535f() == 0) {
                    mo101546s(t);
                    return t2;
                }
                throw InvalidProtocolBufferException.m138422n();
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: I */
        public void mo101511I(C34412l1.C34413a aVar, C34368g0 g0Var) throws IOException {
            int N = mo101516N();
            if (this.f83461a < this.f83462b) {
                int t = mo101547t(N);
                this.f83461a++;
                aVar.mo100459G1(this, g0Var);
                mo101527a(0);
                this.f83461a--;
                if (mo101535f() == 0) {
                    mo101546s(t);
                    return;
                }
                throw InvalidProtocolBufferException.m138422n();
            }
            throw InvalidProtocolBufferException.m138420j();
        }

        /* renamed from: J */
        public byte mo101512J() throws IOException {
            long j = this.f83506m;
            if (j != this.f83505l) {
                this.f83506m = 1 + j;
                return C34341c3.m138951A(j);
            }
            throw InvalidProtocolBufferException.m138422n();
        }

        /* renamed from: K */
        public byte[] mo101513K(int i) throws IOException {
            if (i >= 0 && i <= mo101581p0()) {
                byte[] bArr = new byte[i];
                long j = this.f83506m;
                long j2 = (long) i;
                mo101585t0(j, j + j2).get(bArr);
                this.f83506m += j2;
                return bArr;
            } else if (i > 0) {
                throw InvalidProtocolBufferException.m138422n();
            } else if (i == 0) {
                return C34471v0.f83532d;
            } else {
                throw InvalidProtocolBufferException.m138418h();
            }
        }

        /* renamed from: L */
        public int mo101514L() throws IOException {
            long j = this.f83506m;
            if (this.f83505l - j >= 4) {
                this.f83506m = 4 + j;
                return ((C34341c3.m138951A(j + 3) & 255) << 24) | (C34341c3.m138951A(j) & 255) | ((C34341c3.m138951A(1 + j) & 255) << 8) | ((C34341c3.m138951A(2 + j) & 255) << DateTimeFieldType.f30603E0);
            }
            throw InvalidProtocolBufferException.m138422n();
        }

        /* renamed from: M */
        public long mo101515M() throws IOException {
            long j = this.f83506m;
            if (this.f83505l - j >= 8) {
                this.f83506m = 8 + j;
                return ((((long) C34341c3.m138951A(j + 7)) & 255) << 56) | (((long) C34341c3.m138951A(j)) & 255) | ((((long) C34341c3.m138951A(1 + j)) & 255) << 8) | ((((long) C34341c3.m138951A(2 + j)) & 255) << 16) | ((((long) C34341c3.m138951A(3 + j)) & 255) << 24) | ((((long) C34341c3.m138951A(4 + j)) & 255) << 32) | ((((long) C34341c3.m138951A(5 + j)) & 255) << 40) | ((((long) C34341c3.m138951A(6 + j)) & 255) << 48);
            }
            throw InvalidProtocolBufferException.m138422n();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (com.google.protobuf.C34341c3.m138951A(r4) < 0) goto L_0x0085;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo101516N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f83506m
                long r2 = r10.f83505l
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.C34341c3.m138951A(r0)
                if (r0 < 0) goto L_0x0017
                r10.f83506m = r4
                return r0
            L_0x0017:
                long r6 = r10.f83505l
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C34341c3.m138951A(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.mo101518R()
                int r0 = (int) r0
                return r0
            L_0x008b:
                r10.f83506m = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34455e.mo101516N():int");
        }

        /* renamed from: Q */
        public long mo101517Q() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f83506m;
            if (this.f83505l != j4) {
                long j5 = j4 + 1;
                byte A = C34341c3.m138951A(j4);
                if (A >= 0) {
                    this.f83506m = j5;
                    return (long) A;
                } else if (this.f83505l - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte A2 = A ^ (C34341c3.m138951A(j5) << 7);
                    if (A2 < 0) {
                        b = A2 ^ C11354n.f28471b;
                    } else {
                        long j7 = j6 + 1;
                        byte A3 = A2 ^ (C34341c3.m138951A(j6) << DateTimeFieldType.f30624Y);
                        if (A3 >= 0) {
                            j = (long) (A3 ^ C11354n.f28471b);
                        } else {
                            j6 = j7 + 1;
                            byte A4 = A3 ^ (C34341c3.m138951A(j7) << DateTimeFieldType.f30608J0);
                            if (A4 < 0) {
                                b = A4 ^ C11354n.f28471b;
                            } else {
                                j7 = j6 + 1;
                                long A5 = ((long) A4) ^ (((long) C34341c3.m138951A(j6)) << 28);
                                if (A5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long A6 = A5 ^ (((long) C34341c3.m138951A(j7)) << 35);
                                    if (A6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        A5 = A6 ^ (((long) C34341c3.m138951A(j8)) << 42);
                                        if (A5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            A6 = A5 ^ (((long) C34341c3.m138951A(j7)) << 49);
                                            if (A6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (A6 ^ (((long) C34341c3.m138951A(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) C34341c3.m138951A(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f83506m = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = A6 ^ j2;
                                    j6 = j8;
                                    this.f83506m = j6;
                                    return j;
                                }
                                j = A5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f83506m = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f83506m = j6;
                    return j;
                }
            }
            return mo101518R();
        }

        /* renamed from: R */
        public long mo101518R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo101512J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & C11354n.f28471b) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m138417g();
        }

        /* renamed from: S */
        public int mo101519S() throws IOException {
            return mo101514L();
        }

        /* renamed from: T */
        public long mo101520T() throws IOException {
            return mo101515M();
        }

        /* renamed from: U */
        public int mo101521U() throws IOException {
            return C34448s.m140146b(mo101516N());
        }

        /* renamed from: V */
        public long mo101522V() throws IOException {
            return C34448s.m140147c(mo101517Q());
        }

        /* renamed from: W */
        public String mo101523W() throws IOException {
            int N = mo101516N();
            if (N > 0 && N <= mo101581p0()) {
                byte[] bArr = new byte[N];
                long j = (long) N;
                C34341c3.m139007p(this.f83506m, bArr, 0, j);
                String str = new String(bArr, C34471v0.f83529a);
                this.f83506m += j;
                return str;
            } else if (N == 0) {
                return "";
            } else {
                if (N < 0) {
                    throw InvalidProtocolBufferException.m138418h();
                }
                throw InvalidProtocolBufferException.m138422n();
            }
        }

        /* renamed from: X */
        public String mo101524X() throws IOException {
            int N = mo101516N();
            if (N > 0 && N <= mo101581p0()) {
                String g = Utf8.m138629g(this.f83502i, mo101579m0(this.f83506m), N);
                this.f83506m += (long) N;
                return g;
            } else if (N == 0) {
                return "";
            } else {
                if (N <= 0) {
                    throw InvalidProtocolBufferException.m138418h();
                }
                throw InvalidProtocolBufferException.m138422n();
            }
        }

        /* renamed from: Y */
        public int mo101525Y() throws IOException {
            if (mo101541i()) {
                this.f83509p = 0;
                return 0;
            }
            int N = mo101516N();
            this.f83509p = N;
            if (WireFormat.m138721a(N) != 0) {
                return this.f83509p;
            }
            throw InvalidProtocolBufferException.m138414d();
        }

        /* renamed from: Z */
        public int mo101526Z() throws IOException {
            return mo101516N();
        }

        /* renamed from: a */
        public void mo101527a(int i) throws InvalidProtocolBufferException {
            if (this.f83509p != i) {
                throw InvalidProtocolBufferException.m138413c();
            }
        }

        /* renamed from: a0 */
        public long mo101528a0() throws IOException {
            return mo101517Q();
        }

        @Deprecated
        /* renamed from: b0 */
        public void mo101529b0(int i, C34412l1.C34413a aVar) throws IOException {
            mo101507E(i, aVar, C34368g0.m139242d());
        }

        /* renamed from: c0 */
        public void mo101530c0() {
            this.f83507n = this.f83506m;
        }

        /* renamed from: e */
        public void mo101533e(boolean z) {
            this.f83510q = z;
        }

        /* renamed from: f */
        public int mo101535f() {
            int i = this.f83511r;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo101539h();
        }

        /* renamed from: g */
        public int mo101537g() {
            return this.f83509p;
        }

        /* renamed from: g0 */
        public boolean mo101538g0(int i) throws IOException {
            int b = WireFormat.m138722b(i);
            if (b == 0) {
                mo101582q0();
                return true;
            } else if (b == 1) {
                mo101544k0(8);
                return true;
            } else if (b == 2) {
                mo101544k0(mo101516N());
                return true;
            } else if (b == 3) {
                mo101542i0();
                mo101527a(WireFormat.m138723c(WireFormat.m138721a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo101544k0(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m138416f();
            }
        }

        /* renamed from: h */
        public int mo101539h() {
            return (int) (this.f83506m - this.f83507n);
        }

        /* renamed from: h0 */
        public boolean mo101540h0(int i, CodedOutputStream codedOutputStream) throws IOException {
            int b = WireFormat.m138722b(i);
            if (b == 0) {
                long G = mo101509G();
                codedOutputStream.mo99318Z1(i);
                codedOutputStream.mo99335i2(G);
                return true;
            } else if (b == 1) {
                long M = mo101515M();
                codedOutputStream.mo99318Z1(i);
                codedOutputStream.mo99286D1(M);
                return true;
            } else if (b == 2) {
                ByteString x = mo101551x();
                codedOutputStream.mo99318Z1(i);
                codedOutputStream.mo99352z1(x);
                return true;
            } else if (b == 3) {
                codedOutputStream.mo99318Z1(i);
                mo101543j0(codedOutputStream);
                int c = WireFormat.m138723c(WireFormat.m138721a(i), 4);
                mo101527a(c);
                codedOutputStream.mo99318Z1(c);
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    int L = mo101514L();
                    codedOutputStream.mo99318Z1(i);
                    codedOutputStream.mo99285C1(L);
                    return true;
                }
                throw InvalidProtocolBufferException.m138416f();
            }
        }

        /* renamed from: i */
        public boolean mo101541i() throws IOException {
            return this.f83506m == this.f83505l;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: i0 */
        public void mo101542i0() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo101525Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo101538g0(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34455e.mo101542i0():void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: j0 */
        public void mo101543j0(com.google.protobuf.CodedOutputStream r2) throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo101525Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo101540h0(r0, r2)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34455e.mo101543j0(com.google.protobuf.CodedOutputStream):void");
        }

        /* renamed from: k0 */
        public void mo101544k0(int i) throws IOException {
            if (i >= 0 && i <= mo101581p0()) {
                this.f83506m += (long) i;
            } else if (i < 0) {
                throw InvalidProtocolBufferException.m138418h();
            } else {
                throw InvalidProtocolBufferException.m138422n();
            }
        }

        /* renamed from: m0 */
        public final int mo101579m0(long j) {
            return (int) (j - this.f83504k);
        }

        /* renamed from: o0 */
        public final void mo101580o0() {
            long j = this.f83505l + ((long) this.f83508o);
            this.f83505l = j;
            int i = (int) (j - this.f83507n);
            int i2 = this.f83511r;
            if (i > i2) {
                int i3 = i - i2;
                this.f83508o = i3;
                this.f83505l = j - ((long) i3);
                return;
            }
            this.f83508o = 0;
        }

        /* renamed from: p0 */
        public final int mo101581p0() {
            return (int) (this.f83505l - this.f83506m);
        }

        /* renamed from: q0 */
        public final void mo101582q0() throws IOException {
            if (mo101581p0() >= 10) {
                mo101583r0();
            } else {
                mo101584s0();
            }
        }

        /* renamed from: r0 */
        public final void mo101583r0() throws IOException {
            int i = 0;
            while (i < 10) {
                long j = this.f83506m;
                this.f83506m = 1 + j;
                if (C34341c3.m138951A(j) < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m138417g();
        }

        /* renamed from: s */
        public void mo101546s(int i) {
            this.f83511r = i;
            mo101580o0();
        }

        /* renamed from: s0 */
        public final void mo101584s0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo101512J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m138417g();
        }

        /* renamed from: t */
        public int mo101547t(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int h = i + mo101539h();
                int i2 = this.f83511r;
                if (h <= i2) {
                    this.f83511r = h;
                    mo101580o0();
                    return i2;
                }
                throw InvalidProtocolBufferException.m138422n();
            }
            throw InvalidProtocolBufferException.m138418h();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
            throw com.google.protobuf.InvalidProtocolBufferException.m138422n();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
            r3.f83502i.position(r0);
            r3.f83502i.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0031 */
        /* renamed from: t0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.nio.ByteBuffer mo101585t0(long r4, long r6) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f83502i
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f83502i
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f83502i     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r4 = r3.mo101579m0(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.f83502i     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r5 = r3.mo101579m0(r6)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r4.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.f83502i     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r5 = r3.f83502i
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f83502i
                r5.limit(r1)
                return r4
            L_0x002f:
                r4 = move-exception
                goto L_0x0036
            L_0x0031:
                com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.m138422n()     // Catch:{ all -> 0x002f }
                throw r4     // Catch:{ all -> 0x002f }
            L_0x0036:
                java.nio.ByteBuffer r5 = r3.f83502i
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f83502i
                r5.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34448s.C34455e.mo101585t0(long, long):java.nio.ByteBuffer");
        }

        /* renamed from: u */
        public boolean mo101548u() throws IOException {
            return mo101517Q() != 0;
        }

        /* renamed from: v */
        public byte[] mo101549v() throws IOException {
            return mo101513K(mo101516N());
        }

        /* renamed from: w */
        public ByteBuffer mo101550w() throws IOException {
            int N = mo101516N();
            if (N <= 0 || N > mo101581p0()) {
                if (N == 0) {
                    return C34471v0.f83533e;
                }
                if (N < 0) {
                    throw InvalidProtocolBufferException.m138418h();
                }
                throw InvalidProtocolBufferException.m138422n();
            } else if (this.f83503j || !this.f83510q) {
                byte[] bArr = new byte[N];
                long j = (long) N;
                C34341c3.m139007p(this.f83506m, bArr, 0, j);
                this.f83506m += j;
                return ByteBuffer.wrap(bArr);
            } else {
                long j2 = this.f83506m;
                long j3 = (long) N;
                ByteBuffer t0 = mo101585t0(j2, j2 + j3);
                this.f83506m += j3;
                return t0;
            }
        }

        /* renamed from: x */
        public ByteString mo101551x() throws IOException {
            int N = mo101516N();
            if (N <= 0 || N > mo101581p0()) {
                if (N == 0) {
                    return ByteString.f82785d;
                }
                if (N < 0) {
                    throw InvalidProtocolBufferException.m138418h();
                }
                throw InvalidProtocolBufferException.m138422n();
            } else if (!this.f83503j || !this.f83510q) {
                byte[] bArr = new byte[N];
                long j = (long) N;
                C34341c3.m139007p(this.f83506m, bArr, 0, j);
                this.f83506m += j;
                return ByteString.m137255W0(bArr);
            } else {
                long j2 = this.f83506m;
                long j3 = (long) N;
                ByteBuffer t0 = mo101585t0(j2, j2 + j3);
                this.f83506m += j3;
                return ByteString.m137253V0(t0);
            }
        }

        /* renamed from: y */
        public double mo101552y() throws IOException {
            return Double.longBitsToDouble(mo101515M());
        }

        /* renamed from: z */
        public int mo101553z() throws IOException {
            return mo101516N();
        }

        public C34455e(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f83511r = Integer.MAX_VALUE;
            this.f83502i = byteBuffer;
            long k = C34341c3.m138997k(byteBuffer);
            this.f83504k = k;
            this.f83505l = ((long) byteBuffer.limit()) + k;
            long position = k + ((long) byteBuffer.position());
            this.f83506m = position;
            this.f83507n = position;
            this.f83503j = z;
        }
    }

    /* renamed from: O */
    public static int m140144O(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw InvalidProtocolBufferException.m138422n();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.m138422n();
            } else if ((read2 & 128) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw InvalidProtocolBufferException.m138417g();
    }

    /* renamed from: P */
    public static int m140145P(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return m140144O(read, inputStream);
        }
        throw InvalidProtocolBufferException.m138422n();
    }

    /* renamed from: b */
    public static int m140146b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m140147c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: j */
    public static C34448s m140148j(InputStream inputStream) {
        return m140149k(inputStream, 4096);
    }

    /* renamed from: k */
    public static C34448s m140149k(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        } else if (inputStream == null) {
            return m140154p(C34471v0.f83532d);
        } else {
            return new C34452d(inputStream, i);
        }
    }

    /* renamed from: l */
    public static C34448s m140150l(Iterable<ByteBuffer> iterable) {
        if (!C34455e.m140377n0()) {
            return m140148j(new C34492w0(iterable));
        }
        return m140151m(iterable, false);
    }

    /* renamed from: m */
    public static C34448s m140151m(Iterable<ByteBuffer> iterable, boolean z) {
        boolean z2 = false;
        int i = 0;
        for (ByteBuffer next : iterable) {
            i += next.remaining();
            if (next.hasArray()) {
                z2 |= true;
            } else if (next.isDirect()) {
                z2 |= true;
            } else {
                z2 |= true;
            }
        }
        if (z2) {
            return new C34451c(iterable, i, z);
        }
        return m140148j(new C34492w0(iterable));
    }

    /* renamed from: n */
    public static C34448s m140152n(ByteBuffer byteBuffer) {
        return m140153o(byteBuffer, false);
    }

    /* renamed from: o */
    public static C34448s m140153o(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m140156r(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C34455e.m140377n0()) {
            return new C34455e(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m140156r(bArr, 0, remaining, true);
    }

    /* renamed from: p */
    public static C34448s m140154p(byte[] bArr) {
        return m140155q(bArr, 0, bArr.length);
    }

    /* renamed from: q */
    public static C34448s m140155q(byte[] bArr, int i, int i2) {
        return m140156r(bArr, i, i2, false);
    }

    /* renamed from: r */
    public static C34448s m140156r(byte[] bArr, int i, int i2, boolean z) {
        C34450b bVar = new C34450b(bArr, i, i2, z);
        try {
            bVar.mo101547t(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract int mo101503A() throws IOException;

    /* renamed from: B */
    public abstract long mo101504B() throws IOException;

    /* renamed from: C */
    public abstract float mo101505C() throws IOException;

    /* renamed from: D */
    public abstract <T extends C34412l1> T mo101506D(int i, C34504y1<T> y1Var, C34368g0 g0Var) throws IOException;

    /* renamed from: E */
    public abstract void mo101507E(int i, C34412l1.C34413a aVar, C34368g0 g0Var) throws IOException;

    /* renamed from: F */
    public abstract int mo101508F() throws IOException;

    /* renamed from: G */
    public abstract long mo101509G() throws IOException;

    /* renamed from: H */
    public abstract <T extends C34412l1> T mo101510H(C34504y1<T> y1Var, C34368g0 g0Var) throws IOException;

    /* renamed from: I */
    public abstract void mo101511I(C34412l1.C34413a aVar, C34368g0 g0Var) throws IOException;

    /* renamed from: J */
    public abstract byte mo101512J() throws IOException;

    /* renamed from: K */
    public abstract byte[] mo101513K(int i) throws IOException;

    /* renamed from: L */
    public abstract int mo101514L() throws IOException;

    /* renamed from: M */
    public abstract long mo101515M() throws IOException;

    /* renamed from: N */
    public abstract int mo101516N() throws IOException;

    /* renamed from: Q */
    public abstract long mo101517Q() throws IOException;

    /* renamed from: R */
    public abstract long mo101518R() throws IOException;

    /* renamed from: S */
    public abstract int mo101519S() throws IOException;

    /* renamed from: T */
    public abstract long mo101520T() throws IOException;

    /* renamed from: U */
    public abstract int mo101521U() throws IOException;

    /* renamed from: V */
    public abstract long mo101522V() throws IOException;

    /* renamed from: W */
    public abstract String mo101523W() throws IOException;

    /* renamed from: X */
    public abstract String mo101524X() throws IOException;

    /* renamed from: Y */
    public abstract int mo101525Y() throws IOException;

    /* renamed from: Z */
    public abstract int mo101526Z() throws IOException;

    /* renamed from: a */
    public abstract void mo101527a(int i) throws InvalidProtocolBufferException;

    /* renamed from: a0 */
    public abstract long mo101528a0() throws IOException;

    @Deprecated
    /* renamed from: b0 */
    public abstract void mo101529b0(int i, C34412l1.C34413a aVar) throws IOException;

    /* renamed from: c0 */
    public abstract void mo101530c0();

    /* renamed from: d */
    public final void mo101531d() {
        this.f83465e = true;
    }

    /* renamed from: d0 */
    public final int mo101532d0(int i) {
        if (i >= 0) {
            int i2 = this.f83462b;
            this.f83462b = i;
            return i2;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i);
    }

    /* renamed from: e */
    public abstract void mo101533e(boolean z);

    /* renamed from: e0 */
    public final int mo101534e0(int i) {
        if (i >= 0) {
            int i2 = this.f83463c;
            this.f83463c = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i);
    }

    /* renamed from: f */
    public abstract int mo101535f();

    /* renamed from: f0 */
    public final boolean mo101536f0() {
        return this.f83465e;
    }

    /* renamed from: g */
    public abstract int mo101537g();

    /* renamed from: g0 */
    public abstract boolean mo101538g0(int i) throws IOException;

    /* renamed from: h */
    public abstract int mo101539h();

    @Deprecated
    /* renamed from: h0 */
    public abstract boolean mo101540h0(int i, CodedOutputStream codedOutputStream) throws IOException;

    /* renamed from: i */
    public abstract boolean mo101541i() throws IOException;

    /* renamed from: i0 */
    public abstract void mo101542i0() throws IOException;

    /* renamed from: j0 */
    public abstract void mo101543j0(CodedOutputStream codedOutputStream) throws IOException;

    /* renamed from: k0 */
    public abstract void mo101544k0(int i) throws IOException;

    /* renamed from: l0 */
    public final void mo101545l0() {
        this.f83465e = false;
    }

    /* renamed from: s */
    public abstract void mo101546s(int i);

    /* renamed from: t */
    public abstract int mo101547t(int i) throws InvalidProtocolBufferException;

    /* renamed from: u */
    public abstract boolean mo101548u() throws IOException;

    /* renamed from: v */
    public abstract byte[] mo101549v() throws IOException;

    /* renamed from: w */
    public abstract ByteBuffer mo101550w() throws IOException;

    /* renamed from: x */
    public abstract ByteString mo101551x() throws IOException;

    /* renamed from: y */
    public abstract double mo101552y() throws IOException;

    /* renamed from: z */
    public abstract int mo101553z() throws IOException;

    public C34448s() {
        this.f83462b = 100;
        this.f83463c = Integer.MAX_VALUE;
        this.f83465e = false;
    }
}
