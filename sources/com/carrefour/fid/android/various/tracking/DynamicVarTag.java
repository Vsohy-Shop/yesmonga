package com.carrefour.fid.android.various.tracking;

import androidx.annotation.Keep;
import com.contentsquare.android.C14146m;
import com.google.android.gms.tagmanager.C30999a;
import com.google.firebase.crashlytics.internal.analytics.C32659d;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/various/tracking/DynamicVarTag;", "Lcom/google/android/gms/tagmanager/a;", "", "", "", "parameters", "Lkotlin/d2;", "execute", "<init>", "()V", "various_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
public final class DynamicVarTag implements C30999a {
    public void execute(@C12579k Map<String, Object> map) {
        String str;
        Intrinsics.checkNotNullParameter(map, C32659d.f79228c);
        Object obj = map.get("cs_dynamic_var_key");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str != null) {
            Object obj2 = map.get("cs_dynamic_var_value");
            if (obj2 instanceof String) {
                C14146m.m60741B(str, (String) obj2);
            } else if (obj2 instanceof Long) {
                C14146m.m60740A(str, ((Number) obj2).longValue());
            }
        }
    }
}
