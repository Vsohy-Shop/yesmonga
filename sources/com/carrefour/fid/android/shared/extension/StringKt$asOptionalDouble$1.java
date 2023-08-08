package com.carrefour.fid.android.shared.extension;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C11620r;
import kotlin.text.C11621s;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/Double;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 String.kt\ncom/carrefour/fid/android/shared/extension/StringKt$asOptionalDouble$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,381:1\n1174#2,2:382\n*S KotlinDebug\n*F\n+ 1 String.kt\ncom/carrefour/fid/android/shared/extension/StringKt$asOptionalDouble$1\n*L\n268#1:382,2\n*E\n"})
public final class StringKt$asOptionalDouble$1 extends Lambda implements C11300l<String, Double> {

    /* renamed from: f */
    public static final StringKt$asOptionalDouble$1 f70384f = new StringKt$asOptionalDouble$1();

    public StringKt$asOptionalDouble$1() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final Double invoke(String str) {
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(str, "it");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (C11621s.toIntOrNull(String.valueOf(charAt)) != null || charAt == '.') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "str.toString()");
        return C11620r.toDoubleOrNull(sb2);
    }
}
