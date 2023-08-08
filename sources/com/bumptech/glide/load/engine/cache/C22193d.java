package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.C22185a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.cache.d */
public class C22193d implements C22185a.C22186a {

    /* renamed from: c */
    public final long f57013c;

    /* renamed from: d */
    public final C22196c f57014d;

    /* renamed from: com.bumptech.glide.load.engine.cache.d$a */
    public class C22194a implements C22196c {

        /* renamed from: a */
        public final /* synthetic */ String f57015a;

        public C22194a(String str) {
            this.f57015a = str;
        }

        /* renamed from: a */
        public File mo66032a() {
            return new File(this.f57015a);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.d$b */
    public class C22195b implements C22196c {

        /* renamed from: a */
        public final /* synthetic */ String f57016a;

        /* renamed from: b */
        public final /* synthetic */ String f57017b;

        public C22195b(String str, String str2) {
            this.f57016a = str;
            this.f57017b = str2;
        }

        /* renamed from: a */
        public File mo66032a() {
            return new File(this.f57016a, this.f57017b);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.d$c */
    public interface C22196c {
        /* renamed from: a */
        File mo66032a();
    }

    public C22193d(String str, long j) {
        this((C22196c) new C22194a(str), j);
    }

    /* renamed from: g */
    public C22185a mo66026g() {
        File a = this.f57014d.mo66032a();
        if (a == null) {
            return null;
        }
        if (a.isDirectory() || a.mkdirs()) {
            return C22197e.m101078d(a, this.f57013c);
        }
        return null;
    }

    public C22193d(String str, String str2, long j) {
        this((C22196c) new C22195b(str, str2), j);
    }

    public C22193d(C22196c cVar, long j) {
        this.f57013c = j;
        this.f57014d = cVar;
    }
}
