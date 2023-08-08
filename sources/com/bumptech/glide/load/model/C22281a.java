package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.data.C22122h;
import com.bumptech.glide.load.data.C22130m;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.signature.C22613e;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.a */
public class C22281a<Data> implements C22323n<Uri, Data> {

    /* renamed from: c */
    public static final String f57280c = "android_asset";

    /* renamed from: d */
    public static final String f57281d = "file:///android_asset/";

    /* renamed from: e */
    public static final int f57282e = 22;

    /* renamed from: a */
    public final AssetManager f57283a;

    /* renamed from: b */
    public final C22282a<Data> f57284b;

    /* renamed from: com.bumptech.glide.load.model.a$a */
    public interface C22282a<Data> {
        /* renamed from: b */
        C22114d<Data> mo66243b(AssetManager assetManager, String str);
    }

    /* renamed from: com.bumptech.glide.load.model.a$b */
    public static class C22283b implements C22325o<Uri, AssetFileDescriptor>, C22282a<AssetFileDescriptor> {

        /* renamed from: a */
        public final AssetManager f57285a;

        public C22283b(AssetManager assetManager) {
            this.f57285a = assetManager;
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        /* renamed from: b */
        public C22114d<AssetFileDescriptor> mo66243b(AssetManager assetManager, String str) {
            return new C22122h(assetManager, str);
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<Uri, AssetFileDescriptor> mo66245c(C22331r rVar) {
            return new C22281a(this.f57285a, this);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.a$c */
    public static class C22284c implements C22325o<Uri, InputStream>, C22282a<InputStream> {

        /* renamed from: a */
        public final AssetManager f57286a;

        public C22284c(AssetManager assetManager) {
            this.f57286a = assetManager;
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        /* renamed from: b */
        public C22114d<InputStream> mo66243b(AssetManager assetManager, String str) {
            return new C22130m(assetManager, str);
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<Uri, InputStream> mo66245c(C22331r rVar) {
            return new C22281a(this.f57286a, this);
        }
    }

    public C22281a(AssetManager assetManager, C22282a<Data> aVar) {
        this.f57283a = assetManager;
        this.f57284b = aVar;
    }

    /* renamed from: c */
    public C22323n.C22324a<Data> mo66240b(@C0359n0 Uri uri, int i, int i2, @C0359n0 C22277f fVar) {
        return new C22323n.C22324a<>(new C22613e(uri), this.f57284b.mo66243b(this.f57283a, uri.toString().substring(f57282e)));
    }

    /* renamed from: d */
    public boolean mo66239a(@C0359n0 Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !f57280c.equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
