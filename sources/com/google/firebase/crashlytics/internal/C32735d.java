package com.google.firebase.crashlytics.internal;

import androidx.annotation.C0359n0;
import com.google.firebase.crashlytics.internal.model.C32837c0;
import com.google.firebase.inject.C33056a;
import com.google.firebase.inject.C33058b;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.crashlytics.internal.d */
public final class C32735d implements C32655a {

    /* renamed from: c */
    public static final C32742g f79477c = new C32737b();

    /* renamed from: a */
    public final C33056a<C32655a> f79478a;

    /* renamed from: b */
    public final AtomicReference<C32655a> f79479b = new AtomicReference<>((Object) null);

    /* renamed from: com.google.firebase.crashlytics.internal.d$b */
    public static final class C32737b implements C32742g {
        public C32737b() {
        }

        /* renamed from: a */
        public File mo95040a() {
            return null;
        }

        /* renamed from: b */
        public File mo95041b() {
            return null;
        }

        /* renamed from: c */
        public File mo95042c() {
            return null;
        }

        /* renamed from: d */
        public File mo95043d() {
            return null;
        }

        /* renamed from: e */
        public File mo95044e() {
            return null;
        }

        /* renamed from: f */
        public File mo95045f() {
            return null;
        }

        /* renamed from: g */
        public File mo95046g() {
            return null;
        }
    }

    public C32735d(C33056a<C32655a> aVar) {
        this.f79478a = aVar;
        aVar.mo94677a(new C32662b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m132226g(C33058b bVar) {
        C32741f.m132248f().mo95052b("Crashlytics native component now available.");
        this.f79479b.set((C32655a) bVar.get());
    }

    @C0359n0
    /* renamed from: a */
    public C32742g mo94840a(@C0359n0 String str) {
        C32655a aVar = this.f79479b.get();
        if (aVar == null) {
            return f79477c;
        }
        return aVar.mo94840a(str);
    }

    /* renamed from: b */
    public boolean mo94841b() {
        C32655a aVar = this.f79479b.get();
        if (aVar == null || !aVar.mo94841b()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo94842c(@C0359n0 String str, @C0359n0 String str2, long j, @C0359n0 C32837c0 c0Var) {
        C32741f f = C32741f.m132248f();
        f.mo95060k("Deferring native open session: " + str);
        this.f79478a.mo94677a(new C32666c(str, str2, j, c0Var));
    }

    /* renamed from: d */
    public boolean mo94843d(@C0359n0 String str) {
        C32655a aVar = this.f79479b.get();
        if (aVar == null || !aVar.mo94843d(str)) {
            return false;
        }
        return true;
    }
}
