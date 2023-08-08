package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.internal.C32040c1;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.listener.C32112c;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.z */
public final class C32009z extends C32112c<AssetPackState> {

    /* renamed from: g */
    public final C31942j1 f78192g;

    /* renamed from: h */
    public final C31986t0 f78193h;

    /* renamed from: i */
    public final C32040c1<C31914d3> f78194i;

    /* renamed from: j */
    public final C31962n0 f78195j;

    /* renamed from: k */
    public final C31998w0 f78196k;

    /* renamed from: l */
    public final C32040c1<Executor> f78197l;

    /* renamed from: m */
    public final C32040c1<Executor> f78198m;

    /* renamed from: n */
    public final Handler f78199n = new Handler(Looper.getMainLooper());

    public C32009z(Context context, C31942j1 j1Var, C31986t0 t0Var, C32040c1<C31914d3> c1Var, C31998w0 w0Var, C31962n0 n0Var, C32040c1<Executor> c1Var2, C32040c1<Executor> c1Var3) {
        super(new C32062k("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f78192g = j1Var;
        this.f78193h = t0Var;
        this.f78194i = c1Var;
        this.f78196k = w0Var;
        this.f78195j = n0Var;
        this.f78197l = c1Var2;
        this.f78198m = c1Var3;
    }

    /* renamed from: a */
    public final void mo92414a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f78323a.mo92776b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            AssetPackState e = AssetPackState.m129379e(bundleExtra, stringArrayList.get(0), this.f78196k, C31900b0.f77801c);
            this.f78323a.mo92775a("ListenerRegistryBroadcastReceiver.onReceive: %s", e);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f78195j.mo92631a(pendingIntent);
            }
            this.f78198m.mo92734a().execute(new C32001x(this, bundleExtra, e));
            this.f78197l.mo92734a().execute(new C32005y(this, bundleExtra));
            return;
        }
        this.f78323a.mo92776b("Empty bundle received from broadcast.", new Object[0]);
    }

    /* renamed from: i */
    public final void mo92708i(AssetPackState assetPackState) {
        this.f78199n.post(new C31997w(this, assetPackState));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo92709j(Bundle bundle) {
        if (this.f78192g.mo92602d(bundle)) {
            this.f78193h.mo92684a();
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void mo92710k(Bundle bundle, AssetPackState assetPackState) {
        if (this.f78192g.mo92603e(bundle)) {
            mo92708i(assetPackState);
            this.f78194i.mo92734a().mo92548o();
        }
    }
}
