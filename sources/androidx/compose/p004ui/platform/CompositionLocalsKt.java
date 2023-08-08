package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.autofill.C8713i;
import androidx.compose.p004ui.autofill.C8731z;
import androidx.compose.p004ui.focus.C15068j;
import androidx.compose.p004ui.hapticfeedback.C15425a;
import androidx.compose.p004ui.input.C15432b;
import androidx.compose.p004ui.input.pointer.C15498t;
import androidx.compose.p004ui.node.C15675c1;
import androidx.compose.p004ui.text.C16259h;
import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.input.C16301k0;
import androidx.compose.p004ui.text.input.C16321t0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt */
public final class CompositionLocalsKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<C15851b> f39319a = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalAccessibilityManager$1.f39337f);
    @C12579k

    /* renamed from: b */
    public static final C8550i1<C8713i> f39320b = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalAutofill$1.f39338f);
    @C12579k

    /* renamed from: c */
    public static final C8550i1<C8731z> f39321c = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalAutofillTree$1.f39339f);
    @C12579k

    /* renamed from: d */
    public static final C8550i1<C15912k0> f39322d = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalClipboardManager$1.f39340f);
    @C12579k

    /* renamed from: e */
    public static final C8550i1<C16479d> f39323e = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalDensity$1.f39341f);
    @C12579k

    /* renamed from: f */
    public static final C8550i1<C15068j> f39324f = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalFocusManager$1.f39342f);
    @C12579k

    /* renamed from: g */
    public static final C8550i1<C16238t.C16240b> f39325g = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalFontLoader$1.f39344f);
    @C12579k

    /* renamed from: h */
    public static final C8550i1<C16242u.C16244b> f39326h = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalFontFamilyResolver$1.f39343f);
    @C12579k

    /* renamed from: i */
    public static final C8550i1<C15425a> f39327i = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalHapticFeedback$1.f39345f);
    @C12579k

    /* renamed from: j */
    public static final C8550i1<C15432b> f39328j = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalInputModeManager$1.f39346f);
    @C12579k

    /* renamed from: k */
    public static final C8550i1<LayoutDirection> f39329k = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalLayoutDirection$1.f39347f);
    @C12579k

    /* renamed from: l */
    public static final C8550i1<C16321t0> f39330l = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalTextInputService$1.f39350f);
    @C12579k

    /* renamed from: m */
    public static final C8550i1<C16301k0> f39331m = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalPlatformTextInputPluginRegistry$1.f39348f);
    @C12579k

    /* renamed from: n */
    public static final C8550i1<C15996x3> f39332n = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalTextToolbar$1.f39351f);
    @C12579k

    /* renamed from: o */
    public static final C8550i1<C16007z3> f39333o = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalUriHandler$1.f39352f);
    @C12579k

    /* renamed from: p */
    public static final C8550i1<C15863c4> f39334p = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalViewConfiguration$1.f39353f);
    @C12579k

    /* renamed from: q */
    public static final C8550i1<C15922l4> f39335q = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalWindowInfo$1.f39354f);
    @C12579k

    /* renamed from: r */
    public static final C8550i1<C15498t> f39336r = CompositionLocalKt.m29859e(CompositionLocalsKt$LocalPointerIconService$1.f39349f);

    @C8540g
    @C8544h(scheme = "[0[0]]")
    @C8761g
    /* renamed from: a */
    public static final void m71003a(@C12579k C15675c1 c1Var, @C12579k C16007z3 z3Var, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(c1Var, "owner");
        Intrinsics.checkNotNullParameter(z3Var, "uriHandler");
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(874662829);
        if ((i & 14) == 0) {
            if (o.mo15006n0(c1Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo15006n0(z3Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (o.mo14927P(pVar)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(874662829, i2, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:188)");
            }
            CompositionLocalKt.m29856b(new C8572j1[]{f39319a.mo16141f(c1Var.getAccessibilityManager()), f39320b.mo16141f(c1Var.getAutofill()), f39321c.mo16141f(c1Var.getAutofillTree()), f39322d.mo16141f(c1Var.getClipboardManager()), f39323e.mo16141f(c1Var.getDensity()), f39324f.mo16141f(c1Var.getFocusOwner()), f39325g.mo16142g(c1Var.getFontLoader()), f39326h.mo16142g(c1Var.getFontFamilyResolver()), f39327i.mo16141f(c1Var.getHapticFeedBack()), f39328j.mo16141f(c1Var.getInputModeManager()), f39329k.mo16141f(c1Var.getLayoutDirection()), f39330l.mo16141f(c1Var.getTextInputService()), f39331m.mo16141f(c1Var.getPlatformTextInputPluginRegistry()), f39332n.mo16141f(c1Var.getTextToolbar()), f39333o.mo16141f(z3Var), f39334p.mo16141f(c1Var.getViewConfiguration()), f39335q.mo16141f(c1Var.getWindowInfo()), f39336r.mo16141f(c1Var.getPointerIconService())}, pVar, o, ((i2 >> 3) & 112) | 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CompositionLocalsKt$ProvideCommonCompositionLocals$1(c1Var, z3Var, pVar, i));
        }
    }

    @C12579k
    /* renamed from: c */
    public static final C8550i1<C15851b> m71005c() {
        return f39319a;
    }

    @C8761g
    @C12579k
    /* renamed from: d */
    public static final C8550i1<C8713i> m71006d() {
        return f39320b;
    }

    @C8761g
    /* renamed from: e */
    public static /* synthetic */ void m71007e() {
    }

    @C8761g
    @C12579k
    /* renamed from: f */
    public static final C8550i1<C8731z> m71008f() {
        return f39321c;
    }

    @C8761g
    /* renamed from: g */
    public static /* synthetic */ void m71009g() {
    }

    @C12579k
    /* renamed from: h */
    public static final C8550i1<C15912k0> m71010h() {
        return f39322d;
    }

    @C12579k
    /* renamed from: i */
    public static final C8550i1<C16479d> m71011i() {
        return f39323e;
    }

    @C12579k
    /* renamed from: j */
    public static final C8550i1<C15068j> m71012j() {
        return f39324f;
    }

    @C12579k
    /* renamed from: k */
    public static final C8550i1<C16242u.C16244b> m71013k() {
        return f39326h;
    }

    @C12579k
    /* renamed from: l */
    public static final C8550i1<C16238t.C16240b> m71014l() {
        return f39325g;
    }

    @C11395k(message = "LocalFontLoader is replaced with LocalFontFamilyResolver", replaceWith = @C11587t0(expression = "LocalFontFamilyResolver", imports = {}))
    /* renamed from: m */
    public static /* synthetic */ void m71015m() {
    }

    @C12579k
    /* renamed from: n */
    public static final C8550i1<C15425a> m71016n() {
        return f39327i;
    }

    @C12579k
    /* renamed from: o */
    public static final C8550i1<C15432b> m71017o() {
        return f39328j;
    }

    @C12579k
    /* renamed from: p */
    public static final C8550i1<LayoutDirection> m71018p() {
        return f39329k;
    }

    @C16259h
    @C12579k
    /* renamed from: q */
    public static final C8550i1<C16301k0> m71019q() {
        return f39331m;
    }

    @C16259h
    /* renamed from: r */
    public static /* synthetic */ void m71020r() {
    }

    @C12579k
    /* renamed from: s */
    public static final C8550i1<C15498t> m71021s() {
        return f39336r;
    }

    @C12579k
    /* renamed from: t */
    public static final C8550i1<C16321t0> m71022t() {
        return f39330l;
    }

    @C12579k
    /* renamed from: u */
    public static final C8550i1<C15996x3> m71023u() {
        return f39332n;
    }

    @C12579k
    /* renamed from: v */
    public static final C8550i1<C16007z3> m71024v() {
        return f39333o;
    }

    @C12579k
    /* renamed from: w */
    public static final C8550i1<C15863c4> m71025w() {
        return f39334p;
    }

    @C12579k
    /* renamed from: x */
    public static final C8550i1<C15922l4> m71026x() {
        return f39335q;
    }

    /* renamed from: y */
    public static final Void m71027y(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
