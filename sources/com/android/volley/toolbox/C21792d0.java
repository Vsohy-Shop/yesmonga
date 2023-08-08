package com.android.volley.toolbox;

import android.content.Context;
import com.android.volley.C21760j;
import com.android.volley.C21764n;
import com.android.volley.toolbox.C21804j;
import java.io.File;

/* renamed from: com.android.volley.toolbox.d0 */
public class C21792d0 {

    /* renamed from: a */
    public static final String f56371a = "volley";

    /* renamed from: com.android.volley.toolbox.d0$a */
    public class C21793a implements C21804j.C21808d {

        /* renamed from: a */
        public File f56372a = null;

        /* renamed from: b */
        public final /* synthetic */ Context f56373b;

        public C21793a(Context context) {
            this.f56373b = context;
        }

        public File get() {
            if (this.f56372a == null) {
                this.f56372a = new File(this.f56373b.getCacheDir(), C21792d0.f56371a);
            }
            return this.f56372a;
        }
    }

    /* renamed from: a */
    public static C21764n m100146a(Context context) {
        return m100148c(context, (C21794e) null);
    }

    /* renamed from: b */
    public static C21764n m100147b(Context context, C21760j jVar) {
        C21764n nVar = new C21764n(new C21804j((C21804j.C21808d) new C21793a(context.getApplicationContext())), jVar);
        nVar.mo64848o();
        return nVar;
    }

    /* renamed from: c */
    public static C21764n m100148c(Context context, C21794e eVar) {
        C21800g gVar;
        if (eVar == null) {
            gVar = new C21800g((C21794e) new C21815p());
        } else {
            gVar = new C21800g(eVar);
        }
        return m100147b(context, gVar);
    }

    @Deprecated
    /* renamed from: d */
    public static C21764n m100149d(Context context, C21814o oVar) {
        if (oVar == null) {
            return m100148c(context, (C21794e) null);
        }
        return m100147b(context, new C21800g(oVar));
    }
}
