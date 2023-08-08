package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 176)
@C11363r0({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ReusableComposeNode$1\n*L\n1#1,484:1\n*E\n"})
public final class ComposablesKt$ReusableComposeNode$1 extends Lambda implements C11289a<T> {
    final /* synthetic */ C11289a<T> $factory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposablesKt$ReusableComposeNode$1(C11289a<? extends T> aVar) {
        super(0);
        this.$factory = aVar;
    }

    @C12579k
    public final T invoke() {
        return this.$factory.invoke();
    }
}
