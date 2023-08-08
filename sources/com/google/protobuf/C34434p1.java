package com.google.protobuf;

import com.google.protobuf.C34425o0;
import com.google.protobuf.C34496x0;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.p1 */
public final class C34434p1<T> implements C34372g2<T> {

    /* renamed from: a */
    public final C34412l1 f83440a;

    /* renamed from: b */
    public final C34501x2<?, ?> f83441b;

    /* renamed from: c */
    public final boolean f83442c;

    /* renamed from: d */
    public final C34374h0<?> f83443d;

    public C34434p1(C34501x2<?, ?> x2Var, C34374h0<?> h0Var, C34412l1 l1Var) {
        this.f83441b = x2Var;
        this.f83442c = h0Var.mo101128e(l1Var);
        this.f83443d = h0Var;
        this.f83440a = l1Var;
    }

    /* renamed from: m */
    public static <T> C34434p1<T> m140101m(C34501x2<?, ?> x2Var, C34374h0<?> h0Var, C34412l1 l1Var) {
        return new C34434p1<>(x2Var, h0Var, l1Var);
    }

    /* renamed from: a */
    public void mo101114a(T t, T t2) {
        C34381i2.m139321J(this.f83441b, t, t2);
        if (this.f83442c) {
            C34381i2.m139319H(this.f83443d, t, t2);
        }
    }

    /* renamed from: b */
    public void mo101115b(T t) {
        this.f83441b.mo101684j(t);
        this.f83443d.mo101129f(t);
    }

    /* renamed from: c */
    public final boolean mo101116c(T t) {
        return this.f83443d.mo101126c(t).mo101383E();
    }

    /* renamed from: d */
    public int mo101117d(T t) {
        int k = mo101489k(this.f83441b, t) + 0;
        if (this.f83442c) {
            return k + this.f83443d.mo101126c(t).mo101404v();
        }
        return k;
    }

    /* renamed from: e */
    public T mo101118e() {
        return this.f83440a.newBuilderForType().mo100467Q();
    }

    /* renamed from: f */
    public int mo101119f(T t) {
        int hashCode = this.f83441b.mo101681g(t).hashCode();
        if (this.f83442c) {
            return (hashCode * 53) + this.f83443d.mo101126c(t).hashCode();
        }
        return hashCode;
    }

    /* renamed from: g */
    public boolean mo101120g(T t, T t2) {
        if (!this.f83441b.mo101681g(t).equals(this.f83441b.mo101681g(t2))) {
            return false;
        }
        if (this.f83442c) {
            return this.f83443d.mo101126c(t).equals(this.f83443d.mo101126c(t2));
        }
        return true;
    }

    /* renamed from: h */
    public void mo101121h(T t, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> H = this.f83443d.mo101126c(t).mo101384H();
        while (H.hasNext()) {
            Map.Entry next = H.next();
            C34425o0.C34428c cVar = (C34425o0.C34428c) next.getKey();
            if (cVar.mo100492R() != WireFormat.JavaType.MESSAGE || cVar.mo100490B() || cVar.mo100493S()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C34496x0.C34498b) {
                writer.mo100807b(cVar.getNumber(), ((C34496x0.C34498b) next).mo101667a().mo101704n());
            } else {
                writer.mo100807b(cVar.getNumber(), next.getValue());
            }
        }
        mo101492o(this.f83441b, t, writer);
    }

