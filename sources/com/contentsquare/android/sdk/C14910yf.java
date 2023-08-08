package com.contentsquare.android.sdk;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.yf */
public final class C14910yf implements C14250c9 {

    /* renamed from: c */
    public static final C14911a f36970c = new C14911a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final String f36971a;

    /* renamed from: b */
    public final String f36972b;

    /* renamed from: com.contentsquare.android.sdk.yf$a */
    public static final class C14911a {
        public C14911a() {
        }

        public /* synthetic */ C14911a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14910yf(C14250c9 c9Var, String str) {
        Intrinsics.checkNotNullParameter(c9Var, "descriptor");
        Intrinsics.checkNotNullParameter(str, "eventBridgeTargetPath");
        this.f36971a = c9Var.mo34854b();
        String a = c9Var.mo34853a();
        this.f36972b = a + "|flutter|" + str;
    }

    /* renamed from: a */
    public String mo34853a() {
        return this.f36972b;
    }

    /* renamed from: b */
    public String mo34854b() {
        return this.f36971a;
    }
}
