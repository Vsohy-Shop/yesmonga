package com.google.android.datatransport.runtime;

import com.google.android.datatransport.C40041c;
import com.google.android.datatransport.C40083d;
import com.google.android.datatransport.C40085f;
import com.google.android.datatransport.runtime.C40201q;

/* renamed from: com.google.android.datatransport.runtime.c */
public final class C40117c extends C40201q {

    /* renamed from: a */
    public final C40203r f102346a;

    /* renamed from: b */
    public final String f102347b;

    /* renamed from: c */
    public final C40083d<?> f102348c;

    /* renamed from: d */
    public final C40085f<?, byte[]> f102349d;

    /* renamed from: e */
    public final C40041c f102350e;

    /* renamed from: com.google.android.datatransport.runtime.c$b */
    public static final class C40119b extends C40201q.C40202a {

        /* renamed from: a */
        public C40203r f102351a;

        /* renamed from: b */
        public String f102352b;

        /* renamed from: c */
        public C40083d<?> f102353c;

        /* renamed from: d */
        public C40085f<?, byte[]> f102354d;

        /* renamed from: e */
        public C40041c f102355e;

        /* renamed from: a */
        public C40201q mo132731a() {
            String str = "";
            if (this.f102351a == null) {
                str = str + " transportContext";
            }
            if (this.f102352b == null) {
                str = str + " transportName";
            }
            if (this.f102353c == null) {
                str = str + " event";
            }
            if (this.f102354d == null) {
                str = str + " transformer";
            }
            if (this.f102355e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C40117c(this.f102351a, this.f102352b, this.f102353c, this.f102354d, this.f102355e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C40201q.C40202a mo132732b(C40041c cVar) {
            if (cVar != null) {
                this.f102355e = cVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* renamed from: c */
        public C40201q.C40202a mo132733c(C40083d<?> dVar) {
            if (dVar != null) {
                this.f102353c = dVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* renamed from: e */
        public C40201q.C40202a mo132734e(C40085f<?, byte[]> fVar) {
            if (fVar != null) {
                this.f102354d = fVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        /* renamed from: f */
        public C40201q.C40202a mo132735f(C40203r rVar) {
            if (rVar != null) {
                this.f102351a = rVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        /* renamed from: g */
        public C40201q.C40202a mo132736g(String str) {
            if (str != null) {
                this.f102352b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    /* renamed from: b */
    public C40041c mo132723b() {
        return this.f102350e;
    }

    /* renamed from: c */
    public C40083d<?> mo132724c() {
        return this.f102348c;
    }

    /* renamed from: e */
    public C40085f<?, byte[]> mo132725e() {
        return this.f102349d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40201q)) {
            return false;
        }
        C40201q qVar = (C40201q) obj;
        if (!this.f102346a.equals(qVar.mo132727f()) || !this.f102347b.equals(qVar.mo132728g()) || !this.f102348c.equals(qVar.mo132724c()) || !this.f102349d.equals(qVar.mo132725e()) || !this.f102350e.equals(qVar.mo132723b())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C40203r mo132727f() {
        return this.f102346a;
    }

    /* renamed from: g */
    public String mo132728g() {
        return this.f102347b;
    }

    public int hashCode() {
        return ((((((((this.f102346a.hashCode() ^ 1000003) * 1000003) ^ this.f102347b.hashCode()) * 1000003) ^ this.f102348c.hashCode()) * 1000003) ^ this.f102349d.hashCode()) * 1000003) ^ this.f102350e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f102346a + ", transportName=" + this.f102347b + ", event=" + this.f102348c + ", transformer=" + this.f102349d + ", encoding=" + this.f102350e + "}";
    }

    public C40117c(C40203r rVar, String str, C40083d<?> dVar, C40085f<?, byte[]> fVar, C40041c cVar) {
        this.f102346a = rVar;
        this.f102347b = str;
        this.f102348c = dVar;
        this.f102349d = fVar;
        this.f102350e = cVar;
    }
}
