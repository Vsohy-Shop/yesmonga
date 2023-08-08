package com.google.android.gms.internal.measurement;

import com.google.firebase.installations.local.C33093b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n */
public class C42082n implements C42133q, C42065m {

    /* renamed from: a */
    public final Map f106301a = new HashMap();

    /* renamed from: I0 */
    public final C42133q mo136728I0(String str) {
        if (this.f106301a.containsKey(str)) {
            return (C42133q) this.f106301a.get(str);
        }
        return C42133q.f106351H;
    }

    /* renamed from: a */
    public final List mo137161a() {
        return new ArrayList(this.f106301a.keySet());
    }

    /* renamed from: e */
    public final C42133q mo136734e() {
        C42082n nVar = new C42082n();
        for (Map.Entry entry : this.f106301a.entrySet()) {
            if (entry.getValue() instanceof C42065m) {
                nVar.f106301a.put((String) entry.getKey(), (C42133q) entry.getValue());
            } else {
                nVar.f106301a.put((String) entry.getKey(), ((C42133q) entry.getValue()).mo136734e());
            }
        }
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42082n)) {
            return false;
        }
        return this.f106301a.equals(((C42082n) obj).f106301a);
    }

    /* renamed from: h */
    public final Boolean mo136738h() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return this.f106301a.hashCode();
    }

    /* renamed from: i */
    public C42133q mo136741i(String str, C41909d5 d5Var, List list) {
        if ("toString".equals(str)) {
            return new C42201u(toString());
        }
        return C42029k.m170426a(this, new C42201u(str), d5Var, list);
    }

    /* renamed from: j */
    public final Double mo136743j() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: k */
    public final String mo136744k() {
        return "[object Object]";
    }

    /* renamed from: q */
    public final Iterator mo136745q() {
        return C42029k.m170427b(this.f106301a);
    }

    /* renamed from: r */
    public final boolean mo136746r(String str) {
        return this.f106301a.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C33093b.f80281i);
        if (!this.f106301a.isEmpty()) {
            for (String str : this.f106301a.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, this.f106301a.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: w */
    public final void mo136748w(String str, C42133q qVar) {
        if (qVar == null) {
            this.f106301a.remove(str);
        } else {
            this.f106301a.put(str, qVar);
        }
    }
}
