package com.carrefour.fid.android.utilities.p032di;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi;
import com.carrefour.fid.android.domain.interactors.criteo.C37668h;
import com.carrefour.fid.android.domain.interactors.luckycart.C37711e;
import com.carrefour.fid.android.domain.interactors.product.SearchProductSuggestions;
import com.carrefour.fid.android.domain.interactors.utilities.C37887a;
import com.carrefour.fid.android.domain.interactors.utilities.C37888b;
import com.carrefour.fid.android.domain.interactors.utilities.C37890c;
import com.carrefour.fid.android.shared.p045di.annotation.C28666j;
import com.carrefour.fid.android.utilities.domain.interactors.C22687d;
import com.carrefour.fid.android.utilities.domain.interactors.C22690f;
import com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetPickupPointsUseCase;
import com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSecureTokenUseCase;
import com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase;
import com.carrefour.fid.android.utilities.domain.interactors.UtilitiesSuggestionsUseCase;
import dagger.C10147a;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13092x;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.utilities.di.b */
public interface C22680b {
    @C12579k

    /* renamed from: a */
    public static final C22681a f58086a = C22681a.f58087a;

    /* renamed from: com.carrefour.fid.android.utilities.di.b$a */
    public static final class C22681a {

        /* renamed from: a */
        public static final /* synthetic */ C22681a f58087a = new C22681a();

        @C10315i
        @C12579k
        /* renamed from: a */
        public final BffUtilitiesManagementApi mo67028a(@C28666j @C12579k C13092x xVar) {
            Intrinsics.checkNotNullParameter(xVar, "retrofit");
            Object g = xVar.mo30586g(BffUtilitiesManagementApi.class);
            Intrinsics.checkNotNullExpressionValue(g, "retrofit.create(BffUtili…anagementApi::class.java)");
            return (BffUtilitiesManagementApi) g;
        }
    }

    @C10147a
    @C12579k
    /* renamed from: a */
    SearchProductSuggestions mo67022a(@C12579k UtilitiesSuggestionsUseCase utilitiesSuggestionsUseCase);

    @C10147a
    @C12579k
    /* renamed from: b */
    C37887a mo67023b(@C12579k UtilitiesGetPickupPointsUseCase utilitiesGetPickupPointsUseCase);

    @C10147a
    @C12579k
    /* renamed from: c */
    C37711e mo67024c(@C12579k C22690f fVar);

    @C10147a
    @C12579k
    /* renamed from: d */
    C37890c mo67025d(@C12579k UtilitiesGetSponsoredItemsUseCase utilitiesGetSponsoredItemsUseCase);

    @C10147a
    @C12579k
    /* renamed from: e */
    C37668h mo67026e(@C12579k C22687d dVar);

    @C10147a
    @C12579k
    /* renamed from: f */
    C37888b mo67027f(@C12579k UtilitiesGetSecureTokenUseCase utilitiesGetSecureTokenUseCase);
}
