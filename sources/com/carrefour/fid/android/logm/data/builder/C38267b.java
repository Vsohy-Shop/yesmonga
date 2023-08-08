package com.carrefour.fid.android.logm.data.builder;

import com.carrefour.fid.android.domain.models.logm.LogMEntry;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.C33623h;
import com.google.gson.C33701m;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.Map;
import kotlin.C11395k;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "Shoudn't be needed with new implementation")
@C11363r0({"SMAP\nSendLogRequestBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendLogRequestBuilder.kt\ncom/carrefour/fid/android/logm/data/builder/SendLogRequestBuilder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,42:1\n13579#2,2:43\n215#3,2:45\n*S KotlinDebug\n*F\n+ 1 SendLogRequestBuilder.kt\ncom/carrefour/fid/android/logm/data/builder/SendLogRequestBuilder\n*L\n15#1:43,2\n27#1:45,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.logm.data.builder.b */
public final class C38267b {
    @C12579k
    /* renamed from: a */
    public final C38266a mo119710a(@C12579k LogMEntry[] logMEntryArr) {
        Map map;
        Intrinsics.checkNotNullParameter(logMEntryArr, C10108c.f27798a);
        C33623h hVar = new C33623h();
        for (LogMEntry convertValue : logMEntryArr) {
            Object convertValue2 = new ObjectMapper().convertValue((Object) convertValue, Map.class);
            if (convertValue2 instanceof Map) {
                map = (Map) convertValue2;
            } else {
                map = null;
            }
            hVar.mo97541m0(mo119711b(map));
        }
        return new C38266a(hVar);
    }

    /* renamed from: b */
    public final C33701m mo119711b(Map<String, ? extends Object> map) {
        boolean z;
        C33701m mVar = new C33701m();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                Object value = next.getValue();
                if (value instanceof String) {
                    Object value2 = next.getValue();
                    Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) value2;
                    if (str.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        mVar.mo97790r0((String) next.getKey(), str);
                    }
                } else if (value instanceof Long) {
                    Object value3 = next.getValue();
                    Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Long");
                    mVar.mo97789p0((String) next.getKey(), (Long) value3);
                }
            }
        }
        return mVar;
    }
}
