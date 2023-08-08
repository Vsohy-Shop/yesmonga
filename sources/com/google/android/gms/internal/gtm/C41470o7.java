package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.gtm.o7 */
public final class C41470o7 implements C41398l7 {

    /* renamed from: a */
    public final Handler f104831a;

    /* renamed from: b */
    public final /* synthetic */ C41494p7 f104832b;

    public /* synthetic */ C41470o7(C41494p7 p7Var, C41446n7 n7Var) {
        this.f104832b = p7Var;
        this.f104831a = new C41203d5(p7Var.f104861a.getMainLooper(), new C41422m7(this));
    }

    /* renamed from: a */
    public final void mo135617a(long j) {
        this.f104831a.removeMessages(1, C41494p7.f104859l);
        this.f104831a.sendMessageDelayed(mo135683b(), 1800000);
    }

    /* renamed from: b */
    public final Message mo135683b() {
        return this.f104831a.obtainMessage(1, C41494p7.f104859l);
    }

    public final void zza() {
        this.f104831a.removeMessages(1, C41494p7.f104859l);
    }

    public final void zzb() {
        this.f104831a.removeMessages(1, C41494p7.f104859l);
        this.f104831a.sendMessage(mo135683b());
    }
}
