package com.carrefour.fid.android.domain.repositories;

import com.carrefour.fid.android.domain.models.CategoryModel;
import com.carrefour.fid.android.domain.models.LuckyCartTicketDomain;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import java.util.HashMap;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.repositories.e */
public interface C38196e {
    @C12580l
    /* renamed from: b */
    Object mo111511b(@C12580l OrderConfirmationModel orderConfirmationModel, @C12579k HashMap<String, CategoryModel> hashMap, @C12579k C11045c<? super Result<LuckyCartTicketDomain>> cVar);
}
