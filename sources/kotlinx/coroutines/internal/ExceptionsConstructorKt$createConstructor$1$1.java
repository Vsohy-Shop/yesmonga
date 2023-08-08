package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "E", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ExceptionsConstructorKt$createConstructor$1$1 extends Lambda implements C11300l<Throwable, Throwable> {
    final /* synthetic */ Constructor<?> $constructor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExceptionsConstructorKt$createConstructor$1$1(Constructor<?> constructor) {
        super(1);
        this.$constructor = constructor;
    }

    @C12579k
    /* renamed from: a */
    public final Throwable invoke(@C12579k Throwable th) {
        Object newInstance = this.$constructor.newInstance(new Object[]{th.getMessage(), th});
        Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) newInstance;
    }
}
