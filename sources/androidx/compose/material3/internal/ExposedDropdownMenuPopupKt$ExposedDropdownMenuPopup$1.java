package androidx.compose.material3.internal;

import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nExposedDropdownMenuPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,476:1\n62#2,5:477\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1\n*L\n127#1:477,5\n*E\n"})
public final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ C11289a<C11079d2> $onDismissRequest;
    final /* synthetic */ PopupLayout $popupLayout;
    final /* synthetic */ String $testTag;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1\n*L\n1#1,484:1\n128#2,4:485\n*E\n"})
    /* renamed from: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1$a */
    public static final class C8218a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ PopupLayout f20195a;

        public C8218a(PopupLayout popupLayout) {
            this.f20195a = popupLayout;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f20195a.mo45282g();
            this.f20195a.mo12683n();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1(PopupLayout popupLayout, C11289a<C11079d2> aVar, String str, LayoutDirection layoutDirection) {
        super(1);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = aVar;
        this.$testTag = str;
        this.$layoutDirection = layoutDirection;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        this.$popupLayout.mo12688q();
        this.$popupLayout.mo12698t(this.$onDismissRequest, this.$testTag, this.$layoutDirection);
        return new C8218a(this.$popupLayout);
    }
}
