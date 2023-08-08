package com.google.mlkit.vision.text.bundled.common;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29457lr;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29980zw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbrw;
import java.util.List;

/* renamed from: com.google.mlkit.vision.text.bundled.common.o */
public final /* synthetic */ class C34069o implements C29457lr {

    /* renamed from: a */
    public final /* synthetic */ Matrix f82717a;

    public /* synthetic */ C34069o(Matrix matrix) {
        this.f82717a = matrix;
    }

    /* renamed from: a */
    public final Object mo84712a(Object obj) {
        String str;
        String str2;
        Matrix matrix = this.f82717a;
        C29980zw zwVar = (C29980zw) obj;
        List<Point> b = C34064j.m136992b(zwVar.mo85022v());
        if (zwVar.mo85021B()) {
            str = zwVar.mo85024y();
        } else {
            str = "";
        }
        Rect a = C34064j.m136991a(b, matrix);
        if (zwVar.mo85020A()) {
            str2 = zwVar.mo85023x();
        } else {
            str2 = "und";
        }
        return new zbrw(str, a, b, str2);
    }
}
