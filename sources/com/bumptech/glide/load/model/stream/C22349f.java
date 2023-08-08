package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.load.model.C22325o;
import com.bumptech.glide.load.model.C22331r;
import com.bumptech.glide.signature.C22613e;
import com.carrefour.fid.android.core.constants.C36174e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

@C0376v0(29)
/* renamed from: com.bumptech.glide.load.model.stream.f */
public final class C22349f<DataT> implements C22323n<Uri, DataT> {

    /* renamed from: a */
    public final Context f57381a;

    /* renamed from: b */
    public final C22323n<File, DataT> f57382b;

    /* renamed from: c */
    public final C22323n<Uri, DataT> f57383c;

    /* renamed from: d */
    public final Class<DataT> f57384d;

    /* renamed from: com.bumptech.glide.load.model.stream.f$a */
    public static abstract class C22350a<DataT> implements C22325o<Uri, DataT> {

        /* renamed from: a */
        public final Context f57385a;

        /* renamed from: b */
        public final Class<DataT> f57386b;

        public C22350a(Context context, Class<DataT> cls) {
            this.f57385a = context;
            this.f57386b = cls;
        }

        /* renamed from: a */
        public final void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public final C22323n<Uri, DataT> mo66245c(@C0359n0 C22331r rVar) {
            return new C22349f(this.f57385a, rVar.mo66323d(File.class, this.f57386b), rVar.mo66323d(Uri.class, this.f57386b), this.f57386b);
        }
    }

    @C0376v0(29)
    /* renamed from: com.bumptech.glide.load.model.stream.f$b */
    public static final class C22351b extends C22350a<ParcelFileDescriptor> {
        public C22351b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @C0376v0(29)
    /* renamed from: com.bumptech.glide.load.model.stream.f$c */
    public static final class C22352c extends C22350a<InputStream> {
        public C22352c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.stream.f$d */
    public static final class C22353d<DataT> implements C22114d<DataT> {

        /* renamed from: y */
        public static final String[] f57387y = {C36174e.f89292d};

        /* renamed from: a */
        public final Context f57388a;

        /* renamed from: b */
        public final C22323n<File, DataT> f57389b;

        /* renamed from: c */
        public final C22323n<Uri, DataT> f57390c;

        /* renamed from: d */
        public final Uri f57391d;

        /* renamed from: e */
        public final int f57392e;

        /* renamed from: f */
        public final int f57393f;

        /* renamed from: g */
        public final C22277f f57394g;

        /* renamed from: v */
        public final Class<DataT> f57395v;

        /* renamed from: w */
        public volatile boolean f57396w;
        @C0363p0

        /* renamed from: x */
        public volatile C22114d<DataT> f57397x;

        public C22353d(Context context, C22323n<File, DataT> nVar, C22323n<Uri, DataT> nVar2, Uri uri, int i, int i2, C22277f fVar, Class<DataT> cls) {
            this.f57388a = context.getApplicationContext();
            this.f57389b = nVar;
            this.f57390c = nVar2;
            this.f57391d = uri;
            this.f57392e = i;
            this.f57393f = i2;
            this.f57394g = fVar;
            this.f57395v = cls;
        }

        @C0359n0
        /* renamed from: a */
        public Class<DataT> mo65784a() {
            return this.f57395v;
        }

        /* renamed from: b */
        public void mo65789b() {
            C22114d<DataT> dVar = this.f57397x;
            if (dVar != null) {
                dVar.mo65789b();
            }
        }

        @C0363p0
        /* renamed from: c */
        public final C22323n.C22324a<DataT> mo66348c() throws FileNotFoundException {
            Uri uri;
            if (Environment.isExternalStorageLegacy()) {
                return this.f57389b.mo66240b(mo66351h(this.f57391d), this.f57392e, this.f57393f, this.f57394g);
            }
            if (mo66350g()) {
                uri = MediaStore.setRequireOriginal(this.f57391d);
            } else {
                uri = this.f57391d;
            }
            return this.f57390c.mo66240b(uri, this.f57392e, this.f57393f, this.f57394g);
        }

        public void cancel() {
            this.f57396w = true;
            C22114d<DataT> dVar = this.f57397x;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @C0359n0
        /* renamed from: d */
        public DataSource mo65792d() {
            return DataSource.LOCAL;
        }

        /* renamed from: e */
        public void mo65793e(@C0359n0 Priority priority, @C0359n0 C22114d.C22115a<? super DataT> aVar) {
            try {
                C22114d<DataT> f = mo66349f();
                if (f == null) {
                    aVar.mo65803c(new IllegalArgumentException("Failed to build fetcher for: " + this.f57391d));
                    return;
                }
                this.f57397x = f;
                if (this.f57396w) {
                    cancel();
                } else {
                    f.mo65793e(priority, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo65803c(e);
            }
        }

        @C0363p0
        /* renamed from: f */
        public final C22114d<DataT> mo66349f() throws FileNotFoundException {
            C22323n.C22324a c = mo66348c();
            if (c != null) {
                return c.f57342c;
            }
            return null;
        }

        /* renamed from: g */
        public final boolean mo66350g() {
            return this.f57388a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @C0359n0
        /* renamed from: h */
        public final File mo66351h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                cursor = this.f57388a.getContentResolver().query(uri, f57387y, (String) null, (String[]) null, (String) null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow(C36174e.f89292d));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursor.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public C22349f(Context context, C22323n<File, DataT> nVar, C22323n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f57381a = context.getApplicationContext();
        this.f57382b = nVar;
        this.f57383c = nVar2;
        this.f57384d = cls;
    }

    /* renamed from: c */
    public C22323n.C22324a<DataT> mo66240b(@C0359n0 Uri uri, int i, int i2, @C0359n0 C22277f fVar) {
        return new C22323n.C22324a<>(new C22613e(uri), new C22353d(this.f57381a, this.f57382b, this.f57383c, uri, i, i2, fVar, this.f57384d));
    }

    /* renamed from: d */
    public boolean mo66239a(@C0359n0 Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C22132b.m100806b(uri);
    }
}
