package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,767:1\n62#2,5:768\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n*L\n615#1:768,5\n*E\n"})
public final class WindowInsetsHolder$Companion$current$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ WindowInsetsHolder $insets;
    final /* synthetic */ View $view;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n*L\n1#1,483:1\n616#2,2:484\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$a */
    public static final class C2300a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ WindowInsetsHolder f6207a;

        /* renamed from: b */
        public final /* synthetic */ View f6208b;

        public C2300a(WindowInsetsHolder windowInsetsHolder, View view) {
            this.f6207a = windowInsetsHolder;
            this.f6208b = view;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f6207a.mo7889c(this.f6208b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsHolder$Companion$current$1(WindowInsetsHolder windowInsetsHolder, View view) {
        super(1);
        this.$insets = windowInsetsHolder;
        this.$view = view;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        this.$insets.mo7911y(this.$view);
        return new C2300a(this.$insets, this.$view);
    }
}
