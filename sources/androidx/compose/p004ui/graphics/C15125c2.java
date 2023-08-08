package androidx.compose.p004ui.graphics;

import android.graphics.Canvas;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.c2 */
public final class C15125c2 {
    @C12579k

    /* renamed from: a */
    public final C15201e0 f37360a = new C15201e0();

    @C11532s0
    /* renamed from: c */
    public static /* synthetic */ void m65279c() {
    }

    /* renamed from: a */
    public final void mo42489a(@C12579k Canvas canvas, @C12579k C11300l<? super C15118b2, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(canvas, "targetCanvas");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        Canvas T = mo42490b().mo42733T();
        mo42490b().mo42734V(canvas);
        lVar.invoke(mo42490b());
        mo42490b().mo42734V(T);
    }

    @C12579k
    /* renamed from: b */
    public final C15201e0 mo42490b() {
        return this.f37360a;
    }
}
