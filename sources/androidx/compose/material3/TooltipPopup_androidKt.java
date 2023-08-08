package androidx.compose.material3;

import androidx.compose.p004ui.window.AndroidPopup_androidKt;
import androidx.compose.p004ui.window.C16546g;
import androidx.compose.p004ui.window.C16547h;
import androidx.compose.p004ui.window.SecureFlagPolicy;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.load.data.mediastore.C22132b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class TooltipPopup_androidKt {
    @C8251n0
    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m26879a(@C12579k C16546g gVar, @C12579k C11289a<C11079d2> aVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C16546g gVar2 = gVar;
        C11289a<C11079d2> aVar2 = aVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        int i6 = i;
        Intrinsics.checkNotNullParameter(gVar2, "popupPositionProvider");
        Intrinsics.checkNotNullParameter(aVar2, "onDismissRequest");
        Intrinsics.checkNotNullParameter(pVar2, "content");
        C8592o o = oVar.mo15009o(-1507102480);
        if ((i6 & 14) == 0) {
            if (o.mo15006n0(gVar2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo14927P(aVar2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14927P(pVar2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1507102480, i2, -1, "androidx.compose.material3.TooltipPopup (TooltipPopup.android.kt:25)");
            }
            AndroidPopup_androidKt.m74868a(gVar, aVar, new C16547h(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null), pVar, o, (i2 & 14) | C22132b.f56831b | (i2 & 112) | ((i2 << 3) & 7168), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TooltipPopup_androidKt$TooltipPopup$1(gVar2, aVar2, pVar2, i6));
        }
    }
}
