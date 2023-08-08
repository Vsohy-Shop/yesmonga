package com.bumptech.glide.load.engine;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22098a;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.engine.cache.C22185a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.d */
public class C22215d<DataType> implements C22185a.C22187b {

    /* renamed from: a */
    public final C22098a<DataType> f57061a;

    /* renamed from: b */
    public final DataType f57062b;

    /* renamed from: c */
    public final C22277f f57063c;

    public C22215d(C22098a<DataType> aVar, DataType datatype, C22277f fVar) {
        this.f57061a = aVar;
        this.f57062b = datatype;
        this.f57063c = fVar;
    }

    /* renamed from: a */
    public boolean mo66027a(@C0359n0 File file) {
        return this.f57061a.mo65770a(this.f57062b, file, this.f57063c);
    }
}
