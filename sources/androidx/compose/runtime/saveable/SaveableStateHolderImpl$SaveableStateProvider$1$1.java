package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,142:1\n1#2:143\n62#3,5:144\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1\n*L\n92#1:144,5\n*E\n"})
public final class SaveableStateHolderImpl$SaveableStateProvider$1$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ Object $key;
    final /* synthetic */ SaveableStateHolderImpl.RegistryHolder $registryHolder;
    final /* synthetic */ SaveableStateHolderImpl this$0;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1\n*L\n1#1,484:1\n93#2,3:485\n*E\n"})
    /* renamed from: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$a */
    public static final class C8620a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ SaveableStateHolderImpl.RegistryHolder f23099a;

        /* renamed from: b */
        public final /* synthetic */ SaveableStateHolderImpl f23100b;

        /* renamed from: c */
        public final /* synthetic */ Object f23101c;

        public C8620a(SaveableStateHolderImpl.RegistryHolder registryHolder, SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
            this.f23099a = registryHolder;
            this.f23100b = saveableStateHolderImpl;
            this.f23101c = obj;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f23099a.mo16396d(this.f23100b.f23090a);
            this.f23100b.f23091b.remove(this.f23101c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$SaveableStateProvider$1$1(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, SaveableStateHolderImpl.RegistryHolder registryHolder) {
        super(1);
        this.this$0 = saveableStateHolderImpl;
        this.$key = obj;
        this.$registryHolder = registryHolder;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        boolean z = !this.this$0.f23091b.containsKey(this.$key);
        Object obj = this.$key;
        if (z) {
            this.this$0.f23090a.remove(this.$key);
            this.this$0.f23091b.put(this.$key, this.$registryHolder);
            return new C8620a(this.$registryHolder, this.this$0, this.$key);
        }
        throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
    }
}
