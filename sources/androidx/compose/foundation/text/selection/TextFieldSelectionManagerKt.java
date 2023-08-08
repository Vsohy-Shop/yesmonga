package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C2785r;
import androidx.compose.foundation.text.C2846t;
import androidx.compose.foundation.text.C2851y;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.profileinstaller.C20022q;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,906:1\n50#2:907\n49#2:908\n1114#3,6:909\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n*L\n809#1:907\n809#1:908\n809#1:909,6\n*E\n"})
public final class TextFieldSelectionManagerKt {

    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$a */
    public /* synthetic */ class C2814a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.foundation.text.Handle[] r0 = androidx.compose.foundation.text.Handle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.Cursor     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionStart     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionEnd     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.C2814a.<clinit>():void");
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m12937a(boolean z, @C12579k ResolvedTextDirection resolvedTextDirection, @C12579k TextFieldSelectionManager textFieldSelectionManager, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(resolvedTextDirection, "direction");
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "manager");
        C8592o o = oVar.mo15009o(-1344558920);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1344558920, i, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:803)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        o.mo14918M(511388516);
        boolean n0 = o.mo15006n0(valueOf) | o.mo15006n0(textFieldSelectionManager);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = textFieldSelectionManager.mo9741M(z);
            o.mo14893C(N);
        }
        o.mo15002m0();
        C2846t tVar = (C2846t) N;
        int i2 = i << 3;
        AndroidSelectionHandles_androidKt.m12666c(textFieldSelectionManager.mo9730B(z), z, resolvedTextDirection, C16356n0.m73741m(textFieldSelectionManager.mo9739K().mo47113h()), SuspendingPointerInputFilterKt.m68437c(C8767m.f23478j, tVar, new TextFieldSelectionManagerKt$TextFieldSelectionHandle$1(tVar, (C11045c<? super TextFieldSelectionManagerKt$TextFieldSelectionHandle$1>) null)), (C11304p<? super C8592o, ? super Integer, C11079d2>) null, o, (i2 & 112) | C20022q.C20025c.f51280k | (i2 & 896));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(z, resolvedTextDirection, textFieldSelectionManager, i));
        }
    }

    /* renamed from: b */
    public static final long m12938b(@C12579k TextFieldSelectionManager textFieldSelectionManager, long j) {
        boolean z;
        int i;
        int i2;
        C2851y g;
        C16260h0 i3;
        C2785r r;
        C16156d n;
        C15588o f;
        C2851y g2;
        C15588o c;
        boolean z2;
        TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "manager");
        if (textFieldSelectionManager.mo9739K().mo47115i().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C15094f.f37256b.mo42247c();
        }
        Handle y = textFieldSelectionManager.mo9773y();
        if (y == null) {
            i = -1;
        } else {
            i = C2814a.$EnumSwitchMapping$0[y.ordinal()];
        }
        if (i == -1) {
            return C15094f.f37256b.mo42247c();
        }
        if (i == 1 || i == 2) {
            i2 = C16356n0.m73742n(textFieldSelectionManager.mo9739K().mo47113h());
        } else if (i == 3) {
            i2 = C16356n0.m73737i(textFieldSelectionManager.mo9739K().mo47113h());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int b = textFieldSelectionManager.mo9733E().mo9514b(i2);
        TextFieldState G = textFieldSelectionManager.mo9735G();
        if (G == null || (g = G.mo9443g()) == null || (i3 = g.mo9930i()) == null) {
            return C15094f.f37256b.mo42247c();
        }
        TextFieldState G2 = textFieldSelectionManager.mo9735G();
        if (G2 == null || (r = G2.mo9454r()) == null || (n = r.mo9579n()) == null) {
            return C15094f.f37256b.mo42247c();
        }
        int J = C11479u.m44337J(b, StringsKt__StringsKt.getIndices(n));
        long o = i3.mo47048d(J).mo42275o();
        TextFieldState G3 = textFieldSelectionManager.mo9735G();
        if (G3 == null || (f = G3.mo9442f()) == null) {
            return C15094f.f37256b.mo42247c();
        }
        TextFieldState G4 = textFieldSelectionManager.mo9735G();
        if (G4 == null || (g2 = G4.mo9443g()) == null || (c = g2.mo9926c()) == null) {
            return C15094f.f37256b.mo42247c();
        }
        C15094f w = textFieldSelectionManager.mo9771w();
        if (w == null) {
            return C15094f.f37256b.mo42247c();
        }
        float p = C15094f.m64880p(c.mo44430K(f, w.mo42242A()));
        int q = i3.mo47062q(J);
        int u = i3.mo47067u(q);
        int o2 = i3.mo47061o(q, true);
        if (C16356n0.m73742n(textFieldSelectionManager.mo9739K().mo47113h()) > C16356n0.m73737i(textFieldSelectionManager.mo9739K().mo47113h())) {
            z2 = true;
        } else {
            z2 = false;
        }
        float a = C2845u.m13122a(i3, u, true, z2);
        float a2 = C2845u.m13122a(i3, o2, false, z2);
        float H = C11479u.m44331H(p, Math.min(a, a2), Math.max(a, a2));
        if (Math.abs(p - H) > ((float) (C16500q.m74662m(j) / 2))) {
            return C15094f.f37256b.mo42247c();
        }
        return f.mo44430K(c, C15096g.m64898a(H, C15094f.m64882r(o)));
    }

    /* renamed from: c */
    public static final boolean m12939c(@C12579k TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        C15588o f;
        C15098i f2;
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "<this>");
        TextFieldState G = textFieldSelectionManager.mo9735G();
        if (G == null || (f = G.mo9442f()) == null || (f2 = C2835m.m13098f(f)) == null) {
            return false;
        }
        return C2835m.m13095c(f2, textFieldSelectionManager.mo9730B(z));
    }
}
