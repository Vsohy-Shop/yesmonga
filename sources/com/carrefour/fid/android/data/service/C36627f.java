package com.carrefour.fid.android.data.service;

import com.carrefour.fid.android.data.entities.AdServingCriteoResponse;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13027f;
import retrofit2.http.C13031j;
import retrofit2.http.C13042u;
import retrofit2.http.C13046y;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JE\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJE\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ9\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/service/f;", "", "", "", "headerMap", "parameters", "Lretrofit2/w;", "Lcom/carrefour/fid/android/data/entities/AdServingCriteoResponse;", "c", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "a", "trackingUrl", "Lkotlin/d2;", "b", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.data.service.f */
public interface C36627f {
    @C12580l
    @C13027f("delivery/retailmedia")
    /* renamed from: a */
    Object mo111639a(@C12579k @C13031j Map<String, String> map, @C12579k @C13042u Map<String, String> map2, @C12579k C11045c<? super C13091w<AdServingCriteoResponse>> cVar);

    @C12580l
    @C13027f
    /* renamed from: b */
    Object mo111640b(@C12579k @C13031j Map<String, String> map, @C12579k @C13046y String str, @C12579k C11045c<? super C13091w<C11079d2>> cVar);

    @C12580l
    @C13027f("delivery/retailmedia")
    /* renamed from: c */
    Object mo111641c(@C12579k @C13031j Map<String, String> map, @C12579k @C13042u Map<String, String> map2, @C12579k C11045c<? super C13091w<AdServingCriteoResponse>> cVar);
}
