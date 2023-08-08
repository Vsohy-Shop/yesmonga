package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.C0331e;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C18001r;
import java.util.List;

/* renamed from: androidx.core.provider.f */
public final class C17859f {

    /* renamed from: a */
    public final String f46227a;

    /* renamed from: b */
    public final String f46228b;

    /* renamed from: c */
    public final String f46229c;

    /* renamed from: d */
    public final List<List<byte[]>> f46230d;

    /* renamed from: e */
    public final int f46231e;

    /* renamed from: f */
    public final String f46232f;

    public C17859f(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0359n0 List<List<byte[]>> list) {
        this.f46227a = (String) C18001r.m81775l(str);
        this.f46228b = (String) C18001r.m81775l(str2);
        this.f46229c = (String) C18001r.m81775l(str3);
        this.f46230d = (List) C18001r.m81775l(list);
        this.f46231e = 0;
        this.f46232f = mo52265a(str, str2, str3);
    }

    /* renamed from: a */
    public final String mo52265a(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    @C0363p0
    /* renamed from: b */
    public List<List<byte[]>> mo52266b() {
        return this.f46230d;
    }

    @C0331e
    /* renamed from: c */
    public int mo52267c() {
        return this.f46231e;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: d */
    public String mo52268d() {
        return this.f46232f;
    }

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: e */
    public String mo52269e() {
        return this.f46232f;
    }

    @C0359n0
    /* renamed from: f */
    public String mo52270f() {
        return this.f46227a;
    }

    @C0359n0
    /* renamed from: g */
    public String mo52271g() {
        return this.f46228b;
    }

    @C0359n0
    /* renamed from: h */
    public String mo52272h() {
        return this.f46229c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f46227a + ", mProviderPackage: " + this.f46228b + ", mQuery: " + this.f46229c + ", mCertificates:");
        for (int i = 0; i < this.f46230d.size(); i++) {
            sb.append(" [");
            List list = this.f46230d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f46231e);
        return sb.toString();
    }

    public C17859f(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0331e int i) {
        this.f46227a = (String) C18001r.m81775l(str);
        this.f46228b = (String) C18001r.m81775l(str2);
        this.f46229c = (String) C18001r.m81775l(str3);
        this.f46230d = null;
        C18001r.m81764a(i != 0);
        this.f46231e = i;
        this.f46232f = mo52265a(str, str2, str3);
    }
}
