package com.carrefour.fid.android.categories.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategoryTreeProduct;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategoryTreeResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory;
import com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt;
import com.carrefour.fid.android.domain.models.category.CategoryType;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCategoryEntitiesToCategoryDomainMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryEntitiesToCategoryDomainMapper.kt\ncom/carrefour/fid/android/categories/data/api/datasource/CategoryEntitiesToCategoryDomainMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1603#2,9:19\n1855#2:28\n1856#2:30\n1612#2:31\n766#2:32\n857#2,2:33\n1#3:29\n*S KotlinDebug\n*F\n+ 1 CategoryEntitiesToCategoryDomainMapper.kt\ncom/carrefour/fid/android/categories/data/api/datasource/CategoryEntitiesToCategoryDomainMapperKt\n*L\n11#1:19,9\n11#1:28\n11#1:30\n11#1:31\n16#1:32\n16#1:33,2\n11#1:29\n*E\n"})
/* renamed from: com.carrefour.fid.android.categories.data.api.datasource.b */
public final class C39734b {
    @C12579k
    /* renamed from: a */
    public static final Object m162166a(@C12580l BffCategoryTreeResponse bffCategoryTreeResponse, @C12579k C28646a aVar) {
        List list;
        boolean z;
        List<BffCategoryTreeProduct> data;
        Intrinsics.checkNotNullParameter(aVar, "parsingErrorReporter");
        if (bffCategoryTreeResponse == null || (data = bffCategoryTreeResponse.getData()) == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list = new ArrayList();
            for (BffCategoryTreeProduct category : data) {
                BffCommonCategory category2 = category.getCategory();
                ProductCategory productCategory = null;
                if (category2 != null) {
                    productCategory = BffSharedMapperKt.toDomain$default(category2, aVar, (Map) null, 2, (Object) null);
                }
                if (productCategory != null) {
                    list.add(productCategory);
                }
            }
        }
        if (list.isEmpty()) {
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(new Throwable("Can't find product categories in response")));
        }
        Result.C10852a aVar3 = Result.f28060a;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((ProductCategory) next).mo117300t() != CategoryType.OTHERS) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return Result.m38702b(arrayList);
    }
}
