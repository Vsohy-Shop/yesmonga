package com.carrefour.fid.android.product.domain.interactors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.product.C37802t;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.domain.interactors.a0 */
public final class C27550a0 implements C37802t {

    /* renamed from: b */
    public static final int f66914b = 8;

    /* renamed from: a */
    public boolean f66915a;

    public void clear() {
        this.f66915a = true;
    }

    @C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    public Object m172821invokeIoAF18A(@C12579k C11045c<? super Result<Boolean>> cVar) {
        boolean z = this.f66915a;
        this.f66915a = false;
        Result.C10852a aVar = Result.f28060a;
        return Result.m38702b(C11064a.m42615a(z));
    }
}
