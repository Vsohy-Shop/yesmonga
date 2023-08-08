package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18784k1;
import androidx.datastore.preferences.protobuf.C18909y0;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.d2 */
public final class C18710d2<T> implements C18905x2<T> {

    /* renamed from: a */
    public final C18920z1 f47841a;

    /* renamed from: b */
    public final C18888v3<?, ?> f47842b;

    /* renamed from: c */
    public final boolean f47843c;

    /* renamed from: d */
    public final C18844q0<?> f47844d;

    public C18710d2(C18888v3<?, ?> v3Var, C18844q0<?> q0Var, C18920z1 z1Var) {
        this.f47842b = v3Var;
        this.f47843c = q0Var.mo55346e(z1Var);
        this.f47844d = q0Var;
        this.f47841a = z1Var;
    }

    /* renamed from: m */
    public static <T> C18710d2<T> m85782m(C18888v3<?, ?> v3Var, C18844q0<?> q0Var, C18920z1 z1Var) {
        return new C18710d2<>(v3Var, q0Var, z1Var);
    }

    /* renamed from: a */
    public void mo54445a(T t, T t2) {
        C18922z2.m88285J(this.f47842b, t, t2);
        if (this.f47843c) {
            C18922z2.m88283H(this.f47844d, t, t2);
        }
    }

    /* renamed from: b */
    public void mo54446b(T t) {
        this.f47842b.mo55465j(t);
        this.f47844d.mo55347f(t);
    }

    /* renamed from: c */
    public final boolean mo54447c(T t) {
        return this.f47844d.mo55344c(t).mo55610E();
    }

    /* renamed from: d */
    public int mo54449d(T t) {
        int k = mo54502k(this.f47842b, t) + 0;
        if (this.f47843c) {
            return k + this.f47844d.mo55344c(t).mo55631v();
        }
        return k;
    }

    /* renamed from: e */
    public T mo54451e() {
        return this.f47841a.newBuilderForType().mo54011Q();
    }

    /* renamed from: f */
    public int mo54453f(T t) {
        int hashCode = this.f47842b.mo55462g(t).hashCode();
        if (this.f47843c) {
            return (hashCode * 53) + this.f47844d.mo55344c(t).hashCode();
        }
        return hashCode;
    }

    /* renamed from: g */
    public boolean mo54455g(T t, T t2) {
        if (!this.f47842b.mo55462g(t).equals(this.f47842b.mo55462g(t2))) {
            return false;
        }
        if (this.f47843c) {
            return this.f47844d.mo55344c(t).equals(this.f47844d.mo55344c(t2));
        }
        return true;
    }

    /* renamed from: h */
    public void mo54457h(T t, C18899w2 w2Var, C18836p0 p0Var) throws IOException {
        mo54503l(this.f47842b, this.f47844d, t, w2Var, p0Var);
    }

