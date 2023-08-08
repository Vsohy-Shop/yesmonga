package com.carrefour.fid.android.shared.extension;

import java.util.Arrays;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "eachByte", "", "a", "(B)Ljava/lang/CharSequence;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class StringKt$toHex$1 extends Lambda implements C11300l<Byte, CharSequence> {

    /* renamed from: f */
    public static final StringKt$toHex$1 f70386f = new StringKt$toHex$1();

    public StringKt$toHex$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final CharSequence mo83711a(byte b) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        return format;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo83711a(((Number) obj).byteValue());
    }
}
