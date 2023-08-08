package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15268m4;
import androidx.compose.p004ui.graphics.C15320t2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,153:1\n154#2:154\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n112#1:154\n*E\n"})
/* renamed from: androidx.compose.ui.draw.BlurKt */
public final class BlurKt {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C8767m m32413a(@C12579k C8767m mVar, float f, float f2, @C12579k C15218g4 g4Var) {
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(mVar, "$this$blur");
        if (g4Var != null) {
            i = C15268m4.f37596b.mo42908a();
            z = true;
        } else {
            z = false;
            i = C15268m4.f37596b.mo42909b();
        }
        float f3 = (float) 0;
        if ((C16483g.m74452z(f, C16483g.m74435M(f3)) <= 0 || C16483g.m74452z(f2, C16483g.m74435M(f3)) <= 0) && !z) {
            return mVar;
        }
        return C15320t2.m66557a(mVar, new BlurKt$blur$1(f, f2, i, g4Var, z));
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m32414b(C8767m mVar, float f, float f2, C8741b bVar, int i, Object obj) {
        if ((i & 4) != 0) {
            bVar = C8741b.m32503c(C8741b.f23445b.mo17166a());
        }
        return m32413a(mVar, f, f2, bVar.mo17164j());
    }

    @C8547h2
    @C12579k
    /* renamed from: c */
    public static final C8767m m32415c(@C12579k C8767m mVar, float f, @C12579k C15218g4 g4Var) {
        Intrinsics.checkNotNullParameter(mVar, "$this$blur");
        return m32413a(mVar, f, f, g4Var);
    }

    /* renamed from: d */
    public static /* synthetic */ C8767m m32416d(C8767m mVar, float f, C8741b bVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = C8741b.m32503c(C8741b.f23445b.mo17166a());
        }
        return m32415c(mVar, f, bVar.mo17164j());
    }
}
