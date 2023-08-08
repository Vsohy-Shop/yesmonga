package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.internal.C32072n0;
import com.google.android.play.core.internal.C32084r0;
import com.google.android.play.core.internal.C32092u;
import com.google.android.play.core.splitcompat.C32150r;
import com.google.android.play.core.tasks.C32227d;
import com.google.android.play.core.tasks.C32229f;
import com.google.android.play.core.tasks.C32239p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.d0 */
public final class C32162d0 {

    /* renamed from: c */
    public static final C32062k f78398c = new C32062k("SplitInstallService");

    /* renamed from: d */
    public static final Intent f78399d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    public final String f78400a;
    @Nullable

    /* renamed from: b */
    public C32092u<C32072n0> f78401b;

    public C32162d0(Context context) {
        this.f78400a = context.getPackageName();
        if (C32084r0.m129917a(context)) {
            this.f78401b = new C32092u(C32150r.m130103c(context), f78398c, "SplitInstallService", f78399d, C32177k.f78433a);
        }
    }

    /* renamed from: i */
    public static /* synthetic */ ArrayList m130148i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: j */
    public static /* synthetic */ ArrayList m130149j(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("language", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: l */
    public static /* synthetic */ Bundle m130151l() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11000);
        return bundle;
    }

    /* renamed from: n */
    public static <T> C32227d<T> m130153n() {
        f78398c.mo92776b("onError(%d)", -14);
        return C32229f.m130361d(new SplitInstallException(-14));
    }

    /* renamed from: a */
    public final C32227d<Integer> mo92938a(Collection<String> collection, Collection<String> collection2) {
        if (this.f78401b == null) {
            return m130153n();
        }
        f78398c.mo92778d("startInstall(%s,%s)", collection, collection2);
        C32239p pVar = new C32239p();
        this.f78401b.mo92829a(new C32181m(this, pVar, collection, collection2, pVar));
        return pVar.mo93032c();
    }

    /* renamed from: b */
    public final C32227d<Void> mo92939b(List<String> list) {
        if (this.f78401b == null) {
            return m130153n();
        }
        f78398c.mo92778d("deferredUninstall(%s)", list);
        C32239p pVar = new C32239p();
        this.f78401b.mo92829a(new C32186n(this, pVar, list, pVar));
        return pVar.mo93032c();
    }

    /* renamed from: c */
    public final C32227d<Void> mo92940c(List<String> list) {
        if (this.f78401b == null) {
            return m130153n();
        }
        f78398c.mo92778d("deferredInstall(%s)", list);
        C32239p pVar = new C32239p();
        this.f78401b.mo92829a(new C32188o(this, pVar, list, pVar));
        return pVar.mo93032c();
    }

    /* renamed from: d */
    public final C32227d<Void> mo92941d(List<String> list) {
        if (this.f78401b == null) {
            return m130153n();
        }
        f78398c.mo92778d("deferredLanguageInstall(%s)", list);
        C32239p pVar = new C32239p();
        this.f78401b.mo92829a(new C32190p(this, pVar, list, pVar));
        return pVar.mo93032c();
    }

    /* renamed from: e */
    public final C32227d<Void> mo92942e(List<String> list) {
        if (this.f78401b == null) {
            return m130153n();
        }
        f78398c.mo92778d("deferredLanguageUninstall(%s)", list);
        C32239p pVar = new C32239p();
        this.f78401b.mo92829a(new C32192q(this, pVar, list, pVar));
        return pVar.mo93032c();
    }

    /* renamed from: f */
    public final C32227d<C32167f> mo92943f(int i) {
        if (this.f78401b == null) {
            return m130153n();
        }
        f78398c.mo92778d("getSessionState(%d)", Integer.valueOf(i));
        C32239p pVar = new C32239p();
        this.f78401b.mo92829a(new C32194r(this, pVar, i, pVar));
        return pVar.mo93032c();
    }

    /* renamed from: g */
    public final C32227d<List<C32167f>> mo92944g() {
        if (this.f78401b == null) {
            return m130153n();
        }
        f78398c.mo92778d("getSessionStates", new Object[0]);
        C32239p pVar = new C32239p();
        this.f78401b.mo92829a(new C32196s(this, pVar, pVar));
        return pVar.mo93032c();
    }

    /* renamed from: h */
    public final C32227d<Void> mo92945h(int i) {
        if (this.f78401b == null) {
            return m130153n();
        }
        f78398c.mo92778d("cancelInstall(%d)", Integer.valueOf(i));
        C32239p pVar = new C32239p();
        this.f78401b.mo92829a(new C32198t(this, pVar, i, pVar));
        return pVar.mo93032c();
    }
}
