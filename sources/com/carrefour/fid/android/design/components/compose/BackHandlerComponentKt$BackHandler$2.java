package com.carrefour.fid.android.design.components.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.lifecycle.C19499w;
import com.carrefour.fid.android.design.components.compose.BackHandlerComponentKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nBackHandlerComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandlerComponent.kt\ncom/carrefour/fid/android/design/components/compose/BackHandlerComponentKt$BackHandler$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,40:1\n62#2,5:41\n*S KotlinDebug\n*F\n+ 1 BackHandlerComponent.kt\ncom/carrefour/fid/android/design/components/compose/BackHandlerComponentKt$BackHandler$2\n*L\n35#1:41,5\n*E\n"})
public final class BackHandlerComponentKt$BackHandler$2 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;
    final /* synthetic */ C19499w $lifecycleOwner;
    final /* synthetic */ BackHandlerComponentKt.C36916a $onBackPressedCallback;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BackHandlerComponent.kt\ncom/carrefour/fid/android/design/components/compose/BackHandlerComponentKt$BackHandler$2\n*L\n1#1,484:1\n36#2,2:485\n*E\n"})
    /* renamed from: com.carrefour.fid.android.design.components.compose.BackHandlerComponentKt$BackHandler$2$a */
    public static final class C36917a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ BackHandlerComponentKt.C36916a f92091a;

        public C36917a(BackHandlerComponentKt.C36916a aVar) {
            this.f92091a = aVar;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f92091a.mo968h();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackHandlerComponentKt$BackHandler$2(OnBackPressedDispatcher onBackPressedDispatcher, C19499w wVar, BackHandlerComponentKt.C36916a aVar) {
        super(1);
        this.$backPressedDispatcher = onBackPressedDispatcher;
        this.$lifecycleOwner = wVar;
        this.$onBackPressedCallback = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        this.$backPressedDispatcher.mo764c(this.$lifecycleOwner, this.$onBackPressedCallback);
        return new C36917a(this.$onBackPressedCallback);
    }
}
