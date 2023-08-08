package com.carrefour.fid.android.catalogs.data.api.datasources;

import com.carrefour.fid.android.catalogs.data.api.datasources.extensions.C39396b;
import com.carrefour.fid.android.catalogs.data.api.entities.responses.CatalogResponse;
import com.carrefour.fid.android.catalogs.data.api.services.C39401a;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.shared.data.entities.extension.C28639a;
import com.carrefour.fid.android.shared.util.C28935i;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.catalogs.data.api.datasources.CatalogsDataSource$getCatalogList$2", mo22502f = "CatalogsDataSource.kt", mo22503i = {}, mo22504l = {16}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CatalogsDataSource$getCatalogList$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends List<? extends Catalog>>>, Object> {
    int label;
    final /* synthetic */ CatalogsDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogsDataSource$getCatalogList$2(CatalogsDataSource catalogsDataSource, C11045c<? super CatalogsDataSource$getCatalogList$2> cVar) {
        super(1, cVar);
        this.this$0 = catalogsDataSource;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new CatalogsDataSource$getCatalogList$2(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        List<Catalog> list;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C39401a a = this.this$0.f100749a;
            this.label = 1;
            obj = a.mo130440a(this);
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
                CatalogResponse catalogResponse = (CatalogResponse) wVar.mo30572a();
                if (catalogResponse != null) {
                    Intrinsics.checkNotNullExpressionValue(catalogResponse, "body()");
                    list = C39396b.m161448a(catalogResponse);
                } else {
                    list = null;
                }
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.m40441E();
                }
                obj2 = Result.m38702b(list);
            } catch (Exception e) {
                C28935i iVar = C28935i.f70940a;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                C28935i.m119705e(iVar, message, (Throwable) null, 0, 6, (Object) null);
                Result.C10852a aVar2 = Result.f28060a;
                String message2 = e.getMessage();
                obj2 = Result.m38702b(C11661u0.m45734a(new Throwable("Error during fetching catalog list - " + message2, e)));
            }
        } else {
            Result.C10852a aVar3 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(C28639a.m118565d(wVar, "Error during fetching catalog list")));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<? extends List<Catalog>>> cVar) {
        return ((CatalogsDataSource$getCatalogList$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
