package androidx.camera.core;

import androidx.annotation.C0323b0;

/* renamed from: androidx.camera.core.e3 */
public final class C1393e3 extends C1663p0 {
    @C0323b0("this")

    /* renamed from: c */
    public boolean f4038c = false;

    public C1393e3(C1353a2 a2Var) {
        super(a2Var);
    }

    public synchronized void close() {
        if (!this.f4038c) {
            this.f4038c = true;
            super.close();
        }
    }
}
