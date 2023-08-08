package com.google.android.gms.internal.gtm;

import android.content.Context;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40985k;
import com.google.android.gms.tagmanager.C31011k;
import com.google.android.gms.tagmanager.C31020t;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.u5 */
public final class C41612u5 {

    /* renamed from: a */
    public final Context f105050a;

    /* renamed from: b */
    public final C41669we f105051b;

    /* renamed from: c */
    public final ExecutorService f105052c;

    /* renamed from: d */
    public final ScheduledExecutorService f105053d;

    /* renamed from: e */
    public final C31020t f105054e;

    /* renamed from: f */
    public final C31011k f105055f;

    public C41612u5(Context context, C31020t tVar, C31011k kVar) {
        C41669we weVar = new C41669we(context);
        ExecutorService a = C41519q8.m168244a(context);
        ScheduledExecutorService a2 = C41567s8.f104950a;
        this.f105050a = ((Context) C40843u.m166202l(context)).getApplicationContext();
        this.f105054e = (C31020t) C40843u.m166202l(tVar);
        this.f105055f = (C31011k) C40843u.m166202l(kVar);
        this.f105051b = (C41669we) C40843u.m166202l(weVar);
        this.f105052c = (ExecutorService) C40843u.m166202l(a);
        this.f105053d = (ScheduledExecutorService) C40843u.m166202l(a2);
    }

    /* renamed from: a */
    public final C41588t5 mo135910a(String str, @C0363p0 String str2, @C0363p0 String str3) {
        C41253f7 f7Var = new C41253f7(this.f105050a, this.f105054e, this.f105055f, str);
        C41636v5 v5Var = new C41636v5(this.f105050a, str);
        return new C41588t5(this.f105050a, str, str2, str3, f7Var, this.f105051b, this.f105052c, this.f105053d, this.f105054e, C40985k.m166636d(), v5Var);
    }
}
