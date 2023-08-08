package com.carrefour.fid.android.domain.interactors.product;

import com.carrefour.fid.android.domain.models.offer.C38064a;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.product.o */
public interface C37776o {

    /* renamed from: com.carrefour.fid.android.domain.interactors.product.o$a */
    public static final class C37777a {
        /* renamed from: a */
        public static /* synthetic */ Object m154861a(C37776o oVar, boolean z, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                return oVar.mo79978a(z, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke-gIAlu-s");
        }
    }

    @C12580l
    /* renamed from: a */
    Object mo79978a(boolean z, @C12579k C11045c<? super Result<? extends List<C38064a>>> cVar);
}
