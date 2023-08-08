package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.engine.cache.C22193d;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.cache.g */
public final class C22200g extends C22193d {

    /* renamed from: com.bumptech.glide.load.engine.cache.g$a */
    public class C22201a implements C22193d.C22196c {

        /* renamed from: a */
        public final /* synthetic */ Context f57029a;

        /* renamed from: b */
        public final /* synthetic */ String f57030b;

        public C22201a(Context context, String str) {
            this.f57029a = context;
            this.f57030b = str;
        }

        /* renamed from: a */
        public File mo66032a() {
            File externalCacheDir;
            File b = mo66035b();
            if ((b != null && b.exists()) || (externalCacheDir = this.f57029a.getExternalCacheDir()) == null || !externalCacheDir.canWrite()) {
                return b;
            }
            if (this.f57030b != null) {
                return new File(externalCacheDir, this.f57030b);
            }
            return externalCacheDir;
        }

        @C0363p0
        /* renamed from: b */
        public final File mo66035b() {
            File cacheDir = this.f57029a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.f57030b != null) {
                return new File(cacheDir, this.f57030b);
            }
            return cacheDir;
        }
    }

    public C22200g(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C22200g(Context context, long j) {
        this(context, "image_manager_disk_cache", j);
    }

    public C22200g(Context context, String str, long j) {
        super((C22193d.C22196c) new C22201a(context, str), j);
    }
}
