package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.review.b */
final class C32120b extends ResultReceiver {

    /* renamed from: a */
    public final /* synthetic */ C32239p f78340a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32120b(Handler handler, C32239p pVar) {
        super(handler);
        this.f78340a = pVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        this.f78340a.mo93034e(null);
    }
}
