package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.C41107i;

/* renamed from: com.google.android.gms.common.internal.j1 */
public abstract class C40775j1 extends C41107i implements C40779k1 {
    /* renamed from: H0 */
    public static C40779k1 m165933H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof C40779k1) {
            return (C40779k1) queryLocalInterface;
        }
        return new C40771i1(iBinder);
    }
}
