package com.google.android.gms.internal.gtm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.util.C40974d0;

/* renamed from: com.google.android.gms.internal.gtm.q6 */
public final class C41517q6 extends BroadcastReceiver {
    @C40974d0

    /* renamed from: b */
    public static final String f104896b = "com.google.android.gms.internal.gtm.q6";

    /* renamed from: a */
    public final C41325i7 f104897a;

    public C41517q6(C41325i7 i7Var) {
        this.f104897a = i7Var;
    }

    /* renamed from: a */
    public static void m168243a(Context context) {
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(f104896b, true);
        context.sendBroadcast(intent);
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            Bundle extras = intent.getExtras();
            Boolean bool = Boolean.FALSE;
            if (extras != null) {
                bool = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
            }
            this.f104897a.mo135490b(!bool.booleanValue());
        } else if ("com.google.analytics.RADIO_POWERED".equals(action) && !intent.hasExtra(f104896b)) {
            this.f104897a.mo135489a();
        }
    }
}
