package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.common.api.p */
public abstract class C40667p<R extends C40669r> extends C40671t<R> {

    /* renamed from: a */
    public final Activity f103635a;

    /* renamed from: b */
    public final int f103636b;

    public C40667p(@C0359n0 Activity activity, int i) {
        C40843u.m166203m(activity, "Activity must not be null");
        this.f103635a = activity;
        this.f103636b = i;
    }

    @C40473a
    /* renamed from: b */
    public final void mo134097b(@C0359n0 Status status) {
        if (status.mo133650e0()) {
            try {
                status.mo133656t0(this.f103635a, this.f103636b);
            } catch (IntentSender.SendIntentException unused) {
                mo134099d(new Status(8));
            }
        } else {
            mo134099d(status);
        }
    }

    /* renamed from: c */
    public abstract void mo134098c(@C0359n0 R r);

    /* renamed from: d */
    public abstract void mo134099d(@C0359n0 Status status);
}
