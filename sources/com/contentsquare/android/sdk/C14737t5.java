package com.contentsquare.android.sdk;

import android.app.Application;
import androidx.lifecycle.C19499w;
import com.contentsquare.android.reactnative.workaround.C14161a;
import com.contentsquare.android.reactnative.workaround.ReactNativeProcessLifecycle;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.t5 */
public final class C14737t5 {

    /* renamed from: b */
    public static C14737t5 f36477b;

    /* renamed from: c */
    public static final C14738a f36478c = new C14738a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C14161a f36479a;

    /* renamed from: com.contentsquare.android.sdk.t5$a */
    public static final class C14738a {
        public C14738a() {
        }

        @C11384m
        /* renamed from: a */
        public final void mo36488a(Application application, C19499w wVar) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(wVar, "lifecycleOwner");
            C14737t5.f36477b = new C14737t5(application, wVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C14738a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14737t5(Application application, C19499w wVar) {
        this.f36479a = new C14161a(new ReactNativeProcessLifecycle.C14158a(application), wVar);
    }

    @C11384m
    /* renamed from: a */
    public static final void m63529a(Application application, C19499w wVar) {
        f36478c.mo36488a(application, wVar);
    }

    public /* synthetic */ C14737t5(Application application, C19499w wVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, wVar);
    }
}
