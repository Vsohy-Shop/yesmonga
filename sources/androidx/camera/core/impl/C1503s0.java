package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.camera.core.impl.utils.futures.C1548f;
import com.google.common.util.concurrent.C32487a;

/* renamed from: androidx.camera.core.impl.s0 */
public final class C1503s0 extends DeferrableSurface {

    /* renamed from: j */
    public final Surface f4277j;

    public C1503s0(@C0359n0 Surface surface) {
        this.f4277j = surface;
    }

    @C0359n0
    /* renamed from: l */
    public C32487a<Surface> mo4935l() {
        return C1548f.m6479h(this.f4277j);
    }
}
