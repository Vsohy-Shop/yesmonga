package com.google.android.gms.common.moduleinstall.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C40546f;
import com.google.android.gms.common.api.internal.C40609q;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40769i;
import com.google.android.gms.internal.base.C41085v;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.b0 */
public final class C40889b0 extends C40769i {
    public C40889b0(Context context, Looper looper, C40756f fVar, C40546f fVar2, C40609q qVar) {
        super(context, looper, 308, fVar, fVar2, qVar);
    }

    @C0363p0
    /* renamed from: A */
    public final /* synthetic */ IInterface mo87436A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        if (queryLocalInterface instanceof C40895h) {
            return (C40895h) queryLocalInterface;
        }
        return new C40895h(iBinder);
    }

    /* renamed from: D */
    public final Feature[] mo134332D() {
        return C41085v.f104376b;
    }

    @C0359n0
    /* renamed from: N */
    public final String mo87437N() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @C0359n0
    /* renamed from: O */
    public final String mo87438O() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    /* renamed from: R */
    public final boolean mo134343R() {
        return true;
    }

    /* renamed from: a0 */
    public final boolean mo134353a0() {
        return true;
    }

    /* renamed from: t */
    public final int mo87439t() {
        return 17895000;
    }
}
