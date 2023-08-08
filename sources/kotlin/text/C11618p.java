package kotlin.text;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11097g2;
import kotlin.C11395k;
import kotlin.C11429q;
import kotlin.C11587t0;
import kotlin.C11665v0;
import kotlin.DeprecationLevel;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
/* renamed from: kotlin.text.p */
public class C11618p extends C11617o {
    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: A */
    public static final StringBuilder m45259A(StringBuilder sb, int i) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(i);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: B */
    public static final StringBuilder m45260B(StringBuilder sb, long j) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(j);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: C */
    public static final StringBuilder m45261C(StringBuilder sb, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: D */
    public static final StringBuilder m45262D(StringBuilder sb, Object obj) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(obj);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: E */
    public static final StringBuilder m45263E(StringBuilder sb, String str) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(str);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: F */
    public static final StringBuilder m45264F(StringBuilder sb, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(stringBuffer);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: G */
    public static final StringBuilder m45265G(StringBuilder sb, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(sb2);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: H */
    public static final StringBuilder m45266H(StringBuilder sb, short s) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(s);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value.toInt())");
        return appendln(sb);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: I */
    public static final StringBuilder m45267I(StringBuilder sb, boolean z) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(z);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: J */
    public static final StringBuilder m45268J(StringBuilder sb, char[] cArr) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(cArr, "value");
        sb.append(cArr);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: K */
    public static final StringBuilder m45269K(StringBuilder sb, int i) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder deleteCharAt = sb.deleteCharAt(i);
        Intrinsics.checkNotNullExpressionValue(deleteCharAt, "this.deleteCharAt(index)");
        return deleteCharAt;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: L */
    public static final StringBuilder m45270L(StringBuilder sb, int i, int i2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder delete = sb.delete(i, i2);
        Intrinsics.checkNotNullExpressionValue(delete, "this.delete(startIndex, endIndex)");
        return delete;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: M */
    public static final StringBuilder m45271M(StringBuilder sb, int i, CharSequence charSequence, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "value");
        StringBuilder insert = sb.insert(i, charSequence, i2, i3);
        Intrinsics.checkNotNullExpressionValue(insert, "this.insert(index, value, startIndex, endIndex)");
        return insert;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: N */
    public static final StringBuilder m45272N(StringBuilder sb, int i, char[] cArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(cArr, "value");
        StringBuilder insert = sb.insert(i, cArr, i2, i3 - i2);
        Intrinsics.checkNotNullExpressionValue(insert, "this.insert(index, value…x, endIndex - startIndex)");
        return insert;
    }

    @C11110f
    /* renamed from: O */
    public static final void m45273O(StringBuilder sb, int i, char c) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.setCharAt(i, c);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: P */
    public static final StringBuilder m45274P(StringBuilder sb, int i, int i2, String str) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(str, "value");
        StringBuilder replace = sb.replace(i, i2, str);
        Intrinsics.checkNotNullExpressionValue(replace, "this.replace(startIndex, endIndex, value)");
        return replace;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: Q */
    public static final void m45275Q(StringBuilder sb, char[] cArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(cArr, FirebaseAnalytics.C32532b.f78977z);
        sb.getChars(i2, i3, cArr, i);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine()", imports = {}))
    @C12579k
    public static final Appendable appendln(@C12579k Appendable appendable) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(C11624v.f28893b);
        Intrinsics.checkNotNullExpressionValue(append, "append(SystemProperties.LINE_SEPARATOR)");
        return append;
    }

    @C11665v0(version = "1.3")
    @C12579k
    public static final StringBuilder clear(@C12579k StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: k */
    public static final StringBuilder m45276k(StringBuilder sb, byte b) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(b);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value.toInt())");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: l */
    public static final StringBuilder m45277l(StringBuilder sb, double d) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(d);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: m */
    public static final StringBuilder m45278m(StringBuilder sb, float f) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(f);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: n */
    public static final StringBuilder m45279n(StringBuilder sb, int i) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(i);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: o */
    public static final StringBuilder m45280o(StringBuilder sb, long j) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(j);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: p */
    public static final StringBuilder m45281p(StringBuilder sb, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(stringBuffer);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: q */
    public static final StringBuilder m45282q(StringBuilder sb, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(sb2);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: r */
    public static final StringBuilder m45283r(StringBuilder sb, short s) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(s);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value.toInt())");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: s */
    public static final StringBuilder m45284s(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "value");
        sb.append(charSequence, i, i2);
        Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
        return sb;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: t */
    public static final StringBuilder m45285t(StringBuilder sb, char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(cArr, "value");
        sb.append(cArr, i, i2 - i);
        Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, start…x, endIndex - startIndex)");
        return sb;
    }

    public static /* synthetic */ void toCharArray$default(StringBuilder sb, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sb.length();
        }
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(cArr, FirebaseAnalytics.C32532b.f78977z);
        sb.getChars(i2, i3, cArr, i);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: u */
    public static final Appendable m45286u(Appendable appendable, char c) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(c);
        Intrinsics.checkNotNullExpressionValue(append, "append(value)");
        return appendln(append);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: v */
    public static final Appendable m45287v(Appendable appendable, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(append, "append(value)");
        return appendln(append);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: w */
    public static final StringBuilder m45288w(StringBuilder sb, byte b) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(b);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value.toInt())");
        return appendln(sb);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: x */
    public static final StringBuilder m45289x(StringBuilder sb, char c) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(c);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: y */
    public static final StringBuilder m45290y(StringBuilder sb, double d) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(d);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine(value)", imports = {}))
    @C11110f
    /* renamed from: z */
    public static final StringBuilder m45291z(StringBuilder sb, float f) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(f);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @C11587t0(expression = "appendLine()", imports = {}))
    @C12579k
    public static final StringBuilder appendln(@C12579k StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(C11624v.f28893b);
        Intrinsics.checkNotNullExpressionValue(sb, "append(SystemProperties.LINE_SEPARATOR)");
        return sb;
    }
}
