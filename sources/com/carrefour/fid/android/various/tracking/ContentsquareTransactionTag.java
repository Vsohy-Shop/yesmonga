package com.carrefour.fid.android.various.tracking;

import androidx.annotation.Keep;
import com.contentsquare.android.C14146m;
import com.contentsquare.android.api.model.C14103e;
import com.google.android.gms.tagmanager.C30999a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/various/tracking/ContentsquareTransactionTag;", "Lcom/google/android/gms/tagmanager/a;", "", "", "", "map", "Lkotlin/d2;", "execute", "<init>", "()V", "various_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
public final class ContentsquareTransactionTag implements C30999a {
    public void execute(@C12579k Map<String, Object> map) {
        Double d;
        String str;
        Intrinsics.checkNotNullParameter(map, "map");
        Object obj = map.get("value");
        String str2 = null;
        if (obj instanceof Double) {
            d = (Double) obj;
        } else {
            d = null;
        }
        Object obj2 = map.get(FirebaseAnalytics.C32532b.f78955i);
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        if (d != null && str != null) {
            C14103e.C14104a b = C14103e.m60627b((float) d.doubleValue(), str);
            Object obj3 = map.get("id");
            if (obj3 instanceof String) {
                str2 = (String) obj3;
            }
            if (str2 != null) {
                b.mo34351e(str2);
            }
            C14146m.m60772y(b.mo34350d());
        }
    }
}
