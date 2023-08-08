package androidx.compose.p004ui.window;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8 */
public final class AndroidPopup_androidKt$Popup$8 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ PopupLayout f40981a;

    /* renamed from: b */
    public final /* synthetic */ LayoutDirection f40982b;

    public AndroidPopup_androidKt$Popup$8(PopupLayout popupLayout, LayoutDirection layoutDirection) {
        this.f40981a = popupLayout;
        this.f40982b = layoutDirection;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$Layout");
        Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
        this.f40981a.setParentLayoutDirection(this.f40982b);
        return C15568h0.m69206r2(h0Var, 0, 0, (Map) null, AndroidPopup_androidKt$Popup$8$measure$1.f40983f, 4, (Object) null);
    }
}
