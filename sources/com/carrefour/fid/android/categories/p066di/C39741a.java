package com.carrefour.fid.android.categories.p066di;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi;
import com.carrefour.fid.android.categories.data.api.datasource.DriveOmrAvailabilityApiImpl;
import com.carrefour.fid.android.categories.domain.datasource.DriveOmrAvailabilityApi;
import com.carrefour.fid.android.categories.domain.interactors.CategoriesGetCategoriesUseCase;
import com.carrefour.fid.android.categories.domain.interactors.CategoriesGetDriveOmrPromiseUseCase;
import com.carrefour.fid.android.domain.interactors.category.C37619a;
import com.carrefour.fid.android.domain.interactors.category.C37620b;
import com.carrefour.fid.android.shared.p045di.annotation.C28665i;
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
/* renamed from: com.carrefour.fid.android.categories.di.a */
public interface C39741a {
    @C12579k

    /* renamed from: a */
    public static final C39742a f101440a = C39742a.f101441a;

    /* renamed from: com.carrefour.fid.android.categories.di.a$a */
    public static final class C39742a {

        /* renamed from: a */
        public static final /* synthetic */ C39742a f101441a = new C39742a();

        @C10315i
        @C12579k
        /* renamed from: a */
        public final BffStoresManagementApi mo131028a(@C12579k @C28665i C13092x xVar) {
            Intrinsics.checkNotNullParameter(xVar, "retrofit");
            Object g = xVar.mo30586g(BffStoresManagementApi.class);
            Intrinsics.checkNotNullExpressionValue(g, "retrofit.create(BffStore…anagementApi::class.java)");
            return (BffStoresManagementApi) g;
        }
    }

    @C10147a
    @C12579k
    /* renamed from: a */
    C37619a mo131025a(@C12579k CategoriesGetCategoriesUseCase categoriesGetCategoriesUseCase);

    @C10147a
    @C12579k
    /* renamed from: b */
    DriveOmrAvailabilityApi mo131026b(@C12579k DriveOmrAvailabilityApiImpl driveOmrAvailabilityApiImpl);

    @C10147a
    @C12579k
    /* renamed from: c */
    C37620b mo131027c(@C12579k CategoriesGetDriveOmrPromiseUseCase categoriesGetDriveOmrPromiseUseCase);
}
