package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.runtime.internal.C8567o;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(28)
/* renamed from: androidx.compose.foundation.v0 */
public final class C2856v0 implements C2628n0 {
    @C12579k

    /* renamed from: b */
    public static final C2856v0 f7483b = new C2856v0();

    /* renamed from: c */
    public static final boolean f7484c = false;

    @C0376v0(28)
    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.v0$a */
    public static class C2857a implements C2626m0 {

        /* renamed from: b */
        public static final int f7485b = 8;
        @C12579k

        /* renamed from: a */
        public final Magnifier f7486a;

        public C2857a(@C12579k Magnifier magnifier) {
            Intrinsics.checkNotNullParameter(magnifier, "magnifier");
            this.f7486a = magnifier;
        }

        /* renamed from: a */
        public long mo9043a() {
            return C16502r.m74668a(this.f7486a.getWidth(), this.f7486a.getHeight());
        }

        /* renamed from: b */
        public void mo7318b(long j, long j2, float f) {
            this.f7486a.show(C15094f.m64880p(j), C15094f.m64882r(j));
        }

        /* renamed from: c */
        public void mo9044c() {
            this.f7486a.update();
        }

        @C12579k
        /* renamed from: d */
        public final Magnifier mo9936d() {
            return this.f7486a;
        }

        public void dismiss() {
            this.f7486a.dismiss();
        }
    }

    /* renamed from: b */
    public boolean mo7316b() {
        return f7484c;
    }

    @C12579k
    /* renamed from: c */
    public C2857a mo7315a(@C12579k C2116e0 e0Var, @C12579k View view, @C12579k C16479d dVar, float f) {
        Intrinsics.checkNotNullParameter(e0Var, "style");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(dVar, "density");
        C2634p0.m11894a();
        return new C2857a(C2632o0.m11892a(view));
    }
}
