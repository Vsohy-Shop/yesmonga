package kotlinx.coroutines.debug;

import android.annotation.SuppressLint;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p010io.C11131a;
import kotlinx.coroutines.debug.internal.C11785a;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import sun.misc.Signal;

@SuppressLint({"all"})
@IgnoreJRERequirement
/* renamed from: kotlinx.coroutines.debug.b */
public final class C11772b {
    @C12579k

    /* renamed from: a */
    public static final C11772b f29190a = new C11772b();

    /* renamed from: b */
    public static final boolean f29191b;

    /* renamed from: kotlinx.coroutines.debug.b$a */
    public static final class C11773a implements ClassFileTransformer {
        @C12579k

        /* renamed from: a */
        public static final C11773a f29192a = new C11773a();

        @C12580l
        /* renamed from: a */
        public byte[] mo23958a(@C12580l ClassLoader classLoader, @C12579k String str, @C12580l Class<?> cls, @C12579k ProtectionDomain protectionDomain, @C12580l byte[] bArr) {
            if (classLoader == null || !Intrinsics.areEqual((Object) str, (Object) "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            C11785a.f29236a.mo24057b(true);
            return C11131a.m42936p(classLoader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    static {
        Object obj;
        boolean z;
        Boolean bool;
        Boolean bool2 = null;
        try {
            Result.C10852a aVar = Result.f28060a;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            if (property != null) {
                bool = Boolean.valueOf(Boolean.parseBoolean(property));
            } else {
                bool = null;
            }
            obj = Result.m38702b(bool);
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        if (!Result.m38709i(obj)) {
            bool2 = obj;
        }
        Boolean bool3 = bool2;
        if (bool3 != null) {
            z = bool3.booleanValue();
        } else {
            z = DebugProbesImpl.f29218a.mo24034u();
        }
        f29191b = z;
    }

    /* renamed from: c */
    public static final void m46796c(Signal signal) {
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.f29218a;
        if (debugProbesImpl.mo23996A()) {
            debugProbesImpl.mo24020f(System.out);
        } else {
            System.out.println("Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @C11384m
    /* renamed from: d */
    public static final void m46797d(@C12580l String str, @C12579k Instrumentation instrumentation) {
        C11785a.f29236a.mo24057b(true);
        instrumentation.addTransformer(C11773a.f29192a);
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.f29218a;
        debugProbesImpl.mo24007L(f29191b);
        debugProbesImpl.mo24038y();
        f29190a.mo23957b();
    }

    /* renamed from: b */
    public final void mo23957b() {
        try {
            Signal.handle(new Signal("TRAP"), new C11771a());
        } catch (Throwable unused) {
        }
    }
}
