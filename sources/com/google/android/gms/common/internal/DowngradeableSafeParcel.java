package com.google.android.gms.common.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@C40473a
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: b */
    public static final Object f103747b = new Object();

    /* renamed from: a */
    public boolean f103748a = false;

    @C40473a
    /* renamed from: M */
    public static boolean m165739M(@C0359n0 String str) {
        synchronized (f103747b) {
        }
        return true;
    }

    @C0363p0
    @C40473a
    /* renamed from: Q */
    public static Integer m165740Q() {
        synchronized (f103747b) {
        }
        return null;
    }

    @C40473a
    /* renamed from: W */
    public abstract boolean mo134279W(int i);

    @C40473a
    /* renamed from: X */
    public void mo134280X(boolean z) {
        this.f103748a = z;
    }

    @C40473a
    /* renamed from: e0 */
    public boolean mo134281e0() {
        return this.f103748a;
    }
}
