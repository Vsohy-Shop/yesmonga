package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.l0 */
public abstract class C40869l0 extends C40865j0 {

    /* renamed from: p */
    public static final WeakReference f104001p = new WeakReference((Object) null);

    /* renamed from: o */
    public WeakReference f104002o = f104001p;

    public C40869l0(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: E8 */
    public abstract byte[] mo134191E8();

    /* renamed from: T6 */
    public final byte[] mo134530T6() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f104002o.get();
            if (bArr == null) {
                bArr = mo134191E8();
                this.f104002o = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
