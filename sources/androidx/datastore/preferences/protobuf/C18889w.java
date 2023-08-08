package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18920z1;
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

/* renamed from: androidx.datastore.preferences.protobuf.w */
public abstract class C18889w {

    /* renamed from: f */
    public static final int f48052f = 4096;

    /* renamed from: g */
    public static final int f48053g = 100;

    /* renamed from: h */
    public static final int f48054h = Integer.MAX_VALUE;

    /* renamed from: a */
    public int f48055a;

    /* renamed from: b */
    public int f48056b;

    /* renamed from: c */
    public int f48057c;

    /* renamed from: d */
    public C18901x f48058d;

    /* renamed from: e */
    public boolean f48059e;

    /* renamed from: androidx.datastore.preferences.protobuf.w$b */
    public static final class C18891b extends C18889w {

        /* renamed from: i */
        public final byte[] f48060i;

        /* renamed from: j */
        public final boolean f48061j;

        /* renamed from: k */
        public int f48062k;

        /* renamed from: l */
        public int f48063l;

        /* renamed from: m */
        public int f48064m;

        /* renamed from: n */
        public int f48065n;

        /* renamed from: o */
        public int f48066o;

        /* renamed from: p */
        public boolean f48067p;

        /* renamed from: q */
        public int f48068q;

        /* renamed from: A */
        public int mo55476A() throws IOException {
            return mo55487L();
        }

        /* renamed from: B */
        public long mo55477B() throws IOException {
            return mo55488M();
        }

        /* renamed from: C */
        public float mo55478C() throws IOException {
            return Float.intBitsToFloat(mo55487L());
        }

