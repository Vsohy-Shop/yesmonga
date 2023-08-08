package com.google.protobuf;

import com.google.android.material.color.C31234i;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.C11354n;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.protobuf.k */
public abstract class C34397k implements C34366f2 {

    /* renamed from: c */
    public static final int f83319c = 3;

    /* renamed from: d */
    public static final int f83320d = 7;

    /* renamed from: com.google.protobuf.k$a */
    public static /* synthetic */ class C34398a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83321a;

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
                f83321a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f83321a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34397k.C34398a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.k$b */
    public static final class C34399b extends C34397k {

        /* renamed from: e */
        public final boolean f83322e;

        /* renamed from: f */
        public final byte[] f83323f;

        /* renamed from: g */
        public int f83324g;

        /* renamed from: h */
        public final int f83325h;

        /* renamed from: i */
        public int f83326i;

        /* renamed from: j */
        public int f83327j;

        /* renamed from: k */
        public int f83328k;

        public C34399b(ByteBuffer byteBuffer, boolean z) {
            super((C34398a) null);
            this.f83322e = z;
            this.f83323f = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f83324g = arrayOffset;
            this.f83325h = arrayOffset;
            this.f83326i = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: A */
        public void mo101053A(List<String> list) throws IOException {
            mo101200f0(list, false);
        }

        /* renamed from: B */
        public int mo101054B() {
            return this.f83327j;
        }

        /* renamed from: C */
        public void mo101055C(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C34433p0) {
                C34433p0 p0Var = (C34433p0) list;
                int b = WireFormat.m138722b(this.f83327j);
                if (b == 2) {
                    int g0 = mo101201g0();
                    mo101211q0(g0);
                    int i3 = this.f83324g + g0;
                    while (this.f83324g < i3) {
                        p0Var.mo101474G(Float.intBitsToFloat(mo101195a0()));
                    }
                } else if (b == 5) {
                    do {
                        p0Var.mo101474G(readFloat());
                        if (!mo101190V()) {
                            i2 = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i2;
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            } else {
                int b2 = WireFormat.m138722b(this.f83327j);
                if (b2 == 2) {
                    int g02 = mo101201g0();
                    mo101211q0(g02);
                    int i4 = this.f83324g + g02;
                    while (this.f83324g < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(mo101195a0())));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!mo101190V()) {
                            i = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i;
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            }
        }

        /* renamed from: E */
        public boolean mo101057E() throws IOException {
            int i;
            if (mo101190V() || (i = this.f83327j) == this.f83328k) {
                return false;
            }
            int b = WireFormat.m138722b(i);
            if (b == 0) {
                mo101209o0();
                return true;
            } else if (b == 1) {
                mo101207m0(8);
                return true;
            } else if (b == 2) {
                mo101207m0(mo101201g0());
                return true;
            } else if (b == 3) {
                mo101208n0();
                return true;
            } else if (b == 5) {
                mo101207m0(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }

        /* renamed from: F */
        public int mo101058F() throws IOException {
            mo101206l0(5);
            return mo101194Z();
        }

        /* renamed from: G */
        public void mo101059G(List<ByteString> list) throws IOException {
            int i;
            if (WireFormat.m138722b(this.f83327j) == 2) {
                do {
                    list.add(mo101085n());
                    if (!mo101190V()) {
                        i = this.f83324g;
                    } else {
                        return;
                    }
                } while (mo101201g0() == this.f83327j);
                this.f83324g = i;
                return;
            }
            throw InvalidProtocolBufferException.m138416f();
        }

        /* renamed from: H */
        public void mo101060H(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C34470v) {
                C34470v vVar = (C34470v) list;
                int b = WireFormat.m138722b(this.f83327j);
                if (b == 1) {
                    do {
                        vVar.mo101622c0(readDouble());
                        if (!mo101190V()) {
                            i2 = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i2;
                } else if (b == 2) {
                    int g0 = mo101201g0();
                    mo101212r0(g0);
                    int i3 = this.f83324g + g0;
                    while (this.f83324g < i3) {
                        vVar.mo101622c0(Double.longBitsToDouble(mo101197c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            } else {
                int b2 = WireFormat.m138722b(this.f83327j);
                if (b2 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!mo101190V()) {
                            i = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i;
                } else if (b2 == 2) {
                    int g02 = mo101201g0();
                    mo101212r0(g02);
                    int i4 = this.f83324g + g02;
                    while (this.f83324g < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(mo101197c0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            }
        }

        /* renamed from: I */
        public long mo101061I() throws IOException {
            mo101206l0(0);
            return mo101202h0();
        }

        /* renamed from: J */
        public String mo101062J() throws IOException {
            return mo101199e0(true);
        }

        /* renamed from: K */
        public <T> void mo101063K(List<T> list, C34372g2<T> g2Var, C34368g0 g0Var) throws IOException {
            int i;
            if (WireFormat.m138722b(this.f83327j) == 3) {
                int i2 = this.f83327j;
                do {
                    list.add(mo101193Y(g2Var, g0Var));
                    if (!mo101190V()) {
                        i = this.f83324g;
                    } else {
                        return;
                    }
                } while (mo101201g0() == i2);
                this.f83324g = i;
                return;
            }
            throw InvalidProtocolBufferException.m138416f();
        }

        /* renamed from: L */
        public <T> void mo101064L(List<T> list, C34372g2<T> g2Var, C34368g0 g0Var) throws IOException {
            int i;
            if (WireFormat.m138722b(this.f83327j) == 2) {
                int i2 = this.f83327j;
                do {
                    list.add(mo101198d0(g2Var, g0Var));
                    if (!mo101190V()) {
                        i = this.f83324g;
                    } else {
                        return;
                    }
                } while (mo101201g0() == i2);
                this.f83324g = i;
                return;
            }
            throw InvalidProtocolBufferException.m138416f();
        }

        /* renamed from: M */
        public <T> T mo101065M(Class<T> cls, C34368g0 g0Var) throws IOException {
            mo101206l0(3);
            return mo101193Y(C34325a2.m138828a().mo100881i(cls), g0Var);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (mo101057E() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new com.google.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <K, V> void mo101066N(java.util.Map<K, V> r8, com.google.protobuf.C34363f1.C34365b<K, V> r9, com.google.protobuf.C34368g0 r10) throws java.io.IOException {
            /*
                r7 = this;
                r0 = 2
                r7.mo101206l0(r0)
                int r1 = r7.mo101201g0()
                r7.mo101204j0(r1)
                int r2 = r7.f83326i
                int r3 = r7.f83324g
                int r3 = r3 + r1
                r7.f83326i = r3
                K r1 = r9.f83269b     // Catch:{ all -> 0x005b }
                V r3 = r9.f83271d     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.mo101099z()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.f83326i = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.mo101057E()     // Catch:{ InvalidWireTypeException -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004e }
                r4.<init>((java.lang.String) r6)     // Catch:{ InvalidWireTypeException -> 0x004e }
                throw r4     // Catch:{ InvalidWireTypeException -> 0x004e }
            L_0x0039:
                com.google.protobuf.WireFormat$FieldType r4 = r9.f83270c     // Catch:{ InvalidWireTypeException -> 0x004e }
                V r5 = r9.f83271d     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Object r3 = r7.mo101192X(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x0046:
                com.google.protobuf.WireFormat$FieldType r4 = r9.f83268a     // Catch:{ InvalidWireTypeException -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.mo101192X(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.mo101057E()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x005b }
                r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.f83326i = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34397k.C34399b.mo101066N(java.util.Map, com.google.protobuf.f1$b, com.google.protobuf.g0):void");
        }

        /* renamed from: O */
        public <T> T mo101067O(Class<T> cls, C34368g0 g0Var) throws IOException {
            mo101206l0(2);
            return mo101198d0(C34325a2.m138828a().mo100881i(cls), g0Var);
        }

        /* renamed from: P */
        public <T> void mo101068P(List<T> list, Class<T> cls, C34368g0 g0Var) throws IOException {
            mo101063K(list, C34325a2.m138828a().mo100881i(cls), g0Var);
        }

        /* renamed from: Q */
        public <T> T mo101069Q(C34372g2<T> g2Var, C34368g0 g0Var) throws IOException {
            mo101206l0(3);
            return mo101193Y(g2Var, g0Var);
        }

        /* renamed from: R */
        public <T> void mo101070R(List<T> list, Class<T> cls, C34368g0 g0Var) throws IOException {
            mo101064L(list, C34325a2.m138828a().mo100881i(cls), g0Var);
        }

        /* renamed from: S */
        public <T> T mo101071S(C34372g2<T> g2Var, C34368g0 g0Var) throws IOException {
            mo101206l0(2);
            return mo101198d0(g2Var, g0Var);
        }

        /* renamed from: T */
        public int mo101189T() {
            return this.f83324g - this.f83325h;
        }

        /* renamed from: V */
        public final boolean mo101190V() {
            return this.f83324g == this.f83326i;
        }

        /* renamed from: W */
        public final byte mo101191W() throws IOException {
            int i = this.f83324g;
            if (i != this.f83326i) {
                byte[] bArr = this.f83323f;
                this.f83324g = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m138422n();
        }

        /* renamed from: X */
        public final Object mo101192X(WireFormat.FieldType fieldType, Class<?> cls, C34368g0 g0Var) throws IOException {
            switch (C34398a.f83321a[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo101075d());
                case 2:
                    return mo101085n();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo101081j());
                case 5:
                    return Integer.valueOf(mo101093t());
                case 6:
                    return Long.valueOf(mo101072a());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(mo101086o());
                case 9:
                    return Long.valueOf(mo101061I());
                case 10:
                    return mo101067O(cls, g0Var);
                case 11:
                    return Integer.valueOf(mo101058F());
                case 12:
                    return Long.valueOf(mo101076e());
                case 13:
                    return Integer.valueOf(mo101082k());
                case 14:
                    return Long.valueOf(mo101097x());
                case 15:
                    return mo101062J();
                case 16:
                    return Integer.valueOf(mo101078g());
                case 17:
                    return Long.valueOf(mo101089r());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: Y */
        public final <T> T mo101193Y(C34372g2<T> g2Var, C34368g0 g0Var) throws IOException {
            int i = this.f83328k;
            this.f83328k = WireFormat.m138723c(WireFormat.m138721a(this.f83327j), 4);
            try {
                T e = g2Var.mo101118e();
                g2Var.mo101122i(e, this, g0Var);
                g2Var.mo101115b(e);
                if (this.f83327j == this.f83328k) {
                    return e;
                }
                throw InvalidProtocolBufferException.m138419i();
            } finally {
                this.f83328k = i;
            }
        }

        /* renamed from: Z */
        public final int mo101194Z() throws IOException {
            mo101204j0(4);
            return mo101195a0();
        }

        /* renamed from: a */
        public long mo101072a() throws IOException {
            mo101206l0(1);
            return mo101196b0();
        }

        /* renamed from: a0 */
        public final int mo101195a0() {
            int i = this.f83324g;
            byte[] bArr = this.f83323f;
            this.f83324g = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0);
        }

        /* renamed from: b */
        public void mo101073b(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C34467u0) {
                C34467u0 u0Var = (C34467u0) list;
                int b = WireFormat.m138722b(this.f83327j);
                if (b == 2) {
                    int g0 = mo101201g0();
                    mo101211q0(g0);
                    int i3 = this.f83324g + g0;
                    while (this.f83324g < i3) {
                        u0Var.mo101605V(mo101195a0());
                    }
                } else if (b == 5) {
                    do {
                        u0Var.mo101605V(mo101058F());
                        if (!mo101190V()) {
                            i2 = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i2;
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            } else {
                int b2 = WireFormat.m138722b(this.f83327j);
                if (b2 == 2) {
                    int g02 = mo101201g0();
                    mo101211q0(g02);
                    int i4 = this.f83324g + g02;
                    while (this.f83324g < i4) {
                        list.add(Integer.valueOf(mo101195a0()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo101058F()));
                        if (!mo101190V()) {
                            i = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i;
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            }
        }

        /* renamed from: b0 */
        public final long mo101196b0() throws IOException {
            mo101204j0(8);
            return mo101197c0();
        }

        /* renamed from: c */
        public void mo101074c(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C34351d1) {
                C34351d1 d1Var = (C34351d1) list;
                int b = WireFormat.m138722b(this.f83327j);
                if (b == 0) {
                    do {
                        d1Var.mo101024Z(mo101097x());
                        if (!mo101190V()) {
                            i2 = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i2;
                } else if (b == 2) {
                    int g0 = this.f83324g + mo101201g0();
                    while (this.f83324g < g0) {
                        d1Var.mo101024Z(C34448s.m140147c(mo101202h0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            } else {
                int b2 = WireFormat.m138722b(this.f83327j);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo101097x()));
                        if (!mo101190V()) {
                            i = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i;
                } else if (b2 == 2) {
                    int g02 = this.f83324g + mo101201g0();
                    while (this.f83324g < g02) {
                        list.add(Long.valueOf(C34448s.m140147c(mo101202h0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            }
        }

        /* renamed from: c0 */
        public final long mo101197c0() {
            int i = this.f83324g;
            byte[] bArr = this.f83323f;
            this.f83324g = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: d */
        public boolean mo101075d() throws IOException {
            mo101206l0(0);
            if (mo101201g0() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: d0 */
        public final <T> T mo101198d0(C34372g2<T> g2Var, C34368g0 g0Var) throws IOException {
            int g0 = mo101201g0();
            mo101204j0(g0);
            int i = this.f83326i;
            int i2 = this.f83324g + g0;
            this.f83326i = i2;
            try {
                T e = g2Var.mo101118e();
                g2Var.mo101122i(e, this, g0Var);
                g2Var.mo101115b(e);
                if (this.f83324g == i2) {
                    return e;
                }
                throw InvalidProtocolBufferException.m138419i();
            } finally {
                this.f83326i = i;
            }
        }

        /* renamed from: e */
        public long mo101076e() throws IOException {
            mo101206l0(1);
            return mo101196b0();
        }

        /* renamed from: e0 */
        public String mo101199e0(boolean z) throws IOException {
            mo101206l0(2);
            int g0 = mo101201g0();
            if (g0 == 0) {
                return "";
            }
            mo101204j0(g0);
            if (z) {
                byte[] bArr = this.f83323f;
                int i = this.f83324g;
                if (!Utf8.m138643u(bArr, i, i + g0)) {
                    throw InvalidProtocolBufferException.m138415e();
                }
            }
            String str = new String(this.f83323f, this.f83324g, g0, C34471v0.f83529a);
            this.f83324g += g0;
            return str;
        }

        /* renamed from: f */
        public void mo101077f(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C34351d1) {
                C34351d1 d1Var = (C34351d1) list;
                int b = WireFormat.m138722b(this.f83327j);
                if (b == 0) {
                    do {
                        d1Var.mo101024Z(mo101089r());
                        if (!mo101190V()) {
                            i2 = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i2;
                } else if (b == 2) {
                    int g0 = this.f83324g + mo101201g0();
                    while (this.f83324g < g0) {
                        d1Var.mo101024Z(mo101202h0());
                    }
                    mo101205k0(g0);
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            } else {
                int b2 = WireFormat.m138722b(this.f83327j);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo101089r()));
                        if (!mo101190V()) {
                            i = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i;
                } else if (b2 == 2) {
                    int g02 = this.f83324g + mo101201g0();
                    while (this.f83324g < g02) {
                        list.add(Long.valueOf(mo101202h0()));
                    }
                    mo101205k0(g02);
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            }
        }

        /* renamed from: f0 */
        public void mo101200f0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (WireFormat.m138722b(this.f83327j) != 2) {
                throw InvalidProtocolBufferException.m138416f();
            } else if (!(list instanceof C34324a1) || z) {
                do {
                    list.add(mo101199e0(z));
                    if (!mo101190V()) {
                        i = this.f83324g;
                    } else {
                        return;
                    }
                } while (mo101201g0() == this.f83327j);
                this.f83324g = i;
            } else {
                C34324a1 a1Var = (C34324a1) list;
                do {
                    a1Var.mo100861D0(mo101085n());
                    if (!mo101190V()) {
                        i2 = this.f83324g;
                    } else {
                        return;
                    }
                } while (mo101201g0() == this.f83327j);
                this.f83324g = i2;
            }
        }

        /* renamed from: g */
        public int mo101078g() throws IOException {
            mo101206l0(0);
            return mo101201g0();
        }

        /* renamed from: g0 */
        public final int mo101201g0() throws IOException {
            byte b;
            int i = this.f83324g;
            int i2 = this.f83326i;
            if (i2 != i) {
                byte[] bArr = this.f83323f;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f83324g = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) mo101203i0();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ C11354n.f28471b;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << DateTimeFieldType.f30624Y);
                        if (b4 >= 0) {
                            b = b4 ^ C11354n.f28471b;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << DateTimeFieldType.f30608J0);
                            if (b5 < 0) {
                                b = b5 ^ C11354n.f28471b;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << C31234i.C31240f.f75184f)) ^ C11354n.f28471b;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw InvalidProtocolBufferException.m138417g();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f83324g = i4;
                    return b;
                }
            } else {
                throw InvalidProtocolBufferException.m138422n();
            }
        }

        /* renamed from: h */
        public void mo101079h(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C34351d1) {
                C34351d1 d1Var = (C34351d1) list;
                int b = WireFormat.m138722b(this.f83327j);
                if (b == 0) {
                    do {
                        d1Var.mo101024Z(mo101061I());
                        if (!mo101190V()) {
                            i2 = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i2;
                } else if (b == 2) {
                    int g0 = this.f83324g + mo101201g0();
                    while (this.f83324g < g0) {
                        d1Var.mo101024Z(mo101202h0());
                    }
                    mo101205k0(g0);
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            } else {
                int b2 = WireFormat.m138722b(this.f83327j);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo101061I()));
                        if (!mo101190V()) {
                            i = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i;
                } else if (b2 == 2) {
                    int g02 = this.f83324g + mo101201g0();
                    while (this.f83324g < g02) {
                        list.add(Long.valueOf(mo101202h0()));
                    }
                    mo101205k0(g02);
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            }
        }

        /* renamed from: h0 */
        public long mo101202h0() throws IOException {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f83324g;
            int i3 = this.f83326i;
            if (i3 != i2) {
                byte[] bArr = this.f83323f;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f83324g = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return mo101203i0();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ C11354n.f28471b;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << DateTimeFieldType.f30624Y);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ C11354n.f28471b);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << DateTimeFieldType.f30608J0);
                            if (b5 < 0) {
                                b = b5 ^ C11354n.f28471b;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw InvalidProtocolBufferException.m138417g();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f83324g = i;
                        return j;
                    }
                    j = (long) b;
                    this.f83324g = i;
                    return j;
                }
            } else {
                throw InvalidProtocolBufferException.m138422n();
            }
        }

        /* renamed from: i */
        public void mo101080i(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C34467u0) {
                C34467u0 u0Var = (C34467u0) list;
                int b = WireFormat.m138722b(this.f83327j);
                if (b == 0) {
                    do {
                        u0Var.mo101605V(mo101081j());
                        if (!mo101190V()) {
                            i2 = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i2;
                } else if (b == 2) {
                    int g0 = this.f83324g + mo101201g0();
                    while (this.f83324g < g0) {
                        u0Var.mo101605V(mo101201g0());
                    }
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            } else {
                int b2 = WireFormat.m138722b(this.f83327j);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo101081j()));
                        if (!mo101190V()) {
                            i = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i;
                } else if (b2 == 2) {
                    int g02 = this.f83324g + mo101201g0();
                    while (this.f83324g < g02) {
                        list.add(Integer.valueOf(mo101201g0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            }
        }

        /* renamed from: i0 */
        public final long mo101203i0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte W = mo101191W();
                j |= ((long) (W & Byte.MAX_VALUE)) << i;
                if ((W & C11354n.f28471b) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m138417g();
        }

        /* renamed from: j */
        public int mo101081j() throws IOException {
            mo101206l0(0);
            return mo101201g0();
        }

        /* renamed from: j0 */
        public final void mo101204j0(int i) throws IOException {
            if (i < 0 || i > this.f83326i - this.f83324g) {
                throw InvalidProtocolBufferException.m138422n();
            }
        }

        /* renamed from: k */
        public int mo101082k() throws IOException {
            mo101206l0(0);
            return C34448s.m140146b(mo101201g0());
        }

        /* renamed from: k0 */
        public final void mo101205k0(int i) throws IOException {
            if (this.f83324g != i) {
                throw InvalidProtocolBufferException.m138422n();
            }
        }

        /* renamed from: l */
        public void mo101083l(List<Boolean> list) throws IOException {
            int i;
            boolean z;
            int i2;
            boolean z2;
            if (list instanceof C34419n) {
                C34419n nVar = (C34419n) list;
                int b = WireFormat.m138722b(this.f83327j);
                if (b == 0) {
                    do {
                        nVar.mo101365N(mo101075d());
                        if (!mo101190V()) {
                            i2 = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i2;
                } else if (b == 2) {
                    int g0 = this.f83324g + mo101201g0();
                    while (this.f83324g < g0) {
                        if (mo101201g0() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        nVar.mo101365N(z2);
                    }
                    mo101205k0(g0);
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            } else {
                int b2 = WireFormat.m138722b(this.f83327j);
                if (b2 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo101075d()));
                        if (!mo101190V()) {
                            i = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i;
                } else if (b2 == 2) {
                    int g02 = this.f83324g + mo101201g0();
                    while (this.f83324g < g02) {
                        if (mo101201g0() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        list.add(Boolean.valueOf(z));
                    }
                    mo101205k0(g02);
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            }
        }

        /* renamed from: l0 */
        public final void mo101206l0(int i) throws IOException {
            if (WireFormat.m138722b(this.f83327j) != i) {
                throw InvalidProtocolBufferException.m138416f();
            }
        }

        /* renamed from: m */
        public void mo101084m(List<String> list) throws IOException {
            mo101200f0(list, true);
        }

        /* renamed from: m0 */
        public final void mo101207m0(int i) throws IOException {
            mo101204j0(i);
            this.f83324g += i;
        }

        /* renamed from: n */
        public ByteString mo101085n() throws IOException {
            ByteString byteString;
            mo101206l0(2);
            int g0 = mo101201g0();
            if (g0 == 0) {
                return ByteString.f82785d;
            }
            mo101204j0(g0);
            if (this.f83322e) {
                byteString = ByteString.m137257X0(this.f83323f, this.f83324g, g0);
            } else {
                byteString = ByteString.m137258Y(this.f83323f, this.f83324g, g0);
            }
            this.f83324g += g0;
            return byteString;
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* renamed from: n0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo101208n0() throws java.io.IOException {
            /*
                r3 = this;
                int r0 = r3.f83328k
                int r1 = r3.f83327j
                int r1 = com.google.protobuf.WireFormat.m138721a(r1)
                r2 = 4
                int r1 = com.google.protobuf.WireFormat.m138723c(r1, r2)
                r3.f83328k = r1
            L_0x000f:
                int r1 = r3.mo101099z()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.mo101057E()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f83327j
                int r2 = r3.f83328k
                if (r1 != r2) goto L_0x0027
                r3.f83328k = r0
                return
            L_0x0027:
                com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.m138419i()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34397k.C34399b.mo101208n0():void");
        }

        /* renamed from: o */
        public int mo101086o() throws IOException {
            mo101206l0(0);
            return mo101201g0();
        }

        /* renamed from: o0 */
        public final void mo101209o0() throws IOException {
            int i = this.f83326i;
            int i2 = this.f83324g;
            if (i - i2 >= 10) {
                byte[] bArr = this.f83323f;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f83324g = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            mo101210p0();
        }

        /* renamed from: p */
        public void mo101087p(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C34351d1) {
                C34351d1 d1Var = (C34351d1) list;
                int b = WireFormat.m138722b(this.f83327j);
                if (b == 1) {
                    do {
                        d1Var.mo101024Z(mo101072a());
                        if (!mo101190V()) {
                            i2 = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i2;
                } else if (b == 2) {
                    int g0 = mo101201g0();
                    mo101212r0(g0);
                    int i3 = this.f83324g + g0;
                    while (this.f83324g < i3) {
                        d1Var.mo101024Z(mo101197c0());
                    }
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            } else {
                int b2 = WireFormat.m138722b(this.f83327j);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo101072a()));
                        if (!mo101190V()) {
                            i = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i;
                } else if (b2 == 2) {
                    int g02 = mo101201g0();
                    mo101212r0(g02);
                    int i4 = this.f83324g + g02;
                    while (this.f83324g < i4) {
                        list.add(Long.valueOf(mo101197c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            }
        }

        /* renamed from: p0 */
        public final void mo101210p0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo101191W() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m138417g();
        }

        /* renamed from: q */
        public void mo101088q(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C34467u0) {
                C34467u0 u0Var = (C34467u0) list;
                int b = WireFormat.m138722b(this.f83327j);
                if (b == 0) {
                    do {
                        u0Var.mo101605V(mo101082k());
                        if (!mo101190V()) {
                            i2 = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i2;
                } else if (b == 2) {
                    int g0 = this.f83324g + mo101201g0();
                    while (this.f83324g < g0) {
                        u0Var.mo101605V(C34448s.m140146b(mo101201g0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            } else {
                int b2 = WireFormat.m138722b(this.f83327j);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo101082k()));
                        if (!mo101190V()) {
                            i = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i;
                } else if (b2 == 2) {
                    int g02 = this.f83324g + mo101201g0();
                    while (this.f83324g < g02) {
                        list.add(Integer.valueOf(C34448s.m140146b(mo101201g0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            }
        }

        /* renamed from: q0 */
        public final void mo101211q0(int i) throws IOException {
            mo101204j0(i);
            if ((i & 3) != 0) {
                throw InvalidProtocolBufferException.m138419i();
            }
        }

        /* renamed from: r */
        public long mo101089r() throws IOException {
            mo101206l0(0);
            return mo101202h0();
        }

        /* renamed from: r0 */
        public final void mo101212r0(int i) throws IOException {
            mo101204j0(i);
            if ((i & 7) != 0) {
                throw InvalidProtocolBufferException.m138419i();
            }
        }

        public double readDouble() throws IOException {
            mo101206l0(1);
            return Double.longBitsToDouble(mo101196b0());
        }

        public float readFloat() throws IOException {
            mo101206l0(5);
            return Float.intBitsToFloat(mo101194Z());
        }

        /* renamed from: s */
        public void mo101092s(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C34467u0) {
                C34467u0 u0Var = (C34467u0) list;
                int b = WireFormat.m138722b(this.f83327j);
                if (b == 0) {
                    do {
                        u0Var.mo101605V(mo101078g());
                        if (!mo101190V()) {
                            i2 = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i2;
                } else if (b == 2) {
                    int g0 = this.f83324g + mo101201g0();
                    while (this.f83324g < g0) {
                        u0Var.mo101605V(mo101201g0());
                    }
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            } else {
                int b2 = WireFormat.m138722b(this.f83327j);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo101078g()));
                        if (!mo101190V()) {
                            i = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i;
                } else if (b2 == 2) {
                    int g02 = this.f83324g + mo101201g0();
                    while (this.f83324g < g02) {
                        list.add(Integer.valueOf(mo101201g0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            }
        }

        /* renamed from: t */
        public int mo101093t() throws IOException {
            mo101206l0(5);
            return mo101194Z();
        }

        /* renamed from: u */
        public void mo101094u(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C34351d1) {
                C34351d1 d1Var = (C34351d1) list;
                int b = WireFormat.m138722b(this.f83327j);
                if (b == 1) {
                    do {
                        d1Var.mo101024Z(mo101076e());
                        if (!mo101190V()) {
                            i2 = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i2;
                } else if (b == 2) {
                    int g0 = mo101201g0();
                    mo101212r0(g0);
                    int i3 = this.f83324g + g0;
                    while (this.f83324g < i3) {
                        d1Var.mo101024Z(mo101197c0());
                    }
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            } else {
                int b2 = WireFormat.m138722b(this.f83327j);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo101076e()));
                        if (!mo101190V()) {
                            i = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i;
                } else if (b2 == 2) {
                    int g02 = mo101201g0();
                    mo101212r0(g02);
                    int i4 = this.f83324g + g02;
                    while (this.f83324g < i4) {
                        list.add(Long.valueOf(mo101197c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            }
        }

        /* renamed from: v */
        public void mo101095v(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C34467u0) {
                C34467u0 u0Var = (C34467u0) list;
                int b = WireFormat.m138722b(this.f83327j);
                if (b == 0) {
                    do {
                        u0Var.mo101605V(mo101086o());
                        if (!mo101190V()) {
                            i2 = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i2;
                } else if (b == 2) {
                    int g0 = this.f83324g + mo101201g0();
                    while (this.f83324g < g0) {
                        u0Var.mo101605V(mo101201g0());
                    }
                    mo101205k0(g0);
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            } else {
                int b2 = WireFormat.m138722b(this.f83327j);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo101086o()));
                        if (!mo101190V()) {
                            i = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i;
                } else if (b2 == 2) {
                    int g02 = this.f83324g + mo101201g0();
                    while (this.f83324g < g02) {
                        list.add(Integer.valueOf(mo101201g0()));
                    }
                    mo101205k0(g02);
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            }
        }

        /* renamed from: w */
        public void mo101096w(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C34467u0) {
                C34467u0 u0Var = (C34467u0) list;
                int b = WireFormat.m138722b(this.f83327j);
                if (b == 2) {
                    int g0 = mo101201g0();
                    mo101211q0(g0);
                    int i3 = this.f83324g + g0;
                    while (this.f83324g < i3) {
                        u0Var.mo101605V(mo101195a0());
                    }
                } else if (b == 5) {
                    do {
                        u0Var.mo101605V(mo101093t());
                        if (!mo101190V()) {
                            i2 = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i2;
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            } else {
                int b2 = WireFormat.m138722b(this.f83327j);
                if (b2 == 2) {
                    int g02 = mo101201g0();
                    mo101211q0(g02);
                    int i4 = this.f83324g + g02;
                    while (this.f83324g < i4) {
                        list.add(Integer.valueOf(mo101195a0()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo101093t()));
                        if (!mo101190V()) {
                            i = this.f83324g;
                        } else {
                            return;
                        }
                    } while (mo101201g0() == this.f83327j);
                    this.f83324g = i;
                } else {
                    throw InvalidProtocolBufferException.m138416f();
                }
            }
        }

        /* renamed from: x */
        public long mo101097x() throws IOException {
            mo101206l0(0);
            return C34448s.m140147c(mo101202h0());
        }

        /* renamed from: y */
        public String mo101098y() throws IOException {
            return mo101199e0(false);
        }

        /* renamed from: z */
        public int mo101099z() throws IOException {
            if (mo101190V()) {
                return Integer.MAX_VALUE;
            }
            int g0 = mo101201g0();
            this.f83327j = g0;
            if (g0 == this.f83328k) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.m138721a(g0);
        }
    }

    public /* synthetic */ C34397k(C34398a aVar) {
        this();
    }

    /* renamed from: U */
    public static C34397k m139467U(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C34399b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    /* renamed from: D */
    public boolean mo101056D() {
        return false;
    }

    /* renamed from: T */
    public abstract int mo101189T();

    public C34397k() {
    }
}
