package com.google.zxing.oned.rss.expanded;

import com.google.zxing.oned.rss.C34795b;
import com.google.zxing.oned.rss.C34796c;
import java.util.Objects;

/* renamed from: com.google.zxing.oned.rss.expanded.b */
public final class C34800b {

    /* renamed from: a */
    public final C34795b f84440a;

    /* renamed from: b */
    public final C34795b f84441b;

    /* renamed from: c */
    public final C34796c f84442c;

    public C34800b(C34795b bVar, C34795b bVar2, C34796c cVar) {
        this.f84440a = bVar;
        this.f84441b = bVar2;
        this.f84442c = cVar;
    }

    /* renamed from: a */
    public C34796c mo102945a() {
        return this.f84442c;
    }

    /* renamed from: b */
    public C34795b mo102946b() {
        return this.f84440a;
    }

    /* renamed from: c */
    public C34795b mo102947c() {
        return this.f84441b;
    }

    /* renamed from: d */
    public boolean mo102948d() {
        return this.f84441b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C34800b)) {
            return false;
        }
        C34800b bVar = (C34800b) obj;
        if (!Objects.equals(this.f84440a, bVar.f84440a) || !Objects.equals(this.f84441b, bVar.f84441b) || !Objects.equals(this.f84442c, bVar.f84442c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Objects.hashCode(this.f84440a) ^ Objects.hashCode(this.f84441b)) ^ Objects.hashCode(this.f84442c);
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f84440a);
        sb.append(" , ");
        sb.append(this.f84441b);
        sb.append(" : ");
        C34796c cVar = this.f84442c;
        if (cVar == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(cVar.mo102934c());
        }
        sb.append(obj);
        sb.append(" ]");
        return sb.toString();
    }
}
