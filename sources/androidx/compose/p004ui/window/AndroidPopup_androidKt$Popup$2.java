package androidx.compose.p004ui.window;

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
@C11363r0({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,824:1\n62#2,5:825\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2\n*L\n271#1:825,5\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2 */
public final class AndroidPopup_androidKt$Popup$2 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ C11289a<C11079d2> $onDismissRequest;
    final /* synthetic */ PopupLayout $popupLayout;
    final /* synthetic */ C16547h $properties;
    final /* synthetic */ String $testTag;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2\n*L\n1#1,484:1\n272#2,4:485\n*E\n"})
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$a */
    public static final class C16529a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ PopupLayout f40979a;

        public C16529a(PopupLayout popupLayout) {
            this.f40979a = popupLayout;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f40979a.mo45282g();
            this.f40979a.mo48056p();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$2(PopupLayout popupLayout, C11289a<C11079d2> aVar, C16547h hVar, String str, LayoutDirection layoutDirection) {
        super(1);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = aVar;
        this.$properties = hVar;
        this.$testTag = str;
        this.$layoutDirection = layoutDirection;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        this.$popupLayout.mo48058r();
        this.$popupLayout.mo48066t(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
        return new C16529a(this.$popupLayout);
    }
}
