package com.google.android.material.color;

import android.app.Activity;
import androidx.annotation.C0327c1;
import androidx.annotation.C0359n0;
import com.google.android.material.color.C31248l;

/* renamed from: com.google.android.material.color.m */
public class C31255m {

    /* renamed from: d */
    public static final C31248l.C31254f f75239d = new C31256a();

    /* renamed from: e */
    public static final C31248l.C31253e f75240e = new C31257b();
    @C0327c1

    /* renamed from: a */
    public final int f75241a;
    @C0359n0

    /* renamed from: b */
    public final C31248l.C31254f f75242b;
    @C0359n0

    /* renamed from: c */
    public final C31248l.C31253e f75243c;

    /* renamed from: com.google.android.material.color.m$a */
    public class C31256a implements C31248l.C31254f {
        /* renamed from: a */
        public boolean mo89215a(@C0359n0 Activity activity, int i) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.color.m$b */
    public class C31257b implements C31248l.C31253e {
        /* renamed from: a */
        public void mo89214a(@C0359n0 Activity activity) {
        }
    }

    /* renamed from: com.google.android.material.color.m$c */
    public static class C31258c {
        @C0327c1

        /* renamed from: a */
        public int f75244a;
        @C0359n0

        /* renamed from: b */
        public C31248l.C31254f f75245b = C31255m.f75239d;
        @C0359n0

        /* renamed from: c */
        public C31248l.C31253e f75246c = C31255m.f75240e;

        @C0359n0
        /* renamed from: d */
        public C31255m mo89219d() {
            return new C31255m(this, (C31256a) null);
        }

        @C0359n0
        /* renamed from: e */
        public C31258c mo89220e(@C0359n0 C31248l.C31253e eVar) {
            this.f75246c = eVar;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C31258c mo89221f(@C0359n0 C31248l.C31254f fVar) {
            this.f75245b = fVar;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C31258c mo89222g(@C0327c1 int i) {
            this.f75244a = i;
            return this;
        }
    }

    public /* synthetic */ C31255m(C31258c cVar, C31256a aVar) {
        this(cVar);
    }

    @C0359n0
    /* renamed from: c */
    public C31248l.C31253e mo89216c() {
        return this.f75243c;
    }

    @C0359n0
    /* renamed from: d */
    public C31248l.C31254f mo89217d() {
        return this.f75242b;
    }

    @C0327c1
    /* renamed from: e */
    public int mo89218e() {
        return this.f75241a;
    }

    public C31255m(C31258c cVar) {
        this.f75241a = cVar.f75244a;
        this.f75242b = cVar.f75245b;
        this.f75243c = cVar.f75246c;
    }
}
