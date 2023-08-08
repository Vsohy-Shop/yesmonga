package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.bumptech.glide.load.data.mediastore.C22133c;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.load.model.C22325o;
import com.bumptech.glide.load.model.C22331r;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.signature.C22613e;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.stream.e */
public class C22347e implements C22323n<Uri, InputStream> {

    /* renamed from: a */
    public final Context f57379a;

    /* renamed from: com.bumptech.glide.load.model.stream.e$a */
    public static class C22348a implements C22325o<Uri, InputStream> {

        /* renamed from: a */
        public final Context f57380a;

        public C22348a(Context context) {
            this.f57380a = context;
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<Uri, InputStream> mo66245c(C22331r rVar) {
            return new C22347e(this.f57380a);
        }
    }

    public C22347e(Context context) {
        this.f57379a = context.getApplicationContext();
    }

    @C0363p0
    /* renamed from: c */
    public C22323n.C22324a<InputStream> mo66240b(@C0359n0 Uri uri, int i, int i2, @C0359n0 C22277f fVar) {
        if (!C22132b.m100808d(i, i2) || !mo66345e(fVar)) {
            return null;
        }
        return new C22323n.C22324a<>(new C22613e(uri), C22133c.m100812g(this.f57379a, uri));
    }

    /* renamed from: d */
    public boolean mo66239a(@C0359n0 Uri uri) {
        return C22132b.m100807c(uri);
    }

    /* renamed from: e */
    public final boolean mo66345e(C22277f fVar) {
        Long l = (Long) fVar.mo66232c(VideoDecoder.f57463g);
        if (l == null || l.longValue() != -1) {
            return false;
        }
        return true;
    }
}
