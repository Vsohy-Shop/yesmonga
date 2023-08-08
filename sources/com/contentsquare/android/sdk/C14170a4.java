package com.contentsquare.android.sdk;

import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: com.contentsquare.android.sdk.a4 */
public final class C14170a4 {

    /* renamed from: a */
    public static final C14171a f35040a = new C14171a((DefaultConstructorMarker) null);

    /* renamed from: com.contentsquare.android.sdk.a4$a */
    public static final class C14171a {
        public C14171a() {
        }

        @C11384m
        /* renamed from: a */
        public final String mo34488a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Complex" : "Right" : "Left" : "Down" : "Up";
        }

        @C11384m
        /* renamed from: b */
        public final String mo34489b(String str) {
            Intrinsics.checkNotNullParameter(str, "path");
            String substring = str.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, ">", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }

        public /* synthetic */ C14171a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C11384m
    /* renamed from: a */
    public static final String m60811a(int i) {
        return f35040a.mo34488a(i);
    }

    @C11384m
    /* renamed from: b */
    public static final String m60812b(String str) {
        return f35040a.mo34489b(str);
    }
}
