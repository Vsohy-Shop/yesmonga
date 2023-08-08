package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15591p;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.relocation.a */
public final class C2669a implements C2671c {
    @C12579k

    /* renamed from: a */
    public final View f7037a;

    public C2669a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        this.f7037a = view;
    }

    @C12580l
    /* renamed from: a */
    public Object mo9134a(@C12579k C15588o oVar, @C12579k C11289a<C15098i> aVar, @C12579k C11045c<? super C11079d2> cVar) {
        C15098i S;
        long f = C15591p.m69304f(oVar);
        C15098i invoke = aVar.invoke();
        if (invoke == null || (S = invoke.mo42261S(f)) == null) {
            return C11079d2.f28267a;
        }
        this.f7037a.requestRectangleOnScreen(C2674f.m12054c(S), false);
        return C11079d2.f28267a;
    }
}
