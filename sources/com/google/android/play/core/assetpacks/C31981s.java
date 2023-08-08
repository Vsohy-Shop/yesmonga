package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.assetpacks.s */
public final class C31981s extends C31965o<Void> {

    /* renamed from: p */
    public final int f78073p;

    /* renamed from: q */
    public final String f78074q;

    /* renamed from: r */
    public final int f78075r;

    /* renamed from: s */
    public final /* synthetic */ C31993v f78076s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31981s(C31993v vVar, C32239p<Void> pVar, int i, String str, int i2) {
        super(vVar, pVar);
        this.f78076s = vVar;
        this.f78073p = i;
        this.f78074q = str;
        this.f78075r = i2;
    }

    /* renamed from: V7 */
    public final void mo92640V7(Bundle bundle) {
        this.f78076s.f78146c.mo92830b();
        int i = bundle.getInt("error_code");
        C31993v.f78142f.mo92776b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f78075r;
        if (i2 > 0) {
            this.f78076s.mo92691A(this.f78073p, this.f78074q, i2 - 1);
        }
    }
}
