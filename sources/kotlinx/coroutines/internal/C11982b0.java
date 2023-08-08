package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12064m2;
import kotlinx.coroutines.C12177y1;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.b0 */
public final class C11982b0 {
    @C12579k

    /* renamed from: a */
    public static final String f29578a = "kotlinx.coroutines.fast.service.loader";

    /* renamed from: b */
    public static final boolean f29579b = true;

    /* renamed from: a */
    public static final C11985c0 m47779a(Throwable th, String str) {
        if (f29579b) {
            return new C11985c0(th, str);
        }
        if (th != null) {
            throw th;
        }
        m47783e();
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static /* synthetic */ C11985c0 m47780b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m47779a(th, str);
    }

    /* renamed from: c */
    public static /* synthetic */ void m47781c() {
    }

    @C12177y1
    /* renamed from: d */
    public static final boolean m47782d(@C12579k C12064m2 m2Var) {
        return m2Var.mo23706a0() instanceof C11985c0;
    }

    @C12579k
    /* renamed from: e */
    public static final Void m47783e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @C12177y1
    @C12579k
    /* renamed from: f */
    public static final C12064m2 m47784f(@C12579k C12033z zVar, @C12579k List<? extends C12033z> list) {
        try {
            return zVar.mo23716b(list);
        } catch (Throwable th) {
            return m47779a(th, zVar.mo23715a());
        }
    }
}
