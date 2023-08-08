package androidx.compose.p004ui.platform;

import android.view.View;
import androidx.compose.p004ui.C8762h;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8762h
/* renamed from: androidx.compose.ui.platform.n4 */
public interface C15935n4 {
    @C12579k

    /* renamed from: a */
    public static final C15936a f39623a = C15936a.f39624a;

    /* renamed from: androidx.compose.ui.platform.n4$a */
    public static final class C15936a {

        /* renamed from: a */
        public static final /* synthetic */ C15936a f39624a = new C15936a();
        @C12579k

        /* renamed from: b */
        public static final C15935n4 f39625b = C15937a.f39626b;

        /* renamed from: androidx.compose.ui.platform.n4$a$a */
        public static final class C15937a implements C15935n4 {

            /* renamed from: b */
            public static final C15937a f39626b = new C15937a();

            @C12579k
            /* renamed from: a */
            public final Recomposer mo45851a(@C12579k View view) {
                Intrinsics.checkNotNullParameter(view, "rootView");
                return WindowRecomposer_androidKt.m71144c(view, (CoroutineContext) null, (Lifecycle) null, 3, (Object) null);
            }
        }

        /* renamed from: b */
        public static /* synthetic */ void m71561b() {
        }

        @C12579k
        /* renamed from: a */
        public final C15935n4 mo45852a() {
            return f39625b;
        }
    }

    @C12579k
    /* renamed from: a */
    Recomposer mo45851a(@C12579k View view);
}
