package com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension;

import java.util.regex.Pattern;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/regex/Pattern;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.extension.BasketResponseKt$pattern$2 */
public final class BasketResponseKt$pattern$2 extends Lambda implements C11289a<Pattern> {

    /* renamed from: f */
    public static final BasketResponseKt$pattern$2 f33839f = new BasketResponseKt$pattern$2();

    public BasketResponseKt$pattern$2() {
        super(0);
    }

    /* renamed from: a */
    public final Pattern invoke() {
        return Pattern.compile("\"error_code\"\\s*:\\s*[\"]*(\\d+)[\"]*", 2);
    }
}
