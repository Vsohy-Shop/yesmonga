package com.google.protobuf;

import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.d */
public abstract class C34347d {

    /* renamed from: com.google.protobuf.d$a */
    public static class C34348a extends C34347d {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f83242a;

        public C34348a(ByteBuffer byteBuffer) {
            this.f83242a = byteBuffer;
        }

        /* renamed from: a */
        public byte[] mo101011a() {
            return this.f83242a.array();
        }

        /* renamed from: b */
        public int mo101012b() {
            return this.f83242a.arrayOffset();
        }

        /* renamed from: c */
        public boolean mo101013c() {
            return this.f83242a.hasArray();
        }

        /* renamed from: d */
        public boolean mo101014d() {
            return true;
        }

        /* renamed from: e */
        public int mo101015e() {
            return this.f83242a.limit();
        }

        /* renamed from: f */
        public ByteBuffer mo101016f() {
            return this.f83242a;
        }

        /* renamed from: g */
        public int mo101017g() {
            return this.f83242a.position();
        }

        /* renamed from: h */
        public C34347d mo101018h(int i) {
            this.f83242a.position(i);
            return this;
        }

        /* renamed from: i */
        public int mo101019i() {
            return this.f83242a.remaining();
        }
    }

    /* renamed from: com.google.protobuf.d$b */
    public static class C34349b extends C34347d {

        /* renamed from: a */
        public int f83243a;

        /* renamed from: b */
        public final /* synthetic */ byte[] f83244b;

        /* renamed from: c */
        public final /* synthetic */ int f83245c;

        /* renamed from: d */
        public final /* synthetic */ int f83246d;

        public C34349b(byte[] bArr, int i, int i2) {
            this.f83244b = bArr;
            this.f83245c = i;
            this.f83246d = i2;
        }

        /* renamed from: a */
        public byte[] mo101011a() {
            return this.f83244b;
        }

        /* renamed from: b */
        public int mo101012b() {
            return this.f83245c;
        }

        /* renamed from: c */
        public boolean mo101013c() {
            return true;
        }

        /* renamed from: d */
        public boolean mo101014d() {
            return false;
        }

        /* renamed from: e */
        public int mo101015e() {
            return this.f83246d;
        }

        /* renamed from: f */
        public ByteBuffer mo101016f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public int mo101017g() {
            return this.f83243a;
        }

        /* renamed from: h */
        public C34347d mo101018h(int i) {
            if (i < 0 || i > this.f83246d) {
                throw new IllegalArgumentException("Invalid position: " + i);
            }
            this.f83243a = i;
            return this;
        }

        /* renamed from: i */
        public int mo101019i() {
            return this.f83246d - this.f83243a;
        }
    }

    /* renamed from: j */
    public static C34347d m139111j(ByteBuffer byteBuffer) {
        C34471v0.m140574e(byteBuffer, "buffer");
        return new C34348a(byteBuffer);
    }

    /* renamed from: k */
    public static C34347d m139112k(byte[] bArr) {
        return m139114m(bArr, 0, bArr.length);
    }

    /* renamed from: l */
    public static C34347d m139113l(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            return m139114m(bArr, i, i2);
        }
        throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: m */
    public static C34347d m139114m(byte[] bArr, int i, int i2) {
        return new C34349b(bArr, i, i2);
    }

    /* renamed from: a */
    public abstract byte[] mo101011a();

    /* renamed from: b */
    public abstract int mo101012b();

    /* renamed from: c */
    public abstract boolean mo101013c();

    /* renamed from: d */
    public abstract boolean mo101014d();

    /* renamed from: e */
    public abstract int mo101015e();

    /* renamed from: f */
    public abstract ByteBuffer mo101016f();

    /* renamed from: g */
    public abstract int mo101017g();

    /* renamed from: h */
    public abstract C34347d mo101018h(int i);

    /* renamed from: i */
    public abstract int mo101019i();
}
