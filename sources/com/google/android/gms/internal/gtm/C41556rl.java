package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.rl */
public final class C41556rl implements Iterator<Map.Entry> {

    /* renamed from: a */
    public int f104928a = -1;

    /* renamed from: b */
    public boolean f104929b;

    /* renamed from: c */
    public Iterator<Map.Entry> f104930c;

    /* renamed from: d */
    public final /* synthetic */ C41652vl f104931d;

    public /* synthetic */ C41556rl(C41652vl vlVar, C41532ql qlVar) {
        this.f104931d = vlVar;
    }

    /* renamed from: b */
    public final Iterator<Map.Entry> mo135809b() {
        if (this.f104930c == null) {
            this.f104930c = this.f104931d.f105176c.entrySet().iterator();
        }
        return this.f104930c;
    }

    public final boolean hasNext() {
        if (this.f104928a + 1 < this.f104931d.f105175b.size()) {
            return true;
        }
        if (this.f104931d.f105176c.isEmpty()) {
            return false;
        }
        if (mo135809b().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f104929b = true;
        int i = this.f104928a + 1;
        this.f104928a = i;
        if (i < this.f104931d.f105175b.size()) {
            return (Map.Entry) this.f104931d.f105175b.get(this.f104928a);
        }
        return mo135809b().next();
    }

    public final void remove() {
        if (this.f104929b) {
            this.f104929b = false;
            this.f104931d.mo136002p();
            if (this.f104928a < this.f104931d.f105175b.size()) {
                C41652vl vlVar = this.f104931d;
                int i = this.f104928a;
                this.f104928a = i - 1;
                Object unused = vlVar.mo136000n(i);
                return;
            }
            mo135809b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
