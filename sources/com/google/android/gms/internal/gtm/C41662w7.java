package com.google.android.gms.internal.gtm;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.gtm.w7 */
public final class C41662w7 implements Runnable {

    /* renamed from: a */
    public boolean f105194a = false;

    /* renamed from: b */
    public final /* synthetic */ String f105195b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f105196c;

    /* renamed from: d */
    public final /* synthetic */ String f105197d;

    /* renamed from: e */
    public final /* synthetic */ long f105198e;

    /* renamed from: f */
    public final /* synthetic */ String f105199f;

    /* renamed from: g */
    public final /* synthetic */ C41686x7 f105200g;

    public C41662w7(C41686x7 x7Var, String str, Bundle bundle, String str2, long j, String str3) {
        this.f105200g = x7Var;
        this.f105195b = str;
        this.f105196c = bundle;
        this.f105197d = str2;
        this.f105198e = j;
        this.f105199f = str3;
    }

    public final void run() {
        if (this.f105200g.f105237n.f104760l == 3) {
            this.f105200g.f105237n.f104752d.mo135854b(this.f105195b, this.f105196c, this.f105197d, this.f105198e, false);
        } else if (this.f105200g.f105237n.f104760l == 1 || this.f105200g.f105237n.f104760l == 2) {
            if (!this.f105194a) {
                C41493p6.m168152d(String.format("Container not loaded yet: deferring event listener by enqueuing the event: name = %s, origin = %s, params = %s.", new Object[]{this.f105195b, this.f105199f, this.f105196c}));
                this.f105194a = true;
                this.f105200g.f105237n.f104761m.add(this);
                return;
            }
            C41493p6.m168153e("Invalid state - not expecting to see a deferred event during container loading.");
        } else if (this.f105200g.f105237n.f104760l == 4) {
            C41493p6.m168152d(String.format("Container failed to load: skipping event listener by ignoring the event: name = %s, origin = %s, params = %s.", new Object[]{this.f105195b, this.f105199f, this.f105196c}));
        } else {
            int a = this.f105200g.f105237n.f104760l;
            StringBuilder sb = new StringBuilder(28);
            sb.append("Unexpected state:");
            sb.append(a);
            C41660w5.m168645c(sb.toString(), this.f105200g.f105237n.f104749a);
        }
    }
}
