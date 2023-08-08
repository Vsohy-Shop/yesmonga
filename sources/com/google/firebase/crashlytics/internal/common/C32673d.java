package com.google.firebase.crashlytics.internal.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.C32741f;

/* renamed from: com.google.firebase.crashlytics.internal.common.d */
public class C32673d {

    /* renamed from: c */
    public static final int f79294c = 1;

    /* renamed from: d */
    public static final int f79295d = 2;

    /* renamed from: e */
    public static final int f79296e = 3;

    /* renamed from: a */
    public final Float f79297a;

    /* renamed from: b */
    public final boolean f79298b;

    public C32673d(Float f, boolean z) {
        this.f79298b = z;
        this.f79297a = f;
    }

    /* renamed from: a */
    public static C32673d m131960a(Context context) {
        boolean z = false;
        Float f = null;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = m131962f(registerReceiver);
                f = m131961d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            C32741f.m132248f().mo95055e("An error occurred getting battery state.", e);
        }
        return new C32673d(f, z);
    }

    /* renamed from: d */
    public static Float m131961d(Intent intent) {
        int intExtra = intent.getIntExtra(FirebaseAnalytics.C32532b.f78971t, -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(((float) intExtra) / ((float) intExtra2));
    }

    /* renamed from: f */
    public static boolean m131962f(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Float mo94862b() {
        return this.f79297a;
    }

    /* renamed from: c */
    public int mo94863c() {
        Float f;
        if (!this.f79298b || (f = this.f79297a) == null) {
            return 1;
        }
        if (((double) f.floatValue()) < 0.99d) {
            return 2;
        }
        return 3;
    }

    /* renamed from: e */
    public boolean mo94864e() {
        return this.f79298b;
    }
}
