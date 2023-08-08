package com.carrefour.fid.android.domain.repositories;

import com.carrefour.fid.android.domain.models.C37941a0;
import com.carrefour.fid.android.domain.models.C38185w;
import com.carrefour.fid.android.domain.models.ProductListFilter;
import com.carrefour.fid.android.presentation.models.FacetModel;
import com.carrefour.fid.android.presentation.models.SortModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.repositories.i */
public interface C38201i {

    /* renamed from: com.carrefour.fid.android.domain.repositories.i$a */
    public static final class C38202a {
        /* renamed from: a */
        public static /* synthetic */ Object m158427a(C38201i iVar, boolean z, String str, String str2, List list, int i, Integer num, String str3, String str4, String str5, SortModel sortModel, List list2, Pair pair, boolean z2, C11045c cVar, int i2, Object obj) {
            int i3 = i2;
            if (obj == null) {
                return iVar.mo111478d(z, str, str2, list, i, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : str4, (i3 & 256) != 0 ? null : str5, (i3 & 512) != 0 ? null : sortModel, (i3 & 1024) != 0 ? null : list2, (i3 & 2048) != 0 ? null : pair, (i3 & 4096) != 0 ? false : z2, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchOffers-5dDjBWM");
        }

        /* renamed from: b */
        public static /* synthetic */ Object m158428b(C38201i iVar, String str, String str2, Integer num, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    num = null;
                }
                return iVar.mo111477c(str, str2, num, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchSuggestions-BWLJW6A");
        }
    }

    @C12580l
    /* renamed from: c */
    Object mo111477c(@C12579k String str, @C12579k String str2, @C12580l Integer num, @C12579k C11045c<? super Result<C37941a0>> cVar);

    @C12580l
    /* renamed from: d */
    Object mo111478d(boolean z, @C12579k String str, @C12579k String str2, @C12579k List<? extends ProductListFilter> list, int i, @C12580l Integer num, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l SortModel sortModel, @C12580l List<FacetModel> list2, @C12580l Pair<String, String> pair, boolean z2, @C12579k C11045c<? super Result<C38185w>> cVar);
}
