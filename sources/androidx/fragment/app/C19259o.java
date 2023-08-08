package androidx.fragment.app;

import android.os.Bundle;
import com.google.android.gms.common.internal.C40852x;
import com.google.android.gms.maps.internal.C30519p1;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.fragment.app.o */
public final class C19259o {
    /* renamed from: b */
    public static final void m90347b(@C12579k Fragment fragment, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(str, "requestKey");
        fragment.getParentFragmentManager().mo56869d(str);
    }

    /* renamed from: c */
    public static final void m90348c(@C12579k Fragment fragment, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(str, "requestKey");
        fragment.getParentFragmentManager().mo56865c(str);
    }

    /* renamed from: d */
    public static final void m90349d(@C12579k Fragment fragment, @C12579k String str, @C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(str, "requestKey");
        Intrinsics.checkNotNullParameter(bundle, "result");
        fragment.getParentFragmentManager().mo56857a(str, bundle);
    }

    /* renamed from: e */
    public static final void m90350e(@C12579k Fragment fragment, @C12579k String str, @C12579k C11304p<? super String, ? super Bundle, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(str, "requestKey");
        Intrinsics.checkNotNullParameter(pVar, C40852x.C40853a.f103958a);
        fragment.getParentFragmentManager().mo56861b(str, fragment, new C19255n(pVar));
    }

    /* renamed from: f */
    public static final void m90351f(C11304p pVar, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(pVar, "$tmp0");
        Intrinsics.checkNotNullParameter(str, "p0");
        Intrinsics.checkNotNullParameter(bundle, C30519p1.f72971a);
        pVar.invoke(str, bundle);
    }
}
