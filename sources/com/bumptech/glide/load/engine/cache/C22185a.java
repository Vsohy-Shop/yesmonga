package com.bumptech.glide.load.engine.cache;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22108c;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.cache.a */
public interface C22185a {

    /* renamed from: com.bumptech.glide.load.engine.cache.a$a */
    public interface C22186a {

        /* renamed from: a */
        public static final int f57005a = 262144000;

        /* renamed from: b */
        public static final String f57006b = "image_manager_disk_cache";

        @C0363p0
        /* renamed from: g */
        C22185a mo66026g();
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.a$b */
    public interface C22187b {
        /* renamed from: a */
        boolean mo66027a(@C0359n0 File file);
    }

    /* renamed from: a */
    void mo66022a(C22108c cVar, C22187b bVar);

    @C0363p0
    /* renamed from: b */
    File mo66023b(C22108c cVar);

    /* renamed from: c */
    void mo66024c(C22108c cVar);

    void clear();
}
