package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.data.C22121g;
import com.carrefour.fid.android.core.constants.C36174e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.mediastore.c */
public class C22133c implements C22114d<InputStream> {

    /* renamed from: d */
    public static final String f56832d = "MediaStoreThumbFetcher";

    /* renamed from: a */
    public final Uri f56833a;

    /* renamed from: b */
    public final C22137e f56834b;

    /* renamed from: c */
    public InputStream f56835c;

    /* renamed from: com.bumptech.glide.load.data.mediastore.c$a */
    public static class C22134a implements C22136d {

        /* renamed from: b */
        public static final String[] f56836b = {C36174e.f89292d};

        /* renamed from: c */
        public static final String f56837c = "kind = 1 AND image_id = ?";

        /* renamed from: a */
        public final ContentResolver f56838a;

        public C22134a(ContentResolver contentResolver) {
            this.f56838a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo65830a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f56838a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f56836b, f56837c, new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.mediastore.c$b */
    public static class C22135b implements C22136d {

        /* renamed from: b */
        public static final String[] f56839b = {C36174e.f89292d};

        /* renamed from: c */
        public static final String f56840c = "kind = 1 AND video_id = ?";

        /* renamed from: a */
        public final ContentResolver f56841a;

        public C22135b(ContentResolver contentResolver) {
            this.f56841a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo65830a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f56841a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f56839b, f56840c, new String[]{lastPathSegment}, (String) null);
        }
    }

    @C0344h1
    public C22133c(Uri uri, C22137e eVar) {
        this.f56833a = uri;
        this.f56834b = eVar;
    }

    /* renamed from: c */
    public static C22133c m100810c(Context context, Uri uri, C22136d dVar) {
        return new C22133c(uri, new C22137e(C22038b.m100356e(context).mo65484n().mo65446g(), dVar, C22038b.m100356e(context).mo65479g(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static C22133c m100811f(Context context, Uri uri) {
        return m100810c(context, uri, new C22134a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C22133c m100812g(Context context, Uri uri) {
        return m100810c(context, uri, new C22135b(context.getContentResolver()));
    }

    @C0359n0
    /* renamed from: a */
    public Class<InputStream> mo65784a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo65789b() {
        InputStream inputStream = this.f56835c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    @C0359n0
    /* renamed from: d */
    public DataSource mo65792d() {
        return DataSource.LOCAL;
    }

    /* renamed from: e */
    public void mo65793e(@C0359n0 Priority priority, @C0359n0 C22114d.C22115a<? super InputStream> aVar) {
        try {
            InputStream h = mo65829h();
            this.f56835c = h;
            aVar.mo65804f(h);
        } catch (FileNotFoundException e) {
            aVar.mo65803c(e);
        }
    }

    /* renamed from: h */
    public final InputStream mo65829h() throws FileNotFoundException {
        int i;
        InputStream d = this.f56834b.mo65834d(this.f56833a);
        if (d != null) {
            i = this.f56834b.mo65831a(this.f56833a);
        } else {
            i = -1;
        }
        if (i != -1) {
            return new C22121g(d, i);
        }
        return d;
    }
}
