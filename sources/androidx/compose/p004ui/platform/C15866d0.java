package androidx.compose.p004ui.platform;

import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.platform.d0 */
public final class C15866d0 implements C15863c4 {

    /* renamed from: b */
    public static final int f39519b = 8;
    @C12579k

    /* renamed from: a */
    public final ViewConfiguration f39520a;

    public C15866d0(@C12579k ViewConfiguration viewConfiguration) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        this.f39520a = viewConfiguration;
    }

    /* renamed from: a */
    public long mo44718a() {
        return (long) ViewConfiguration.getDoubleTapTimeout();
    }

    /* renamed from: b */
    public long mo44719b() {
        return 40;
    }

    /* renamed from: c */
    public long mo44720c() {
        return (long) ViewConfiguration.getLongPressTimeout();
    }

    /* renamed from: f */
    public float mo44722f() {
        return (float) this.f39520a.getScaledTouchSlop();
    }
}
