package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.signature.C22613e;
import com.carrefour.fid.android.core.constants.C36174e;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.model.k */
public final class C22316k implements C22323n<Uri, File> {

    /* renamed from: a */
    public final Context f57328a;

    /* renamed from: com.bumptech.glide.load.model.k$a */
    public static final class C22317a implements C22325o<Uri, File> {

        /* renamed from: a */
        public final Context f57329a;

        public C22317a(Context context) {
            this.f57329a = context;
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<Uri, File> mo66245c(C22331r rVar) {
            return new C22316k(this.f57329a);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.k$b */
    public static class C22318b implements C22114d<File> {

        /* renamed from: c */
        public static final String[] f57330c = {C36174e.f89292d};

        /* renamed from: a */
        public final Context f57331a;

        /* renamed from: b */
        public final Uri f57332b;

        public C22318b(Context context, Uri uri) {
            this.f57331a = context;
            this.f57332b = uri;
        }

        @C0359n0
        /* renamed from: a */
        public Class<File> mo65784a() {
            return File.class;
        }

        /* renamed from: b */
        public void mo65789b() {
        }

        public void cancel() {
        }

        @C0359n0
        /* renamed from: d */
        public DataSource mo65792d() {
            return DataSource.LOCAL;
        }

        /* renamed from: e */
        public void mo65793e(@C0359n0 Priority priority, @C0359n0 C22114d.C22115a<? super File> aVar) {
            Cursor query = this.f57331a.getContentResolver().query(this.f57332b, f57330c, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow(C36174e.f89292d));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.mo65803c(new FileNotFoundException("Failed to find file path for: " + this.f57332b));
                return;
            }
            aVar.mo65804f(new File(str));
        }
    }

    public C22316k(Context context) {
        this.f57328a = context;
    }

    /* renamed from: c */
    public C22323n.C22324a<File> mo66240b(@C0359n0 Uri uri, int i, int i2, @C0359n0 C22277f fVar) {
        return new C22323n.C22324a<>(new C22613e(uri), new C22318b(this.f57328a, uri));
    }

    /* renamed from: d */
    public boolean mo66239a(@C0359n0 Uri uri) {
        return C22132b.m100806b(uri);
    }
}
