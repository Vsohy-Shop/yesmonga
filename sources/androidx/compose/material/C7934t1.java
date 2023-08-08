package androidx.compose.material;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C3044g0
/* renamed from: androidx.compose.material.t1 */
public interface C7934t1 extends C7930s1 {

    /* renamed from: androidx.compose.material.t1$a */
    public static final class C7935a {
        @C8540g
        @Deprecated
        @C12579k
        /* renamed from: a */
        public static C8578k2<C15240j2> m25319a(@C12579k C7934t1 t1Var, boolean z, boolean z2, @C12579k C2241e eVar, @C12580l C8592o oVar, int i) {
            Intrinsics.checkNotNullParameter(eVar, "interactionSource");
            return C7934t1.super.mo11078d(z, z2, eVar, oVar, i);
        }

        @C8540g
        @Deprecated
        @C12579k
        /* renamed from: b */
        public static C8578k2<C15240j2> m25320b(@C12579k C7934t1 t1Var, boolean z, boolean z2, @C12579k C2241e eVar, @C12580l C8592o oVar, int i) {
            Intrinsics.checkNotNullParameter(eVar, "interactionSource");
            return C7934t1.super.mo10718l(z, z2, eVar, oVar, i);
        }
    }

    @C8540g
    @C12579k
    /* renamed from: d */
    C8578k2<C15240j2> mo11078d(boolean z, boolean z2, @C12579k C2241e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "interactionSource");
        oVar.mo14918M(1279189910);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1279189910, i, -1, "androidx.compose.material.TextFieldColorsWithIcons.leadingIconColor (TextFieldDefaults.kt:160)");
        }
        C8578k2<C15240j2> b = mo10703b(z, z2, oVar, (i & 14) | (i & 112) | ((i >> 3) & 896));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return b;
    }

    @C8540g
    @C12579k
    /* renamed from: l */
    C8578k2<C15240j2> mo10718l(boolean z, boolean z2, @C12579k C2241e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "interactionSource");
        oVar.mo14918M(-712140408);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-712140408, i, -1, "androidx.compose.material.TextFieldColorsWithIcons.trailingIconColor (TextFieldDefaults.kt:177)");
        }
        C8578k2<C15240j2> g = mo10707g(z, z2, oVar, (i & 14) | (i & 112) | ((i >> 3) & 896));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return g;
    }
}
