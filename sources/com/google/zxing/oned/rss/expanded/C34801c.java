package com.google.zxing.oned.rss.expanded;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.oned.rss.expanded.c */
public final class C34801c {

    /* renamed from: a */
    public final List<C34800b> f84443a;

    /* renamed from: b */
    public final int f84444b;

    /* renamed from: c */
    public final boolean f84445c;

    public C34801c(List<C34800b> list, int i, boolean z) {
        this.f84443a = new ArrayList(list);
        this.f84444b = i;
        this.f84445c = z;
    }

    /* renamed from: a */
    public List<C34800b> mo102952a() {
        return this.f84443a;
    }

    /* renamed from: b */
    public int mo102953b() {
        return this.f84444b;
    }

    /* renamed from: c */
    public boolean mo102954c(List<C34800b> list) {
        return this.f84443a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C34801c)) {
            return false;
        }
        C34801c cVar = (C34801c) obj;
        if (!this.f84443a.equals(cVar.mo102952a()) || this.f84445c != cVar.f84445c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f84443a.hashCode() ^ Boolean.valueOf(this.f84445c).hashCode();
    }

    public String toString() {
        return "{ " + this.f84443a + " }";
    }
}
