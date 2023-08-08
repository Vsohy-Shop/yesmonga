package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.view.inputmethod.s */
public final class C18262s {

    /* renamed from: a */
    public final C18265c f46895a;

    /* renamed from: androidx.core.view.inputmethod.s$b */
    public static final class C18264b implements C18265c {
        @C0359n0

        /* renamed from: a */
        public final Uri f46897a;
        @C0359n0

        /* renamed from: b */
        public final ClipDescription f46898b;
        @C0363p0

        /* renamed from: c */
        public final Uri f46899c;

        public C18264b(@C0359n0 Uri uri, @C0359n0 ClipDescription clipDescription, @C0363p0 Uri uri2) {
            this.f46897a = uri;
            this.f46898b = clipDescription;
            this.f46899c = uri2;
        }

        @C0363p0
        /* renamed from: a */
        public Uri mo52926a() {
            return this.f46899c;
        }

        @C0363p0
        /* renamed from: b */
        public Object mo52927b() {
            return null;
        }

        @C0359n0
        /* renamed from: c */
        public Uri mo52928c() {
            return this.f46897a;
        }

        /* renamed from: d */
        public void mo52929d() {
        }

        /* renamed from: e */
        public void mo52930e() {
        }

        @C0359n0
        public ClipDescription getDescription() {
            return this.f46898b;
        }
    }

    /* renamed from: androidx.core.view.inputmethod.s$c */
    public interface C18265c {
        @C0363p0
        /* renamed from: a */
        Uri mo52926a();

        @C0363p0
        /* renamed from: b */
        Object mo52927b();

        @C0359n0
        /* renamed from: c */
        Uri mo52928c();

        /* renamed from: d */
        void mo52929d();

        /* renamed from: e */
        void mo52930e();

        @C0359n0
        ClipDescription getDescription();
    }

    public C18262s(@C0359n0 Uri uri, @C0359n0 ClipDescription clipDescription, @C0363p0 Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f46895a = new C18263a(uri, clipDescription, uri2);
        } else {
            this.f46895a = new C18264b(uri, clipDescription, uri2);
        }
    }

    @C0363p0
    /* renamed from: g */
    public static C18262s m82872g(@C0363p0 Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C18262s(new C18263a(obj));
        }
        return null;
    }

    @C0359n0
    /* renamed from: a */
    public Uri mo52920a() {
        return this.f46895a.mo52928c();
    }

    @C0359n0
    /* renamed from: b */
    public ClipDescription mo52921b() {
        return this.f46895a.getDescription();
    }

    @C0363p0
    /* renamed from: c */
    public Uri mo52922c() {
        return this.f46895a.mo52926a();
    }

    /* renamed from: d */
    public void mo52923d() {
        this.f46895a.mo52930e();
    }

    /* renamed from: e */
    public void mo52924e() {
        this.f46895a.mo52929d();
    }

    @C0363p0
    /* renamed from: f */
    public Object mo52925f() {
        return this.f46895a.mo52927b();
    }

    @C0376v0(25)
    /* renamed from: androidx.core.view.inputmethod.s$a */
    public static final class C18263a implements C18265c {
        @C0359n0

        /* renamed from: a */
        public final InputContentInfo f46896a;

        public C18263a(@C0359n0 Object obj) {
            this.f46896a = C18247h.m82853a(obj);
        }

        @C0363p0
        /* renamed from: a */
        public Uri mo52926a() {
            return this.f46896a.getLinkUri();
        }

        @C0359n0
        /* renamed from: b */
        public Object mo52927b() {
            return this.f46896a;
        }

        @C0359n0
        /* renamed from: c */
        public Uri mo52928c() {
            return this.f46896a.getContentUri();
        }

        /* renamed from: d */
        public void mo52929d() {
            this.f46896a.requestPermission();
        }

        /* renamed from: e */
        public void mo52930e() {
            this.f46896a.releasePermission();
        }

        @C0359n0
        public ClipDescription getDescription() {
            return this.f46896a.getDescription();
        }

        public C18263a(@C0359n0 Uri uri, @C0359n0 ClipDescription clipDescription, @C0363p0 Uri uri2) {
            C18261r.m82871a();
            this.f46896a = C18260q.m82870a(uri, clipDescription, uri2);
        }
    }

    public C18262s(@C0359n0 C18265c cVar) {
        this.f46895a = cVar;
    }
}
