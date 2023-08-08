package com.carrefour.fid.android.catalogs.p064di.domain;

import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsAddCatalogFavoriteProductUseCase;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogDetailsUseCase;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogFavoriteProductsUseCase;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogListUseCase;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogsListByStoreIdUseCase;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsRemoveCatalogFavoriteListUseCase;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsRemoveCatalogFavoriteProductUseCase;
import com.carrefour.fid.android.domain.interactors.catalog.C37609a;
import com.carrefour.fid.android.domain.interactors.catalog.C37610b;
import com.carrefour.fid.android.domain.interactors.catalog.C37612d;
import com.carrefour.fid.android.domain.interactors.catalog.C37613e;
import com.carrefour.fid.android.domain.interactors.catalog.C37614f;
import com.carrefour.fid.android.domain.interactors.catalog.C37615g;
import com.carrefour.fid.android.domain.interactors.catalog.C37616h;
import com.carrefour.fid.android.domain.interactors.catalog.C37618i;
import dagger.C10147a;
import dagger.C10159h;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.catalogs.di.domain.b */
public interface C39434b {
    @C10147a
    @C12579k
    /* renamed from: a */
    C37609a mo130489a(@C12579k CatalogsAddCatalogFavoriteProductUseCase catalogsAddCatalogFavoriteProductUseCase);

    @C10147a
    @C12579k
    /* renamed from: b */
    C37618i mo130490b(@C12579k CatalogsRemoveCatalogFavoriteProductUseCase catalogsRemoveCatalogFavoriteProductUseCase);

    @C10147a
    @C12579k
    /* renamed from: c */
    C37613e mo130491c(@C12579k CatalogsGetCatalogFavoriteProductsUseCase catalogsGetCatalogFavoriteProductsUseCase);

    @C10147a
    @C12579k
    /* renamed from: d */
    C37610b mo130492d(@C12579k CatalogsGetCatalogActionUseCase catalogsGetCatalogActionUseCase);

    @C10147a
    @C12579k
    /* renamed from: e */
    C37616h mo130493e(@C12579k CatalogsRemoveCatalogFavoriteListUseCase catalogsRemoveCatalogFavoriteListUseCase);

    @C10147a
    @C12579k
    /* renamed from: f */
    C37612d mo130494f(@C12579k CatalogsGetCatalogDetailsUseCase catalogsGetCatalogDetailsUseCase);

    @C10147a
    @C12579k
    /* renamed from: g */
    C37614f mo130495g(@C12579k CatalogsGetCatalogsListByStoreIdUseCase catalogsGetCatalogsListByStoreIdUseCase);

    @C10147a
    @C12579k
    /* renamed from: h */
    C37615g mo130496h(@C12579k CatalogsGetCatalogListUseCase catalogsGetCatalogListUseCase);
}
