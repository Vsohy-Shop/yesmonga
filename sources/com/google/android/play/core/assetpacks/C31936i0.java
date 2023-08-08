package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.internal.C32030a2;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.internal.C32084r0;
import com.google.android.play.core.internal.C32103x1;

/* renamed from: com.google.android.play.core.assetpacks.i0 */
public final class C31936i0 extends C32103x1 {

    /* renamed from: n */
    public final C32062k f77902n = new C32062k("AssetPackExtractionService");

    /* renamed from: o */
    public final Context f77903o;

    /* renamed from: p */
    public final C31906c0 f77904p;

    public C31936i0(Context context, C31906c0 c0Var) {
        this.f77903o = context;
        this.f77904p = c0Var;
    }

    /* renamed from: K0 */
    public final synchronized void mo92578K0(Bundle bundle) {
        ComponentName componentName;
        Intent intent = new Intent(this.f77903o, ExtractionForegroundService.class);
        int i = bundle.getInt("action_type");
        intent.putExtra("action_type", i);
        if (i == 1) {
            intent.putExtra("notification_channel_name", bundle.getString("notification_channel_name"));
            intent.putExtra("notification_title", bundle.getString("notification_title"));
            intent.putExtra("notification_subtext", bundle.getString("notification_subtext"));
            intent.putExtra("notification_timeout", bundle.getLong("notification_timeout"));
            Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
            if (parcelable instanceof PendingIntent) {
                intent.putExtra("notification_on_click_intent", parcelable);
            }
            intent.putExtra("notification_color", bundle.getInt("notification_color"));
        }
        try {
            componentName = Build.VERSION.SDK_INT >= 26 ? this.f77903o.startForegroundService(intent) : this.f77903o.startService(intent);
        } catch (IllegalStateException | SecurityException e) {
            this.f77902n.mo92777c(e, "Failed starting installation service.", new Object[0]);
            componentName = null;
        }
        if (componentName == null) {
            this.f77902n.mo92776b("Failed starting installation service.", new Object[0]);
        }
    }

    /* renamed from: K6 */
    public final void mo92579K6(Bundle bundle, C32030a2 a2Var) throws RemoteException {
        this.f77902n.mo92775a("updateServiceState AIDL call", new Object[0]);
        if (!C32084r0.m129917a(this.f77903o) || !C32084r0.m129918b(this.f77903o)) {
            a2Var.mo92727K0(new Bundle());
            return;
        }
        mo92578K0(bundle);
        a2Var.mo92728s7(new Bundle(), new Bundle());
    }

    /* renamed from: e5 */
    public final void mo92580e5(C32030a2 a2Var) throws RemoteException {
        this.f77902n.mo92775a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!C32084r0.m129917a(this.f77903o) || !C32084r0.m129918b(this.f77903o)) {
            a2Var.mo92727K0(new Bundle());
            return;
        }
        this.f77904p.mo92510N();
        a2Var.mo92726F0(new Bundle());
    }
}
