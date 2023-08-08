package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.model.C22323n;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.s */
public class C22335s<Data> implements C22323n<Integer, Data> {

    /* renamed from: c */
    public static final String f57365c = "ResourceLoader";

    /* renamed from: a */
    public final C22323n<Uri, Data> f57366a;

    /* renamed from: b */
    public final Resources f57367b;

    /* renamed from: com.bumptech.glide.load.model.s$a */
    public static final class C22336a implements C22325o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        public final Resources f57368a;

        public C22336a(Resources resources) {
            this.f57368a = resources;
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        /* renamed from: c */
        public C22323n<Integer, AssetFileDescriptor> mo66245c(C22331r rVar) {
            return new C22335s(this.f57368a, rVar.mo66323d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.model.s$b */
    public static class C22337b implements C22325o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        public final Resources f57369a;

        public C22337b(Resources resources) {
            this.f57369a = resources;
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<Integer, ParcelFileDescriptor> mo66245c(C22331r rVar) {
            return new C22335s(this.f57369a, rVar.mo66323d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.model.s$c */
    public static class C22338c implements C22325o<Integer, InputStream> {

        /* renamed from: a */
        public final Resources f57370a;

        public C22338c(Resources resources) {
            this.f57370a = resources;
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<Integer, InputStream> mo66245c(C22331r rVar) {
            return new C22335s(this.f57370a, rVar.mo66323d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.model.s$d */
    public static class C22339d implements C22325o<Integer, Uri> {

        /* renamed from: a */
        public final Resources f57371a;

        public C22339d(Resources resources) {
            this.f57371a = resources;
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<Integer, Uri> mo66245c(C22331r rVar) {
            return new C22335s(this.f57371a, C22363v.m101586c());
        }
    }

    public C22335s(Resources resources, C22323n<Uri, Data> nVar) {
        this.f57367b = resources;
        this.f57366a = nVar;
    }

    /* renamed from: c */
    public C22323n.C22324a<Data> mo66240b(@C0359n0 Integer num, int i, int i2, @C0359n0 C22277f fVar) {
        Uri d = mo66334d(num);
        if (d == null) {
            return null;
        }
        return this.f57366a.mo66240b(d, i, i2, fVar);
    }

    @C0363p0
    /* renamed from: d */
    public final Uri mo66334d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f57367b.getResourcePackageName(num.intValue()) + '/' + this.f57367b.getResourceTypeName(num.intValue()) + '/' + this.f57367b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable(f57365c, 5)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Received invalid resource id: ");
            sb.append(num);
            return null;
        }
    }

    /* renamed from: e */
    public boolean mo66239a(@C0359n0 Integer num) {
        return true;
    }
}
