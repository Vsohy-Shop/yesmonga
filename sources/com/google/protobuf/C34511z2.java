package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.z2 */
public class C34511z2 extends C34501x2<C34505y2, C34505y2> {
    /* renamed from: A */
    public C34505y2 mo101681g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* renamed from: B */
    public int mo101682h(C34505y2 y2Var) {
        return y2Var.mo101708d();
    }

    /* renamed from: C */
    public int mo101683i(C34505y2 y2Var) {
        return y2Var.mo101709e();
    }

    /* renamed from: D */
    public C34505y2 mo101685k(C34505y2 y2Var, C34505y2 y2Var2) {
        if (y2Var2.equals(C34505y2.m140700c())) {
            return y2Var;
        }
        return C34505y2.m140703m(y2Var, y2Var2);
    }

    /* renamed from: E */
    public C34505y2 mo101688n() {
        return C34505y2.m140704n();
    }

    /* renamed from: F */
    public void mo101689o(Object obj, C34505y2 y2Var) {
        mo101690p(obj, y2Var);
    }

    /* renamed from: G */
    public void mo101690p(Object obj, C34505y2 y2Var) {
        ((GeneratedMessageLite) obj).unknownFields = y2Var;
    }

    /* renamed from: H */
    public C34505y2 mo101692r(C34505y2 y2Var) {
        y2Var.mo101711h();
        return y2Var;
    }

    /* renamed from: I */
    public void mo101693s(C34505y2 y2Var, Writer writer) throws IOException {
        y2Var.mo101720t(writer);
    }

    /* renamed from: J */
    public void mo101694t(C34505y2 y2Var, Writer writer) throws IOException {
        y2Var.mo101722w(writer);
    }

    /* renamed from: j */
    public void mo101684j(Object obj) {
        mo101681g(obj).mo101711h();
    }

    /* renamed from: q */
    public boolean mo101691q(C34366f2 f2Var) {
        return false;
    }

    /* renamed from: u */
    public void mo101675a(C34505y2 y2Var, int i, int i2) {
        y2Var.mo101718q(WireFormat.m138723c(i, 5), Integer.valueOf(i2));
    }

    /* renamed from: v */
    public void mo101676b(C34505y2 y2Var, int i, long j) {
        y2Var.mo101718q(WireFormat.m138723c(i, 1), Long.valueOf(j));
    }

    /* renamed from: w */
    public void mo101677c(C34505y2 y2Var, int i, C34505y2 y2Var2) {
        y2Var.mo101718q(WireFormat.m138723c(i, 3), y2Var2);
    }

    /* renamed from: x */
    public void mo101678d(C34505y2 y2Var, int i, ByteString byteString) {
        y2Var.mo101718q(WireFormat.m138723c(i, 2), byteString);
    }

    /* renamed from: y */
    public void mo101679e(C34505y2 y2Var, int i, long j) {
        y2Var.mo101718q(WireFormat.m138723c(i, 0), Long.valueOf(j));
    }

    /* renamed from: z */
    public C34505y2 mo101680f(Object obj) {
        C34505y2 A = mo101681g(obj);
        if (A != C34505y2.m140700c()) {
            return A;
        }
        C34505y2 n = C34505y2.m140704n();
        mo101690p(obj, n);
        return n;
    }
}
