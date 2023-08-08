package com.google.zxing.client.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: com.google.zxing.client.android.i */
public final class C34655i {

    /* renamed from: g */
    public static final String f83853g = "i";

    /* renamed from: h */
    public static final long f83854h = 300000;

    /* renamed from: a */
    public final Context f83855a;

    /* renamed from: b */
    public final BroadcastReceiver f83856b;

    /* renamed from: c */
    public boolean f83857c = false;

    /* renamed from: d */
    public Handler f83858d;

    /* renamed from: e */
    public Runnable f83859e;

    /* renamed from: f */
    public boolean f83860f;

    /* renamed from: com.google.zxing.client.android.i$b */
    public final class C34657b extends BroadcastReceiver {
        public C34657b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m141365b(boolean z) {
            C34655i.this.mo102509f(z);
        }

        public void onReceive(Context context, Intent intent) {
            boolean z;
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                if (intent.getIntExtra("plugged", -1) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C34655i.this.f83858d.post(new C34658j(this, z));
            }
        }
    }

    public C34655i(Context context, Runnable runnable) {
        this.f83855a = context;
        this.f83859e = runnable;
        this.f83856b = new C34657b();
        this.f83858d = new Handler();
    }

    /* renamed from: c */
    public void mo102506c() {
        mo102508e();
        if (this.f83860f) {
            this.f83858d.postDelayed(this.f83859e, 300000);
        }
    }

    /* renamed from: d */
    public void mo102507d() {
        mo102508e();
        mo102512i();
    }

    /* renamed from: e */
    public final void mo102508e() {
        this.f83858d.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: f */
    public final void mo102509f(boolean z) {
        this.f83860f = z;
        if (this.f83857c) {
            mo102506c();
        }
    }

    /* renamed from: g */
    public final void mo102510g() {
        if (!this.f83857c) {
            this.f83855a.registerReceiver(this.f83856b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f83857c = true;
        }
    }

    /* renamed from: h */
    public void mo102511h() {
        mo102510g();
        mo102506c();
    }

    /* renamed from: i */
    public final void mo102512i() {
        if (this.f83857c) {
            this.f83855a.unregisterReceiver(this.f83856b);
            this.f83857c = false;
        }
    }
}
