package androidx.compose.material3.internal;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ PopupLayout f20196a;

    /* renamed from: b */
    public final /* synthetic */ LayoutDirection f20197b;

    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6(PopupLayout popupLayout, LayoutDirection layoutDirection) {
        this.f20196a = popupLayout;
        this.f20197b = layoutDirection;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$Layout");
        Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
        this.f20196a.setParentLayoutDirection(this.f20197b);
        return C15568h0.m69206r2(h0Var, 0, 0, (Map) null, ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1.f20198f, 4, (Object) null);
    }
}
