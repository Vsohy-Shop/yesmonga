package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.x2 */
public abstract class C34501x2<T, B> {
    /* renamed from: a */
    public abstract void mo101675a(B b, int i, int i2);

    /* renamed from: b */
    public abstract void mo101676b(B b, int i, long j);

    /* renamed from: c */
    public abstract void mo101677c(B b, int i, T t);

    /* renamed from: d */
    public abstract void mo101678d(B b, int i, ByteString byteString);

    /* renamed from: e */
    public abstract void mo101679e(B b, int i, long j);

    /* renamed from: f */
    public abstract B mo101680f(Object obj);

    /* renamed from: g */
    public abstract T mo101681g(Object obj);

    /* renamed from: h */
    public abstract int mo101682h(T t);

    /* renamed from: i */
    public abstract int mo101683i(T t);

    /* renamed from: j */
    public abstract void mo101684j(Object obj);

    /* renamed from: k */
    public abstract T mo101685k(T t, T t2);

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101686l(B r3, com.google.protobuf.C34366f2 r4) throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.mo101099z()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.mo101687m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34501x2.mo101686l(java.lang.Object, com.google.protobuf.f2):void");
    }

    /* renamed from: m */
    public final boolean mo101687m(B b, C34366f2 f2Var) throws IOException {
        int B = f2Var.mo101054B();
        int a = WireFormat.m138721a(B);
        int b2 = WireFormat.m138722b(B);
        if (b2 == 0) {
            mo101679e(b, a, f2Var.mo101061I());
            return true;
        } else if (b2 == 1) {
            mo101676b(b, a, f2Var.mo101072a());
            return true;
        } else if (b2 == 2) {
            mo101678d(b, a, f2Var.mo101085n());
            return true;
        } else if (b2 == 3) {
            Object n = mo101688n();
            int c = WireFormat.m138723c(a, 4);
            mo101686l(n, f2Var);
            if (c == f2Var.mo101054B()) {
                mo101677c(b, a, mo101692r(n));
                return true;
            }
            throw InvalidProtocolBufferException.m138413c();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                mo101675a(b, a, f2Var.mo101093t());
                return true;
            }
            throw InvalidProtocolBufferException.m138416f();
        }
    }

    /* renamed from: n */
    public abstract B mo101688n();

    /* renamed from: o */
    public abstract void mo101689o(Object obj, B b);

    /* renamed from: p */
    public abstract void mo101690p(Object obj, T t);

    /* renamed from: q */
    public abstract boolean mo101691q(C34366f2 f2Var);

    /* renamed from: r */
    public abstract T mo101692r(B b);

    /* renamed from: s */
    public abstract void mo101693s(T t, Writer writer) throws IOException;

    /* renamed from: t */
    public abstract void mo101694t(T t, Writer writer) throws IOException;
}
