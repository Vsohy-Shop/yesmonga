package com.bumptech.glide.load.model;

import android.net.Uri;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.model.C22323n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.model.x */
public class C22371x<Data> implements C22323n<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f57410b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    public final C22323n<C22309g, Data> f57411a;

    /* renamed from: com.bumptech.glide.load.model.x$a */
    public static class C22372a implements C22325o<Uri, InputStream> {
        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<Uri, InputStream> mo66245c(C22331r rVar) {
            return new C22371x(rVar.mo66323d(C22309g.class, InputStream.class));
        }
    }

    public C22371x(C22323n<C22309g, Data> nVar) {
        this.f57411a = nVar;
    }

    /* renamed from: c */
    public C22323n.C22324a<Data> mo66240b(@C0359n0 Uri uri, int i, int i2, @C0359n0 C22277f fVar) {
        return this.f57411a.mo66240b(new C22309g(uri.toString()), i, i2, fVar);
    }

    /* renamed from: d */
    public boolean mo66239a(@C0359n0 Uri uri) {
        return f57410b.contains(uri.getScheme());
    }
}
