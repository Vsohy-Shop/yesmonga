package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.core.extension.C36311i;
import com.carrefour.fid.android.data.C36377a;
import com.carrefour.fid.android.data.entities.APIMProducts;
import com.carrefour.fid.android.data.entities.APIMProductsRequest;
import com.carrefour.fid.android.data.entities.mapper.C36537w;
import com.carrefour.fid.android.data.entities.mapper.C36544y;
import com.carrefour.fid.android.data.service.C36621b;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.domain.models.C38185w;
import com.carrefour.fid.android.domain.models.ProductListFilter;
import com.carrefour.fid.android.presentation.models.FacetModel;
import com.carrefour.fid.android.presentation.models.SortModel;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.APIMProductsRepository$fetchOffers$2", mo22502f = "APIMProductsRepository.kt", mo22503i = {1}, mo22504l = {68, 102}, mo22505m = "invokeSuspend", mo22506n = {"e"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/w;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class APIMProductsRepository$fetchOffers$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends C38185w>>, Object> {
    final /* synthetic */ List<FacetModel> $facets;
    final /* synthetic */ String $facilityServiceId;
    final /* synthetic */ List<ProductListFilter> $filter;
    final /* synthetic */ Pair<String, String> $filterParams;
    final /* synthetic */ boolean $hasFidCard;
    final /* synthetic */ boolean $isPromo;
    final /* synthetic */ Integer $productSize;
    final /* synthetic */ String $queryGroup;
    final /* synthetic */ String $queryId;
    final /* synthetic */ String $searchedText;
    final /* synthetic */ String $slotId;
    final /* synthetic */ SortModel $sortOrder;
    final /* synthetic */ int $startResult;
    Object L$0;
    int label;
    final /* synthetic */ APIMProductsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public APIMProductsRepository$fetchOffers$2(APIMProductsRepository aPIMProductsRepository, String str, String str2, List<? extends ProductListFilter> list, int i, Integer num, String str3, String str4, String str5, SortModel sortModel, List<FacetModel> list2, Pair<String, String> pair, boolean z, boolean z2, C11045c<? super APIMProductsRepository$fetchOffers$2> cVar) {
        super(1, cVar);
        this.this$0 = aPIMProductsRepository;
        this.$facilityServiceId = str;
        this.$slotId = str2;
        this.$filter = list;
        this.$startResult = i;
        this.$productSize = num;
        this.$queryId = str3;
        this.$queryGroup = str4;
        this.$searchedText = str5;
        this.$sortOrder = sortModel;
        this.$facets = list2;
        this.$filterParams = pair;
        this.$hasFidCard = z;
        this.$isPromo = z2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new APIMProductsRepository$fetchOffers$2(this.this$0, this.$facilityServiceId, this.$slotId, this.$filter, this.$startResult, this.$productSize, this.$queryId, this.$queryGroup, this.$searchedText, this.$sortOrder, this.$facets, this.$filterParams, this.$hasFidCard, this.$isPromo, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            APIMProductsRequest g = this.this$0.f90354b.mo72340a(new C36544y.C36545a(this.$facilityServiceId, this.$slotId, this.$filter, this.$startResult, this.$productSize, this.$queryId, this.$queryGroup, this.$searchedText, this.$sortOrder, this.$facets, this.$filterParams));
            C36621b f = this.this$0.f90353a;
            HashMap<String, String> a = this.this$0.f90357e.mo111446a(this.$facilityServiceId);
            String queryGroup = g.getQueryGroup();
            int productFrom = g.getProductFrom();
            int productSize = g.getProductSize();
            String text = g.getText();
            String queryId = g.getQueryId();
            C36377a facetFilter = g.getFacetFilter();
            Map<String, String> sort = g.getSort();
            String d = this.this$0.f90354b.mo111369d(this.$queryGroup);
            String str = this.$facilityServiceId;
            this.label = 1;
            obj2 = f.mo111632a(a, str, queryGroup, C28534f.f69135T, productFrom, productSize, text, queryId, d, facetFilter, sort, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            try {
                C11661u0.m45747n(obj);
                obj2 = obj;
            } catch (NetworkException e) {
                Result.C10852a aVar = Result.f28060a;
                String message = e.getMessage();
                return Result.m38701a(Result.m38702b(C11661u0.m45734a(new Throwable("Network exception - " + message, e))));
            } catch (Exception e2) {
                e = e2;
                APIMProductsRepository aPIMProductsRepository = this.this$0;
                C37694a g2 = aPIMProductsRepository.f90358f;
                String message2 = e.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                this.L$0 = e;
                this.label = 2;
                if (aPIMProductsRepository.mo111413a(g2, message2, this) == h) {
                    return h;
                }
            }
        } else if (i == 2) {
            e = (Exception) this.L$0;
            C11661u0.m45747n(obj);
            Result.C10852a aVar2 = Result.f28060a;
            String message3 = e.getMessage();
            return Result.m38701a(Result.m38702b(C11661u0.m45734a(new Throwable("Error while fetching offers - " + message3, e))));
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj2;
        if (!wVar.mo30576g()) {
            Result.C10852a aVar3 = Result.f28060a;
            int i2 = this.$startResult;
            return Result.m38701a(Result.m38702b(C11661u0.m45734a(C36311i.m148971g(wVar, "Error fetching products from index: " + i2))));
        }
        this.this$0.mo111414b(wVar);
        Result.C10852a aVar4 = Result.f28060a;
        return Result.m38701a(Result.m38702b(this.this$0.f90355c.mo72340a(new C36537w.C36538a((APIMProducts) wVar.mo30572a(), this.$hasFidCard, this.$isPromo, this.$slotId))));
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<C38185w>> cVar) {
        return ((APIMProductsRepository$fetchOffers$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
