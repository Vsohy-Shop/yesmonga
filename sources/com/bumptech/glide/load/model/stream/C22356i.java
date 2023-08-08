package com.bumptech.glide.load.model.stream;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.model.C22309g;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.load.model.C22325o;
import com.bumptech.glide.load.model.C22331r;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.model.stream.i */
public class C22356i implements C22323n<URL, InputStream> {

    /* renamed from: a */
    public final C22323n<C22309g, InputStream> f57398a;

    /* renamed from: com.bumptech.glide.load.model.stream.i$a */
    public static class C22357a implements C22325o<URL, InputStream> {
        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<URL, InputStream> mo66245c(C22331r rVar) {
            return new C22356i(rVar.mo66323d(C22309g.class, InputStream.class));
        }
    }

    public C22356i(C22323n<C22309g, InputStream> nVar) {
        this.f57398a = nVar;
    }

    /* renamed from: c */
    public C22323n.C22324a<InputStream> mo66240b(@C0359n0 URL url, int i, int i2, @C0359n0 C22277f fVar) {
        return this.f57398a.mo66240b(new C22309g(url), i, i2, fVar);
    }

    /* renamed from: d */
    public boolean mo66239a(@C0359n0 URL url) {
        return true;
    }
}
