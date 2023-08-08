package androidx.compose.p004ui.graphics.drawscope;

import androidx.compose.p004ui.graphics.C15281o2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,178:1\n37#1:179\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n49#1:179\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.drawscope.j */
public final class C15195j {
    /* renamed from: a */
    public static final void m65826a(@C12579k C15193i iVar, float f) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        iVar.mo42715n(f, f, f, f);
    }

    /* renamed from: b */
    public static final void m65827b(@C12579k C15193i iVar, float f, float f2) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        iVar.mo42715n(f, f2, f, f2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m65828c(C15193i iVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        iVar.mo42715n(f, f2, f, f2);
    }

    /* renamed from: d */
    public static final void m65829d(@C12579k C15193i iVar, float f, long j) {
        Intrinsics.checkNotNullParameter(iVar, "$this$rotateRad");
        iVar.mo42714k(C15281o2.m66362a(f), j);
    }

    /* renamed from: e */
    public static /* synthetic */ void m65830e(C15193i iVar, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = iVar.mo42707U();
        }
        Intrinsics.checkNotNullParameter(iVar, "$this$rotateRad");
        iVar.mo42714k(C15281o2.m66362a(f), j);
    }

    /* renamed from: f */
    public static final void m65831f(@C12579k C15193i iVar, float f, long j) {
        Intrinsics.checkNotNullParameter(iVar, "$this$scale");
        iVar.mo42713j(f, f, j);
    }

    /* renamed from: g */
    public static /* synthetic */ void m65832g(C15193i iVar, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = iVar.mo42707U();
        }
        Intrinsics.checkNotNullParameter(iVar, "$this$scale");
        iVar.mo42713j(f, f, j);
    }
}
