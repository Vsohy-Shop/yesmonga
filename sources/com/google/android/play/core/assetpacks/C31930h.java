package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.assetpacks.h */
final class C31930h extends ResultReceiver {

    /* renamed from: a */
    public final /* synthetic */ C32239p f77877a;

    /* renamed from: b */
    public final /* synthetic */ C31984s2 f77878b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31930h(C31984s2 s2Var, Handler handler, C32239p pVar) {
        super(handler);
        this.f77878b = s2Var;
        this.f77877a = pVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f77877a.mo93034e(-1);
            this.f77878b.f78099g.mo92631a((PendingIntent) null);
        } else if (i != 2) {
            this.f77877a.mo93033d(new AssetPackException(-100));
        } else {
            this.f77877a.mo93034e(0);
        }
    }
}
