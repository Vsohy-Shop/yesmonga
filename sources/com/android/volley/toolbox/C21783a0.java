package com.android.volley.toolbox;

import androidx.annotation.C0323b0;
import androidx.annotation.C0363p0;
import com.android.volley.C21762l;
import com.android.volley.C21771p;
import com.android.volley.Request;
import java.io.UnsupportedEncodingException;

/* renamed from: com.android.volley.toolbox.a0 */
public class C21783a0 extends Request<String> {

    /* renamed from: H0 */
    public final Object f56357H0;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: I0 */
    public C21771p.C21773b<String> f56358I0;

    public C21783a0(int i, String str, C21771p.C21773b<String> bVar, @C0363p0 C21771p.C21772a aVar) {
        super(i, str, aVar);
        this.f56357H0 = new Object();
        this.f56358I0 = bVar;
    }

    /* renamed from: M1 */
    public void mo20306y(String str) {
        C21771p.C21773b<String> bVar;
        synchronized (this.f56357H0) {
            bVar = this.f56358I0;
        }
        if (bVar != null) {
            bVar.mo20311b(str);
        }
    }

    /* renamed from: k1 */
    public C21771p<String> mo20305k1(C21762l lVar) {
        String str;
        try {
            str = new String(lVar.f56298b, C21812m.m100216f(lVar.f56299c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(lVar.f56298b);
        }
        return C21771p.m100087c(str, C21812m.m100215e(lVar));
    }

    /* renamed from: q */
    public void mo64811q() {
        super.mo64811q();
        synchronized (this.f56357H0) {
            this.f56358I0 = null;
        }
    }

    public C21783a0(String str, C21771p.C21773b<String> bVar, @C0363p0 C21771p.C21772a aVar) {
        this(0, str, bVar, aVar);
    }
}
