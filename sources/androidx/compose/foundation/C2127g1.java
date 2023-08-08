package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.C0376v0;
import androidx.compose.foundation.C2856v0;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.internal.C8567o;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C0376v0(29)
@C11363r0({"SMAP\nPlatformMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,184:1\n152#2:185\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n*L\n152#1:185\n*E\n"})
/* renamed from: androidx.compose.foundation.g1 */
public final class C2127g1 implements C2628n0 {
    @C12579k

    /* renamed from: b */
    public static final C2127g1 f5823b = new C2127g1();

    /* renamed from: c */
    public static final boolean f5824c = true;

    @C0376v0(29)
    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.g1$a */
    public static final class C2128a extends C2856v0.C2857a {

        /* renamed from: c */
        public static final int f5825c = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2128a(@C12579k Magnifier magnifier) {
            super(magnifier);
            Intrinsics.checkNotNullParameter(magnifier, "magnifier");
        }

        /* renamed from: b */
        public void mo7318b(long j, long j2, float f) {
            if (!Float.isNaN(f)) {
                mo9936d().setZoom(f);
            }
            if (C15096g.m64901d(j2)) {
                mo9936d().show(C15094f.m64880p(j), C15094f.m64882r(j), C15094f.m64880p(j2), C15094f.m64882r(j2));
            } else {
                mo9936d().show(C15094f.m64880p(j), C15094f.m64882r(j));
            }
        }
    }

    /* renamed from: b */
    public boolean mo7316b() {
        return f5824c;
    }

    @C12579k
    /* renamed from: c */
    public C2128a mo7315a(@C12579k C2116e0 e0Var, @C12579k View view, @C12579k C16479d dVar, float f) {
        boolean z;
        Intrinsics.checkNotNullParameter(e0Var, "style");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(dVar, "density");
        if (Intrinsics.areEqual((Object) e0Var, (Object) C2116e0.f5798g.mo7298c())) {
            C2634p0.m11894a();
            return new C2128a(C2632o0.m11892a(view));
        }
        long V = dVar.mo7420V(e0Var.mo7292g());
        float g5 = dVar.mo7425g5(e0Var.mo7288d());
        float g52 = dVar.mo7425g5(e0Var.mo7289e());
        C2114d1.m9123a();
        Magnifier.Builder a = C2111c1.m9121a(view);
        if (V != C15104m.f37280b.mo42316a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Magnifier.Builder unused = a.setSize(C11409d.m43851L0(C15104m.m65023t(V)), C11409d.m43851L0(C15104m.m65016m(V)));
        }
        if (!Float.isNaN(g5)) {
            Magnifier.Builder unused2 = a.setCornerRadius(g5);
        }
        if (!Float.isNaN(g52)) {
            Magnifier.Builder unused3 = a.setElevation(g52);
        }
        if (!Float.isNaN(f)) {
            Magnifier.Builder unused4 = a.setInitialZoom(f);
        }
        Magnifier.Builder unused5 = a.setClippingEnabled(e0Var.mo7287c());
        Magnifier a2 = a.build();
        Intrinsics.checkNotNullExpressionValue(a2, "Builder(view).run {\n    …    build()\n            }");
        return new C2128a(a2);
    }
}
