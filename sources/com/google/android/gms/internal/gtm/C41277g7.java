package com.google.android.gms.internal.gtm;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.g7 */
public final class C41277g7 {

    /* renamed from: a */
    public C41277g7 f104619a;

    /* renamed from: b */
    public Map<String, C41310hg> f104620b;

    public C41277g7(@C0363p0 C41277g7 g7Var) {
        this.f104620b = null;
        this.f104619a = g7Var;
    }

    /* renamed from: a */
    public final C41277g7 mo135406a() {
        return new C41277g7(this);
    }

    /* renamed from: b */
    public final C41310hg<?> mo135407b(String str) {
        String str2;
        Map<String, C41310hg> map = this.f104620b;
        if (map != null && map.containsKey(str)) {
            return this.f104620b.get(str);
        }
        C41277g7 g7Var = this.f104619a;
        if (g7Var != null) {
            return g7Var.mo135407b(str);
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Trying to get a non existent symbol: ".concat(valueOf);
        } else {
            str2 = new String("Trying to get a non existent symbol: ");
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: c */
    public final void mo135408c(String str, C41310hg<?> hgVar) {
        if (this.f104620b == null) {
            this.f104620b = new HashMap();
        }
        this.f104620b.put(str, hgVar);
    }

    /* renamed from: d */
    public final void mo135409d(String str) {
        C40843u.m166208r(mo135411f("gtm.globals.eventName"));
        Map<String, C41310hg> map = this.f104620b;
        if (map == null || !map.containsKey("gtm.globals.eventName")) {
            this.f104619a.mo135409d("gtm.globals.eventName");
        } else {
            this.f104620b.remove("gtm.globals.eventName");
        }
    }

    /* renamed from: e */
    public final void mo135410e(String str, C41310hg<?> hgVar) {
        String str2;
        Map<String, C41310hg> map = this.f104620b;
        if (map == null || !map.containsKey(str)) {
            C41277g7 g7Var = this.f104619a;
            if (g7Var == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Trying to modify a non existent symbol: ".concat(valueOf);
                } else {
                    str2 = new String("Trying to modify a non existent symbol: ");
                }
                throw new IllegalStateException(str2);
            }
            g7Var.mo135410e(str, hgVar);
            return;
        }
        this.f104620b.put(str, hgVar);
    }

    /* renamed from: f */
    public final boolean mo135411f(String str) {
        Map<String, C41310hg> map = this.f104620b;
        if (map != null && map.containsKey(str)) {
            return true;
        }
        C41277g7 g7Var = this.f104619a;
        if (g7Var != null) {
            return g7Var.mo135411f(str);
        }
        return false;
    }

    public C41277g7() {
        this((C41277g7) null);
    }
}
