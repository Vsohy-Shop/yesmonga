package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.x3 */
public class C18906x3 extends C18888v3<C18900w3, C18900w3> {
    /* renamed from: A */
    public C18900w3 mo55462g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* renamed from: B */
    public int mo55463h(C18900w3 w3Var) {
        return w3Var.mo55562f();
    }

    /* renamed from: C */
    public int mo55464i(C18900w3 w3Var) {
        return w3Var.mo55563g();
    }

    /* renamed from: D */
    public C18900w3 mo55466k(C18900w3 w3Var, C18900w3 w3Var2) {
        if (w3Var2.equals(C18900w3.m87953e())) {
            return w3Var;
        }
        return C18900w3.m87956o(w3Var, w3Var2);
    }

    /* renamed from: E */
    public C18900w3 mo55469n() {
        return C18900w3.m87957p();
    }

    /* renamed from: F */
    public void mo55470o(Object obj, C18900w3 w3Var) {
        mo55471p(obj, w3Var);
    }

    /* renamed from: G */
    public void mo55471p(Object obj, C18900w3 w3Var) {
        ((GeneratedMessageLite) obj).unknownFields = w3Var;
    }

    /* renamed from: H */
    public C18900w3 mo55473r(C18900w3 w3Var) {
        w3Var.mo55565j();
        return w3Var;
    }

    /* renamed from: I */
    public void mo55474s(C18900w3 w3Var, Writer writer) throws IOException {
        w3Var.mo55573t(writer);
    }

    /* renamed from: J */
    public void mo55475t(C18900w3 w3Var, Writer writer) throws IOException {
        w3Var.mo55575w(writer);
    }

    /* renamed from: j */
    public void mo55465j(Object obj) {
        mo55462g(obj).mo55565j();
    }

    /* renamed from: q */
    public boolean mo55472q(C18899w2 w2Var) {
        return false;
    }

    /* renamed from: u */
    public void mo55456a(C18900w3 w3Var, int i, int i2) {
        w3Var.mo55571r(WireFormat.m85346c(i, 5), Integer.valueOf(i2));
    }

    /* renamed from: v */
    public void mo55457b(C18900w3 w3Var, int i, long j) {
        w3Var.mo55571r(WireFormat.m85346c(i, 1), Long.valueOf(j));
    }

    /* renamed from: w */
    public void mo55458c(C18900w3 w3Var, int i, C18900w3 w3Var2) {
        w3Var.mo55571r(WireFormat.m85346c(i, 3), w3Var2);
    }

    /* renamed from: x */
    public void mo55459d(C18900w3 w3Var, int i, ByteString byteString) {
        w3Var.mo55571r(WireFormat.m85346c(i, 2), byteString);
    }

    /* renamed from: y */
    public void mo55460e(C18900w3 w3Var, int i, long j) {
        w3Var.mo55571r(WireFormat.m85346c(i, 0), Long.valueOf(j));
    }

    /* renamed from: z */
    public C18900w3 mo55461f(Object obj) {
        C18900w3 A = mo55462g(obj);
        if (A != C18900w3.m87953e()) {
            return A;
        }
        C18900w3 p = C18900w3.m87957p();
        mo55471p(obj, p);
        return p;
    }
}
