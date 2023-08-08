package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.text.d */
public final class C11602d {
    @C12579k

    /* renamed from: a */
    public static final C11602d f28867a = new C11602d();
    @C12579k
    @C11287e

    /* renamed from: b */
    public static final Charset f28868b;
    @C12579k
    @C11287e

    /* renamed from: c */
    public static final Charset f28869c;
    @C12579k
    @C11287e

    /* renamed from: d */
    public static final Charset f28870d;
    @C12579k
    @C11287e

    /* renamed from: e */
    public static final Charset f28871e;
    @C12579k
    @C11287e

    /* renamed from: f */
    public static final Charset f28872f;
    @C12579k
    @C11287e

    /* renamed from: g */
    public static final Charset f28873g;
    @C12580l

    /* renamed from: h */
    public static volatile Charset f28874h;
    @C12580l

    /* renamed from: i */
    public static volatile Charset f28875i;
    @C12580l

    /* renamed from: j */
    public static volatile Charset f28876j;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
        f28868b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        Intrinsics.checkNotNullExpressionValue(forName2, "forName(\"UTF-16\")");
        f28869c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        Intrinsics.checkNotNullExpressionValue(forName3, "forName(\"UTF-16BE\")");
        f28870d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        Intrinsics.checkNotNullExpressionValue(forName4, "forName(\"UTF-16LE\")");
        f28871e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        Intrinsics.checkNotNullExpressionValue(forName5, "forName(\"US-ASCII\")");
        f28872f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue(forName6, "forName(\"ISO-8859-1\")");
        f28873g = forName6;
    }

    @C11314h(name = "UTF32")
    @C12579k
    /* renamed from: a */
    public final Charset mo23371a() {
        Charset charset = f28874h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-32\")");
        f28874h = forName;
        return forName;
    }

    @C11314h(name = "UTF32_BE")
    @C12579k
    /* renamed from: b */
    public final Charset mo23372b() {
        Charset charset = f28876j;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-32BE\")");
        f28876j = forName;
        return forName;
    }

    @C11314h(name = "UTF32_LE")
    @C12579k
    /* renamed from: c */
    public final Charset mo23373c() {
        Charset charset = f28875i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-32LE\")");
        f28875i = forName;
        return forName;
    }
}
