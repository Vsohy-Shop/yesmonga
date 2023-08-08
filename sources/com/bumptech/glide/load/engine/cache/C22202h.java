package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.C22193d;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.cache.h */
public final class C22202h extends C22193d {

    /* renamed from: com.bumptech.glide.load.engine.cache.h$a */
    public class C22203a implements C22193d.C22196c {

        /* renamed from: a */
        public final /* synthetic */ Context f57031a;

        /* renamed from: b */
        public final /* synthetic */ String f57032b;

        public C22203a(Context context, String str) {
            this.f57031a = context;
            this.f57032b = str;
        }

        /* renamed from: a */
        public File mo66032a() {
            File cacheDir = this.f57031a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.f57032b != null) {
                return new File(cacheDir, this.f57032b);
            }
            return cacheDir;
        }
    }

    public C22202h(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C22202h(Context context, long j) {
        this(context, "image_manager_disk_cache", j);
    }

    public C22202h(Context context, String str, long j) {
        super((C22193d.C22196c) new C22203a(context, str), j);
    }
}
