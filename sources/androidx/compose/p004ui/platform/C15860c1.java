package androidx.compose.p004ui.platform;

import android.view.View;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.unit.C16509w;
import androidx.core.view.C18196h2;
import androidx.core.view.C18363s1;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.collections.C10956m;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.c1 */
public final class C15860c1 implements C15446a {
    @C12579k

    /* renamed from: a */
    public final View f39515a;
    @C12579k

    /* renamed from: b */
    public final C18363s1 f39516b;
    @C12579k

    /* renamed from: c */
    public final int[] f39517c = new int[2];

    public C15860c1(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        this.f39515a = view;
        C18363s1 s1Var = new C18363s1(view);
        s1Var.mo53024p(true);
        this.f39516b = s1Var;
        C18196h2.m82552Y1(view, true);
    }

    @C12580l
    /* renamed from: a */
    public Object mo7455a(long j, long j2, @C12579k C11045c<? super C16509w> cVar) {
        if (!this.f39516b.mo53009a(C15867d1.m71324l(C16509w.m74750l(j2)), C15867d1.m71324l(C16509w.m74752n(j2)), true)) {
            j2 = C16509w.f40916b.mo47915a();
        }
        mo45709c();
        return C16509w.m74740b(j2);
    }

    /* renamed from: c */
    public final void mo45709c() {
        if (this.f39516b.mo53020l(0)) {
            this.f39516b.mo53029u(0);
        }
        if (this.f39516b.mo53020l(1)) {
            this.f39516b.mo53029u(1);
        }
    }

    /* renamed from: g */
    public long mo7456g(long j, long j2, int i) {
        if (!this.f39516b.mo53027s(C15867d1.m71319g(j2), C15867d1.m71323k(i))) {
            return C15094f.f37256b.mo42248e();
        }
        C10956m.m41300u2(this.f39517c, 0, 0, 0, 6, (Object) null);
        this.f39516b.mo53013e(C15867d1.m71318f(C15094f.m64880p(j)), C15867d1.m71318f(C15094f.m64882r(j)), C15867d1.m71318f(C15094f.m64880p(j2)), C15867d1.m71318f(C15094f.m64882r(j2)), (int[]) null, C15867d1.m71323k(i), this.f39517c);
        return C15867d1.m71322j(this.f39517c, j2);
    }

    /* renamed from: m */
    public long mo7457m(long j, int i) {
        if (!this.f39516b.mo53027s(C15867d1.m71319g(j), C15867d1.m71323k(i))) {
            return C15094f.f37256b.mo42248e();
        }
        C10956m.m41300u2(this.f39517c, 0, 0, 0, 6, (Object) null);
        this.f39516b.mo53012d(C15867d1.m71318f(C15094f.m64880p(j)), C15867d1.m71318f(C15094f.m64882r(j)), this.f39517c, (int[]) null, C15867d1.m71323k(i));
        return C15867d1.m71322j(this.f39517c, j);
    }

    @C12580l
    /* renamed from: o */
    public Object mo7922o(long j, @C12579k C11045c<? super C16509w> cVar) {
        if (!this.f39516b.mo53010b(C15867d1.m71324l(C16509w.m74750l(j)), C15867d1.m71324l(C16509w.m74752n(j)))) {
            j = C16509w.f40916b.mo47915a();
        }
        mo45709c();
        return C16509w.m74740b(j);
    }
}
