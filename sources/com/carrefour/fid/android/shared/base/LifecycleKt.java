package com.carrefour.fid.android.shared.base;

import androidx.appcompat.app.C0475e;
import androidx.appcompat.widget.C0696c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C19499w;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;

public final class LifecycleKt {
    /* renamed from: a */
    public static final /* synthetic */ <T> void m118339a(C11907e<? extends T> eVar, C0475e eVar2, C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(eVar2, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(pVar, "collector");
        new ObserverWhileResumedImpl(eVar2, eVar, pVar);
    }

    /* renamed from: b */
    public static final /* synthetic */ <T> void m118340b(C11907e<? extends T> eVar, Fragment fragment, C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(pVar, "collector");
        new ObserverWhileResumedImpl(fragment, eVar, pVar);
    }

    /* renamed from: c */
    public static final /* synthetic */ <T> void m118341c(C11907e<? extends T> eVar, C0475e eVar2) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(eVar2, C0696c.f2306r);
        Intrinsics.needClassReification();
        new ObserverWhileResumedImpl(eVar2, eVar, new LifecycleKt$collectWhileResumedIn$1((C11045c<? super LifecycleKt$collectWhileResumedIn$1>) null));
    }

    /* renamed from: d */
    public static final /* synthetic */ <T> void m118342d(C11907e<? extends T> eVar, Fragment fragment) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C19499w viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        Intrinsics.needClassReification();
        new ObserverWhileResumedImpl(viewLifecycleOwner, eVar, new LifecycleKt$collectWhileResumedIn$2((C11045c<? super LifecycleKt$collectWhileResumedIn$2>) null));
    }

    /* renamed from: e */
    public static final /* synthetic */ <T> void m118343e(C11907e<? extends T> eVar, C0475e eVar2, C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(eVar2, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(pVar, "collector");
        new ObserverWhileStartedImpl(eVar2, eVar, pVar);
    }

    /* renamed from: f */
    public static final /* synthetic */ <T> void m118344f(C11907e<? extends T> eVar, Fragment fragment, C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(pVar, "collector");
        C19499w viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, eVar, pVar);
    }

    /* renamed from: g */
    public static final /* synthetic */ <T> void m118345g(C11907e<? extends T> eVar, C0475e eVar2) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(eVar2, C0696c.f2306r);
        Intrinsics.needClassReification();
        new ObserverWhileStartedImpl(eVar2, eVar, new LifecycleKt$collectWhileStartedIn$1((C11045c<? super LifecycleKt$collectWhileStartedIn$1>) null));
    }

    /* renamed from: h */
    public static final /* synthetic */ <T> void m118346h(C11907e<? extends T> eVar, Fragment fragment) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C19499w viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        Intrinsics.needClassReification();
        new ObserverWhileStartedImpl(viewLifecycleOwner, eVar, new LifecycleKt$collectWhileStartedIn$2((C11045c<? super LifecycleKt$collectWhileStartedIn$2>) null));
    }
}
