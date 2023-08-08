package androidx.compose.p004ui.platform;

import android.view.PointerIcon;
import android.view.View;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.input.pointer.C15461a;
import androidx.compose.p004ui.input.pointer.C15463b;
import androidx.compose.p004ui.input.pointer.C15496s;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(24)
/* renamed from: androidx.compose.ui.platform.u */
public final class C15976u {
    @C12579k

    /* renamed from: a */
    public static final C15976u f39677a = new C15976u();

    @C0376v0(24)
    @C0373u
    /* renamed from: a */
    public final void mo45967a(@C12579k View view, @C12580l C15496s sVar) {
        PointerIcon pointerIcon;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        if (sVar instanceof C15461a) {
            pointerIcon = ((C15461a) sVar).mo44020a();
        } else if (sVar instanceof C15463b) {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), ((C15463b) sVar).mo44027a());
            Intrinsics.checkNotNullExpressionValue(pointerIcon, "getSystemIcon(view.context, icon.type)");
        } else {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
            Intrinsics.checkNotNullExpressionValue(pointerIcon, "getSystemIcon(\n         …DEFAULT\n                )");
        }
        if (!Intrinsics.areEqual((Object) view.getPointerIcon(), (Object) pointerIcon)) {
            view.setPointerIcon(pointerIcon);
        }
    }
}
