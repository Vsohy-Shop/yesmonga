package com.carrefour.fid.android.core.p056di.module.domain;

import com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository;
import com.carrefour.fid.android.data.repositories.APIMProductsRepository;
import com.carrefour.fid.android.data.repositories.ArsenalGameRepository;
import com.carrefour.fid.android.data.repositories.C36590c;
import com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository;
import com.carrefour.fid.android.data.repositories.LuckyCartRepository;
import com.carrefour.fid.android.data.repositories.MemoRepository;
import com.carrefour.fid.android.domain.repositories.C38192a;
import com.carrefour.fid.android.domain.repositories.C38194c;
import com.carrefour.fid.android.domain.repositories.C38195d;
import com.carrefour.fid.android.domain.repositories.C38196e;
import com.carrefour.fid.android.domain.repositories.C38197f;
import com.carrefour.fid.android.domain.repositories.C38199h;
import com.carrefour.fid.android.domain.repositories.C38201i;
import dagger.C10147a;
import dagger.C10159h;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import javax.inject.Singleton;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.core.di.module.domain.i */
public interface C36257i {

    /* renamed from: com.carrefour.fid.android.core.di.module.domain.i$a */
    public static final class C36258a {
        @Singleton
        /* renamed from: a */
        public static /* synthetic */ void m148787a(APIMProductDetailsRepository aPIMProductDetailsRepository) {
        }

        @Singleton
        /* renamed from: b */
        public static /* synthetic */ void m148788b(APIMProductsRepository aPIMProductsRepository) {
        }

        @Singleton
        /* renamed from: c */
        public static /* synthetic */ void m148789c(MemoRepository memoRepository) {
        }
    }

    @C10147a
    @C12579k
    /* renamed from: a */
    C38197f mo108223a(@C12579k MemoRepository memoRepository);

    @C10147a
    @C12579k
    /* renamed from: b */
    C38194c mo108224b(@C12579k ArsenalGameRepository arsenalGameRepository);

    @C10147a
    @C12579k
    /* renamed from: c */
    C38196e mo108225c(@C12579k LuckyCartRepository luckyCartRepository);

    @C10147a
    @C12579k
    /* renamed from: d */
    C38199h mo108226d(@C12579k APIMProductDetailsRepository aPIMProductDetailsRepository);

    @C10147a
    @C12579k
    /* renamed from: e */
    C38195d mo108227e(@C12579k LuckyCartBannerRepository luckyCartBannerRepository);

    @C10147a
    @C12579k
    /* renamed from: f */
    C38201i mo108228f(@C12579k APIMProductsRepository aPIMProductsRepository);

    @C10147a
    @C12579k
    /* renamed from: g */
    C38192a mo108229g(@C12579k C36590c cVar);
}
