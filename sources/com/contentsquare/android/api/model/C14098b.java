package com.contentsquare.android.api.model;

import com.contentsquare.android.sdk.C14358g3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.api.model.b */
public final class C14098b extends C14100c {

    /* renamed from: g */
    public static final String f34867g = "cs-empty";

    /* renamed from: h */
    public static final int f34868h = 255;

    /* renamed from: i */
    public static final C14099a f34869i = new C14099a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public final String f34870f;

    /* renamed from: com.contentsquare.android.api.model.b$a */
    public static final class C14099a {
        public C14099a() {
        }

        public /* synthetic */ C14099a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14098b(String str, String str2) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "value");
        if (C14358g3.m61811e(str2)) {
            C14100c.f34874e.mo34345a().mo35679i("Dynamic Variable value is empty. Dynamic Variable is sent but the value is set to \"%s\"", "cs-empty");
            this.f34870f = "cs-empty";
        } else if (str2.length() > 255) {
            C14100c.f34874e.mo34345a().mo35679i("Dynamic Variable value is too long: the current input has a length of %d while the limit is %d. Dynamic Variable is sent but the value truncated", Integer.valueOf(str2.length()), 255);
            String substring = str2.substring(0, 255);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            this.f34870f = substring;
        } else {
            this.f34870f = str2;
        }
    }

    /* renamed from: d */
    public final String mo34343d() {
        return this.f34870f;
    }
}
