package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C22099b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.data.mediastore.e */
public class C22137e {

    /* renamed from: f */
    public static final String f56842f = "ThumbStreamOpener";

    /* renamed from: g */
    public static final C22131a f56843g = new C22131a();

    /* renamed from: a */
    public final C22131a f56844a;

    /* renamed from: b */
    public final C22136d f56845b;

    /* renamed from: c */
    public final C22157b f56846c;

    /* renamed from: d */
    public final ContentResolver f56847d;

    /* renamed from: e */
    public final List<ImageHeaderParser> f56848e;

    public C22137e(List<ImageHeaderParser> list, C22136d dVar, C22157b bVar, ContentResolver contentResolver) {
        this(list, f56843g, dVar, bVar, contentResolver);
    }

    /* renamed from: a */
    public int mo65831a(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.f56847d.openInputStream(uri);
            int b = C22099b.m100710b(this.f56848e, openInputStream, this.f56846c);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return b;
        } catch (IOException | NullPointerException unused2) {
            if (Log.isLoggable(f56842f, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to open uri: ");
                sb.append(uri);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002a A[Catch:{ all -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0041  */
    @androidx.annotation.C0363p0
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo65832b(@androidx.annotation.C0359n0 android.net.Uri r5) {
        /*
            r4 = this;
            r0 = 0
            com.bumptech.glide.load.data.mediastore.d r1 = r4.f56845b     // Catch:{ SecurityException -> 0x0020, all -> 0x001e }
            android.database.Cursor r1 = r1.mo65830a(r5)     // Catch:{ SecurityException -> 0x0020, all -> 0x001e }
            if (r1 == 0) goto L_0x0018
            boolean r2 = r1.moveToFirst()     // Catch:{ SecurityException -> 0x0021 }
            if (r2 == 0) goto L_0x0018
            r2 = 0
            java.lang.String r5 = r1.getString(r2)     // Catch:{ SecurityException -> 0x0021 }
            r1.close()
            return r5
        L_0x0018:
            if (r1 == 0) goto L_0x001d
            r1.close()
        L_0x001d:
            return r0
        L_0x001e:
            r5 = move-exception
            goto L_0x003f
        L_0x0020:
            r1 = r0
        L_0x0021:
            java.lang.String r2 = "ThumbStreamOpener"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0037
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r2.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r3 = "Failed to query for thumbnail for Uri: "
            r2.append(r3)     // Catch:{ all -> 0x003d }
            r2.append(r5)     // Catch:{ all -> 0x003d }
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()
        L_0x003c:
            return r0
        L_0x003d:
            r5 = move-exception
            r0 = r1
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.mediastore.C22137e.mo65832b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    public final boolean mo65833c(File file) {
        return this.f56844a.mo65826a(file) && 0 < this.f56844a.mo65828c(file);
    }

    /* renamed from: d */
    public InputStream mo65834d(Uri uri) throws FileNotFoundException {
        String b = mo65832b(uri);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        File b2 = this.f56844a.mo65827b(b);
        if (!mo65833c(b2)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b2);
        try {
            return this.f56847d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }

    public C22137e(List<ImageHeaderParser> list, C22131a aVar, C22136d dVar, C22157b bVar, ContentResolver contentResolver) {
        this.f56844a = aVar;
        this.f56845b = dVar;
        this.f56846c = bVar;
        this.f56847d = contentResolver;
        this.f56848e = list;
    }
}
