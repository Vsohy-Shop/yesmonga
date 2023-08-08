package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.C0359n0;
import androidx.core.provider.C17860g;
import androidx.core.provider.C17866h;

/* renamed from: androidx.core.provider.a */
public class C17847a {
    @C0359n0

    /* renamed from: a */
    public final C17866h.C17870d f46216a;
    @C0359n0

    /* renamed from: b */
    public final Handler f46217b;

    /* renamed from: androidx.core.provider.a$a */
    public class C17848a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C17866h.C17870d f46218a;

        /* renamed from: b */
        public final /* synthetic */ Typeface f46219b;

        public C17848a(C17866h.C17870d dVar, Typeface typeface) {
            this.f46218a = dVar;
            this.f46219b = typeface;
        }

        public void run() {
            this.f46218a.mo51925b(this.f46219b);
        }
    }

    /* renamed from: androidx.core.provider.a$b */
    public class C17849b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C17866h.C17870d f46221a;

        /* renamed from: b */
        public final /* synthetic */ int f46222b;

        public C17849b(C17866h.C17870d dVar, int i) {
            this.f46221a = dVar;
            this.f46222b = i;
        }

        public void run() {
            this.f46221a.mo51924a(this.f46222b);
        }
    }

    public C17847a(@C0359n0 C17866h.C17870d dVar, @C0359n0 Handler handler) {
        this.f46216a = dVar;
        this.f46217b = handler;
    }

    /* renamed from: a */
    public final void mo52259a(int i) {
        this.f46217b.post(new C17849b(this.f46216a, i));
    }

    /* renamed from: b */
    public void mo52260b(@C0359n0 C17860g.C17865e eVar) {
        if (eVar.mo52280a()) {
            mo52261c(eVar.f46247a);
        } else {
            mo52259a(eVar.f46248b);
        }
    }

    /* renamed from: c */
    public final void mo52261c(@C0359n0 Typeface typeface) {
        this.f46217b.post(new C17848a(this.f46216a, typeface));
    }

    public C17847a(@C0359n0 C17866h.C17870d dVar) {
        this.f46216a = dVar;
        this.f46217b = C17850b.m81317a();
    }
}
