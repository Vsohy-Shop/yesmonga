package com.bumptech.glide.load.engine.cache;

import androidx.annotation.C0359n0;
import androidx.core.util.C17997q;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.util.C22629j;
import com.bumptech.glide.util.C22633m;
import com.bumptech.glide.util.C22635o;
import com.bumptech.glide.util.pool.C22639a;
import com.bumptech.glide.util.pool.C22648c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bumptech.glide.load.engine.cache.m */
public class C22212m {

    /* renamed from: a */
    public final C22629j<C22108c, String> f57056a = new C22629j<>(1000);

    /* renamed from: b */
    public final C17997q.C17998a<C22214b> f57057b = C22639a.m102662e(10, new C22213a());

    /* renamed from: com.bumptech.glide.load.engine.cache.m$a */
    public class C22213a implements C22639a.C22643d<C22214b> {
        public C22213a() {
        }

        /* renamed from: b */
        public C22214b mo66065a() {
            try {
                return new C22214b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.m$b */
    public static final class C22214b implements C22639a.C22645f {

        /* renamed from: a */
        public final MessageDigest f57059a;

        /* renamed from: b */
        public final C22648c f57060b = C22648c.m102683a();

        public C22214b(MessageDigest messageDigest) {
            this.f57059a = messageDigest;
        }

        @C0359n0
        /* renamed from: g */
        public C22648c mo65861g() {
            return this.f57060b;
        }
    }

    /* renamed from: a */
    public final String mo66063a(C22108c cVar) {
        C22214b bVar = (C22214b) C22633m.m102624d(this.f57057b.mo52469b());
        try {
            cVar.mo65773b(bVar.f57059a);
            return C22635o.m102651z(bVar.f57059a.digest());
        } finally {
            this.f57057b.mo52468a(bVar);
        }
    }

    /* renamed from: b */
    public String mo66064b(C22108c cVar) {
        String k;
        synchronized (this.f57056a) {
            k = this.f57056a.mo66994k(cVar);
        }
        if (k == null) {
            k = mo66063a(cVar);
        }
        synchronized (this.f57056a) {
            this.f57056a.mo66996o(cVar, k);
        }
        return k;
    }
}
