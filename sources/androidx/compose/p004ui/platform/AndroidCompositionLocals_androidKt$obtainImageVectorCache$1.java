package androidx.compose.p004ui.platform;

import android.content.Context;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,170:1\n62#2,5:171\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1\n*L\n160#1:171,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1 */
public final class AndroidCompositionLocals_androidKt$obtainImageVectorCache$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ AndroidCompositionLocals_androidKt.C15785a $callbacks;
    final /* synthetic */ Context $context;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1\n*L\n1#1,484:1\n161#2,2:485\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$a */
    public static final class C15792a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ Context f39284a;

        /* renamed from: b */
        public final /* synthetic */ AndroidCompositionLocals_androidKt.C15785a f39285b;

        public C15792a(Context context, AndroidCompositionLocals_androidKt.C15785a aVar) {
            this.f39284a = context;
            this.f39285b = aVar;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f39284a.getApplicationContext().unregisterComponentCallbacks(this.f39285b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(Context context, AndroidCompositionLocals_androidKt.C15785a aVar) {
        super(1);
        this.$context = context;
        this.$callbacks = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        this.$context.getApplicationContext().registerComponentCallbacks(this.$callbacks);
        return new C15792a(this.$context, this.$callbacks);
    }
}
