package androidx.compose.p004ui.text.platform.style;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15244j4;
import androidx.compose.p004ui.graphics.C15253k4;
import androidx.compose.p004ui.graphics.C15297q0;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.graphics.drawscope.C15197l;
import androidx.compose.p004ui.graphics.drawscope.C15198m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.platform.style.a */
public final class C16391a extends CharacterStyle implements UpdateAppearance {
    @C12579k

    /* renamed from: a */
    public final C15192h f40644a;

    public C16391a(@C12579k C15192h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "drawStyle");
        this.f40644a = hVar;
    }

    @C12579k
    /* renamed from: a */
    public final C15192h mo47560a() {
        return this.f40644a;
    }

    /* renamed from: b */
    public final Paint.Cap mo47561b(int i) {
        C15244j4.C15245a aVar = C15244j4.f37564b;
        if (C15244j4.m66129g(i, aVar.mo42862a())) {
            return Paint.Cap.BUTT;
        }
        if (C15244j4.m66129g(i, aVar.mo42863b())) {
            return Paint.Cap.ROUND;
        }
        if (C15244j4.m66129g(i, aVar.mo42864c())) {
            return Paint.Cap.SQUARE;
        }
        return Paint.Cap.BUTT;
    }

    /* renamed from: c */
    public final Paint.Join mo47562c(int i) {
        C15253k4.C15254a aVar = C15253k4.f37575b;
        if (C15253k4.m66165g(i, aVar.mo42880b())) {
            return Paint.Join.MITER;
        }
        if (C15253k4.m66165g(i, aVar.mo42881c())) {
            return Paint.Join.ROUND;
        }
        if (C15253k4.m66165g(i, aVar.mo42879a())) {
            return Paint.Join.BEVEL;
        }
        return Paint.Join.MITER;
    }

    public void updateDrawState(@C12580l TextPaint textPaint) {
        PathEffect pathEffect;
        if (textPaint != null) {
            C15192h hVar = this.f40644a;
            if (Intrinsics.areEqual((Object) hVar, (Object) C15197l.f37504a)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (hVar instanceof C15198m) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((C15198m) this.f40644a).mo42726g());
                textPaint.setStrokeMiter(((C15198m) this.f40644a).mo42723e());
                textPaint.setStrokeJoin(mo47562c(((C15198m) this.f40644a).mo42722d()));
                textPaint.setStrokeCap(mo47561b(((C15198m) this.f40644a).mo42721c()));
                C15242j3 f = ((C15198m) this.f40644a).mo42725f();
                if (f != null) {
                    pathEffect = C15297q0.m66437e(f);
                } else {
                    pathEffect = null;
                }
                textPaint.setPathEffect(pathEffect);
            }
        }
    }
}
