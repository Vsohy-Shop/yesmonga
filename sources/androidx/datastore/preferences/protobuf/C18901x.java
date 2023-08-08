package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.x */
public final class C18901x implements C18899w2 {

    /* renamed from: g */
    public static final int f48117g = 3;

    /* renamed from: h */
    public static final int f48118h = 7;

    /* renamed from: i */
    public static final int f48119i = 0;

    /* renamed from: c */
    public final C18889w f48120c;

    /* renamed from: d */
    public int f48121d;

    /* renamed from: e */
    public int f48122e;

    /* renamed from: f */
    public int f48123f = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.x$a */
    public static /* synthetic */ class C18902a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48124a;

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
                f48124a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f48124a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18901x.C18902a.<clinit>():void");
        }
    }

    public C18901x(C18889w wVar) {
        C18889w wVar2 = (C18889w) C18753i1.m86341e(wVar, "input");
        this.f48120c = wVar2;
        wVar2.f48058d = this;
    }

    /* renamed from: T */
    public static C18901x m87974T(C18889w wVar) {
        C18901x xVar = wVar.f48058d;
        if (xVar != null) {
            return xVar;
        }
        return new C18901x(wVar);
    }

    /* renamed from: A */
    public void mo54947A(List<String> list) throws IOException {
        mo55579X(list, false);
    }

    /* renamed from: B */
    public int mo54948B() {
        return this.f48121d;
    }

    /* renamed from: C */
    public void mo54949C(List<Float> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C18919z0) {
            C18919z0 z0Var = (C18919z0) list;
            int b = WireFormat.m85345b(this.f48121d);
            if (b == 2) {
                int Z = this.f48120c.mo55499Z();
                mo55582a0(Z);
                int h = this.f48120c.mo55512h() + Z;
                do {
                    z0Var.mo54828G(this.f48120c.mo55478C());
                } while (this.f48120c.mo55512h() < h);
            } else if (b == 5) {
                do {
                    z0Var.mo54828G(this.f48120c.mo55478C());
                    if (!this.f48120c.mo55514i()) {
                        Y2 = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f48121d);
                this.f48123f = Y2;
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        } else {
            int b2 = WireFormat.m85345b(this.f48121d);
            if (b2 == 2) {
                int Z2 = this.f48120c.mo55499Z();
                mo55582a0(Z2);
                int h2 = this.f48120c.mo55512h() + Z2;
                do {
                    list.add(Float.valueOf(this.f48120c.mo55478C()));
                } while (this.f48120c.mo55512h() < h2);
            } else if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.f48120c.mo55478C()));
                    if (!this.f48120c.mo55514i()) {
                        Y = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y == this.f48121d);
                this.f48123f = Y;
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: D */
    public boolean mo54945D() {
        return this.f48120c.mo55509f0();
    }

    /* renamed from: E */
    public boolean mo54950E() throws IOException {
        int i;
        if (this.f48120c.mo55514i() || (i = this.f48121d) == this.f48122e) {
            return false;
        }
        return this.f48120c.mo55511g0(i);
    }

    /* renamed from: F */
    public int mo54951F() throws IOException {
        mo55581Z(5);
        return this.f48120c.mo55492S();
    }

    /* renamed from: G */
    public void mo54952G(List<ByteString> list) throws IOException {
        int Y;
        if (WireFormat.m85345b(this.f48121d) == 2) {
            do {
                list.add(mo54996n());
                if (!this.f48120c.mo55514i()) {
                    Y = this.f48120c.mo55498Y();
                } else {
                    return;
                }
            } while (Y == this.f48121d);
            this.f48123f = Y;
            return;
        }
        throw InvalidProtocolBufferException.m85088e();
    }

    /* renamed from: H */
    public void mo54953H(List<Double> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C18918z) {
            C18918z zVar = (C18918z) list;
            int b = WireFormat.m85345b(this.f48121d);
            if (b == 1) {
                do {
                    zVar.mo54826c0(this.f48120c.mo55525y());
                    if (!this.f48120c.mo55514i()) {
                        Y2 = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f48121d);
                this.f48123f = Y2;
            } else if (b == 2) {
                int Z = this.f48120c.mo55499Z();
                mo55583b0(Z);
                int h = this.f48120c.mo55512h() + Z;
                do {
                    zVar.mo54826c0(this.f48120c.mo55525y());
                } while (this.f48120c.mo55512h() < h);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        } else {
            int b2 = WireFormat.m85345b(this.f48121d);
            if (b2 == 1) {
                do {
                    list.add(Double.valueOf(this.f48120c.mo55525y()));
                    if (!this.f48120c.mo55514i()) {
                        Y = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y == this.f48121d);
                this.f48123f = Y;
            } else if (b2 == 2) {
                int Z2 = this.f48120c.mo55499Z();
                mo55583b0(Z2);
                int h2 = this.f48120c.mo55512h() + Z2;
                do {
                    list.add(Double.valueOf(this.f48120c.mo55525y()));
                } while (this.f48120c.mo55512h() < h2);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: I */
    public long mo54954I() throws IOException {
        mo55581Z(0);
        return this.f48120c.mo55482G();
    }

    /* renamed from: J */
    public String mo54955J() throws IOException {
        mo55581Z(2);
        return this.f48120c.mo55497X();
    }

    /* renamed from: K */
    public <T> T mo54956K(C18905x2<T> x2Var, C18836p0 p0Var) throws IOException {
        mo55581Z(2);
        return mo55578W(x2Var, p0Var);
    }

    /* renamed from: L */
    public <T> void mo54957L(List<T> list, C18905x2<T> x2Var, C18836p0 p0Var) throws IOException {
        int Y;
        if (WireFormat.m85345b(this.f48121d) == 2) {
            int i = this.f48121d;
            do {
                list.add(mo55578W(x2Var, p0Var));
                if (!this.f48120c.mo55514i() && this.f48123f == 0) {
                    Y = this.f48120c.mo55498Y();
                } else {
                    return;
                }
            } while (Y == i);
            this.f48123f = Y;
            return;
        }
        throw InvalidProtocolBufferException.m85088e();
    }

    /* renamed from: M */
    public <T> T mo54958M(C18905x2<T> x2Var, C18836p0 p0Var) throws IOException {
        mo55581Z(3);
        return mo55577V(x2Var, p0Var);
    }

    /* renamed from: N */
    public <T> T mo54959N(Class<T> cls, C18836p0 p0Var) throws IOException {
        mo55581Z(2);
        return mo55578W(C18853r2.m87361a().mo55373i(cls), p0Var);
    }

    /* renamed from: O */
    public <T> void mo54960O(List<T> list, Class<T> cls, C18836p0 p0Var) throws IOException {
        mo54964S(list, C18853r2.m87361a().mo55373i(cls), p0Var);
    }

    /* renamed from: P */
    public <T> T mo54961P(Class<T> cls, C18836p0 p0Var) throws IOException {
        mo55581Z(3);
        return mo55577V(C18853r2.m87361a().mo55373i(cls), p0Var);
    }

    /* renamed from: Q */
    public <T> void mo54962Q(List<T> list, Class<T> cls, C18836p0 p0Var) throws IOException {
        mo54957L(list, C18853r2.m87361a().mo55373i(cls), p0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (mo54950E() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void mo54963R(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.C18868t1.C18870b<K, V> r9, androidx.datastore.preferences.protobuf.C18836p0 r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.mo55581Z(r0)
            androidx.datastore.preferences.protobuf.w r1 = r7.f48120c
            int r1 = r1.mo55499Z()
            androidx.datastore.preferences.protobuf.w r2 = r7.f48120c
            int r1 = r2.mo55520t(r1)
            K r2 = r9.f48042b
            V r3 = r9.f48044d
        L_0x0014:
            int r4 = r7.mo55015z()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            androidx.datastore.preferences.protobuf.w r5 = r7.f48120c     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.mo55514i()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.mo54950E()     // Catch:{ InvalidWireTypeException -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004f }
            r4.<init>((java.lang.String) r6)     // Catch:{ InvalidWireTypeException -> 0x004f }
            throw r4     // Catch:{ InvalidWireTypeException -> 0x004f }
        L_0x003a:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f48043c     // Catch:{ InvalidWireTypeException -> 0x004f }
            V r5 = r9.f48044d     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Object r3 = r7.mo55576U(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x0047:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f48041a     // Catch:{ InvalidWireTypeException -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.mo55576U(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.mo54950E()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0065 }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            androidx.datastore.preferences.protobuf.w r8 = r7.f48120c
            r8.mo55519s(r1)
            return
        L_0x0065:
            r8 = move-exception
            androidx.datastore.preferences.protobuf.w r9 = r7.f48120c
            r9.mo55519s(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18901x.mo54963R(java.util.Map, androidx.datastore.preferences.protobuf.t1$b, androidx.datastore.preferences.protobuf.p0):void");
    }

    /* renamed from: S */
    public <T> void mo54964S(List<T> list, C18905x2<T> x2Var, C18836p0 p0Var) throws IOException {
        int Y;
        if (WireFormat.m85345b(this.f48121d) == 3) {
            int i = this.f48121d;
            do {
                list.add(mo55577V(x2Var, p0Var));
                if (!this.f48120c.mo55514i() && this.f48123f == 0) {
                    Y = this.f48120c.mo55498Y();
                } else {
                    return;
                }
            } while (Y == i);
            this.f48123f = Y;
            return;
        }
        throw InvalidProtocolBufferException.m85088e();
    }

    /* renamed from: U */
    public final Object mo55576U(WireFormat.FieldType fieldType, Class<?> cls, C18836p0 p0Var) throws IOException {
        switch (C18902a.f48124a[fieldType.ordinal()]) {
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

    /* renamed from: V */
    public final <T> T mo55577V(C18905x2<T> x2Var, C18836p0 p0Var) throws IOException {
        int i = this.f48122e;
        this.f48122e = WireFormat.m85346c(WireFormat.m85344a(this.f48121d), 4);
        try {
            T e = x2Var.mo54451e();
            x2Var.mo54457h(e, this, p0Var);
            x2Var.mo54446b(e);
            if (this.f48121d == this.f48122e) {
                return e;
            }
            throw InvalidProtocolBufferException.m85091h();
        } finally {
            this.f48122e = i;
        }
    }

    /* renamed from: W */
    public final <T> T mo55578W(C18905x2<T> x2Var, C18836p0 p0Var) throws IOException {
        int Z = this.f48120c.mo55499Z();
        C18889w wVar = this.f48120c;
        if (wVar.f48055a < wVar.f48056b) {
            int t = wVar.mo55520t(Z);
            T e = x2Var.mo54451e();
            this.f48120c.f48055a++;
            x2Var.mo54457h(e, this, p0Var);
            x2Var.mo54446b(e);
            this.f48120c.mo55500a(0);
            C18889w wVar2 = this.f48120c;
            wVar2.f48055a--;
            wVar2.mo55519s(t);
            return e;
        }
        throw InvalidProtocolBufferException.m85092i();
    }

    /* renamed from: X */
    public void mo55579X(List<String> list, boolean z) throws IOException {
        String str;
        int Y;
        int Y2;
        if (WireFormat.m85345b(this.f48121d) != 2) {
            throw InvalidProtocolBufferException.m85088e();
        } else if (!(list instanceof C18818n1) || z) {
            do {
                if (z) {
                    str = mo54955J();
                } else {
                    str = mo55014y();
                }
                list.add(str);
                if (!this.f48120c.mo55514i()) {
                    Y = this.f48120c.mo55498Y();
                } else {
                    return;
                }
            } while (Y == this.f48121d);
            this.f48123f = Y;
        } else {
            C18818n1 n1Var = (C18818n1) list;
            do {
                n1Var.mo55022N2(mo54996n());
                if (!this.f48120c.mo55514i()) {
                    Y2 = this.f48120c.mo55498Y();
                } else {
                    return;
                }
            } while (Y2 == this.f48121d);
            this.f48123f = Y2;
        }
    }

    /* renamed from: Y */
    public final void mo55580Y(int i) throws IOException {
        if (this.f48120c.mo55512h() != i) {
            throw InvalidProtocolBufferException.m85094l();
        }
    }

    /* renamed from: Z */
    public final void mo55581Z(int i) throws IOException {
        if (WireFormat.m85345b(this.f48121d) != i) {
            throw InvalidProtocolBufferException.m85088e();
        }
    }

    /* renamed from: a */
    public long mo54970a() throws IOException {
        mo55581Z(1);
        return this.f48120c.mo55477B();
    }

    /* renamed from: a0 */
    public final void mo55582a0(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.m85091h();
        }
    }

    /* renamed from: b */
    public void mo54972b(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C18744h1) {
            C18744h1 h1Var = (C18744h1) list;
            int b = WireFormat.m85345b(this.f48121d);
            if (b == 2) {
                int Z = this.f48120c.mo55499Z();
                mo55582a0(Z);
                int h = this.f48120c.mo55512h() + Z;
                do {
                    h1Var.mo54629V(this.f48120c.mo55492S());
                } while (this.f48120c.mo55512h() < h);
            } else if (b == 5) {
                do {
                    h1Var.mo54629V(this.f48120c.mo55492S());
                    if (!this.f48120c.mo55514i()) {
                        Y2 = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f48121d);
                this.f48123f = Y2;
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        } else {
            int b2 = WireFormat.m85345b(this.f48121d);
            if (b2 == 2) {
                int Z2 = this.f48120c.mo55499Z();
                mo55582a0(Z2);
                int h2 = this.f48120c.mo55512h() + Z2;
                do {
                    list.add(Integer.valueOf(this.f48120c.mo55492S()));
                } while (this.f48120c.mo55512h() < h2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f48120c.mo55492S()));
                    if (!this.f48120c.mo55514i()) {
                        Y = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y == this.f48121d);
                this.f48123f = Y;
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: b0 */
    public final void mo55583b0(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.m85091h();
        }
    }

    /* renamed from: c */
    public void mo54974c(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C18852r1) {
            C18852r1 r1Var = (C18852r1) list;
            int b = WireFormat.m85345b(this.f48121d);
            if (b == 0) {
                do {
                    r1Var.mo54835Z(this.f48120c.mo55495V());
                    if (!this.f48120c.mo55514i()) {
                        Y2 = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f48121d);
                this.f48123f = Y2;
            } else if (b == 2) {
                int h = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    r1Var.mo54835Z(this.f48120c.mo55495V());
                } while (this.f48120c.mo55512h() < h);
                mo55580Y(h);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        } else {
            int b2 = WireFormat.m85345b(this.f48121d);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f48120c.mo55495V()));
                    if (!this.f48120c.mo55514i()) {
                        Y = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y == this.f48121d);
                this.f48123f = Y;
            } else if (b2 == 2) {
                int h2 = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    list.add(Long.valueOf(this.f48120c.mo55495V()));
                } while (this.f48120c.mo55512h() < h2);
                mo55580Y(h2);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: d */
    public boolean mo54976d() throws IOException {
        mo55581Z(0);
        return this.f48120c.mo55521u();
    }

    /* renamed from: e */
    public long mo54978e() throws IOException {
        mo55581Z(1);
        return this.f48120c.mo55493T();
    }

    /* renamed from: f */
    public void mo54980f(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C18852r1) {
            C18852r1 r1Var = (C18852r1) list;
            int b = WireFormat.m85345b(this.f48121d);
            if (b == 0) {
                do {
                    r1Var.mo54835Z(this.f48120c.mo55501a0());
                    if (!this.f48120c.mo55514i()) {
                        Y2 = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f48121d);
                this.f48123f = Y2;
            } else if (b == 2) {
                int h = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    r1Var.mo54835Z(this.f48120c.mo55501a0());
                } while (this.f48120c.mo55512h() < h);
                mo55580Y(h);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        } else {
            int b2 = WireFormat.m85345b(this.f48121d);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f48120c.mo55501a0()));
                    if (!this.f48120c.mo55514i()) {
                        Y = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y == this.f48121d);
                this.f48123f = Y;
            } else if (b2 == 2) {
                int h2 = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    list.add(Long.valueOf(this.f48120c.mo55501a0()));
                } while (this.f48120c.mo55512h() < h2);
                mo55580Y(h2);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: g */
    public int mo54982g() throws IOException {
        mo55581Z(0);
        return this.f48120c.mo55499Z();
    }

    /* renamed from: h */
    public void mo54984h(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C18852r1) {
            C18852r1 r1Var = (C18852r1) list;
            int b = WireFormat.m85345b(this.f48121d);
            if (b == 0) {
                do {
                    r1Var.mo54835Z(this.f48120c.mo55482G());
                    if (!this.f48120c.mo55514i()) {
                        Y2 = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f48121d);
                this.f48123f = Y2;
            } else if (b == 2) {
                int h = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    r1Var.mo54835Z(this.f48120c.mo55482G());
                } while (this.f48120c.mo55512h() < h);
                mo55580Y(h);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        } else {
            int b2 = WireFormat.m85345b(this.f48121d);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f48120c.mo55482G()));
                    if (!this.f48120c.mo55514i()) {
                        Y = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y == this.f48121d);
                this.f48123f = Y;
            } else if (b2 == 2) {
                int h2 = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    list.add(Long.valueOf(this.f48120c.mo55482G()));
                } while (this.f48120c.mo55512h() < h2);
                mo55580Y(h2);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: i */
    public void mo54986i(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C18744h1) {
            C18744h1 h1Var = (C18744h1) list;
            int b = WireFormat.m85345b(this.f48121d);
            if (b == 0) {
                do {
                    h1Var.mo54629V(this.f48120c.mo55526z());
                    if (!this.f48120c.mo55514i()) {
                        Y2 = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f48121d);
                this.f48123f = Y2;
            } else if (b == 2) {
                int h = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    h1Var.mo54629V(this.f48120c.mo55526z());
                } while (this.f48120c.mo55512h() < h);
                mo55580Y(h);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        } else {
            int b2 = WireFormat.m85345b(this.f48121d);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f48120c.mo55526z()));
                    if (!this.f48120c.mo55514i()) {
                        Y = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y == this.f48121d);
                this.f48123f = Y;
            } else if (b2 == 2) {
                int h2 = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    list.add(Integer.valueOf(this.f48120c.mo55526z()));
                } while (this.f48120c.mo55512h() < h2);
                mo55580Y(h2);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: j */
    public int mo54988j() throws IOException {
        mo55581Z(0);
        return this.f48120c.mo55526z();
    }

    /* renamed from: k */
    public int mo54990k() throws IOException {
        mo55581Z(0);
        return this.f48120c.mo55494U();
    }

    /* renamed from: l */
    public void mo54992l(List<Boolean> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C18843q) {
            C18843q qVar = (C18843q) list;
            int b = WireFormat.m85345b(this.f48121d);
            if (b == 0) {
                do {
                    qVar.mo54823N(this.f48120c.mo55521u());
                    if (!this.f48120c.mo55514i()) {
                        Y2 = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f48121d);
                this.f48123f = Y2;
            } else if (b == 2) {
                int h = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    qVar.mo54823N(this.f48120c.mo55521u());
                } while (this.f48120c.mo55512h() < h);
                mo55580Y(h);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        } else {
            int b2 = WireFormat.m85345b(this.f48121d);
            if (b2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f48120c.mo55521u()));
                    if (!this.f48120c.mo55514i()) {
                        Y = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y == this.f48121d);
                this.f48123f = Y;
            } else if (b2 == 2) {
                int h2 = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    list.add(Boolean.valueOf(this.f48120c.mo55521u()));
                } while (this.f48120c.mo55512h() < h2);
                mo55580Y(h2);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: m */
    public void mo54994m(List<String> list) throws IOException {
        mo55579X(list, true);
    }

    /* renamed from: n */
    public ByteString mo54996n() throws IOException {
        mo55581Z(2);
        return this.f48120c.mo55524x();
    }

    /* renamed from: o */
    public int mo54998o() throws IOException {
        mo55581Z(0);
        return this.f48120c.mo55481F();
    }

    /* renamed from: p */
    public void mo55000p(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C18852r1) {
            C18852r1 r1Var = (C18852r1) list;
            int b = WireFormat.m85345b(this.f48121d);
            if (b == 1) {
                do {
                    r1Var.mo54835Z(this.f48120c.mo55477B());
                    if (!this.f48120c.mo55514i()) {
                        Y2 = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f48121d);
                this.f48123f = Y2;
            } else if (b == 2) {
                int Z = this.f48120c.mo55499Z();
                mo55583b0(Z);
                int h = this.f48120c.mo55512h() + Z;
                do {
                    r1Var.mo54835Z(this.f48120c.mo55477B());
                } while (this.f48120c.mo55512h() < h);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        } else {
            int b2 = WireFormat.m85345b(this.f48121d);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f48120c.mo55477B()));
                    if (!this.f48120c.mo55514i()) {
                        Y = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y == this.f48121d);
                this.f48123f = Y;
            } else if (b2 == 2) {
                int Z2 = this.f48120c.mo55499Z();
                mo55583b0(Z2);
                int h2 = this.f48120c.mo55512h() + Z2;
                do {
                    list.add(Long.valueOf(this.f48120c.mo55477B()));
                } while (this.f48120c.mo55512h() < h2);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: q */
    public void mo55002q(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C18744h1) {
            C18744h1 h1Var = (C18744h1) list;
            int b = WireFormat.m85345b(this.f48121d);
            if (b == 0) {
                do {
                    h1Var.mo54629V(this.f48120c.mo55494U());
                    if (!this.f48120c.mo55514i()) {
                        Y2 = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f48121d);
                this.f48123f = Y2;
            } else if (b == 2) {
                int h = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    h1Var.mo54629V(this.f48120c.mo55494U());
                } while (this.f48120c.mo55512h() < h);
                mo55580Y(h);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        } else {
            int b2 = WireFormat.m85345b(this.f48121d);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f48120c.mo55494U()));
                    if (!this.f48120c.mo55514i()) {
                        Y = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y == this.f48121d);
                this.f48123f = Y;
            } else if (b2 == 2) {
                int h2 = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    list.add(Integer.valueOf(this.f48120c.mo55494U()));
                } while (this.f48120c.mo55512h() < h2);
                mo55580Y(h2);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: r */
    public long mo55004r() throws IOException {
        mo55581Z(0);
        return this.f48120c.mo55501a0();
    }

    public double readDouble() throws IOException {
        mo55581Z(1);
        return this.f48120c.mo55525y();
    }

    public float readFloat() throws IOException {
        mo55581Z(5);
        return this.f48120c.mo55478C();
    }

    /* renamed from: s */
    public void mo55008s(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C18744h1) {
            C18744h1 h1Var = (C18744h1) list;
            int b = WireFormat.m85345b(this.f48121d);
            if (b == 0) {
                do {
                    h1Var.mo54629V(this.f48120c.mo55499Z());
                    if (!this.f48120c.mo55514i()) {
                        Y2 = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f48121d);
                this.f48123f = Y2;
            } else if (b == 2) {
                int h = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    h1Var.mo54629V(this.f48120c.mo55499Z());
                } while (this.f48120c.mo55512h() < h);
                mo55580Y(h);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        } else {
            int b2 = WireFormat.m85345b(this.f48121d);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f48120c.mo55499Z()));
                    if (!this.f48120c.mo55514i()) {
                        Y = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y == this.f48121d);
                this.f48123f = Y;
            } else if (b2 == 2) {
                int h2 = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    list.add(Integer.valueOf(this.f48120c.mo55499Z()));
                } while (this.f48120c.mo55512h() < h2);
                mo55580Y(h2);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: t */
    public int mo55009t() throws IOException {
        mo55581Z(5);
        return this.f48120c.mo55476A();
    }

    /* renamed from: u */
    public void mo55010u(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C18852r1) {
            C18852r1 r1Var = (C18852r1) list;
            int b = WireFormat.m85345b(this.f48121d);
            if (b == 1) {
                do {
                    r1Var.mo54835Z(this.f48120c.mo55493T());
                    if (!this.f48120c.mo55514i()) {
                        Y2 = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f48121d);
                this.f48123f = Y2;
            } else if (b == 2) {
                int Z = this.f48120c.mo55499Z();
                mo55583b0(Z);
                int h = this.f48120c.mo55512h() + Z;
                do {
                    r1Var.mo54835Z(this.f48120c.mo55493T());
                } while (this.f48120c.mo55512h() < h);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        } else {
            int b2 = WireFormat.m85345b(this.f48121d);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f48120c.mo55493T()));
                    if (!this.f48120c.mo55514i()) {
                        Y = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y == this.f48121d);
                this.f48123f = Y;
            } else if (b2 == 2) {
                int Z2 = this.f48120c.mo55499Z();
                mo55583b0(Z2);
                int h2 = this.f48120c.mo55512h() + Z2;
                do {
                    list.add(Long.valueOf(this.f48120c.mo55493T()));
                } while (this.f48120c.mo55512h() < h2);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: v */
    public void mo55011v(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C18744h1) {
            C18744h1 h1Var = (C18744h1) list;
            int b = WireFormat.m85345b(this.f48121d);
            if (b == 0) {
                do {
                    h1Var.mo54629V(this.f48120c.mo55481F());
                    if (!this.f48120c.mo55514i()) {
                        Y2 = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f48121d);
                this.f48123f = Y2;
            } else if (b == 2) {
                int h = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    h1Var.mo54629V(this.f48120c.mo55481F());
                } while (this.f48120c.mo55512h() < h);
                mo55580Y(h);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        } else {
            int b2 = WireFormat.m85345b(this.f48121d);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f48120c.mo55481F()));
                    if (!this.f48120c.mo55514i()) {
                        Y = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y == this.f48121d);
                this.f48123f = Y;
            } else if (b2 == 2) {
                int h2 = this.f48120c.mo55512h() + this.f48120c.mo55499Z();
                do {
                    list.add(Integer.valueOf(this.f48120c.mo55481F()));
                } while (this.f48120c.mo55512h() < h2);
                mo55580Y(h2);
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: w */
    public void mo55012w(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C18744h1) {
            C18744h1 h1Var = (C18744h1) list;
            int b = WireFormat.m85345b(this.f48121d);
            if (b == 2) {
                int Z = this.f48120c.mo55499Z();
                mo55582a0(Z);
                int h = this.f48120c.mo55512h() + Z;
                do {
                    h1Var.mo54629V(this.f48120c.mo55476A());
                } while (this.f48120c.mo55512h() < h);
            } else if (b == 5) {
                do {
                    h1Var.mo54629V(this.f48120c.mo55476A());
                    if (!this.f48120c.mo55514i()) {
                        Y2 = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f48121d);
                this.f48123f = Y2;
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        } else {
            int b2 = WireFormat.m85345b(this.f48121d);
            if (b2 == 2) {
                int Z2 = this.f48120c.mo55499Z();
                mo55582a0(Z2);
                int h2 = this.f48120c.mo55512h() + Z2;
                do {
                    list.add(Integer.valueOf(this.f48120c.mo55476A()));
                } while (this.f48120c.mo55512h() < h2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f48120c.mo55476A()));
                    if (!this.f48120c.mo55514i()) {
                        Y = this.f48120c.mo55498Y();
                    } else {
                        return;
                    }
                } while (Y == this.f48121d);
                this.f48123f = Y;
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: x */
    public long mo55013x() throws IOException {
        mo55581Z(0);
        return this.f48120c.mo55495V();
    }

    /* renamed from: y */
    public String mo55014y() throws IOException {
        mo55581Z(2);
        return this.f48120c.mo55496W();
    }

    /* renamed from: z */
    public int mo55015z() throws IOException {
        int i = this.f48123f;
        if (i != 0) {
            this.f48121d = i;
            this.f48123f = 0;
        } else {
            this.f48121d = this.f48120c.mo55498Y();
        }
        int i2 = this.f48121d;
        if (i2 == 0 || i2 == this.f48122e) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.m85344a(i2);
    }
}
