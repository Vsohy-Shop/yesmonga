package com.carrefour.fid.android.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.additionalorder.C37952a;
import com.carrefour.fid.android.domain.repositories.C38192a;
import javax.inject.Singleton;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.repositories.c */
public final class C36590c implements C38192a {

    /* renamed from: b */
    public static final int f90459b = 8;
    @C12579k

    /* renamed from: a */
    public final C11940j<C37952a> f90460a = C11953v.m47628a(null);

    @C12580l
    /* renamed from: a */
    public Object mo111575a(@C12580l C37952a aVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object emit = this.f90460a.emit(aVar, cVar);
        return emit == C11063b.m42612h() ? emit : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: b */
    public C11952u<C37952a> mo111576b() {
        return C11909g.m47470m(this.f90460a);
    }
}
