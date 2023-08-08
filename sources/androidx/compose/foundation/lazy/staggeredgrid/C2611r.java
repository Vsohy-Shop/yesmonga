package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.C2539c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.r */
public final class C2611r {
    @C12579k

    /* renamed from: a */
    public final C2539c<C2595d> f6930a;

    public C2611r(@C12579k C2539c<C2595d> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "intervals");
        this.f6930a = cVar;
    }

    @C12579k
    /* renamed from: a */
    public final C2539c<C2595d> mo9012a() {
        return this.f6930a;
    }

    /* renamed from: b */
    public final boolean mo9013b(int i) {
        boolean z;
        if (i < 0 || i >= this.f6930a.getSize()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        C2539c.C2540a<C2595d> aVar = this.f6930a.get(i);
        C11300l<Integer, C2617v> b = aVar.mo8731c().mo8951b();
        int b2 = i - aVar.mo8730b();
        if (b == null || b.invoke(Integer.valueOf(b2)) != C2617v.f6936b.mo9025a()) {
            return false;
        }
        return true;
    }
}
