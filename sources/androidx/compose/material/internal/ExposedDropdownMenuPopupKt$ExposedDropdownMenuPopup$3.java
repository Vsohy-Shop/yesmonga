package androidx.compose.material.internal;

import androidx.compose.p004ui.window.C16546g;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nExposedDropdownMenuPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,475:1\n62#2,5:476\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3\n*L\n144#1:476,5\n*E\n"})
public final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ PopupLayout $popupLayout;
    final /* synthetic */ C16546g $popupPositionProvider;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ExposedDropdownMenuPopup.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3\n*L\n1#1,484:1\n144#2:485\n*E\n"})
    /* renamed from: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3$a */
    public static final class C7863a implements C8430d0 {
        /* renamed from: g */
        public void mo791g() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3(PopupLayout popupLayout, C16546g gVar) {
        super(1);
        this.$popupLayout = popupLayout;
        this.$popupPositionProvider = gVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        this.$popupLayout.setPositionProvider(this.$popupPositionProvider);
        this.$popupLayout.mo10837u();
        return new C7863a();
    }
}
