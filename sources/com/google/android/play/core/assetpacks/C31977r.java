package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.assetpacks.r */
public final class C31977r extends C31965o<Void> {

    /* renamed from: p */
    public final /* synthetic */ C31993v f78060p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31977r(C31993v vVar, C32239p<Void> pVar) {
        super(vVar, pVar);
        this.f78060p = vVar;
    }

    /* renamed from: K7 */
    public final void mo92638K7(Bundle bundle, Bundle bundle2) {
        super.mo92638K7(bundle, bundle2);
        if (!this.f78060p.f78148e.compareAndSet(true, false)) {
            C31993v.f78142f.mo92779e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f78060p.mo92548o();
        }
    }
}
