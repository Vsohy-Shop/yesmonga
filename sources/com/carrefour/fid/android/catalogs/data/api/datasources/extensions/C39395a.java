package com.carrefour.fid.android.catalogs.data.api.datasources.extensions;

import com.carrefour.fid.android.catalogs.data.api.entities.responses.CatalogDetailsResponse;
import com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.C39398a;
import com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.C39399b;
import com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.C39400c;
import com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.CatalogDoublePageResponse;
import com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.CatalogHeaderDetailsResponse;
import com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.CatalogPageResponse;
import com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.CatalogProductDescriptionResponse;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogArea;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogDoublePage;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogHeaderDetails;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogPage;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductDescription;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCatalogDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogDetails.kt\ncom/carrefour/fid/android/catalogs/data/api/datasources/extensions/CatalogDetailsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1549#2:115\n1620#2,3:116\n1549#2:119\n1620#2,3:120\n1549#2:123\n1620#2,3:124\n1549#2:127\n1620#2,3:128\n1549#2:131\n1620#2,2:132\n1549#2:134\n1620#2,3:135\n1549#2:138\n1620#2,3:139\n1622#2:142\n*S KotlinDebug\n*F\n+ 1 CatalogDetails.kt\ncom/carrefour/fid/android/catalogs/data/api/datasources/extensions/CatalogDetailsKt\n*L\n46#1:115\n46#1:116,3\n62#1:119\n62#1:120,3\n76#1:123\n76#1:124,3\n87#1:127\n87#1:128,3\n92#1:131\n92#1:132,2\n95#1:134\n95#1:135,3\n102#1:138\n102#1:139,3\n92#1:142\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.data.api.datasources.extensions.a */
public final class C39395a {
    @C12579k
    /* renamed from: a */
    public static final CatalogArea m161440a(@C12579k C39398a aVar) {
        CatalogProduct catalogProduct;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int k = aVar.mo130415k();
        int l = aVar.mo130416l();
        int h = aVar.mo130411h();
        int j = aVar.mo130414j();
        C39400c i = aVar.mo130413i();
        if (i != null) {
            catalogProduct = m161442c(i);
        } else {
            catalogProduct = null;
        }
        return new CatalogArea(k, l, h, j, catalogProduct);
    }

