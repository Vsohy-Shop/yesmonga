package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.persistence.C32921f;
import java.io.File;

/* renamed from: com.google.firebase.crashlytics.internal.metadata.c */
public class C32745c {

    /* renamed from: c */
    public static final String f79496c = "userlog";

    /* renamed from: d */
    public static final C32747b f79497d = new C32747b();

    /* renamed from: e */
    public static final int f79498e = 65536;

    /* renamed from: a */
    public final C32921f f79499a;

    /* renamed from: b */
    public C32743a f79500b;

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.c$b */
    public static final class C32747b implements C32743a {
        public C32747b() {
        }

        /* renamed from: a */
        public void mo95064a() {
        }

        /* renamed from: b */
        public String mo95065b() {
            return null;
        }

        /* renamed from: c */
        public byte[] mo95066c() {
            return null;
        }

        /* renamed from: d */
        public void mo95067d() {
        }

        /* renamed from: e */
        public void mo95068e(long j, String str) {
        }
    }

    public C32745c(C32921f fVar) {
        this.f79499a = fVar;
        this.f79500b = f79497d;
    }

    /* renamed from: a */
    public void mo95073a() {
        this.f79500b.mo95067d();
    }

    /* renamed from: b */
    public byte[] mo95074b() {
        return this.f79500b.mo95066c();
    }

    @C0363p0
    /* renamed from: c */
    public String mo95075c() {
        return this.f79500b.mo95065b();
    }

    /* renamed from: d */
    public final File mo95076d(String str) {
        return this.f79499a.mo95578p(str, f79496c);
    }

    /* renamed from: e */
    public final void mo95077e(String str) {
        this.f79500b.mo95064a();
        this.f79500b = f79497d;
        if (str != null) {
            mo95078f(mo95076d(str), 65536);
        }
    }

    /* renamed from: f */
    public void mo95078f(File file, int i) {
        this.f79500b = new C32755f(file, i);
    }

    /* renamed from: g */
    public void mo95079g(long j, String str) {
        this.f79500b.mo95068e(j, str);
    }

    public C32745c(C32921f fVar, String str) {
        this(fVar);
        mo95077e(str);
    }
}
