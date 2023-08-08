package androidx.compose.material3;

import android.view.View;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.node.C15695i1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1058:1\n50#2:1059\n49#2:1060\n1114#3,6:1061\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2\n*L\n132#1:1059\n132#1:1060\n132#1:1061,6\n*E\n"})
/* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2 */
public final class C8024x44cc52d6 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C15695i1<C15588o> $coordinates;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ C8700z0<Integer> $menuHeight$delegate;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onExpandedChange;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;
    final /* synthetic */ C8700z0<Integer> $width$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8024x44cc52d6(boolean z, C11300l<? super Boolean, C11079d2> lVar, int i, FocusRequester focusRequester, C15695i1<C15588o> i1Var, View view, int i2, C8700z0<Integer> z0Var, C8700z0<Integer> z0Var2) {
        super(3);
        this.$expanded = z;
        this.$onExpandedChange = lVar;
        this.$$dirty = i;
        this.$focusRequester = focusRequester;
        this.$coordinates = i1Var;
        this.$view = view;
        this.$verticalMarginInPx = i2;
        this.$width$delegate = z0Var;
        this.$menuHeight$delegate = z0Var2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.C8767m mo11563a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r18, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r10 = r19
            java.lang.String r2 = "$this$composed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 1714866713(0x6636ca19, float:2.1579969E23)
            r10.mo14918M(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x001f
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:118)"
            r5 = r20
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r5, r3, r4)
        L_0x001f:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$1 r2 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$1
            androidx.compose.ui.node.i1<androidx.compose.ui.layout.o> r12 = r0.$coordinates
            android.view.View r13 = r0.$view
            int r14 = r0.$verticalMarginInPx
            androidx.compose.runtime.z0<java.lang.Integer> r15 = r0.$width$delegate
            androidx.compose.runtime.z0<java.lang.Integer> r3 = r0.$menuHeight$delegate
            r11 = r2
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            androidx.compose.ui.m r1 = androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt.m68999a(r1, r2)
            boolean r2 = r0.$expanded
            kotlin.jvm.functions.l<java.lang.Boolean, kotlin.d2> r3 = r0.$onExpandedChange
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            kotlin.jvm.functions.l<java.lang.Boolean, kotlin.d2> r5 = r0.$onExpandedChange
            boolean r6 = r0.$expanded
            r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.mo14918M(r7)
            boolean r3 = r10.mo15006n0(r3)
            boolean r4 = r10.mo15006n0(r4)
            r3 = r3 | r4
            java.lang.Object r4 = r19.mo14921N()
            if (r3 != 0) goto L_0x005e
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x0066
        L_0x005e:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1 r4 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1
            r4.<init>(r5, r6)
            r10.mo14893C(r4)
        L_0x0066:
            r19.mo15002m0()
            r3 = r4
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            r4 = 0
            r5 = 0
            r6 = 0
            int r7 = r0.$$dirty
            int r7 = r7 << 3
            r8 = r7 & 112(0x70, float:1.57E-43)
            r9 = 28
            r7 = r19
            androidx.compose.ui.m r1 = androidx.compose.material3.ExposedDropdownMenuKt.m25783m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.focus.FocusRequester r2 = r0.$focusRequester
            androidx.compose.ui.m r1 = androidx.compose.p004ui.focus.C15083v.m64810a(r1, r2)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x008c
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x008c:
            r19.mo15002m0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C8024x44cc52d6.mo11563a(androidx.compose.ui.m, androidx.compose.runtime.o, int):androidx.compose.ui.m");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo11563a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
