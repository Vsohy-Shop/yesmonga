package com.carrefour.fid.android.domain.repositories;

import com.carrefour.fid.android.domain.models.OfferProductDomain;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.repositories.h */
public interface C38199h {

    /* renamed from: com.carrefour.fid.android.domain.repositories.h$a */
    public static final class C38200a {
        /* renamed from: a */
        public static /* synthetic */ Object m158424a(C38199h hVar, List list, boolean z, String str, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str = null;
                }
                return hVar.mo111474c(list, z, str, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOfferList-BWLJW6A");
        }
    }

    @C12580l
    /* renamed from: c */
    Object mo111474c(@C12579k List<String> list, boolean z, @C12580l String str, @C12579k C11045c<? super Result<? extends List<OfferProductDomain>>> cVar);
}
