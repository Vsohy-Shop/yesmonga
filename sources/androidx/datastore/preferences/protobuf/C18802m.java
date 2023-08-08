package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import com.google.android.material.color.C31234i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.C11354n;
import org.joda.time.DateTimeFieldType;

/* renamed from: androidx.datastore.preferences.protobuf.m */
public abstract class C18802m implements C18899w2 {

    /* renamed from: c */
    public static final int f47918c = 3;

    /* renamed from: d */
    public static final int f47919d = 7;

    /* renamed from: androidx.datastore.preferences.protobuf.m$a */
    public static /* synthetic */ class C18803a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47920a;

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
                f47920a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f47920a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18802m.C18803a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.m$b */
    public static final class C18804b extends C18802m {

        /* renamed from: e */
        public final boolean f47921e;

        /* renamed from: f */
        public final byte[] f47922f;

        /* renamed from: g */
        public int f47923g;

        /* renamed from: h */
        public final int f47924h;

        /* renamed from: i */
        public int f47925i;

        /* renamed from: j */
        public int f47926j;

        /* renamed from: k */
        public int f47927k;

        public C18804b(ByteBuffer byteBuffer, boolean z) {
            super((C18803a) null);
            this.f47921e = z;
            this.f47922f = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f47923g = arrayOffset;
            this.f47924h = arrayOffset;
            this.f47925i = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: A */
        public void mo54947A(List<String> list) throws IOException {
            mo54981f0(list, false);
        }

        /* renamed from: B */
        public int mo54948B() {
            return this.f47926j;
        }

        /* renamed from: C */
        public void mo54949C(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18919z0) {
                C18919z0 z0Var = (C18919z0) list;
                int b = WireFormat.m85345b(this.f47926j);
                if (b == 2) {
                    int g0 = mo54983g0();
                    mo55003q0(g0);
                    int i3 = this.f47923g + g0;
                    while (this.f47923g < i3) {
                        z0Var.mo54828G(Float.intBitsToFloat(mo54971a0()));
                    }
                } else if (b == 5) {
                    do {
                        z0Var.mo54828G(readFloat());
                        if (!mo54965V()) {
                            i2 = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i2;
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            } else {
                int b2 = WireFormat.m85345b(this.f47926j);
                if (b2 == 2) {
                    int g02 = mo54983g0();
                    mo55003q0(g02);
                    int i4 = this.f47923g + g02;
                    while (this.f47923g < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(mo54971a0())));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!mo54965V()) {
                            i = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i;
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            }
        }

        /* renamed from: E */
        public boolean mo54950E() throws IOException {
            int i;
            if (mo54965V() || (i = this.f47926j) == this.f47927k) {
                return false;
            }
            int b = WireFormat.m85345b(i);
            if (b == 0) {
                mo54999o0();
                return true;
            } else if (b == 1) {
                mo54995m0(8);
                return true;
            } else if (b == 2) {
                mo54995m0(mo54983g0());
                return true;
            } else if (b == 3) {
                mo54997n0();
                return true;
            } else if (b == 5) {
                mo54995m0(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }

        /* renamed from: F */
        public int mo54951F() throws IOException {
            mo54993l0(5);
            return mo54969Z();
        }

        /* renamed from: G */
        public void mo54952G(List<ByteString> list) throws IOException {
            int i;
            if (WireFormat.m85345b(this.f47926j) == 2) {
                do {
                    list.add(mo54996n());
                    if (!mo54965V()) {
                        i = this.f47923g;
                    } else {
                        return;
                    }
                } while (mo54983g0() == this.f47926j);
                this.f47923g = i;
                return;
            }
            throw InvalidProtocolBufferException.m85088e();
        }

        /* renamed from: H */
        public void mo54953H(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18918z) {
                C18918z zVar = (C18918z) list;
                int b = WireFormat.m85345b(this.f47926j);
                if (b == 1) {
                    do {
                        zVar.mo54826c0(readDouble());
                        if (!mo54965V()) {
                            i2 = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i2;
                } else if (b == 2) {
                    int g0 = mo54983g0();
                    mo55005r0(g0);
                    int i3 = this.f47923g + g0;
                    while (this.f47923g < i3) {
                        zVar.mo54826c0(Double.longBitsToDouble(mo54975c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            } else {
                int b2 = WireFormat.m85345b(this.f47926j);
                if (b2 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!mo54965V()) {
                            i = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i;
                } else if (b2 == 2) {
                    int g02 = mo54983g0();
                    mo55005r0(g02);
                    int i4 = this.f47923g + g02;
                    while (this.f47923g < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(mo54975c0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            }
        }

        /* renamed from: I */
        public long mo54954I() throws IOException {
            mo54993l0(0);
            return mo54985h0();
        }

        /* renamed from: J */
        public String mo54955J() throws IOException {
            return mo54979e0(true);
        }

        /* renamed from: K */
        public <T> T mo54956K(C18905x2<T> x2Var, C18836p0 p0Var) throws IOException {
            mo54993l0(2);
            return mo54977d0(x2Var, p0Var);
        }

        /* renamed from: L */
        public <T> void mo54957L(List<T> list, C18905x2<T> x2Var, C18836p0 p0Var) throws IOException {
            int i;
            if (WireFormat.m85345b(this.f47926j) == 2) {
                int i2 = this.f47926j;
                do {
                    list.add(mo54977d0(x2Var, p0Var));
                    if (!mo54965V()) {
                        i = this.f47923g;
                    } else {
                        return;
                    }
                } while (mo54983g0() == i2);
                this.f47923g = i;
                return;
            }
            throw InvalidProtocolBufferException.m85088e();
        }

        /* renamed from: M */
        public <T> T mo54958M(C18905x2<T> x2Var, C18836p0 p0Var) throws IOException {
            mo54993l0(3);
            return mo54968Y(x2Var, p0Var);
        }

        /* renamed from: N */
        public <T> T mo54959N(Class<T> cls, C18836p0 p0Var) throws IOException {
            mo54993l0(2);
            return mo54977d0(C18853r2.m87361a().mo55373i(cls), p0Var);
        }

        /* renamed from: O */
        public <T> void mo54960O(List<T> list, Class<T> cls, C18836p0 p0Var) throws IOException {
            mo54964S(list, C18853r2.m87361a().mo55373i(cls), p0Var);
        }

        /* renamed from: P */
        public <T> T mo54961P(Class<T> cls, C18836p0 p0Var) throws IOException {
            mo54993l0(3);
            return mo54968Y(C18853r2.m87361a().mo55373i(cls), p0Var);
        }

        /* renamed from: Q */
        public <T> void mo54962Q(List<T> list, Class<T> cls, C18836p0 p0Var) throws IOException {
            mo54957L(list, C18853r2.m87361a().mo55373i(cls), p0Var);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (mo54950E() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* renamed from: R */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <K, V> void mo54963R(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.C18868t1.C18870b<K, V> r9, androidx.datastore.preferences.protobuf.C18836p0 r10) throws java.io.IOException {
            /*
                r7 = this;
                r0 = 2
                r7.mo54993l0(r0)
                int r1 = r7.mo54983g0()
                r7.mo54989j0(r1)
                int r2 = r7.f47925i
                int r3 = r7.f47923g
                int r3 = r3 + r1
                r7.f47925i = r3
                K r1 = r9.f48042b     // Catch:{ all -> 0x005b }
                V r3 = r9.f48044d     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.mo55015z()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.f47925i = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.mo54950E()     // Catch:{ InvalidWireTypeException -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004e }
                r4.<init>((java.lang.String) r6)     // Catch:{ InvalidWireTypeException -> 0x004e }
                throw r4     // Catch:{ InvalidWireTypeException -> 0x004e }
            L_0x0039:
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f48043c     // Catch:{ InvalidWireTypeException -> 0x004e }
                V r5 = r9.f48044d     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Object r3 = r7.mo54967X(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x0046:
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f48041a     // Catch:{ InvalidWireTypeException -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.mo54967X(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.mo54950E()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x005b }
                r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.f47925i = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18802m.C18804b.mo54963R(java.util.Map, androidx.datastore.preferences.protobuf.t1$b, androidx.datastore.preferences.protobuf.p0):void");
        }

        /* renamed from: S */
        public <T> void mo54964S(List<T> list, C18905x2<T> x2Var, C18836p0 p0Var) throws IOException {
            int i;
            if (WireFormat.m85345b(this.f47926j) == 3) {
                int i2 = this.f47926j;
                do {
                    list.add(mo54968Y(x2Var, p0Var));
                    if (!mo54965V()) {
                        i = this.f47923g;
                    } else {
                        return;
                    }
                } while (mo54983g0() == i2);
                this.f47923g = i;
                return;
            }
            throw InvalidProtocolBufferException.m85088e();
        }

        /* renamed from: T */
        public int mo54946T() {
            return this.f47923g - this.f47924h;
        }

        /* renamed from: V */
        public final boolean mo54965V() {
            return this.f47923g == this.f47925i;
        }

        /* renamed from: W */
        public final byte mo54966W() throws IOException {
            int i = this.f47923g;
            if (i != this.f47925i) {
                byte[] bArr = this.f47922f;
                this.f47923g = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m85094l();
        }

        /* renamed from: X */
        public final Object mo54967X(WireFormat.FieldType fieldType, Class<?> cls, C18836p0 p0Var) throws IOException {
            switch (C18803a.f47920a[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo54976d());
                case 2:
                    return mo54996n();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo54988j());
                case 5:
                    return Integer.valueOf(mo55009t());
                case 6:
                    return Long.valueOf(mo54970a());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(mo54998o());
                case 9:
                    return Long.valueOf(mo54954I());
                case 10:
                    return mo54959N(cls, p0Var);
                case 11:
                    return Integer.valueOf(mo54951F());
                case 12:
                    return Long.valueOf(mo54978e());
                case 13:
                    return Integer.valueOf(mo54990k());
                case 14:
                    return Long.valueOf(mo55013x());
                case 15:
                    return mo54955J();
                case 16:
                    return Integer.valueOf(mo54982g());
                case 17:
                    return Long.valueOf(mo55004r());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: Y */
        public final <T> T mo54968Y(C18905x2<T> x2Var, C18836p0 p0Var) throws IOException {
            int i = this.f47927k;
            this.f47927k = WireFormat.m85346c(WireFormat.m85344a(this.f47926j), 4);
            try {
                T e = x2Var.mo54451e();
                x2Var.mo54457h(e, this, p0Var);
                x2Var.mo54446b(e);
                if (this.f47926j == this.f47927k) {
                    return e;
                }
                throw InvalidProtocolBufferException.m85091h();
            } finally {
                this.f47927k = i;
            }
        }

        /* renamed from: Z */
        public final int mo54969Z() throws IOException {
            mo54989j0(4);
            return mo54971a0();
        }

        /* renamed from: a */
        public long mo54970a() throws IOException {
            mo54993l0(1);
            return mo54973b0();
        }

        /* renamed from: a0 */
        public final int mo54971a0() {
            int i = this.f47923g;
            byte[] bArr = this.f47922f;
            this.f47923g = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0);
        }

        /* renamed from: b */
        public void mo54972b(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18744h1) {
                C18744h1 h1Var = (C18744h1) list;
                int b = WireFormat.m85345b(this.f47926j);
                if (b == 2) {
                    int g0 = mo54983g0();
                    mo55003q0(g0);
                    int i3 = this.f47923g + g0;
                    while (this.f47923g < i3) {
                        h1Var.mo54629V(mo54971a0());
                    }
                } else if (b == 5) {
                    do {
                        h1Var.mo54629V(mo54951F());
                        if (!mo54965V()) {
                            i2 = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i2;
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            } else {
                int b2 = WireFormat.m85345b(this.f47926j);
                if (b2 == 2) {
                    int g02 = mo54983g0();
                    mo55003q0(g02);
                    int i4 = this.f47923g + g02;
                    while (this.f47923g < i4) {
                        list.add(Integer.valueOf(mo54971a0()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo54951F()));
                        if (!mo54965V()) {
                            i = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i;
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            }
        }

        /* renamed from: b0 */
        public final long mo54973b0() throws IOException {
            mo54989j0(8);
            return mo54975c0();
        }

        /* renamed from: c */
        public void mo54974c(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18852r1) {
                C18852r1 r1Var = (C18852r1) list;
                int b = WireFormat.m85345b(this.f47926j);
                if (b == 0) {
                    do {
                        r1Var.mo54835Z(mo55013x());
                        if (!mo54965V()) {
                            i2 = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i2;
                } else if (b == 2) {
                    int g0 = this.f47923g + mo54983g0();
                    while (this.f47923g < g0) {
                        r1Var.mo54835Z(C18889w.m87621c(mo54985h0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            } else {
                int b2 = WireFormat.m85345b(this.f47926j);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo55013x()));
                        if (!mo54965V()) {
                            i = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i;
                } else if (b2 == 2) {
                    int g02 = this.f47923g + mo54983g0();
                    while (this.f47923g < g02) {
                        list.add(Long.valueOf(C18889w.m87621c(mo54985h0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            }
        }

        /* renamed from: c0 */
        public final long mo54975c0() {
            int i = this.f47923g;
            byte[] bArr = this.f47922f;
            this.f47923g = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: d */
        public boolean mo54976d() throws IOException {
            mo54993l0(0);
            if (mo54983g0() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: d0 */
        public final <T> T mo54977d0(C18905x2<T> x2Var, C18836p0 p0Var) throws IOException {
            int g0 = mo54983g0();
            mo54989j0(g0);
            int i = this.f47925i;
            int i2 = this.f47923g + g0;
            this.f47925i = i2;
            try {
                T e = x2Var.mo54451e();
                x2Var.mo54457h(e, this, p0Var);
                x2Var.mo54446b(e);
                if (this.f47923g == i2) {
                    return e;
                }
                throw InvalidProtocolBufferException.m85091h();
            } finally {
                this.f47925i = i;
            }
        }

        /* renamed from: e */
        public long mo54978e() throws IOException {
            mo54993l0(1);
            return mo54973b0();
        }

        /* renamed from: e0 */
        public String mo54979e0(boolean z) throws IOException {
            mo54993l0(2);
            int g0 = mo54983g0();
            if (g0 == 0) {
                return "";
            }
            mo54989j0(g0);
            if (z) {
                byte[] bArr = this.f47922f;
                int i = this.f47923g;
                if (!Utf8.m85210u(bArr, i, i + g0)) {
                    throw InvalidProtocolBufferException.m85087d();
                }
            }
            String str = new String(this.f47922f, this.f47923g, g0, C18753i1.f47860a);
            this.f47923g += g0;
            return str;
        }

        /* renamed from: f */
        public void mo54980f(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18852r1) {
                C18852r1 r1Var = (C18852r1) list;
                int b = WireFormat.m85345b(this.f47926j);
                if (b == 0) {
                    do {
                        r1Var.mo54835Z(mo55004r());
                        if (!mo54965V()) {
                            i2 = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i2;
                } else if (b == 2) {
                    int g0 = this.f47923g + mo54983g0();
                    while (this.f47923g < g0) {
                        r1Var.mo54835Z(mo54985h0());
                    }
                    mo54991k0(g0);
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            } else {
                int b2 = WireFormat.m85345b(this.f47926j);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo55004r()));
                        if (!mo54965V()) {
                            i = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i;
                } else if (b2 == 2) {
                    int g02 = this.f47923g + mo54983g0();
                    while (this.f47923g < g02) {
                        list.add(Long.valueOf(mo54985h0()));
                    }
                    mo54991k0(g02);
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            }
        }

        /* renamed from: f0 */
        public void mo54981f0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (WireFormat.m85345b(this.f47926j) != 2) {
                throw InvalidProtocolBufferException.m85088e();
            } else if (!(list instanceof C18818n1) || z) {
                do {
                    list.add(mo54979e0(z));
                    if (!mo54965V()) {
                        i = this.f47923g;
                    } else {
                        return;
                    }
                } while (mo54983g0() == this.f47926j);
                this.f47923g = i;
            } else {
                C18818n1 n1Var = (C18818n1) list;
                do {
                    n1Var.mo55022N2(mo54996n());
                    if (!mo54965V()) {
                        i2 = this.f47923g;
                    } else {
                        return;
                    }
                } while (mo54983g0() == this.f47926j);
                this.f47923g = i2;
            }
        }

        /* renamed from: g */
        public int mo54982g() throws IOException {
            mo54993l0(0);
            return mo54983g0();
        }

        /* renamed from: g0 */
        public final int mo54983g0() throws IOException {
            byte b;
            int i = this.f47923g;
            int i2 = this.f47925i;
            if (i2 != i) {
                byte[] bArr = this.f47922f;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f47923g = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) mo54987i0();
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
                                                        throw InvalidProtocolBufferException.m85089f();
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
                    this.f47923g = i4;
                    return b;
                }
            } else {
                throw InvalidProtocolBufferException.m85094l();
            }
        }

        /* renamed from: h */
        public void mo54984h(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18852r1) {
                C18852r1 r1Var = (C18852r1) list;
                int b = WireFormat.m85345b(this.f47926j);
                if (b == 0) {
                    do {
                        r1Var.mo54835Z(mo54954I());
                        if (!mo54965V()) {
                            i2 = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i2;
                } else if (b == 2) {
                    int g0 = this.f47923g + mo54983g0();
                    while (this.f47923g < g0) {
                        r1Var.mo54835Z(mo54985h0());
                    }
                    mo54991k0(g0);
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            } else {
                int b2 = WireFormat.m85345b(this.f47926j);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo54954I()));
                        if (!mo54965V()) {
                            i = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i;
                } else if (b2 == 2) {
                    int g02 = this.f47923g + mo54983g0();
                    while (this.f47923g < g02) {
                        list.add(Long.valueOf(mo54985h0()));
                    }
                    mo54991k0(g02);
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            }
        }

        /* renamed from: h0 */
        public long mo54985h0() throws IOException {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f47923g;
            int i3 = this.f47925i;
            if (i3 != i2) {
                byte[] bArr = this.f47922f;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f47923g = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return mo54987i0();
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
                                                        throw InvalidProtocolBufferException.m85089f();
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
                        this.f47923g = i;
                        return j;
                    }
                    j = (long) b;
                    this.f47923g = i;
                    return j;
                }
            } else {
                throw InvalidProtocolBufferException.m85094l();
            }
        }

        /* renamed from: i */
        public void mo54986i(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18744h1) {
                C18744h1 h1Var = (C18744h1) list;
                int b = WireFormat.m85345b(this.f47926j);
                if (b == 0) {
                    do {
                        h1Var.mo54629V(mo54988j());
                        if (!mo54965V()) {
                            i2 = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i2;
                } else if (b == 2) {
                    int g0 = this.f47923g + mo54983g0();
                    while (this.f47923g < g0) {
                        h1Var.mo54629V(mo54983g0());
                    }
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            } else {
                int b2 = WireFormat.m85345b(this.f47926j);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo54988j()));
                        if (!mo54965V()) {
                            i = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i;
                } else if (b2 == 2) {
                    int g02 = this.f47923g + mo54983g0();
                    while (this.f47923g < g02) {
                        list.add(Integer.valueOf(mo54983g0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            }
        }

        /* renamed from: i0 */
        public final long mo54987i0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte W = mo54966W();
                j |= ((long) (W & Byte.MAX_VALUE)) << i;
                if ((W & C11354n.f28471b) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m85089f();
        }

        /* renamed from: j */
        public int mo54988j() throws IOException {
            mo54993l0(0);
            return mo54983g0();
        }

        /* renamed from: j0 */
        public final void mo54989j0(int i) throws IOException {
            if (i < 0 || i > this.f47925i - this.f47923g) {
                throw InvalidProtocolBufferException.m85094l();
            }
        }

        /* renamed from: k */
        public int mo54990k() throws IOException {
            mo54993l0(0);
            return C18889w.m87620b(mo54983g0());
        }

        /* renamed from: k0 */
        public final void mo54991k0(int i) throws IOException {
            if (this.f47923g != i) {
                throw InvalidProtocolBufferException.m85094l();
            }
        }

        /* renamed from: l */
        public void mo54992l(List<Boolean> list) throws IOException {
            int i;
            boolean z;
            int i2;
            boolean z2;
            if (list instanceof C18843q) {
                C18843q qVar = (C18843q) list;
                int b = WireFormat.m85345b(this.f47926j);
                if (b == 0) {
                    do {
                        qVar.mo54823N(mo54976d());
                        if (!mo54965V()) {
                            i2 = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i2;
                } else if (b == 2) {
                    int g0 = this.f47923g + mo54983g0();
                    while (this.f47923g < g0) {
                        if (mo54983g0() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        qVar.mo54823N(z2);
                    }
                    mo54991k0(g0);
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            } else {
                int b2 = WireFormat.m85345b(this.f47926j);
                if (b2 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo54976d()));
                        if (!mo54965V()) {
                            i = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i;
                } else if (b2 == 2) {
                    int g02 = this.f47923g + mo54983g0();
                    while (this.f47923g < g02) {
                        if (mo54983g0() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        list.add(Boolean.valueOf(z));
                    }
                    mo54991k0(g02);
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            }
        }

        /* renamed from: l0 */
        public final void mo54993l0(int i) throws IOException {
            if (WireFormat.m85345b(this.f47926j) != i) {
                throw InvalidProtocolBufferException.m85088e();
            }
        }

        /* renamed from: m */
        public void mo54994m(List<String> list) throws IOException {
            mo54981f0(list, true);
        }

        /* renamed from: m0 */
        public final void mo54995m0(int i) throws IOException {
            mo54989j0(i);
            this.f47923g += i;
        }

        /* renamed from: n */
        public ByteString mo54996n() throws IOException {
            ByteString byteString;
            mo54993l0(2);
            int g0 = mo54983g0();
            if (g0 == 0) {
                return ByteString.f47470d;
            }
            mo54989j0(g0);
            if (this.f47921e) {
                byteString = ByteString.m84386W0(this.f47922f, this.f47923g, g0);
            } else {
                byteString = ByteString.m84388Y(this.f47922f, this.f47923g, g0);
            }
            this.f47923g += g0;
            return byteString;
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* renamed from: n0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo54997n0() throws java.io.IOException {
            /*
                r3 = this;
                int r0 = r3.f47927k
                int r1 = r3.f47926j
                int r1 = androidx.datastore.preferences.protobuf.WireFormat.m85344a(r1)
                r2 = 4
                int r1 = androidx.datastore.preferences.protobuf.WireFormat.m85346c(r1, r2)
                r3.f47927k = r1
            L_0x000f:
                int r1 = r3.mo55015z()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.mo54950E()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f47926j
                int r2 = r3.f47927k
                if (r1 != r2) goto L_0x0027
                r3.f47927k = r0
                return
            L_0x0027:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m85091h()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18802m.C18804b.mo54997n0():void");
        }

        /* renamed from: o */
        public int mo54998o() throws IOException {
            mo54993l0(0);
            return mo54983g0();
        }

        /* renamed from: o0 */
        public final void mo54999o0() throws IOException {
            int i = this.f47925i;
            int i2 = this.f47923g;
            if (i - i2 >= 10) {
                byte[] bArr = this.f47922f;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f47923g = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            mo55001p0();
        }

        /* renamed from: p */
        public void mo55000p(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18852r1) {
                C18852r1 r1Var = (C18852r1) list;
                int b = WireFormat.m85345b(this.f47926j);
                if (b == 1) {
                    do {
                        r1Var.mo54835Z(mo54970a());
                        if (!mo54965V()) {
                            i2 = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i2;
                } else if (b == 2) {
                    int g0 = mo54983g0();
                    mo55005r0(g0);
                    int i3 = this.f47923g + g0;
                    while (this.f47923g < i3) {
                        r1Var.mo54835Z(mo54975c0());
                    }
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            } else {
                int b2 = WireFormat.m85345b(this.f47926j);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo54970a()));
                        if (!mo54965V()) {
                            i = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i;
                } else if (b2 == 2) {
                    int g02 = mo54983g0();
                    mo55005r0(g02);
                    int i4 = this.f47923g + g02;
                    while (this.f47923g < i4) {
                        list.add(Long.valueOf(mo54975c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            }
        }

        /* renamed from: p0 */
        public final void mo55001p0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo54966W() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m85089f();
        }

        /* renamed from: q */
        public void mo55002q(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18744h1) {
                C18744h1 h1Var = (C18744h1) list;
                int b = WireFormat.m85345b(this.f47926j);
                if (b == 0) {
                    do {
                        h1Var.mo54629V(mo54990k());
                        if (!mo54965V()) {
                            i2 = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i2;
                } else if (b == 2) {
                    int g0 = this.f47923g + mo54983g0();
                    while (this.f47923g < g0) {
                        h1Var.mo54629V(C18889w.m87620b(mo54983g0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            } else {
                int b2 = WireFormat.m85345b(this.f47926j);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo54990k()));
                        if (!mo54965V()) {
                            i = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i;
                } else if (b2 == 2) {
                    int g02 = this.f47923g + mo54983g0();
                    while (this.f47923g < g02) {
                        list.add(Integer.valueOf(C18889w.m87620b(mo54983g0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            }
        }

        /* renamed from: q0 */
        public final void mo55003q0(int i) throws IOException {
            mo54989j0(i);
            if ((i & 3) != 0) {
                throw InvalidProtocolBufferException.m85091h();
            }
        }

        /* renamed from: r */
        public long mo55004r() throws IOException {
            mo54993l0(0);
            return mo54985h0();
        }

        /* renamed from: r0 */
        public final void mo55005r0(int i) throws IOException {
            mo54989j0(i);
            if ((i & 7) != 0) {
                throw InvalidProtocolBufferException.m85091h();
            }
        }

        public double readDouble() throws IOException {
            mo54993l0(1);
            return Double.longBitsToDouble(mo54973b0());
        }

        public float readFloat() throws IOException {
            mo54993l0(5);
            return Float.intBitsToFloat(mo54969Z());
        }

        /* renamed from: s */
        public void mo55008s(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18744h1) {
                C18744h1 h1Var = (C18744h1) list;
                int b = WireFormat.m85345b(this.f47926j);
                if (b == 0) {
                    do {
                        h1Var.mo54629V(mo54982g());
                        if (!mo54965V()) {
                            i2 = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i2;
                } else if (b == 2) {
                    int g0 = this.f47923g + mo54983g0();
                    while (this.f47923g < g0) {
                        h1Var.mo54629V(mo54983g0());
                    }
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            } else {
                int b2 = WireFormat.m85345b(this.f47926j);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo54982g()));
                        if (!mo54965V()) {
                            i = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i;
                } else if (b2 == 2) {
                    int g02 = this.f47923g + mo54983g0();
                    while (this.f47923g < g02) {
                        list.add(Integer.valueOf(mo54983g0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            }
        }

        /* renamed from: t */
        public int mo55009t() throws IOException {
            mo54993l0(5);
            return mo54969Z();
        }

        /* renamed from: u */
        public void mo55010u(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18852r1) {
                C18852r1 r1Var = (C18852r1) list;
                int b = WireFormat.m85345b(this.f47926j);
                if (b == 1) {
                    do {
                        r1Var.mo54835Z(mo54978e());
                        if (!mo54965V()) {
                            i2 = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i2;
                } else if (b == 2) {
                    int g0 = mo54983g0();
                    mo55005r0(g0);
                    int i3 = this.f47923g + g0;
                    while (this.f47923g < i3) {
                        r1Var.mo54835Z(mo54975c0());
                    }
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            } else {
                int b2 = WireFormat.m85345b(this.f47926j);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo54978e()));
                        if (!mo54965V()) {
                            i = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i;
                } else if (b2 == 2) {
                    int g02 = mo54983g0();
                    mo55005r0(g02);
                    int i4 = this.f47923g + g02;
                    while (this.f47923g < i4) {
                        list.add(Long.valueOf(mo54975c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            }
        }

        /* renamed from: v */
        public void mo55011v(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18744h1) {
                C18744h1 h1Var = (C18744h1) list;
                int b = WireFormat.m85345b(this.f47926j);
                if (b == 0) {
                    do {
                        h1Var.mo54629V(mo54998o());
                        if (!mo54965V()) {
                            i2 = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i2;
                } else if (b == 2) {
                    int g0 = this.f47923g + mo54983g0();
                    while (this.f47923g < g0) {
                        h1Var.mo54629V(mo54983g0());
                    }
                    mo54991k0(g0);
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            } else {
                int b2 = WireFormat.m85345b(this.f47926j);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo54998o()));
                        if (!mo54965V()) {
                            i = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i;
                } else if (b2 == 2) {
                    int g02 = this.f47923g + mo54983g0();
                    while (this.f47923g < g02) {
                        list.add(Integer.valueOf(mo54983g0()));
                    }
                    mo54991k0(g02);
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            }
        }

        /* renamed from: w */
        public void mo55012w(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18744h1) {
                C18744h1 h1Var = (C18744h1) list;
                int b = WireFormat.m85345b(this.f47926j);
                if (b == 2) {
                    int g0 = mo54983g0();
                    mo55003q0(g0);
                    int i3 = this.f47923g + g0;
                    while (this.f47923g < i3) {
                        h1Var.mo54629V(mo54971a0());
                    }
                } else if (b == 5) {
                    do {
                        h1Var.mo54629V(mo55009t());
                        if (!mo54965V()) {
                            i2 = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i2;
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            } else {
                int b2 = WireFormat.m85345b(this.f47926j);
                if (b2 == 2) {
                    int g02 = mo54983g0();
                    mo55003q0(g02);
                    int i4 = this.f47923g + g02;
                    while (this.f47923g < i4) {
                        list.add(Integer.valueOf(mo54971a0()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo55009t()));
                        if (!mo54965V()) {
                            i = this.f47923g;
                        } else {
                            return;
                        }
                    } while (mo54983g0() == this.f47926j);
                    this.f47923g = i;
                } else {
                    throw InvalidProtocolBufferException.m85088e();
                }
            }
        }

        /* renamed from: x */
        public long mo55013x() throws IOException {
            mo54993l0(0);
            return C18889w.m87621c(mo54985h0());
        }

        /* renamed from: y */
        public String mo55014y() throws IOException {
            return mo54979e0(false);
        }

        /* renamed from: z */
        public int mo55015z() throws IOException {
            if (mo54965V()) {
                return Integer.MAX_VALUE;
            }
            int g0 = mo54983g0();
            this.f47926j = g0;
            if (g0 == this.f47927k) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.m85344a(g0);
        }
    }

    public /* synthetic */ C18802m(C18803a aVar) {
        this();
    }

    /* renamed from: U */
    public static C18802m m86576U(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C18804b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    /* renamed from: D */
    public boolean mo54945D() {
        return false;
    }

    /* renamed from: T */
    public abstract int mo54946T();

    public C18802m() {
    }
}
