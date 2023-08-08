package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.bumptech.glide.load.data.mediastore.C22133c;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.load.model.C22325o;
import com.bumptech.glide.load.model.C22331r;
import com.bumptech.glide.signature.C22613e;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.stream.d */
public class C22345d implements C22323n<Uri, InputStream> {

    /* renamed from: a */
    public final Context f57377a;

    /* renamed from: com.bumptech.glide.load.model.stream.d$a */
    public static class C22346a implements C22325o<Uri, InputStream> {

        /* renamed from: a */
        public final Context f57378a;

        public C22346a(Context context) {
            this.f57378a = context;
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<Uri, InputStream> mo66245c(C22331r rVar) {
            return new C22345d(this.f57378a);
        }
    }

    public C22345d(Context context) {
        this.f57377a = context.getApplicationContext();
    }

    /* renamed from: c */
    public C22323n.C22324a<InputStream> mo66240b(@C0359n0 Uri uri, int i, int i2, @C0359n0 C22277f fVar) {
        if (C22132b.m100808d(i, i2)) {
            return new C22323n.C22324a<>(new C22613e(uri), C22133c.m100811f(this.f57377a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo66239a(@C0359n0 Uri uri) {
        return C22132b.m100805a(uri);
    }
}
