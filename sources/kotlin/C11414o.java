package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import kotlin.internal.C11109e;
import kotlin.internal.C11110f;
import kotlin.internal.C11125m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.o */
public class C11414o {
    @C11109e
    @C11665v0(version = "1.1")
    /* renamed from: a */
    public static final void m43942a(@C12579k Throwable th, @C12579k Throwable th2) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(th2, "exception");
        if (th != th2) {
            C11125m.f28285a.mo22535a(th, th2);
        }
    }

    @C12579k
    /* renamed from: b */
    public static final StackTraceElement[] m43943b(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNull(stackTrace);
        return stackTrace;
    }

    /* renamed from: c */
    public static /* synthetic */ void m43944c(Throwable th) {
    }

    @C12579k
    /* renamed from: d */
    public static final List<Throwable> m43945d(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return C11125m.f28285a.mo22536d(th);
    }

    @C11665v0(version = "1.4")
    /* renamed from: e */
    public static /* synthetic */ void m43946e(Throwable th) {
    }

    @C11110f
    /* renamed from: f */
    public static final void m43947f(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        th.printStackTrace();
    }

    @C11110f
    /* renamed from: g */
    public static final void m43948g(Throwable th, PrintStream printStream) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(printStream, "stream");
        th.printStackTrace(printStream);
    }

    @C11110f
    /* renamed from: h */
    public static final void m43949h(Throwable th, PrintWriter printWriter) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(printWriter, "writer");
        th.printStackTrace(printWriter);
    }

    @C11665v0(version = "1.4")
    @C12579k
    /* renamed from: i */
    public static final String m43950i(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
