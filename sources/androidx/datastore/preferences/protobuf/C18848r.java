package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* renamed from: androidx.datastore.preferences.protobuf.r */
public abstract class C18848r {

    /* renamed from: a */
    public static final C18848r f47986a = new C18849a();

    /* renamed from: androidx.datastore.preferences.protobuf.r$a */
    public static class C18849a extends C18848r {
        /* renamed from: a */
        public C18703d mo55353a(int i) {
            return C18703d.m85726j(ByteBuffer.allocateDirect(i));
        }

        /* renamed from: b */
        public C18703d mo55354b(int i) {
            return C18703d.m85727k(new byte[i]);
        }
    }

    /* renamed from: c */
    public static C18848r m87332c() {
        return f47986a;
    }

    /* renamed from: a */
    public abstract C18703d mo55353a(int i);

    /* renamed from: b */
    public abstract C18703d mo55354b(int i);
}
