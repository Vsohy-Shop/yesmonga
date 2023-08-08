package com.carrefour.fid.android.analytics.data.analytics.firebasemodels;

import java.util.Locale;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\f\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "", "a", "(C)Ljava/lang/CharSequence;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FirebaseModelKt$firebaseFormulated$2 extends Lambda implements C11300l<Character, CharSequence> {

    /* renamed from: f */
    public static final FirebaseModelKt$firebaseFormulated$2 f33572f = new FirebaseModelKt$firebaseFormulated$2();

    public FirebaseModelKt$firebaseFormulated$2() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final CharSequence mo32722a(char c) {
        String valueOf = String.valueOf(c);
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo32722a(((Character) obj).charValue());
    }
}
