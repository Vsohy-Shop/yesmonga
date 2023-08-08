package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.saveable.C8624c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt$rememberSaveable$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,200:1\n62#2,5:201\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt$rememberSaveable$1\n*L\n107#1:201,5\n*E\n"})
public final class RememberSaveableKt$rememberSaveable$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ String $finalKey;
    final /* synthetic */ C8624c $registry;
    final /* synthetic */ C8578k2<C8628e<T, Object>> $saverState;
    final /* synthetic */ C8578k2<T> $valueState;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt$rememberSaveable$1\n*L\n1#1,484:1\n108#2,2:485\n*E\n"})
    /* renamed from: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$a */
    public static final class C8617a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C8624c.C8625a f23086a;

        public C8617a(C8624c.C8625a aVar) {
            this.f23086a = aVar;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f23086a.mo16409a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$rememberSaveable$1(C8624c cVar, String str, C8578k2<? extends C8628e<T, Object>> k2Var, C8578k2<? extends T> k2Var2) {
        super(1);
        this.$registry = cVar;
        this.$finalKey = str;
        this.$saverState = k2Var;
        this.$valueState = k2Var2;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        RememberSaveableKt$rememberSaveable$1$valueProvider$1 rememberSaveableKt$rememberSaveable$1$valueProvider$1 = new RememberSaveableKt$rememberSaveable$1$valueProvider$1(this.$saverState, this.$valueState, this.$registry);
        RememberSaveableKt.m31344e(this.$registry, rememberSaveableKt$rememberSaveable$1$valueProvider$1.invoke());
        return new C8617a(this.$registry.mo8709b(this.$finalKey, rememberSaveableKt$rememberSaveable$1$valueProvider$1));
    }
}
