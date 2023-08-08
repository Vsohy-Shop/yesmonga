package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.modifier.C15627d;
import androidx.compose.p004ui.modifier.C15636k;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedHeightModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,217:1\n76#2:218\n102#2,2:219\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedHeightModifier\n*L\n184#1:218\n184#1:219,2\n*E\n"})
public final class DerivedHeightModifier extends C15988w0 implements C15603u, C15627d {
    @C12579k

    /* renamed from: d */
    public final C2354e1 f6050d;
    @C12579k

    /* renamed from: e */
    public final C11304p<C2354e1, C16479d, Integer> f6051e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f6052f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DerivedHeightModifier(@C12579k C2354e1 e1Var, @C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12579k C11304p<? super C2354e1, ? super C16479d, Integer> pVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(e1Var, "insets");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        Intrinsics.checkNotNullParameter(pVar, "heightCalc");
        this.f6050d = e1Var;
        this.f6051e = pVar;
        this.f6052f = C8539f2.m30981g(e1Var, (C8410b2) null, 2, (Object) null);
    }

    /* renamed from: V3 */
    public void mo7151V3(@C12579k C15636k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "scope");
        mo7722s(C2358f1.m10396i(this.f6050d, (C2354e1) kVar.mo44518a(WindowInsetsPaddingKt.m10245e())));
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedHeightModifier)) {
            return false;
        }
        DerivedHeightModifier derivedHeightModifier = (DerivedHeightModifier) obj;
        if (!Intrinsics.areEqual((Object) this.f6050d, (Object) derivedHeightModifier.f6050d) || !Intrinsics.areEqual((Object) this.f6051e, (Object) derivedHeightModifier.f6051e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f6050d.hashCode() * 31) + this.f6051e.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        int intValue = this.f6051e.invoke(mo7721r(), h0Var).intValue();
        if (intValue == 0) {
            return C15568h0.m69206r2(h0Var, 0, 0, (Map) null, DerivedHeightModifier$measure$1.f6053f, 4, (Object) null);
        }
        C15611w0 t0 = e0Var.mo44324t0(C16476b.m74351e(j, 0, 0, intValue, intValue, 3, (Object) null));
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), intValue, (Map) null, new DerivedHeightModifier$measure$2(t0), 4, (Object) null);
    }

    /* renamed from: r */
    public final C2354e1 mo7721r() {
        return (C2354e1) this.f6052f.getValue();
    }

    /* renamed from: s */
    public final void mo7722s(C2354e1 e1Var) {
        this.f6052f.setValue(e1Var);
    }
}
