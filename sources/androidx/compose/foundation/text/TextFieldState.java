package androidx.compose.foundation.text;

import androidx.compose.p004ui.focus.C15068j;
import androidx.compose.p004ui.graphics.C15211f3;
import androidx.compose.p004ui.graphics.C15271n0;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.input.C16310p;
import androidx.compose.p004ui.text.input.C16331y0;
import androidx.compose.p004ui.text.input.EditProcessor;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8586m1;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1087:1\n154#2:1088\n76#3:1089\n102#3,2:1090\n76#3:1092\n102#3,2:1093\n76#3:1095\n102#3,2:1096\n76#3:1098\n102#3,2:1099\n76#3:1101\n102#3,2:1102\n76#3:1104\n102#3,2:1105\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n*L\n749#1:1088\n744#1:1089\n744#1:1090,2\n749#1:1092\n749#1:1093,2\n800#1:1095\n800#1:1096,2\n811#1:1098\n811#1:1099,2\n817#1:1101\n817#1:1102,2\n823#1:1104\n823#1:1105,2\n*E\n"})
public final class TextFieldState {
    @C12579k

    /* renamed from: a */
    public C2785r f7223a;
    @C12579k

    /* renamed from: b */
    public final C8586m1 f7224b;
    @C12579k

    /* renamed from: c */
    public final EditProcessor f7225c = new EditProcessor();
    @C12580l

    /* renamed from: d */
    public C16331y0 f7226d;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f7227e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f7228f;
    @C12580l

    /* renamed from: g */
    public C15588o f7229g;
    @C12579k

    /* renamed from: h */
    public final C8700z0<C2851y> f7230h;
    @C12580l

    /* renamed from: i */
    public C16156d f7231i;
    @C12579k

    /* renamed from: j */
    public final C8700z0 f7232j;

    /* renamed from: k */
    public boolean f7233k;
    @C12579k

    /* renamed from: l */
    public final C8700z0 f7234l;
    @C12579k

    /* renamed from: m */
    public final C8700z0 f7235m;
    @C12579k

    /* renamed from: n */
    public final C8700z0 f7236n;

    /* renamed from: o */
    public boolean f7237o;
    @C12579k

    /* renamed from: p */
    public final C2774i f7238p;
    @C12579k

    /* renamed from: q */
    public C11300l<? super TextFieldValue, C11079d2> f7239q;
    @C12579k

    /* renamed from: r */
    public final C11300l<TextFieldValue, C11079d2> f7240r;
    @C12579k

    /* renamed from: s */
    public final C11300l<C16310p, C11079d2> f7241s;
    @C12579k

    /* renamed from: t */
    public final C15211f3 f7242t;

    public TextFieldState(@C12579k C2785r rVar, @C12579k C8586m1 m1Var) {
        Intrinsics.checkNotNullParameter(rVar, "textDelegate");
        Intrinsics.checkNotNullParameter(m1Var, "recomposeScope");
        this.f7223a = rVar;
        this.f7224b = m1Var;
        Boolean bool = Boolean.FALSE;
        this.f7227e = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
        this.f7228f = C8539f2.m30981g(C16483g.m74451w(C16483g.m74435M((float) 0)), (C8410b2) null, 2, (Object) null);
        this.f7230h = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f7232j = C8539f2.m30981g(HandleState.None, (C8410b2) null, 2, (Object) null);
        this.f7234l = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
        this.f7235m = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
        this.f7236n = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
        this.f7237o = true;
        this.f7238p = new C2774i();
        this.f7239q = TextFieldState$onValueChangeOriginal$1.f7243f;
        this.f7240r = new TextFieldState$onValueChange$1(this);
        this.f7241s = new TextFieldState$onImeActionPerformed$1(this);
        this.f7242t = C15271n0.m66286a();
    }

    /* renamed from: A */
    public final void mo9432A(boolean z) {
        this.f7236n.setValue(Boolean.valueOf(z));
    }

    /* renamed from: B */
    public final void mo9433B(boolean z) {
        this.f7233k = z;
    }

    /* renamed from: C */
    public final void mo9434C(boolean z) {
        this.f7235m.setValue(Boolean.valueOf(z));
    }

    /* renamed from: D */
    public final void mo9435D(boolean z) {
        this.f7234l.setValue(Boolean.valueOf(z));
    }

    /* renamed from: E */
    public final void mo9436E(@C12579k C2785r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.f7223a = rVar;
    }

    /* renamed from: F */
    public final void mo9437F(@C12580l C16156d dVar) {
        this.f7231i = dVar;
    }

