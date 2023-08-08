package com.urbanairship.channel;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.RequestException;
import com.urbanairship.util.C9652h;
import com.urbanairship.util.C9669o0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.channel.u */
public class C9052u {

    /* renamed from: g */
    public static final long f24380g = 600000;

    /* renamed from: a */
    public final List<C9050s> f24381a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final Object f24382b = new Object();

    /* renamed from: c */
    public final C9046q f24383c;

    /* renamed from: d */
    public final C9038o f24384d;
    @C0344h1
    @C0359n0

    /* renamed from: e */
    public final List<C9652h<C9051t>> f24385e = new CopyOnWriteArrayList();

    /* renamed from: f */
    public String f24386f;

    public C9052u(C9046q qVar, C9038o oVar) {
        this.f24383c = qVar;
        this.f24384d = oVar;
        oVar.mo17888h();
    }

    /* renamed from: a */
    public void mo17918a(@C0359n0 List<C9051t> list) {
        this.f24384d.mo19595a(list);
    }

    /* renamed from: b */
    public void mo17919b(@C0359n0 C9050s sVar) {
        this.f24381a.add(sVar);
    }

    /* renamed from: c */
    public void mo17920c(@C0359n0 Set<String> set) {
        for (C9652h next : this.f24385e) {
            C9051t tVar = (C9051t) next.mo19620a();
            if (tVar != null) {
                tVar.mo17911a(set);
            } else {
                this.f24385e.remove(next);
            }
        }
    }

    /* renamed from: d */
    public void mo17921d(@C0359n0 List<C9051t> list) {
        synchronized (this.f24382b) {
            for (C9051t c : list) {
                C9652h hVar = new C9652h();
                hVar.mo19622c(c, 600000);
                this.f24385e.add(hVar);
            }
        }
    }

    /* renamed from: e */
    public void mo17922e() {
        this.f24385e.clear();
    }

    /* renamed from: f */
    public void mo17923f() {
        this.f24384d.mo19601g();
    }

    @C0363p0
    /* renamed from: g */
    public Set<String> mo17924g() {
        String str;
        synchronized (this.f24382b) {
            str = this.f24386f;
        }
        try {
            C9116c<Set<String>> d = this.f24383c.mo17898d(str);
            C36059m.m148419o("Channel Subscription list fetched: %s", d);
            if (d.mo18150l()) {
                return d.mo18144f();
            }
            C36059m.m148409e("Failed to fetch channel subscription lists! error: %d message: %s", Integer.valueOf(d.mo18147i()), d.mo18141c());
            return null;
        } catch (RequestException e) {
            C36059m.m148411g(e, "Failed to fetch channel subscription lists!", new Object[0]);
            return null;
        }
    }

    /* renamed from: h */
    public List<C9051t> mo17925h() {
        ArrayList arrayList = new ArrayList();
        for (List addAll : this.f24384d.mo19598d()) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }

    /* renamed from: i */
    public void mo17926i(@C0359n0 C9050s sVar) {
        this.f24381a.remove(sVar);
    }

    /* renamed from: j */
    public void mo17927j(String str, boolean z) {
        synchronized (this.f24382b) {
            if (z) {
                if (!C9669o0.m36223d(this.f24386f, str)) {
                    this.f24384d.mo19601g();
                }
            }
            this.f24386f = str;
        }
    }

    /* renamed from: k */
    public boolean mo17928k() {
        List list;
        String str;
        while (true) {
            synchronized (this.f24382b) {
                this.f24384d.mo17888h();
                list = (List) this.f24384d.mo19599e();
                str = this.f24386f;
            }
            if (C9669o0.m36224e(str) || list == null || list.isEmpty()) {
                return true;
            }
            try {
                C9116c<Void> f = this.f24383c.mo17900f(str, list);
                C36059m.m148406b("Subscription lists update response: %s", f);
                if (f.mo18149k() || f.mo18151m()) {
                    return false;
                }
                if (f.mo18148j()) {
                    C36059m.m148409e("Dropping subscription list update %s due to error: %d message: %s", list, Integer.valueOf(f.mo18147i()), f.mo18141c());
                } else {
                    for (C9050s a : this.f24381a) {
                        a.mo17910a(str, list);
                    }
                }
                synchronized (this.f24382b) {
                    if (list.equals(this.f24384d.mo19599e()) && str.equals(this.f24386f)) {
                        this.f24384d.mo19600f();
                        if (f.mo18150l()) {
                            mo17921d(list);
                        }
                    }
                }
            } catch (RequestException e) {
                C36059m.m148411g(e, "Failed to update subscription lists!", new Object[0]);
                return false;
            }
        }
        return false;
    }
}
