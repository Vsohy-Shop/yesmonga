package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;
import androidx.datastore.preferences.protobuf.C18868t1;
import androidx.datastore.preferences.protobuf.Utf8;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import com.contentsquare.android.api.C14092c;
import com.urbanairship.push.notifications.C9527p;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: androidx.datastore.preferences.protobuf.n */
public abstract class C18811n extends C18864t implements Writer {

    /* renamed from: e */
    public static final int f47936e = 4096;

    /* renamed from: f */
    public static final int f47937f = 1;

    /* renamed from: g */
    public static final int f47938g = 2;

    /* renamed from: a */
    public final C18848r f47939a;

    /* renamed from: b */
    public final int f47940b;

    /* renamed from: c */
    public final ArrayDeque<C18703d> f47941c;

    /* renamed from: d */
    public int f47942d;

    /* renamed from: androidx.datastore.preferences.protobuf.n$a */
    public static /* synthetic */ class C18812a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47943a;

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
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47943a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f47943a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18811n.C18812a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.n$b */
    public static final class C18813b extends C18811n {

        /* renamed from: h */
        public ByteBuffer f47944h;

        /* renamed from: i */
        public int f47945i;

        /* renamed from: j */
        public int f47946j;

        public C18813b(C18848r rVar, int i) {
            super(rVar, i, (C18812a) null);
            mo55103Z0();
        }

        /* renamed from: A */
        public void mo54206A(int i) {
            mo55079R0(i, 3);
        }

        /* renamed from: A0 */
        public void mo55063A0(long j) {
            int i = this.f47946j - 8;
            this.f47946j = i;
            this.f47944h.putLong(i + 1, j);
        }

        /* renamed from: E */
        public void mo54210E(int i, Object obj) throws IOException {
            mo55079R0(i, 4);
            C18853r2.m87361a().mo55375k(obj, this);
            mo55079R0(i, 3);
        }

        /* renamed from: F0 */
        public void mo55068F0(int i) {
            if (i >= 0) {
                mo55084W0(i);
            } else {
                mo55085X0((long) i);
            }
        }

        /* renamed from: G */
        public void mo54212G(int i) {
            mo55079R0(i, 4);
        }

        /* renamed from: K0 */
        public void mo55072K0(int i) {
            mo55084W0(CodedOutputStream.m84501c1(i));
        }

        /* renamed from: L */
        public void mo54217L(int i, int i2) {
            mo55093r0(10);
            mo55072K0(i2);
            mo55079R0(i, 0);
        }

        /* renamed from: N0 */
        public void mo55075N0(long j) {
            mo55085X0(CodedOutputStream.m84503d1(j));
        }

        /* renamed from: O */
        public void mo54220O(int i, ByteString byteString) {
            try {
                byteString.mo53746d1(this);
                mo55093r0(10);
                mo55084W0(byteString.size());
                mo55079R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: P */
        public void mo54221P(int i, Object obj, C18905x2 x2Var) throws IOException {
            int c0 = mo55088c0();
            x2Var.mo54459i(obj, this);
            mo55093r0(10);
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
        }

        /* renamed from: Q0 */
        public void mo55078Q0(String str) {
            int i;
            int i2;
            int i3;
            char charAt;
            mo55093r0(str.length());
            int length = str.length() - 1;
            this.f47946j -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f47944h.put(this.f47946j + length, (byte) charAt);
                length--;
            }
            if (length == -1) {
                this.f47946j--;
                return;
            }
            this.f47946j += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i3 = this.f47946j) >= 0) {
                    ByteBuffer byteBuffer = this.f47944h;
                    this.f47946j = i3 - 1;
                    byteBuffer.put(i3, (byte) charAt2);
                } else if (charAt2 < 2048 && (i2 = this.f47946j) > 0) {
                    ByteBuffer byteBuffer2 = this.f47944h;
                    this.f47946j = i2 - 1;
                    byteBuffer2.put(i2, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.f47944h;
                    int i4 = this.f47946j;
                    this.f47946j = i4 - 1;
                    byteBuffer3.put(i4, (byte) ((charAt2 >>> 6) | C14092c.f34671x0));
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i = this.f47946j) > 1) {
                    ByteBuffer byteBuffer4 = this.f47944h;
                    this.f47946j = i - 1;
                    byteBuffer4.put(i, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.f47944h;
                    int i5 = this.f47946j;
                    this.f47946j = i5 - 1;
                    byteBuffer5.put(i5, (byte) (((charAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.f47944h;
                    int i6 = this.f47946j;
                    this.f47946j = i6 - 1;
                    byteBuffer6.put(i6, (byte) ((charAt2 >>> 12) | C14092c.f34573Y0));
                } else if (this.f47946j > 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            ByteBuffer byteBuffer7 = this.f47944h;
                            int i7 = this.f47946j;
                            this.f47946j = i7 - 1;
                            byteBuffer7.put(i7, (byte) ((codePoint & 63) | 128));
                            ByteBuffer byteBuffer8 = this.f47944h;
                            int i8 = this.f47946j;
                            this.f47946j = i8 - 1;
                            byteBuffer8.put(i8, (byte) (((codePoint >>> 6) & 63) | 128));
                            ByteBuffer byteBuffer9 = this.f47944h;
                            int i9 = this.f47946j;
                            this.f47946j = i9 - 1;
                            byteBuffer9.put(i9, (byte) (((codePoint >>> 12) & 63) | 128));
                            ByteBuffer byteBuffer10 = this.f47944h;
                            int i10 = this.f47946j;
                            this.f47946j = i10 - 1;
                            byteBuffer10.put(i10, (byte) ((codePoint >>> 18) | C9527p.f26031b));
                        }
                    }
                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                } else {
                    mo55093r0(length);
                    length++;
                }
                length--;
            }
        }

        /* renamed from: R */
        public void mo54223R(int i, Object obj, C18905x2 x2Var) throws IOException {
            mo55079R0(i, 4);
            x2Var.mo54459i(obj, this);
            mo55079R0(i, 3);
        }

        /* renamed from: R0 */
        public void mo55079R0(int i, int i2) {
            mo55084W0(WireFormat.m85346c(i, i2));
        }

        /* renamed from: T */
        public void mo53815T(byte b) {
            ByteBuffer byteBuffer = this.f47944h;
            int i = this.f47946j;
            this.f47946j = i - 1;
            byteBuffer.put(i, b);
        }

        /* renamed from: U */
        public void mo53817U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo55106c1() < remaining) {
                mo55104a1(remaining);
            }
            int i = this.f47946j - remaining;
            this.f47946j = i;
            this.f47944h.position(i + 1);
            this.f47944h.put(byteBuffer);
        }

        /* renamed from: V */
        public void mo53819V(byte[] bArr, int i, int i2) {
            if (mo55106c1() < i2) {
                mo55104a1(i2);
            }
            int i3 = this.f47946j - i2;
            this.f47946j = i3;
            this.f47944h.position(i3 + 1);
            this.f47944h.put(bArr, i, i2);
        }

