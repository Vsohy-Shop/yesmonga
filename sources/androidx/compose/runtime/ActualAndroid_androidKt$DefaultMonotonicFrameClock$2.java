package androidx.compose.runtime;

import android.os.Looper;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/runtime/v0;", "a", "()Landroidx/compose/runtime/v0;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 extends Lambda implements C11289a<C8686v0> {

    /* renamed from: f */
    public static final ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 f22551f = new ActualAndroid_androidKt$DefaultMonotonicFrameClock$2();

    public ActualAndroid_androidKt$DefaultMonotonicFrameClock$2() {
        super(0);
    }

    @C12579k
    /* renamed from: a */
    public final C8686v0 invoke() {
        if (Looper.getMainLooper() != null) {
            return DefaultChoreographerFrameClock.f22659a;
        }
        return SdkStubsFallbackFrameClock.f22749a;
    }
}
