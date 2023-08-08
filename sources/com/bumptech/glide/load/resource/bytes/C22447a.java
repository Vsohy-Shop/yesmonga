package com.bumptech.glide.load.resource.bytes;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.data.C22116e;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bytes.a */
public class C22447a implements C22116e<ByteBuffer> {

    /* renamed from: a */
    public final ByteBuffer f57589a;

    /* renamed from: com.bumptech.glide.load.resource.bytes.a$a */
    public static class C22448a implements C22116e.C22117a<ByteBuffer> {
        @C0359n0
        /* renamed from: a */
        public Class<ByteBuffer> mo65781a() {
            return ByteBuffer.class;
        }

        @C0359n0
        /* renamed from: c */
        public C22116e<ByteBuffer> mo65782b(ByteBuffer byteBuffer) {
            return new C22447a(byteBuffer);
        }
    }

    public C22447a(ByteBuffer byteBuffer) {
        this.f57589a = byteBuffer;
    }

    /* renamed from: b */
    public void mo65778b() {
    }

    @C0359n0
    /* renamed from: c */
    public ByteBuffer mo65777a() {
        this.f57589a.position(0);
        return this.f57589a;
    }
}
