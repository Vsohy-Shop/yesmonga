package androidx.compose.p004ui.graphics;

import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidPathMeasure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,86:1\n35#2,5:87\n35#2,5:92\n*S KotlinDebug\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n*L\n43#1:87,5\n49#1:92,5\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.r0 */
public final class C15305r0 implements C15259l3 {
    @C12579k

    /* renamed from: a */
    public final PathMeasure f37658a;
    @C12580l

    /* renamed from: b */
    public float[] f37659b;
    @C12580l

    /* renamed from: c */
    public float[] f37660c;

    public C15305r0(@C12579k PathMeasure pathMeasure) {
        Intrinsics.checkNotNullParameter(pathMeasure, "internalPathMeasure");
        this.f37658a = pathMeasure;
    }

    /* renamed from: a */
    public long mo42882a(float f) {
        if (this.f37659b == null) {
            this.f37659b = new float[2];
        }
        if (this.f37660c == null) {
            this.f37660c = new float[2];
        }
        if (!this.f37658a.getPosTan(f, this.f37659b, this.f37660c)) {
            return C15094f.f37256b.mo42247c();
        }
        float[] fArr = this.f37660c;
        Intrinsics.checkNotNull(fArr);
        float f2 = fArr[0];
        float[] fArr2 = this.f37660c;
        Intrinsics.checkNotNull(fArr2);
        return C15096g.m64898a(f2, fArr2[1]);
    }

    /* renamed from: b */
    public boolean mo42883b(float f, float f2, @C12579k C15231i3 i3Var, boolean z) {
        Intrinsics.checkNotNullParameter(i3Var, FirebaseAnalytics.C32532b.f78977z);
        PathMeasure pathMeasure = this.f37658a;
        if (i3Var instanceof C15279o0) {
            return pathMeasure.getSegment(f, f2, ((C15279o0) i3Var).mo42922y(), z);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: c */
    public void mo42884c(@C12580l C15231i3 i3Var, boolean z) {
        Path path;
        PathMeasure pathMeasure = this.f37658a;
        if (i3Var == null) {
            path = null;
        } else if (i3Var instanceof C15279o0) {
            path = ((C15279o0) i3Var).mo42922y();
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure.setPath(path, z);
    }

    /* renamed from: d */
    public long mo42885d(float f) {
        if (this.f37659b == null) {
            this.f37659b = new float[2];
        }
        if (this.f37660c == null) {
            this.f37660c = new float[2];
        }
        if (!this.f37658a.getPosTan(f, this.f37659b, this.f37660c)) {
            return C15094f.f37256b.mo42247c();
        }
        float[] fArr = this.f37659b;
        Intrinsics.checkNotNull(fArr);
        float f2 = fArr[0];
        float[] fArr2 = this.f37659b;
        Intrinsics.checkNotNull(fArr2);
        return C15096g.m64898a(f2, fArr2[1]);
    }

    /* renamed from: f */
    public float mo42886f() {
        return this.f37658a.getLength();
    }
}
