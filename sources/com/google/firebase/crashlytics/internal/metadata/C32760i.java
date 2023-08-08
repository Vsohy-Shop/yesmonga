package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import androidx.camera.view.C1814q;
import com.google.firebase.crashlytics.internal.common.C32681h;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.C32921f;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.crashlytics.internal.metadata.i */
public class C32760i {

    /* renamed from: g */
    public static final String f79535g = "user-data";

    /* renamed from: h */
    public static final String f79536h = "keys";

    /* renamed from: i */
    public static final String f79537i = "internal-keys";
    @C0344h1

    /* renamed from: j */
    public static final int f79538j = 64;
    @C0344h1

    /* renamed from: k */
    public static final int f79539k = 1024;
    @C0344h1

    /* renamed from: l */
    public static final int f79540l = 8192;

    /* renamed from: a */
    public final C32748d f79541a;

    /* renamed from: b */
    public final C32681h f79542b;

    /* renamed from: c */
    public final String f79543c;

    /* renamed from: d */
    public final C32761a f79544d = new C32761a(false);

    /* renamed from: e */
    public final C32761a f79545e = new C32761a(true);

    /* renamed from: f */
    public final AtomicMarkableReference<String> f79546f = new AtomicMarkableReference<>((Object) null, false);

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.i$a */
    public class C32761a {

        /* renamed from: a */
        public final AtomicMarkableReference<C32744b> f79547a;

        /* renamed from: b */
        public final AtomicReference<Callable<Void>> f79548b = new AtomicReference<>((Object) null);

        /* renamed from: c */
        public final boolean f79549c;

        public C32761a(boolean z) {
            int i;
            this.f79549c = z;
            if (z) {
                i = 8192;
            } else {
                i = 1024;
            }
            this.f79547a = new AtomicMarkableReference<>(new C32744b(64, i), false);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ Void m132363c() throws Exception {
            this.f79548b.set((Object) null);
            mo95131e();
            return null;
        }

        /* renamed from: b */
        public Map<String, String> mo95129b() {
            return this.f79547a.getReference().mo95069a();
        }

        /* renamed from: d */
        public final void mo95130d() {
            C32759h hVar = new C32759h(this);
            if (C1814q.m7242a(this.f79548b, (Object) null, hVar)) {
                C32760i.this.f79542b.mo94883h(hVar);
            }
        }

        /* renamed from: e */
        public final void mo95131e() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f79547a.isMarked()) {
                    map = this.f79547a.getReference().mo95069a();
                    AtomicMarkableReference<C32744b> atomicMarkableReference = this.f79547a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                C32760i.this.f79541a.mo95088n(C32760i.this.f79543c, map, this.f79549c);
            }
        }

        /* renamed from: f */
        public boolean mo95132f(String str, String str2) {
            synchronized (this) {
                if (!this.f79547a.getReference().mo95071d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<C32744b> atomicMarkableReference = this.f79547a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                mo95130d();
                return true;
            }
        }

        /* renamed from: g */
        public void mo95133g(Map<String, String> map) {
            synchronized (this) {
                this.f79547a.getReference().mo95072e(map);
                AtomicMarkableReference<C32744b> atomicMarkableReference = this.f79547a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            mo95130d();
        }
    }

    public C32760i(String str, C32921f fVar, C32681h hVar) {
        this.f79543c = str;
        this.f79541a = new C32748d(fVar);
        this.f79542b = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Object m132351h() throws Exception {
        mo95124k();
        return null;
    }

    /* renamed from: i */
    public static C32760i m132352i(String str, C32921f fVar, C32681h hVar) {
        C32748d dVar = new C32748d(fVar);
        C32760i iVar = new C32760i(str, fVar, hVar);
        iVar.f79544d.f79547a.getReference().mo95072e(dVar.mo95085h(str, false));
        iVar.f79545e.f79547a.getReference().mo95072e(dVar.mo95085h(str, true));
        iVar.f79546f.set(dVar.mo95086i(str), false);
        return iVar;
    }

    @C0363p0
    /* renamed from: j */
    public static String m132353j(String str, C32921f fVar) {
        return new C32748d(fVar).mo95086i(str);
    }

    /* renamed from: e */
    public Map<String, String> mo95121e() {
        return this.f79544d.mo95129b();
    }

    /* renamed from: f */
    public Map<String, String> mo95122f() {
        return this.f79545e.mo95129b();
    }

    @C0363p0
    /* renamed from: g */
    public String mo95123g() {
        return this.f79546f.getReference();
    }

    /* renamed from: k */
    public final void mo95124k() {
        boolean z;
        String str;
        synchronized (this.f79546f) {
            z = false;
            if (this.f79546f.isMarked()) {
                str = mo95123g();
                this.f79546f.set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            this.f79541a.mo95089o(this.f79543c, str);
        }
    }

    /* renamed from: l */
    public boolean mo95125l(String str, String str2) {
        return this.f79544d.mo95132f(str, str2);
    }

    /* renamed from: m */
    public void mo95126m(Map<String, String> map) {
        this.f79544d.mo95133g(map);
    }

    /* renamed from: n */
    public boolean mo95127n(String str, String str2) {
        return this.f79545e.mo95132f(str, str2);
    }

    /* renamed from: o */
    public void mo95128o(String str) {
        String c = C32744b.m132274c(str, 1024);
        synchronized (this.f79546f) {
            if (!CommonUtils.m131915E(c, this.f79546f.getReference())) {
                this.f79546f.set(c, true);
                this.f79542b.mo94883h(new C32758g(this));
            }
        }
    }
}
