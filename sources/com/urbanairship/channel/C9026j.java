package com.urbanairship.channel;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.RequestException;
import com.urbanairship.util.C9669o0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.channel.j */
public class C9026j {

    /* renamed from: a */
    public final Object f24272a = new Object();

    /* renamed from: b */
    public final C9017f f24273b;

    /* renamed from: c */
    public final C9034n f24274c;

    /* renamed from: d */
    public final List<C9024h> f24275d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public String f24276e;

    public C9026j(C9017f fVar, C9034n nVar) {
        this.f24273b = fVar;
        this.f24274c = nVar;
    }

    /* renamed from: a */
    public void mo17841a(@C0359n0 C9024h hVar) {
        this.f24275d.add(hVar);
    }

    /* renamed from: b */
    public void mo17842b(@C0359n0 List<C9025i> list) {
        this.f24274c.mo19595a(list);
    }

    /* renamed from: c */
    public void mo17843c() {
        this.f24274c.mo19601g();
    }

    /* renamed from: d */
    public List<C9025i> mo17844d() {
        ArrayList arrayList = new ArrayList();
        for (List addAll : this.f24274c.mo19598d()) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }

    /* renamed from: e */
    public void mo17845e(String str, boolean z) {
        synchronized (this.f24272a) {
            if (z) {
                if (!C9669o0.m36223d(this.f24276e, str)) {
                    this.f24274c.mo19601g();
                }
            }
            this.f24276e = str;
        }
    }

    /* renamed from: f */
    public boolean mo17846f() {
        List list;
        String str;
        synchronized (this.f24272a) {
            this.f24274c.mo17884h();
            list = (List) this.f24274c.mo19599e();
            str = this.f24276e;
        }
        if (str == null || list == null || list.isEmpty()) {
            return true;
        }
        try {
            C9116c<Void> d = this.f24273b.mo17826d(str, list);
            C36059m.m148406b("Updated attributes response: %s", d);
            if (d.mo18149k() || d.mo18151m()) {
                return false;
            }
            if (d.mo18148j()) {
                C36059m.m148409e("Dropping attributes %s due to error: %s message: %s", list, Integer.valueOf(d.mo18147i()), d.mo18141c());
            } else {
                for (C9024h a : this.f24275d) {
                    a.mo17696a(list);
                }
            }
            synchronized (this.f24272a) {
                if (list.equals(this.f24274c.mo19599e()) && str.equals(this.f24276e)) {
                    this.f24274c.mo19600f();
                }
            }
            return true;
        } catch (RequestException e) {
            C36059m.m148407c(e, "Failed to update attributes", new Object[0]);
            return false;
        }
    }
}
