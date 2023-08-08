package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.model.C22323n;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.u */
public class C22359u<Data> implements C22323n<String, Data> {

    /* renamed from: a */
    public final C22323n<Uri, Data> f57401a;

    /* renamed from: com.bumptech.glide.load.model.u$a */
    public static final class C22360a implements C22325o<String, AssetFileDescriptor> {
        /* renamed from: a */
        public void mo66244a() {
        }

        /* renamed from: c */
        public C22323n<String, AssetFileDescriptor> mo66245c(@C0359n0 C22331r rVar) {
            return new C22359u(rVar.mo66323d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.model.u$b */
    public static class C22361b implements C22325o<String, ParcelFileDescriptor> {
        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<String, ParcelFileDescriptor> mo66245c(@C0359n0 C22331r rVar) {
            return new C22359u(rVar.mo66323d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.model.u$c */
    public static class C22362c implements C22325o<String, InputStream> {
        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<String, InputStream> mo66245c(@C0359n0 C22331r rVar) {
            return new C22359u(rVar.mo66323d(Uri.class, InputStream.class));
        }
    }

    public C22359u(C22323n<Uri, Data> nVar) {
        this.f57401a = nVar;
    }

    @C0363p0
    /* renamed from: e */
    public static Uri m101574e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m101575f(str);
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return m101575f(str);
        }
        return parse;
    }

    /* renamed from: f */
    public static Uri m101575f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public C22323n.C22324a<Data> mo66240b(@C0359n0 String str, int i, int i2, @C0359n0 C22277f fVar) {
        Uri e = m101574e(str);
        if (e == null || !this.f57401a.mo66239a(e)) {
            return null;
        }
        return this.f57401a.mo66240b(e, i, i2, fVar);
    }

    /* renamed from: d */
    public boolean mo66239a(@C0359n0 String str) {
        return true;
    }
}
