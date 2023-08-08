package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.modifier.C15627d;
import androidx.compose.p004ui.modifier.C15634j;
import androidx.compose.p004ui.modifier.C15636k;
import androidx.compose.p004ui.modifier.C15638m;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,305:1\n135#2:306\n76#3:307\n102#3,2:308\n76#3:310\n102#3,2:311\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n*L\n149#1:306\n155#1:307\n155#1:308,2\n156#1:310\n156#1:311,2\n*E\n"})
public final class InsetsPaddingModifier extends C15988w0 implements C15603u, C15627d, C15634j<C2354e1> {
    @C12579k

    /* renamed from: d */
    public final C2354e1 f6087d;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f6088e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f6089f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsetsPaddingModifier(@C12579k C2354e1 e1Var, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(e1Var, "insets");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f6087d = e1Var;
        this.f6088e = C8539f2.m30981g(e1Var, (C8410b2) null, 2, (Object) null);
        this.f6089f = C8539f2.m30981g(e1Var, (C8410b2) null, 2, (Object) null);
    }

    /* renamed from: V3 */
    public void mo7151V3(@C12579k C15636k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "scope");
        C2354e1 e1Var = (C2354e1) kVar.mo44518a(WindowInsetsPaddingKt.m10245e());
        mo7766v(C2358f1.m10396i(this.f6087d, e1Var));
        mo7765u(C2358f1.m10398k(e1Var, this.f6087d));
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingModifier)) {
            return false;
        }
        return Intrinsics.areEqual((Object) ((InsetsPaddingModifier) obj).f6087d, (Object) this.f6087d);
    }

    @C12579k
    public C15638m<C2354e1> getKey() {
        return WindowInsetsPaddingKt.m10245e();
    }

    public int hashCode() {
        return this.f6087d.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        int d = mo7763s().mo7987d(h0Var, h0Var.getLayoutDirection());
        int a = mo7763s().mo7984a(h0Var);
        int b = mo7763s().mo7985b(h0Var, h0Var.getLayoutDirection()) + d;
        int c = mo7763s().mo7986c(h0Var) + a;
        C15611w0 t0 = e0Var.mo44324t0(C16478c.m74384i(j, -b, -c));
        return C15568h0.m69206r2(h0Var, C16478c.m74382g(j, t0.mo44471K0() + b), C16478c.m74381f(j, t0.mo44468G0() + c), (Map) null, new InsetsPaddingModifier$measure$1(t0, d, a), 4, (Object) null);
    }

    /* renamed from: r */
    public final C2354e1 mo7762r() {
        return (C2354e1) this.f6089f.getValue();
    }

    /* renamed from: s */
    public final C2354e1 mo7763s() {
        return (C2354e1) this.f6088e.getValue();
    }

    @C12579k
    /* renamed from: t */
    public C2354e1 getValue() {
        return mo7762r();
    }

    /* renamed from: u */
    public final void mo7765u(C2354e1 e1Var) {
        this.f6089f.setValue(e1Var);
    }

    /* renamed from: v */
    public final void mo7766v(C2354e1 e1Var) {
        this.f6088e.setValue(e1Var);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InsetsPaddingModifier(C2354e1 e1Var, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(e1Var, (i & 2) != 0 ? InspectableValueKt.m71063e() ? new InsetsPaddingModifier$special$$inlined$debugInspectorInfo$1(e1Var) : InspectableValueKt.m71060b() : lVar);
    }
}
