package kotlinx.coroutines;

import kotlin.jvm.C11287e;
import kotlinx.coroutines.internal.C12009o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.j2 */
public final class C12041j2 {
    @C12579k

    /* renamed from: a */
    public static final C12009o0 f29671a = new C12009o0("COMPLETING_ALREADY");
    @C12579k
    @C11287e

    /* renamed from: b */
    public static final C12009o0 f29672b = new C12009o0("COMPLETING_WAITING_CHILDREN");
    @C12579k

    /* renamed from: c */
    public static final C12009o0 f29673c = new C12009o0("COMPLETING_RETRY");
    @C12579k

    /* renamed from: d */
    public static final C12009o0 f29674d = new C12009o0("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    public static final int f29675e = -1;

    /* renamed from: f */
    public static final int f29676f = 0;

    /* renamed from: g */
    public static final int f29677g = 1;
    @C12579k

    /* renamed from: h */
    public static final C12009o0 f29678h = new C12009o0("SEALED");
    @C12579k

    /* renamed from: i */
    public static final C12040j1 f29679i = new C12040j1(false);
    @C12579k

    /* renamed from: j */
    public static final C12040j1 f29680j = new C12040j1(true);

    @C12580l
    /* renamed from: g */
    public static final Object m48072g(@C12580l Object obj) {
        return obj instanceof C12166w1 ? new C12173x1((C12166w1) obj) : obj;
    }

    @C12580l
    /* renamed from: h */
    public static final Object m48073h(@C12580l Object obj) {
        C12166w1 w1Var;
        C12173x1 x1Var = obj instanceof C12173x1 ? (C12173x1) obj : null;
        return (x1Var == null || (w1Var = x1Var.f29946a) == null) ? obj : w1Var;
    }
}
