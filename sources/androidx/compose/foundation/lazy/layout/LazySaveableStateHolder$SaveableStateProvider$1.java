package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,106:1\n62#2,5:107\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$1\n*L\n87#1:107,5\n*E\n"})
public final class LazySaveableStateHolder$SaveableStateProvider$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ Object $key;
    final /* synthetic */ LazySaveableStateHolder this$0;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$1\n*L\n1#1,484:1\n88#2,2:485\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$1$a */
    public static final class C2535a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ LazySaveableStateHolder f6709a;

        /* renamed from: b */
        public final /* synthetic */ Object f6710b;

        public C2535a(LazySaveableStateHolder lazySaveableStateHolder, Object obj) {
            this.f6709a = lazySaveableStateHolder;
            this.f6710b = obj;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f6709a.f6707c.add(this.f6710b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolder$SaveableStateProvider$1(LazySaveableStateHolder lazySaveableStateHolder, Object obj) {
        super(1);
        this.this$0 = lazySaveableStateHolder;
        this.$key = obj;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        this.this$0.f6707c.remove(this.$key);
        return new C2535a(this.this$0, this.$key);
    }
}
