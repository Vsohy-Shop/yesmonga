package androidx.compose.p004ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.core.p027os.C17800k;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11965h;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/coroutines/CoroutineContext;", "a", "()Lkotlin/coroutines/CoroutineContext;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2 */
public final class AndroidUiDispatcher$Companion$Main$2 extends Lambda implements C11289a<CoroutineContext> {

    /* renamed from: f */
    public static final AndroidUiDispatcher$Companion$Main$2 f39305f = new AndroidUiDispatcher$Companion$Main$2();

    public AndroidUiDispatcher$Companion$Main$2() {
        super(0);
    }

    @C12579k
    /* renamed from: a */
    public final CoroutineContext invoke() {
        Choreographer choreographer;
        if (C15853b0.m71259b()) {
            choreographer = Choreographer.getInstance();
        } else {
            choreographer = (Choreographer) C11965h.m47671f(C11768d1.m46783e(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1((C11045c<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1>) null));
        }
        Intrinsics.checkNotNullExpressionValue(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
        Handler a = C17800k.m81188a(Looper.getMainLooper());
        Intrinsics.checkNotNullExpressionValue(a, "createAsync(Looper.getMainLooper())");
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, a, (DefaultConstructorMarker) null);
        return androidUiDispatcher.mo7443Q(androidUiDispatcher.mo45488C0());
    }
}
