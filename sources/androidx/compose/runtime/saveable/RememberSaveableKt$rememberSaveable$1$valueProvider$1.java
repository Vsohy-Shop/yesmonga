package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class RememberSaveableKt$rememberSaveable$1$valueProvider$1 extends Lambda implements C11289a<Object> {
    final /* synthetic */ C8624c $registry;
    final /* synthetic */ C8578k2<C8628e<T, Object>> $saverState;
    final /* synthetic */ C8578k2<T> $valueState;

    /* renamed from: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$valueProvider$1$a */
    public static final class C8618a implements C8629f {

        /* renamed from: a */
        public final /* synthetic */ C8624c f23087a;

        public C8618a(C8624c cVar) {
            this.f23087a = cVar;
        }

        /* renamed from: a */
        public final boolean mo16389a(@C12579k Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return this.f23087a.mo8708a(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$rememberSaveable$1$valueProvider$1(C8578k2<? extends C8628e<T, Object>> k2Var, C8578k2<? extends T> k2Var2, C8624c cVar) {
        super(0);
        this.$saverState = k2Var;
        this.$valueState = k2Var2;
        this.$registry = cVar;
    }

    @C12580l
    public final Object invoke() {
        return this.$saverState.getValue().mo16406a(new C8618a(this.$registry), this.$valueState.getValue());
    }
}
