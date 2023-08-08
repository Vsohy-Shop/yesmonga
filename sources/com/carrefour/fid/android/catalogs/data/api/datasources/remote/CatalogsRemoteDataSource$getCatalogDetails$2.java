package com.carrefour.fid.android.catalogs.data.api.datasources.remote;

import com.carrefour.fid.android.catalogs.data.api.datasources.extensions.C39395a;
import com.carrefour.fid.android.catalogs.data.api.entities.responses.CatalogDetailsResponse;
import com.carrefour.fid.android.catalogs.data.api.services.C39401a;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails;
import com.carrefour.fid.android.shared.data.entities.extension.C28639a;
import com.carrefour.fid.android.shared.util.C28935i;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogDetails$2", mo22502f = "CatalogsRemoteDataSource.kt", mo22503i = {}, mo22504l = {37}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogFullDetails;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CatalogsRemoteDataSource$getCatalogDetails$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends CatalogFullDetails>>, Object> {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ CatalogsRemoteDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogsRemoteDataSource$getCatalogDetails$2(CatalogsRemoteDataSource catalogsRemoteDataSource, String str, C11045c<? super CatalogsRemoteDataSource$getCatalogDetails$2> cVar) {
        super(1, cVar);
        this.this$0 = catalogsRemoteDataSource;
        this.$id = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new CatalogsRemoteDataSource$getCatalogDetails$2(this.this$0, this.$id, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        CatalogFullDetails catalogFullDetails;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C39401a a = this.this$0.f100751a;
            String str = this.$id;
            this.label = 1;
            obj = a.mo130441b(str, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            try {
                Result.C10852a aVar = Result.f28060a;
                CatalogDetailsResponse catalogDetailsResponse = (CatalogDetailsResponse) wVar.mo30572a();
                if (catalogDetailsResponse != null) {
                    Intrinsics.checkNotNullExpressionValue(catalogDetailsResponse, "body()");
                    catalogFullDetails = C39395a.m161441b(catalogDetailsResponse);
                } else {
                    catalogFullDetails = null;
                }
                obj2 = Result.m38702b(catalogFullDetails);
            } catch (Exception e) {
                C28935i iVar = C28935i.f70940a;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                C28935i.m119705e(iVar, message, (Throwable) null, 0, 6, (Object) null);
                Result.C10852a aVar2 = Result.f28060a;
                String message2 = e.getMessage();
                obj2 = Result.m38702b(C11661u0.m45734a(new Throwable("Error during fetching catalog details - " + message2, e)));
            }
        } else {
            Result.C10852a aVar3 = Result.f28060a;
            Object a2 = wVar.mo30572a();
            obj2 = Result.m38702b(C11661u0.m45734a(C28639a.m118565d(wVar, "Error during fetching catalog details " + a2)));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<CatalogFullDetails>> cVar) {
        return ((CatalogsRemoteDataSource$getCatalogDetails$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
