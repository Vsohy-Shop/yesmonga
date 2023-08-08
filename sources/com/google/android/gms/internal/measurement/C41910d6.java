package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.d6 */
public final class C41910d6 extends ContentObserver {
    public C41910d6(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        C41946f6.f106120e.set(true);
    }
}
