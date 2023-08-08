package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.input.PlatformTextInputPluginRegistryImpl;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12076o2;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$rememberAdapter$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,335:1\n62#2,5:336\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$rememberAdapter$1\n*L\n174#1:336,5\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1 */
public final class PlatformTextInputPluginRegistryImpl$rememberAdapter$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ PlatformTextInputPluginRegistryImpl.C16264a<T> $adapterHandle;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ PlatformTextInputPluginRegistryImpl this$0;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$rememberAdapter$1\n*L\n1#1,483:1\n175#2,5:484\n190#2,3:489\n*E\n"})
    /* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1$a */
    public static final class C16267a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ PlatformTextInputPluginRegistryImpl.C16264a f40408a;

        /* renamed from: b */
        public final /* synthetic */ C12074o0 f40409b;

        /* renamed from: c */
        public final /* synthetic */ PlatformTextInputPluginRegistryImpl f40410c;

        public C16267a(PlatformTextInputPluginRegistryImpl.C16264a aVar, C12074o0 o0Var, PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl) {
            this.f40408a = aVar;
            this.f40409b = o0Var;
            this.f40410c = platformTextInputPluginRegistryImpl;
        }

        /* renamed from: g */
        public void mo791g() {
            if (this.f40408a.mo47096a()) {
                C11723c2 unused = C12038j.m48061f(this.f40409b, C12076o2.f29720b, (CoroutineStart) null, new PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1(this.f40410c, (C11045c<? super PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1>) null), 2, (Object) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlatformTextInputPluginRegistryImpl$rememberAdapter$1(PlatformTextInputPluginRegistryImpl.C16264a<T> aVar, C12074o0 o0Var, PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl) {
        super(1);
        this.$adapterHandle = aVar;
        this.$scope = o0Var;
        this.this$0 = platformTextInputPluginRegistryImpl;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        return new C16267a(this.$adapterHandle, this.$scope, this.this$0);
    }
}
