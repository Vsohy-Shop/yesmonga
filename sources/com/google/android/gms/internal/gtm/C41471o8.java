package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.tagmanager.C31011k;
import com.google.android.gms.tagmanager.C31020t;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.gtm.o8 */
public final class C41471o8 extends C41421m6 {

    /* renamed from: n */
    public final Map<String, C41588t5> f104833n = new HashMap(1);

    /* renamed from: o */
    public final ExecutorService f104834o;

    /* renamed from: p */
    public final C41612u5 f104835p;

    /* renamed from: q */
    public final C31020t f104836q;

    /* renamed from: r */
    public final Context f104837r;

    public C41471o8(Context context, C31020t tVar, C31011k kVar) {
        C41612u5 u5Var = new C41612u5(context, tVar, kVar);
        ExecutorService a = C41519q8.m168244a(context);
        C40843u.m166202l(tVar);
        this.f104836q = tVar;
        this.f104835p = u5Var;
        this.f104834o = a;
        this.f104837r = context;
    }

    /* renamed from: Q2 */
    public final void mo135612Q2(String str, Bundle bundle, String str2, long j, boolean z) throws RemoteException {
        this.f104834o.execute(new C41423m8(this, new C41132a6(str, bundle, str2, new Date(j), z, this.f104836q)));
    }

    /* renamed from: X5 */
    public final void mo135613X5(String str, @C0363p0 String str2, @C0363p0 String str3, @C0363p0 C41373k6 k6Var) throws RemoteException {
        this.f104834o.execute(new C41399l8(this, str, str2, str3, k6Var));
    }

    /* renamed from: f */
    public final void mo135614f() {
        this.f104834o.execute(new C41447n8(this));
    }

    /* renamed from: k */
    public final void mo135615k() throws RemoteException {
        this.f104833n.clear();
    }

    /* renamed from: v0 */
    public final void mo135616v0(String str, @C0363p0 String str2, @C0363p0 String str3) throws RemoteException {
        mo135613X5(str, str2, str3, (C41373k6) null);
    }
}
