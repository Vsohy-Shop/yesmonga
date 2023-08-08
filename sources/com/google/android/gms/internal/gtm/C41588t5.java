package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.tagmanager.C31020t;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.t5 */
public final class C41588t5 {

    /* renamed from: a */
    public final Context f104979a;

    /* renamed from: b */
    public final String f104980b;

    /* renamed from: c */
    public final String f104981c;

    /* renamed from: d */
    public final String f104982d;

    /* renamed from: e */
    public final C41253f7 f104983e;

    /* renamed from: f */
    public final C41669we f104984f;

    /* renamed from: g */
    public final ExecutorService f104985g;

    /* renamed from: h */
    public final ScheduledExecutorService f104986h;

    /* renamed from: i */
    public final C31020t f104987i;

    /* renamed from: j */
    public final C40979g f104988j;

    /* renamed from: k */
    public final C41636v5 f104989k;

    /* renamed from: l */
    public C41205d7 f104990l;

    /* renamed from: m */
    public volatile int f104991m = 1;

    /* renamed from: n */
    public List<C41132a6> f104992n = new ArrayList();

    /* renamed from: o */
    public ScheduledFuture<?> f104993o = null;

    /* renamed from: p */
    public boolean f104994p = false;

    public C41588t5(Context context, String str, @C0363p0 String str2, @C0363p0 String str3, C41253f7 f7Var, C41669we weVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, C31020t tVar, C40979g gVar, C41636v5 v5Var) {
        this.f104979a = context;
        String str4 = (String) C40843u.m166202l(str);
        this.f104980b = str4;
        this.f104983e = (C41253f7) C40843u.m166202l(f7Var);
        this.f104984f = (C41669we) C40843u.m166202l(weVar);
        ExecutorService executorService2 = (ExecutorService) C40843u.m166202l(executorService);
        this.f104985g = executorService2;
        this.f104986h = (ScheduledExecutorService) C40843u.m166202l(scheduledExecutorService);
        C31020t tVar2 = (C31020t) C40843u.m166202l(tVar);
        this.f104987i = tVar2;
        this.f104988j = (C40979g) C40843u.m166202l(gVar);
        this.f104989k = (C41636v5) C40843u.m166202l(v5Var);
        this.f104981c = str3;
        this.f104982d = str2;
        this.f104992n.add(new C41132a6("gtm.load", new Bundle(), "gtm", new Date(), false, tVar2));
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 35);
        sb.append("Container ");
        sb.append(str4);
        sb.append("is scheduled for loading.");
        C41493p6.m168152d(sb.toString());
        executorService2.execute(new C41468o5(this, (C41444n5) null));
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m168390r(C41588t5 t5Var, long j) {
        ScheduledFuture<?> scheduledFuture = t5Var.f104993o;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        String str = t5Var.f104980b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45);
        sb.append("Refresh container ");
        sb.append(str);
        sb.append(" in ");
        sb.append(j);
        sb.append("ms.");
        C41493p6.m168152d(sb.toString());
        t5Var.f104993o = t5Var.f104986h.schedule(new C41372k5(t5Var), j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: s */
    public final void mo135846s() {
        this.f104985g.execute(new C41347j5(this));
    }

    @C40974d0
    /* renamed from: t */
    public final void mo135847t(C41132a6 a6Var) {
        this.f104985g.execute(new C41492p5(this, a6Var));
    }
}
