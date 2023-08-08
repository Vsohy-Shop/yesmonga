package com.carrefour.fid.android.product.domain.interactors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.product.C37786s;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.domain.interactors.y */
public final class C27580y implements C37786s {

    /* renamed from: b */
    public static final int f66992b = 8;

    /* renamed from: a */
    public boolean f66993a;

    /* renamed from: b */
    public void mo80057b() {
        this.f66993a = false;
    }

    /* renamed from: d */
    public void mo80058d() {
        this.f66993a = true;
    }

    @C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    public Object m172822invokeIoAF18A(@C12579k C11045c<? super Result<Boolean>> cVar) {
        Result.C10852a aVar = Result.f28060a;
        return Result.m38702b(C11064a.m42615a(this.f66993a));
    }
}
