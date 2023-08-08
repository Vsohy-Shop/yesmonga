package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.lifecycle.C19499w;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,110:1\n62#2,5:111\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n*L\n105#1:111,5\n*E\n"})
public final class BackHandlerKt$BackHandler$2 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ BackHandlerKt.C0220a $backCallback;
    final /* synthetic */ OnBackPressedDispatcher $backDispatcher;
    final /* synthetic */ C19499w $lifecycleOwner;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n*L\n1#1,483:1\n106#2,2:484\n*E\n"})
    /* renamed from: androidx.activity.compose.BackHandlerKt$BackHandler$2$a */
    public static final class C0221a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ BackHandlerKt.C0220a f705a;

        public C0221a(BackHandlerKt.C0220a aVar) {
            this.f705a = aVar;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f705a.mo968h();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$2(OnBackPressedDispatcher onBackPressedDispatcher, C19499w wVar, BackHandlerKt.C0220a aVar) {
        super(1);
        this.$backDispatcher = onBackPressedDispatcher;
        this.$lifecycleOwner = wVar;
        this.$backCallback = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        this.$backDispatcher.mo764c(this.$lifecycleOwner, this.$backCallback);
        return new C0221a(this.$backCallback);
    }
}
