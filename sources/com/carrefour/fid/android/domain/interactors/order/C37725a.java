package com.carrefour.fid.android.domain.interactors.order;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.additionalorder.C37540a;
import com.carrefour.fid.android.domain.models.additionalorder.C37952a;
import com.carrefour.fid.android.domain.repositories.C38192a;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.interactors.order.a */
public final class C37725a implements C37540a {

    /* renamed from: b */
    public static final int f94706b = 8;
    @C12579k

    /* renamed from: a */
    public final C38192a f94707a;

    @Inject
    public C37725a(@C12579k C38192a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "additionalOrderRepository");
        this.f94707a = aVar;
    }

    @C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    public Object m172986invokeIoAF18A(@C12579k C11045c<? super Result<C37952a>> cVar) {
        Result.C10852a aVar = Result.f28060a;
        return Result.m38702b(CollectionsKt___CollectionsKt.m40479B2(this.f94707a.mo111576b().mo24203d()));
    }
}
