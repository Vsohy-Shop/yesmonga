package com.bumptech.glide.load.engine;

import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;

/* renamed from: com.bumptech.glide.load.engine.e */
public interface C22216e {

    /* renamed from: com.bumptech.glide.load.engine.e$a */
    public interface C22217a {
        /* renamed from: b */
        void mo65857b(C22108c cVar, Exception exc, C22114d<?> dVar, DataSource dataSource);

        /* renamed from: q */
        void mo65869q();

        /* renamed from: r */
        void mo65870r(C22108c cVar, @C0363p0 Object obj, C22114d<?> dVar, DataSource dataSource, C22108c cVar2);
    }

    /* renamed from: a */
    boolean mo65922a();

    void cancel();
}
