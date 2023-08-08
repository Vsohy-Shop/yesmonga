package com.carrefour.fid.android.domain.interactors.rating;

import com.carrefour.fid.android.data.repositories.RatingRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.rating.a */
public final class C37805a implements C10324h<GetRatingUseCase> {

    /* renamed from: a */
    public final Provider<RatingRepository> f94897a;

    public C37805a(Provider<RatingRepository> provider) {
        this.f94897a = provider;
    }

    /* renamed from: a */
    public static C37805a m154961a(Provider<RatingRepository> provider) {
        return new C37805a(provider);
    }

    /* renamed from: c */
    public static GetRatingUseCase m154962c(RatingRepository ratingRepository) {
        return new GetRatingUseCase(ratingRepository);
    }

    /* renamed from: b */
    public GetRatingUseCase get() {
        return m154962c(this.f94897a.get());
    }
}
