package com.android.volley.toolbox;

import androidx.annotation.C0323b0;
import androidx.annotation.C0363p0;
import com.android.volley.C21762l;
import com.android.volley.C21771p;
import com.android.volley.C21776s;
import com.android.volley.Request;
import java.io.UnsupportedEncodingException;

/* renamed from: com.android.volley.toolbox.u */
public abstract class C21830u<T> extends Request<T> {

    /* renamed from: K0 */
    public static final String f56475K0 = "utf-8";

    /* renamed from: L0 */
    public static final String f56476L0 = String.format("application/json; charset=%s", new Object[]{"utf-8"});

    /* renamed from: H0 */
    public final Object f56477H0;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: I0 */
    public C21771p.C21773b<T> f56478I0;
    @C0363p0

    /* renamed from: J0 */
    public final String f56479J0;

    @Deprecated
    public C21830u(String str, String str2, C21771p.C21773b<T> bVar, C21771p.C21772a aVar) {
        this(-1, str, str2, bVar, aVar);
    }

    /* renamed from: W */
    public byte[] mo20315W() {
        try {
            String str = this.f56479J0;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            C21776s.m100103g("Unsupported Encoding while trying to get the bytes of %s using %s", this.f56479J0, "utf-8");
            return null;
        }
    }

    /* renamed from: X */
    public String mo64795X() {
        return f56476L0;
    }

    /* renamed from: k1 */
    public abstract C21771p<T> mo20305k1(C21762l lVar);

    @Deprecated
    /* renamed from: n0 */
    public byte[] mo64807n0() {
        return mo20315W();
    }

    @Deprecated
    /* renamed from: o0 */
    public String mo64809o0() {
        return mo64795X();
    }

    /* renamed from: q */
    public void mo64811q() {
        super.mo64811q();
        synchronized (this.f56477H0) {
            this.f56478I0 = null;
        }
    }

    /* renamed from: y */
    public void mo20306y(T t) {
        C21771p.C21773b<T> bVar;
        synchronized (this.f56477H0) {
            bVar = this.f56478I0;
        }
        if (bVar != null) {
            bVar.mo20311b(t);
        }
    }

    public C21830u(int i, String str, @C0363p0 String str2, C21771p.C21773b<T> bVar, @C0363p0 C21771p.C21772a aVar) {
        super(i, str, aVar);
        this.f56477H0 = new Object();
        this.f56478I0 = bVar;
        this.f56479J0 = str2;
    }
}
