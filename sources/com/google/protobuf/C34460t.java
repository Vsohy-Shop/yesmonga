package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.protobuf.t */
public final class C34460t implements C34366f2 {

    /* renamed from: g */
    public static final int f83513g = 3;

    /* renamed from: h */
    public static final int f83514h = 7;

    /* renamed from: i */
    public static final int f83515i = 0;

    /* renamed from: c */
    public final C34448s f83516c;

    /* renamed from: d */
    public int f83517d;

    /* renamed from: e */
    public int f83518e;

    /* renamed from: f */
    public int f83519f = 0;

    /* renamed from: com.google.protobuf.t$a */
    public static /* synthetic */ class C34461a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83520a;

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
                f83520a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f83520a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34460t.C34461a.<clinit>():void");
        }
    }

    public C34460t(C34448s sVar) {
        C34448s sVar2 = (C34448s) C34471v0.m140574e(sVar, "input");
        this.f83516c = sVar2;
        sVar2.f83464d = this;
    }

    /* renamed from: T */
    public static C34460t m140434T(C34448s sVar) {
        C34460t tVar = sVar.f83464d;
        if (tVar != null) {
            return tVar;
        }
        return new C34460t(sVar);
    }

    /* renamed from: A */
    public void mo101053A(List<String> list) throws IOException {
        mo101590X(list, false);
    }

    /* renamed from: B */
    public int mo101054B() {
        return this.f83517d;
    }

    /* renamed from: C */
    public void mo101055C(List<Float> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C34433p0) {
            C34433p0 p0Var = (C34433p0) list;
            int b = WireFormat.m138722b(this.f83517d);
            if (b == 2) {
                int Z = this.f83516c.mo101526Z();
                mo101593a0(Z);
                int h = this.f83516c.mo101539h() + Z;
                do {
                    p0Var.mo101474G(this.f83516c.mo101505C());
                } while (this.f83516c.mo101539h() < h);
            } else if (b == 5) {
                do {
                    p0Var.mo101474G(this.f83516c.mo101505C());
                    if (!this.f83516c.mo101541i()) {
                        Y2 = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f83517d);
                this.f83519f = Y2;
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        } else {
            int b2 = WireFormat.m138722b(this.f83517d);
            if (b2 == 2) {
                int Z2 = this.f83516c.mo101526Z();
                mo101593a0(Z2);
                int h2 = this.f83516c.mo101539h() + Z2;
                do {
                    list.add(Float.valueOf(this.f83516c.mo101505C()));
                } while (this.f83516c.mo101539h() < h2);
            } else if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.f83516c.mo101505C()));
                    if (!this.f83516c.mo101541i()) {
                        Y = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y == this.f83517d);
                this.f83519f = Y;
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: D */
    public boolean mo101056D() {
        return this.f83516c.mo101536f0();
    }

    /* renamed from: E */
    public boolean mo101057E() throws IOException {
        int i;
        if (this.f83516c.mo101541i() || (i = this.f83517d) == this.f83518e) {
            return false;
        }
        return this.f83516c.mo101538g0(i);
    }

    /* renamed from: F */
    public int mo101058F() throws IOException {
        mo101592Z(5);
        return this.f83516c.mo101519S();
    }

    /* renamed from: G */
    public void mo101059G(List<ByteString> list) throws IOException {
        int Y;
        if (WireFormat.m138722b(this.f83517d) == 2) {
            do {
                list.add(mo101085n());
                if (!this.f83516c.mo101541i()) {
                    Y = this.f83516c.mo101525Y();
                } else {
                    return;
                }
            } while (Y == this.f83517d);
            this.f83519f = Y;
            return;
        }
        throw InvalidProtocolBufferException.m138416f();
    }

    /* renamed from: H */
    public void mo101060H(List<Double> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C34470v) {
            C34470v vVar = (C34470v) list;
            int b = WireFormat.m138722b(this.f83517d);
            if (b == 1) {
                do {
                    vVar.mo101622c0(this.f83516c.mo101552y());
                    if (!this.f83516c.mo101541i()) {
                        Y2 = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f83517d);
                this.f83519f = Y2;
            } else if (b == 2) {
                int Z = this.f83516c.mo101526Z();
                mo101594b0(Z);
                int h = this.f83516c.mo101539h() + Z;
                do {
                    vVar.mo101622c0(this.f83516c.mo101552y());
                } while (this.f83516c.mo101539h() < h);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        } else {
            int b2 = WireFormat.m138722b(this.f83517d);
            if (b2 == 1) {
                do {
                    list.add(Double.valueOf(this.f83516c.mo101552y()));
                    if (!this.f83516c.mo101541i()) {
                        Y = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y == this.f83517d);
                this.f83519f = Y;
            } else if (b2 == 2) {
                int Z2 = this.f83516c.mo101526Z();
                mo101594b0(Z2);
                int h2 = this.f83516c.mo101539h() + Z2;
                do {
                    list.add(Double.valueOf(this.f83516c.mo101552y()));
                } while (this.f83516c.mo101539h() < h2);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: I */
    public long mo101061I() throws IOException {
        mo101592Z(0);
        return this.f83516c.mo101509G();
    }

    /* renamed from: J */
    public String mo101062J() throws IOException {
        mo101592Z(2);
        return this.f83516c.mo101524X();
    }

    /* renamed from: K */
    public <T> void mo101063K(List<T> list, C34372g2<T> g2Var, C34368g0 g0Var) throws IOException {
        int Y;
        if (WireFormat.m138722b(this.f83517d) == 3) {
            int i = this.f83517d;
            do {
                list.add(mo101588V(g2Var, g0Var));
                if (!this.f83516c.mo101541i() && this.f83519f == 0) {
                    Y = this.f83516c.mo101525Y();
                } else {
                    return;
                }
            } while (Y == i);
            this.f83519f = Y;
            return;
        }
        throw InvalidProtocolBufferException.m138416f();
    }

    /* renamed from: L */
    public <T> void mo101064L(List<T> list, C34372g2<T> g2Var, C34368g0 g0Var) throws IOException {
        int Y;
        if (WireFormat.m138722b(this.f83517d) == 2) {
            int i = this.f83517d;
            do {
                list.add(mo101589W(g2Var, g0Var));
                if (!this.f83516c.mo101541i() && this.f83519f == 0) {
                    Y = this.f83516c.mo101525Y();
                } else {
                    return;
                }
            } while (Y == i);
            this.f83519f = Y;
            return;
        }
        throw InvalidProtocolBufferException.m138416f();
    }

    /* renamed from: M */
    public <T> T mo101065M(Class<T> cls, C34368g0 g0Var) throws IOException {
        mo101592Z(3);
        return mo101588V(C34325a2.m138828a().mo100881i(cls), g0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (mo101057E() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new com.google.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void mo101066N(java.util.Map<K, V> r8, com.google.protobuf.C34363f1.C34365b<K, V> r9, com.google.protobuf.C34368g0 r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.mo101592Z(r0)
            com.google.protobuf.s r1 = r7.f83516c
            int r1 = r1.mo101526Z()
            com.google.protobuf.s r2 = r7.f83516c
            int r1 = r2.mo101547t(r1)
            K r2 = r9.f83269b
            V r3 = r9.f83271d
        L_0x0014:
            int r4 = r7.mo101099z()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            com.google.protobuf.s r5 = r7.f83516c     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.mo101541i()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.mo101057E()     // Catch:{ InvalidWireTypeException -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004f }
            r4.<init>((java.lang.String) r6)     // Catch:{ InvalidWireTypeException -> 0x004f }
            throw r4     // Catch:{ InvalidWireTypeException -> 0x004f }
        L_0x003a:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f83270c     // Catch:{ InvalidWireTypeException -> 0x004f }
            V r5 = r9.f83271d     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Object r3 = r7.mo101587U(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x0047:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f83268a     // Catch:{ InvalidWireTypeException -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.mo101587U(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.mo101057E()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0065 }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            com.google.protobuf.s r8 = r7.f83516c
            r8.mo101546s(r1)
            return
        L_0x0065:
            r8 = move-exception
            com.google.protobuf.s r9 = r7.f83516c
            r9.mo101546s(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34460t.mo101066N(java.util.Map, com.google.protobuf.f1$b, com.google.protobuf.g0):void");
    }

    /* renamed from: O */
    public <T> T mo101067O(Class<T> cls, C34368g0 g0Var) throws IOException {
        mo101592Z(2);
        return mo101589W(C34325a2.m138828a().mo100881i(cls), g0Var);
    }

    /* renamed from: P */
    public <T> void mo101068P(List<T> list, Class<T> cls, C34368g0 g0Var) throws IOException {
        mo101063K(list, C34325a2.m138828a().mo100881i(cls), g0Var);
    }

    /* renamed from: Q */
    public <T> T mo101069Q(C34372g2<T> g2Var, C34368g0 g0Var) throws IOException {
        mo101592Z(3);
        return mo101588V(g2Var, g0Var);
    }

    /* renamed from: R */
    public <T> void mo101070R(List<T> list, Class<T> cls, C34368g0 g0Var) throws IOException {
        mo101064L(list, C34325a2.m138828a().mo100881i(cls), g0Var);
    }

    /* renamed from: S */
    public <T> T mo101071S(C34372g2<T> g2Var, C34368g0 g0Var) throws IOException {
        mo101592Z(2);
        return mo101589W(g2Var, g0Var);
    }

    /* renamed from: U */
    public final Object mo101587U(WireFormat.FieldType fieldType, Class<?> cls, C34368g0 g0Var) throws IOException {
        switch (C34461a.f83520a[fieldType.ordinal()]) {
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

    /* renamed from: V */
    public final <T> T mo101588V(C34372g2<T> g2Var, C34368g0 g0Var) throws IOException {
        int i = this.f83518e;
        this.f83518e = WireFormat.m138723c(WireFormat.m138721a(this.f83517d), 4);
        try {
            T e = g2Var.mo101118e();
            g2Var.mo101122i(e, this, g0Var);
            g2Var.mo101115b(e);
            if (this.f83517d == this.f83518e) {
                return e;
            }
            throw InvalidProtocolBufferException.m138419i();
        } finally {
            this.f83518e = i;
        }
    }

    /* renamed from: W */
    public final <T> T mo101589W(C34372g2<T> g2Var, C34368g0 g0Var) throws IOException {
        int Z = this.f83516c.mo101526Z();
        C34448s sVar = this.f83516c;
        if (sVar.f83461a < sVar.f83462b) {
            int t = sVar.mo101547t(Z);
            T e = g2Var.mo101118e();
            this.f83516c.f83461a++;
            g2Var.mo101122i(e, this, g0Var);
            g2Var.mo101115b(e);
            this.f83516c.mo101527a(0);
            C34448s sVar2 = this.f83516c;
            sVar2.f83461a--;
            sVar2.mo101546s(t);
            return e;
        }
        throw InvalidProtocolBufferException.m138420j();
    }

    /* renamed from: X */
    public void mo101590X(List<String> list, boolean z) throws IOException {
        String str;
        int Y;
        int Y2;
        if (WireFormat.m138722b(this.f83517d) != 2) {
            throw InvalidProtocolBufferException.m138416f();
        } else if (!(list instanceof C34324a1) || z) {
            do {
                if (z) {
                    str = mo101062J();
                } else {
                    str = mo101098y();
                }
                list.add(str);
                if (!this.f83516c.mo101541i()) {
                    Y = this.f83516c.mo101525Y();
                } else {
                    return;
                }
            } while (Y == this.f83517d);
            this.f83519f = Y;
        } else {
            C34324a1 a1Var = (C34324a1) list;
            do {
                a1Var.mo100861D0(mo101085n());
                if (!this.f83516c.mo101541i()) {
                    Y2 = this.f83516c.mo101525Y();
                } else {
                    return;
                }
            } while (Y2 == this.f83517d);
            this.f83519f = Y2;
        }
    }

    /* renamed from: Y */
    public final void mo101591Y(int i) throws IOException {
        if (this.f83516c.mo101539h() != i) {
            throw InvalidProtocolBufferException.m138422n();
        }
    }

    /* renamed from: Z */
    public final void mo101592Z(int i) throws IOException {
        if (WireFormat.m138722b(this.f83517d) != i) {
            throw InvalidProtocolBufferException.m138416f();
        }
    }

    /* renamed from: a */
    public long mo101072a() throws IOException {
        mo101592Z(1);
        return this.f83516c.mo101504B();
    }

    /* renamed from: a0 */
    public final void mo101593a0(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.m138419i();
        }
    }

    /* renamed from: b */
    public void mo101073b(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C34467u0) {
            C34467u0 u0Var = (C34467u0) list;
            int b = WireFormat.m138722b(this.f83517d);
            if (b == 2) {
                int Z = this.f83516c.mo101526Z();
                mo101593a0(Z);
                int h = this.f83516c.mo101539h() + Z;
                do {
                    u0Var.mo101605V(this.f83516c.mo101519S());
                } while (this.f83516c.mo101539h() < h);
            } else if (b == 5) {
                do {
                    u0Var.mo101605V(this.f83516c.mo101519S());
                    if (!this.f83516c.mo101541i()) {
                        Y2 = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f83517d);
                this.f83519f = Y2;
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        } else {
            int b2 = WireFormat.m138722b(this.f83517d);
            if (b2 == 2) {
                int Z2 = this.f83516c.mo101526Z();
                mo101593a0(Z2);
                int h2 = this.f83516c.mo101539h() + Z2;
                do {
                    list.add(Integer.valueOf(this.f83516c.mo101519S()));
                } while (this.f83516c.mo101539h() < h2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f83516c.mo101519S()));
                    if (!this.f83516c.mo101541i()) {
                        Y = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y == this.f83517d);
                this.f83519f = Y;
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: b0 */
    public final void mo101594b0(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.m138419i();
        }
    }

    /* renamed from: c */
    public void mo101074c(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C34351d1) {
            C34351d1 d1Var = (C34351d1) list;
            int b = WireFormat.m138722b(this.f83517d);
            if (b == 0) {
                do {
                    d1Var.mo101024Z(this.f83516c.mo101522V());
                    if (!this.f83516c.mo101541i()) {
                        Y2 = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f83517d);
                this.f83519f = Y2;
            } else if (b == 2) {
                int h = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    d1Var.mo101024Z(this.f83516c.mo101522V());
                } while (this.f83516c.mo101539h() < h);
                mo101591Y(h);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        } else {
            int b2 = WireFormat.m138722b(this.f83517d);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f83516c.mo101522V()));
                    if (!this.f83516c.mo101541i()) {
                        Y = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y == this.f83517d);
                this.f83519f = Y;
            } else if (b2 == 2) {
                int h2 = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    list.add(Long.valueOf(this.f83516c.mo101522V()));
                } while (this.f83516c.mo101539h() < h2);
                mo101591Y(h2);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: d */
    public boolean mo101075d() throws IOException {
        mo101592Z(0);
        return this.f83516c.mo101548u();
    }

    /* renamed from: e */
    public long mo101076e() throws IOException {
        mo101592Z(1);
        return this.f83516c.mo101520T();
    }

    /* renamed from: f */
    public void mo101077f(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C34351d1) {
            C34351d1 d1Var = (C34351d1) list;
            int b = WireFormat.m138722b(this.f83517d);
            if (b == 0) {
                do {
                    d1Var.mo101024Z(this.f83516c.mo101528a0());
                    if (!this.f83516c.mo101541i()) {
                        Y2 = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f83517d);
                this.f83519f = Y2;
            } else if (b == 2) {
                int h = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    d1Var.mo101024Z(this.f83516c.mo101528a0());
                } while (this.f83516c.mo101539h() < h);
                mo101591Y(h);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        } else {
            int b2 = WireFormat.m138722b(this.f83517d);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f83516c.mo101528a0()));
                    if (!this.f83516c.mo101541i()) {
                        Y = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y == this.f83517d);
                this.f83519f = Y;
            } else if (b2 == 2) {
                int h2 = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    list.add(Long.valueOf(this.f83516c.mo101528a0()));
                } while (this.f83516c.mo101539h() < h2);
                mo101591Y(h2);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: g */
    public int mo101078g() throws IOException {
        mo101592Z(0);
        return this.f83516c.mo101526Z();
    }

    /* renamed from: h */
    public void mo101079h(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C34351d1) {
            C34351d1 d1Var = (C34351d1) list;
            int b = WireFormat.m138722b(this.f83517d);
            if (b == 0) {
                do {
                    d1Var.mo101024Z(this.f83516c.mo101509G());
                    if (!this.f83516c.mo101541i()) {
                        Y2 = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f83517d);
                this.f83519f = Y2;
            } else if (b == 2) {
                int h = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    d1Var.mo101024Z(this.f83516c.mo101509G());
                } while (this.f83516c.mo101539h() < h);
                mo101591Y(h);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        } else {
            int b2 = WireFormat.m138722b(this.f83517d);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f83516c.mo101509G()));
                    if (!this.f83516c.mo101541i()) {
                        Y = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y == this.f83517d);
                this.f83519f = Y;
            } else if (b2 == 2) {
                int h2 = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    list.add(Long.valueOf(this.f83516c.mo101509G()));
                } while (this.f83516c.mo101539h() < h2);
                mo101591Y(h2);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: i */
    public void mo101080i(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C34467u0) {
            C34467u0 u0Var = (C34467u0) list;
            int b = WireFormat.m138722b(this.f83517d);
            if (b == 0) {
                do {
                    u0Var.mo101605V(this.f83516c.mo101553z());
                    if (!this.f83516c.mo101541i()) {
                        Y2 = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f83517d);
                this.f83519f = Y2;
            } else if (b == 2) {
                int h = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    u0Var.mo101605V(this.f83516c.mo101553z());
                } while (this.f83516c.mo101539h() < h);
                mo101591Y(h);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        } else {
            int b2 = WireFormat.m138722b(this.f83517d);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f83516c.mo101553z()));
                    if (!this.f83516c.mo101541i()) {
                        Y = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y == this.f83517d);
                this.f83519f = Y;
            } else if (b2 == 2) {
                int h2 = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    list.add(Integer.valueOf(this.f83516c.mo101553z()));
                } while (this.f83516c.mo101539h() < h2);
                mo101591Y(h2);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: j */
    public int mo101081j() throws IOException {
        mo101592Z(0);
        return this.f83516c.mo101553z();
    }

    /* renamed from: k */
    public int mo101082k() throws IOException {
        mo101592Z(0);
        return this.f83516c.mo101521U();
    }

    /* renamed from: l */
    public void mo101083l(List<Boolean> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C34419n) {
            C34419n nVar = (C34419n) list;
            int b = WireFormat.m138722b(this.f83517d);
            if (b == 0) {
                do {
                    nVar.mo101365N(this.f83516c.mo101548u());
                    if (!this.f83516c.mo101541i()) {
                        Y2 = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f83517d);
                this.f83519f = Y2;
            } else if (b == 2) {
                int h = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    nVar.mo101365N(this.f83516c.mo101548u());
                } while (this.f83516c.mo101539h() < h);
                mo101591Y(h);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        } else {
            int b2 = WireFormat.m138722b(this.f83517d);
            if (b2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f83516c.mo101548u()));
                    if (!this.f83516c.mo101541i()) {
                        Y = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y == this.f83517d);
                this.f83519f = Y;
            } else if (b2 == 2) {
                int h2 = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    list.add(Boolean.valueOf(this.f83516c.mo101548u()));
                } while (this.f83516c.mo101539h() < h2);
                mo101591Y(h2);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: m */
    public void mo101084m(List<String> list) throws IOException {
        mo101590X(list, true);
    }

    /* renamed from: n */
    public ByteString mo101085n() throws IOException {
        mo101592Z(2);
        return this.f83516c.mo101551x();
    }

    /* renamed from: o */
    public int mo101086o() throws IOException {
        mo101592Z(0);
        return this.f83516c.mo101508F();
    }

    /* renamed from: p */
    public void mo101087p(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C34351d1) {
            C34351d1 d1Var = (C34351d1) list;
            int b = WireFormat.m138722b(this.f83517d);
            if (b == 1) {
                do {
                    d1Var.mo101024Z(this.f83516c.mo101504B());
                    if (!this.f83516c.mo101541i()) {
                        Y2 = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f83517d);
                this.f83519f = Y2;
            } else if (b == 2) {
                int Z = this.f83516c.mo101526Z();
                mo101594b0(Z);
                int h = this.f83516c.mo101539h() + Z;
                do {
                    d1Var.mo101024Z(this.f83516c.mo101504B());
                } while (this.f83516c.mo101539h() < h);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        } else {
            int b2 = WireFormat.m138722b(this.f83517d);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f83516c.mo101504B()));
                    if (!this.f83516c.mo101541i()) {
                        Y = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y == this.f83517d);
                this.f83519f = Y;
            } else if (b2 == 2) {
                int Z2 = this.f83516c.mo101526Z();
                mo101594b0(Z2);
                int h2 = this.f83516c.mo101539h() + Z2;
                do {
                    list.add(Long.valueOf(this.f83516c.mo101504B()));
                } while (this.f83516c.mo101539h() < h2);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: q */
    public void mo101088q(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C34467u0) {
            C34467u0 u0Var = (C34467u0) list;
            int b = WireFormat.m138722b(this.f83517d);
            if (b == 0) {
                do {
                    u0Var.mo101605V(this.f83516c.mo101521U());
                    if (!this.f83516c.mo101541i()) {
                        Y2 = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f83517d);
                this.f83519f = Y2;
            } else if (b == 2) {
                int h = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    u0Var.mo101605V(this.f83516c.mo101521U());
                } while (this.f83516c.mo101539h() < h);
                mo101591Y(h);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        } else {
            int b2 = WireFormat.m138722b(this.f83517d);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f83516c.mo101521U()));
                    if (!this.f83516c.mo101541i()) {
                        Y = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y == this.f83517d);
                this.f83519f = Y;
            } else if (b2 == 2) {
                int h2 = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    list.add(Integer.valueOf(this.f83516c.mo101521U()));
                } while (this.f83516c.mo101539h() < h2);
                mo101591Y(h2);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: r */
    public long mo101089r() throws IOException {
        mo101592Z(0);
        return this.f83516c.mo101528a0();
    }

    public double readDouble() throws IOException {
        mo101592Z(1);
        return this.f83516c.mo101552y();
    }

    public float readFloat() throws IOException {
        mo101592Z(5);
        return this.f83516c.mo101505C();
    }

    /* renamed from: s */
    public void mo101092s(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C34467u0) {
            C34467u0 u0Var = (C34467u0) list;
            int b = WireFormat.m138722b(this.f83517d);
            if (b == 0) {
                do {
                    u0Var.mo101605V(this.f83516c.mo101526Z());
                    if (!this.f83516c.mo101541i()) {
                        Y2 = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f83517d);
                this.f83519f = Y2;
            } else if (b == 2) {
                int h = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    u0Var.mo101605V(this.f83516c.mo101526Z());
                } while (this.f83516c.mo101539h() < h);
                mo101591Y(h);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        } else {
            int b2 = WireFormat.m138722b(this.f83517d);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f83516c.mo101526Z()));
                    if (!this.f83516c.mo101541i()) {
                        Y = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y == this.f83517d);
                this.f83519f = Y;
            } else if (b2 == 2) {
                int h2 = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    list.add(Integer.valueOf(this.f83516c.mo101526Z()));
                } while (this.f83516c.mo101539h() < h2);
                mo101591Y(h2);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: t */
    public int mo101093t() throws IOException {
        mo101592Z(5);
        return this.f83516c.mo101503A();
    }

    /* renamed from: u */
    public void mo101094u(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C34351d1) {
            C34351d1 d1Var = (C34351d1) list;
            int b = WireFormat.m138722b(this.f83517d);
            if (b == 1) {
                do {
                    d1Var.mo101024Z(this.f83516c.mo101520T());
                    if (!this.f83516c.mo101541i()) {
                        Y2 = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f83517d);
                this.f83519f = Y2;
            } else if (b == 2) {
                int Z = this.f83516c.mo101526Z();
                mo101594b0(Z);
                int h = this.f83516c.mo101539h() + Z;
                do {
                    d1Var.mo101024Z(this.f83516c.mo101520T());
                } while (this.f83516c.mo101539h() < h);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        } else {
            int b2 = WireFormat.m138722b(this.f83517d);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f83516c.mo101520T()));
                    if (!this.f83516c.mo101541i()) {
                        Y = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y == this.f83517d);
                this.f83519f = Y;
            } else if (b2 == 2) {
                int Z2 = this.f83516c.mo101526Z();
                mo101594b0(Z2);
                int h2 = this.f83516c.mo101539h() + Z2;
                do {
                    list.add(Long.valueOf(this.f83516c.mo101520T()));
                } while (this.f83516c.mo101539h() < h2);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: v */
    public void mo101095v(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C34467u0) {
            C34467u0 u0Var = (C34467u0) list;
            int b = WireFormat.m138722b(this.f83517d);
            if (b == 0) {
                do {
                    u0Var.mo101605V(this.f83516c.mo101508F());
                    if (!this.f83516c.mo101541i()) {
                        Y2 = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f83517d);
                this.f83519f = Y2;
            } else if (b == 2) {
                int h = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    u0Var.mo101605V(this.f83516c.mo101508F());
                } while (this.f83516c.mo101539h() < h);
                mo101591Y(h);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        } else {
            int b2 = WireFormat.m138722b(this.f83517d);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f83516c.mo101508F()));
                    if (!this.f83516c.mo101541i()) {
                        Y = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y == this.f83517d);
                this.f83519f = Y;
            } else if (b2 == 2) {
                int h2 = this.f83516c.mo101539h() + this.f83516c.mo101526Z();
                do {
                    list.add(Integer.valueOf(this.f83516c.mo101508F()));
                } while (this.f83516c.mo101539h() < h2);
                mo101591Y(h2);
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: w */
    public void mo101096w(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof C34467u0) {
            C34467u0 u0Var = (C34467u0) list;
            int b = WireFormat.m138722b(this.f83517d);
            if (b == 2) {
                int Z = this.f83516c.mo101526Z();
                mo101593a0(Z);
                int h = this.f83516c.mo101539h() + Z;
                do {
                    u0Var.mo101605V(this.f83516c.mo101503A());
                } while (this.f83516c.mo101539h() < h);
            } else if (b == 5) {
                do {
                    u0Var.mo101605V(this.f83516c.mo101503A());
                    if (!this.f83516c.mo101541i()) {
                        Y2 = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f83517d);
                this.f83519f = Y2;
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        } else {
            int b2 = WireFormat.m138722b(this.f83517d);
            if (b2 == 2) {
                int Z2 = this.f83516c.mo101526Z();
                mo101593a0(Z2);
                int h2 = this.f83516c.mo101539h() + Z2;
                do {
                    list.add(Integer.valueOf(this.f83516c.mo101503A()));
                } while (this.f83516c.mo101539h() < h2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f83516c.mo101503A()));
                    if (!this.f83516c.mo101541i()) {
                        Y = this.f83516c.mo101525Y();
                    } else {
                        return;
                    }
                } while (Y == this.f83517d);
                this.f83519f = Y;
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: x */
    public long mo101097x() throws IOException {
        mo101592Z(0);
        return this.f83516c.mo101522V();
    }

    /* renamed from: y */
    public String mo101098y() throws IOException {
        mo101592Z(2);
        return this.f83516c.mo101523W();
    }

    /* renamed from: z */
    public int mo101099z() throws IOException {
        int i = this.f83519f;
        if (i != 0) {
            this.f83517d = i;
            this.f83519f = 0;
        } else {
            this.f83517d = this.f83516c.mo101525Y();
        }
        int i2 = this.f83517d;
        if (i2 == 0 || i2 == this.f83518e) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.m138721a(i2);
    }
}
