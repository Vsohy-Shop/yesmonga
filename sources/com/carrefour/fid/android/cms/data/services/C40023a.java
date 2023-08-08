package com.carrefour.fid.android.cms.data.services;

import com.carrefour.fid.android.cms.data.entities.CarouselsCmsResponse;
import com.carrefour.fid.android.cms.data.entities.CarouselsOffersCmsResponse;
import com.carrefour.fid.android.cms.data.entities.CmsResponse;
import com.carrefour.fid.android.cms.data.entities.DeliveryRatePojo;
import com.carrefour.fid.android.cms.data.entities.HomeNalCmsResponse;
import com.carrefour.fid.android.cms.data.entities.PrimeCmsResponse;
import com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13027f;
import retrofit2.http.C13031j;
import retrofit2.http.C13040s;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0001\u0010\t\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\b\b\u0001\u0010\t\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJ/\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ3\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u00162\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\bJ)\u0010\u0018\u001a\u00020\u00162\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\bJ/\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\bJ9\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\b\b\u0001\u0010\t\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/services/a;", "", "", "", "headers", "Lretrofit2/w;", "Lcom/carrefour/fid/android/cms/data/entities/PrimeCmsResponse;", "d", "(Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "metiRef", "Lcom/carrefour/fid/android/cms/data/entities/CarouselsCmsResponse;", "i", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/cms/data/entities/CarouselsOffersCmsResponse;", "b", "Lcom/carrefour/fid/android/cms/data/entities/CmsResponse;", "f", "", "minefiCode", "Lcom/carrefour/fid/android/cms/data/entities/StorePetrolInfoPojo;", "e", "(ILjava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/cms/data/entities/DeliveryRatePojo;", "a", "g", "c", "Lcom/carrefour/fid/android/cms/data/entities/HomeNalCmsResponse;", "h", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.cms.data.services.a */
public interface C40023a {
    @C12580l
    @C13027f("retail/v1/mof/content_management/editorial_page?slug=/clcv-tarif-livraison-app&meti_reference=6")
    /* renamed from: a */
    Object mo132261a(@C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super DeliveryRatePojo> cVar);

    @C12580l
    @C13027f("retail/v1/mof/content_management/offers/{store_meti_reference}?version=2")
    /* renamed from: b */
    Object mo132262b(@C13040s("store_meti_reference") @C12579k String str, @C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<CarouselsOffersCmsResponse>> cVar);

    @C12580l
    @C13027f("retail/v1/mof/content_management/legal_pages?slug=conditions-generales-ventes")
    /* renamed from: c */
    Object mo132263c(@C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<CmsResponse>> cVar);

    @C12580l
    @C13027f("retail/v1/utilities-management/utilities/loyalty_prime_types")
    /* renamed from: d */
    Object mo132264d(@C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<PrimeCmsResponse>> cVar);

    @C12580l
    @C13027f("retail/v1/mof/content_management/gas_stations/{minefi_code}")
    /* renamed from: e */
    Object mo132265e(@C13040s("minefi_code") int i, @C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super StorePetrolInfoPojo> cVar);

    @C12580l
    @C13027f("retail/v1/mof/content_management/editorial_pages?slug=/services/carte-carrefour/conditions-generales")
    /* renamed from: f */
    Object mo132266f(@C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<CmsResponse>> cVar);

    @C12580l
    @C13027f("retail/v1/mof/content_management/editorial_page?slug=/lex-tarif-livraison-app&meti_reference=6")
    /* renamed from: g */
    Object mo132267g(@C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super DeliveryRatePojo> cVar);

    @C12580l
    @C13027f("retail/v1/utilities-management/utilities/mobile_pages/{metiRef}")
    /* renamed from: h */
    Object mo132268h(@C13040s("metiRef") @C12579k String str, @C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<HomeNalCmsResponse>> cVar);

    @C12580l
    @C13027f("retail/v1/mof/content_management/carousels/{store_meti_reference}")
    /* renamed from: i */
    Object mo132269i(@C13040s("store_meti_reference") @C12579k String str, @C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<CarouselsCmsResponse>> cVar);
}
