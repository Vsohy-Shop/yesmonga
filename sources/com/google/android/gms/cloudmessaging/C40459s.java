package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* renamed from: com.google.android.gms.cloudmessaging.s */
public final class C40459s extends C40460t<Void> {
    public C40459s(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* renamed from: a */
    public final void mo133574a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo133577d(null);
        } else {
            mo133576c(new zzq(4, "Invalid response to one way request", (Throwable) null));
        }
    }

    /* renamed from: b */
    public final boolean mo133575b() {
        return true;
    }
}
