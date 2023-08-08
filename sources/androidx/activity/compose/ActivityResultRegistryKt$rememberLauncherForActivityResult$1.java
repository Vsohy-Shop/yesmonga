package androidx.activity.compose;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0263a;
import androidx.activity.result.contract.C0266a;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,161:1\n62#2,5:162\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n*L\n108#1:162,5\n*E\n"})
public final class ActivityResultRegistryKt$rememberLauncherForActivityResult$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ ActivityResultRegistry $activityResultRegistry;
    final /* synthetic */ C0266a<I, O> $contract;
    final /* synthetic */ C8578k2<C11300l<O, C11079d2>> $currentOnResult;
    final /* synthetic */ String $key;
    final /* synthetic */ C0226b<I> $realLauncher;

    /* renamed from: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$a */
    public static final class C0218a implements C0263a<O> {

        /* renamed from: a */
        public final /* synthetic */ C8578k2<C11300l<O, C11079d2>> f701a;

        public C0218a(C8578k2<? extends C11300l<? super O, C11079d2>> k2Var) {
            this.f701a = k2Var;
        }

        /* renamed from: a */
        public final void mo790a(O o) {
            this.f701a.getValue().invoke(o);
        }
    }

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n*L\n1#1,483:1\n109#2,2:484\n*E\n"})
    /* renamed from: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$b */
    public static final class C0219b implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C0226b f702a;

        public C0219b(C0226b bVar) {
            this.f702a = bVar;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f702a.mo819d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityResultRegistryKt$rememberLauncherForActivityResult$1(C0226b<I> bVar, ActivityResultRegistry activityResultRegistry, String str, C0266a<I, O> aVar, C8578k2<? extends C11300l<? super O, C11079d2>> k2Var) {
        super(1);
        this.$realLauncher = bVar;
        this.$activityResultRegistry = activityResultRegistry;
        this.$key = str;
        this.$contract = aVar;
        this.$currentOnResult = k2Var;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        this.$realLauncher.mo818c(this.$activityResultRegistry.mo879i(this.$key, this.$contract, new C0218a(this.$currentOnResult)));
        return new C0219b(this.$realLauncher);
    }
}
