package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0368r0;
import androidx.annotation.C0380x0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.C1624j;
import androidx.camera.core.C1667p3;
import androidx.camera.core.impl.utils.C1566j;
import androidx.camera.lifecycle.C1747c;
import androidx.camera.lifecycle.C1750f;
import androidx.lifecycle.C19499w;

/* renamed from: androidx.camera.view.j */
public final class C1802j extends C1773d {

    /* renamed from: U */
    public static final String f4960U = "CamLifecycleController";
    @C0363p0

    /* renamed from: T */
    public C19499w f4961T;

    public C1802j(@C0359n0 Context context) {
        super(context);
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: A0 */
    public void mo5951A0() {
        C1750f fVar = this.f4911q;
        if (fVar != null) {
            fVar.mo5810a();
            this.f4911q.mo5818m();
        }
    }

    @C0353k0
    /* renamed from: B0 */
    public void mo5952B0() {
        C1566j.m6506b();
        this.f4961T = null;
        this.f4910p = null;
        C1750f fVar = this.f4911q;
        if (fVar != null) {
            fVar.mo5810a();
        }
    }

    @C0363p0
    @C0380x0("android.permission.CAMERA")
    @C0368r0(markerClass = {C1747c.class})
    /* renamed from: l0 */
    public C1624j mo5903l0() {
        C1667p3 g;
        if (this.f4961T == null || this.f4911q == null || (g = mo5893g()) == null) {
            return null;
        }
        return this.f4911q.mo5814f(this.f4961T, this.f4895a, g);
    }

    @C0353k0
    @SuppressLint({"MissingPermission"})
    /* renamed from: z0 */
    public void mo5953z0(@C0359n0 C19499w wVar) {
        C1566j.m6506b();
        this.f4961T = wVar;
        mo5905m0();
    }
}
