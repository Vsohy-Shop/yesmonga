package androidx.compose.foundation.layout;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,708:1\n62#2,5:709\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1\n*L\n120#1:709,5\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1 */
public final class C2298x76e50d25 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ WindowInsetsNestedScrollConnection $connection;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1\n*L\n1#1,483:1\n121#2,2:484\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$a */
    public static final class C2299a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ WindowInsetsNestedScrollConnection f6180a;

        public C2299a(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection) {
            this.f6180a = windowInsetsNestedScrollConnection;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f6180a.mo7928u();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2298x76e50d25(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection) {
        super(1);
        this.$connection = windowInsetsNestedScrollConnection;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        return new C2299a(this.$connection);
    }
}
