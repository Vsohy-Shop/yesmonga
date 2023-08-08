package com.carrefour.fid.android.logm.data.service;

import com.carrefour.fid.android.logm.data.entities.LogRequest;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.http.C13022a;
import retrofit2.http.C13037p;
import retrofit2.http.C13040s;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/logm/data/service/a;", "", "", "domain", "", "Lcom/carrefour/fid/android/logm/data/entities/LogRequest;", "body", "Lkotlin/d2;", "a", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/c;)Ljava/lang/Object;", "logM_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.logm.data.service.a */
public interface C38276a {
    @C12580l
    @C13037p("/{domain}/ingestion-api-push/main/oneapp")
    /* renamed from: a */
    Object mo119872a(@C13040s("domain") @C12579k String str, @C12579k @C13022a List<LogRequest> list, @C12579k C11045c<? super C11079d2> cVar);
}
