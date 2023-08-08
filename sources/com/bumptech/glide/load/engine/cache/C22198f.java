package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.C22185a;
import com.bumptech.glide.load.engine.cache.C22193d;
import java.io.File;

@Deprecated
/* renamed from: com.bumptech.glide.load.engine.cache.f */
public final class C22198f extends C22193d {

    /* renamed from: com.bumptech.glide.load.engine.cache.f$a */
    public class C22199a implements C22193d.C22196c {

        /* renamed from: a */
        public final /* synthetic */ Context f57027a;

        /* renamed from: b */
        public final /* synthetic */ String f57028b;

        public C22199a(Context context, String str) {
            this.f57027a = context;
            this.f57028b = str;
        }

        /* renamed from: a */
        public File mo66032a() {
            File externalCacheDir = this.f57027a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            if (this.f57028b != null) {
                return new File(externalCacheDir, this.f57028b);
            }
            return externalCacheDir;
        }
    }

    public C22198f(Context context) {
        this(context, "image_manager_disk_cache", C22185a.C22186a.f57005a);
    }

    public C22198f(Context context, int i) {
        this(context, "image_manager_disk_cache", i);
    }

    public C22198f(Context context, String str, int i) {
        super((C22193d.C22196c) new C22199a(context, str), (long) i);
    }
}
