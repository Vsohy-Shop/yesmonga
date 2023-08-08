package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;

/* renamed from: com.google.android.gms.analytics.l */
public final class C40400l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BroadcastReceiver.PendingResult f102970a;

    public C40400l(C40371a aVar, BroadcastReceiver.PendingResult pendingResult) {
        this.f102970a = pendingResult;
    }

    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.f102970a;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
