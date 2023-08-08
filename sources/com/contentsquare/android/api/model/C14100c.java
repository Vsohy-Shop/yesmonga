package com.contentsquare.android.api.model;

import com.contentsquare.android.sdk.C14358g3;
import com.contentsquare.android.sdk.C14453jf;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.api.model.c */
public abstract class C14100c {

    /* renamed from: b */
    public static C14453jf f34871b = new C14453jf("DynamicVar");

    /* renamed from: c */
    public static final String f34872c = "cs-empty";

    /* renamed from: d */
    public static final int f34873d = 512;

    /* renamed from: e */
    public static final C14101a f34874e = new C14101a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final String f34875a;

    /* renamed from: com.contentsquare.android.api.model.c$a */
    public static final class C14101a {
        public C14101a() {
        }

        /* renamed from: a */
        public final C14453jf mo34345a() {
            return C14100c.f34871b;
        }

        /* renamed from: b */
        public final void mo34346b(C14453jf jfVar) {
            Intrinsics.checkNotNullParameter(jfVar, "<set-?>");
            C14100c.f34871b = jfVar;
        }

        public /* synthetic */ C14101a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14100c(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        if (C14358g3.m61811e(str)) {
            f34871b.mo35679i("Dynamic Variable key is empty. Dynamic Variable is sent but the key is set to \"%s\"", "cs-empty");
            this.f34875a = "cs-empty";
            return;
        }
        if (str.length() > 512) {
            f34871b.mo35679i("Dynamic Variable key is too long: the current input has a length of %d while the limit is %d. Dynamic Variable is sent but the key truncated", Integer.valueOf(str.length()), 512);
            str = str.substring(0, 512);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        this.f34875a = str;
    }

    /* renamed from: c */
    public final String mo34344c() {
        return this.f34875a;
    }
}
