package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlinx.coroutines.debug.internal.e */
public final class C11789e {
    /* renamed from: b */
    public static final String m46917b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                sb.append("\\\"");
            } else if (charAt == '\\') {
                sb.append("\\\\");
            } else if (charAt == 8) {
                sb.append("\\b");
            } else if (charAt == 10) {
                sb.append("\\n");
            } else if (charAt == 13) {
                sb.append("\\r");
            } else if (charAt == 9) {
                sb.append("\\t");
            } else {
                sb.append(charAt);
            }
        }
        sb.append('\"');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
