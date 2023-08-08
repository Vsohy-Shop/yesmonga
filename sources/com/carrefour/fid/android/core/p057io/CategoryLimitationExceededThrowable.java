package com.carrefour.fid.android.core.p057io;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.CategoryLimitDomain;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/CategoryLimitationExceededThrowable;", "", "Lcom/carrefour/fid/android/domain/models/CategoryLimitDomain;", "categoryLimitDomain", "Lcom/carrefour/fid/android/domain/models/CategoryLimitDomain;", "a", "()Lcom/carrefour/fid/android/domain/models/CategoryLimitDomain;", "<init>", "(Lcom/carrefour/fid/android/domain/models/CategoryLimitDomain;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.io.CategoryLimitationExceededThrowable */
public final class CategoryLimitationExceededThrowable extends Throwable {

    /* renamed from: a */
    public static final int f89674a = 0;
    @C12580l
    private final CategoryLimitDomain categoryLimitDomain;

    public CategoryLimitationExceededThrowable(@C12580l CategoryLimitDomain categoryLimitDomain2) {
        super("Categorys's quantity limit exceeded.");
        this.categoryLimitDomain = categoryLimitDomain2;
    }

    @C12580l
    /* renamed from: a */
    public final CategoryLimitDomain mo108325a() {
        return this.categoryLimitDomain;
    }
}
