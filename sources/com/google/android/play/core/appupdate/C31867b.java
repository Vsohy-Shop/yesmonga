package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.appupdate.b */
final class C31867b extends ResultReceiver {

    /* renamed from: a */
    public final /* synthetic */ C32239p f77718a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31867b(Handler handler, C32239p pVar) {
        super(handler);
        this.f77718a = pVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        C32239p pVar;
        int i2 = 1;
        if (i == 1) {
            pVar = this.f77718a;
            i2 = -1;
        } else if (i != 2) {
            pVar = this.f77718a;
        } else {
            pVar = this.f77718a;
            i2 = 0;
        }
        pVar.mo93034e(Integer.valueOf(i2));
    }
}
