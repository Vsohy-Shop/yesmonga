package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.v3 */
public abstract class C18888v3<T, B> {
    /* renamed from: a */
    public abstract void mo55456a(B b, int i, int i2);

    /* renamed from: b */
    public abstract void mo55457b(B b, int i, long j);

    /* renamed from: c */
    public abstract void mo55458c(B b, int i, T t);

    /* renamed from: d */
    public abstract void mo55459d(B b, int i, ByteString byteString);

    /* renamed from: e */
    public abstract void mo55460e(B b, int i, long j);

    /* renamed from: f */
    public abstract B mo55461f(Object obj);

    /* renamed from: g */
    public abstract T mo55462g(Object obj);

    /* renamed from: h */
    public abstract int mo55463h(T t);

    /* renamed from: i */
    public abstract int mo55464i(T t);

    /* renamed from: j */
    public abstract void mo55465j(Object obj);

    /* renamed from: k */
    public abstract T mo55466k(T t, T t2);

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55467l(B r3, androidx.datastore.preferences.protobuf.C18899w2 r4) throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.mo55015z()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.mo55468m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18888v3.mo55467l(java.lang.Object, androidx.datastore.preferences.protobuf.w2):void");
    }

    /* renamed from: m */
    public final boolean mo55468m(B b, C18899w2 w2Var) throws IOException {
        int B = w2Var.mo54948B();
        int a = WireFormat.m85344a(B);
        int b2 = WireFormat.m85345b(B);
        if (b2 == 0) {
            mo55460e(b, a, w2Var.mo54954I());
            return true;
        } else if (b2 == 1) {
            mo55457b(b, a, w2Var.mo54970a());
            return true;
        } else if (b2 == 2) {
            mo55459d(b, a, w2Var.mo54996n());
            return true;
        } else if (b2 == 3) {
            Object n = mo55469n();
            int c = WireFormat.m85346c(a, 4);
            mo55467l(n, w2Var);
            if (c == w2Var.mo54948B()) {
                mo55458c(b, a, mo55473r(n));
                return true;
            }
            throw InvalidProtocolBufferException.m85085b();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                mo55456a(b, a, w2Var.mo55009t());
                return true;
            }
            throw InvalidProtocolBufferException.m85088e();
        }
    }

    /* renamed from: n */
    public abstract B mo55469n();

    /* renamed from: o */
    public abstract void mo55470o(Object obj, B b);

    /* renamed from: p */
    public abstract void mo55471p(Object obj, T t);

    /* renamed from: q */
    public abstract boolean mo55472q(C18899w2 w2Var);

    /* renamed from: r */
    public abstract T mo55473r(B b);

    /* renamed from: s */
    public abstract void mo55474s(T t, Writer writer) throws IOException;

    /* renamed from: t */
    public abstract void mo55475t(T t, Writer writer) throws IOException;
}
