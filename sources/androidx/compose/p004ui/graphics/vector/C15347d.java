package androidx.compose.p004ui.graphics.vector;

import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.vector.C15340c;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 2 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,768:1\n53#2,4:769\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n*L\n707#1:769,4\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.d */
public final class C15347d {
    @C12579k
    /* renamed from: d */
    public static final C15340c.C15341a m66972d(@C12579k C15340c.C15341a aVar, @C12579k String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, @C12579k List<? extends C15349f> list, @C12579k C11300l<? super C15340c.C15341a, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(list, "clipPathData");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        aVar.mo43181a(str, f, f2, f3, f4, f5, f6, f7, list);
        lVar.invoke(aVar);
        aVar.mo43185g();
        return aVar;
    }

    /* renamed from: e */
    public static /* synthetic */ C15340c.C15341a m66973e(C15340c.C15341a aVar, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, C11300l lVar, int i, Object obj) {
        String str2;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        List<C15349f> list2;
        C15340c.C15341a aVar2 = aVar;
        C11300l lVar2 = lVar;
        int i2 = i;
        if ((i2 & 1) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        if ((i2 & 2) != 0) {
            f8 = 0.0f;
        } else {
            f8 = f;
        }
        if ((i2 & 4) != 0) {
            f9 = 0.0f;
        } else {
            f9 = f2;
        }
        if ((i2 & 8) != 0) {
            f10 = 0.0f;
        } else {
            f10 = f3;
        }
        float f14 = 1.0f;
        if ((i2 & 16) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f4;
        }
        if ((i2 & 32) == 0) {
            f14 = f5;
        }
        if ((i2 & 64) != 0) {
            f12 = 0.0f;
        } else {
            f12 = f6;
        }
        if ((i2 & 128) != 0) {
            f13 = 0.0f;
        } else {
            f13 = f7;
        }
        if ((i2 & 256) != 0) {
            list2 = C15380n.m67243h();
        } else {
            list2 = list;
        }
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(list2, "clipPathData");
        Intrinsics.checkNotNullParameter(lVar2, C28534f.f69159i0);
        aVar.mo43181a(str2, f8, f9, f10, f11, f14, f12, f13, list2);
        lVar2.invoke(aVar);
        aVar.mo43185g();
        return aVar2;
    }

    @C12579k
    /* renamed from: f */
    public static final C15340c.C15341a m66974f(@C12579k C15340c.C15341a aVar, @C12579k String str, @C12580l C15421z1 z1Var, float f, @C12580l C15421z1 z1Var2, float f2, float f3, int i, int i2, float f4, int i3, @C12579k C11300l<? super C15348e, C11079d2> lVar) {
        C11300l<? super C15348e, C11079d2> lVar2 = lVar;
        int i4 = i3;
        Intrinsics.checkNotNullParameter(aVar, "$this$path");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(lVar2, "pathBuilder");
        C15348e eVar = new C15348e();
        lVar2.invoke(eVar);
        return C15340c.C15341a.m66873d(aVar, eVar.mo43271g(), i4, str, z1Var, f, z1Var2, f2, f3, i, i2, f4, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
    }

    /* renamed from: g */
    public static /* synthetic */ C15340c.C15341a m66975g(C15340c.C15341a aVar, String str, C15421z1 z1Var, float f, C15421z1 z1Var2, float f2, float f3, int i, int i2, float f4, int i3, C11300l lVar, int i4, Object obj) {
        String str2;
        C15421z1 z1Var3;
        float f5;
        C15421z1 z1Var4;
        float f6;
        float f7;
        int i5;
        int i6;
        float f8;
        int i7;
        C11300l lVar2 = lVar;
        int i8 = i4;
        if ((i8 & 1) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        if ((i8 & 2) != 0) {
            z1Var3 = null;
        } else {
            z1Var3 = z1Var;
        }
        if ((i8 & 4) != 0) {
            f5 = 1.0f;
        } else {
            f5 = f;
        }
        if ((i8 & 8) != 0) {
            z1Var4 = null;
        } else {
            z1Var4 = z1Var2;
        }
        if ((i8 & 16) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f2;
        }
        if ((i8 & 32) != 0) {
            f7 = 0.0f;
        } else {
            f7 = f3;
        }
        if ((i8 & 64) != 0) {
            i5 = C15380n.m67239d();
        } else {
            i5 = i;
        }
        if ((i8 & 128) != 0) {
            i6 = C15380n.m67240e();
        } else {
            i6 = i2;
        }
        if ((i8 & 256) != 0) {
            f8 = 4.0f;
        } else {
            f8 = f4;
        }
        if ((i8 & 512) != 0) {
            i7 = C15380n.m67238c();
        } else {
            i7 = i3;
        }
        Intrinsics.checkNotNullParameter(aVar, "$this$path");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(lVar2, "pathBuilder");
        C15348e eVar = new C15348e();
        lVar2.invoke(eVar);
        return C15340c.C15341a.m66873d(aVar, eVar.mo43271g(), i7, str2, z1Var3, f5, z1Var4, f6, f7, i5, i6, f8, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
    }

    /* renamed from: h */
    public static final <T> T m66976h(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: i */
    public static final <T> T m66977i(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: j */
    public static final <T> boolean m66978j(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }
}
