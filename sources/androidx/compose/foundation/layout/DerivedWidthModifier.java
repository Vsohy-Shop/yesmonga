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
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedWidthModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,217:1\n76#2:218\n102#2,2:219\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedWidthModifier\n*L\n139#1:218\n139#1:219,2\n*E\n"})
public final class DerivedWidthModifier extends C15988w0 implements C15603u, C15627d {
    @C12579k

    /* renamed from: d */
    public final C2354e1 f6054d;
    @C12579k

    /* renamed from: e */
    public final C11305q<C2354e1, LayoutDirection, C16479d, Integer> f6055e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f6056f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DerivedWidthModifier(@C12579k C2354e1 e1Var, @C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12579k C11305q<? super C2354e1, ? super LayoutDirection, ? super C16479d, Integer> qVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(e1Var, "insets");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        Intrinsics.checkNotNullParameter(qVar, "widthCalc");
        this.f6054d = e1Var;
        this.f6055e = qVar;
        this.f6056f = C8539f2.m30981g(e1Var, (C8410b2) null, 2, (Object) null);
    }

    /* renamed from: V3 */
    public void mo7151V3(@C12579k C15636k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "scope");
        mo7728s(C2358f1.m10396i(this.f6054d, (C2354e1) kVar.mo44518a(WindowInsetsPaddingKt.m10245e())));
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedWidthModifier)) {
            return false;
        }
        DerivedWidthModifier derivedWidthModifier = (DerivedWidthModifier) obj;
        if (!Intrinsics.areEqual((Object) this.f6054d, (Object) derivedWidthModifier.f6054d) || !Intrinsics.areEqual((Object) this.f6055e, (Object) derivedWidthModifier.f6055e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f6054d.hashCode() * 31) + this.f6055e.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        int intValue = this.f6055e.invoke(mo7727r(), h0Var.getLayoutDirection(), h0Var).intValue();
        if (intValue == 0) {
            return C15568h0.m69206r2(h0Var, 0, 0, (Map) null, DerivedWidthModifier$measure$1.f6057f, 4, (Object) null);
        }
        C15611w0 t0 = e0Var.mo44324t0(C16476b.m74351e(j, intValue, intValue, 0, 0, 12, (Object) null));
        return C15568h0.m69206r2(h0Var, intValue, t0.mo44468G0(), (Map) null, new DerivedWidthModifier$measure$2(t0), 4, (Object) null);
    }

    /* renamed from: r */
    public final C2354e1 mo7727r() {
        return (C2354e1) this.f6056f.getValue();
    }

    /* renamed from: s */
    public final void mo7728s(C2354e1 e1Var) {
        this.f6056f.setValue(e1Var);
    }
}
