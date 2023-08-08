package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.C32239p;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.u */
public final class C31989u extends C31965o<C31920f> {

    /* renamed from: p */
    public final List<String> f78126p;

    /* renamed from: q */
    public final C31998w0 f78127q;

    public C31989u(C31993v vVar, C32239p<C31920f> pVar, C31998w0 w0Var, List<String> list) {
        super(vVar, pVar);
        this.f78127q = w0Var;
        this.f78126p = list;
    }

    /* renamed from: D0 */
    public final void mo92636D0(int i, Bundle bundle) {
        super.mo92636D0(i, bundle);
        this.f78011n.mo93034e(C31920f.m129487c(bundle, this.f78127q, this.f78126p));
    }
}
