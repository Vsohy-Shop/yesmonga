package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* renamed from: androidx.datastore.preferences.protobuf.d */
public abstract class C18703d {

    /* renamed from: androidx.datastore.preferences.protobuf.d$a */
    public static class C18704a extends C18703d {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f47835a;

        public C18704a(ByteBuffer byteBuffer) {
            this.f47835a = byteBuffer;
        }

        /* renamed from: a */
        public byte[] mo54488a() {
            return this.f47835a.array();
        }

        /* renamed from: b */
        public int mo54489b() {
            return this.f47835a.arrayOffset();
        }

        /* renamed from: c */
        public boolean mo54490c() {
            return this.f47835a.hasArray();
        }

        /* renamed from: d */
        public boolean mo54491d() {
            return true;
        }

        /* renamed from: e */
        public int mo54492e() {
            return this.f47835a.limit();
        }

        /* renamed from: f */
        public ByteBuffer mo54493f() {
            return this.f47835a;
        }

        /* renamed from: g */
        public int mo54494g() {
            return this.f47835a.position();
        }

        /* renamed from: h */
        public C18703d mo54495h(int i) {
            this.f47835a.position(i);
            return this;
        }

        /* renamed from: i */
        public int mo54496i() {
            return this.f47835a.remaining();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.d$b */
    public static class C18705b extends C18703d {

        /* renamed from: a */
        public int f47836a;

        /* renamed from: b */
        public final /* synthetic */ byte[] f47837b;

        /* renamed from: c */
        public final /* synthetic */ int f47838c;

        /* renamed from: d */
        public final /* synthetic */ int f47839d;

        public C18705b(byte[] bArr, int i, int i2) {
            this.f47837b = bArr;
            this.f47838c = i;
            this.f47839d = i2;
        }

        /* renamed from: a */
        public byte[] mo54488a() {
            return this.f47837b;
        }

        /* renamed from: b */
        public int mo54489b() {
            return this.f47838c;
        }

        /* renamed from: c */
        public boolean mo54490c() {
            return true;
        }

        /* renamed from: d */
        public boolean mo54491d() {
            return false;
        }

        /* renamed from: e */
        public int mo54492e() {
            return this.f47839d;
        }

        /* renamed from: f */
        public ByteBuffer mo54493f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public int mo54494g() {
            return this.f47836a;
        }

        /* renamed from: h */
        public C18703d mo54495h(int i) {
            if (i < 0 || i > this.f47839d) {
                throw new IllegalArgumentException("Invalid position: " + i);
            }
            this.f47836a = i;
            return this;
        }

        /* renamed from: i */
        public int mo54496i() {
            return this.f47839d - this.f47836a;
        }
    }

    /* renamed from: j */
    public static C18703d m85726j(ByteBuffer byteBuffer) {
        C18753i1.m86341e(byteBuffer, "buffer");
        return new C18704a(byteBuffer);
    }

    /* renamed from: k */
    public static C18703d m85727k(byte[] bArr) {
        return m85729m(bArr, 0, bArr.length);
    }

    /* renamed from: l */
    public static C18703d m85728l(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            return m85729m(bArr, i, i2);
        }
        throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: m */
    public static C18703d m85729m(byte[] bArr, int i, int i2) {
        return new C18705b(bArr, i, i2);
    }

    /* renamed from: a */
    public abstract byte[] mo54488a();

    /* renamed from: b */
    public abstract int mo54489b();

    /* renamed from: c */
    public abstract boolean mo54490c();

    /* renamed from: d */
    public abstract boolean mo54491d();

    /* renamed from: e */
    public abstract int mo54492e();

    /* renamed from: f */
    public abstract ByteBuffer mo54493f();

    /* renamed from: g */
    public abstract int mo54494g();

    /* renamed from: h */
    public abstract C18703d mo54495h(int i);

    /* renamed from: i */
    public abstract int mo54496i();
}
