package p009io.github.aakira.napier;

import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p009io.github.aakira.napier.Napier;

/* renamed from: io.github.aakira.napier.c */
public final class C10848c extends C10846a {

    /* renamed from: c */
    public static final int f28038c = 4000;

    /* renamed from: d */
    public static final int f28039d = 23;

    /* renamed from: e */
    public static final int f28040e = 9;
    @C12579k

    /* renamed from: f */
    public static final C10849a f28041f = new C10849a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final Pattern f28042a;

    /* renamed from: b */
    public final String f28043b;

    /* renamed from: io.github.aakira.napier.c$a */
    public static final class C10849a {
        public C10849a() {
        }

        public /* synthetic */ C10849a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C10848c() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public void mo21818c(@C12579k Napier.Level level, @C12580l String str, @C12580l Throwable th, @C12580l String str2) {
        int min;
        Intrinsics.checkNotNullParameter(level, "priority");
        if (str == null) {
            str = mo21822g(this.f28043b);
        }
        if (str2 != null) {
            if (th != null) {
                str2 = str2 + 10 + mo21821f(th);
            }
        } else if (th == null || (str2 = mo21821f(th)) == null) {
            return;
        }
        int length = str2.length();
        if (length > 4000) {
            int i = 0;
            while (i < length) {
                int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str2, 10, i, false, 4, (Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = length;
                }
                while (true) {
                    min = Math.min(indexOf$default, i + f28038c);
                    String substring = str2.substring(i, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (mo21823h(level) == 7) {
                        Log.wtf(str, substring);
                    } else {
                        Log.println(mo21823h(level), str, substring);
                    }
                    if (min >= indexOf$default) {
                        break;
                    }
                    i = min;
                }
                i = min + 1;
            }
        } else if (level == Napier.Level.ASSERT) {
            Log.wtf(str, str2);
        } else {
            Log.println(mo21823h(level), str, str2);
        }
    }

    @C12579k
    /* renamed from: e */
    public final String mo21820e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "className");
        Matcher matcher = this.f28042a.matcher(str);
        if (matcher.find()) {
            str = matcher.replaceAll("");
            Intrinsics.checkNotNullExpressionValue(str, "m.replaceAll(\"\")");
        }
        int lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, '.', 0, false, 6, (Object) null) + 1;
        if (str != null) {
            String substring = str.substring(lastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            substring.length();
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: f */
    public final String mo21821f(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter(stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "sw.toString()");
        return stringWriter2;
    }

    /* renamed from: g */
    public final String mo21822g(String str) {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        if (stackTrace == null || stackTrace.length < 9) {
            return str;
        }
        StackTraceElement stackTraceElement = stackTrace[9];
        StringBuilder sb = new StringBuilder();
        String className = stackTraceElement.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "className");
        sb.append(mo21820e(className));
        sb.append('$');
        sb.append(stackTraceElement.getMethodName());
        return sb.toString();
    }

    /* renamed from: h */
    public final int mo21823h(Napier.Level level) {
        switch (C10850d.$EnumSwitchMapping$0[level.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public C10848c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "defaultTag");
        this.f28043b = str;
        this.f28042a = Pattern.compile("(\\$\\d+)+$");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10848c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FirebaseMessaging.f80405r : str);
    }
}
