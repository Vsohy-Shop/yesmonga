package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.l1 */
public class C18797l1 {

    /* renamed from: e */
    public static final C18836p0 f47910e = C18836p0.m87223d();

    /* renamed from: a */
    public ByteString f47911a;

    /* renamed from: b */
    public C18836p0 f47912b;

    /* renamed from: c */
    public volatile C18920z1 f47913c;

    /* renamed from: d */
    public volatile ByteString f47914d;

    public C18797l1(C18836p0 p0Var, ByteString byteString) {
        m86528a(p0Var, byteString);
        this.f47912b = p0Var;
        this.f47911a = byteString;
    }

    /* renamed from: a */
    public static void m86528a(C18836p0 p0Var, ByteString byteString) {
        if (p0Var == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        } else if (byteString == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    /* renamed from: e */
    public static C18797l1 m86529e(C18920z1 z1Var) {
        C18797l1 l1Var = new C18797l1();
        l1Var.mo54932m(z1Var);
        return l1Var;
    }

    /* renamed from: j */
    public static C18920z1 m86530j(C18920z1 z1Var, ByteString byteString, C18836p0 p0Var) {
        try {
            return z1Var.toBuilder().mo54270c2(byteString, p0Var).mo54018g();
        } catch (InvalidProtocolBufferException unused) {
            return z1Var;
        }
    }

    /* renamed from: b */
    public void mo54924b() {
        this.f47911a = null;
        this.f47913c = null;
        this.f47914d = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r2.f47911a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo54909c() {
        /*
            r2 = this;
            androidx.datastore.preferences.protobuf.ByteString r0 = r2.f47914d
            androidx.datastore.preferences.protobuf.ByteString r1 = androidx.datastore.preferences.protobuf.ByteString.f47470d
            if (r0 == r1) goto L_0x0013
            androidx.datastore.preferences.protobuf.z1 r0 = r2.f47913c
            if (r0 != 0) goto L_0x0011
            androidx.datastore.preferences.protobuf.ByteString r0 = r2.f47911a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18797l1.mo54909c():boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f47913c = r4;
        r3.f47914d = androidx.datastore.preferences.protobuf.ByteString.f47470d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo54925d(androidx.datastore.preferences.protobuf.C18920z1 r4) {
        /*
            r3 = this;
            androidx.datastore.preferences.protobuf.z1 r0 = r3.f47913c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            androidx.datastore.preferences.protobuf.z1 r0 = r3.f47913c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            androidx.datastore.preferences.protobuf.ByteString r0 = r3.f47911a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            if (r0 == 0) goto L_0x0025
            androidx.datastore.preferences.protobuf.p2 r0 = r4.getParserForType()     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            androidx.datastore.preferences.protobuf.ByteString r1 = r3.f47911a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            androidx.datastore.preferences.protobuf.p0 r2 = r3.f47912b     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            java.lang.Object r0 = r0.mo54387q(r1, r2)     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            androidx.datastore.preferences.protobuf.z1 r0 = (androidx.datastore.preferences.protobuf.C18920z1) r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f47913c = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            androidx.datastore.preferences.protobuf.ByteString r0 = r3.f47911a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f47914d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x0025:
            r3.f47913c = r4     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            androidx.datastore.preferences.protobuf.ByteString r0 = androidx.datastore.preferences.protobuf.ByteString.f47470d     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f47914d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r3.f47913c = r4     // Catch:{ all -> 0x0034 }
            androidx.datastore.preferences.protobuf.ByteString r4 = androidx.datastore.preferences.protobuf.ByteString.f47470d     // Catch:{ all -> 0x0034 }
            r3.f47914d = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18797l1.mo54925d(androidx.datastore.preferences.protobuf.z1):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18797l1)) {
            return false;
        }
        C18797l1 l1Var = (C18797l1) obj;
        C18920z1 z1Var = this.f47913c;
        C18920z1 z1Var2 = l1Var.f47913c;
        if (z1Var == null && z1Var2 == null) {
            return mo54933n().equals(l1Var.mo54933n());
        }
        if (z1Var != null && z1Var2 != null) {
            return z1Var.equals(z1Var2);
        }
        if (z1Var != null) {
            return z1Var.equals(l1Var.mo54927g(z1Var.getDefaultInstanceForType()));
        }
        return mo54927g(z1Var2.getDefaultInstanceForType()).equals(z1Var2);
    }

    /* renamed from: f */
    public int mo54926f() {
        if (this.f47914d != null) {
            return this.f47914d.size();
        }
        ByteString byteString = this.f47911a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f47913c != null) {
            return this.f47913c.getSerializedSize();
        }
        return 0;
    }

    /* renamed from: g */
    public C18920z1 mo54927g(C18920z1 z1Var) {
        mo54925d(z1Var);
        return this.f47913c;
    }

    /* renamed from: h */
    public void mo54928h(C18797l1 l1Var) {
        ByteString byteString;
        if (!l1Var.mo54909c()) {
            if (mo54909c()) {
                mo54930k(l1Var);
                return;
            }
            if (this.f47912b == null) {
                this.f47912b = l1Var.f47912b;
            }
            ByteString byteString2 = this.f47911a;
            if (byteString2 != null && (byteString = l1Var.f47911a) != null) {
                this.f47911a = byteString2.mo53768y(byteString);
            } else if (this.f47913c == null && l1Var.f47913c != null) {
                mo54932m(m86530j(l1Var.f47913c, this.f47911a, this.f47912b));
            } else if (this.f47913c == null || l1Var.f47913c != null) {
                mo54932m(this.f47913c.toBuilder().mo54276t0(l1Var.f47913c).mo54018g());
            } else {
                mo54932m(m86530j(this.f47913c, l1Var.f47911a, l1Var.f47912b));
            }
        }
    }

    public int hashCode() {
        return 1;
    }

    /* renamed from: i */
    public void mo54929i(C18889w wVar, C18836p0 p0Var) throws IOException {
        if (mo54909c()) {
            mo54931l(wVar.mo55524x(), p0Var);
            return;
        }
        if (this.f47912b == null) {
            this.f47912b = p0Var;
        }
        ByteString byteString = this.f47911a;
        if (byteString != null) {
            mo54931l(byteString.mo53768y(wVar.mo55524x()), this.f47912b);
            return;
        }
        try {
            mo54932m(this.f47913c.toBuilder().mo54010M1(wVar, p0Var).mo54018g());
        } catch (InvalidProtocolBufferException unused) {
        }
    }

    /* renamed from: k */
    public void mo54930k(C18797l1 l1Var) {
        this.f47911a = l1Var.f47911a;
        this.f47913c = l1Var.f47913c;
        this.f47914d = l1Var.f47914d;
        C18836p0 p0Var = l1Var.f47912b;
        if (p0Var != null) {
            this.f47912b = p0Var;
        }
    }

    /* renamed from: l */
    public void mo54931l(ByteString byteString, C18836p0 p0Var) {
        m86528a(p0Var, byteString);
        this.f47911a = byteString;
        this.f47912b = p0Var;
        this.f47913c = null;
        this.f47914d = null;
    }

    /* renamed from: m */
    public C18920z1 mo54932m(C18920z1 z1Var) {
        C18920z1 z1Var2 = this.f47913c;
        this.f47911a = null;
        this.f47914d = null;
        this.f47913c = z1Var;
        return z1Var2;
    }

    /* renamed from: n */
    public ByteString mo54933n() {
        if (this.f47914d != null) {
            return this.f47914d;
        }
        ByteString byteString = this.f47911a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.f47914d != null) {
                ByteString byteString2 = this.f47914d;
                return byteString2;
            }
            if (this.f47913c == null) {
                this.f47914d = ByteString.f47470d;
            } else {
                this.f47914d = this.f47913c.toByteString();
            }
            ByteString byteString3 = this.f47914d;
            return byteString3;
        }
    }

    /* renamed from: o */
    public void mo54934o(Writer writer, int i) throws IOException {
        if (this.f47914d != null) {
            writer.mo54220O(i, this.f47914d);
            return;
        }
        ByteString byteString = this.f47911a;
        if (byteString != null) {
            writer.mo54220O(i, byteString);
        } else if (this.f47913c != null) {
            writer.mo54247w(i, this.f47913c);
        } else {
            writer.mo54220O(i, ByteString.f47470d);
        }
    }

    public C18797l1() {
    }
}
