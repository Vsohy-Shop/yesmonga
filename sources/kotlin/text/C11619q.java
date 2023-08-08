package kotlin.text;

import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.C11665v0;
import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.text.q */
public class C11619q extends C11618p {
    @C11395k(level = DeprecationLevel.WARNING, message = "Use append(value: Any?) instead", replaceWith = @C11587t0(expression = "append(value = obj)", imports = {}))
    @C11110f
    /* renamed from: R */
    public static final StringBuilder m45292R(StringBuilder sb, Object obj) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(obj);
        Intrinsics.checkNotNullExpressionValue(sb, "this.append(obj)");
        return sb;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use appendRange instead.", replaceWith = @C11587t0(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    @C11110f
    /* renamed from: S */
    public static final StringBuilder m45293S(StringBuilder sb, char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(cArr, "str");
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: T */
    public static final StringBuilder m45294T(StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: U */
    public static final StringBuilder m45295U(StringBuilder sb, char c) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(c);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: V */
    public static final StringBuilder m45296V(StringBuilder sb, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: W */
    public static final StringBuilder m45297W(StringBuilder sb, Object obj) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(obj);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: X */
    public static final StringBuilder m45298X(StringBuilder sb, String str) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(str);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: Y */
    public static final StringBuilder m45299Y(StringBuilder sb, boolean z) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(z);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: Z */
    public static final StringBuilder m45300Z(StringBuilder sb, char[] cArr) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(cArr, "value");
        sb.append(cArr);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: a0 */
    public static final String m45301a0(int i, C11300l<? super StringBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        StringBuilder sb = new StringBuilder(i);
        lVar.invoke(sb);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @C12579k
    public static final StringBuilder append(@C12579k StringBuilder sb, @C12579k String... strArr) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(strArr, "value");
        for (String append : strArr) {
            sb.append(append);
        }
        return sb;
    }

    @C11110f
    /* renamed from: b0 */
    public static final String m45302b0(C11300l<? super StringBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        StringBuilder sb = new StringBuilder();
        lVar.invoke(sb);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @C12579k
    public static final StringBuilder append(@C12579k StringBuilder sb, @C12579k Object... objArr) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "value");
        for (Object append : objArr) {
            sb.append(append);
        }
        return sb;
    }
}
