package com.bumptech.glide.load.model.stream;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.android.volley.C21755g;
import com.bumptech.glide.load.C22139e;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.data.C22124j;
import com.bumptech.glide.load.model.C22309g;
import com.bumptech.glide.load.model.C22320m;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.load.model.C22325o;
import com.bumptech.glide.load.model.C22331r;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.stream.b */
public class C22341b implements C22323n<C22309g, InputStream> {

    /* renamed from: b */
    public static final C22139e<Integer> f57374b = C22139e.m100836g("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(C21755g.f56277e));
    @C0363p0

    /* renamed from: a */
    public final C22320m<C22309g, C22309g> f57375a;

    /* renamed from: com.bumptech.glide.load.model.stream.b$a */
    public static class C22342a implements C22325o<C22309g, InputStream> {

        /* renamed from: a */
        public final C22320m<C22309g, C22309g> f57376a = new C22320m<>(500);

        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<C22309g, InputStream> mo66245c(C22331r rVar) {
            return new C22341b(this.f57376a);
        }
    }

    public C22341b() {
        this((C22320m<C22309g, C22309g>) null);
    }

    /* renamed from: c */
    public C22323n.C22324a<InputStream> mo66240b(@C0359n0 C22309g gVar, int i, int i2, @C0359n0 C22277f fVar) {
        C22320m<C22309g, C22309g> mVar = this.f57375a;
        if (mVar != null) {
            C22309g b = mVar.mo66299b(gVar, 0, 0);
            if (b == null) {
                this.f57375a.mo66300c(gVar, 0, 0, gVar);
            } else {
                gVar = b;
            }
        }
        return new C22323n.C22324a<>(gVar, new C22124j(gVar, ((Integer) fVar.mo66232c(f57374b)).intValue()));
    }

    /* renamed from: d */
    public boolean mo66239a(@C0359n0 C22309g gVar) {
        return true;
    }

    public C22341b(@C0363p0 C22320m<C22309g, C22309g> mVar) {
        this.f57375a = mVar;
    }
}
