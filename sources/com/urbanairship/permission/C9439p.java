package com.urbanairship.permission;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0344h1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.C0843a;
import androidx.core.util.C17970d;
import com.urbanairship.C36059m;
import com.urbanairship.C36062p;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36035g;
import com.urbanairship.app.C36038h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.urbanairship.permission.p */
public class C9439p {

    /* renamed from: a */
    public final Context f25790a;

    /* renamed from: b */
    public final Map<Permission, C9425b> f25791b = new HashMap();

    /* renamed from: c */
    public final List<C17970d<Permission>> f25792c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final Map<Permission, PermissionStatus> f25793d = new HashMap();

    /* renamed from: e */
    public final Handler f25794e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public final List<C9424a> f25795f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public final Map<C9425b, C36062p<C9426c>> f25796g = new HashMap();

    /* renamed from: h */
    public final Map<C9425b, C36062p<PermissionStatus>> f25797h = new HashMap();

    /* renamed from: com.urbanairship.permission.p$a */
    public class C9440a extends C36038h {
        public C9440a() {
        }

        public void onActivityResumed(@C0359n0 Activity activity) {
            C9439p.this.mo19139H();
        }
    }

    public C9439p(@C0359n0 Context context) {
        this.f25790a = context.getApplicationContext();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m35449p(Permission permission, C36062p pVar, C9425b bVar, PermissionStatus permissionStatus) {
        C36059m.m148406b("Check permission %s status result: %s", permission, permissionStatus);
        m35456w(permission, permissionStatus);
        pVar.mo107828g(permissionStatus);
        synchronized (this.f25797h) {
            this.f25797h.remove(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m35450q(C9425b bVar, Permission permission, C36062p pVar) {
        bVar.mo19125b(this.f25790a, new C9438o(this, permission, pVar, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ C36062p m35451r(Permission permission, C9425b bVar) {
        C36062p pVar = new C36062p();
        if (bVar == null) {
            C36059m.m148406b("No delegate for permission %s", permission);
            pVar.mo107828g(PermissionStatus.NOT_DETERMINED);
            return pVar;
        }
        synchronized (this.f25797h) {
            this.f25797h.put(bVar, pVar);
        }
        this.f25794e.post(new C9429f(this, bVar, permission, pVar));
        return pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m35452s(Permission permission, C36062p pVar, C9425b bVar, C9426c cVar) {
        C36059m.m148406b("Permission %s request result: %s", permission, cVar);
        m35456w(permission, cVar.mo19126b());
        pVar.mo107828g(cVar);
        synchronized (this.f25796g) {
            this.f25796g.remove(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m35453t(C9425b bVar, Permission permission, C36062p pVar) {
        bVar.mo19124a(this.f25790a, new C9430g(this, permission, pVar, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ C36062p m35454u(Permission permission, C9425b bVar) {
        C36062p pVar = new C36062p();
        if (bVar == null) {
            C36059m.m148406b("No delegate for permission %s", permission);
            pVar.mo107828g(C9426c.m35436e());
            return pVar;
        }
        synchronized (this.f25796g) {
            this.f25796g.put(bVar, pVar);
        }
        this.f25794e.post(new C9436m(this, bVar, permission, pVar));
        return pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m35455v(Permission permission, C9426c cVar) {
        if (cVar != null && cVar.mo19126b() == PermissionStatus.GRANTED) {
            for (C17970d<Permission> accept : this.f25792c) {
                accept.accept(permission);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: x */
    public static C9439p m35457x(@C0359n0 Context context) {
        return m35458y(context, C36035g.m148341t(context));
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: y */
    public static C9439p m35458y(@C0359n0 Context context, @C0359n0 C36030b bVar) {
        C9439p pVar = new C9439p(context);
        bVar.mo18484e(new C9440a());
        return pVar;
    }

    /* renamed from: A */
    public void mo19132A(@C0359n0 C9424a aVar) {
        this.f25795f.remove(aVar);
    }

    @C0359n0
    /* renamed from: B */
    public C36062p<C9426c> mo19133B(@C0359n0 Permission permission) {
        return mo19134C(permission, false);
    }

    @C0359n0
    /* renamed from: C */
    public C36062p<C9426c> mo19134C(@C0359n0 Permission permission, boolean z) {
        C36062p<C9426c> z2;
        C36059m.m148406b("Requesting permission for %s", permission);
        synchronized (this.f25796g) {
            z2 = mo19146z(permission, this.f25796g, new C9432i(this, permission));
            if (z) {
                z2.mo107826e(new C9433j(this, permission));
            }
        }
        return z2;
    }

    /* renamed from: D */
    public void mo19135D(@C0359n0 Permission permission, @C0359n0 C17970d<C9426c> dVar) {
        mo19136E(permission, false, dVar);
    }

    /* renamed from: E */
    public void mo19136E(@C0359n0 Permission permission, boolean z, @C0359n0 C17970d<C9426c> dVar) {
        C36062p<C9426c> C = mo19134C(permission, z);
        Objects.requireNonNull(dVar);
        C.mo107826e(new C9434k(dVar));
    }

    /* renamed from: F */
    public void mo19137F(@C0359n0 Permission permission, @C0363p0 C9425b bVar) {
        synchronized (this.f25791b) {
            this.f25791b.put(permission, bVar);
            mo19142l(permission);
        }
    }

    @C0353k0
    /* renamed from: G */
    public final void m35456w(@C0359n0 Permission permission, @C0359n0 PermissionStatus permissionStatus) {
        PermissionStatus permissionStatus2 = this.f25793d.get(permission);
        if (!(permissionStatus2 == null || permissionStatus2 == permissionStatus)) {
            for (C9424a a : this.f25795f) {
                a.mo19123a(permission, permissionStatus);
            }
        }
        this.f25793d.put(permission, permissionStatus);
    }

    @C0353k0
    /* renamed from: H */
    public final void mo19139H() {
        for (Permission next : mo19144n()) {
            mo19143m(next, new C9437n(this, next));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: j */
    public void mo19140j(@C0359n0 C17970d<Permission> dVar) {
        this.f25792c.add(dVar);
    }

    /* renamed from: k */
    public void mo19141k(@C0359n0 C9424a aVar) {
        this.f25795f.add(aVar);
    }

    @C0359n0
    /* renamed from: l */
    public C36062p<PermissionStatus> mo19142l(@C0359n0 Permission permission) {
        C36062p<PermissionStatus> z;
        C36059m.m148406b("Checking permission for %s", permission);
        synchronized (this.f25797h) {
            z = mo19146z(permission, this.f25797h, new C9431h(this, permission));
        }
        return z;
    }

    /* renamed from: m */
    public void mo19143m(@C0359n0 Permission permission, @C0359n0 C17970d<PermissionStatus> dVar) {
        C36062p<PermissionStatus> l = mo19142l(permission);
        Objects.requireNonNull(dVar);
        l.mo107826e(new C9435l(dVar));
    }

    @C0359n0
    /* renamed from: n */
    public Set<Permission> mo19144n() {
        Set<Permission> keySet;
        synchronized (this.f25791b) {
            keySet = this.f25791b.keySet();
        }
        return keySet;
    }

    /* renamed from: o */
    public final C9425b mo19145o(Permission permission) {
        C9425b bVar;
        synchronized (this.f25791b) {
            bVar = this.f25791b.get(permission);
        }
        return bVar;
    }

    /* renamed from: z */
    public final <T> C36062p<T> mo19146z(Permission permission, Map<C9425b, C36062p<T>> map, C0843a<C9425b, C36062p<T>> aVar) {
        C36062p<T> pVar;
        C9425b o = mo19145o(permission);
        if (o == null || (pVar = map.get(o)) == null) {
            return aVar.apply(o);
        }
        return pVar;
    }
}
