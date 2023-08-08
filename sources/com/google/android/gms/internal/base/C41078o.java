package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.C0363p0;
import androidx.core.content.C17318d;

/* renamed from: com.google.android.gms.internal.base.o */
public final class C41078o extends C17318d {
    @C0363p0
    @Deprecated
    /* renamed from: y */
    public static Intent m166946y(Context context, @C0363p0 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i;
        if (!C41076m.m166944a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        if (true != C41076m.m166944a()) {
            i = 0;
        } else {
            i = 2;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, i);
    }
}
