package com.carrefour.fid.android.categories.domain.datasource;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.category.C37992a;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public interface DriveOmrAvailabilityApi {

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/categories/domain/datasource/DriveOmrAvailabilityApi$OmrDriveUnavailable;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "categories_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    public static final class OmrDriveUnavailable extends Exception {

        /* renamed from: a */
        public static final int f101443a = 0;
    }

    @C12580l
    /* renamed from: a */
    Object mo131019a(@C12579k String str, @C12579k C11045c<? super Result<C37992a>> cVar);
}
