package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.graphics.v0 */
public final class C17649v0 {
    @C12579k
    /* renamed from: a */
    public static final Picture m80767a(@C12579k Picture picture, int i, int i2, @C12579k C11300l<? super Canvas, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(picture, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        Canvas beginRecording = picture.beginRecording(i, i2);
        Intrinsics.checkNotNullExpressionValue(beginRecording, "beginRecording(width, height)");
        try {
            lVar.invoke(beginRecording);
            return picture;
        } finally {
            C11322b0.m43481d(1);
            picture.endRecording();
            C11322b0.m43480c(1);
        }
    }
}
