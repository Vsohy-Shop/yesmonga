package com.urbanairship.channel;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.RequestException;
import com.urbanairship.util.C9669o0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.channel.y */
public class C9059y {

    /* renamed from: a */
    public final List<C9058x> f24403a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final Object f24404b = new Object();

    /* renamed from: c */
    public final C9054w f24405c;

    /* renamed from: d */
    public final C9042p f24406d;

    /* renamed from: e */
    public String f24407e;

    public C9059y(C9054w wVar, C9042p pVar) {
        this.f24405c = wVar;
        this.f24406d = pVar;
        pVar.mo17892h();
    }

    /* renamed from: a */
    public void mo17945a(@C0359n0 List<C9004a0> list) {
        this.f24406d.mo19596b(list);
    }

    /* renamed from: b */
    public void mo17946b(@C0359n0 C9058x xVar) {
        this.f24403a.add(xVar);
    }

    /* renamed from: c */
    public void mo17947c() {
        this.f24406d.mo19601g();
    }

    /* renamed from: d */
    public List<C9004a0> mo17948d() {
        return this.f24406d.mo19598d();
    }

    /* renamed from: e */
    public void mo17949e(String str, boolean z) {
        synchronized (this.f24404b) {
            if (z) {
                if (!C9669o0.m36223d(this.f24407e, str)) {
                    this.f24406d.mo19601g();
                }
            }
            this.f24407e = str;
        }
    }

    /* renamed from: f */
    public boolean mo17950f() {
        C9004a0 a0Var;
        String str;
        while (true) {
            synchronized (this.f24404b) {
                this.f24406d.mo17892h();
                a0Var = (C9004a0) this.f24406d.mo19599e();
                str = this.f24407e;
            }
            if (C9669o0.m36224e(str) || a0Var == null) {
                return true;
            }
            try {
                C9116c<Void> g = this.f24405c.mo17938g(str, a0Var);
                C36059m.m148406b("Updated tag group response: %s", g);
                if (g.mo18149k() || g.mo18151m()) {
                    return false;
                }
                if (g.mo18148j()) {
                    C36059m.m148409e("Dropping tag group update %s due to error: %s message: %s", a0Var, Integer.valueOf(g.mo18147i()), g.mo18141c());
                } else {
                    for (C9058x a : this.f24403a) {
                        a.mo17695a(Collections.singletonList(a0Var));
                    }
                }
                synchronized (this.f24404b) {
                    if (a0Var.equals(this.f24406d.mo19599e()) && str.equals(this.f24407e)) {
                        this.f24406d.mo19600f();
                    }
                }
            } catch (RequestException e) {
                C36059m.m148407c(e, "Failed to update tag groups", new Object[0]);
                return false;
            }
        }
        return false;
    }
}