        /* renamed from: W */
        public void mo53821W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo55106c1() < remaining) {
                this.f47942d += remaining;
                this.f47941c.addFirst(C18703d.m85726j(byteBuffer));
                mo55103Z0();
                return;
            }
            int i = this.f47946j - remaining;
            this.f47946j = i;
            this.f47944h.position(i + 1);
            this.f47944h.put(byteBuffer);
        }

        /* renamed from: W0 */
        public void mo55084W0(int i) {
            if ((i & -128) == 0) {
                mo55109f1(i);
            } else if ((i & -16384) == 0) {
                mo55111h1(i);
            } else if ((-2097152 & i) == 0) {
                mo55110g1(i);
            } else if ((-268435456 & i) == 0) {
                mo55108e1(i);
            } else {
                mo55107d1(i);
            }
        }

        /* renamed from: X */
        public void mo53823X(byte[] bArr, int i, int i2) {
            if (mo55106c1() < i2) {
                this.f47942d += i2;
                this.f47941c.addFirst(C18703d.m85728l(bArr, i, i2));
                mo55103Z0();
                return;
            }
            int i3 = this.f47946j - i2;
            this.f47946j = i3;
            this.f47944h.position(i3 + 1);
            this.f47944h.put(bArr, i, i2);
        }

        /* renamed from: X0 */
        public void mo55085X0(long j) {
            switch (C18811n.m86695a0(j)) {
                case 1:
                    mo55117n1(j);
                    return;
                case 2:
                    mo55122s1(j);
                    return;
                case 3:
                    mo55121r1(j);
                    return;
                case 4:
                    mo55115l1(j);
                    return;
                case 5:
                    mo55114k1(j);
                    return;
                case 6:
                    mo55119p1(j);
                    return;
                case 7:
                    mo55118o1(j);
                    return;
                case 8:
                    mo55112i1(j);
                    return;
                case 9:
                    mo55116m1(j);
                    return;
                case 10:
                    mo55120q1(j);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: Y0 */
        public final int mo55102Y0() {
            return this.f47945i - this.f47946j;
        }

        /* renamed from: Z0 */
        public final void mo55103Z0() {
            mo55105b1(mo55089f0());
        }

        /* renamed from: a1 */
        public final void mo55104a1(int i) {
            mo55105b1(mo55090g0(i));
        }

        /* renamed from: b0 */
        public void mo55087b0() {
            if (this.f47944h != null) {
                this.f47942d += mo55102Y0();
                this.f47944h.position(this.f47946j + 1);
                this.f47944h = null;
                this.f47946j = 0;
                this.f47945i = 0;
            }
        }

        /* renamed from: b1 */
        public final void mo55105b1(C18703d dVar) {
            if (dVar.mo54491d()) {
                ByteBuffer f = dVar.mo54493f();
                if (f.isDirect()) {
                    mo55087b0();
                    this.f47941c.addFirst(dVar);
                    this.f47944h = f;
                    f.limit(f.capacity());
                    this.f47944h.position(0);
                    this.f47944h.order(ByteOrder.LITTLE_ENDIAN);
                    int limit = this.f47944h.limit() - 1;
                    this.f47945i = limit;
                    this.f47946j = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        /* renamed from: c */
        public void mo54227c(int i, int i2) {
            mo55093r0(9);
            mo55099x0(i2);
            mo55079R0(i, 5);
        }

        /* renamed from: c0 */
        public int mo55088c0() {
            return this.f47942d + mo55102Y0();
        }

        /* renamed from: c1 */
        public final int mo55106c1() {
            return this.f47946j + 1;
        }

        /* renamed from: d1 */
        public final void mo55107d1(int i) {
            ByteBuffer byteBuffer = this.f47944h;
            int i2 = this.f47946j;
            this.f47946j = i2 - 1;
            byteBuffer.put(i2, (byte) (i >>> 28));
            int i3 = this.f47946j - 4;
            this.f47946j = i3;
            this.f47944h.putInt(i3 + 1, (i & 127) | 128 | ((((i >>> 21) & 127) | 128) << 24) | ((((i >>> 14) & 127) | 128) << 16) | ((((i >>> 7) & 127) | 128) << 8));
        }

        /* renamed from: e1 */
        public final void mo55108e1(int i) {
            int i2 = this.f47946j - 4;
            this.f47946j = i2;
            this.f47944h.putInt(i2 + 1, (i & 127) | 128 | ((266338304 & i) << 3) | (((2080768 & i) | 2097152) << 2) | (((i & 16256) | 16384) << 1));
        }

        /* renamed from: f */
        public void mo54230f(int i, String str) {
            int c0 = mo55088c0();
            mo55078Q0(str);
            mo55093r0(10);
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
        }

        /* renamed from: f1 */
        public final void mo55109f1(int i) {
            ByteBuffer byteBuffer = this.f47944h;
            int i2 = this.f47946j;
            this.f47946j = i2 - 1;
            byteBuffer.put(i2, (byte) i);
        }

        /* renamed from: g */
        public void mo54231g(int i, long j) {
            mo55093r0(15);
            mo55085X0(j);
            mo55079R0(i, 0);
        }

        /* renamed from: g1 */
        public final void mo55110g1(int i) {
            int i2 = this.f47946j - 3;
            this.f47946j = i2;
            this.f47944h.putInt(i2, (((i & 127) | 128) << 8) | ((2080768 & i) << 10) | (((i & 16256) | 16384) << 9));
        }

        /* renamed from: h1 */
        public final void mo55111h1(int i) {
            int i2 = this.f47946j - 2;
            this.f47946j = i2;
            this.f47944h.putShort(i2 + 1, (short) ((i & 127) | 128 | ((i & 16256) << 1)));
        }

        /* renamed from: i */
        public void mo54233i(int i, int i2) {
            mo55093r0(15);
            mo55068F0(i2);
            mo55079R0(i, 0);
        }

        /* renamed from: i1 */
        public final void mo55112i1(long j) {
            int i = this.f47946j - 8;
            this.f47946j = i;
            this.f47944h.putLong(i + 1, (j & 127) | 128 | ((71494644084506624L & j) << 7) | (((558551906910208L & j) | 562949953421312L) << 6) | (((4363686772736L & j) | 4398046511104L) << 5) | (((34091302912L & j) | 34359738368L) << 4) | (((266338304 & j) | 268435456) << 3) | (((2080768 & j) | 2097152) << 2) | (((16256 & j) | 16384) << 1));
        }

        /* renamed from: j1 */
        public final void mo55113j1(long j) {
            int i = this.f47946j - 8;
            this.f47946j = i;
            this.f47944h.putLong(i + 1, (j & 127) | 128 | (((71494644084506624L & j) | 72057594037927936L) << 7) | (((558551906910208L & j) | 562949953421312L) << 6) | (((4363686772736L & j) | 4398046511104L) << 5) | (((34091302912L & j) | 34359738368L) << 4) | (((266338304 & j) | 268435456) << 3) | (((2080768 & j) | 2097152) << 2) | (((16256 & j) | 16384) << 1));
        }

        /* renamed from: k1 */
        public final void mo55114k1(long j) {
            int i = this.f47946j - 5;
            this.f47946j = i;
            this.f47944h.putLong(i - 2, (((j & 127) | 128) << 24) | ((34091302912L & j) << 28) | (((266338304 & j) | 268435456) << 27) | (((2080768 & j) | 2097152) << 26) | (((16256 & j) | 16384) << 25));
        }

        /* renamed from: l1 */
        public final void mo55115l1(long j) {
            mo55108e1((int) j);
        }

        /* renamed from: m1 */
        public final void mo55116m1(long j) {
            ByteBuffer byteBuffer = this.f47944h;
            int i = this.f47946j;
            this.f47946j = i - 1;
            byteBuffer.put(i, (byte) ((int) (j >>> 56)));
            mo55113j1(j & 72057594037927935L);
        }

        /* renamed from: n */
        public void mo54238n(int i, long j) {
            mo55093r0(15);
            mo55075N0(j);
            mo55079R0(i, 0);
        }

        /* renamed from: n1 */
        public final void mo55117n1(long j) {
            mo55109f1((int) j);
        }

        /* renamed from: o1 */
        public final void mo55118o1(long j) {
            int i = this.f47946j - 7;
            this.f47946j = i;
            this.f47944h.putLong(i, (((j & 127) | 128) << 8) | ((558551906910208L & j) << 14) | (((4363686772736L & j) | 4398046511104L) << 13) | (((34091302912L & j) | 34359738368L) << 12) | (((266338304 & j) | 268435456) << 11) | (((2080768 & j) | 2097152) << 10) | (((16256 & j) | 16384) << 9));
        }

        /* renamed from: p */
        public void mo54240p(int i, int i2) {
            mo55093r0(10);
            mo55084W0(i2);
            mo55079R0(i, 0);
        }

        /* renamed from: p1 */
        public final void mo55119p1(long j) {
            int i = this.f47946j - 6;
            this.f47946j = i;
            this.f47944h.putLong(i - 1, (((j & 127) | 128) << 16) | ((4363686772736L & j) << 21) | (((34091302912L & j) | 34359738368L) << 20) | (((266338304 & j) | 268435456) << 19) | (((2080768 & j) | 2097152) << 18) | (((16256 & j) | 16384) << 17));
        }

        /* renamed from: q1 */
        public final void mo55120q1(long j) {
            ByteBuffer byteBuffer = this.f47944h;
            int i = this.f47946j;
            this.f47946j = i - 1;
            byteBuffer.put(i, (byte) ((int) (j >>> 63)));
            ByteBuffer byteBuffer2 = this.f47944h;
            int i2 = this.f47946j;
            this.f47946j = i2 - 1;
            byteBuffer2.put(i2, (byte) ((int) (((j >>> 56) & 127) | 128)));
            mo55113j1(j & 72057594037927935L);
        }

        /* renamed from: r0 */
        public void mo55093r0(int i) {
            if (mo55106c1() < i) {
                mo55104a1(i);
            }
        }

        /* renamed from: r1 */
        public final void mo55121r1(long j) {
            mo55110g1((int) j);
        }

        /* renamed from: s0 */
        public void mo55094s0(boolean z) {
            mo53815T(z ? (byte) 1 : 0);
        }

        /* renamed from: s1 */
        public final void mo55122s1(long j) {
            mo55111h1((int) j);
        }

        /* renamed from: t */
        public void mo54244t(int i, long j) {
            mo55093r0(13);
            mo55063A0(j);
            mo55079R0(i, 1);
        }

        /* renamed from: w */
        public void mo54247w(int i, Object obj) throws IOException {
            int c0 = mo55088c0();
            C18853r2.m87361a().mo55375k(obj, this);
            mo55093r0(10);
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
        }

        /* renamed from: x0 */
        public void mo55099x0(int i) {
            int i2 = this.f47946j - 4;
            this.f47946j = i2;
            this.f47944h.putInt(i2 + 1, i);
        }

        /* renamed from: y */
        public void mo54249y(int i, boolean z) {
            mo55093r0(6);
            mo53815T(z ? (byte) 1 : 0);
            mo55079R0(i, 0);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.n$c */
    public static final class C18814c extends C18811n {

        /* renamed from: h */
        public C18703d f47947h;

        /* renamed from: i */
        public byte[] f47948i;

        /* renamed from: j */
        public int f47949j;

        /* renamed from: k */
        public int f47950k;

        /* renamed from: l */
        public int f47951l;

        /* renamed from: m */
        public int f47952m;

        /* renamed from: n */
        public int f47953n;

        public C18814c(C18848r rVar, int i) {
            super(rVar, i, (C18812a) null);
            mo55124Z0();
        }

        /* renamed from: A */
        public void mo54206A(int i) {
            mo55079R0(i, 3);
        }

        /* renamed from: A0 */
        public void mo55063A0(long j) {
            byte[] bArr = this.f47948i;
            int i = this.f47953n;
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
            this.f47953n = i8 - 1;
            bArr[i8] = (byte) (((int) j) & 255);
        }

        /* renamed from: E */
        public void mo54210E(int i, Object obj) throws IOException {
            mo55079R0(i, 4);
            C18853r2.m87361a().mo55375k(obj, this);
            mo55079R0(i, 3);
        }

        /* renamed from: F0 */
        public void mo55068F0(int i) {
            if (i >= 0) {
                mo55084W0(i);
            } else {
                mo55085X0((long) i);
            }
        }

        /* renamed from: G */
        public void mo54212G(int i) {
            mo55079R0(i, 4);
        }

        /* renamed from: K0 */
        public void mo55072K0(int i) {
            mo55084W0(CodedOutputStream.m84501c1(i));
        }

        /* renamed from: L */
        public void mo54217L(int i, int i2) throws IOException {
            mo55093r0(10);
            mo55072K0(i2);
            mo55079R0(i, 0);
        }

        /* renamed from: N0 */
        public void mo55075N0(long j) {
            mo55085X0(CodedOutputStream.m84503d1(j));
        }

        /* renamed from: O */
        public void mo54220O(int i, ByteString byteString) throws IOException {
            try {
                byteString.mo53746d1(this);
                mo55093r0(10);
                mo55084W0(byteString.size());
                mo55079R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: P */
        public void mo54221P(int i, Object obj, C18905x2 x2Var) throws IOException {
            int c0 = mo55088c0();
            x2Var.mo54459i(obj, this);
            mo55093r0(10);
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
        }

        /* renamed from: Q0 */
        public void mo55078Q0(String str) {
            int i;
            int i2;
            int i3;
            char charAt;
            mo55093r0(str.length());
            int length = str.length() - 1;
            this.f47953n -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f47948i[this.f47953n + length] = (byte) charAt;
                length--;
            }
            if (length == -1) {
                this.f47953n--;
                return;
            }
            this.f47953n += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i3 = this.f47953n) > this.f47951l) {
                    byte[] bArr = this.f47948i;
                    this.f47953n = i3 - 1;
                    bArr[i3] = (byte) charAt2;
                } else if (charAt2 < 2048 && (i2 = this.f47953n) > this.f47949j) {
                    byte[] bArr2 = this.f47948i;
                    int i4 = i2 - 1;
                    bArr2[i2] = (byte) ((charAt2 & '?') | 128);
                    this.f47953n = i4 - 1;
                    bArr2[i4] = (byte) ((charAt2 >>> 6) | C14092c.f34671x0);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i = this.f47953n) > this.f47949j + 1) {
                    byte[] bArr3 = this.f47948i;
                    int i5 = i - 1;
                    bArr3[i] = (byte) ((charAt2 & '?') | 128);
                    int i6 = i5 - 1;
                    bArr3[i5] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    this.f47953n = i6 - 1;
                    bArr3[i6] = (byte) ((charAt2 >>> 12) | C14092c.f34573Y0);
                } else if (this.f47953n > this.f47949j + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            byte[] bArr4 = this.f47948i;
                            int i7 = this.f47953n;
                            int i8 = i7 - 1;
                            bArr4[i7] = (byte) ((codePoint & 63) | 128);
                            int i9 = i8 - 1;
                            bArr4[i8] = (byte) (((codePoint >>> 6) & 63) | 128);
                            int i10 = i9 - 1;
                            bArr4[i9] = (byte) (((codePoint >>> 12) & 63) | 128);
                            this.f47953n = i10 - 1;
                            bArr4[i10] = (byte) ((codePoint >>> 18) | C9527p.f26031b);
                        }
                    }
                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                } else {
                    mo55093r0(length);
                    length++;
                }
                length--;
            }
        }

        /* renamed from: R */
        public void mo54223R(int i, Object obj, C18905x2 x2Var) throws IOException {
            mo55079R0(i, 4);
            x2Var.mo54459i(obj, this);
            mo55079R0(i, 3);
        }

        /* renamed from: R0 */
        public void mo55079R0(int i, int i2) {
            mo55084W0(WireFormat.m85346c(i, i2));
        }

        /* renamed from: T */
        public void mo53815T(byte b) {
            byte[] bArr = this.f47948i;
            int i = this.f47953n;
            this.f47953n = i - 1;
            bArr[i] = b;
        }

        /* renamed from: U */
        public void mo53817U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo55127c1() < remaining) {
                mo55125a1(remaining);
            }
            int i = this.f47953n - remaining;
            this.f47953n = i;
            byteBuffer.get(this.f47948i, i + 1, remaining);
        }

        /* renamed from: V */
        public void mo53819V(byte[] bArr, int i, int i2) {
            if (mo55127c1() < i2) {
                mo55125a1(i2);
            }
            int i3 = this.f47953n - i2;
            this.f47953n = i3;
            System.arraycopy(bArr, i, this.f47948i, i3 + 1, i2);
        }

        /* renamed from: W */
        public void mo53821W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo55127c1() < remaining) {
                this.f47942d += remaining;
                this.f47941c.addFirst(C18703d.m85726j(byteBuffer));
                mo55124Z0();
            }
            int i = this.f47953n - remaining;
            this.f47953n = i;
            byteBuffer.get(this.f47948i, i + 1, remaining);
        }

        /* renamed from: W0 */
        public void mo55084W0(int i) {
            if ((i & -128) == 0) {
                mo55130f1(i);
            } else if ((i & -16384) == 0) {
                mo55132h1(i);
            } else if ((-2097152 & i) == 0) {
                mo55131g1(i);
            } else if ((-268435456 & i) == 0) {
                mo55129e1(i);
            } else {
                mo55128d1(i);
            }
        }

        /* renamed from: X */
        public void mo53823X(byte[] bArr, int i, int i2) {
            if (mo55127c1() < i2) {
                this.f47942d += i2;
                this.f47941c.addFirst(C18703d.m85728l(bArr, i, i2));
                mo55124Z0();
                return;
            }
            int i3 = this.f47953n - i2;
            this.f47953n = i3;
            System.arraycopy(bArr, i, this.f47948i, i3 + 1, i2);
        }

        /* renamed from: X0 */
        public void mo55085X0(long j) {
            switch (C18811n.m86695a0(j)) {
                case 1:
                    mo55137m1(j);
                    return;
                case 2:
                    mo55142r1(j);
                    return;
                case 3:
                    mo55141q1(j);
                    return;
                case 4:
                    mo55135k1(j);
                    return;
                case 5:
                    mo55134j1(j);
                    return;
                case 6:
                    mo55139o1(j);
                    return;
                case 7:
                    mo55138n1(j);
                    return;
                case 8:
                    mo55133i1(j);
                    return;
                case 9:
                    mo55136l1(j);
                    return;
                case 10:
                    mo55140p1(j);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: Y0 */
        public int mo55123Y0() {
            return this.f47952m - this.f47953n;
        }

        /* renamed from: Z0 */
        public final void mo55124Z0() {
            mo55126b1(mo55091j0());
        }

        /* renamed from: a1 */
        public final void mo55125a1(int i) {
            mo55126b1(mo55092k0(i));
        }

        /* renamed from: b0 */
        public void mo55087b0() {
            if (this.f47947h != null) {
                this.f47942d += mo55123Y0();
                C18703d dVar = this.f47947h;
                dVar.mo54495h((this.f47953n - dVar.mo54489b()) + 1);
                this.f47947h = null;
                this.f47953n = 0;
                this.f47952m = 0;
            }
        }

        /* renamed from: b1 */
        public final void mo55126b1(C18703d dVar) {
            if (dVar.mo54490c()) {
                mo55087b0();
                this.f47941c.addFirst(dVar);
                this.f47947h = dVar;
                this.f47948i = dVar.mo54488a();
                int b = dVar.mo54489b();
                this.f47950k = dVar.mo54492e() + b;
                int g = b + dVar.mo54494g();
                this.f47949j = g;
                this.f47951l = g - 1;
                int i = this.f47950k - 1;
                this.f47952m = i;
                this.f47953n = i;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        /* renamed from: c */
        public void mo54227c(int i, int i2) throws IOException {
            mo55093r0(9);
            mo55099x0(i2);
            mo55079R0(i, 5);
        }

        /* renamed from: c0 */
        public int mo55088c0() {
            return this.f47942d + mo55123Y0();
        }

        /* renamed from: c1 */
        public int mo55127c1() {
            return this.f47953n - this.f47951l;
        }

        /* renamed from: d1 */
        public final void mo55128d1(int i) {
            byte[] bArr = this.f47948i;
            int i2 = this.f47953n;
            int i3 = i2 - 1;
            bArr[i2] = (byte) (i >>> 28);
            int i4 = i3 - 1;
            bArr[i3] = (byte) (((i >>> 21) & 127) | 128);
            int i5 = i4 - 1;
            bArr[i4] = (byte) (((i >>> 14) & 127) | 128);
            int i6 = i5 - 1;
            bArr[i5] = (byte) (((i >>> 7) & 127) | 128);
            this.f47953n = i6 - 1;
            bArr[i6] = (byte) ((i & 127) | 128);
        }

        /* renamed from: e1 */
        public final void mo55129e1(int i) {
            byte[] bArr = this.f47948i;
            int i2 = this.f47953n;
            int i3 = i2 - 1;
            bArr[i2] = (byte) (i >>> 21);
            int i4 = i3 - 1;
            bArr[i3] = (byte) (((i >>> 14) & 127) | 128);
            int i5 = i4 - 1;
            bArr[i4] = (byte) (((i >>> 7) & 127) | 128);
            this.f47953n = i5 - 1;
            bArr[i5] = (byte) ((i & 127) | 128);
        }

        /* renamed from: f */
        public void mo54230f(int i, String str) throws IOException {
            int c0 = mo55088c0();
            mo55078Q0(str);
            mo55093r0(10);
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
        }

        /* renamed from: f1 */
        public final void mo55130f1(int i) {
            byte[] bArr = this.f47948i;
            int i2 = this.f47953n;
            this.f47953n = i2 - 1;
            bArr[i2] = (byte) i;
        }

        /* renamed from: g */
        public void mo54231g(int i, long j) throws IOException {
            mo55093r0(15);
            mo55085X0(j);
            mo55079R0(i, 0);
        }

        /* renamed from: g1 */
        public final void mo55131g1(int i) {
            byte[] bArr = this.f47948i;
            int i2 = this.f47953n;
            int i3 = i2 - 1;
            bArr[i2] = (byte) (i >>> 14);
            int i4 = i3 - 1;
            bArr[i3] = (byte) (((i >>> 7) & 127) | 128);
            this.f47953n = i4 - 1;
            bArr[i4] = (byte) ((i & 127) | 128);
        }

        /* renamed from: h1 */
        public final void mo55132h1(int i) {
            byte[] bArr = this.f47948i;
            int i2 = this.f47953n;
            int i3 = i2 - 1;
            bArr[i2] = (byte) (i >>> 7);
            this.f47953n = i3 - 1;
            bArr[i3] = (byte) ((i & 127) | 128);
        }

        /* renamed from: i */
        public void mo54233i(int i, int i2) throws IOException {
            mo55093r0(15);
            mo55068F0(i2);
            mo55079R0(i, 0);
        }

        /* renamed from: i1 */
        public final void mo55133i1(long j) {
            byte[] bArr = this.f47948i;
            int i = this.f47953n;
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
            this.f47953n = i8 - 1;
            bArr[i8] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: j1 */
        public final void mo55134j1(long j) {
            byte[] bArr = this.f47948i;
            int i = this.f47953n;
            int i2 = i - 1;
            bArr[i] = (byte) ((int) (j >>> 28));
            int i3 = i2 - 1;
            bArr[i2] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i4 = i3 - 1;
            bArr[i3] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i5 = i4 - 1;
            bArr[i4] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f47953n = i5 - 1;
            bArr[i5] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: k1 */
        public final void mo55135k1(long j) {
            byte[] bArr = this.f47948i;
            int i = this.f47953n;
            int i2 = i - 1;
            bArr[i] = (byte) ((int) (j >>> 21));
            int i3 = i2 - 1;
            bArr[i2] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i4 = i3 - 1;
            bArr[i3] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f47953n = i4 - 1;
            bArr[i4] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: l1 */
        public final void mo55136l1(long j) {
            byte[] bArr = this.f47948i;
            int i = this.f47953n;
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
            this.f47953n = i9 - 1;
            bArr[i9] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: m1 */
        public final void mo55137m1(long j) {
            byte[] bArr = this.f47948i;
            int i = this.f47953n;
            this.f47953n = i - 1;
            bArr[i] = (byte) ((int) j);
        }

        /* renamed from: n */
        public void mo54238n(int i, long j) throws IOException {
            mo55093r0(15);
            mo55075N0(j);
            mo55079R0(i, 0);
        }

        /* renamed from: n1 */
        public final void mo55138n1(long j) {
            byte[] bArr = this.f47948i;
            int i = this.f47953n;
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
            this.f47953n = i7 - 1;
            bArr[i7] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: o1 */
        public final void mo55139o1(long j) {
            byte[] bArr = this.f47948i;
            int i = this.f47953n;
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
            this.f47953n = i6 - 1;
            bArr[i6] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: p */
        public void mo54240p(int i, int i2) throws IOException {
            mo55093r0(10);
            mo55084W0(i2);
            mo55079R0(i, 0);
        }

        /* renamed from: p1 */
        public final void mo55140p1(long j) {
            byte[] bArr = this.f47948i;
            int i = this.f47953n;
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
            this.f47953n = i10 - 1;
            bArr[i10] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: q1 */
        public final void mo55141q1(long j) {
            byte[] bArr = this.f47948i;
            int i = this.f47953n;
            int i2 = i - 1;
            bArr[i] = (byte) (((int) j) >>> 14);
            int i3 = i2 - 1;
            bArr[i2] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f47953n = i3 - 1;
            bArr[i3] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: r0 */
        public void mo55093r0(int i) {
            if (mo55127c1() < i) {
                mo55125a1(i);
            }
        }

        /* renamed from: r1 */
        public final void mo55142r1(long j) {
            byte[] bArr = this.f47948i;
            int i = this.f47953n;
            int i2 = i - 1;
            bArr[i] = (byte) ((int) (j >>> 7));
            this.f47953n = i2 - 1;
            bArr[i2] = (byte) ((((int) j) & 127) | 128);
        }

        /* renamed from: s0 */
        public void mo55094s0(boolean z) {
            mo53815T(z ? (byte) 1 : 0);
        }

        /* renamed from: t */
        public void mo54244t(int i, long j) throws IOException {
            mo55093r0(13);
            mo55063A0(j);
            mo55079R0(i, 1);
        }

        /* renamed from: w */
        public void mo54247w(int i, Object obj) throws IOException {
            int c0 = mo55088c0();
            C18853r2.m87361a().mo55375k(obj, this);
            mo55093r0(10);
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
        }

        /* renamed from: x0 */
        public void mo55099x0(int i) {
            byte[] bArr = this.f47948i;
            int i2 = this.f47953n;
            int i3 = i2 - 1;
            bArr[i2] = (byte) ((i >> 24) & 255);
            int i4 = i3 - 1;
            bArr[i3] = (byte) ((i >> 16) & 255);
            int i5 = i4 - 1;
            bArr[i4] = (byte) ((i >> 8) & 255);
            this.f47953n = i5 - 1;
            bArr[i5] = (byte) (i & 255);
        }

        /* renamed from: y */
        public void mo54249y(int i, boolean z) throws IOException {
            mo55093r0(6);
            mo53815T(z ? (byte) 1 : 0);
            mo55079R0(i, 0);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.n$d */
    public static final class C18815d extends C18811n {

        /* renamed from: h */
        public ByteBuffer f47954h;

        /* renamed from: i */
        public long f47955i;

        /* renamed from: j */
        public long f47956j;

        /* renamed from: k */
        public long f47957k;

        public C18815d(C18848r rVar, int i) {
            super(rVar, i, (C18812a) null);
            mo55145c1();
        }

        /* renamed from: b1 */
        public static boolean m86884b1() {
            return C18923z3.m88373T();
        }

        /* renamed from: A */
        public void mo54206A(int i) {
            mo55079R0(i, 3);
        }

        /* renamed from: A0 */
        public void mo55063A0(long j) {
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) (((int) (j >> 56)) & 255));
            long j3 = this.f47957k;
            this.f47957k = j3 - 1;
            C18923z3.m88383b0(j3, (byte) (((int) (j >> 48)) & 255));
            long j4 = this.f47957k;
            this.f47957k = j4 - 1;
            C18923z3.m88383b0(j4, (byte) (((int) (j >> 40)) & 255));
            long j5 = this.f47957k;
            this.f47957k = j5 - 1;
            C18923z3.m88383b0(j5, (byte) (((int) (j >> 32)) & 255));
            long j6 = this.f47957k;
            this.f47957k = j6 - 1;
            C18923z3.m88383b0(j6, (byte) (((int) (j >> 24)) & 255));
            long j7 = this.f47957k;
            this.f47957k = j7 - 1;
            C18923z3.m88383b0(j7, (byte) (((int) (j >> 16)) & 255));
            long j8 = this.f47957k;
            this.f47957k = j8 - 1;
            C18923z3.m88383b0(j8, (byte) (((int) (j >> 8)) & 255));
            long j9 = this.f47957k;
            this.f47957k = j9 - 1;
            C18923z3.m88383b0(j9, (byte) (((int) j) & 255));
        }

        /* renamed from: E */
        public void mo54210E(int i, Object obj) throws IOException {
            mo55079R0(i, 4);
            C18853r2.m87361a().mo55375k(obj, this);
            mo55079R0(i, 3);
        }

        /* renamed from: F0 */
        public void mo55068F0(int i) {
            if (i >= 0) {
                mo55084W0(i);
            } else {
                mo55085X0((long) i);
            }
        }

        /* renamed from: G */
        public void mo54212G(int i) {
            mo55079R0(i, 4);
        }

        /* renamed from: K0 */
        public void mo55072K0(int i) {
            mo55084W0(CodedOutputStream.m84501c1(i));
        }

        /* renamed from: L */
        public void mo54217L(int i, int i2) {
            mo55093r0(10);
            mo55072K0(i2);
            mo55079R0(i, 0);
        }

        /* renamed from: N0 */
        public void mo55075N0(long j) {
            mo55085X0(CodedOutputStream.m84503d1(j));
        }

        /* renamed from: O */
        public void mo54220O(int i, ByteString byteString) {
            try {
                byteString.mo53746d1(this);
                mo55093r0(10);
                mo55084W0(byteString.size());
                mo55079R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: P */
        public void mo54221P(int i, Object obj, C18905x2 x2Var) throws IOException {
            int c0 = mo55088c0();
            x2Var.mo54459i(obj, this);
            mo55093r0(10);
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
        }

        /* renamed from: Q0 */
        public void mo55078Q0(String str) {
            char charAt;
            mo55093r0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length >= 0 && (charAt = str.charAt(length)) < 128) {
                    long j = this.f47957k;
                    this.f47957k = j - 1;
                    C18923z3.m88383b0(j, (byte) charAt);
                }
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j2 = this.f47957k;
                        if (j2 >= this.f47955i) {
                            this.f47957k = j2 - 1;
                            C18923z3.m88383b0(j2, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j3 = this.f47957k;
                        if (j3 > this.f47955i) {
                            this.f47957k = j3 - 1;
                            C18923z3.m88383b0(j3, (byte) ((charAt2 & '?') | 128));
                            long j4 = this.f47957k;
                            this.f47957k = j4 - 1;
                            C18923z3.m88383b0(j4, (byte) ((charAt2 >>> 6) | C14092c.f34671x0));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j5 = this.f47957k;
                        if (j5 > this.f47955i + 1) {
                            this.f47957k = j5 - 1;
                            C18923z3.m88383b0(j5, (byte) ((charAt2 & '?') | 128));
                            long j6 = this.f47957k;
                            this.f47957k = j6 - 1;
                            C18923z3.m88383b0(j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                            long j7 = this.f47957k;
                            this.f47957k = j7 - 1;
                            C18923z3.m88383b0(j7, (byte) ((charAt2 >>> 12) | C14092c.f34573Y0));
                            length--;
                        }
                    }
                    if (this.f47957k > this.f47955i + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                long j8 = this.f47957k;
                                this.f47957k = j8 - 1;
                                C18923z3.m88383b0(j8, (byte) ((codePoint & 63) | 128));
                                long j9 = this.f47957k;
                                this.f47957k = j9 - 1;
                                C18923z3.m88383b0(j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j10 = this.f47957k;
                                this.f47957k = j10 - 1;
                                C18923z3.m88383b0(j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j11 = this.f47957k;
                                this.f47957k = j11 - 1;
                                C18923z3.m88383b0(j11, (byte) ((codePoint >>> 18) | C9527p.f26031b));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    mo55093r0(length);
                    length++;
                    length--;
                }
            }
        }

        /* renamed from: R */
        public void mo54223R(int i, Object obj, C18905x2 x2Var) throws IOException {
            mo55079R0(i, 4);
            x2Var.mo54459i(obj, this);
            mo55079R0(i, 3);
        }

        /* renamed from: R0 */
        public void mo55079R0(int i, int i2) {
            mo55084W0(WireFormat.m85346c(i, i2));
        }

        /* renamed from: T */
        public void mo53815T(byte b) {
            long j = this.f47957k;
            this.f47957k = j - 1;
            C18923z3.m88383b0(j, b);
        }

        /* renamed from: U */
        public void mo53817U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo55148f1() < remaining) {
                mo55146d1(remaining);
            }
            this.f47957k -= (long) remaining;
            this.f47954h.position(mo55143Z0() + 1);
            this.f47954h.put(byteBuffer);
        }

        /* renamed from: V */
        public void mo53819V(byte[] bArr, int i, int i2) {
            if (mo55148f1() < i2) {
                mo55146d1(i2);
            }
            this.f47957k -= (long) i2;
            this.f47954h.position(mo55143Z0() + 1);
            this.f47954h.put(bArr, i, i2);
        }

        /* renamed from: W */
        public void mo53821W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo55148f1() < remaining) {
                this.f47942d += remaining;
                this.f47941c.addFirst(C18703d.m85726j(byteBuffer));
                mo55145c1();
                return;
            }
            this.f47957k -= (long) remaining;
            this.f47954h.position(mo55143Z0() + 1);
            this.f47954h.put(byteBuffer);
        }

        /* renamed from: W0 */
        public void mo55084W0(int i) {
            if ((i & -128) == 0) {
                mo55151i1(i);
            } else if ((i & -16384) == 0) {
                mo55153k1(i);
            } else if ((-2097152 & i) == 0) {
                mo55152j1(i);
            } else if ((-268435456 & i) == 0) {
                mo55150h1(i);
            } else {
                mo55149g1(i);
            }
        }

        /* renamed from: X */
        public void mo53823X(byte[] bArr, int i, int i2) {
            if (mo55148f1() < i2) {
                this.f47942d += i2;
                this.f47941c.addFirst(C18703d.m85728l(bArr, i, i2));
                mo55145c1();
                return;
            }
            this.f47957k -= (long) i2;
            this.f47954h.position(mo55143Z0() + 1);
            this.f47954h.put(bArr, i, i2);
        }

        /* renamed from: X0 */
        public void mo55085X0(long j) {
            switch (C18811n.m86695a0(j)) {
                case 1:
                    mo55158p1(j);
                    return;
                case 2:
                    mo55163u1(j);
                    return;
                case 3:
                    mo55162t1(j);
                    return;
                case 4:
                    mo55156n1(j);
                    return;
                case 5:
                    mo55155m1(j);
                    return;
                case 6:
                    mo55160r1(j);
                    return;
                case 7:
                    mo55159q1(j);
                    return;
                case 8:
                    mo55154l1(j);
                    return;
                case 9:
                    mo55157o1(j);
                    return;
                case 10:
                    mo55161s1(j);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: Z0 */
        public final int mo55143Z0() {
            return (int) (this.f47957k - this.f47955i);
        }

        /* renamed from: a1 */
        public final int mo55144a1() {
            return (int) (this.f47956j - this.f47957k);
        }

        /* renamed from: b0 */
        public void mo55087b0() {
            if (this.f47954h != null) {
                this.f47942d += mo55144a1();
                this.f47954h.position(mo55143Z0() + 1);
                this.f47954h = null;
                this.f47957k = 0;
                this.f47956j = 0;
            }
        }

        /* renamed from: c */
        public void mo54227c(int i, int i2) {
            mo55093r0(9);
            mo55099x0(i2);
            mo55079R0(i, 5);
        }

        /* renamed from: c0 */
        public int mo55088c0() {
            return this.f47942d + mo55144a1();
        }

        /* renamed from: c1 */
        public final void mo55145c1() {
            mo55147e1(mo55089f0());
        }

        /* renamed from: d1 */
        public final void mo55146d1(int i) {
            mo55147e1(mo55090g0(i));
        }

        /* renamed from: e1 */
        public final void mo55147e1(C18703d dVar) {
            if (dVar.mo54491d()) {
                ByteBuffer f = dVar.mo54493f();
                if (f.isDirect()) {
                    mo55087b0();
                    this.f47941c.addFirst(dVar);
                    this.f47954h = f;
                    f.limit(f.capacity());
                    this.f47954h.position(0);
                    long i = C18923z3.m88396i(this.f47954h);
                    this.f47955i = i;
                    long limit = i + ((long) (this.f47954h.limit() - 1));
                    this.f47956j = limit;
                    this.f47957k = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        /* renamed from: f */
        public void mo54230f(int i, String str) {
            int c0 = mo55088c0();
            mo55078Q0(str);
            mo55093r0(10);
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
        }

        /* renamed from: f1 */
        public final int mo55148f1() {
            return mo55143Z0() + 1;
        }

        /* renamed from: g */
        public void mo54231g(int i, long j) {
            mo55093r0(15);
            mo55085X0(j);
            mo55079R0(i, 0);
        }

        /* renamed from: g1 */
        public final void mo55149g1(int i) {
            long j = this.f47957k;
            this.f47957k = j - 1;
            C18923z3.m88383b0(j, (byte) (i >>> 28));
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) (((i >>> 21) & 127) | 128));
            long j3 = this.f47957k;
            this.f47957k = j3 - 1;
            C18923z3.m88383b0(j3, (byte) (((i >>> 14) & 127) | 128));
            long j4 = this.f47957k;
            this.f47957k = j4 - 1;
            C18923z3.m88383b0(j4, (byte) (((i >>> 7) & 127) | 128));
            long j5 = this.f47957k;
            this.f47957k = j5 - 1;
            C18923z3.m88383b0(j5, (byte) ((i & 127) | 128));
        }

        /* renamed from: h1 */
        public final void mo55150h1(int i) {
            long j = this.f47957k;
            this.f47957k = j - 1;
            C18923z3.m88383b0(j, (byte) (i >>> 21));
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) (((i >>> 14) & 127) | 128));
            long j3 = this.f47957k;
            this.f47957k = j3 - 1;
            C18923z3.m88383b0(j3, (byte) (((i >>> 7) & 127) | 128));
            long j4 = this.f47957k;
            this.f47957k = j4 - 1;
            C18923z3.m88383b0(j4, (byte) ((i & 127) | 128));
        }

        /* renamed from: i */
        public void mo54233i(int i, int i2) {
            mo55093r0(15);
            mo55068F0(i2);
            mo55079R0(i, 0);
        }

        /* renamed from: i1 */
        public final void mo55151i1(int i) {
            long j = this.f47957k;
            this.f47957k = j - 1;
            C18923z3.m88383b0(j, (byte) i);
        }

        /* renamed from: j1 */
        public final void mo55152j1(int i) {
            long j = this.f47957k;
            this.f47957k = j - 1;
            C18923z3.m88383b0(j, (byte) (i >>> 14));
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) (((i >>> 7) & 127) | 128));
            long j3 = this.f47957k;
            this.f47957k = j3 - 1;
            C18923z3.m88383b0(j3, (byte) ((i & 127) | 128));
        }

        /* renamed from: k1 */
        public final void mo55153k1(int i) {
            long j = this.f47957k;
            this.f47957k = j - 1;
            C18923z3.m88383b0(j, (byte) (i >>> 7));
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) ((i & 127) | 128));
        }

        /* renamed from: l1 */
        public final void mo55154l1(long j) {
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) ((int) (j >>> 49)));
            long j3 = this.f47957k;
            this.f47957k = j3 - 1;
            C18923z3.m88383b0(j3, (byte) ((int) (((j >>> 42) & 127) | 128)));
            long j4 = this.f47957k;
            this.f47957k = j4 - 1;
            C18923z3.m88383b0(j4, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j5 = this.f47957k;
            this.f47957k = j5 - 1;
            C18923z3.m88383b0(j5, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j6 = this.f47957k;
            this.f47957k = j6 - 1;
            C18923z3.m88383b0(j6, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j7 = this.f47957k;
            this.f47957k = j7 - 1;
            C18923z3.m88383b0(j7, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j8 = this.f47957k;
            this.f47957k = j8 - 1;
            C18923z3.m88383b0(j8, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j9 = this.f47957k;
            this.f47957k = j9 - 1;
            C18923z3.m88383b0(j9, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: m1 */
        public final void mo55155m1(long j) {
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) ((int) (j >>> 28)));
            long j3 = this.f47957k;
            this.f47957k = j3 - 1;
            C18923z3.m88383b0(j3, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j4 = this.f47957k;
            this.f47957k = j4 - 1;
            C18923z3.m88383b0(j4, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j5 = this.f47957k;
            this.f47957k = j5 - 1;
            C18923z3.m88383b0(j5, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j6 = this.f47957k;
            this.f47957k = j6 - 1;
            C18923z3.m88383b0(j6, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: n */
        public void mo54238n(int i, long j) {
            mo55093r0(15);
            mo55075N0(j);
            mo55079R0(i, 0);
        }

        /* renamed from: n1 */
        public final void mo55156n1(long j) {
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) ((int) (j >>> 21)));
            long j3 = this.f47957k;
            this.f47957k = j3 - 1;
            C18923z3.m88383b0(j3, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j4 = this.f47957k;
            this.f47957k = j4 - 1;
            C18923z3.m88383b0(j4, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j5 = this.f47957k;
            this.f47957k = j5 - 1;
            C18923z3.m88383b0(j5, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: o1 */
        public final void mo55157o1(long j) {
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) ((int) (j >>> 56)));
            long j3 = this.f47957k;
            this.f47957k = j3 - 1;
            C18923z3.m88383b0(j3, (byte) ((int) (((j >>> 49) & 127) | 128)));
            long j4 = this.f47957k;
            this.f47957k = j4 - 1;
            C18923z3.m88383b0(j4, (byte) ((int) (((j >>> 42) & 127) | 128)));
            long j5 = this.f47957k;
            this.f47957k = j5 - 1;
            C18923z3.m88383b0(j5, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j6 = this.f47957k;
            this.f47957k = j6 - 1;
            C18923z3.m88383b0(j6, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j7 = this.f47957k;
            this.f47957k = j7 - 1;
            C18923z3.m88383b0(j7, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j8 = this.f47957k;
            this.f47957k = j8 - 1;
            C18923z3.m88383b0(j8, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j9 = this.f47957k;
            this.f47957k = j9 - 1;
            C18923z3.m88383b0(j9, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j10 = this.f47957k;
            this.f47957k = j10 - 1;
            C18923z3.m88383b0(j10, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: p */
        public void mo54240p(int i, int i2) {
            mo55093r0(10);
            mo55084W0(i2);
            mo55079R0(i, 0);
        }

        /* renamed from: p1 */
        public final void mo55158p1(long j) {
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) ((int) j));
        }

        /* renamed from: q1 */
        public final void mo55159q1(long j) {
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) ((int) (j >>> 42)));
            long j3 = this.f47957k;
            this.f47957k = j3 - 1;
            C18923z3.m88383b0(j3, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j4 = this.f47957k;
            this.f47957k = j4 - 1;
            C18923z3.m88383b0(j4, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j5 = this.f47957k;
            this.f47957k = j5 - 1;
            C18923z3.m88383b0(j5, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j6 = this.f47957k;
            this.f47957k = j6 - 1;
            C18923z3.m88383b0(j6, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j7 = this.f47957k;
            this.f47957k = j7 - 1;
            C18923z3.m88383b0(j7, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j8 = this.f47957k;
            this.f47957k = j8 - 1;
            C18923z3.m88383b0(j8, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: r0 */
        public void mo55093r0(int i) {
            if (mo55148f1() < i) {
                mo55146d1(i);
            }
        }

        /* renamed from: r1 */
        public final void mo55160r1(long j) {
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) ((int) (j >>> 35)));
            long j3 = this.f47957k;
            this.f47957k = j3 - 1;
            C18923z3.m88383b0(j3, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j4 = this.f47957k;
            this.f47957k = j4 - 1;
            C18923z3.m88383b0(j4, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j5 = this.f47957k;
            this.f47957k = j5 - 1;
            C18923z3.m88383b0(j5, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j6 = this.f47957k;
            this.f47957k = j6 - 1;
            C18923z3.m88383b0(j6, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j7 = this.f47957k;
            this.f47957k = j7 - 1;
            C18923z3.m88383b0(j7, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: s0 */
        public void mo55094s0(boolean z) {
            mo53815T(z ? (byte) 1 : 0);
        }

        /* renamed from: s1 */
        public final void mo55161s1(long j) {
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) ((int) (j >>> 63)));
            long j3 = this.f47957k;
            this.f47957k = j3 - 1;
            C18923z3.m88383b0(j3, (byte) ((int) (((j >>> 56) & 127) | 128)));
            long j4 = this.f47957k;
            this.f47957k = j4 - 1;
            C18923z3.m88383b0(j4, (byte) ((int) (((j >>> 49) & 127) | 128)));
            long j5 = this.f47957k;
            this.f47957k = j5 - 1;
            C18923z3.m88383b0(j5, (byte) ((int) (((j >>> 42) & 127) | 128)));
            long j6 = this.f47957k;
            this.f47957k = j6 - 1;
            C18923z3.m88383b0(j6, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j7 = this.f47957k;
            this.f47957k = j7 - 1;
            C18923z3.m88383b0(j7, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j8 = this.f47957k;
            this.f47957k = j8 - 1;
            C18923z3.m88383b0(j8, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j9 = this.f47957k;
            this.f47957k = j9 - 1;
            C18923z3.m88383b0(j9, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j10 = this.f47957k;
            this.f47957k = j10 - 1;
            C18923z3.m88383b0(j10, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j11 = this.f47957k;
            this.f47957k = j11 - 1;
            C18923z3.m88383b0(j11, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: t */
        public void mo54244t(int i, long j) {
            mo55093r0(13);
            mo55063A0(j);
            mo55079R0(i, 1);
        }

        /* renamed from: t1 */
        public final void mo55162t1(long j) {
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) (((int) j) >>> 14));
            long j3 = this.f47957k;
            this.f47957k = j3 - 1;
            C18923z3.m88383b0(j3, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j4 = this.f47957k;
            this.f47957k = j4 - 1;
            C18923z3.m88383b0(j4, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: u1 */
        public final void mo55163u1(long j) {
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) ((int) (j >>> 7)));
            long j3 = this.f47957k;
            this.f47957k = j3 - 1;
            C18923z3.m88383b0(j3, (byte) ((((int) j) & 127) | 128));
        }

        /* renamed from: w */
        public void mo54247w(int i, Object obj) throws IOException {
            int c0 = mo55088c0();
            C18853r2.m87361a().mo55375k(obj, this);
            mo55093r0(10);
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
        }

        /* renamed from: x0 */
        public void mo55099x0(int i) {
            long j = this.f47957k;
            this.f47957k = j - 1;
            C18923z3.m88383b0(j, (byte) ((i >> 24) & 255));
            long j2 = this.f47957k;
            this.f47957k = j2 - 1;
            C18923z3.m88383b0(j2, (byte) ((i >> 16) & 255));
            long j3 = this.f47957k;
            this.f47957k = j3 - 1;
            C18923z3.m88383b0(j3, (byte) ((i >> 8) & 255));
            long j4 = this.f47957k;
            this.f47957k = j4 - 1;
            C18923z3.m88383b0(j4, (byte) (i & 255));
        }

        /* renamed from: y */
        public void mo54249y(int i, boolean z) {
            mo55093r0(6);
            mo53815T(z ? (byte) 1 : 0);
            mo55079R0(i, 0);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.n$e */
    public static final class C18816e extends C18811n {

        /* renamed from: h */
        public C18703d f47958h;

        /* renamed from: i */
        public byte[] f47959i;

        /* renamed from: j */
        public long f47960j;

        /* renamed from: k */
        public long f47961k;

        /* renamed from: l */
        public long f47962l;

        /* renamed from: m */
        public long f47963m;

        /* renamed from: n */
        public long f47964n;

        public C18816e(C18848r rVar, int i) {
            super(rVar, i, (C18812a) null);
            mo55166b1();
        }

        /* renamed from: a1 */
        public static boolean m86940a1() {
            return C18923z3.m88372S();
        }

        /* renamed from: A */
        public void mo54206A(int i) {
            mo55079R0(i, 3);
        }

        /* renamed from: A0 */
        public void mo55063A0(long j) {
            byte[] bArr = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr, j2, (byte) (((int) (j >> 56)) & 255));
            byte[] bArr2 = this.f47959i;
            long j3 = this.f47964n;
            this.f47964n = j3 - 1;
            C18923z3.m88387d0(bArr2, j3, (byte) (((int) (j >> 48)) & 255));
            byte[] bArr3 = this.f47959i;
            long j4 = this.f47964n;
            this.f47964n = j4 - 1;
            C18923z3.m88387d0(bArr3, j4, (byte) (((int) (j >> 40)) & 255));
            byte[] bArr4 = this.f47959i;
            long j5 = this.f47964n;
            this.f47964n = j5 - 1;
            C18923z3.m88387d0(bArr4, j5, (byte) (((int) (j >> 32)) & 255));
            byte[] bArr5 = this.f47959i;
            long j6 = this.f47964n;
            this.f47964n = j6 - 1;
            C18923z3.m88387d0(bArr5, j6, (byte) (((int) (j >> 24)) & 255));
            byte[] bArr6 = this.f47959i;
            long j7 = this.f47964n;
            this.f47964n = j7 - 1;
            C18923z3.m88387d0(bArr6, j7, (byte) (((int) (j >> 16)) & 255));
            byte[] bArr7 = this.f47959i;
            long j8 = this.f47964n;
            this.f47964n = j8 - 1;
            C18923z3.m88387d0(bArr7, j8, (byte) (((int) (j >> 8)) & 255));
            byte[] bArr8 = this.f47959i;
            long j9 = this.f47964n;
            this.f47964n = j9 - 1;
            C18923z3.m88387d0(bArr8, j9, (byte) (((int) j) & 255));
        }

        /* renamed from: E */
        public void mo54210E(int i, Object obj) throws IOException {
            mo55079R0(i, 4);
            C18853r2.m87361a().mo55375k(obj, this);
            mo55079R0(i, 3);
        }

        /* renamed from: F0 */
        public void mo55068F0(int i) {
            if (i >= 0) {
                mo55084W0(i);
            } else {
                mo55085X0((long) i);
            }
        }

        /* renamed from: G */
        public void mo54212G(int i) {
            mo55079R0(i, 4);
        }

        /* renamed from: K0 */
        public void mo55072K0(int i) {
            mo55084W0(CodedOutputStream.m84501c1(i));
        }

        /* renamed from: L */
        public void mo54217L(int i, int i2) {
            mo55093r0(10);
            mo55072K0(i2);
            mo55079R0(i, 0);
        }

        /* renamed from: N0 */
        public void mo55075N0(long j) {
            mo55085X0(CodedOutputStream.m84503d1(j));
        }

        /* renamed from: O */
        public void mo54220O(int i, ByteString byteString) {
            try {
                byteString.mo53746d1(this);
                mo55093r0(10);
                mo55084W0(byteString.size());
                mo55079R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: P */
        public void mo54221P(int i, Object obj, C18905x2 x2Var) throws IOException {
            int c0 = mo55088c0();
            x2Var.mo54459i(obj, this);
            mo55093r0(10);
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
        }

        /* renamed from: Q0 */
        public void mo55078Q0(String str) {
            char charAt;
            mo55093r0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length >= 0 && (charAt = str.charAt(length)) < 128) {
                    byte[] bArr = this.f47959i;
                    long j = this.f47964n;
                    this.f47964n = j - 1;
                    C18923z3.m88387d0(bArr, j, (byte) charAt);
                }
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j2 = this.f47964n;
                        if (j2 > this.f47962l) {
                            byte[] bArr2 = this.f47959i;
                            this.f47964n = j2 - 1;
                            C18923z3.m88387d0(bArr2, j2, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j3 = this.f47964n;
                        if (j3 > this.f47960j) {
                            byte[] bArr3 = this.f47959i;
                            this.f47964n = j3 - 1;
                            C18923z3.m88387d0(bArr3, j3, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr4 = this.f47959i;
                            long j4 = this.f47964n;
                            this.f47964n = j4 - 1;
                            C18923z3.m88387d0(bArr4, j4, (byte) ((charAt2 >>> 6) | C14092c.f34671x0));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j5 = this.f47964n;
                        if (j5 > this.f47960j + 1) {
                            byte[] bArr5 = this.f47959i;
                            this.f47964n = j5 - 1;
                            C18923z3.m88387d0(bArr5, j5, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr6 = this.f47959i;
                            long j6 = this.f47964n;
                            this.f47964n = j6 - 1;
                            C18923z3.m88387d0(bArr6, j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                            byte[] bArr7 = this.f47959i;
                            long j7 = this.f47964n;
                            this.f47964n = j7 - 1;
                            C18923z3.m88387d0(bArr7, j7, (byte) ((charAt2 >>> 12) | C14092c.f34573Y0));
                            length--;
                        }
                    }
                    if (this.f47964n > this.f47960j + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr8 = this.f47959i;
                                long j8 = this.f47964n;
                                this.f47964n = j8 - 1;
                                C18923z3.m88387d0(bArr8, j8, (byte) ((codePoint & 63) | 128));
                                byte[] bArr9 = this.f47959i;
                                long j9 = this.f47964n;
                                this.f47964n = j9 - 1;
                                C18923z3.m88387d0(bArr9, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                byte[] bArr10 = this.f47959i;
                                long j10 = this.f47964n;
                                this.f47964n = j10 - 1;
                                C18923z3.m88387d0(bArr10, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                byte[] bArr11 = this.f47959i;
                                long j11 = this.f47964n;
                                this.f47964n = j11 - 1;
                                C18923z3.m88387d0(bArr11, j11, (byte) ((codePoint >>> 18) | C9527p.f26031b));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    mo55093r0(length);
                    length++;
                    length--;
                }
            }
        }

        /* renamed from: R */
        public void mo54223R(int i, Object obj, C18905x2 x2Var) throws IOException {
            mo55079R0(i, 4);
            x2Var.mo54459i(obj, this);
            mo55079R0(i, 3);
        }

        /* renamed from: R0 */
        public void mo55079R0(int i, int i2) {
            mo55084W0(WireFormat.m85346c(i, i2));
        }

        /* renamed from: T */
        public void mo53815T(byte b) {
            byte[] bArr = this.f47959i;
            long j = this.f47964n;
            this.f47964n = j - 1;
            C18923z3.m88387d0(bArr, j, b);
        }

        /* renamed from: U */
        public void mo53817U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            mo55093r0(remaining);
            this.f47964n -= (long) remaining;
            byteBuffer.get(this.f47959i, mo55164Y0() + 1, remaining);
        }

        /* renamed from: V */
        public void mo53819V(byte[] bArr, int i, int i2) {
            if (i < 0 || i + i2 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            mo55093r0(i2);
            this.f47964n -= (long) i2;
            System.arraycopy(bArr, i, this.f47959i, mo55164Y0() + 1, i2);
        }

        /* renamed from: W */
        public void mo53821W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo55169e1() < remaining) {
                this.f47942d += remaining;
                this.f47941c.addFirst(C18703d.m85726j(byteBuffer));
                mo55166b1();
            }
            this.f47964n -= (long) remaining;
            byteBuffer.get(this.f47959i, mo55164Y0() + 1, remaining);
        }

        /* renamed from: W0 */
        public void mo55084W0(int i) {
            if ((i & -128) == 0) {
                mo55172h1(i);
            } else if ((i & -16384) == 0) {
                mo55174j1(i);
            } else if ((-2097152 & i) == 0) {
                mo55173i1(i);
            } else if ((-268435456 & i) == 0) {
                mo55171g1(i);
            } else {
                mo55170f1(i);
            }
        }

        /* renamed from: X */
        public void mo53823X(byte[] bArr, int i, int i2) {
            if (i < 0 || i + i2 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            } else if (mo55169e1() < i2) {
                this.f47942d += i2;
                this.f47941c.addFirst(C18703d.m85728l(bArr, i, i2));
                mo55166b1();
            } else {
                this.f47964n -= (long) i2;
                System.arraycopy(bArr, i, this.f47959i, mo55164Y0() + 1, i2);
            }
        }

        /* renamed from: X0 */
        public void mo55085X0(long j) {
            switch (C18811n.m86695a0(j)) {
                case 1:
                    mo55179o1(j);
                    return;
                case 2:
                    mo55184t1(j);
                    return;
                case 3:
                    mo55183s1(j);
                    return;
                case 4:
                    mo55177m1(j);
                    return;
                case 5:
                    mo55176l1(j);
                    return;
                case 6:
                    mo55181q1(j);
                    return;
                case 7:
                    mo55180p1(j);
                    return;
                case 8:
                    mo55175k1(j);
                    return;
                case 9:
                    mo55178n1(j);
                    return;
                case 10:
                    mo55182r1(j);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: Y0 */
        public final int mo55164Y0() {
            return (int) this.f47964n;
        }

        /* renamed from: Z0 */
        public int mo55165Z0() {
            return (int) (this.f47963m - this.f47964n);
        }

        /* renamed from: b0 */
        public void mo55087b0() {
            if (this.f47958h != null) {
                this.f47942d += mo55165Z0();
                this.f47958h.mo54495h((mo55164Y0() - this.f47958h.mo54489b()) + 1);
                this.f47958h = null;
                this.f47964n = 0;
                this.f47963m = 0;
            }
        }

        /* renamed from: b1 */
        public final void mo55166b1() {
            mo55168d1(mo55091j0());
        }

        /* renamed from: c */
        public void mo54227c(int i, int i2) {
            mo55093r0(9);
            mo55099x0(i2);
            mo55079R0(i, 5);
        }

        /* renamed from: c0 */
        public int mo55088c0() {
            return this.f47942d + mo55165Z0();
        }

        /* renamed from: c1 */
        public final void mo55167c1(int i) {
            mo55168d1(mo55092k0(i));
        }

        /* renamed from: d1 */
        public final void mo55168d1(C18703d dVar) {
            if (dVar.mo54490c()) {
                mo55087b0();
                this.f47941c.addFirst(dVar);
                this.f47958h = dVar;
                this.f47959i = dVar.mo54488a();
                int b = dVar.mo54489b();
                this.f47961k = (long) (dVar.mo54492e() + b);
                long g = (long) (b + dVar.mo54494g());
                this.f47960j = g;
                this.f47962l = g - 1;
                long j = this.f47961k - 1;
                this.f47963m = j;
                this.f47964n = j;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        /* renamed from: e1 */
        public int mo55169e1() {
            return (int) (this.f47964n - this.f47962l);
        }

        /* renamed from: f */
        public void mo54230f(int i, String str) {
            int c0 = mo55088c0();
            mo55078Q0(str);
            mo55093r0(10);
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
        }

        /* renamed from: f1 */
        public final void mo55170f1(int i) {
            byte[] bArr = this.f47959i;
            long j = this.f47964n;
            this.f47964n = j - 1;
            C18923z3.m88387d0(bArr, j, (byte) (i >>> 28));
            byte[] bArr2 = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr2, j2, (byte) (((i >>> 21) & 127) | 128));
            byte[] bArr3 = this.f47959i;
            long j3 = this.f47964n;
            this.f47964n = j3 - 1;
            C18923z3.m88387d0(bArr3, j3, (byte) (((i >>> 14) & 127) | 128));
            byte[] bArr4 = this.f47959i;
            long j4 = this.f47964n;
            this.f47964n = j4 - 1;
            C18923z3.m88387d0(bArr4, j4, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr5 = this.f47959i;
            long j5 = this.f47964n;
            this.f47964n = j5 - 1;
            C18923z3.m88387d0(bArr5, j5, (byte) ((i & 127) | 128));
        }

        /* renamed from: g */
        public void mo54231g(int i, long j) {
            mo55093r0(15);
            mo55085X0(j);
            mo55079R0(i, 0);
        }

        /* renamed from: g1 */
        public final void mo55171g1(int i) {
            byte[] bArr = this.f47959i;
            long j = this.f47964n;
            this.f47964n = j - 1;
            C18923z3.m88387d0(bArr, j, (byte) (i >>> 21));
            byte[] bArr2 = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr2, j2, (byte) (((i >>> 14) & 127) | 128));
            byte[] bArr3 = this.f47959i;
            long j3 = this.f47964n;
            this.f47964n = j3 - 1;
            C18923z3.m88387d0(bArr3, j3, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr4 = this.f47959i;
            long j4 = this.f47964n;
            this.f47964n = j4 - 1;
            C18923z3.m88387d0(bArr4, j4, (byte) ((i & 127) | 128));
        }

        /* renamed from: h1 */
        public final void mo55172h1(int i) {
            byte[] bArr = this.f47959i;
            long j = this.f47964n;
            this.f47964n = j - 1;
            C18923z3.m88387d0(bArr, j, (byte) i);
        }

        /* renamed from: i */
        public void mo54233i(int i, int i2) {
            mo55093r0(15);
            mo55068F0(i2);
            mo55079R0(i, 0);
        }

        /* renamed from: i1 */
        public final void mo55173i1(int i) {
            byte[] bArr = this.f47959i;
            long j = this.f47964n;
            this.f47964n = j - 1;
            C18923z3.m88387d0(bArr, j, (byte) (i >>> 14));
            byte[] bArr2 = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr2, j2, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr3 = this.f47959i;
            long j3 = this.f47964n;
            this.f47964n = j3 - 1;
            C18923z3.m88387d0(bArr3, j3, (byte) ((i & 127) | 128));
        }

        /* renamed from: j1 */
        public final void mo55174j1(int i) {
            byte[] bArr = this.f47959i;
            long j = this.f47964n;
            this.f47964n = j - 1;
            C18923z3.m88387d0(bArr, j, (byte) (i >>> 7));
            byte[] bArr2 = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr2, j2, (byte) ((i & 127) | 128));
        }

        /* renamed from: k1 */
        public final void mo55175k1(long j) {
            byte[] bArr = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr, j2, (byte) ((int) (j >>> 49)));
            byte[] bArr2 = this.f47959i;
            long j3 = this.f47964n;
            this.f47964n = j3 - 1;
            C18923z3.m88387d0(bArr2, j3, (byte) ((int) (((j >>> 42) & 127) | 128)));
            byte[] bArr3 = this.f47959i;
            long j4 = this.f47964n;
            this.f47964n = j4 - 1;
            C18923z3.m88387d0(bArr3, j4, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr4 = this.f47959i;
            long j5 = this.f47964n;
            this.f47964n = j5 - 1;
            C18923z3.m88387d0(bArr4, j5, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr5 = this.f47959i;
            long j6 = this.f47964n;
            this.f47964n = j6 - 1;
            C18923z3.m88387d0(bArr5, j6, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr6 = this.f47959i;
            long j7 = this.f47964n;
            this.f47964n = j7 - 1;
            C18923z3.m88387d0(bArr6, j7, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr7 = this.f47959i;
            long j8 = this.f47964n;
            this.f47964n = j8 - 1;
            C18923z3.m88387d0(bArr7, j8, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr8 = this.f47959i;
            long j9 = this.f47964n;
            this.f47964n = j9 - 1;
            C18923z3.m88387d0(bArr8, j9, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: l1 */
        public final void mo55176l1(long j) {
            byte[] bArr = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr, j2, (byte) ((int) (j >>> 28)));
            byte[] bArr2 = this.f47959i;
            long j3 = this.f47964n;
            this.f47964n = j3 - 1;
            C18923z3.m88387d0(bArr2, j3, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr3 = this.f47959i;
            long j4 = this.f47964n;
            this.f47964n = j4 - 1;
            C18923z3.m88387d0(bArr3, j4, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr4 = this.f47959i;
            long j5 = this.f47964n;
            this.f47964n = j5 - 1;
            C18923z3.m88387d0(bArr4, j5, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr5 = this.f47959i;
            long j6 = this.f47964n;
            this.f47964n = j6 - 1;
            C18923z3.m88387d0(bArr5, j6, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: m1 */
        public final void mo55177m1(long j) {
            byte[] bArr = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr, j2, (byte) ((int) (j >>> 21)));
            byte[] bArr2 = this.f47959i;
            long j3 = this.f47964n;
            this.f47964n = j3 - 1;
            C18923z3.m88387d0(bArr2, j3, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr3 = this.f47959i;
            long j4 = this.f47964n;
            this.f47964n = j4 - 1;
            C18923z3.m88387d0(bArr3, j4, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr4 = this.f47959i;
            long j5 = this.f47964n;
            this.f47964n = j5 - 1;
            C18923z3.m88387d0(bArr4, j5, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: n */
        public void mo54238n(int i, long j) {
            mo55093r0(15);
            mo55075N0(j);
            mo55079R0(i, 0);
        }

        /* renamed from: n1 */
        public final void mo55178n1(long j) {
            byte[] bArr = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr, j2, (byte) ((int) (j >>> 56)));
            byte[] bArr2 = this.f47959i;
            long j3 = this.f47964n;
            this.f47964n = j3 - 1;
            C18923z3.m88387d0(bArr2, j3, (byte) ((int) (((j >>> 49) & 127) | 128)));
            byte[] bArr3 = this.f47959i;
            long j4 = this.f47964n;
            this.f47964n = j4 - 1;
            C18923z3.m88387d0(bArr3, j4, (byte) ((int) (((j >>> 42) & 127) | 128)));
            byte[] bArr4 = this.f47959i;
            long j5 = this.f47964n;
            this.f47964n = j5 - 1;
            C18923z3.m88387d0(bArr4, j5, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr5 = this.f47959i;
            long j6 = this.f47964n;
            this.f47964n = j6 - 1;
            C18923z3.m88387d0(bArr5, j6, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr6 = this.f47959i;
            long j7 = this.f47964n;
            this.f47964n = j7 - 1;
            C18923z3.m88387d0(bArr6, j7, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr7 = this.f47959i;
            long j8 = this.f47964n;
            this.f47964n = j8 - 1;
            C18923z3.m88387d0(bArr7, j8, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr8 = this.f47959i;
            long j9 = this.f47964n;
            this.f47964n = j9 - 1;
            C18923z3.m88387d0(bArr8, j9, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr9 = this.f47959i;
            long j10 = this.f47964n;
            this.f47964n = j10 - 1;
            C18923z3.m88387d0(bArr9, j10, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: o1 */
        public final void mo55179o1(long j) {
            byte[] bArr = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr, j2, (byte) ((int) j));
        }

        /* renamed from: p */
        public void mo54240p(int i, int i2) {
            mo55093r0(10);
            mo55084W0(i2);
            mo55079R0(i, 0);
        }

        /* renamed from: p1 */
        public final void mo55180p1(long j) {
            byte[] bArr = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr, j2, (byte) ((int) (j >>> 42)));
            byte[] bArr2 = this.f47959i;
            long j3 = this.f47964n;
            this.f47964n = j3 - 1;
            C18923z3.m88387d0(bArr2, j3, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr3 = this.f47959i;
            long j4 = this.f47964n;
            this.f47964n = j4 - 1;
            C18923z3.m88387d0(bArr3, j4, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr4 = this.f47959i;
            long j5 = this.f47964n;
            this.f47964n = j5 - 1;
            C18923z3.m88387d0(bArr4, j5, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr5 = this.f47959i;
            long j6 = this.f47964n;
            this.f47964n = j6 - 1;
            C18923z3.m88387d0(bArr5, j6, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr6 = this.f47959i;
            long j7 = this.f47964n;
            this.f47964n = j7 - 1;
            C18923z3.m88387d0(bArr6, j7, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr7 = this.f47959i;
            long j8 = this.f47964n;
            this.f47964n = j8 - 1;
            C18923z3.m88387d0(bArr7, j8, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: q1 */
        public final void mo55181q1(long j) {
            byte[] bArr = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr, j2, (byte) ((int) (j >>> 35)));
            byte[] bArr2 = this.f47959i;
            long j3 = this.f47964n;
            this.f47964n = j3 - 1;
            C18923z3.m88387d0(bArr2, j3, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr3 = this.f47959i;
            long j4 = this.f47964n;
            this.f47964n = j4 - 1;
            C18923z3.m88387d0(bArr3, j4, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr4 = this.f47959i;
            long j5 = this.f47964n;
            this.f47964n = j5 - 1;
            C18923z3.m88387d0(bArr4, j5, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr5 = this.f47959i;
            long j6 = this.f47964n;
            this.f47964n = j6 - 1;
            C18923z3.m88387d0(bArr5, j6, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr6 = this.f47959i;
            long j7 = this.f47964n;
            this.f47964n = j7 - 1;
            C18923z3.m88387d0(bArr6, j7, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: r0 */
        public void mo55093r0(int i) {
            if (mo55169e1() < i) {
                mo55167c1(i);
            }
        }

        /* renamed from: r1 */
        public final void mo55182r1(long j) {
            byte[] bArr = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr, j2, (byte) ((int) (j >>> 63)));
            byte[] bArr2 = this.f47959i;
            long j3 = this.f47964n;
            this.f47964n = j3 - 1;
            C18923z3.m88387d0(bArr2, j3, (byte) ((int) (((j >>> 56) & 127) | 128)));
            byte[] bArr3 = this.f47959i;
            long j4 = this.f47964n;
            this.f47964n = j4 - 1;
            C18923z3.m88387d0(bArr3, j4, (byte) ((int) (((j >>> 49) & 127) | 128)));
            byte[] bArr4 = this.f47959i;
            long j5 = this.f47964n;
            this.f47964n = j5 - 1;
            C18923z3.m88387d0(bArr4, j5, (byte) ((int) (((j >>> 42) & 127) | 128)));
            byte[] bArr5 = this.f47959i;
            long j6 = this.f47964n;
            this.f47964n = j6 - 1;
            C18923z3.m88387d0(bArr5, j6, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr6 = this.f47959i;
            long j7 = this.f47964n;
            this.f47964n = j7 - 1;
            C18923z3.m88387d0(bArr6, j7, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr7 = this.f47959i;
            long j8 = this.f47964n;
            this.f47964n = j8 - 1;
            C18923z3.m88387d0(bArr7, j8, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr8 = this.f47959i;
            long j9 = this.f47964n;
            this.f47964n = j9 - 1;
            C18923z3.m88387d0(bArr8, j9, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr9 = this.f47959i;
            long j10 = this.f47964n;
            this.f47964n = j10 - 1;
            C18923z3.m88387d0(bArr9, j10, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr10 = this.f47959i;
            long j11 = this.f47964n;
            this.f47964n = j11 - 1;
            C18923z3.m88387d0(bArr10, j11, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: s0 */
        public void mo55094s0(boolean z) {
            mo53815T(z ? (byte) 1 : 0);
        }

        /* renamed from: s1 */
        public final void mo55183s1(long j) {
            byte[] bArr = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr, j2, (byte) (((int) j) >>> 14));
            byte[] bArr2 = this.f47959i;
            long j3 = this.f47964n;
            this.f47964n = j3 - 1;
            C18923z3.m88387d0(bArr2, j3, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr3 = this.f47959i;
            long j4 = this.f47964n;
            this.f47964n = j4 - 1;
            C18923z3.m88387d0(bArr3, j4, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: t */
        public void mo54244t(int i, long j) {
            mo55093r0(13);
            mo55063A0(j);
            mo55079R0(i, 1);
        }

        /* renamed from: t1 */
        public final void mo55184t1(long j) {
            byte[] bArr = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr, j2, (byte) ((int) (j >>> 7)));
            byte[] bArr2 = this.f47959i;
            long j3 = this.f47964n;
            this.f47964n = j3 - 1;
            C18923z3.m88387d0(bArr2, j3, (byte) ((((int) j) & 127) | 128));
        }

        /* renamed from: w */
        public void mo54247w(int i, Object obj) throws IOException {
            int c0 = mo55088c0();
            C18853r2.m87361a().mo55375k(obj, this);
            mo55093r0(10);
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
        }

        /* renamed from: x0 */
        public void mo55099x0(int i) {
            byte[] bArr = this.f47959i;
            long j = this.f47964n;
            this.f47964n = j - 1;
            C18923z3.m88387d0(bArr, j, (byte) ((i >> 24) & 255));
            byte[] bArr2 = this.f47959i;
            long j2 = this.f47964n;
            this.f47964n = j2 - 1;
            C18923z3.m88387d0(bArr2, j2, (byte) ((i >> 16) & 255));
            byte[] bArr3 = this.f47959i;
            long j3 = this.f47964n;
            this.f47964n = j3 - 1;
            C18923z3.m88387d0(bArr3, j3, (byte) ((i >> 8) & 255));
            byte[] bArr4 = this.f47959i;
            long j4 = this.f47964n;
            this.f47964n = j4 - 1;
            C18923z3.m88387d0(bArr4, j4, (byte) (i & 255));
        }

        /* renamed from: y */
        public void mo54249y(int i, boolean z) {
            mo55093r0(6);
            mo53815T(z ? (byte) 1 : 0);
            mo55079R0(i, 0);
        }
    }

    public /* synthetic */ C18811n(C18848r rVar, int i, C18812a aVar) {
        this(rVar, i);
    }

    /* renamed from: J0 */
    public static final void m86693J0(Writer writer, int i, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (C18812a.f47943a[fieldType.ordinal()]) {
            case 1:
                writer.mo54249y(i, ((Boolean) obj).booleanValue());
                return;
            case 2:
                writer.mo54227c(i, ((Integer) obj).intValue());
                return;
            case 3:
                writer.mo54244t(i, ((Long) obj).longValue());
                return;
            case 4:
                writer.mo54233i(i, ((Integer) obj).intValue());
                return;
            case 5:
                writer.mo54248x(i, ((Long) obj).longValue());
                return;
            case 6:
                writer.mo54250z(i, ((Integer) obj).intValue());
                return;
            case 7:
                writer.mo54234j(i, ((Long) obj).longValue());
                return;
            case 8:
                writer.mo54217L(i, ((Integer) obj).intValue());
                return;
            case 9:
                writer.mo54238n(i, ((Long) obj).longValue());
                return;
            case 10:
                writer.mo54230f(i, (String) obj);
                return;
            case 11:
                writer.mo54240p(i, ((Integer) obj).intValue());
                return;
            case 12:
                writer.mo54231g(i, ((Long) obj).longValue());
                return;
            case 13:
                writer.mo54211F(i, ((Float) obj).floatValue());
                return;
            case 14:
                writer.mo54241q(i, ((Double) obj).doubleValue());
                return;
            case 15:
                writer.mo54247w(i, obj);
                return;
            case 16:
                writer.mo54220O(i, (ByteString) obj);
                return;
            case 17:
                if (obj instanceof C18753i1.C18756c) {
                    writer.mo54214I(i, ((C18753i1.C18756c) obj).getNumber());
                    return;
                } else if (obj instanceof Integer) {
                    writer.mo54214I(i, ((Integer) obj).intValue());
                    return;
                } else {
                    throw new IllegalArgumentException("Unexpected type for enum in map.");
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    /* renamed from: a0 */
    public static byte m86695a0(long j) {
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
    public static boolean m86696d0() {
        return C18815d.m86884b1();
    }

    /* renamed from: e0 */
    public static boolean m86697e0() {
        return C18816e.m86940a1();
    }

    /* renamed from: h0 */
    public static C18811n m86698h0(C18848r rVar) {
        return m86699i0(rVar, 4096);
    }

    /* renamed from: i0 */
    public static C18811n m86699i0(C18848r rVar, int i) {
        if (m86696d0()) {
            return m86704p0(rVar, i);
        }
        return m86702n0(rVar, i);
    }

    /* renamed from: l0 */
    public static C18811n m86700l0(C18848r rVar) {
        return m86701m0(rVar, 4096);
    }

    /* renamed from: m0 */
    public static C18811n m86701m0(C18848r rVar, int i) {
        if (m86697e0()) {
            return m86705q0(rVar, i);
        }
        return m86703o0(rVar, i);
    }

    /* renamed from: n0 */
    public static C18811n m86702n0(C18848r rVar, int i) {
        return new C18813b(rVar, i);
    }

    /* renamed from: o0 */
    public static C18811n m86703o0(C18848r rVar, int i) {
        return new C18814c(rVar, i);
    }

    /* renamed from: p0 */
    public static C18811n m86704p0(C18848r rVar, int i) {
        if (m86696d0()) {
            return new C18815d(rVar, i);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    /* renamed from: q0 */
    public static C18811n m86705q0(C18848r rVar, int i) {
        if (m86697e0()) {
            return new C18816e(rVar, i);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    /* renamed from: A0 */
    public abstract void mo55063A0(long j);

    /* renamed from: B */
    public final void mo54207B(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof C18852r1) {
            mo55064B0(i, (C18852r1) list, z);
        } else {
            mo55065C0(i, list, z);
        }
    }

    /* renamed from: B0 */
    public final void mo55064B0(int i, C18852r1 r1Var, boolean z) throws IOException {
        if (z) {
            mo55093r0((r1Var.size() * 8) + 10);
            int c0 = mo55088c0();
            for (int size = r1Var.size() - 1; size >= 0; size--) {
                mo55063A0(r1Var.getLong(size));
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = r1Var.size() - 1; size2 >= 0; size2--) {
            mo54244t(i, r1Var.getLong(size2));
        }
    }

    /* renamed from: C */
    public final void mo54208C(int i, List<Integer> list, boolean z) throws IOException {
        mo54235k(i, list, z);
    }

    /* renamed from: C0 */
    public final void mo55065C0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            mo55093r0((list.size() * 8) + 10);
            int c0 = mo55088c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo55063A0(list.get(size).longValue());
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo54244t(i, list.get(size2).longValue());
        }
    }

    /* renamed from: D */
    public final void mo54209D(int i, List<Boolean> list, boolean z) throws IOException {
        if (list instanceof C18843q) {
            mo55095t0(i, (C18843q) list, z);
        } else {
            mo55096u0(i, list, z);
        }
    }

    /* renamed from: D0 */
    public final void mo55066D0(int i, C18919z0 z0Var, boolean z) throws IOException {
        if (z) {
            mo55093r0((z0Var.size() * 4) + 10);
            int c0 = mo55088c0();
            for (int size = z0Var.size() - 1; size >= 0; size--) {
                mo55099x0(Float.floatToRawIntBits(z0Var.getFloat(size)));
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = z0Var.size() - 1; size2 >= 0; size2--) {
            mo54211F(i, z0Var.getFloat(size2));
        }
    }

    /* renamed from: E0 */
    public final void mo55067E0(int i, List<Float> list, boolean z) throws IOException {
        if (z) {
            mo55093r0((list.size() * 4) + 10);
            int c0 = mo55088c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo55099x0(Float.floatToRawIntBits(list.get(size).floatValue()));
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo54211F(i, list.get(size2).floatValue());
        }
    }

    /* renamed from: F */
    public final void mo54211F(int i, float f) throws IOException {
        mo54227c(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: F0 */
    public abstract void mo55068F0(int i);

    /* renamed from: G0 */
    public final void mo55069G0(int i, C18744h1 h1Var, boolean z) throws IOException {
        if (z) {
            mo55093r0((h1Var.size() * 10) + 10);
            int c0 = mo55088c0();
            for (int size = h1Var.size() - 1; size >= 0; size--) {
                mo55068F0(h1Var.getInt(size));
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = h1Var.size() - 1; size2 >= 0; size2--) {
            mo54233i(i, h1Var.getInt(size2));
        }
    }

    /* renamed from: H */
    public final void mo54213H(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof C18744h1) {
            mo55073L0(i, (C18744h1) list, z);
        } else {
            mo55074M0(i, list, z);
        }
    }

    /* renamed from: H0 */
    public final void mo55070H0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo55093r0((list.size() * 10) + 10);
            int c0 = mo55088c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo55068F0(list.get(size).intValue());
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo54233i(i, list.get(size2).intValue());
        }
    }

    /* renamed from: I */
    public final void mo54214I(int i, int i2) throws IOException {
        mo54233i(i, i2);
    }

    /* renamed from: I0 */
    public final void mo55071I0(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            mo54230f(i, (String) obj);
        } else {
            mo54220O(i, (ByteString) obj);
        }
    }

    /* renamed from: J */
    public final void mo54215J(int i, List<Long> list, boolean z) throws IOException {
        mo54243s(i, list, z);
    }

    /* renamed from: K */
    public final void mo54216K(int i, List<Double> list, boolean z) throws IOException {
        if (list instanceof C18918z) {
            mo55097v0(i, (C18918z) list, z);
        } else {
            mo55098w0(i, list, z);
        }
    }

    /* renamed from: K0 */
    public abstract void mo55072K0(int i);

    /* renamed from: L0 */
    public final void mo55073L0(int i, C18744h1 h1Var, boolean z) throws IOException {
        if (z) {
            mo55093r0((h1Var.size() * 5) + 10);
            int c0 = mo55088c0();
            for (int size = h1Var.size() - 1; size >= 0; size--) {
                mo55072K0(h1Var.getInt(size));
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = h1Var.size() - 1; size2 >= 0; size2--) {
            mo54217L(i, h1Var.getInt(size2));
        }
    }

    /* renamed from: M */
    public final void mo54218M(int i, List<ByteString> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo54220O(i, list.get(size));
        }
    }

    /* renamed from: M0 */
    public final void mo55074M0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo55093r0((list.size() * 5) + 10);
            int c0 = mo55088c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo55072K0(list.get(size).intValue());
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo54217L(i, list.get(size2).intValue());
        }
    }

    /* renamed from: N */
    public final void mo54219N(int i, List<?> list, C18905x2 x2Var) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo54223R(i, list.get(size), x2Var);
        }
    }

    /* renamed from: N0 */
    public abstract void mo55075N0(long j);

    /* renamed from: O0 */
    public final void mo55076O0(int i, C18852r1 r1Var, boolean z) throws IOException {
        if (z) {
            mo55093r0((r1Var.size() * 10) + 10);
            int c0 = mo55088c0();
            for (int size = r1Var.size() - 1; size >= 0; size--) {
                mo55075N0(r1Var.getLong(size));
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = r1Var.size() - 1; size2 >= 0; size2--) {
            mo54238n(i, r1Var.getLong(size2));
        }
    }

    /* renamed from: P0 */
    public final void mo55077P0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            mo55093r0((list.size() * 10) + 10);
            int c0 = mo55088c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo55075N0(list.get(size).longValue());
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo54238n(i, list.get(size2).longValue());
        }
    }

    /* renamed from: Q */
    public <K, V> void mo54222Q(int i, C18868t1.C18870b<K, V> bVar, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            int c0 = mo55088c0();
            m86693J0(this, 2, bVar.f48043c, next.getValue());
            m86693J0(this, 1, bVar.f48041a, next.getKey());
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
        }
    }

    /* renamed from: Q0 */
    public abstract void mo55078Q0(String str);

    /* renamed from: R0 */
    public abstract void mo55079R0(int i, int i2);

    /* renamed from: S */
    public final void mo54224S(int i, List<?> list, C18905x2 x2Var) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo54221P(i, list.get(size), x2Var);
        }
    }

    /* renamed from: S0 */
    public final void mo55080S0(int i, C18744h1 h1Var, boolean z) throws IOException {
        if (z) {
            mo55093r0((h1Var.size() * 5) + 10);
            int c0 = mo55088c0();
            for (int size = h1Var.size() - 1; size >= 0; size--) {
                mo55084W0(h1Var.getInt(size));
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = h1Var.size() - 1; size2 >= 0; size2--) {
            mo54240p(i, h1Var.getInt(size2));
        }
    }

    /* renamed from: T0 */
    public final void mo55081T0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo55093r0((list.size() * 5) + 10);
            int c0 = mo55088c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo55084W0(list.get(size).intValue());
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo54240p(i, list.get(size2).intValue());
        }
    }

    /* renamed from: U0 */
    public final void mo55082U0(int i, C18852r1 r1Var, boolean z) throws IOException {
        if (z) {
            mo55093r0((r1Var.size() * 10) + 10);
            int c0 = mo55088c0();
            for (int size = r1Var.size() - 1; size >= 0; size--) {
                mo55085X0(r1Var.getLong(size));
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = r1Var.size() - 1; size2 >= 0; size2--) {
            mo54231g(i, r1Var.getLong(size2));
        }
    }

    /* renamed from: V0 */
    public final void mo55083V0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            mo55093r0((list.size() * 10) + 10);
            int c0 = mo55088c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo55085X0(list.get(size).longValue());
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo54231g(i, list.get(size2).longValue());
        }
    }

    /* renamed from: W0 */
    public abstract void mo55084W0(int i);

    /* renamed from: X0 */
    public abstract void mo55085X0(long j);

    /* renamed from: Z */
    public final Queue<C18703d> mo55086Z() {
        mo55087b0();
        return this.f47941c;
    }

    /* renamed from: a */
    public final void mo54225a(int i, List<Float> list, boolean z) throws IOException {
        if (list instanceof C18919z0) {
            mo55066D0(i, (C18919z0) list, z);
        } else {
            mo55067E0(i, list, z);
        }
    }

    /* renamed from: b */
    public final void mo54226b(int i, Object obj) throws IOException {
        mo55079R0(1, 4);
        if (obj instanceof ByteString) {
            mo54220O(3, (ByteString) obj);
        } else {
            mo54247w(3, obj);
        }
        mo54240p(2, i);
        mo55079R0(1, 3);
    }

    /* renamed from: b0 */
    public abstract void mo55087b0();

    /* renamed from: c0 */
    public abstract int mo55088c0();

    /* renamed from: d */
    public final void mo54228d(int i, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo54210E(i, list.get(size));
        }
    }

    /* renamed from: e */
    public final void mo54229e(int i, List<String> list) throws IOException {
        if (list instanceof C18818n1) {
            C18818n1 n1Var = (C18818n1) list;
            for (int size = list.size() - 1; size >= 0; size--) {
                mo55071I0(i, n1Var.mo55034g0(size));
            }
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo54230f(i, list.get(size2));
        }
    }

    /* renamed from: f0 */
    public final C18703d mo55089f0() {
        return this.f47939a.mo55353a(this.f47940b);
    }

    /* renamed from: g0 */
    public final C18703d mo55090g0(int i) {
        return this.f47939a.mo55353a(Math.max(i, this.f47940b));
    }

    /* renamed from: h */
    public final void mo54232h(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof C18744h1) {
            mo55069G0(i, (C18744h1) list, z);
        } else {
            mo55070H0(i, list, z);
        }
    }

    /* renamed from: j */
    public final void mo54234j(int i, long j) throws IOException {
        mo54244t(i, j);
    }

    /* renamed from: j0 */
    public final C18703d mo55091j0() {
        return this.f47939a.mo55354b(this.f47940b);
    }

    /* renamed from: k */
    public final void mo54235k(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof C18744h1) {
            mo55100y0(i, (C18744h1) list, z);
        } else {
            mo55101z0(i, list, z);
        }
    }

    /* renamed from: k0 */
    public final C18703d mo55092k0(int i) {
        return this.f47939a.mo55354b(Math.max(i, this.f47940b));
    }

    /* renamed from: l */
    public final void mo54236l(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof C18744h1) {
            mo55080S0(i, (C18744h1) list, z);
        } else {
            mo55081T0(i, list, z);
        }
    }

    /* renamed from: m */
    public final void mo54237m(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof C18852r1) {
            mo55076O0(i, (C18852r1) list, z);
        } else {
            mo55077P0(i, list, z);
        }
    }

    /* renamed from: o */
    public final void mo54239o(int i, List<Integer> list, boolean z) throws IOException {
        mo54232h(i, list, z);
    }

    /* renamed from: q */
    public final void mo54241q(int i, double d) throws IOException {
        mo54244t(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void mo54242r(int i, List<Long> list, boolean z) throws IOException {
        mo54207B(i, list, z);
    }

    /* renamed from: r0 */
    public abstract void mo55093r0(int i);

    /* renamed from: s */
    public final void mo54243s(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof C18852r1) {
            mo55082U0(i, (C18852r1) list, z);
        } else {
            mo55083V0(i, list, z);
        }
    }

    /* renamed from: s0 */
    public abstract void mo55094s0(boolean z);

    /* renamed from: t0 */
    public final void mo55095t0(int i, C18843q qVar, boolean z) throws IOException {
        if (z) {
            mo55093r0(qVar.size() + 10);
            int c0 = mo55088c0();
            for (int size = qVar.size() - 1; size >= 0; size--) {
                mo55094s0(qVar.mo54822C(size));
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = qVar.size() - 1; size2 >= 0; size2--) {
            mo54249y(i, qVar.mo54822C(size2));
        }
    }

    /* renamed from: u */
    public final Writer.FieldOrder mo54245u() {
        return Writer.FieldOrder.DESCENDING;
    }

    /* renamed from: u0 */
    public final void mo55096u0(int i, List<Boolean> list, boolean z) throws IOException {
        if (z) {
            mo55093r0(list.size() + 10);
            int c0 = mo55088c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo55094s0(list.get(size).booleanValue());
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo54249y(i, list.get(size2).booleanValue());
        }
    }

    /* renamed from: v */
    public final void mo54246v(int i, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo54247w(i, list.get(size));
        }
    }

    /* renamed from: v0 */
    public final void mo55097v0(int i, C18918z zVar, boolean z) throws IOException {
        if (z) {
            mo55093r0((zVar.size() * 8) + 10);
            int c0 = mo55088c0();
            for (int size = zVar.size() - 1; size >= 0; size--) {
                mo55063A0(Double.doubleToRawLongBits(zVar.getDouble(size)));
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = zVar.size() - 1; size2 >= 0; size2--) {
            mo54241q(i, zVar.getDouble(size2));
        }
    }

    /* renamed from: w0 */
    public final void mo55098w0(int i, List<Double> list, boolean z) throws IOException {
        if (z) {
            mo55093r0((list.size() * 8) + 10);
            int c0 = mo55088c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo55063A0(Double.doubleToRawLongBits(list.get(size).doubleValue()));
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo54241q(i, list.get(size2).doubleValue());
        }
    }

    /* renamed from: x */
    public final void mo54248x(int i, long j) throws IOException {
        mo54231g(i, j);
    }

    /* renamed from: x0 */
    public abstract void mo55099x0(int i);

    /* renamed from: y0 */
    public final void mo55100y0(int i, C18744h1 h1Var, boolean z) throws IOException {
        if (z) {
            mo55093r0((h1Var.size() * 4) + 10);
            int c0 = mo55088c0();
            for (int size = h1Var.size() - 1; size >= 0; size--) {
                mo55099x0(h1Var.getInt(size));
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = h1Var.size() - 1; size2 >= 0; size2--) {
            mo54227c(i, h1Var.getInt(size2));
        }
    }

    /* renamed from: z */
    public final void mo54250z(int i, int i2) throws IOException {
        mo54227c(i, i2);
    }

    /* renamed from: z0 */
    public final void mo55101z0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo55093r0((list.size() * 4) + 10);
            int c0 = mo55088c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo55099x0(list.get(size).intValue());
            }
            mo55084W0(mo55088c0() - c0);
            mo55079R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo54227c(i, list.get(size2).intValue());
        }
    }

    public C18811n(C18848r rVar, int i) {
        this.f47941c = new ArrayDeque<>(4);
        if (i > 0) {
            this.f47939a = (C18848r) C18753i1.m86341e(rVar, "alloc");
            this.f47940b = i;
            return;
        }
        throw new IllegalArgumentException("chunkSize must be > 0");
    }
}
