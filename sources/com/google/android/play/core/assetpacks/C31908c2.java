package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.C32016c;
import com.google.android.play.core.internal.C32040c1;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.c2 */
public final class C31908c2 {

    /* renamed from: a */
    public final C31906c0 f77816a;

    /* renamed from: b */
    public final C32040c1<C31914d3> f77817b;

    /* renamed from: c */
    public final C31942j1 f77818c;

    /* renamed from: d */
    public final C32040c1<Executor> f77819d;

    /* renamed from: e */
    public final C31998w0 f77820e;

    /* renamed from: f */
    public final C32016c f77821f;

    public C31908c2(C31906c0 c0Var, C32040c1<C31914d3> c1Var, C31942j1 j1Var, C32040c1<Executor> c1Var2, C31998w0 w0Var, C32016c cVar) {
        this.f77816a = c0Var;
        this.f77817b = c1Var;
        this.f77818c = j1Var;
        this.f77819d = c1Var2;
        this.f77820e = w0Var;
        this.f77821f = cVar;
    }

    /* renamed from: a */
    public final void mo92534a(C32011z1 z1Var) {
        Runnable runnable;
        Executor executor;
        File z = this.f77816a.mo92532z(z1Var.f77956b, z1Var.f78204c, z1Var.f78205d);
        File F = this.f77816a.mo92502F(z1Var.f77956b, z1Var.f78204c, z1Var.f78205d);
        if (!z.exists() || !F.exists()) {
            throw new C31904bk(String.format("Cannot find pack files to move for pack %s.", new Object[]{z1Var.f77956b}), z1Var.f77955a);
        }
        File v = this.f77816a.mo92528v(z1Var.f77956b, z1Var.f78204c, z1Var.f78205d);
        v.mkdirs();
        if (z.renameTo(v)) {
            new File(this.f77816a.mo92528v(z1Var.f77956b, z1Var.f78204c, z1Var.f78205d), "merge.tmp").delete();
            File w = this.f77816a.mo92529w(z1Var.f77956b, z1Var.f78204c, z1Var.f78205d);
            w.mkdirs();
            if (F.renameTo(w)) {
                if (this.f77821f.mo92715a()) {
                    executor = this.f77819d.mo92734a();
                    runnable = new C31897a2(this, z1Var);
                } else {
                    executor = this.f77819d.mo92734a();
                    C31906c0 c0Var = this.f77816a;
                    c0Var.getClass();
                    runnable = C31902b2.m129406a(c0Var);
                }
                executor.execute(runnable);
                this.f77818c.mo92604f(z1Var.f77956b, z1Var.f78204c, z1Var.f78205d);
                this.f77820e.mo92702a(z1Var.f77956b);
                this.f77817b.mo92734a().mo92544e(z1Var.f77955a, z1Var.f77956b);
                return;
            }
            throw new C31904bk("Cannot move metadata files to final location.", z1Var.f77955a);
        }
        throw new C31904bk("Cannot move merged pack files to final location.", z1Var.f77955a);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo92535b(C32011z1 z1Var) {
        this.f77816a.mo92504H(z1Var.f77956b, z1Var.f78204c, z1Var.f78205d);
    }
}
