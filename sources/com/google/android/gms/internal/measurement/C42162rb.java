package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.rb */
public final class C42162rb implements Iterator {

    /* renamed from: a */
    public int f106383a = -1;

    /* renamed from: b */
    public boolean f106384b;

    /* renamed from: c */
    public Iterator f106385c;

    /* renamed from: d */
    public final /* synthetic */ C42230vb f106386d;

    public /* synthetic */ C42162rb(C42230vb vbVar, C42145qb qbVar) {
        this.f106386d = vbVar;
    }

    /* renamed from: b */
    public final Iterator mo137254b() {
        if (this.f106385c == null) {
            this.f106385c = this.f106386d.f106468c.entrySet().iterator();
        }
        return this.f106385c;
    }

    public final boolean hasNext() {
        if (this.f106383a + 1 < this.f106386d.f106467b.size()) {
            return true;
        }
        if (this.f106386d.f106468c.isEmpty()) {
            return false;
        }
        if (mo137254b().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f106384b = true;
        int i = this.f106383a + 1;
        this.f106383a = i;
        if (i < this.f106386d.f106467b.size()) {
            return (Map.Entry) this.f106386d.f106467b.get(this.f106383a);
        }
        return (Map.Entry) mo137254b().next();
    }

    public final void remove() {
        if (this.f106384b) {
            this.f106384b = false;
            this.f106386d.mo137387p();
            if (this.f106383a < this.f106386d.f106467b.size()) {
                C42230vb vbVar = this.f106386d;
                int i = this.f106383a;
                this.f106383a = i - 1;
                Object unused = vbVar.mo137385n(i);
                return;
            }
            mo137254b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