    @C12579k
    /* renamed from: b */
    public static final CatalogFullDetails m161441b(@C12579k CatalogDetailsResponse catalogDetailsResponse) {
        CatalogHeaderDetails catalogHeaderDetails;
        CatalogPage catalogPage;
        CatalogPage catalogPage2;
        ArrayList arrayList;
        ArrayList arrayList2;
        List<CatalogArea> f;
        CatalogProduct catalogProduct;
        String str;
        String str2;
        ArrayList arrayList3;
        List list;
        List<CatalogArea> f2;
        CatalogProduct catalogProduct2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(catalogDetailsResponse, "<this>");
        CatalogHeaderDetailsResponse catalogHeader = catalogDetailsResponse.getCatalogDetails().getCatalogHeader();
        if (catalogHeader != null) {
            catalogHeaderDetails = m161445f(catalogHeader);
        } else {
            catalogHeaderDetails = null;
        }
        Iterable<CatalogDoublePageResponse> doublePages = catalogDetailsResponse.getCatalogDetails().getDoublePages();
        ArrayList<CatalogDoublePage> arrayList4 = new ArrayList<>(C10978t.m41495Y(doublePages, 10));
        for (CatalogDoublePageResponse e : doublePages) {
            arrayList4.add(m161444e(e));
        }
        String slug = catalogDetailsResponse.getCatalogDetails().getSlug();
        ArrayList arrayList5 = new ArrayList(C10978t.m41495Y(arrayList4, 10));
        for (CatalogDoublePage catalogDoublePage : arrayList4) {
            CatalogPage e2 = catalogDoublePage.mo117118e();
            if (e2 != null) {
                CatalogPage e3 = catalogDoublePage.mo117118e();
                if (e3 == null || (f2 = e3.mo117192f()) == null) {
                    arrayList3 = null;
                } else {
                    Iterable<CatalogArea> iterable = f2;
                    arrayList3 = new ArrayList(C10978t.m41495Y(iterable, 10));
                    for (CatalogArea catalogArea : iterable) {
                        CatalogProduct h = catalogArea.mo117104h();
                        if (h != null) {
                            if (catalogHeaderDetails != null) {
                                str3 = catalogHeaderDetails.mo117150E();
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                str4 = "";
                            } else {
                                str4 = str3;
                            }
                            catalogProduct2 = CatalogProduct.m156317q(h, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (List) null, str4, (String) null, 24575, (Object) null);
                        } else {
                            catalogProduct2 = null;
                        }
                        arrayList3.add(CatalogArea.m156235g(catalogArea, 0, 0, 0, 0, catalogProduct2, 15, (Object) null));
                    }
                }
                if (arrayList3 == null) {
                    list = CollectionsKt__CollectionsKt.m40441E();
                } else {
                    list = arrayList3;
                }
                catalogPage = CatalogPage.m156301e(e2, (String) null, list, (String) null, 5, (Object) null);
            } else {
                catalogPage = null;
            }
            CatalogPage f3 = catalogDoublePage.mo117120f();
            if (f3 != null) {
                CatalogPage f4 = catalogDoublePage.mo117120f();
                if (f4 == null || (f = f4.mo117192f()) == null) {
                    arrayList = null;
                } else {
                    Iterable<CatalogArea> iterable2 = f;
                    arrayList = new ArrayList(C10978t.m41495Y(iterable2, 10));
                    for (CatalogArea catalogArea2 : iterable2) {
                        CatalogProduct h2 = catalogArea2.mo117104h();
                        if (h2 != null) {
                            if (catalogHeaderDetails != null) {
                                str = catalogHeaderDetails.mo117150E();
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            catalogProduct = CatalogProduct.m156317q(h2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (List) null, str2, (String) null, 24575, (Object) null);
                        } else {
                            catalogProduct = null;
                        }
                        arrayList.add(CatalogArea.m156235g(catalogArea2, 0, 0, 0, 0, catalogProduct, 15, (Object) null));
                    }
                }
                if (arrayList == null) {
                    arrayList2 = CollectionsKt__CollectionsKt.m40441E();
                } else {
                    arrayList2 = arrayList;
                }
                catalogPage2 = CatalogPage.m156301e(f3, (String) null, arrayList2, (String) null, 5, (Object) null);
            } else {
                catalogPage2 = null;
            }
            arrayList5.add(catalogDoublePage.mo117116c(catalogPage, catalogPage2));
        }
        return new CatalogFullDetails(catalogHeaderDetails, slug, arrayList5, 0, 8, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: c */
    public static final CatalogProduct m161442c(@C12579k C39400c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String e = cVar.mo130430e();
        String b = cVar.mo130427b();
        String d = cVar.mo130429d();
        String h = cVar.mo130433h();
        String a = cVar.mo130426a();
        String j = cVar.mo130435j();
        String k = cVar.mo130436k();
        String l = cVar.mo130437l();
        int i = cVar.mo130434i();
        String m = cVar.mo130438m();
        String n = cVar.mo130439n();
        String g = cVar.mo130432g();
        Iterable<CatalogProductDescriptionResponse> c = cVar.mo130428c();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(c, 10));
        for (CatalogProductDescriptionResponse d2 : c) {
            arrayList.add(m161443d(d2));
        }
        String str = (String) CollectionsKt___CollectionsKt.m40479B2(cVar.mo130431f());
        if (str == null) {
            str = "";
        }
        return new CatalogProduct(e, b, d, h, a, j, k, l, i, m, n, g, arrayList, (String) null, str, 8192, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: d */
    public static final CatalogProductDescription m161443d(@C12579k CatalogProductDescriptionResponse catalogProductDescriptionResponse) {
        List list;
        Intrinsics.checkNotNullParameter(catalogProductDescriptionResponse, "<this>");
        String label = catalogProductDescriptionResponse.getLabel();
        String content = catalogProductDescriptionResponse.getContent();
        List<C39399b> pictos = catalogProductDescriptionResponse.getPictos();
        if (pictos != null) {
            Iterable<C39399b> iterable = pictos;
            list = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (C39399b h : iterable) {
                list.add(m161447h(h));
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        return new CatalogProductDescription(label, content, list);
    }

    @C12579k
    /* renamed from: e */
    public static final CatalogDoublePage m161444e(@C12579k CatalogDoublePageResponse catalogDoublePageResponse) {
        CatalogPage catalogPage;
        Intrinsics.checkNotNullParameter(catalogDoublePageResponse, "<this>");
        CatalogPageResponse leftPage = catalogDoublePageResponse.getLeftPage();
        CatalogPage catalogPage2 = null;
        if (leftPage != null) {
            catalogPage = m161446g(leftPage);
        } else {
            catalogPage = null;
        }
        CatalogPageResponse rightPage = catalogDoublePageResponse.getRightPage();
        if (rightPage != null) {
            catalogPage2 = m161446g(rightPage);
        }
        return new CatalogDoublePage(catalogPage, catalogPage2);
    }

    @C12579k
    /* renamed from: f */
    public static final CatalogHeaderDetails m161445f(@C12579k CatalogHeaderDetailsResponse catalogHeaderDetailsResponse) {
        Intrinsics.checkNotNullParameter(catalogHeaderDetailsResponse, "<this>");
        return new CatalogHeaderDetails(catalogHeaderDetailsResponse.getName(), catalogHeaderDetailsResponse.getValidityStartDate(), catalogHeaderDetailsResponse.getStores(), catalogHeaderDetailsResponse.getValidityEndDate(), catalogHeaderDetailsResponse.getLastModified(), catalogHeaderDetailsResponse.getStartDate(), catalogHeaderDetailsResponse.getEndDate(), catalogHeaderDetailsResponse.getSpeed(), catalogHeaderDetailsResponse.getStoreFormat(), catalogHeaderDetailsResponse.getNumberOfPage(), catalogHeaderDetailsResponse.getDisplayTargets(), catalogHeaderDetailsResponse.getSlug(), catalogHeaderDetailsResponse.getOrder(), catalogHeaderDetailsResponse.getLocal(), catalogHeaderDetailsResponse.getId());
    }

    @C12579k
    /* renamed from: g */
    public static final CatalogPage m161446g(@C12579k CatalogPageResponse catalogPageResponse) {
        Intrinsics.checkNotNullParameter(catalogPageResponse, "<this>");
        String num = catalogPageResponse.getNum();
        Iterable<C39398a> area = catalogPageResponse.getArea();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(area, 10));
        for (C39398a a : area) {
            arrayList.add(m161440a(a));
        }
        return new CatalogPage(num, arrayList, catalogPageResponse.getPageUrl());
    }

    @C12579k
    /* renamed from: h */
    public static final CatalogProductPicto m161447h(@C12579k C39399b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new CatalogProductPicto(bVar.mo130421e(), bVar.mo130423f());
    }
}
