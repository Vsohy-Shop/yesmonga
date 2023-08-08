package com.bumptech.glide.load.data;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* renamed from: com.bumptech.glide.load.data.d */
public interface C22114d<T> {

    /* renamed from: com.bumptech.glide.load.data.d$a */
    public interface C22115a<T> {
        /* renamed from: c */
        void mo65803c(@C0359n0 Exception exc);

        /* renamed from: f */
        void mo65804f(@C0363p0 T t);
    }

    @C0359n0
    /* renamed from: a */
    Class<T> mo65784a();

    /* renamed from: b */
    void mo65789b();

    void cancel();

    @C0359n0
    /* renamed from: d */
    DataSource mo65792d();

    /* renamed from: e */
    void mo65793e(@C0359n0 Priority priority, @C0359n0 C22115a<? super T> aVar);
}
