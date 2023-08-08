package kotlinx.coroutines.internal;

import kotlin.C11076d0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ExceptionsConstructorKt$safeCtor$1 extends Lambda implements C11300l<Throwable, Throwable> {
    final /* synthetic */ C11300l<Throwable, Throwable> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExceptionsConstructorKt$safeCtor$1(C11300l<? super Throwable, ? extends Throwable> lVar) {
        super(1);
        this.$block = lVar;
    }

    @C12580l
    /* renamed from: a */
    public final Throwable invoke(@C12579k Throwable th) {
        Object obj;
        C11300l<Throwable, Throwable> lVar = this.$block;
        Throwable th2 = null;
        try {
            Result.C10852a aVar = Result.f28060a;
            Throwable invoke = lVar.invoke(th);
            if (!Intrinsics.areEqual((Object) th.getMessage(), (Object) invoke.getMessage()) && !Intrinsics.areEqual((Object) invoke.getMessage(), (Object) th.toString())) {
                invoke = null;
            }
            obj = Result.m38702b(invoke);
        } catch (Throwable th3) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th3));
        }
        if (!Result.m38709i(obj)) {
            th2 = obj;
        }
        return th2;
    }
}
