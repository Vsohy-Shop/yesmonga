package kotlin.p010io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "ConsoleKt")
/* renamed from: kotlin.io.c */
public final class C11134c {
    @C11110f
    /* renamed from: a */
    public static final void m42952a(byte b) {
        System.out.print(Byte.valueOf(b));
    }

    @C11110f
    /* renamed from: b */
    public static final void m42953b(char c) {
        System.out.print(c);
    }

    @C11110f
    /* renamed from: c */
    public static final void m42954c(double d) {
        System.out.print(d);
    }

    @C11110f
    /* renamed from: d */
    public static final void m42955d(float f) {
        System.out.print(f);
    }

    @C11110f
    /* renamed from: e */
    public static final void m42956e(int i) {
        System.out.print(i);
    }

    @C11110f
    /* renamed from: f */
    public static final void m42957f(long j) {
        System.out.print(j);
    }

    @C11110f
    /* renamed from: g */
    public static final void m42958g(Object obj) {
        System.out.print(obj);
    }

    @C11110f
    /* renamed from: h */
    public static final void m42959h(short s) {
        System.out.print(Short.valueOf(s));
    }

    @C11110f
    /* renamed from: i */
    public static final void m42960i(boolean z) {
        System.out.print(z);
    }

    @C11110f
    /* renamed from: j */
    public static final void m42961j(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "message");
        System.out.print(cArr);
    }

    @C11110f
    /* renamed from: k */
    public static final void m42962k() {
        System.out.println();
    }

    @C11110f
    /* renamed from: l */
    public static final void m42963l(byte b) {
        System.out.println(Byte.valueOf(b));
    }

    @C11110f
    /* renamed from: m */
    public static final void m42964m(char c) {
        System.out.println(c);
    }

    @C11110f
    /* renamed from: n */
    public static final void m42965n(double d) {
        System.out.println(d);
    }

    @C11110f
    /* renamed from: o */
    public static final void m42966o(float f) {
        System.out.println(f);
    }

    @C11110f
    /* renamed from: p */
    public static final void m42967p(int i) {
        System.out.println(i);
    }

    @C11110f
    /* renamed from: q */
    public static final void m42968q(long j) {
        System.out.println(j);
    }

    @C11110f
    /* renamed from: r */
    public static final void m42969r(Object obj) {
        System.out.println(obj);
    }

    @C11110f
    /* renamed from: s */
    public static final void m42970s(short s) {
        System.out.println(Short.valueOf(s));
    }

    @C11110f
    /* renamed from: t */
    public static final void m42971t(boolean z) {
        System.out.println(z);
    }

    @C11110f
    /* renamed from: u */
    public static final void m42972u(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "message");
        System.out.println(cArr);
    }

    @C12580l
    /* renamed from: v */
    public static final String m42973v() {
        C11159l lVar = C11159l.f28355a;
        InputStream inputStream = System.in;
        Intrinsics.checkNotNullExpressionValue(inputStream, "`in`");
        Charset defaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset()");
        return lVar.mo22627d(inputStream, defaultCharset);
    }

    @C11665v0(version = "1.6")
    @C12579k
    /* renamed from: w */
    public static final String m42974w() {
        String x = m42975x();
        if (x != null) {
            return x;
        }
        throw new ReadAfterEOFException("EOF has already been reached");
    }

    @C12580l
    @C11665v0(version = "1.6")
    /* renamed from: x */
    public static final String m42975x() {
        return m42973v();
    }
}
