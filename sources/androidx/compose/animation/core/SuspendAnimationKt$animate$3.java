package androidx.compose.animation.core;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"T", "Landroidx/compose/animation/core/o;", "V", "Landroidx/compose/animation/core/f;", "Lkotlin/d2;", "a", "(Landroidx/compose/animation/core/f;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SuspendAnimationKt$animate$3 extends Lambda implements C11300l<C1964f<T, V>, C11079d2> {
    final /* synthetic */ C11304p<T, T, C11079d2> $block;
    final /* synthetic */ C1945a1<T, V> $typeConverter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$3(C11304p<? super T, ? super T, C11079d2> pVar, C1945a1<T, V> a1Var) {
        super(1);
        this.$block = pVar;
        this.$typeConverter = a1Var;
    }

    /* renamed from: a */
    public final void mo6676a(@C12579k C1964f<T, V> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "$this$animate");
        this.$block.invoke(fVar.mo6828g(), this.$typeConverter.mo6793b().invoke(fVar.mo6830i()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo6676a((C1964f) obj);
        return C11079d2.f28267a;
    }
}
