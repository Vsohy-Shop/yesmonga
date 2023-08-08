package androidx.camera.core;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.C1500r0;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1544c;
import androidx.camera.core.impl.utils.futures.C1548f;

/* renamed from: androidx.camera.core.x0 */
public final class C1716x0 extends C1711w0 {

    /* renamed from: androidx.camera.core.x0$a */
    public class C1717a implements C1544c<Void> {

        /* renamed from: a */
        public final /* synthetic */ C1353a2 f4770a;

        public C1717a(C1353a2 a2Var) {
            this.f4770a = a2Var;
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            this.f4770a.close();
        }

        /* renamed from: c */
        public void mo4160a(Void voidR) {
        }
    }

    @C0363p0
    /* renamed from: d */
    public C1353a2 mo5748d(@C0359n0 C1500r0 r0Var) {
        return r0Var.mo5008g();
    }

    /* renamed from: g */
    public void mo5751g() {
    }

    /* renamed from: k */
    public void mo5753k(@C0359n0 C1353a2 a2Var) {
        C1548f.m6473b(mo5749e(a2Var), new C1717a(a2Var), C1525a.m6437a());
    }
}
