package androidx.compose.p004ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.platform.e */
public final class C15871e implements C15851b {
    @C12579k

    /* renamed from: b */
    public static final C15872a f39522b = new C15872a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: c */
    public static final int f39523c = 1;
    @Deprecated

    /* renamed from: d */
    public static final int f39524d = 2;
    @Deprecated

    /* renamed from: e */
    public static final int f39525e = 4;
    @C12579k

    /* renamed from: a */
    public final AccessibilityManager f39526a;

    /* renamed from: androidx.compose.ui.platform.e$a */
    public static final class C15872a {
        public /* synthetic */ C15872a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15872a() {
        }
    }

    public C15871e(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f39526a = (AccessibilityManager) systemService;
    }

    /* renamed from: b */
    public long mo45677b(long j, boolean z, boolean z2, boolean z3) {
        if (j >= 2147483647L) {
            return j;
        }
        if (z2) {
            z |= true;
        }
        if (z3) {
            z |= true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int a = C15879f0.f39530a.mo45725a(this.f39526a, (int) j, z ? 1 : 0);
            if (a != Integer.MAX_VALUE) {
                return (long) a;
            }
        } else if (!z3 || !this.f39526a.isTouchExplorationEnabled()) {
            return j;
        }
        return Long.MAX_VALUE;
    }
}
