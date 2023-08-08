package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.C30009c;
import com.google.android.gms.internal.mlkit_vision_text_common.C30248va;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import com.google.mlkit.vision.text.C34049b;
import java.util.List;

/* renamed from: com.google.mlkit.vision.text.internal.g */
public final /* synthetic */ class C34090g implements C30248va {

    /* renamed from: a */
    public static final /* synthetic */ C34090g f82749a = new C34090g();

    /* renamed from: b */
    public final Object mo85367b(Object obj) {
        String str;
        String str2;
        zzr zzr = (zzr) obj;
        List<Point> b = C34086c.m137040b(zzr.f72655b);
        if (C30009c.m121601b(zzr.f72657d)) {
            str = "";
        } else {
            str = zzr.f72657d;
        }
        Rect a = C34086c.m137039a(b);
        if (C30009c.m121601b(zzr.f72659f)) {
            str2 = "und";
        } else {
            str2 = zzr.f72659f;
        }
        return new C34049b.C34050a(str, a, b, str2);
    }
}
