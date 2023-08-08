package com.bumptech.glide.load.data;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.data.C22116e;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.k */
public final class C22127k implements C22116e<InputStream> {

    /* renamed from: b */
    public static final int f56823b = 5242880;

    /* renamed from: a */
    public final RecyclableBufferedInputStream f56824a;

    /* renamed from: com.bumptech.glide.load.data.k$a */
    public static final class C22128a implements C22116e.C22117a<InputStream> {

        /* renamed from: a */
        public final C22157b f56825a;

        public C22128a(C22157b bVar) {
            this.f56825a = bVar;
        }

        @C0359n0
        /* renamed from: a */
        public Class<InputStream> mo65781a() {
            return InputStream.class;
        }

        @C0359n0
        /* renamed from: c */
        public C22116e<InputStream> mo65782b(InputStream inputStream) {
            return new C22127k(inputStream, this.f56825a);
        }
    }

    public C22127k(InputStream inputStream, C22157b bVar) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        this.f56824a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    /* renamed from: b */
    public void mo65778b() {
        this.f56824a.release();
    }

    /* renamed from: c */
    public void mo65821c() {
        this.f56824a.mo66381b();
    }

    @C0359n0
    /* renamed from: d */
    public InputStream mo65777a() throws IOException {
        this.f56824a.reset();
        return this.f56824a;
    }
}
