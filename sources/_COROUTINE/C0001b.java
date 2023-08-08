package _COROUTINE;

import com.google.firebase.crashlytics.internal.persistence.C32920e;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCoroutineDebugging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineDebugging.kt\n_COROUTINE/CoroutineDebuggingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
/* renamed from: _COROUTINE.b */
public final class C0001b {
    @C12579k

    /* renamed from: a */
    public static final String f0a = "_COROUTINE";

    /* renamed from: b */
    public static final StackTraceElement m3b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f0a + '.' + str, C32920e.f79928l, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    @C12579k
    /* renamed from: c */
    public static final String m4c() {
        return f0a;
    }
}
