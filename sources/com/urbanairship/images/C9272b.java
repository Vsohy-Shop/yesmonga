package com.urbanairship.images;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.http.HttpResponseCache;
import android.support.p002v4.media.session.PlaybackStateCompat;
import android.util.LruCache;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import java.io.File;
import java.io.IOException;

/* renamed from: com.urbanairship.images.b */
public class C9272b {

    /* renamed from: c */
    public static final String f25291c = "urbanairship-cache";

    /* renamed from: d */
    public static final int f25292d = 10485760;

    /* renamed from: e */
    public static final int f25293e = 1048576;

    /* renamed from: f */
    public static final int f25294f = 52428800;

    /* renamed from: a */
    public final LruCache<String, C9274b> f25295a = new C9273a((int) Math.min(10485760, Runtime.getRuntime().maxMemory() / 8));

    /* renamed from: b */
    public final Context f25296b;

    /* renamed from: com.urbanairship.images.b$a */
    public class C9273a extends LruCache<String, C9274b> {
        public C9273a(int i) {
            super(i);
        }

        /* renamed from: a */
        public int sizeOf(String str, @C0359n0 C9274b bVar) {
            if (bVar.f25298a > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) bVar.f25298a;
        }
    }

    /* renamed from: com.urbanairship.images.b$b */
    public static class C9274b {

        /* renamed from: a */
        public final long f25298a;

        /* renamed from: b */
        public final Drawable f25299b;

        public C9274b(@C0359n0 Drawable drawable, long j) {
            this.f25299b = drawable;
            this.f25298a = j;
        }
    }

    public C9272b(@C0359n0 Context context) {
        this.f25296b = context.getApplicationContext();
    }

    @C0348i1
    /* renamed from: a */
    public void mo18654a(@C0359n0 String str, @C0359n0 Drawable drawable, long j) {
        if (j <= PlaybackStateCompat.f480V0) {
            this.f25295a.put(str, new C9274b(drawable, j));
        }
    }

    @C0363p0
    /* renamed from: b */
    public Drawable mo18655b(@C0359n0 String str) {
        C9274b bVar = this.f25295a.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f25299b;
    }

    @C0348i1
    /* renamed from: c */
    public void mo18656c() {
        File file = new File(this.f25296b.getApplicationContext().getCacheDir(), f25291c);
        if (!file.exists() && !file.mkdirs()) {
            C36059m.m148409e("Failed to create the cache.", new Object[0]);
        }
        if (HttpResponseCache.getInstalled() == null) {
            try {
                HttpResponseCache.install(file, 52428800);
            } catch (IOException unused) {
                C36059m.m148409e("Unable to install image loader cache", new Object[0]);
            }
        }
    }
}