    /* renamed from: i */
    public void mo54459i(T t, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> H = this.f47844d.mo55344c(t).mo55611H();
        while (H.hasNext()) {
            Map.Entry next = H.next();
            C18909y0.C18912c cVar = (C18909y0.C18912c) next.getKey();
            if (cVar.mo54065R() != WireFormat.JavaType.MESSAGE || cVar.mo54063B() || cVar.mo54066S()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C18784k1.C18786b) {
                writer.mo54226b(cVar.getNumber(), ((C18784k1.C18786b) next).mo54914a().mo54933n());
            } else {
                writer.mo54226b(cVar.getNumber(), next.getValue());
            }
        }
        mo54505o(this.f47842b, t, writer);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: androidx.datastore.preferences.protobuf.GeneratedMessageLite$h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo54461j(T r11, byte[] r12, int r13, int r14, androidx.datastore.preferences.protobuf.C18793l.C18795b r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r0
            androidx.datastore.preferences.protobuf.w3 r1 = r0.unknownFields
            androidx.datastore.preferences.protobuf.w3 r2 = androidx.datastore.preferences.protobuf.C18900w3.m87953e()
            if (r1 != r2) goto L_0x0011
            androidx.datastore.preferences.protobuf.w3 r1 = androidx.datastore.preferences.protobuf.C18900w3.m87957p()
            r0.unknownFields = r1
        L_0x0011:
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$e r11 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.C18637e) r11
            androidx.datastore.preferences.protobuf.y0 r11 = r11.mo54049d1()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = androidx.datastore.preferences.protobuf.C18793l.m86496I(r12, r13, r15)
            int r13 = r15.f47906a
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.f47733q
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.m85345b(r13)
            if (r3 != r5) goto L_0x0066
            androidx.datastore.preferences.protobuf.q0<?> r2 = r10.f47844d
            androidx.datastore.preferences.protobuf.p0 r3 = r15.f47909d
            androidx.datastore.preferences.protobuf.z1 r5 = r10.f47841a
            int r6 = androidx.datastore.preferences.protobuf.WireFormat.m85344a(r13)
            java.lang.Object r2 = r2.mo55343b(r3, r5, r6)
            r8 = r2
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$h r8 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.C18641h) r8
            if (r8 == 0) goto L_0x005b
            androidx.datastore.preferences.protobuf.r2 r13 = androidx.datastore.preferences.protobuf.C18853r2.m87361a()
            androidx.datastore.preferences.protobuf.z1 r2 = r8.mo54074c()
            java.lang.Class r2 = r2.getClass()
            androidx.datastore.preferences.protobuf.x2 r13 = r13.mo55373i(r2)
            int r13 = androidx.datastore.preferences.protobuf.C18793l.m86517p(r13, r12, r4, r14, r15)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r2 = r8.f47656d
            java.lang.Object r3 = r15.f47908c
            r11.mo55615O(r2, r3)
            goto L_0x0064
        L_0x005b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = androidx.datastore.preferences.protobuf.C18793l.m86494G(r2, r3, r4, r5, r6, r7)
        L_0x0064:
            r2 = r8
            goto L_0x0019
        L_0x0066:
            int r13 = androidx.datastore.preferences.protobuf.C18793l.m86501N(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = androidx.datastore.preferences.protobuf.C18793l.m86496I(r12, r4, r15)
            int r6 = r15.f47906a
            int r7 = androidx.datastore.preferences.protobuf.WireFormat.m85344a(r6)
            int r8 = androidx.datastore.preferences.protobuf.WireFormat.m85345b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            androidx.datastore.preferences.protobuf.r2 r6 = androidx.datastore.preferences.protobuf.C18853r2.m87361a()
            androidx.datastore.preferences.protobuf.z1 r7 = r2.mo54074c()
            java.lang.Class r7 = r7.getClass()
            androidx.datastore.preferences.protobuf.x2 r6 = r6.mo55373i(r7)
            int r4 = androidx.datastore.preferences.protobuf.C18793l.m86517p(r6, r12, r4, r14, r15)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r6 = r2.f47656d
            java.lang.Object r7 = r15.f47908c
            r11.mo55615O(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = androidx.datastore.preferences.protobuf.C18793l.m86503b(r12, r4, r15)
            java.lang.Object r3 = r15.f47908c
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = androidx.datastore.preferences.protobuf.C18793l.m86496I(r12, r4, r15)
            int r13 = r15.f47906a
            androidx.datastore.preferences.protobuf.q0<?> r2 = r10.f47844d
            androidx.datastore.preferences.protobuf.p0 r6 = r15.f47909d
            androidx.datastore.preferences.protobuf.z1 r7 = r10.f47841a
            java.lang.Object r2 = r2.mo55343b(r6, r7, r13)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$h r2 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.C18641h) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = androidx.datastore.preferences.protobuf.WireFormat.f47734r
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = androidx.datastore.preferences.protobuf.C18793l.m86501N(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = androidx.datastore.preferences.protobuf.WireFormat.m85346c(r13, r5)
            r1.mo55571r(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r11 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m85091h()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18710d2.mo54461j(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.l$b):void");
    }

    /* renamed from: k */
    public final <UT, UB> int mo54502k(C18888v3<UT, UB> v3Var, T t) {
        return v3Var.mo55464i(v3Var.mo55462g(t));
    }

    /* renamed from: l */
    public final <UT, UB, ET extends C18909y0.C18912c<ET>> void mo54503l(C18888v3<UT, UB> v3Var, C18844q0<ET> q0Var, T t, C18899w2 w2Var, C18836p0 p0Var) throws IOException {
        UB f = v3Var.mo55461f(t);
        C18909y0<ET> d = q0Var.mo55345d(t);
        do {
            try {
                if (w2Var.mo55015z() == Integer.MAX_VALUE) {
                    v3Var.mo55470o(t, f);
                    return;
                }
            } finally {
                v3Var.mo55470o(t, f);
            }
        } while (mo54504n(w2Var, p0Var, q0Var, d, v3Var, f));
    }

    /* renamed from: n */
    public final <UT, UB, ET extends C18909y0.C18912c<ET>> boolean mo54504n(C18899w2 w2Var, C18836p0 p0Var, C18844q0<ET> q0Var, C18909y0<ET> y0Var, C18888v3<UT, UB> v3Var, UB ub) throws IOException {
        int B = w2Var.mo54948B();
        if (B == WireFormat.f47733q) {
            Object obj = null;
            int i = 0;
            ByteString byteString = null;
            while (w2Var.mo55015z() != Integer.MAX_VALUE) {
                int B2 = w2Var.mo54948B();
                if (B2 == WireFormat.f47735s) {
                    i = w2Var.mo54982g();
                    obj = q0Var.mo55343b(p0Var, this.f47841a, i);
                } else if (B2 == WireFormat.f47736t) {
                    if (obj != null) {
                        q0Var.mo55349h(w2Var, obj, p0Var, y0Var);
                    } else {
                        byteString = w2Var.mo54996n();
                    }
                } else if (!w2Var.mo54950E()) {
                    break;
                }
            }
            if (w2Var.mo54948B() == WireFormat.f47734r) {
                if (byteString != null) {
                    if (obj != null) {
                        q0Var.mo55350i(byteString, obj, p0Var, y0Var);
                    } else {
                        v3Var.mo55459d(ub, i, byteString);
                    }
                }
                return true;
            }
            throw InvalidProtocolBufferException.m85085b();
        } else if (WireFormat.m85345b(B) != 2) {
            return w2Var.mo54950E();
        } else {
            Object b = q0Var.mo55343b(p0Var, this.f47841a, WireFormat.m85344a(B));
            if (b == null) {
                return v3Var.mo55468m(ub, w2Var);
            }
            q0Var.mo55349h(w2Var, b, p0Var, y0Var);
            return true;
        }
    }

    /* renamed from: o */
    public final <UT, UB> void mo54505o(C18888v3<UT, UB> v3Var, T t, Writer writer) throws IOException {
        v3Var.mo55474s(v3Var.mo55462g(t), writer);
    }
}