    /* renamed from: i */
    public void mo101122i(T t, C34366f2 f2Var, C34368g0 g0Var) throws IOException {
        mo101490l(this.f83441b, this.f83443d, t, f2Var, g0Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.protobuf.GeneratedMessageLite$g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo101123j(T r11, byte[] r12, int r13, int r14, com.google.protobuf.C34382j.C34384b r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            com.google.protobuf.y2 r1 = r0.unknownFields
            com.google.protobuf.y2 r2 = com.google.protobuf.C34505y2.m140700c()
            if (r1 != r2) goto L_0x0011
            com.google.protobuf.y2 r1 = com.google.protobuf.C34505y2.m140704n()
            r0.unknownFields = r1
        L_0x0011:
            com.google.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.google.protobuf.GeneratedMessageLite.ExtendableMessage) r11
            com.google.protobuf.o0 r11 = r11.ensureExtensionsAreMutable()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = com.google.protobuf.C34382j.m139398I(r12, r13, r15)
            int r13 = r15.f83292a
            int r3 = com.google.protobuf.WireFormat.f83155q
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = com.google.protobuf.WireFormat.m138722b(r13)
            if (r3 != r5) goto L_0x0066
            com.google.protobuf.h0<?> r2 = r10.f83443d
            com.google.protobuf.g0 r3 = r15.f83295d
            com.google.protobuf.l1 r5 = r10.f83440a
            int r6 = com.google.protobuf.WireFormat.m138721a(r13)
            java.lang.Object r2 = r2.mo101125b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.GeneratedMessageLite$g r8 = (com.google.protobuf.GeneratedMessageLite.C34268g) r8
            if (r8 == 0) goto L_0x005b
            com.google.protobuf.a2 r13 = com.google.protobuf.C34325a2.m138828a()
            com.google.protobuf.l1 r2 = r8.mo100501c()
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.g2 r13 = r13.mo100881i(r2)
            int r13 = com.google.protobuf.C34382j.m139419p(r13, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$f r2 = r8.f83064d
            java.lang.Object r3 = r15.f83294c
            r11.mo101388O(r2, r3)
            goto L_0x0064
        L_0x005b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.C34382j.m139396G(r2, r3, r4, r5, r6, r7)
        L_0x0064:
            r2 = r8
            goto L_0x0019
        L_0x0066:
            int r13 = com.google.protobuf.C34382j.m139403N(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = com.google.protobuf.C34382j.m139398I(r12, r4, r15)
            int r6 = r15.f83292a
            int r7 = com.google.protobuf.WireFormat.m138721a(r6)
            int r8 = com.google.protobuf.WireFormat.m138722b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            com.google.protobuf.a2 r6 = com.google.protobuf.C34325a2.m138828a()
            com.google.protobuf.l1 r7 = r2.mo100501c()
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.g2 r6 = r6.mo100881i(r7)
            int r4 = com.google.protobuf.C34382j.m139419p(r6, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$f r6 = r2.f83064d
            java.lang.Object r7 = r15.f83294c
            r11.mo101388O(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = com.google.protobuf.C34382j.m139405b(r12, r4, r15)
            java.lang.Object r3 = r15.f83294c
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = com.google.protobuf.C34382j.m139398I(r12, r4, r15)
            int r13 = r15.f83292a
            com.google.protobuf.h0<?> r2 = r10.f83443d
            com.google.protobuf.g0 r6 = r15.f83295d
            com.google.protobuf.l1 r7 = r10.f83440a
            java.lang.Object r2 = r2.mo101125b(r6, r7, r13)
            com.google.protobuf.GeneratedMessageLite$g r2 = (com.google.protobuf.GeneratedMessageLite.C34268g) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = com.google.protobuf.WireFormat.f83156r
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = com.google.protobuf.C34382j.m139403N(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = com.google.protobuf.WireFormat.m138723c(r13, r5)
            r1.mo101718q(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            com.google.protobuf.InvalidProtocolBufferException r11 = com.google.protobuf.InvalidProtocolBufferException.m138419i()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34434p1.mo101123j(java.lang.Object, byte[], int, int, com.google.protobuf.j$b):void");
    }

    /* renamed from: k */
    public final <UT, UB> int mo101489k(C34501x2<UT, UB> x2Var, T t) {
        return x2Var.mo101683i(x2Var.mo101681g(t));
    }

    /* renamed from: l */
    public final <UT, UB, ET extends C34425o0.C34428c<ET>> void mo101490l(C34501x2<UT, UB> x2Var, C34374h0<ET> h0Var, T t, C34366f2 f2Var, C34368g0 g0Var) throws IOException {
        UB f = x2Var.mo101680f(t);
        C34425o0<ET> d = h0Var.mo101127d(t);
        do {
            try {
                if (f2Var.mo101099z() == Integer.MAX_VALUE) {
                    x2Var.mo101689o(t, f);
                    return;
                }
            } finally {
                x2Var.mo101689o(t, f);
            }
        } while (mo101491n(f2Var, g0Var, h0Var, d, x2Var, f));
    }

    /* renamed from: n */
    public final <UT, UB, ET extends C34425o0.C34428c<ET>> boolean mo101491n(C34366f2 f2Var, C34368g0 g0Var, C34374h0<ET> h0Var, C34425o0<ET> o0Var, C34501x2<UT, UB> x2Var, UB ub) throws IOException {
        int B = f2Var.mo101054B();
        if (B == WireFormat.f83155q) {
            Object obj = null;
            int i = 0;
            ByteString byteString = null;
            while (f2Var.mo101099z() != Integer.MAX_VALUE) {
                int B2 = f2Var.mo101054B();
                if (B2 == WireFormat.f83157s) {
                    i = f2Var.mo101078g();
                    obj = h0Var.mo101125b(g0Var, this.f83440a, i);
                } else if (B2 == WireFormat.f83158t) {
                    if (obj != null) {
                        h0Var.mo101131h(f2Var, obj, g0Var, o0Var);
                    } else {
                        byteString = f2Var.mo101085n();
                    }
                } else if (!f2Var.mo101057E()) {
                    break;
                }
            }
            if (f2Var.mo101054B() == WireFormat.f83156r) {
                if (byteString != null) {
                    if (obj != null) {
                        h0Var.mo101132i(byteString, obj, g0Var, o0Var);
                    } else {
                        x2Var.mo101678d(ub, i, byteString);
                    }
                }
                return true;
            }
            throw InvalidProtocolBufferException.m138413c();
        } else if (WireFormat.m138722b(B) != 2) {
            return f2Var.mo101057E();
        } else {
            Object b = h0Var.mo101125b(g0Var, this.f83440a, WireFormat.m138721a(B));
            if (b == null) {
                return x2Var.mo101687m(ub, f2Var);
            }
            h0Var.mo101131h(f2Var, b, g0Var, o0Var);
            return true;
        }
    }

    /* renamed from: o */
    public final <UT, UB> void mo101492o(C34501x2<UT, UB> x2Var, T t, Writer writer) throws IOException {
        x2Var.mo101693s(x2Var.mo101681g(t), writer);
    }
}
