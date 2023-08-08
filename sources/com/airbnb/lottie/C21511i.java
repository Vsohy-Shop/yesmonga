package com.airbnb.lottie;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.network.C21596d;
import com.airbnb.lottie.network.C21597e;
import java.io.File;

/* renamed from: com.airbnb.lottie.i */
public class C21511i {
    @C0363p0

    /* renamed from: a */
    public final C21597e f55486a;
    @C0363p0

    /* renamed from: b */
    public final C21596d f55487b;

    /* renamed from: c */
    public final boolean f55488c;

    /* renamed from: com.airbnb.lottie.i$b */
    public static final class C21513b {
        @C0363p0

        /* renamed from: a */
        public C21597e f55489a;
        @C0363p0

        /* renamed from: b */
        public C21596d f55490b;

        /* renamed from: c */
        public boolean f55491c = false;

        /* renamed from: com.airbnb.lottie.i$b$a */
        public class C21514a implements C21596d {

            /* renamed from: a */
            public final /* synthetic */ File f55492a;

            public C21514a(File file) {
                this.f55492a = file;
            }

            @C0359n0
            /* renamed from: a */
            public File mo64117a() {
                if (this.f55492a.isDirectory()) {
                    return this.f55492a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        /* renamed from: com.airbnb.lottie.i$b$b */
        public class C21515b implements C21596d {

            /* renamed from: a */
            public final /* synthetic */ C21596d f55494a;

            public C21515b(C21596d dVar) {
                this.f55494a = dVar;
            }

            @C0359n0
            /* renamed from: a */
            public File mo64117a() {
                File a = this.f55494a.mo64117a();
                if (a.isDirectory()) {
                    return a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @C0359n0
        /* renamed from: a */
        public C21511i mo64166a() {
            return new C21511i(this.f55489a, this.f55490b, this.f55491c);
        }

        @C0359n0
        /* renamed from: b */
        public C21513b mo64167b(boolean z) {
            this.f55491c = z;
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C21513b mo64168c(@C0359n0 File file) {
            if (this.f55490b == null) {
                this.f55490b = new C21514a(file);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        @C0359n0
        /* renamed from: d */
        public C21513b mo64169d(@C0359n0 C21596d dVar) {
            if (this.f55490b == null) {
                this.f55490b = new C21515b(dVar);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        @C0359n0
        /* renamed from: e */
        public C21513b mo64170e(@C0359n0 C21597e eVar) {
            this.f55489a = eVar;
            return this;
        }
    }

    public C21511i(@C0363p0 C21597e eVar, @C0363p0 C21596d dVar, boolean z) {
        this.f55486a = eVar;
        this.f55487b = dVar;
        this.f55488c = z;
    }
}
