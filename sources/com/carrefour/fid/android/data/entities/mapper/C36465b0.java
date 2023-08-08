package com.carrefour.fid.android.data.entities.mapper;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.base.C28486g;
import java.util.ArrayList;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11363r0;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nBundleMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/BundleMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,11:1\n1#2:12\n125#3:13\n152#3,3:14\n*S KotlinDebug\n*F\n+ 1 BundleMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/BundleMapper\n*L\n9#1:13\n9#1:14,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.mapper.b0 */
public final class C36465b0 extends C28486g<Map<String, ? extends String>, Bundle> {

    /* renamed from: b */
    public static final int f90154b = 0;

    @C12579k
    /* renamed from: d */
    public Bundle mo72340a(@C12580l Map<String, String> map) {
        String str;
        Bundle bundle = new Bundle();
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry next : map.entrySet()) {
                if ((!C11622t.isBlank((CharSequence) next.getKey())) && (str = (String) next.getValue()) != null) {
                    bundle.putString((String) next.getKey(), str);
                }
                arrayList.add(C11079d2.f28267a);
            }
        }
        return bundle;
    }
}
