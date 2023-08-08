package com.carrefour.fid.android.data.repositories;

import com.google.android.play.core.review.C32121c;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.v */
public final class C36615v implements C10324h<RatingRepository> {

    /* renamed from: a */
    public final Provider<C32121c> f90527a;

    public C36615v(Provider<C32121c> provider) {
        this.f90527a = provider;
    }

    /* renamed from: a */
    public static C36615v m150223a(Provider<C32121c> provider) {
        return new C36615v(provider);
    }

    /* renamed from: c */
    public static RatingRepository m150224c(C32121c cVar) {
        return new RatingRepository(cVar);
    }

    /* renamed from: b */
    public RatingRepository get() {
        return m150224c(this.f90527a.get());
    }
}
