package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.C30009c;
import com.google.android.gms.internal.mlkit_vision_text_common.C30106k0;
import com.google.android.gms.internal.mlkit_vision_text_common.C30248va;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.mlkit.vision.text.C34049b;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.mlkit.vision.text.internal.f */
public final /* synthetic */ class C34089f implements C30248va {

    /* renamed from: a */
    public static final /* synthetic */ C34089f f82748a = new C34089f();

    /* renamed from: b */
    public final Object mo85367b(Object obj) {
        String str;
        String str2;
        zzl zzl = (zzl) obj;
        List<Point> b = C34086c.m137040b(zzl.f72622b);
        if (C30009c.m121601b(zzl.f72625e)) {
            str = "";
        } else {
            str = zzl.f72625e;
        }
        String str3 = str;
        Rect a = C34086c.m137039a(b);
        if (C30009c.m121601b(zzl.f72627g)) {
            str2 = "und";
        } else {
            str2 = zzl.f72627g;
        }
        return new C34049b.C34051b(str3, a, b, str2, C30106k0.m121751a(Arrays.asList(zzl.f72621a), C34090g.f82749a));
    }
}
