package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.y0 */
public class C34503y0 {

    /* renamed from: e */
    public static final C34368g0 f83564e = C34368g0.m139242d();

    /* renamed from: a */
    public ByteString f83565a;

    /* renamed from: b */
    public C34368g0 f83566b;

    /* renamed from: c */
    public volatile C34412l1 f83567c;

    /* renamed from: d */
    public volatile ByteString f83568d;

    public C34503y0(C34368g0 g0Var, ByteString byteString) {
        m140659a(g0Var, byteString);
        this.f83566b = g0Var;
        this.f83565a = byteString;
    }

    /* renamed from: a */
    public static void m140659a(C34368g0 g0Var, ByteString byteString) {
        if (g0Var == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        } else if (byteString == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    /* renamed from: e */
    public static C34503y0 m140660e(C34412l1 l1Var) {
        C34503y0 y0Var = new C34503y0();
        y0Var.mo101703m(l1Var);
        return y0Var;
    }

    /* renamed from: j */
    public static C34412l1 m140661j(C34412l1 l1Var, ByteString byteString, C34368g0 g0Var) {
        try {
            return l1Var.toBuilder().mo100855y2(byteString, g0Var).mo100473g();
        } catch (InvalidProtocolBufferException unused) {
            return l1Var;
        }
    }

    /* renamed from: b */
    public void mo101695b() {
        this.f83565a = null;
        this.f83567c = null;
        this.f83568d = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r2.f83565a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo101662c() {
        /*
            r2 = this;
            com.google.protobuf.ByteString r0 = r2.f83568d
            com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.f82785d
            if (r0 == r1) goto L_0x0013
            com.google.protobuf.l1 r0 = r2.f83567c
            if (r0 != 0) goto L_0x0011
            com.google.protobuf.ByteString r0 = r2.f83565a
            if (r0 == 0) goto L_0x0013
            if (r0 != r1) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34503y0.mo101662c():boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f83567c = r4;
        r3.f83568d = com.google.protobuf.ByteString.f82785d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo101696d(com.google.protobuf.C34412l1 r4) {
        /*
            r3 = this;
            com.google.protobuf.l1 r0 = r3.f83567c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            com.google.protobuf.l1 r0 = r3.f83567c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            com.google.protobuf.ByteString r0 = r3.f83565a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            if (r0 == 0) goto L_0x0025
            com.google.protobuf.y1 r0 = r4.getParserForType()     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.ByteString r1 = r3.f83565a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.g0 r2 = r3.f83566b     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            java.lang.Object r0 = r0.mo100942j(r1, r2)     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.l1 r0 = (com.google.protobuf.C34412l1) r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f83567c = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.ByteString r0 = r3.f83565a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f83568d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x0025:
            r3.f83567c = r4     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.f82785d     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f83568d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r3.f83567c = r4     // Catch:{ all -> 0x0034 }
            com.google.protobuf.ByteString r4 = com.google.protobuf.ByteString.f82785d     // Catch:{ all -> 0x0034 }
            r3.f83568d = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34503y0.mo101696d(com.google.protobuf.l1):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34503y0)) {
            return false;
        }
        C34503y0 y0Var = (C34503y0) obj;
        C34412l1 l1Var = this.f83567c;
        C34412l1 l1Var2 = y0Var.f83567c;
        if (l1Var == null && l1Var2 == null) {
            return mo101704n().equals(y0Var.mo101704n());
        }
        if (l1Var != null && l1Var2 != null) {
            return l1Var.equals(l1Var2);
        }
        if (l1Var != null) {
            return l1Var.equals(y0Var.mo101698g(l1Var.getDefaultInstanceForType()));
        }
        return mo101698g(l1Var2.getDefaultInstanceForType()).equals(l1Var2);
    }

    /* renamed from: f */
    public int mo101697f() {
        if (this.f83568d != null) {
            return this.f83568d.size();
        }
        ByteString byteString = this.f83565a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f83567c != null) {
            return this.f83567c.getSerializedSize();
        }
        return 0;
    }

    /* renamed from: g */
    public C34412l1 mo101698g(C34412l1 l1Var) {
        mo101696d(l1Var);
        return this.f83567c;
    }

    /* renamed from: h */
    public void mo101699h(C34503y0 y0Var) {
        ByteString byteString;
        if (!y0Var.mo101662c()) {
            if (mo101662c()) {
                mo101701k(y0Var);
                return;
            }
            if (this.f83566b == null) {
                this.f83566b = y0Var.f83566b;
            }
            ByteString byteString2 = this.f83565a;
            if (byteString2 != null && (byteString = y0Var.f83565a) != null) {
                this.f83565a = byteString2.mo99256y(byteString);
            } else if (this.f83567c == null && y0Var.f83567c != null) {
                mo101703m(m140661j(y0Var.f83567c, this.f83565a, this.f83566b));
            } else if (this.f83567c == null || y0Var.f83567c != null) {
                mo101703m(this.f83567c.toBuilder().mo100838A1(y0Var.f83567c).mo100473g());
            } else {
                mo101703m(m140661j(this.f83567c, y0Var.f83565a, y0Var.f83566b));
            }
        }
    }

    public int hashCode() {
        return 1;
    }

    /* renamed from: i */
    public void mo101700i(C34448s sVar, C34368g0 g0Var) throws IOException {
        if (mo101662c()) {
            mo101702l(sVar.mo101551x(), g0Var);
            return;
        }
        if (this.f83566b == null) {
            this.f83566b = g0Var;
        }
        ByteString byteString = this.f83565a;
        if (byteString != null) {
            mo101702l(byteString.mo99256y(sVar.mo101551x()), this.f83566b);
            return;
        }
        try {
            mo101703m(this.f83567c.toBuilder().mo100459G1(sVar, g0Var).mo100473g());
        } catch (InvalidProtocolBufferException unused) {
        }
    }

    /* renamed from: k */
    public void mo101701k(C34503y0 y0Var) {
        this.f83565a = y0Var.f83565a;
        this.f83567c = y0Var.f83567c;
        this.f83568d = y0Var.f83568d;
        C34368g0 g0Var = y0Var.f83566b;
        if (g0Var != null) {
            this.f83566b = g0Var;
        }
    }

    /* renamed from: l */
    public void mo101702l(ByteString byteString, C34368g0 g0Var) {
        m140659a(g0Var, byteString);
        this.f83565a = byteString;
        this.f83566b = g0Var;
        this.f83567c = null;
        this.f83568d = null;
    }

    /* renamed from: m */
    public C34412l1 mo101703m(C34412l1 l1Var) {
        C34412l1 l1Var2 = this.f83567c;
        this.f83565a = null;
        this.f83568d = null;
        this.f83567c = l1Var;
        return l1Var2;
    }

    /* renamed from: n */
    public ByteString mo101704n() {
        if (this.f83568d != null) {
            return this.f83568d;
        }
        ByteString byteString = this.f83565a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.f83568d != null) {
                ByteString byteString2 = this.f83568d;
                return byteString2;
            }
            if (this.f83567c == null) {
                this.f83568d = ByteString.f82785d;
            } else {
                this.f83568d = this.f83567c.toByteString();
            }
            ByteString byteString3 = this.f83568d;
            return byteString3;
        }
    }

    /* renamed from: o */
    public void mo101705o(Writer writer, int i) throws IOException {
        if (this.f83568d != null) {
            writer.mo100802P(i, this.f83568d);
            return;
        }
        ByteString byteString = this.f83565a;
        if (byteString != null) {
            writer.mo100802P(i, byteString);
        } else if (this.f83567c != null) {
            writer.mo100828w(i, this.f83567c);
        } else {
            writer.mo100802P(i, ByteString.f82785d);
        }
    }

    public C34503y0() {
    }
}
