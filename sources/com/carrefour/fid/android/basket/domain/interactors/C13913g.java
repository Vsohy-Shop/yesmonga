package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37573h;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.basket.domain.interactors.g */
public final class C13913g implements C37573h {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33942a;

    @Inject
    public C13913g(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        this.f33942a = basketRepository;
    }

    @C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    public Object m172778invokeIoAF18A(@C12579k C11045c<? super Result<C11079d2>> cVar) {
        try {
            Result.C10852a aVar = Result.f28060a;
            this.f33942a.mo33384h();
            return Result.m38702b(C11079d2.f28267a);
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(th));
        }
    }
}
