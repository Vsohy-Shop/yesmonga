package androidx.compose.foundation;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.C0352k;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.semantics.SemanticsPropertyKey;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16491k;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,394:1\n135#2:395\n146#2:396\n*S KotlinDebug\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n*L\n233#1:395\n231#1:396\n*E\n"})
public final class MagnifierKt {
    @C12579k

    /* renamed from: a */
    public static final SemanticsPropertyKey<C11289a<C15094f>> f5750a = new SemanticsPropertyKey<>("MagnifierPositionInRoot", (C11304p) null, 2, (DefaultConstructorMarker) null);

    @C12579k
    /* renamed from: a */
    public static final SemanticsPropertyKey<C11289a<C15094f>> m8977a() {
        return f5750a;
    }

    @C0352k(api = 28)
    /* renamed from: b */
    public static final boolean m8978b(int i) {
        return i >= 28;
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m8979c(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Build.VERSION.SDK_INT;
        }
        return m8978b(i);
    }

    @C2855v
    @C12579k
    /* renamed from: d */
    public static final C8767m m8980d(@C12579k C8767m mVar, @C12579k C11300l<? super C16479d, C15094f> lVar, @C12579k C11300l<? super C16479d, C15094f> lVar2, float f, @C12579k C2116e0 e0Var, @C12580l C11300l<? super C16491k, C11079d2> lVar3) {
        C11300l lVar4;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "sourceCenter");
        Intrinsics.checkNotNullParameter(lVar2, "magnifierCenter");
        Intrinsics.checkNotNullParameter(e0Var, "style");
        if (InspectableValueKt.m71063e()) {
            lVar4 = new MagnifierKt$magnifier$$inlined$debugInspectorInfo$1(lVar, lVar2, f, e0Var);
        } else {
            lVar4 = InspectableValueKt.m71060b();
        }
        C8767m mVar2 = C8767m.f23478j;
        if (m8979c(0, 1, (Object) null)) {
            mVar2 = m8981e(mVar2, lVar, lVar2, f, e0Var, lVar3, C2628n0.f6965a.mo9046a());
        }
        return InspectableValueKt.m71062d(mVar, lVar4, mVar2);
    }

    @SuppressLint({"ModifierInspectorInfo"})
    @C0376v0(28)
    @C12579k
    /* renamed from: e */
    public static final C8767m m8981e(@C12579k C8767m mVar, @C12579k C11300l<? super C16479d, C15094f> lVar, @C12579k C11300l<? super C16479d, C15094f> lVar2, float f, @C12579k C2116e0 e0Var, @C12580l C11300l<? super C16491k, C11079d2> lVar3, @C12579k C2628n0 n0Var) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "sourceCenter");
        Intrinsics.checkNotNullParameter(lVar2, "magnifierCenter");
        Intrinsics.checkNotNullParameter(e0Var, "style");
        Intrinsics.checkNotNullParameter(n0Var, "platformMagnifierFactory");
        return ComposedModifierKt.m32287j(mVar, (C11300l) null, new MagnifierKt$magnifier$4(lVar, lVar2, f, lVar3, n0Var, e0Var), 1, (Object) null);
    }

    /* renamed from: f */
    public static /* synthetic */ C8767m m8982f(C8767m mVar, C11300l lVar, C11300l lVar2, float f, C2116e0 e0Var, C11300l lVar3, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar2 = MagnifierKt$magnifier$1.f5751f;
        }
        C11300l lVar4 = lVar2;
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            e0Var = C2116e0.f5798g.mo7297a();
        }
        C2116e0 e0Var2 = e0Var;
        if ((i & 16) != 0) {
            lVar3 = null;
        }
        return m8980d(mVar, lVar, lVar4, f2, e0Var2, lVar3);
    }
}
