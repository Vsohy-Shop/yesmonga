package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.core.util.C18001r;

/* renamed from: androidx.core.content.m0 */
public final class C17358m0 {

    /* renamed from: a */
    public final String f45650a;

    /* renamed from: b */
    public final LocusId f45651b;

    @C0376v0(29)
    /* renamed from: androidx.core.content.m0$a */
    public static class C17359a {
        @C0359n0
        /* renamed from: a */
        public static LocusId m79889a(@C0359n0 String str) {
            C17350l0.m79788a();
            return C17348k0.m79787a(str);
        }

        @C0359n0
        /* renamed from: b */
        public static String m79890b(@C0359n0 LocusId locusId) {
            return locusId.getId();
        }
    }

    public C17358m0(@C0359n0 String str) {
        this.f45650a = (String) C18001r.m81780q(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f45651b = C17359a.m79889a(str);
        } else {
            this.f45651b = null;
        }
    }

    @C0359n0
    @C0376v0(29)
    /* renamed from: d */
    public static C17358m0 m79885d(@C0359n0 LocusId locusId) {
        C18001r.m81776m(locusId, "locusId cannot be null");
        return new C17358m0((String) C18001r.m81780q(C17359a.m79890b(locusId), "id cannot be empty"));
    }

    @C0359n0
    /* renamed from: a */
    public String mo51796a() {
        return this.f45650a;
    }

    @C0359n0
    /* renamed from: b */
    public final String mo51797b() {
        int length = this.f45650a.length();
        return length + "_chars";
    }

    @C0359n0
    @C0376v0(29)
    /* renamed from: c */
    public LocusId mo51798c() {
        return this.f45651b;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17358m0.class != obj.getClass()) {
            return false;
        }
        C17358m0 m0Var = (C17358m0) obj;
        String str = this.f45650a;
        if (str != null) {
            return str.equals(m0Var.f45650a);
        }
        if (m0Var.f45650a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f45650a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @C0359n0
    public String toString() {
        return "LocusIdCompat[" + mo51797b() + "]";
    }
}
