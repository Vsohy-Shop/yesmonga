package com.contentsquare.android.sdk;

import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.s0 */
public final class C14691s0 implements C14250c9 {

    /* renamed from: c */
    public static final C14781ue f36363c = new C14781ue(new C14510lf());

    /* renamed from: d */
    public static final C14692a f36364d = new C14692a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public String f36365a;

    /* renamed from: b */
    public final String f36366b;

    /* renamed from: com.contentsquare.android.sdk.s0$a */
    public static final class C14692a {
        public C14692a() {
        }

        public /* synthetic */ C14692a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14691s0(View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        this.f36365a = view.getId() != 0 ? C14493l4.m62465b(view, "null") : mo36368b(view.getParent());
        String b = f36363c.mo36586b(view);
        Intrinsics.checkNotNullExpressionValue(b, "pathDescriptor.generateAnalyticsPath(view)");
        this.f36366b = b;
    }

    /* renamed from: a */
    public String mo34853a() {
        return this.f36366b;
    }

    /* renamed from: b */
    public final String mo36368b(ViewParent viewParent) {
        if (!(viewParent instanceof View)) {
            viewParent = null;
        }
        View view = (View) viewParent;
        if (view != null) {
            return C14493l4.m62465b(view, (String) null);
        }
        return null;
    }

    /* renamed from: b */
    public String mo34854b() {
        return this.f36365a;
    }
}
