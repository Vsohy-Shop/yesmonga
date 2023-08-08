package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C32029a1;
import com.google.android.play.core.internal.C32040c1;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.internal.C32063k0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.google.android.play.core.assetpacks.g2 */
public final class C31928g2 {

    /* renamed from: c */
    public static final C32062k f77871c = new C32062k("PatchSliceTaskHandler");

    /* renamed from: a */
    public final C31906c0 f77872a;

    /* renamed from: b */
    public final C32040c1<C31914d3> f77873b;

    public C31928g2(C31906c0 c0Var, C32040c1<C31914d3> c1Var) {
        this.f77872a = c0Var;
        this.f77873b = c1Var;
    }

    /* renamed from: a */
    public final void mo92565a(C31923f2 f2Var) {
        InputStream inputStream;
        File v = this.f77872a.mo92528v(f2Var.f77956b, f2Var.f77853c, f2Var.f77854d);
        C31906c0 c0Var = this.f77872a;
        String str = f2Var.f77956b;
        int i = f2Var.f77853c;
        long j = f2Var.f77854d;
        File file = new File(c0Var.mo92529w(str, i, j), f2Var.f77858h);
        try {
            inputStream = f2Var.f77860j;
            if (f2Var.f77857g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            C31916e0 e0Var = new C31916e0(v, file);
            File x = this.f77872a.mo92530x(f2Var.f77956b, f2Var.f77855e, f2Var.f77856f, f2Var.f77858h);
            if (!x.exists()) {
                x.mkdirs();
            }
            C31938i2 i2Var = new C31938i2(this.f77872a, f2Var.f77956b, f2Var.f77855e, f2Var.f77856f, f2Var.f77858h);
            C32063k0.m129859l(e0Var, inputStream, new C31994v0(x, i2Var), f2Var.f77859i);
            i2Var.mo92584d(0);
            inputStream.close();
            f77871c.mo92778d("Patching and extraction finished for slice %s of pack %s.", f2Var.f77858h, f2Var.f77956b);
            this.f77873b.mo92734a().mo92542c(f2Var.f77955a, f2Var.f77956b, f2Var.f77858h, 0);
            try {
                f2Var.f77860j.close();
                return;
            } catch (IOException unused) {
                f77871c.mo92779e("Could not close file for slice %s of pack %s.", f2Var.f77858h, f2Var.f77956b);
                return;
            }
        } catch (IOException e) {
            f77871c.mo92776b("IOException during patching %s.", e.getMessage());
            throw new C31904bk(String.format("Error patching slice %s of pack %s.", new Object[]{f2Var.f77858h, f2Var.f77956b}), e, f2Var.f77955a);
        } catch (Throwable th) {
            C32029a1.m129765a(th, th);
        }
        throw th;
    }
}
