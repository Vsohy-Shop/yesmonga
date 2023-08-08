package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.C16402q0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,134:1\n76#2:135\n76#2:136\n76#2:137\n50#3:138\n49#3:139\n50#3:146\n49#3:147\n83#3,3:154\n83#3,3:163\n1114#4,6:140\n1114#4,6:148\n1114#4,6:157\n1114#4,6:166\n76#5:172\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n*L\n63#1:135\n64#1:136\n65#1:137\n69#1:138\n69#1:139\n72#1:146\n72#1:147\n81#1:154,3\n97#1:163,3\n69#1:140,6\n72#1:148,6\n81#1:157,6\n97#1:166,6\n72#1:172\n*E\n"})
public final class HeightInLinesModifierKt$heightInLines$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ C16361p0 $textStyle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeightInLinesModifierKt$heightInLines$2(int i, int i2, C16361p0 p0Var) {
        super(3);
        this.$minLines = i;
        this.$maxLines = i2;
        this.$textStyle = p0Var;
    }

    /* renamed from: b */
    public static final Object m12297b(C8578k2<? extends Object> k2Var) {
        return k2Var.getValue();
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo9298a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Integer num;
        float f;
        float f2;
        int i2;
        int i3;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar2.mo14918M(408240218);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(408240218, i, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:58)");
        }
        HeightInLinesModifierKt.m12295c(this.$minLines, this.$maxLines);
        if (this.$minLines == 1 && this.$maxLines == Integer.MAX_VALUE) {
            C8767m.C8768a aVar = C8767m.f23478j;
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            oVar.mo15002m0();
            return aVar;
        }
        C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
        C16242u.C16244b bVar = (C16242u.C16244b) oVar2.mo15032w(CompositionLocalsKt.m71013k());
        LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
        C16361p0 p0Var = this.$textStyle;
        oVar2.mo14918M(511388516);
        boolean n0 = oVar2.mo15006n0(p0Var) | oVar2.mo15006n0(layoutDirection);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = C16402q0.m73989d(p0Var, layoutDirection);
            oVar2.mo14893C(N);
        }
        oVar.mo15002m0();
        C16361p0 p0Var2 = (C16361p0) N;
        oVar2.mo14918M(511388516);
        boolean n02 = oVar2.mo15006n0(bVar) | oVar2.mo15006n0(p0Var2);
        Object N2 = oVar.mo14921N();
        if (n02 || N2 == C8592o.f23032a.mo16277a()) {
            C16242u u = p0Var2.mo47513u();
            C16209i0 z = p0Var2.mo47518z();
            if (z == null) {
                z = C16209i0.f40292b.mo46952m();
            }
            C16190e0 x = p0Var2.mo47516x();
            if (x != null) {
                i2 = x.mo46880j();
            } else {
                i2 = C16190e0.f40252b.mo46883b();
            }
            C16194f0 y = p0Var2.mo47517y();
            if (y != null) {
                i3 = y.mo46893m();
            } else {
                i3 = C16194f0.f40257b.mo46895a();
            }
            N2 = bVar.mo46784b(u, z, i2, i3);
            oVar2.mo14893C(N2);
        }
        oVar.mo15002m0();
        C8578k2 k2Var = (C8578k2) N2;
        Object[] objArr = {dVar, bVar, this.$textStyle, layoutDirection, m12297b(k2Var)};
        oVar2.mo14918M(-568225417);
        boolean z2 = false;
        for (int i4 = 0; i4 < 5; i4++) {
            z2 |= oVar2.mo15006n0(objArr[i4]);
        }
        Object N3 = oVar.mo14921N();
        if (z2 || N3 == C8592o.f23032a.mo16277a()) {
            N3 = Integer.valueOf(C16500q.m74659j(C2847u.m13129a(p0Var2, dVar, bVar, C2847u.m13131c(), 1)));
            oVar2.mo14893C(N3);
        }
        oVar.mo15002m0();
        int intValue = ((Number) N3).intValue();
        Object[] objArr2 = {dVar, bVar, this.$textStyle, layoutDirection, m12297b(k2Var)};
        oVar2.mo14918M(-568225417);
        boolean z3 = false;
        for (int i5 = 0; i5 < 5; i5++) {
            z3 |= oVar2.mo15006n0(objArr2[i5]);
        }
        Object N4 = oVar.mo14921N();
        if (z3 || N4 == C8592o.f23032a.mo16277a()) {
            N4 = Integer.valueOf(C16500q.m74659j(C2847u.m13129a(p0Var2, dVar, bVar, C2847u.m13131c() + 10 + C2847u.m13131c(), 2)));
            oVar2.mo14893C(N4);
        }
        oVar.mo15002m0();
        int intValue2 = ((Number) N4).intValue() - intValue;
        int i6 = this.$minLines;
        Integer num2 = null;
        if (i6 == 1) {
            num = null;
        } else {
            num = Integer.valueOf(((i6 - 1) * intValue2) + intValue);
        }
        int i7 = this.$maxLines;
        if (i7 != Integer.MAX_VALUE) {
            num2 = Integer.valueOf(intValue + (intValue2 * (i7 - 1)));
        }
        C8767m.C8768a aVar2 = C8767m.f23478j;
        if (num != null) {
            f = dVar.mo7416L(num.intValue());
        } else {
            f = C16483g.f40871b.mo47828e();
        }
        if (num2 != null) {
            f2 = dVar.mo7416L(num2.intValue());
        } else {
            f2 = C16483g.f40871b.mo47828e();
        }
        C8767m p = SizeKt.m10116p(aVar2, f, f2);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return p;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo9298a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
