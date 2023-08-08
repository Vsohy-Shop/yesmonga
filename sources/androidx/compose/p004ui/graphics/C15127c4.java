package androidx.compose.p004ui.graphics;

import android.graphics.Shader;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n1#2:656\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.c4 */
public abstract class C15127c4 extends C15421z1 {
    @C12580l

    /* renamed from: c */
    public Shader f37363c;

    /* renamed from: d */
    public long f37364d = C15104m.f37280b.mo42316a();

    public C15127c4() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final void mo42495a(long j, @C12579k C15211f3 f3Var, float f) {
        boolean z;
        Intrinsics.checkNotNullParameter(f3Var, "p");
        Shader shader = this.f37363c;
        if (shader == null || !C15104m.m65014k(this.f37364d, j)) {
            shader = mo42412c(j);
            this.f37363c = shader;
            this.f37364d = j;
        }
        long a = f3Var.mo42747a();
        C15240j2.C15241a aVar = C15240j2.f37547b;
        if (!C15240j2.m66082y(a, aVar.mo42841a())) {
            f3Var.mo42759l(aVar.mo42841a());
        }
        if (!Intrinsics.areEqual((Object) f3Var.mo42766s(), (Object) shader)) {
            f3Var.mo42765r(shader);
        }
        if (f3Var.getAlpha() == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f3Var.mo42753g(f);
        }
    }

    @C12579k
    /* renamed from: c */
    public abstract Shader mo42412c(long j);
}
