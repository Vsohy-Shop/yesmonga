package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.Config;

/* renamed from: androidx.camera.core.impl.b */
public final class C1436b<T> extends Config.C1421a<T> {

    /* renamed from: a */
    public final String f4180a;

    /* renamed from: b */
    public final Class<T> f4181b;

    /* renamed from: c */
    public final Object f4182c;

    public C1436b(String str, Class<T> cls, @C0363p0 Object obj) {
        if (str != null) {
            this.f4180a = str;
            if (cls != null) {
                this.f4181b = cls;
                this.f4182c = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    @C0359n0
    /* renamed from: c */
    public String mo5133c() {
        return this.f4180a;
    }

    @C0363p0
    /* renamed from: d */
    public Object mo5134d() {
        return this.f4182c;
    }

    @C0359n0
    /* renamed from: e */
    public Class<T> mo5135e() {
        return this.f4181b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Config.C1421a)) {
            return false;
        }
        Config.C1421a aVar = (Config.C1421a) obj;
        if (this.f4180a.equals(aVar.mo5133c()) && this.f4181b.equals(aVar.mo5135e())) {
            Object obj2 = this.f4182c;
            if (obj2 == null) {
                if (aVar.mo5134d() == null) {
                    return true;
                }
            } else if (obj2.equals(aVar.mo5134d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f4180a.hashCode() ^ 1000003) * 1000003) ^ this.f4181b.hashCode()) * 1000003;
        Object obj = this.f4182c;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Option{id=" + this.f4180a + ", valueClass=" + this.f4181b + ", token=" + this.f4182c + "}";
    }
}
