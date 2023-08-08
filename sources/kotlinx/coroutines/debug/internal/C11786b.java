package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.C12009o0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.debug.internal.b */
public final class C11786b {

    /* renamed from: a */
    public static final int f29238a = -1640531527;

    /* renamed from: b */
    public static final int f29239b = 16;
    @C12579k

    /* renamed from: c */
    public static final C12009o0 f29240c = new C12009o0("REHASH");
    @C12579k

    /* renamed from: d */
    public static final C11792h f29241d = new C11792h((Object) null);
    @C12579k

    /* renamed from: e */
    public static final C11792h f29242e = new C11792h(Boolean.TRUE);

    /* renamed from: d */
    public static final C11792h m46906d(Object obj) {
        if (obj == null) {
            return f29241d;
        }
        if (Intrinsics.areEqual(obj, (Object) Boolean.TRUE)) {
            return f29242e;
        }
        return new C11792h(obj);
    }

    /* renamed from: e */
    public static final Void m46907e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
