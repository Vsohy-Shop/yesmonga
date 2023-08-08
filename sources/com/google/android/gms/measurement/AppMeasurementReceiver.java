package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.legacy.content.C19327a;
import com.google.android.gms.measurement.internal.C30828o4;
import com.google.android.gms.measurement.internal.C30840p4;

public final class AppMeasurementReceiver extends C19327a implements C30828o4 {

    /* renamed from: d */
    public C30840p4 f73189d;

    @C0353k0
    /* renamed from: a */
    public void mo86750a(@C0359n0 Context context, @C0359n0 Intent intent) {
        C19327a.m90470c(context, intent);
    }

    @C0359n0
    /* renamed from: d */
    public BroadcastReceiver.PendingResult mo86751d() {
        return goAsync();
    }

    @C0353k0
    public void onReceive(@C0359n0 Context context, @C0359n0 Intent intent) {
        if (this.f73189d == null) {
            this.f73189d = new C30840p4(this);
        }
        this.f73189d.mo87413a(context, intent);
    }
}
