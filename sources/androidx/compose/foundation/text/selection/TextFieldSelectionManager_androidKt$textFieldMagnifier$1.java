package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "c", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTextFieldSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,68:1\n76#2:69\n25#3:70\n50#3:77\n49#3:78\n1114#4,6:71\n1114#4,6:79\n76#5:85\n102#5,2:86\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n*L\n47#1:69\n48#1:70\n53#1:77\n53#1:78\n48#1:71,6\n53#1:79,6\n48#1:85\n48#1:86,2\n*E\n"})
public final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ TextFieldSelectionManager $manager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1(TextFieldSelectionManager textFieldSelectionManager) {
        super(3);
        this.$manager = textFieldSelectionManager;
    }

    /* renamed from: d */
    public static final long m12945d(C8700z0<C16500q> z0Var) {
        return z0Var.getValue().mo47895q();
    }

    /* renamed from: e */
    public static final void m12946e(C8700z0<C16500q> z0Var, long j) {
        z0Var.setValue(C16500q.m74651b(j));
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public final C8767m mo9778c(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(1980580247);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1980580247, i, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:45)");
        }
        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = C8539f2.m30981g(C16500q.m74651b(C16500q.f40900b.mo47897a()), (C8410b2) null, 2, (Object) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        final C8700z0 z0Var = (C8700z0) N;
        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
        C28151 r2 = new C11289a<C15094f>() {
            /* renamed from: a */
            public final long mo9779a() {
                return TextFieldSelectionManagerKt.m12938b(textFieldSelectionManager, TextFieldSelectionManager_androidKt$textFieldMagnifier$1.m12945d(z0Var));
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return C15094f.m64868d(mo9779a());
            }
        };
        oVar.mo14918M(511388516);
        boolean n0 = oVar.mo15006n0(z0Var) | oVar.mo15006n0(dVar);
        Object N2 = oVar.mo14921N();
        if (n0 || N2 == aVar.mo16277a()) {
            N2 = new TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1(dVar, z0Var);
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        C8767m g = SelectionMagnifierKt.m12711g(mVar, r2, (C11300l) N2);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return g;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo9778c((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
