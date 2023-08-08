package com.urbanairship.android.layout.environment;

import android.app.Activity;
import android.webkit.WebChromeClient;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36064q;
import com.urbanairship.android.layout.util.C35910d;
import com.urbanairship.android.layout.util.C35911e;
import com.urbanairship.app.C36030b;
import com.urbanairship.webkit.C9704a;
import com.urbanairship.webkit.C9711g;

/* renamed from: com.urbanairship.android.layout.environment.f */
public class C35596f implements C35614p {
    @C0359n0

    /* renamed from: a */
    public final Activity f88001a;
    @C0359n0

    /* renamed from: b */
    public final C36030b f88002b;
    @C0359n0

    /* renamed from: c */
    public final C35910d<WebChromeClient> f88003c;
    @C0359n0

    /* renamed from: d */
    public final C35910d<C9711g> f88004d;
    @C0359n0

    /* renamed from: e */
    public final C35911e f88005e;

    /* renamed from: f */
    public final boolean f88006f;

    public C35596f(@C0359n0 Activity activity, @C0359n0 C36030b bVar, @C0363p0 C35910d<C9711g> dVar, @C0363p0 C35911e eVar, boolean z) {
        this.f88001a = activity;
        this.f88002b = bVar;
        this.f88003c = new C35592b(activity);
        if (dVar != null) {
            this.f88004d = dVar;
        } else {
            this.f88004d = new C35593c();
        }
        if (eVar != null) {
            this.f88005e = eVar;
        } else {
            this.f88005e = new C35594d();
        }
        this.f88006f = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ boolean m146892k(Activity activity) {
        return activity == this.f88001a;
    }

    /* renamed from: l */
    public static /* synthetic */ WebChromeClient m146893l(Activity activity) {
        return new C9704a(activity);
    }

    /* renamed from: m */
    public static /* synthetic */ String m146894m(String str) {
        return null;
    }

    @C0359n0
    /* renamed from: a */
    public C35910d<WebChromeClient> mo106639a() {
        return this.f88003c;
    }

    @C0359n0
    /* renamed from: b */
    public C35911e mo106640b() {
        return this.f88005e;
    }

    @C0359n0
    /* renamed from: c */
    public C36030b mo106641c() {
        return this.f88002b;
    }

    @C0359n0
    /* renamed from: d */
    public C36064q<Activity> mo106642d() {
        return new C35595e(this);
    }

    @C0359n0
    /* renamed from: e */
    public C35910d<C9711g> mo106643e() {
        return this.f88004d;
    }

    /* renamed from: f */
    public boolean mo106644f() {
        return this.f88006f;
    }

    @C0359n0
    /* renamed from: g */
    public Activity mo106645g() {
        return this.f88001a;
    }
}
