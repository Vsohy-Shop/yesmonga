package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.relocation.C2672d;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.AlignmentLineKt;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.snapshots.C8646f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.Triple;
import kotlin.collections.C10977s0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CoreTextFieldKt$CoreTextField$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C2672d $bringIntoViewRequester;
    final /* synthetic */ C8767m $cursorModifier;
    final /* synthetic */ C11305q<C11304p<? super C8592o, ? super Integer, C11079d2>, C8592o, Integer, C11079d2> $decorationBox;
    final /* synthetic */ C16479d $density;
    final /* synthetic */ C8767m $drawModifier;
    final /* synthetic */ C8767m $magnifierModifier;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ C16281c0 $offsetMapping;
    final /* synthetic */ C8767m $onPositionedModifier;
    final /* synthetic */ C11300l<C16260h0, C11079d2> $onTextLayout;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;
    final /* synthetic */ boolean $showHandleAndMagnifier;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ C16361p0 $textStyle;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ C16275a1 $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$5(C11305q<? super C11304p<? super C8592o, ? super Integer, C11079d2>, ? super C8592o, ? super Integer, C11079d2> qVar, int i, TextFieldState textFieldState, C16361p0 p0Var, int i2, int i3, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, C16275a1 a1Var, C8767m mVar, C8767m mVar2, C8767m mVar3, C8767m mVar4, C2672d dVar, TextFieldSelectionManager textFieldSelectionManager, boolean z, boolean z2, C11300l<? super C16260h0, C11079d2> lVar, C16281c0 c0Var, C16479d dVar2) {
        super(2);
        this.$decorationBox = qVar;
        this.$$dirty1 = i;
        this.$state = textFieldState;
        this.$textStyle = p0Var;
        this.$minLines = i2;
        this.$maxLines = i3;
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$value = textFieldValue;
        this.$visualTransformation = a1Var;
        this.$cursorModifier = mVar;
        this.$drawModifier = mVar2;
        this.$onPositionedModifier = mVar3;
        this.$magnifierModifier = mVar4;
        this.$bringIntoViewRequester = dVar;
        this.$manager = textFieldSelectionManager;
        this.$showHandleAndMagnifier = z;
        this.$readOnly = z2;
        this.$onTextLayout = lVar;
        this.$offsetMapping = c0Var;
        this.$density = dVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-374338080, i2, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:563)");
            }
            C11305q<C11304p<? super C8592o, ? super Integer, C11079d2>, C8592o, Integer, C11079d2> qVar = this.$decorationBox;
            final TextFieldState textFieldState = this.$state;
            final C16361p0 p0Var = this.$textStyle;
            final int i3 = this.$minLines;
            final int i4 = this.$maxLines;
            final TextFieldScrollerPosition textFieldScrollerPosition = this.$scrollerPosition;
            final TextFieldValue textFieldValue = this.$value;
            final C16275a1 a1Var = this.$visualTransformation;
            final C8767m mVar = this.$cursorModifier;
            final C8767m mVar2 = this.$drawModifier;
            final C8767m mVar3 = this.$onPositionedModifier;
            final C8767m mVar4 = this.$magnifierModifier;
            final C2672d dVar = this.$bringIntoViewRequester;
            final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
            final boolean z = this.$showHandleAndMagnifier;
            final boolean z2 = this.$readOnly;
            final C11300l<C16260h0, C11079d2> lVar = this.$onTextLayout;
            final C16281c0 c0Var = this.$offsetMapping;
            final C16479d dVar2 = this.$density;
            C27051 r3 = new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(2032502107, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:564)");
                        }
                        C8767m b = BringIntoViewRequesterKt.m12021b(TextFieldSizeKt.m12473a(TextFieldScrollKt.m12447c(HeightInLinesModifierKt.m12293a(SizeKt.m10117q(C8767m.f23478j, textFieldState.mo9444h(), 0.0f, 2, (Object) null), p0Var, i3, i4), textFieldScrollerPosition, textFieldValue, a1Var, new CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1(textFieldState)).mo17224k3(mVar).mo17224k3(mVar2), p0Var).mo17224k3(mVar3).mo17224k3(mVar4), dVar);
                        final TextFieldSelectionManager textFieldSelectionManager = textFieldSelectionManager;
                        final TextFieldState textFieldState = textFieldState;
                        final boolean z = z;
                        final boolean z2 = z2;
                        final C11300l<C16260h0, C11079d2> lVar = lVar;
                        final TextFieldValue textFieldValue = textFieldValue;
                        final C16281c0 c0Var = c0Var;
                        final C16479d dVar = dVar2;
                        final int i2 = i4;
                        SimpleLayoutKt.m12856a(b, C8553b.m31048b(oVar, -363167407, true, new C11304p<C8592o, Integer, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C8592o) obj, ((Number) obj2).intValue());
                                return C11079d2.f28267a;
                            }

                            @C8540g
                            @C8570j(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(@C12580l C8592o oVar, int i) {
                                if ((i & 11) != 2 || !oVar.mo15011p()) {
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29845w0(-363167407, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:589)");
                                    }
                                    final TextFieldState textFieldState = textFieldState;
                                    final C11300l<C16260h0, C11079d2> lVar = lVar;
                                    final TextFieldValue textFieldValue = textFieldValue;
                                    final C16281c0 c0Var = c0Var;
                                    final C16479d dVar = dVar;
                                    final int i2 = i2;
                                    C27072 r3 = new C15560f0() {
                                        @C12579k
                                        /* renamed from: a */
                                        public C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
                                            C8646f p;
                                            C16260h0 h0Var2;
                                            int i;
                                            Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
                                            Intrinsics.checkNotNullParameter(list, "measurables");
                                            C8646f.C8647a aVar = C8646f.f23196e;
                                            TextFieldState textFieldState = textFieldState;
                                            C8646f a = aVar.mo16621a();
                                            try {
                                                p = a.mo16617p();
                                                C2851y g = textFieldState.mo9443g();
                                                if (g != null) {
                                                    h0Var2 = g.mo9930i();
                                                } else {
                                                    h0Var2 = null;
                                                }
                                                a.mo16619w(p);
                                                a.mo16415d();
                                                Triple<Integer, Integer, C16260h0> c = TextFieldDelegate.f7187a.mo9368c(textFieldState.mo9454r(), j, h0Var.getLayoutDirection(), h0Var2);
                                                int intValue = c.mo21867a().intValue();
                                                int intValue2 = c.mo21868b().intValue();
                                                C16260h0 c2 = c.mo21869c();
                                                if (!Intrinsics.areEqual((Object) h0Var2, (Object) c2)) {
                                                    textFieldState.mo9461y(new C2851y(c2));
                                                    lVar.invoke(c2);
                                                    CoreTextFieldKt.m12257l(textFieldState, textFieldValue, c0Var);
                                                }
                                                TextFieldState textFieldState2 = textFieldState;
                                                C16479d dVar = dVar;
                                                if (i2 == 1) {
                                                    i = C2787s.m12663a(c2.mo47059m(0));
                                                } else {
                                                    i = 0;
                                                }
                                                textFieldState2.mo9462z(dVar.mo7416L(i));
                                                return h0Var.mo8741C3(intValue, intValue2, C10977s0.m41456W(C11078d1.m42659a(AlignmentLineKt.m68885a(), Integer.valueOf(C11409d.m43851L0(c2.mo47053h()))), C11078d1.m42659a(AlignmentLineKt.m68886b(), Integer.valueOf(C11409d.m43851L0(c2.mo47057k())))), CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2.f7100f);
                                            } catch (Throwable th) {
                                                a.mo16415d();
                                                throw th;
                                            }
                                        }

                                        /* renamed from: b */
                                        public int mo6398b(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
                                            Intrinsics.checkNotNullParameter(mVar, "<this>");
                                            Intrinsics.checkNotNullParameter(list, "measurables");
                                            textFieldState.mo9454r().mo9581q(mVar.getLayoutDirection());
                                            return textFieldState.mo9454r().mo9569d();
                                        }
                                    };
                                    oVar.mo14918M(-1323940314);
                                    C8767m.C8768a aVar = C8767m.f23478j;
                                    C16479d dVar2 = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
                                    LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
                                    C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
                                    ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                                    C11289a<ComposeUiNode> a = companion.mo44585a();
                                    C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
                                    if (!(oVar.mo15017r() instanceof C8428d)) {
                                        ComposablesKt.m29519n();
                                    }
                                    oVar.mo14938T();
                                    if (oVar.mo14997l()) {
                                        oVar.mo14947W(a);
                                    } else {
                                        oVar.mo14888A();
                                    }
                                    C8592o b = Updater.m30180b(oVar);
                                    Updater.m30188j(b, r3, companion.mo44588d());
                                    Updater.m30188j(b, dVar2, companion.mo44586b());
                                    Updater.m30188j(b, layoutDirection, companion.mo44587c());
                                    Updater.m30188j(b, c4Var, companion.mo44590f());
                                    boolean z = false;
                                    f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
                                    oVar.mo14918M(2058660585);
                                    oVar.mo15002m0();
                                    oVar.mo14896D();
                                    oVar.mo15002m0();
                                    TextFieldSelectionManager textFieldSelectionManager = textFieldSelectionManager;
                                    if (textFieldState.mo9439c() == HandleState.Selection && textFieldState.mo9442f() != null) {
                                        C15588o f2 = textFieldState.mo9442f();
                                        Intrinsics.checkNotNull(f2);
                                        if (f2.mo44436k() && z) {
                                            z = true;
                                        }
                                    }
                                    CoreTextFieldKt.m12248c(textFieldSelectionManager, z, oVar, 8);
                                    if (textFieldState.mo9439c() == HandleState.Cursor && !z2 && z) {
                                        CoreTextFieldKt.m12249d(textFieldSelectionManager, oVar, 8);
                                    }
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29843v0();
                                        return;
                                    }
                                    return;
                                }
                                oVar.mo14958a0();
                            }
                        }), oVar, 48, 0);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            };
            C8592o oVar3 = oVar;
            qVar.invoke(C8553b.m31048b(oVar3, 2032502107, true, r3), oVar3, Integer.valueOf(((this.$$dirty1 >> 12) & 112) | 6));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
