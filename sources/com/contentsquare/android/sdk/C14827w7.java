package com.contentsquare.android.sdk;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.w7 */
public final class C14827w7 implements C14250c9 {

    /* renamed from: c */
    public static final C14828a f36767c = new C14828a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final String f36768a;

    /* renamed from: b */
    public final String f36769b;

    /* renamed from: com.contentsquare.android.sdk.w7$a */
    public static final class C14828a {
        public C14828a() {
        }

        public /* synthetic */ C14828a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14827w7(C14250c9 c9Var, String str) {
        Intrinsics.checkNotNullParameter(c9Var, "descriptor");
        Intrinsics.checkNotNullParameter(str, "eventWebViewTargetPath");
        this.f36768a = c9Var.mo34854b();
        String a = c9Var.mo34853a();
        this.f36769b = a + "|webview|" + str;
    }

    /* renamed from: a */
    public String mo34853a() {
        return this.f36769b;
    }

    /* renamed from: b */
    public String mo34854b() {
        return this.f36768a;
    }
}
