package com.carrefour.fid.android.various.tracking;

import androidx.annotation.Keep;
import com.contentsquare.android.C14146m;
import com.google.android.gms.tagmanager.C30999a;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/various/tracking/ContentsquareScreenviewTag;", "Lcom/google/android/gms/tagmanager/a;", "", "", "", "map", "Lkotlin/d2;", "execute", "<init>", "()V", "various_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
public final class ContentsquareScreenviewTag implements C30999a {
    public void execute(@C12579k Map<String, Object> map) {
        String str;
        Intrinsics.checkNotNullParameter(map, "map");
        Object obj = map.get("auto_screen_name");
        String str2 = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = map.get("manual_screen_name");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        }
        if (str != null) {
            C14146m.m60773z(str);
        }
        if (str2 != null) {
            C14146m.m60773z(str2);
        }
    }
}
