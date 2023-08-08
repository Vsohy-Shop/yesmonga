package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.C0339g;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.util.C40974d0;

@C40974d0
/* renamed from: com.google.android.gms.common.internal.r1 */
public final class C40807r1 extends C40763g1 {
    @C0363p0

    /* renamed from: n */
    public C40747e f103927n;

    /* renamed from: o */
    public final int f103928o;

    public C40807r1(@C0359n0 C40747e eVar, int i) {
        this.f103927n = eVar;
        this.f103928o = i;
    }

    @C0339g
    /* renamed from: V2 */
    public final void mo134402V2(int i, @C0359n0 IBinder iBinder, @C0363p0 Bundle bundle) {
        C40843u.m166203m(this.f103927n, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f103927n.mo134348W(i, iBinder, bundle, this.f103928o);
        this.f103927n = null;
    }

    @C0339g
    /* renamed from: m6 */
    public final void mo134403m6(int i, @C0363p0 Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @C0339g
    /* renamed from: n7 */
    public final void mo134404n7(int i, @C0359n0 IBinder iBinder, @C0359n0 zzj zzj) {
        C40747e eVar = this.f103927n;
        C40843u.m166203m(eVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C40843u.m166202l(zzj);
        C40747e.m165795k0(eVar, zzj);
        mo134402V2(i, iBinder, zzj.f103981a);
    }
}
