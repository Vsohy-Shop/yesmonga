package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.data.C22111a;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.data.C22123i;
import com.bumptech.glide.load.data.C22138n;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.signature.C22613e;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.model.w */
public class C22366w<Data> implements C22323n<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f57405b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a */
    public final C22369c<Data> f57406a;

    /* renamed from: com.bumptech.glide.load.model.w$a */
    public static final class C22367a implements C22325o<Uri, AssetFileDescriptor>, C22369c<AssetFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f57407a;

        public C22367a(ContentResolver contentResolver) {
            this.f57407a = contentResolver;
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        /* renamed from: b */
        public C22114d<AssetFileDescriptor> mo66359b(Uri uri) {
            return new C22111a(this.f57407a, uri);
        }

        /* renamed from: c */
        public C22323n<Uri, AssetFileDescriptor> mo66245c(C22331r rVar) {
            return new C22366w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.w$b */
    public static class C22368b implements C22325o<Uri, ParcelFileDescriptor>, C22369c<ParcelFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f57408a;

        public C22368b(ContentResolver contentResolver) {
            this.f57408a = contentResolver;
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        /* renamed from: b */
        public C22114d<ParcelFileDescriptor> mo66359b(Uri uri) {
            return new C22123i(this.f57408a, uri);
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<Uri, ParcelFileDescriptor> mo66245c(C22331r rVar) {
            return new C22366w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.w$c */
    public interface C22369c<Data> {
        /* renamed from: b */
        C22114d<Data> mo66359b(Uri uri);
    }

    /* renamed from: com.bumptech.glide.load.model.w$d */
    public static class C22370d implements C22325o<Uri, InputStream>, C22369c<InputStream> {

        /* renamed from: a */
        public final ContentResolver f57409a;

        public C22370d(ContentResolver contentResolver) {
            this.f57409a = contentResolver;
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        /* renamed from: b */
        public C22114d<InputStream> mo66359b(Uri uri) {
            return new C22138n(this.f57409a, uri);
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<Uri, InputStream> mo66245c(C22331r rVar) {
            return new C22366w(this);
        }
    }

    public C22366w(C22369c<Data> cVar) {
        this.f57406a = cVar;
    }

    /* renamed from: c */
    public C22323n.C22324a<Data> mo66240b(@C0359n0 Uri uri, int i, int i2, @C0359n0 C22277f fVar) {
        return new C22323n.C22324a<>(new C22613e(uri), this.f57406a.mo66359b(uri));
    }

    /* renamed from: d */
    public boolean mo66239a(@C0359n0 Uri uri) {
        return f57405b.contains(uri.getScheme());
    }
}
