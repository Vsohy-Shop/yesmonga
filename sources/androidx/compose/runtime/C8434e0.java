package androidx.compose.runtime;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.runtime.e0 */
public final class C8434e0 {

    /* renamed from: a */
    public static final int f22798a = 0;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n*L\n1#1,484:1\n*E\n"})
    /* renamed from: androidx.compose.runtime.e0$a */
    public static final class C8435a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C11289a<C11079d2> f22799a;

        public C8435a(C11289a<C11079d2> aVar) {
            this.f22799a = aVar;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f22799a.invoke();
        }
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 mo15565a(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "onDisposeEffect");
        return new C8435a(aVar);
    }
}
