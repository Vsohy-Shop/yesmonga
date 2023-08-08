package com.carrefour.fid.android.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.mapper.C36467c;
import com.carrefour.fid.android.data.logm.ParsingWithLog;
import com.carrefour.fid.android.data.provider.headers.C36577s;
import com.carrefour.fid.android.data.service.C36628g;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C8567o(parameters = 0)
public final class DepartmentListRepository implements ParsingWithLog {

    /* renamed from: f */
    public static final int f90373f = 8;
    @C12579k

    /* renamed from: a */
    public final C36628g f90374a;
    @C12579k

    /* renamed from: b */
    public final C36467c f90375b;
    @C12579k

    /* renamed from: c */
    public final C36577s f90376c;
    @C12579k

    /* renamed from: d */
    public final C37694a f90377d;

    /* renamed from: e */
    public C13091w<?> f90378e;

    @Inject
    public DepartmentListRepository(@C12579k C36628g gVar, @C12579k C36467c cVar, @C12579k C36577s sVar, @C12579k C37694a aVar) {
        Intrinsics.checkNotNullParameter(gVar, "departmentsService");
        Intrinsics.checkNotNullParameter(cVar, "departmentsMapper");
        Intrinsics.checkNotNullParameter(sVar, "searchHeaders");
        Intrinsics.checkNotNullParameter(aVar, "remoteLogUseCase");
        this.f90374a = gVar;
        this.f90375b = cVar;
        this.f90376c = sVar;
        this.f90377d = aVar;
    }

    @C12580l
    /* renamed from: a */
    public Object mo111413a(@C12579k C37694a aVar, @C12579k String str, @C12579k C11045c<? super C11079d2> cVar) {
        return ParsingWithLog.DefaultImpls.m149880a(this, aVar, str, cVar);
    }

    /* renamed from: b */
    public void mo111414b(@C12579k C13091w<?> wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.f90378e = wVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111499g(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.C38039i>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.data.repositories.DepartmentListRepository$fetchDepartmentsList$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.data.repositories.DepartmentListRepository$fetchDepartmentsList$1 r0 = (com.carrefour.fid.android.data.repositories.DepartmentListRepository$fetchDepartmentsList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.DepartmentListRepository$fetchDepartmentsList$1 r0 = new com.carrefour.fid.android.data.repositories.DepartmentListRepository$fetchDepartmentsList$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.data.repositories.DepartmentListRepository$fetchDepartmentsList$2 r6 = new com.carrefour.fid.android.data.repositories.DepartmentListRepository$fetchDepartmentsList$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.DepartmentListRepository.mo111499g(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    public C13091w<?> getResponse() {
        C13091w<?> wVar = this.f90378e;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("response");
        return null;
    }
}
