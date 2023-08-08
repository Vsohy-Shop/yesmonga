package androidx.activity.result;

import androidx.activity.result.contract.C0266a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.activity.result.e */
public final class C0300e {
    @C12579k
    /* renamed from: c */
    public static final <I, O> C0302g<C11079d2> m1527c(@C12579k C0264b bVar, @C12579k C0266a<I, O> aVar, I i, @C12579k ActivityResultRegistry activityResultRegistry, @C12579k C11300l<? super O, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "contract");
        Intrinsics.checkNotNullParameter(activityResultRegistry, "registry");
        Intrinsics.checkNotNullParameter(lVar, C10108c.f27778C);
        C0302g<I> registerForActivityResult = bVar.registerForActivityResult(aVar, activityResultRegistry, new C0299d(lVar));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…egistry) { callback(it) }");
        return new ActivityResultCallerLauncher(registerForActivityResult, aVar, i);
    }

    @C12579k
    /* renamed from: d */
    public static final <I, O> C0302g<C11079d2> m1528d(@C12579k C0264b bVar, @C12579k C0266a<I, O> aVar, I i, @C12579k C11300l<? super O, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "contract");
        Intrinsics.checkNotNullParameter(lVar, C10108c.f27778C);
        C0302g<I> registerForActivityResult = bVar.registerForActivityResult(aVar, new C0265c(lVar));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…ontract) { callback(it) }");
        return new ActivityResultCallerLauncher(registerForActivityResult, aVar, i);
    }

    /* renamed from: e */
    public static final void m1529e(C11300l lVar, Object obj) {
        Intrinsics.checkNotNullParameter(lVar, "$callback");
        lVar.invoke(obj);
    }

    /* renamed from: f */
    public static final void m1530f(C11300l lVar, Object obj) {
        Intrinsics.checkNotNullParameter(lVar, "$callback");
        lVar.invoke(obj);
    }
}
