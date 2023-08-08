package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.x0 */
public final class C32219x0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32164e f78562a;

    /* renamed from: b */
    public final /* synthetic */ C32223z0 f78563b;

    public C32219x0(C32223z0 z0Var, C32164e eVar) {
        this.f78563b = z0Var;
        this.f78562a = eVar;
    }

    public final void run() {
        C32217w0 r = this.f78563b.f78566b;
        List<String> b = this.f78562a.mo92947b();
        List q = C32223z0.m130326s(this.f78562a.mo92946a());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!b.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList(b));
        }
        if (!q.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList(q));
        }
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        r.mo93010l(C32167f.m130175f(bundle));
    }
}
