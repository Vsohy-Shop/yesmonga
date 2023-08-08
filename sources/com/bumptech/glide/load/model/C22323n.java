package com.bumptech.glide.load.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.util.C22633m;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.model.n */
public interface C22323n<Model, Data> {

    /* renamed from: com.bumptech.glide.load.model.n$a */
    public static class C22324a<Data> {

        /* renamed from: a */
        public final C22108c f57340a;

        /* renamed from: b */
        public final List<C22108c> f57341b;

        /* renamed from: c */
        public final C22114d<Data> f57342c;

        public C22324a(@C0359n0 C22108c cVar, @C0359n0 C22114d<Data> dVar) {
            this(cVar, Collections.emptyList(), dVar);
        }

        public C22324a(@C0359n0 C22108c cVar, @C0359n0 List<C22108c> list, @C0359n0 C22114d<Data> dVar) {
            this.f57340a = (C22108c) C22633m.m102624d(cVar);
            this.f57341b = (List) C22633m.m102624d(list);
            this.f57342c = (C22114d) C22633m.m102624d(dVar);
        }
    }

    /* renamed from: a */
    boolean mo66239a(@C0359n0 Model model);

    @C0363p0
    /* renamed from: b */
    C22324a<Data> mo66240b(@C0359n0 Model model, int i, int i2, @C0359n0 C22277f fVar);
}