    /* renamed from: G */
    public final void mo9438G(@C12579k C16156d dVar, @C12579k C16156d dVar2, @C12579k C16361p0 p0Var, boolean z, @C12579k C16479d dVar3, @C12579k C16242u.C16244b bVar, @C12579k C11300l<? super TextFieldValue, C11079d2> lVar, @C12579k C2776k kVar, @C12579k C15068j jVar, long j) {
        C16156d dVar4 = dVar;
        C11300l<? super TextFieldValue, C11079d2> lVar2 = lVar;
        C2776k kVar2 = kVar;
        C15068j jVar2 = jVar;
        Intrinsics.checkNotNullParameter(dVar4, "untransformedText");
        C16156d dVar5 = dVar2;
        Intrinsics.checkNotNullParameter(dVar5, "visualText");
        C16361p0 p0Var2 = p0Var;
        Intrinsics.checkNotNullParameter(p0Var2, "textStyle");
        C16479d dVar6 = dVar3;
        Intrinsics.checkNotNullParameter(dVar6, "density");
        C16242u.C16244b bVar2 = bVar;
        Intrinsics.checkNotNullParameter(bVar2, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(lVar2, "onValueChange");
        Intrinsics.checkNotNullParameter(kVar2, "keyboardActions");
        Intrinsics.checkNotNullParameter(jVar2, "focusManager");
        this.f7239q = lVar2;
        this.f7242t.mo42759l(j);
        C2774i iVar = this.f7238p;
        iVar.mo9522h(kVar2);
        iVar.mo9520f(jVar2);
        iVar.mo9521g(this.f7226d);
        this.f7231i = dVar4;
        C2785r d = CoreTextKt.m12286d(this.f7223a, dVar5, p0Var2, dVar6, bVar2, z, 0, 0, 0, CollectionsKt__CollectionsKt.m40441E(), 448, (Object) null);
        if (this.f7223a != d) {
            this.f7237o = true;
        }
        this.f7223a = d;
    }

    @C12579k
    /* renamed from: c */
    public final HandleState mo9439c() {
        return (HandleState) this.f7232j.getValue();
    }

    /* renamed from: d */
    public final boolean mo9440d() {
        return ((Boolean) this.f7227e.getValue()).booleanValue();
    }

    @C12580l
    /* renamed from: e */
    public final C16331y0 mo9441e() {
        return this.f7226d;
    }

    @C12580l
    /* renamed from: f */
    public final C15588o mo9442f() {
        return this.f7229g;
    }

    @C12580l
    /* renamed from: g */
    public final C2851y mo9443g() {
        return this.f7230h.getValue();
    }

    /* renamed from: h */
    public final float mo9444h() {
        return ((C16483g) this.f7228f.getValue()).mo47823t0();
    }

    @C12579k
    /* renamed from: i */
    public final C11300l<C16310p, C11079d2> mo9445i() {
        return this.f7241s;
    }

    @C12579k
    /* renamed from: j */
    public final C11300l<TextFieldValue, C11079d2> mo9446j() {
        return this.f7240r;
    }

    @C12579k
    /* renamed from: k */
    public final EditProcessor mo9447k() {
        return this.f7225c;
    }

    @C12579k
    /* renamed from: l */
    public final C8586m1 mo9448l() {
        return this.f7224b;
    }

    @C12579k
    /* renamed from: m */
    public final C15211f3 mo9449m() {
        return this.f7242t;
    }

    /* renamed from: n */
    public final boolean mo9450n() {
        return ((Boolean) this.f7236n.getValue()).booleanValue();
    }

    /* renamed from: o */
    public final boolean mo9451o() {
        return this.f7233k;
    }

    /* renamed from: p */
    public final boolean mo9452p() {
        return ((Boolean) this.f7235m.getValue()).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo9453q() {
        return ((Boolean) this.f7234l.getValue()).booleanValue();
    }

    @C12579k
    /* renamed from: r */
    public final C2785r mo9454r() {
        return this.f7223a;
    }

    @C12580l
    /* renamed from: s */
    public final C16156d mo9455s() {
        return this.f7231i;
    }

    /* renamed from: t */
    public final boolean mo9456t() {
        return this.f7237o;
    }

    /* renamed from: u */
    public final void mo9457u(@C12579k HandleState handleState) {
        Intrinsics.checkNotNullParameter(handleState, "<set-?>");
        this.f7232j.setValue(handleState);
    }

    /* renamed from: v */
    public final void mo9458v(boolean z) {
        this.f7227e.setValue(Boolean.valueOf(z));
    }

    /* renamed from: w */
    public final void mo9459w(@C12580l C16331y0 y0Var) {
        this.f7226d = y0Var;
    }

    /* renamed from: x */
    public final void mo9460x(@C12580l C15588o oVar) {
        this.f7229g = oVar;
    }

    /* renamed from: y */
    public final void mo9461y(@C12580l C2851y yVar) {
        this.f7230h.setValue(yVar);
        this.f7237o = false;
    }

    /* renamed from: z */
    public final void mo9462z(float f) {
        this.f7228f.setValue(C16483g.m74451w(f));
    }
}