        /* renamed from: D */
        public <T extends C18920z1> T mo55479D(int i, C18841p2<T> p2Var, C18836p0 p0Var) throws IOException {
            int i2 = this.f48055a;
            if (i2 < this.f48056b) {
                this.f48055a = i2 + 1;
                T t = (C18920z1) p2Var.mo54035z(this, p0Var);
                mo55500a(WireFormat.m85346c(i, 4));
                this.f48055a--;
                return t;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: E */
        public void mo55480E(int i, C18920z1.C18921a aVar, C18836p0 p0Var) throws IOException {
            int i2 = this.f48055a;
            if (i2 < this.f48056b) {
                this.f48055a = i2 + 1;
                aVar.mo54010M1(this, p0Var);
                mo55500a(WireFormat.m85346c(i, 4));
                this.f48055a--;
                return;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: F */
        public int mo55481F() throws IOException {
            return mo55489N();
        }

        /* renamed from: G */
        public long mo55482G() throws IOException {
            return mo55490Q();
        }

        /* renamed from: H */
        public <T extends C18920z1> T mo55483H(C18841p2<T> p2Var, C18836p0 p0Var) throws IOException {
            int N = mo55489N();
            if (this.f48055a < this.f48056b) {
                int t = mo55520t(N);
                this.f48055a++;
                T t2 = (C18920z1) p2Var.mo54035z(this, p0Var);
                mo55500a(0);
                this.f48055a--;
                mo55519s(t);
                return t2;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: I */
        public void mo55484I(C18920z1.C18921a aVar, C18836p0 p0Var) throws IOException {
            int N = mo55489N();
            if (this.f48055a < this.f48056b) {
                int t = mo55520t(N);
                this.f48055a++;
                aVar.mo54010M1(this, p0Var);
                mo55500a(0);
                this.f48055a--;
                mo55519s(t);
                return;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: J */
        public byte mo55485J() throws IOException {
            int i = this.f48064m;
            if (i != this.f48062k) {
                byte[] bArr = this.f48060i;
                this.f48064m = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m85094l();
        }

        /* renamed from: K */
        public byte[] mo55486K(int i) throws IOException {
            if (i > 0) {
                int i2 = this.f48062k;
                int i3 = this.f48064m;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f48064m = i4;
                    return Arrays.copyOfRange(this.f48060i, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.m85094l();
            } else if (i == 0) {
                return C18753i1.f47863d;
            } else {
                throw InvalidProtocolBufferException.m85090g();
            }
        }

        /* renamed from: L */
        public int mo55487L() throws IOException {
            int i = this.f48064m;
            if (this.f48062k - i >= 4) {
                byte[] bArr = this.f48060i;
                this.f48064m = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0);
            }
            throw InvalidProtocolBufferException.m85094l();
        }

        /* renamed from: M */
        public long mo55488M() throws IOException {
            int i = this.f48064m;
            if (this.f48062k - i >= 8) {
                byte[] bArr = this.f48060i;
                this.f48064m = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.m85094l();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo55489N() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f48064m
                int r1 = r5.f48062k
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f48060i
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f48064m = r3
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
                long r0 = r5.mo55491R()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f48064m = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18891b.mo55489N():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: Q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo55490Q() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f48064m
                int r1 = r11.f48062k
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f48060i
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f48064m = r3
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
                long r0 = r11.mo55491R()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f48064m = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18891b.mo55490Q():long");
        }

        /* renamed from: R */
        public long mo55491R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo55485J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & C11354n.f28471b) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m85089f();
        }

        /* renamed from: S */
        public int mo55492S() throws IOException {
            return mo55487L();
        }

        /* renamed from: T */
        public long mo55493T() throws IOException {
            return mo55488M();
        }

        /* renamed from: U */
        public int mo55494U() throws IOException {
            return C18889w.m87620b(mo55489N());
        }

        /* renamed from: V */
        public long mo55495V() throws IOException {
            return C18889w.m87621c(mo55490Q());
        }

        /* renamed from: W */
        public String mo55496W() throws IOException {
            int N = mo55489N();
            if (N > 0) {
                int i = this.f48062k;
                int i2 = this.f48064m;
                if (N <= i - i2) {
                    String str = new String(this.f48060i, i2, N, C18753i1.f47860a);
                    this.f48064m += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.m85090g();
            }
            throw InvalidProtocolBufferException.m85094l();
        }

        /* renamed from: X */
        public String mo55497X() throws IOException {
            int N = mo55489N();
            if (N > 0) {
                int i = this.f48062k;
                int i2 = this.f48064m;
                if (N <= i - i2) {
                    String h = Utf8.m85197h(this.f48060i, i2, N);
                    this.f48064m += N;
                    return h;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N <= 0) {
                throw InvalidProtocolBufferException.m85090g();
            }
            throw InvalidProtocolBufferException.m85094l();
        }

        /* renamed from: Y */
        public int mo55498Y() throws IOException {
            if (mo55514i()) {
                this.f48066o = 0;
                return 0;
            }
            int N = mo55489N();
            this.f48066o = N;
            if (WireFormat.m85344a(N) != 0) {
                return this.f48066o;
            }
            throw InvalidProtocolBufferException.m85086c();
        }

        /* renamed from: Z */
        public int mo55499Z() throws IOException {
            return mo55489N();
        }

        /* renamed from: a */
        public void mo55500a(int i) throws InvalidProtocolBufferException {
            if (this.f48066o != i) {
                throw InvalidProtocolBufferException.m85085b();
            }
        }

        /* renamed from: a0 */
        public long mo55501a0() throws IOException {
            return mo55490Q();
        }

        @Deprecated
        /* renamed from: b0 */
        public void mo55502b0(int i, C18920z1.C18921a aVar) throws IOException {
            mo55480E(i, aVar, C18836p0.m87223d());
        }

        /* renamed from: c0 */
        public void mo55503c0() {
            this.f48065n = this.f48064m;
        }

        /* renamed from: e */
        public void mo55506e(boolean z) {
            this.f48067p = z;
        }

        /* renamed from: f */
        public int mo55508f() {
            int i = this.f48068q;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo55512h();
        }

        /* renamed from: g */
        public int mo55510g() {
            return this.f48066o;
        }

        /* renamed from: g0 */
        public boolean mo55511g0(int i) throws IOException {
            int b = WireFormat.m85345b(i);
            if (b == 0) {
                mo55528n0();
                return true;
            } else if (b == 1) {
                mo55517k0(8);
                return true;
            } else if (b == 2) {
                mo55517k0(mo55489N());
                return true;
            } else if (b == 3) {
                mo55515i0();
                mo55500a(WireFormat.m85346c(WireFormat.m85344a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo55517k0(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m85088e();
            }
        }

        /* renamed from: h */
        public int mo55512h() {
            return this.f48064m - this.f48065n;
        }

        /* renamed from: h0 */
        public boolean mo55513h0(int i, CodedOutputStream codedOutputStream) throws IOException {
            int b = WireFormat.m85345b(i);
            if (b == 0) {
                long G = mo55482G();
                codedOutputStream.mo53827Z1(i);
                codedOutputStream.mo53844i2(G);
                return true;
            } else if (b == 1) {
                long M = mo55488M();
                codedOutputStream.mo53827Z1(i);
                codedOutputStream.mo53795D1(M);
                return true;
            } else if (b == 2) {
                ByteString x = mo55524x();
                codedOutputStream.mo53827Z1(i);
                codedOutputStream.mo53861z1(x);
                return true;
            } else if (b == 3) {
                codedOutputStream.mo53827Z1(i);
                mo55516j0(codedOutputStream);
                int c = WireFormat.m85346c(WireFormat.m85344a(i), 4);
                mo55500a(c);
                codedOutputStream.mo53827Z1(c);
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    int L = mo55487L();
                    codedOutputStream.mo53827Z1(i);
                    codedOutputStream.mo53794C1(L);
                    return true;
                }
                throw InvalidProtocolBufferException.m85088e();
            }
        }

        /* renamed from: i */
        public boolean mo55514i() throws IOException {
            return this.f48064m == this.f48062k;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: i0 */
        public void mo55515i0() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo55498Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo55511g0(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18891b.mo55515i0():void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: j0 */
        public void mo55516j0(androidx.datastore.preferences.protobuf.CodedOutputStream r2) throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo55498Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo55513h0(r0, r2)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18891b.mo55516j0(androidx.datastore.preferences.protobuf.CodedOutputStream):void");
        }

        /* renamed from: k0 */
        public void mo55517k0(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f48062k;
                int i3 = this.f48064m;
                if (i <= i2 - i3) {
                    this.f48064m = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.m85090g();
            }
            throw InvalidProtocolBufferException.m85094l();
        }

        /* renamed from: m0 */
        public final void mo55527m0() {
            int i = this.f48062k + this.f48063l;
            this.f48062k = i;
            int i2 = i - this.f48065n;
            int i3 = this.f48068q;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f48063l = i4;
                this.f48062k = i - i4;
                return;
            }
            this.f48063l = 0;
        }

        /* renamed from: n0 */
        public final void mo55528n0() throws IOException {
            if (this.f48062k - this.f48064m >= 10) {
                mo55529o0();
            } else {
                mo55530p0();
            }
        }

        /* renamed from: o0 */
        public final void mo55529o0() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f48060i;
                int i2 = this.f48064m;
                this.f48064m = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m85089f();
        }

        /* renamed from: p0 */
        public final void mo55530p0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo55485J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m85089f();
        }

        /* renamed from: s */
        public void mo55519s(int i) {
            this.f48068q = i;
            mo55527m0();
        }

        /* renamed from: t */
        public int mo55520t(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int h = i + mo55512h();
                int i2 = this.f48068q;
                if (h <= i2) {
                    this.f48068q = h;
                    mo55527m0();
                    return i2;
                }
                throw InvalidProtocolBufferException.m85094l();
            }
            throw InvalidProtocolBufferException.m85090g();
        }

        /* renamed from: u */
        public boolean mo55521u() throws IOException {
            return mo55490Q() != 0;
        }

        /* renamed from: v */
        public byte[] mo55522v() throws IOException {
            return mo55486K(mo55489N());
        }

        /* renamed from: w */
        public ByteBuffer mo55523w() throws IOException {
            ByteBuffer byteBuffer;
            int N = mo55489N();
            if (N > 0) {
                int i = this.f48062k;
                int i2 = this.f48064m;
                if (N <= i - i2) {
                    if (this.f48061j || !this.f48067p) {
                        byteBuffer = ByteBuffer.wrap(Arrays.copyOfRange(this.f48060i, i2, i2 + N));
                    } else {
                        byteBuffer = ByteBuffer.wrap(this.f48060i, i2, N).slice();
                    }
                    this.f48064m += N;
                    return byteBuffer;
                }
            }
            if (N == 0) {
                return C18753i1.f47864e;
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.m85090g();
            }
            throw InvalidProtocolBufferException.m85094l();
        }

        /* renamed from: x */
        public ByteString mo55524x() throws IOException {
            ByteString byteString;
            int N = mo55489N();
            if (N > 0) {
                int i = this.f48062k;
                int i2 = this.f48064m;
                if (N <= i - i2) {
                    if (!this.f48061j || !this.f48067p) {
                        byteString = ByteString.m84388Y(this.f48060i, i2, N);
                    } else {
                        byteString = ByteString.m84386W0(this.f48060i, i2, N);
                    }
                    this.f48064m += N;
                    return byteString;
                }
            }
            if (N == 0) {
                return ByteString.f47470d;
            }
            return ByteString.m84384V0(mo55486K(N));
        }

        /* renamed from: y */
        public double mo55525y() throws IOException {
            return Double.longBitsToDouble(mo55488M());
        }

        /* renamed from: z */
        public int mo55526z() throws IOException {
            return mo55489N();
        }

        public C18891b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f48068q = Integer.MAX_VALUE;
            this.f48060i = bArr;
            this.f48062k = i2 + i;
            this.f48064m = i;
            this.f48065n = i;
            this.f48061j = z;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static final class C18892c extends C18889w {

        /* renamed from: i */
        public Iterable<ByteBuffer> f48069i;

        /* renamed from: j */
        public Iterator<ByteBuffer> f48070j;

        /* renamed from: k */
        public ByteBuffer f48071k;

        /* renamed from: l */
        public boolean f48072l;

        /* renamed from: m */
        public boolean f48073m;

        /* renamed from: n */
        public int f48074n;

        /* renamed from: o */
        public int f48075o;

        /* renamed from: p */
        public int f48076p;

        /* renamed from: q */
        public int f48077q;

        /* renamed from: r */
        public int f48078r;

        /* renamed from: s */
        public int f48079s;

        /* renamed from: t */
        public long f48080t;

        /* renamed from: u */
        public long f48081u;

        /* renamed from: v */
        public long f48082v;

        /* renamed from: w */
        public long f48083w;

        /* renamed from: A */
        public int mo55476A() throws IOException {
            return mo55487L();
        }

        /* renamed from: B */
        public long mo55477B() throws IOException {
            return mo55488M();
        }

        /* renamed from: C */
        public float mo55478C() throws IOException {
            return Float.intBitsToFloat(mo55487L());
        }

        /* renamed from: D */
        public <T extends C18920z1> T mo55479D(int i, C18841p2<T> p2Var, C18836p0 p0Var) throws IOException {
            int i2 = this.f48055a;
            if (i2 < this.f48056b) {
                this.f48055a = i2 + 1;
                T t = (C18920z1) p2Var.mo54035z(this, p0Var);
                mo55500a(WireFormat.m85346c(i, 4));
                this.f48055a--;
                return t;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: E */
        public void mo55480E(int i, C18920z1.C18921a aVar, C18836p0 p0Var) throws IOException {
            int i2 = this.f48055a;
            if (i2 < this.f48056b) {
                this.f48055a = i2 + 1;
                aVar.mo54010M1(this, p0Var);
                mo55500a(WireFormat.m85346c(i, 4));
                this.f48055a--;
                return;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: F */
        public int mo55481F() throws IOException {
            return mo55489N();
        }

        /* renamed from: G */
        public long mo55482G() throws IOException {
            return mo55490Q();
        }

        /* renamed from: H */
        public <T extends C18920z1> T mo55483H(C18841p2<T> p2Var, C18836p0 p0Var) throws IOException {
            int N = mo55489N();
            if (this.f48055a < this.f48056b) {
                int t = mo55520t(N);
                this.f48055a++;
                T t2 = (C18920z1) p2Var.mo54035z(this, p0Var);
                mo55500a(0);
                this.f48055a--;
                mo55519s(t);
                return t2;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: I */
        public void mo55484I(C18920z1.C18921a aVar, C18836p0 p0Var) throws IOException {
            int N = mo55489N();
            if (this.f48055a < this.f48056b) {
                int t = mo55520t(N);
                this.f48055a++;
                aVar.mo54010M1(this, p0Var);
                mo55500a(0);
                this.f48055a--;
                mo55519s(t);
                return;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: J */
        public byte mo55485J() throws IOException {
            if (mo55531m0() == 0) {
                mo55532n0();
            }
            long j = this.f48080t;
            this.f48080t = 1 + j;
            return C18923z3.m88424y(j);
        }

        /* renamed from: K */
        public byte[] mo55486K(int i) throws IOException {
            if (i >= 0) {
                long j = (long) i;
                if (j <= mo55531m0()) {
                    byte[] bArr = new byte[i];
                    C18923z3.m88406n(this.f48080t, bArr, 0, j);
                    this.f48080t += j;
                    return bArr;
                }
            }
            if (i >= 0 && i <= mo55535q0()) {
                byte[] bArr2 = new byte[i];
                mo55533o0(bArr2, 0, i);
                return bArr2;
            } else if (i > 0) {
                throw InvalidProtocolBufferException.m85094l();
            } else if (i == 0) {
                return C18753i1.f47863d;
            } else {
                throw InvalidProtocolBufferException.m85090g();
            }
        }

        /* renamed from: L */
        public int mo55487L() throws IOException {
            if (mo55531m0() < 4) {
                return (mo55485J() & 255) | ((mo55485J() & 255) << 8) | ((mo55485J() & 255) << DateTimeFieldType.f30603E0) | ((mo55485J() & 255) << 24);
            }
            long j = this.f48080t;
            this.f48080t = 4 + j;
            return ((C18923z3.m88424y(j + 3) & 255) << 24) | (C18923z3.m88424y(j) & 255) | ((C18923z3.m88424y(1 + j) & 255) << 8) | ((C18923z3.m88424y(2 + j) & 255) << DateTimeFieldType.f30603E0);
        }

        /* renamed from: M */
        public long mo55488M() throws IOException {
            long J;
            byte J2;
            if (mo55531m0() >= 8) {
                long j = this.f48080t;
                this.f48080t = 8 + j;
                J = (((long) C18923z3.m88424y(j)) & 255) | ((((long) C18923z3.m88424y(1 + j)) & 255) << 8) | ((((long) C18923z3.m88424y(2 + j)) & 255) << 16) | ((((long) C18923z3.m88424y(3 + j)) & 255) << 24) | ((((long) C18923z3.m88424y(4 + j)) & 255) << 32) | ((((long) C18923z3.m88424y(5 + j)) & 255) << 40) | ((((long) C18923z3.m88424y(6 + j)) & 255) << 48);
                J2 = C18923z3.m88424y(j + 7);
            } else {
                J = (((long) mo55485J()) & 255) | ((((long) mo55485J()) & 255) << 8) | ((((long) mo55485J()) & 255) << 16) | ((((long) mo55485J()) & 255) << 24) | ((((long) mo55485J()) & 255) << 32) | ((((long) mo55485J()) & 255) << 40) | ((((long) mo55485J()) & 255) << 48);
                J2 = mo55485J();
            }
            return ((((long) J2) & 255) << 56) | J;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
            if (androidx.datastore.preferences.protobuf.C18923z3.m88424y(r4) < 0) goto L_0x008a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo55489N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f48080t
                long r2 = r10.f48083w
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x008a
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r0)
                if (r0 < 0) goto L_0x001a
                long r4 = r10.f48080t
                long r4 = r4 + r2
                r10.f48080t = r4
                return r0
            L_0x001a:
                long r6 = r10.f48083w
                long r8 = r10.f48080t
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0026
                goto L_0x008a
            L_0x0026:
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0034
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0090
            L_0x0034:
                long r4 = r6 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0043
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x0041:
                r6 = r4
                goto L_0x0090
            L_0x0043:
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0053
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x0090
            L_0x0053:
                long r4 = r6 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r4)
                if (r1 >= 0) goto L_0x0090
            L_0x008a:
                long r0 = r10.mo55491R()
                int r0 = (int) r0
                return r0
            L_0x0090:
                r10.f48080t = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18892c.mo55489N():int");
        }

        /* renamed from: Q */
        public long mo55490Q() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f48080t;
            if (this.f48083w != j4) {
                long j5 = j4 + 1;
                byte y = C18923z3.m88424y(j4);
                if (y >= 0) {
                    this.f48080t++;
                    return (long) y;
                } else if (this.f48083w - this.f48080t >= 10) {
                    long j6 = j5 + 1;
                    byte y2 = y ^ (C18923z3.m88424y(j5) << 7);
                    if (y2 < 0) {
                        b = y2 ^ C11354n.f28471b;
                    } else {
                        long j7 = j6 + 1;
                        byte y3 = y2 ^ (C18923z3.m88424y(j6) << DateTimeFieldType.f30624Y);
                        if (y3 >= 0) {
                            j = (long) (y3 ^ C11354n.f28471b);
                        } else {
                            j6 = j7 + 1;
                            byte y4 = y3 ^ (C18923z3.m88424y(j7) << DateTimeFieldType.f30608J0);
                            if (y4 < 0) {
                                b = y4 ^ C11354n.f28471b;
                            } else {
                                j7 = j6 + 1;
                                long y5 = ((long) y4) ^ (((long) C18923z3.m88424y(j6)) << 28);
                                if (y5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long y6 = y5 ^ (((long) C18923z3.m88424y(j7)) << 35);
                                    if (y6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        y5 = y6 ^ (((long) C18923z3.m88424y(j8)) << 42);
                                        if (y5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            y6 = y5 ^ (((long) C18923z3.m88424y(j7)) << 49);
                                            if (y6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (y6 ^ (((long) C18923z3.m88424y(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) C18923z3.m88424y(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f48080t = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = y6 ^ j2;
                                    j6 = j8;
                                    this.f48080t = j6;
                                    return j;
                                }
                                j = y5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f48080t = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f48080t = j6;
                    return j;
                }
            }
            return mo55491R();
        }

        /* renamed from: R */
        public long mo55491R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo55485J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & C11354n.f28471b) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m85089f();
        }

        /* renamed from: S */
        public int mo55492S() throws IOException {
            return mo55487L();
        }

        /* renamed from: T */
        public long mo55493T() throws IOException {
            return mo55488M();
        }

        /* renamed from: U */
        public int mo55494U() throws IOException {
            return C18889w.m87620b(mo55489N());
        }

        /* renamed from: V */
        public long mo55495V() throws IOException {
            return C18889w.m87621c(mo55490Q());
        }

        /* renamed from: W */
        public String mo55496W() throws IOException {
            int N = mo55489N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f48083w;
                long j3 = this.f48080t;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[N];
                    C18923z3.m88406n(j3, bArr, 0, j);
                    String str = new String(bArr, C18753i1.f47860a);
                    this.f48080t += j;
                    return str;
                }
            }
            if (N > 0 && N <= mo55535q0()) {
                byte[] bArr2 = new byte[N];
                mo55533o0(bArr2, 0, N);
                return new String(bArr2, C18753i1.f47860a);
            } else if (N == 0) {
                return "";
            } else {
                if (N < 0) {
                    throw InvalidProtocolBufferException.m85090g();
                }
                throw InvalidProtocolBufferException.m85094l();
            }
        }

        /* renamed from: X */
        public String mo55497X() throws IOException {
            int N = mo55489N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f48083w;
                long j3 = this.f48080t;
                if (j <= j2 - j3) {
                    String g = Utf8.m85196g(this.f48071k, (int) (j3 - this.f48081u), N);
                    this.f48080t += j;
                    return g;
                }
            }
            if (N >= 0 && N <= mo55535q0()) {
                byte[] bArr = new byte[N];
                mo55533o0(bArr, 0, N);
                return Utf8.m85197h(bArr, 0, N);
            } else if (N == 0) {
                return "";
            } else {
                if (N <= 0) {
                    throw InvalidProtocolBufferException.m85090g();
                }
                throw InvalidProtocolBufferException.m85094l();
            }
        }

        /* renamed from: Y */
        public int mo55498Y() throws IOException {
            if (mo55514i()) {
                this.f48077q = 0;
                return 0;
            }
            int N = mo55489N();
            this.f48077q = N;
            if (WireFormat.m85344a(N) != 0) {
                return this.f48077q;
            }
            throw InvalidProtocolBufferException.m85086c();
        }

        /* renamed from: Z */
        public int mo55499Z() throws IOException {
            return mo55489N();
        }

        /* renamed from: a */
        public void mo55500a(int i) throws InvalidProtocolBufferException {
            if (this.f48077q != i) {
                throw InvalidProtocolBufferException.m85085b();
            }
        }

        /* renamed from: a0 */
        public long mo55501a0() throws IOException {
            return mo55490Q();
        }

        @Deprecated
        /* renamed from: b0 */
        public void mo55502b0(int i, C18920z1.C18921a aVar) throws IOException {
            mo55480E(i, aVar, C18836p0.m87223d());
        }

        /* renamed from: c0 */
        public void mo55503c0() {
            this.f48079s = (int) ((((long) this.f48078r) + this.f48080t) - this.f48081u);
        }

        /* renamed from: e */
        public void mo55506e(boolean z) {
            this.f48073m = z;
        }

        /* renamed from: f */
        public int mo55508f() {
            int i = this.f48076p;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo55512h();
        }

        /* renamed from: g */
        public int mo55510g() {
            return this.f48077q;
        }

        /* renamed from: g0 */
        public boolean mo55511g0(int i) throws IOException {
            int b = WireFormat.m85345b(i);
            if (b == 0) {
                mo55536r0();
                return true;
            } else if (b == 1) {
                mo55517k0(8);
                return true;
            } else if (b == 2) {
                mo55517k0(mo55489N());
                return true;
            } else if (b == 3) {
                mo55515i0();
                mo55500a(WireFormat.m85346c(WireFormat.m85344a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo55517k0(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m85088e();
            }
        }

        /* renamed from: h */
        public int mo55512h() {
            return (int) ((((long) (this.f48078r - this.f48079s)) + this.f48080t) - this.f48081u);
        }

        /* renamed from: h0 */
        public boolean mo55513h0(int i, CodedOutputStream codedOutputStream) throws IOException {
            int b = WireFormat.m85345b(i);
            if (b == 0) {
                long G = mo55482G();
                codedOutputStream.mo53827Z1(i);
                codedOutputStream.mo53844i2(G);
                return true;
            } else if (b == 1) {
                long M = mo55488M();
                codedOutputStream.mo53827Z1(i);
                codedOutputStream.mo53795D1(M);
                return true;
            } else if (b == 2) {
                ByteString x = mo55524x();
                codedOutputStream.mo53827Z1(i);
                codedOutputStream.mo53861z1(x);
                return true;
            } else if (b == 3) {
                codedOutputStream.mo53827Z1(i);
                mo55516j0(codedOutputStream);
                int c = WireFormat.m85346c(WireFormat.m85344a(i), 4);
                mo55500a(c);
                codedOutputStream.mo53827Z1(c);
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    int L = mo55487L();
                    codedOutputStream.mo53827Z1(i);
                    codedOutputStream.mo53794C1(L);
                    return true;
                }
                throw InvalidProtocolBufferException.m85088e();
            }
        }

        /* renamed from: i */
        public boolean mo55514i() throws IOException {
            return (((long) this.f48078r) + this.f48080t) - this.f48081u == ((long) this.f48074n);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: i0 */
        public void mo55515i0() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo55498Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo55511g0(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18892c.mo55515i0():void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: j0 */
        public void mo55516j0(androidx.datastore.preferences.protobuf.CodedOutputStream r2) throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo55498Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo55513h0(r0, r2)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18892c.mo55516j0(androidx.datastore.preferences.protobuf.CodedOutputStream):void");
        }

        /* renamed from: k0 */
        public void mo55517k0(int i) throws IOException {
            if (i >= 0 && ((long) i) <= (((long) (this.f48074n - this.f48078r)) - this.f48080t) + this.f48081u) {
                while (i > 0) {
                    if (mo55531m0() == 0) {
                        mo55532n0();
                    }
                    int min = Math.min(i, (int) mo55531m0());
                    i -= min;
                    this.f48080t += (long) min;
                }
            } else if (i < 0) {
                throw InvalidProtocolBufferException.m85090g();
            } else {
                throw InvalidProtocolBufferException.m85094l();
            }
        }

        /* renamed from: m0 */
        public final long mo55531m0() {
            return this.f48083w - this.f48080t;
        }

        /* renamed from: n0 */
        public final void mo55532n0() throws InvalidProtocolBufferException {
            if (this.f48070j.hasNext()) {
                mo55538t0();
                return;
            }
            throw InvalidProtocolBufferException.m85094l();
        }

        /* renamed from: o0 */
        public final void mo55533o0(byte[] bArr, int i, int i2) throws IOException {
            if (i2 >= 0 && i2 <= mo55535q0()) {
                int i3 = i2;
                while (i3 > 0) {
                    if (mo55531m0() == 0) {
                        mo55532n0();
                    }
                    int min = Math.min(i3, (int) mo55531m0());
                    long j = (long) min;
                    C18923z3.m88406n(this.f48080t, bArr, (long) ((i2 - i3) + i), j);
                    i3 -= min;
                    this.f48080t += j;
                }
            } else if (i2 > 0) {
                throw InvalidProtocolBufferException.m85094l();
            } else if (i2 != 0) {
                throw InvalidProtocolBufferException.m85090g();
            }
        }

        /* renamed from: p0 */
        public final void mo55534p0() {
            int i = this.f48074n + this.f48075o;
            this.f48074n = i;
            int i2 = i - this.f48079s;
            int i3 = this.f48076p;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f48075o = i4;
                this.f48074n = i - i4;
                return;
            }
            this.f48075o = 0;
        }

        /* renamed from: q0 */
        public final int mo55535q0() {
            return (int) ((((long) (this.f48074n - this.f48078r)) - this.f48080t) + this.f48081u);
        }

        /* renamed from: r0 */
        public final void mo55536r0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo55485J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m85089f();
        }

        /* renamed from: s */
        public void mo55519s(int i) {
            this.f48076p = i;
            mo55534p0();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m85094l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
            r3.f48071k.position(r0);
            r3.f48071k.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0029 */
        /* renamed from: s0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.nio.ByteBuffer mo55537s0(int r4, int r5) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f48071k
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f48071k
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f48071k     // Catch:{ IllegalArgumentException -> 0x0029 }
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r3.f48071k     // Catch:{ IllegalArgumentException -> 0x0029 }
                r4.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r3.f48071k     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r5 = r3.f48071k
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f48071k
                r5.limit(r1)
                return r4
            L_0x0027:
                r4 = move-exception
                goto L_0x002e
            L_0x0029:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m85094l()     // Catch:{ all -> 0x0027 }
                throw r4     // Catch:{ all -> 0x0027 }
            L_0x002e:
                java.nio.ByteBuffer r5 = r3.f48071k
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f48071k
                r5.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18892c.mo55537s0(int, int):java.nio.ByteBuffer");
        }

        /* renamed from: t */
        public int mo55520t(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int h = i + mo55512h();
                int i2 = this.f48076p;
                if (h <= i2) {
                    this.f48076p = h;
                    mo55534p0();
                    return i2;
                }
                throw InvalidProtocolBufferException.m85094l();
            }
            throw InvalidProtocolBufferException.m85090g();
        }

        /* renamed from: t0 */
        public final void mo55538t0() {
            ByteBuffer next = this.f48070j.next();
            this.f48071k = next;
            this.f48078r += (int) (this.f48080t - this.f48081u);
            long position = (long) next.position();
            this.f48080t = position;
            this.f48081u = position;
            this.f48083w = (long) this.f48071k.limit();
            long i = C18923z3.m88396i(this.f48071k);
            this.f48082v = i;
            this.f48080t += i;
            this.f48081u += i;
            this.f48083w += i;
        }

        /* renamed from: u */
        public boolean mo55521u() throws IOException {
            return mo55490Q() != 0;
        }

        /* renamed from: v */
        public byte[] mo55522v() throws IOException {
            return mo55486K(mo55489N());
        }

        /* renamed from: w */
        public ByteBuffer mo55523w() throws IOException {
            int N = mo55489N();
            if (N > 0) {
                long j = (long) N;
                if (j <= mo55531m0()) {
                    if (this.f48072l || !this.f48073m) {
                        byte[] bArr = new byte[N];
                        C18923z3.m88406n(this.f48080t, bArr, 0, j);
                        this.f48080t += j;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j2 = this.f48080t + j;
                    this.f48080t = j2;
                    long j3 = this.f48082v;
                    return mo55537s0((int) ((j2 - j3) - j), (int) (j2 - j3));
                }
            }
            if (N > 0 && N <= mo55535q0()) {
                byte[] bArr2 = new byte[N];
                mo55533o0(bArr2, 0, N);
                return ByteBuffer.wrap(bArr2);
            } else if (N == 0) {
                return C18753i1.f47864e;
            } else {
                if (N < 0) {
                    throw InvalidProtocolBufferException.m85090g();
                }
                throw InvalidProtocolBufferException.m85094l();
            }
        }

        /* renamed from: x */
        public ByteString mo55524x() throws IOException {
            int N = mo55489N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f48083w;
                long j3 = this.f48080t;
                if (j <= j2 - j3) {
                    if (!this.f48072l || !this.f48073m) {
                        byte[] bArr = new byte[N];
                        C18923z3.m88406n(j3, bArr, 0, j);
                        this.f48080t += j;
                        return ByteString.m84384V0(bArr);
                    }
                    int i = (int) (j3 - this.f48082v);
                    ByteString U0 = ByteString.m84383U0(mo55537s0(i, N + i));
                    this.f48080t += j;
                    return U0;
                }
            }
            if (N > 0 && N <= mo55535q0()) {
                byte[] bArr2 = new byte[N];
                mo55533o0(bArr2, 0, N);
                return ByteString.m84384V0(bArr2);
            } else if (N == 0) {
                return ByteString.f47470d;
            } else {
                if (N < 0) {
                    throw InvalidProtocolBufferException.m85090g();
                }
                throw InvalidProtocolBufferException.m85094l();
            }
        }

        /* renamed from: y */
        public double mo55525y() throws IOException {
            return Double.longBitsToDouble(mo55488M());
        }

        /* renamed from: z */
        public int mo55526z() throws IOException {
            return mo55489N();
        }

        public C18892c(Iterable<ByteBuffer> iterable, int i, boolean z) {
            super();
            this.f48076p = Integer.MAX_VALUE;
            this.f48074n = i;
            this.f48069i = iterable;
            this.f48070j = iterable.iterator();
            this.f48072l = z;
            this.f48078r = 0;
            this.f48079s = 0;
            if (i == 0) {
                this.f48071k = C18753i1.f47864e;
                this.f48080t = 0;
                this.f48081u = 0;
                this.f48083w = 0;
                this.f48082v = 0;
                return;
            }
            mo55538t0();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$d */
    public static final class C18893d extends C18889w {

        /* renamed from: i */
        public final InputStream f48084i;

        /* renamed from: j */
        public final byte[] f48085j;

        /* renamed from: k */
        public int f48086k;

        /* renamed from: l */
        public int f48087l;

        /* renamed from: m */
        public int f48088m;

        /* renamed from: n */
        public int f48089n;

        /* renamed from: o */
        public int f48090o;

        /* renamed from: p */
        public int f48091p;

        /* renamed from: q */
        public C18894a f48092q;

        /* renamed from: androidx.datastore.preferences.protobuf.w$d$a */
        public interface C18894a {
            /* renamed from: a */
            void mo55550a();
        }

        /* renamed from: androidx.datastore.preferences.protobuf.w$d$b */
        public class C18895b implements C18894a {

            /* renamed from: a */
            public int f48093a;

            /* renamed from: b */
            public ByteArrayOutputStream f48094b;

            public C18895b() {
                this.f48093a = C18893d.this.f48088m;
            }

            /* renamed from: a */
            public void mo55550a() {
                if (this.f48094b == null) {
                    this.f48094b = new ByteArrayOutputStream();
                }
                this.f48094b.write(C18893d.this.f48085j, this.f48093a, C18893d.this.f48088m - this.f48093a);
                this.f48093a = 0;
            }

            /* renamed from: b */
            public ByteBuffer mo55551b() {
                ByteArrayOutputStream byteArrayOutputStream = this.f48094b;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(C18893d.this.f48085j, this.f48093a, C18893d.this.f48088m - this.f48093a);
                }
                byteArrayOutputStream.write(C18893d.this.f48085j, this.f48093a, C18893d.this.f48088m);
                return ByteBuffer.wrap(this.f48094b.toByteArray());
            }
        }

        /* renamed from: A */
        public int mo55476A() throws IOException {
            return mo55487L();
        }

        /* renamed from: B */
        public long mo55477B() throws IOException {
            return mo55488M();
        }

        /* renamed from: C */
        public float mo55478C() throws IOException {
            return Float.intBitsToFloat(mo55487L());
        }

        /* renamed from: D */
        public <T extends C18920z1> T mo55479D(int i, C18841p2<T> p2Var, C18836p0 p0Var) throws IOException {
            int i2 = this.f48055a;
            if (i2 < this.f48056b) {
                this.f48055a = i2 + 1;
                T t = (C18920z1) p2Var.mo54035z(this, p0Var);
                mo55500a(WireFormat.m85346c(i, 4));
                this.f48055a--;
                return t;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: E */
        public void mo55480E(int i, C18920z1.C18921a aVar, C18836p0 p0Var) throws IOException {
            int i2 = this.f48055a;
            if (i2 < this.f48056b) {
                this.f48055a = i2 + 1;
                aVar.mo54010M1(this, p0Var);
                mo55500a(WireFormat.m85346c(i, 4));
                this.f48055a--;
                return;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: F */
        public int mo55481F() throws IOException {
            return mo55489N();
        }

        /* renamed from: G */
        public long mo55482G() throws IOException {
            return mo55490Q();
        }

        /* renamed from: H */
        public <T extends C18920z1> T mo55483H(C18841p2<T> p2Var, C18836p0 p0Var) throws IOException {
            int N = mo55489N();
            if (this.f48055a < this.f48056b) {
                int t = mo55520t(N);
                this.f48055a++;
                T t2 = (C18920z1) p2Var.mo54035z(this, p0Var);
                mo55500a(0);
                this.f48055a--;
                mo55519s(t);
                return t2;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: I */
        public void mo55484I(C18920z1.C18921a aVar, C18836p0 p0Var) throws IOException {
            int N = mo55489N();
            if (this.f48055a < this.f48056b) {
                int t = mo55520t(N);
                this.f48055a++;
                aVar.mo54010M1(this, p0Var);
                mo55500a(0);
                this.f48055a--;
                mo55519s(t);
                return;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: J */
        public byte mo55485J() throws IOException {
            if (this.f48088m == this.f48086k) {
                mo55544t0(1);
            }
            byte[] bArr = this.f48085j;
            int i = this.f48088m;
            this.f48088m = i + 1;
            return bArr[i];
        }

        /* renamed from: K */
        public byte[] mo55486K(int i) throws IOException {
            int i2 = this.f48088m;
            if (i > this.f48086k - i2 || i <= 0) {
                return mo55540p0(i, false);
            }
            int i3 = i + i2;
            this.f48088m = i3;
            return Arrays.copyOfRange(this.f48085j, i2, i3);
        }

        /* renamed from: L */
        public int mo55487L() throws IOException {
            int i = this.f48088m;
            if (this.f48086k - i < 4) {
                mo55544t0(4);
                i = this.f48088m;
            }
            byte[] bArr = this.f48085j;
            this.f48088m = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0);
        }

        /* renamed from: M */
        public long mo55488M() throws IOException {
            int i = this.f48088m;
            if (this.f48086k - i < 8) {
                mo55544t0(8);
                i = this.f48088m;
            }
            byte[] bArr = this.f48085j;
            this.f48088m = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo55489N() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f48088m
                int r1 = r5.f48086k
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f48085j
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f48088m = r3
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
                long r0 = r5.mo55491R()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f48088m = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18893d.mo55489N():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: Q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo55490Q() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f48088m
                int r1 = r11.f48086k
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f48085j
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f48088m = r3
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
                long r0 = r11.mo55491R()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f48088m = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18893d.mo55490Q():long");
        }

        /* renamed from: R */
        public long mo55491R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo55485J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & C11354n.f28471b) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m85089f();
        }

        /* renamed from: S */
        public int mo55492S() throws IOException {
            return mo55487L();
        }

        /* renamed from: T */
        public long mo55493T() throws IOException {
            return mo55488M();
        }

        /* renamed from: U */
        public int mo55494U() throws IOException {
            return C18889w.m87620b(mo55489N());
        }

        /* renamed from: V */
        public long mo55495V() throws IOException {
            return C18889w.m87621c(mo55490Q());
        }

        /* renamed from: W */
        public String mo55496W() throws IOException {
            int N = mo55489N();
            if (N > 0) {
                int i = this.f48086k;
                int i2 = this.f48088m;
                if (N <= i - i2) {
                    String str = new String(this.f48085j, i2, N, C18753i1.f47860a);
                    this.f48088m += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N > this.f48086k) {
                return new String(mo55540p0(N, false), C18753i1.f47860a);
            }
            mo55544t0(N);
            String str2 = new String(this.f48085j, this.f48088m, N, C18753i1.f47860a);
            this.f48088m += N;
            return str2;
        }

        /* renamed from: X */
        public String mo55497X() throws IOException {
            byte[] bArr;
            int N = mo55489N();
            int i = this.f48088m;
            int i2 = this.f48086k;
            if (N <= i2 - i && N > 0) {
                bArr = this.f48085j;
                this.f48088m = i + N;
            } else if (N == 0) {
                return "";
            } else {
                i = 0;
                if (N <= i2) {
                    mo55544t0(N);
                    bArr = this.f48085j;
                    this.f48088m = N + 0;
                } else {
                    bArr = mo55540p0(N, false);
                }
            }
            return Utf8.m85197h(bArr, i, N);
        }

        /* renamed from: Y */
        public int mo55498Y() throws IOException {
            if (mo55514i()) {
                this.f48089n = 0;
                return 0;
            }
            int N = mo55489N();
            this.f48089n = N;
            if (WireFormat.m85344a(N) != 0) {
                return this.f48089n;
            }
            throw InvalidProtocolBufferException.m85086c();
        }

        /* renamed from: Z */
        public int mo55499Z() throws IOException {
            return mo55489N();
        }

        /* renamed from: a */
        public void mo55500a(int i) throws InvalidProtocolBufferException {
            if (this.f48089n != i) {
                throw InvalidProtocolBufferException.m85085b();
            }
        }

        /* renamed from: a0 */
        public long mo55501a0() throws IOException {
            return mo55490Q();
        }

        @Deprecated
        /* renamed from: b0 */
        public void mo55502b0(int i, C18920z1.C18921a aVar) throws IOException {
            mo55480E(i, aVar, C18836p0.m87223d());
        }

        /* renamed from: c0 */
        public void mo55503c0() {
            this.f48090o = -this.f48088m;
        }

        /* renamed from: e */
        public void mo55506e(boolean z) {
        }

        /* renamed from: f */
        public int mo55508f() {
            int i = this.f48091p;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.f48090o + this.f48088m);
        }

        /* renamed from: g */
        public int mo55510g() {
            return this.f48089n;
        }

        /* renamed from: g0 */
        public boolean mo55511g0(int i) throws IOException {
            int b = WireFormat.m85345b(i);
            if (b == 0) {
                mo55546v0();
                return true;
            } else if (b == 1) {
                mo55517k0(8);
                return true;
            } else if (b == 2) {
                mo55517k0(mo55489N());
                return true;
            } else if (b == 3) {
                mo55515i0();
                mo55500a(WireFormat.m85346c(WireFormat.m85344a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo55517k0(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m85088e();
            }
        }

        /* renamed from: h */
        public int mo55512h() {
            return this.f48090o + this.f48088m;
        }

        /* renamed from: h0 */
        public boolean mo55513h0(int i, CodedOutputStream codedOutputStream) throws IOException {
            int b = WireFormat.m85345b(i);
            if (b == 0) {
                long G = mo55482G();
                codedOutputStream.mo53827Z1(i);
                codedOutputStream.mo53844i2(G);
                return true;
            } else if (b == 1) {
                long M = mo55488M();
                codedOutputStream.mo53827Z1(i);
                codedOutputStream.mo53795D1(M);
                return true;
            } else if (b == 2) {
                ByteString x = mo55524x();
                codedOutputStream.mo53827Z1(i);
                codedOutputStream.mo53861z1(x);
                return true;
            } else if (b == 3) {
                codedOutputStream.mo53827Z1(i);
                mo55516j0(codedOutputStream);
                int c = WireFormat.m85346c(WireFormat.m85344a(i), 4);
                mo55500a(c);
                codedOutputStream.mo53827Z1(c);
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    int L = mo55487L();
                    codedOutputStream.mo53827Z1(i);
                    codedOutputStream.mo53794C1(L);
                    return true;
                }
                throw InvalidProtocolBufferException.m85088e();
            }
        }

        /* renamed from: i */
        public boolean mo55514i() throws IOException {
            return this.f48088m == this.f48086k && !mo55549y0(1);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: i0 */
        public void mo55515i0() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo55498Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo55511g0(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18893d.mo55515i0():void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: j0 */
        public void mo55516j0(androidx.datastore.preferences.protobuf.CodedOutputStream r2) throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo55498Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo55513h0(r0, r2)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18893d.mo55516j0(androidx.datastore.preferences.protobuf.CodedOutputStream):void");
        }

        /* renamed from: k0 */
        public void mo55517k0(int i) throws IOException {
            int i2 = this.f48086k;
            int i3 = this.f48088m;
            if (i > i2 - i3 || i < 0) {
                mo55545u0(i);
            } else {
                this.f48088m = i3 + i;
            }
        }

        /* renamed from: o0 */
        public final ByteString mo55539o0(int i) throws IOException {
            byte[] q0 = mo55541q0(i);
            if (q0 != null) {
                return ByteString.m84387X(q0);
            }
            int i2 = this.f48088m;
            int i3 = this.f48086k;
            int i4 = i3 - i2;
            this.f48090o += i3;
            this.f48088m = 0;
            this.f48086k = 0;
            List<byte[]> r0 = mo55542r0(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f48085j, i2, bArr, 0, i4);
            for (byte[] next : r0) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return ByteString.m84384V0(bArr);
        }

        /* renamed from: p0 */
        public final byte[] mo55540p0(int i, boolean z) throws IOException {
            byte[] q0 = mo55541q0(i);
            if (q0 == null) {
                int i2 = this.f48088m;
                int i3 = this.f48086k;
                int i4 = i3 - i2;
                this.f48090o += i3;
                this.f48088m = 0;
                this.f48086k = 0;
                List<byte[]> r0 = mo55542r0(i - i4);
                byte[] bArr = new byte[i];
                System.arraycopy(this.f48085j, i2, bArr, 0, i4);
                for (byte[] next : r0) {
                    System.arraycopy(next, 0, bArr, i4, next.length);
                    i4 += next.length;
                }
                return bArr;
            } else if (z) {
                return (byte[]) q0.clone();
            } else {
                return q0;
            }
        }

        /* renamed from: q0 */
        public final byte[] mo55541q0(int i) throws IOException {
            if (i == 0) {
                return C18753i1.f47863d;
            }
            if (i >= 0) {
                int i2 = this.f48090o;
                int i3 = this.f48088m;
                int i4 = i2 + i3 + i;
                if (i4 - this.f48057c <= 0) {
                    int i5 = this.f48091p;
                    if (i4 <= i5) {
                        int i6 = this.f48086k - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.f48084i.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f48085j, this.f48088m, bArr, 0, i6);
                        this.f48090o += this.f48086k;
                        this.f48088m = 0;
                        this.f48086k = 0;
                        while (i6 < i) {
                            int read = this.f48084i.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f48090o += read;
                                i6 += read;
                            } else {
                                throw InvalidProtocolBufferException.m85094l();
                            }
                        }
                        return bArr;
                    }
                    mo55517k0((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.m85094l();
                }
                throw InvalidProtocolBufferException.m85093k();
            }
            throw InvalidProtocolBufferException.m85090g();
        }

        /* renamed from: r0 */
        public final List<byte[]> mo55542r0(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f48084i.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f48090o += read;
                        i2 += read;
                    } else {
                        throw InvalidProtocolBufferException.m85094l();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: s */
        public void mo55519s(int i) {
            this.f48091p = i;
            mo55543s0();
        }

        /* renamed from: s0 */
        public final void mo55543s0() {
            int i = this.f48086k + this.f48087l;
            this.f48086k = i;
            int i2 = this.f48090o + i;
            int i3 = this.f48091p;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f48087l = i4;
                this.f48086k = i - i4;
                return;
            }
            this.f48087l = 0;
        }

        /* renamed from: t */
        public int mo55520t(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = i + this.f48090o + this.f48088m;
                int i3 = this.f48091p;
                if (i2 <= i3) {
                    this.f48091p = i2;
                    mo55543s0();
                    return i3;
                }
                throw InvalidProtocolBufferException.m85094l();
            }
            throw InvalidProtocolBufferException.m85090g();
        }

        /* renamed from: t0 */
        public final void mo55544t0(int i) throws IOException {
            if (mo55549y0(i)) {
                return;
            }
            if (i > (this.f48057c - this.f48090o) - this.f48088m) {
                throw InvalidProtocolBufferException.m85093k();
            }
            throw InvalidProtocolBufferException.m85094l();
        }

        /* renamed from: u */
        public boolean mo55521u() throws IOException {
            return mo55490Q() != 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.f48084i.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: u0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo55545u0(int r9) throws java.io.IOException {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0097
                int r0 = r8.f48090o
                int r1 = r8.f48088m
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f48091p
                if (r2 > r3) goto L_0x008d
                androidx.datastore.preferences.protobuf.w$d$a r2 = r8.f48092q
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.f48090o = r0
                int r0 = r8.f48086k
                int r0 = r0 - r1
                r8.f48086k = r3
                r8.f48088m = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f48084i     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = r1.skip(r4)     // Catch:{ all -> 0x005d }
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
                java.io.InputStream r4 = r8.f48084i     // Catch:{ all -> 0x005d }
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
                int r0 = r8.f48090o
                int r0 = r0 + r3
                r8.f48090o = r0
                r8.mo55543s0()
                throw r9
            L_0x0067:
                int r0 = r8.f48090o
                int r0 = r0 + r3
                r8.f48090o = r0
                r8.mo55543s0()
            L_0x006f:
                if (r3 >= r9) goto L_0x008c
                int r0 = r8.f48086k
                int r1 = r8.f48088m
                int r1 = r0 - r1
                r8.f48088m = r0
                r0 = 1
                r8.mo55544t0(r0)
            L_0x007d:
                int r2 = r9 - r1
                int r3 = r8.f48086k
                if (r2 <= r3) goto L_0x008a
                int r1 = r1 + r3
                r8.f48088m = r3
                r8.mo55544t0(r0)
                goto L_0x007d
            L_0x008a:
                r8.f48088m = r2
            L_0x008c:
                return
            L_0x008d:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.mo55517k0(r3)
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r9 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m85094l()
                throw r9
            L_0x0097:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r9 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m85090g()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18893d.mo55545u0(int):void");
        }

        /* renamed from: v */
        public byte[] mo55522v() throws IOException {
            int N = mo55489N();
            int i = this.f48086k;
            int i2 = this.f48088m;
            if (N > i - i2 || N <= 0) {
                return mo55540p0(N, false);
            }
            byte[] copyOfRange = Arrays.copyOfRange(this.f48085j, i2, i2 + N);
            this.f48088m += N;
            return copyOfRange;
        }

        /* renamed from: v0 */
        public final void mo55546v0() throws IOException {
            if (this.f48086k - this.f48088m >= 10) {
                mo55547w0();
            } else {
                mo55548x0();
            }
        }

        /* renamed from: w */
        public ByteBuffer mo55523w() throws IOException {
            int N = mo55489N();
            int i = this.f48086k;
            int i2 = this.f48088m;
            if (N <= i - i2 && N > 0) {
                ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f48085j, i2, i2 + N));
                this.f48088m += N;
                return wrap;
            } else if (N == 0) {
                return C18753i1.f47864e;
            } else {
                return ByteBuffer.wrap(mo55540p0(N, true));
            }
        }

        /* renamed from: w0 */
        public final void mo55547w0() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f48085j;
                int i2 = this.f48088m;
                this.f48088m = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m85089f();
        }

        /* renamed from: x */
        public ByteString mo55524x() throws IOException {
            int N = mo55489N();
            int i = this.f48086k;
            int i2 = this.f48088m;
            if (N <= i - i2 && N > 0) {
                ByteString Y = ByteString.m84388Y(this.f48085j, i2, N);
                this.f48088m += N;
                return Y;
            } else if (N == 0) {
                return ByteString.f47470d;
            } else {
                return mo55539o0(N);
            }
        }

        /* renamed from: x0 */
        public final void mo55548x0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo55485J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m85089f();
        }

        /* renamed from: y */
        public double mo55525y() throws IOException {
            return Double.longBitsToDouble(mo55488M());
        }

        /* renamed from: y0 */
        public final boolean mo55549y0(int i) throws IOException {
            int i2 = this.f48088m;
            if (i2 + i > this.f48086k) {
                int i3 = this.f48057c;
                int i4 = this.f48090o;
                if (i > (i3 - i4) - i2 || i4 + i2 + i > this.f48091p) {
                    return false;
                }
                C18894a aVar = this.f48092q;
                if (aVar != null) {
                    aVar.mo55550a();
                }
                int i5 = this.f48088m;
                if (i5 > 0) {
                    int i6 = this.f48086k;
                    if (i6 > i5) {
                        byte[] bArr = this.f48085j;
                        System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                    }
                    this.f48090o += i5;
                    this.f48086k -= i5;
                    this.f48088m = 0;
                }
                InputStream inputStream = this.f48084i;
                byte[] bArr2 = this.f48085j;
                int i7 = this.f48086k;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f48057c - this.f48090o) - i7));
                if (read == 0 || read < -1 || read > this.f48085j.length) {
                    throw new IllegalStateException(this.f48084i.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f48086k += read;
                    mo55543s0();
                    if (this.f48086k >= i) {
                        return true;
                    }
                    return mo55549y0(i);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
        }

        /* renamed from: z */
        public int mo55526z() throws IOException {
            return mo55489N();
        }

        public C18893d(InputStream inputStream, int i) {
            super();
            this.f48091p = Integer.MAX_VALUE;
            this.f48092q = null;
            C18753i1.m86341e(inputStream, "input");
            this.f48084i = inputStream;
            this.f48085j = new byte[i];
            this.f48086k = 0;
            this.f48088m = 0;
            this.f48090o = 0;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$e */
    public static final class C18896e extends C18889w {

        /* renamed from: i */
        public final ByteBuffer f48096i;

        /* renamed from: j */
        public final boolean f48097j;

        /* renamed from: k */
        public final long f48098k;

        /* renamed from: l */
        public long f48099l;

        /* renamed from: m */
        public long f48100m;

        /* renamed from: n */
        public long f48101n;

        /* renamed from: o */
        public int f48102o;

        /* renamed from: p */
        public int f48103p;

        /* renamed from: q */
        public boolean f48104q;

        /* renamed from: r */
        public int f48105r;

        /* renamed from: n0 */
        public static boolean m87848n0() {
            return C18923z3.m88373T();
        }

        /* renamed from: A */
        public int mo55476A() throws IOException {
            return mo55487L();
        }

        /* renamed from: B */
        public long mo55477B() throws IOException {
            return mo55488M();
        }

        /* renamed from: C */
        public float mo55478C() throws IOException {
            return Float.intBitsToFloat(mo55487L());
        }

        /* renamed from: D */
        public <T extends C18920z1> T mo55479D(int i, C18841p2<T> p2Var, C18836p0 p0Var) throws IOException {
            int i2 = this.f48055a;
            if (i2 < this.f48056b) {
                this.f48055a = i2 + 1;
                T t = (C18920z1) p2Var.mo54035z(this, p0Var);
                mo55500a(WireFormat.m85346c(i, 4));
                this.f48055a--;
                return t;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: E */
        public void mo55480E(int i, C18920z1.C18921a aVar, C18836p0 p0Var) throws IOException {
            int i2 = this.f48055a;
            if (i2 < this.f48056b) {
                this.f48055a = i2 + 1;
                aVar.mo54010M1(this, p0Var);
                mo55500a(WireFormat.m85346c(i, 4));
                this.f48055a--;
                return;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: F */
        public int mo55481F() throws IOException {
            return mo55489N();
        }

        /* renamed from: G */
        public long mo55482G() throws IOException {
            return mo55490Q();
        }

        /* renamed from: H */
        public <T extends C18920z1> T mo55483H(C18841p2<T> p2Var, C18836p0 p0Var) throws IOException {
            int N = mo55489N();
            if (this.f48055a < this.f48056b) {
                int t = mo55520t(N);
                this.f48055a++;
                T t2 = (C18920z1) p2Var.mo54035z(this, p0Var);
                mo55500a(0);
                this.f48055a--;
                mo55519s(t);
                return t2;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: I */
        public void mo55484I(C18920z1.C18921a aVar, C18836p0 p0Var) throws IOException {
            int N = mo55489N();
            if (this.f48055a < this.f48056b) {
                int t = mo55520t(N);
                this.f48055a++;
                aVar.mo54010M1(this, p0Var);
                mo55500a(0);
                this.f48055a--;
                mo55519s(t);
                return;
            }
            throw InvalidProtocolBufferException.m85092i();
        }

        /* renamed from: J */
        public byte mo55485J() throws IOException {
            long j = this.f48100m;
            if (j != this.f48099l) {
                this.f48100m = 1 + j;
                return C18923z3.m88424y(j);
            }
            throw InvalidProtocolBufferException.m85094l();
        }

        /* renamed from: K */
        public byte[] mo55486K(int i) throws IOException {
            if (i >= 0 && i <= mo55554p0()) {
                byte[] bArr = new byte[i];
                long j = this.f48100m;
                long j2 = (long) i;
                mo55558t0(j, j + j2).get(bArr);
                this.f48100m += j2;
                return bArr;
            } else if (i > 0) {
                throw InvalidProtocolBufferException.m85094l();
            } else if (i == 0) {
                return C18753i1.f47863d;
            } else {
                throw InvalidProtocolBufferException.m85090g();
            }
        }

        /* renamed from: L */
        public int mo55487L() throws IOException {
            long j = this.f48100m;
            if (this.f48099l - j >= 4) {
                this.f48100m = 4 + j;
                return ((C18923z3.m88424y(j + 3) & 255) << 24) | (C18923z3.m88424y(j) & 255) | ((C18923z3.m88424y(1 + j) & 255) << 8) | ((C18923z3.m88424y(2 + j) & 255) << DateTimeFieldType.f30603E0);
            }
            throw InvalidProtocolBufferException.m85094l();
        }

        /* renamed from: M */
        public long mo55488M() throws IOException {
            long j = this.f48100m;
            if (this.f48099l - j >= 8) {
                this.f48100m = 8 + j;
                return ((((long) C18923z3.m88424y(j + 7)) & 255) << 56) | (((long) C18923z3.m88424y(j)) & 255) | ((((long) C18923z3.m88424y(1 + j)) & 255) << 8) | ((((long) C18923z3.m88424y(2 + j)) & 255) << 16) | ((((long) C18923z3.m88424y(3 + j)) & 255) << 24) | ((((long) C18923z3.m88424y(4 + j)) & 255) << 32) | ((((long) C18923z3.m88424y(5 + j)) & 255) << 40) | ((((long) C18923z3.m88424y(6 + j)) & 255) << 48);
            }
            throw InvalidProtocolBufferException.m85094l();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (androidx.datastore.preferences.protobuf.C18923z3.m88424y(r4) < 0) goto L_0x0085;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo55489N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f48100m
                long r2 = r10.f48099l
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r0)
                if (r0 < 0) goto L_0x0017
                r10.f48100m = r4
                return r0
            L_0x0017:
                long r6 = r10.f48099l
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.mo55491R()
                int r0 = (int) r0
                return r0
            L_0x008b:
                r10.f48100m = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18896e.mo55489N():int");
        }

        /* renamed from: Q */
        public long mo55490Q() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f48100m;
            if (this.f48099l != j4) {
                long j5 = j4 + 1;
                byte y = C18923z3.m88424y(j4);
                if (y >= 0) {
                    this.f48100m = j5;
                    return (long) y;
                } else if (this.f48099l - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte y2 = y ^ (C18923z3.m88424y(j5) << 7);
                    if (y2 < 0) {
                        b = y2 ^ C11354n.f28471b;
                    } else {
                        long j7 = j6 + 1;
                        byte y3 = y2 ^ (C18923z3.m88424y(j6) << DateTimeFieldType.f30624Y);
                        if (y3 >= 0) {
                            j = (long) (y3 ^ C11354n.f28471b);
                        } else {
                            j6 = j7 + 1;
                            byte y4 = y3 ^ (C18923z3.m88424y(j7) << DateTimeFieldType.f30608J0);
                            if (y4 < 0) {
                                b = y4 ^ C11354n.f28471b;
                            } else {
                                j7 = j6 + 1;
                                long y5 = ((long) y4) ^ (((long) C18923z3.m88424y(j6)) << 28);
                                if (y5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long y6 = y5 ^ (((long) C18923z3.m88424y(j7)) << 35);
                                    if (y6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        y5 = y6 ^ (((long) C18923z3.m88424y(j8)) << 42);
                                        if (y5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            y6 = y5 ^ (((long) C18923z3.m88424y(j7)) << 49);
                                            if (y6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (y6 ^ (((long) C18923z3.m88424y(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) C18923z3.m88424y(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f48100m = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = y6 ^ j2;
                                    j6 = j8;
                                    this.f48100m = j6;
                                    return j;
                                }
                                j = y5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f48100m = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f48100m = j6;
                    return j;
                }
            }
            return mo55491R();
        }

        /* renamed from: R */
        public long mo55491R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo55485J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & C11354n.f28471b) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m85089f();
        }

        /* renamed from: S */
        public int mo55492S() throws IOException {
            return mo55487L();
        }

        /* renamed from: T */
        public long mo55493T() throws IOException {
            return mo55488M();
        }

        /* renamed from: U */
        public int mo55494U() throws IOException {
            return C18889w.m87620b(mo55489N());
        }

        /* renamed from: V */
        public long mo55495V() throws IOException {
            return C18889w.m87621c(mo55490Q());
        }

        /* renamed from: W */
        public String mo55496W() throws IOException {
            int N = mo55489N();
            if (N > 0 && N <= mo55554p0()) {
                byte[] bArr = new byte[N];
                long j = (long) N;
                C18923z3.m88406n(this.f48100m, bArr, 0, j);
                String str = new String(bArr, C18753i1.f47860a);
                this.f48100m += j;
                return str;
            } else if (N == 0) {
                return "";
            } else {
                if (N < 0) {
                    throw InvalidProtocolBufferException.m85090g();
                }
                throw InvalidProtocolBufferException.m85094l();
            }
        }

        /* renamed from: X */
        public String mo55497X() throws IOException {
            int N = mo55489N();
            if (N > 0 && N <= mo55554p0()) {
                String g = Utf8.m85196g(this.f48096i, mo55552m0(this.f48100m), N);
                this.f48100m += (long) N;
                return g;
            } else if (N == 0) {
                return "";
            } else {
                if (N <= 0) {
                    throw InvalidProtocolBufferException.m85090g();
                }
                throw InvalidProtocolBufferException.m85094l();
            }
        }

        /* renamed from: Y */
        public int mo55498Y() throws IOException {
            if (mo55514i()) {
                this.f48103p = 0;
                return 0;
            }
            int N = mo55489N();
            this.f48103p = N;
            if (WireFormat.m85344a(N) != 0) {
                return this.f48103p;
            }
            throw InvalidProtocolBufferException.m85086c();
        }

        /* renamed from: Z */
        public int mo55499Z() throws IOException {
            return mo55489N();
        }

        /* renamed from: a */
        public void mo55500a(int i) throws InvalidProtocolBufferException {
            if (this.f48103p != i) {
                throw InvalidProtocolBufferException.m85085b();
            }
        }

        /* renamed from: a0 */
        public long mo55501a0() throws IOException {
            return mo55490Q();
        }

        @Deprecated
        /* renamed from: b0 */
        public void mo55502b0(int i, C18920z1.C18921a aVar) throws IOException {
            mo55480E(i, aVar, C18836p0.m87223d());
        }

        /* renamed from: c0 */
        public void mo55503c0() {
            this.f48101n = this.f48100m;
        }

        /* renamed from: e */
        public void mo55506e(boolean z) {
            this.f48104q = z;
        }

        /* renamed from: f */
        public int mo55508f() {
            int i = this.f48105r;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo55512h();
        }

        /* renamed from: g */
        public int mo55510g() {
            return this.f48103p;
        }

        /* renamed from: g0 */
        public boolean mo55511g0(int i) throws IOException {
            int b = WireFormat.m85345b(i);
            if (b == 0) {
                mo55555q0();
                return true;
            } else if (b == 1) {
                mo55517k0(8);
                return true;
            } else if (b == 2) {
                mo55517k0(mo55489N());
                return true;
            } else if (b == 3) {
                mo55515i0();
                mo55500a(WireFormat.m85346c(WireFormat.m85344a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo55517k0(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m85088e();
            }
        }

        /* renamed from: h */
        public int mo55512h() {
            return (int) (this.f48100m - this.f48101n);
        }

        /* renamed from: h0 */
        public boolean mo55513h0(int i, CodedOutputStream codedOutputStream) throws IOException {
            int b = WireFormat.m85345b(i);
            if (b == 0) {
                long G = mo55482G();
                codedOutputStream.mo53827Z1(i);
                codedOutputStream.mo53844i2(G);
                return true;
            } else if (b == 1) {
                long M = mo55488M();
                codedOutputStream.mo53827Z1(i);
                codedOutputStream.mo53795D1(M);
                return true;
            } else if (b == 2) {
                ByteString x = mo55524x();
                codedOutputStream.mo53827Z1(i);
                codedOutputStream.mo53861z1(x);
                return true;
            } else if (b == 3) {
                codedOutputStream.mo53827Z1(i);
                mo55516j0(codedOutputStream);
                int c = WireFormat.m85346c(WireFormat.m85344a(i), 4);
                mo55500a(c);
                codedOutputStream.mo53827Z1(c);
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    int L = mo55487L();
                    codedOutputStream.mo53827Z1(i);
                    codedOutputStream.mo53794C1(L);
                    return true;
                }
                throw InvalidProtocolBufferException.m85088e();
            }
        }

        /* renamed from: i */
        public boolean mo55514i() throws IOException {
            return this.f48100m == this.f48099l;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: i0 */
        public void mo55515i0() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo55498Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo55511g0(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18896e.mo55515i0():void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: j0 */
        public void mo55516j0(androidx.datastore.preferences.protobuf.CodedOutputStream r2) throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo55498Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo55513h0(r0, r2)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18896e.mo55516j0(androidx.datastore.preferences.protobuf.CodedOutputStream):void");
        }

        /* renamed from: k0 */
        public void mo55517k0(int i) throws IOException {
            if (i >= 0 && i <= mo55554p0()) {
                this.f48100m += (long) i;
            } else if (i < 0) {
                throw InvalidProtocolBufferException.m85090g();
            } else {
                throw InvalidProtocolBufferException.m85094l();
            }
        }

        /* renamed from: m0 */
        public final int mo55552m0(long j) {
            return (int) (j - this.f48098k);
        }

        /* renamed from: o0 */
        public final void mo55553o0() {
            long j = this.f48099l + ((long) this.f48102o);
            this.f48099l = j;
            int i = (int) (j - this.f48101n);
            int i2 = this.f48105r;
            if (i > i2) {
                int i3 = i - i2;
                this.f48102o = i3;
                this.f48099l = j - ((long) i3);
                return;
            }
            this.f48102o = 0;
        }

        /* renamed from: p0 */
        public final int mo55554p0() {
            return (int) (this.f48099l - this.f48100m);
        }

        /* renamed from: q0 */
        public final void mo55555q0() throws IOException {
            if (mo55554p0() >= 10) {
                mo55556r0();
            } else {
                mo55557s0();
            }
        }

        /* renamed from: r0 */
        public final void mo55556r0() throws IOException {
            int i = 0;
            while (i < 10) {
                long j = this.f48100m;
                this.f48100m = 1 + j;
                if (C18923z3.m88424y(j) < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m85089f();
        }

        /* renamed from: s */
        public void mo55519s(int i) {
            this.f48105r = i;
            mo55553o0();
        }

        /* renamed from: s0 */
        public final void mo55557s0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo55485J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m85089f();
        }

        /* renamed from: t */
        public int mo55520t(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int h = i + mo55512h();
                int i2 = this.f48105r;
                if (h <= i2) {
                    this.f48105r = h;
                    mo55553o0();
                    return i2;
                }
                throw InvalidProtocolBufferException.m85094l();
            }
            throw InvalidProtocolBufferException.m85090g();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m85094l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
            r3.f48096i.position(r0);
            r3.f48096i.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0031 */
        /* renamed from: t0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.nio.ByteBuffer mo55558t0(long r4, long r6) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f48096i
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f48096i
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f48096i     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r4 = r3.mo55552m0(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.f48096i     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r5 = r3.mo55552m0(r6)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r4.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.f48096i     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r5 = r3.f48096i
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f48096i
                r5.limit(r1)
                return r4
            L_0x002f:
                r4 = move-exception
                goto L_0x0036
            L_0x0031:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m85094l()     // Catch:{ all -> 0x002f }
                throw r4     // Catch:{ all -> 0x002f }
            L_0x0036:
                java.nio.ByteBuffer r5 = r3.f48096i
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f48096i
                r5.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18889w.C18896e.mo55558t0(long, long):java.nio.ByteBuffer");
        }

        /* renamed from: u */
        public boolean mo55521u() throws IOException {
            return mo55490Q() != 0;
        }

        /* renamed from: v */
        public byte[] mo55522v() throws IOException {
            return mo55486K(mo55489N());
        }

        /* renamed from: w */
        public ByteBuffer mo55523w() throws IOException {
            int N = mo55489N();
            if (N <= 0 || N > mo55554p0()) {
                if (N == 0) {
                    return C18753i1.f47864e;
                }
                if (N < 0) {
                    throw InvalidProtocolBufferException.m85090g();
                }
                throw InvalidProtocolBufferException.m85094l();
            } else if (this.f48097j || !this.f48104q) {
                byte[] bArr = new byte[N];
                long j = (long) N;
                C18923z3.m88406n(this.f48100m, bArr, 0, j);
                this.f48100m += j;
                return ByteBuffer.wrap(bArr);
            } else {
                long j2 = this.f48100m;
                long j3 = (long) N;
                ByteBuffer t0 = mo55558t0(j2, j2 + j3);
                this.f48100m += j3;
                return t0;
            }
        }

        /* renamed from: x */
        public ByteString mo55524x() throws IOException {
            int N = mo55489N();
            if (N <= 0 || N > mo55554p0()) {
                if (N == 0) {
                    return ByteString.f47470d;
                }
                if (N < 0) {
                    throw InvalidProtocolBufferException.m85090g();
                }
                throw InvalidProtocolBufferException.m85094l();
            } else if (!this.f48097j || !this.f48104q) {
                byte[] bArr = new byte[N];
                long j = (long) N;
                C18923z3.m88406n(this.f48100m, bArr, 0, j);
                this.f48100m += j;
                return ByteString.m84384V0(bArr);
            } else {
                long j2 = this.f48100m;
                long j3 = (long) N;
                ByteBuffer t0 = mo55558t0(j2, j2 + j3);
                this.f48100m += j3;
                return ByteString.m84383U0(t0);
            }
        }

        /* renamed from: y */
        public double mo55525y() throws IOException {
            return Double.longBitsToDouble(mo55488M());
        }

        /* renamed from: z */
        public int mo55526z() throws IOException {
            return mo55489N();
        }

        public C18896e(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f48105r = Integer.MAX_VALUE;
            this.f48096i = byteBuffer;
            long i = C18923z3.m88396i(byteBuffer);
            this.f48098k = i;
            this.f48099l = ((long) byteBuffer.limit()) + i;
            long position = i + ((long) byteBuffer.position());
            this.f48100m = position;
            this.f48101n = position;
            this.f48097j = z;
        }
    }

    /* renamed from: O */
    public static int m87618O(int i, InputStream inputStream) throws IOException {
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
                throw InvalidProtocolBufferException.m85094l();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.m85094l();
            } else if ((read2 & 128) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw InvalidProtocolBufferException.m85089f();
    }

    /* renamed from: P */
    public static int m87619P(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return m87618O(read, inputStream);
        }
        throw InvalidProtocolBufferException.m85094l();
    }

    /* renamed from: b */
    public static int m87620b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m87621c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: j */
    public static C18889w m87622j(InputStream inputStream) {
        return m87623k(inputStream, 4096);
    }

    /* renamed from: k */
    public static C18889w m87623k(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        } else if (inputStream == null) {
            return m87628p(C18753i1.f47863d);
        } else {
            return new C18893d(inputStream, i);
        }
    }

    /* renamed from: l */
    public static C18889w m87624l(Iterable<ByteBuffer> iterable) {
        if (!C18896e.m87848n0()) {
            return m87622j(new C18776j1(iterable));
        }
        return m87625m(iterable, false);
    }

    /* renamed from: m */
    public static C18889w m87625m(Iterable<ByteBuffer> iterable, boolean z) {
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
            return new C18892c(iterable, i, z);
        }
        return m87622j(new C18776j1(iterable));
    }

    /* renamed from: n */
    public static C18889w m87626n(ByteBuffer byteBuffer) {
        return m87627o(byteBuffer, false);
    }

    /* renamed from: o */
    public static C18889w m87627o(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m87630r(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C18896e.m87848n0()) {
            return new C18896e(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m87630r(bArr, 0, remaining, true);
    }

    /* renamed from: p */
    public static C18889w m87628p(byte[] bArr) {
        return m87629q(bArr, 0, bArr.length);
    }

    /* renamed from: q */
    public static C18889w m87629q(byte[] bArr, int i, int i2) {
        return m87630r(bArr, i, i2, false);
    }

    /* renamed from: r */
    public static C18889w m87630r(byte[] bArr, int i, int i2, boolean z) {
        C18891b bVar = new C18891b(bArr, i, i2, z);
        try {
            bVar.mo55520t(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract int mo55476A() throws IOException;

    /* renamed from: B */
    public abstract long mo55477B() throws IOException;

    /* renamed from: C */
    public abstract float mo55478C() throws IOException;

    /* renamed from: D */
    public abstract <T extends C18920z1> T mo55479D(int i, C18841p2<T> p2Var, C18836p0 p0Var) throws IOException;

    /* renamed from: E */
    public abstract void mo55480E(int i, C18920z1.C18921a aVar, C18836p0 p0Var) throws IOException;

    /* renamed from: F */
    public abstract int mo55481F() throws IOException;

    /* renamed from: G */
    public abstract long mo55482G() throws IOException;

    /* renamed from: H */
    public abstract <T extends C18920z1> T mo55483H(C18841p2<T> p2Var, C18836p0 p0Var) throws IOException;

    /* renamed from: I */
    public abstract void mo55484I(C18920z1.C18921a aVar, C18836p0 p0Var) throws IOException;

    /* renamed from: J */
    public abstract byte mo55485J() throws IOException;

    /* renamed from: K */
    public abstract byte[] mo55486K(int i) throws IOException;

    /* renamed from: L */
    public abstract int mo55487L() throws IOException;

    /* renamed from: M */
    public abstract long mo55488M() throws IOException;

    /* renamed from: N */
    public abstract int mo55489N() throws IOException;

    /* renamed from: Q */
    public abstract long mo55490Q() throws IOException;

    /* renamed from: R */
    public abstract long mo55491R() throws IOException;

    /* renamed from: S */
    public abstract int mo55492S() throws IOException;

    /* renamed from: T */
    public abstract long mo55493T() throws IOException;

    /* renamed from: U */
    public abstract int mo55494U() throws IOException;

    /* renamed from: V */
    public abstract long mo55495V() throws IOException;

    /* renamed from: W */
    public abstract String mo55496W() throws IOException;

    /* renamed from: X */
    public abstract String mo55497X() throws IOException;

    /* renamed from: Y */
    public abstract int mo55498Y() throws IOException;

    /* renamed from: Z */
    public abstract int mo55499Z() throws IOException;

    /* renamed from: a */
    public abstract void mo55500a(int i) throws InvalidProtocolBufferException;

    /* renamed from: a0 */
    public abstract long mo55501a0() throws IOException;

    @Deprecated
    /* renamed from: b0 */
    public abstract void mo55502b0(int i, C18920z1.C18921a aVar) throws IOException;

    /* renamed from: c0 */
    public abstract void mo55503c0();

    /* renamed from: d */
    public final void mo55504d() {
        this.f48059e = true;
    }

    /* renamed from: d0 */
    public final int mo55505d0(int i) {
        if (i >= 0) {
            int i2 = this.f48056b;
            this.f48056b = i;
            return i2;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i);
    }

    /* renamed from: e */
    public abstract void mo55506e(boolean z);

    /* renamed from: e0 */
    public final int mo55507e0(int i) {
        if (i >= 0) {
            int i2 = this.f48057c;
            this.f48057c = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i);
    }

    /* renamed from: f */
    public abstract int mo55508f();

    /* renamed from: f0 */
    public final boolean mo55509f0() {
        return this.f48059e;
    }

    /* renamed from: g */
    public abstract int mo55510g();

    /* renamed from: g0 */
    public abstract boolean mo55511g0(int i) throws IOException;

    /* renamed from: h */
    public abstract int mo55512h();

    @Deprecated
    /* renamed from: h0 */
    public abstract boolean mo55513h0(int i, CodedOutputStream codedOutputStream) throws IOException;

    /* renamed from: i */
    public abstract boolean mo55514i() throws IOException;

    /* renamed from: i0 */
    public abstract void mo55515i0() throws IOException;

    /* renamed from: j0 */
    public abstract void mo55516j0(CodedOutputStream codedOutputStream) throws IOException;

    /* renamed from: k0 */
    public abstract void mo55517k0(int i) throws IOException;

    /* renamed from: l0 */
    public final void mo55518l0() {
        this.f48059e = false;
    }

    /* renamed from: s */
    public abstract void mo55519s(int i);

    /* renamed from: t */
    public abstract int mo55520t(int i) throws InvalidProtocolBufferException;

    /* renamed from: u */
    public abstract boolean mo55521u() throws IOException;

    /* renamed from: v */
    public abstract byte[] mo55522v() throws IOException;

    /* renamed from: w */
    public abstract ByteBuffer mo55523w() throws IOException;

    /* renamed from: x */
    public abstract ByteString mo55524x() throws IOException;

    /* renamed from: y */
    public abstract double mo55525y() throws IOException;

    /* renamed from: z */
    public abstract int mo55526z() throws IOException;

    public C18889w() {
        this.f48056b = 100;
        this.f48057c = Integer.MAX_VALUE;
        this.f48059e = false;
    }
}
