package androidx.compose.p004ui;

import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8592o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.ComposedModifierKt */
public final class ComposedModifierKt {
    @C8761g
    @C12579k
    /* renamed from: a */
    public static final C8767m m32278a(@C12579k C8767m mVar, @C12579k String str, @C12580l Object obj, @C12580l Object obj2, @C12580l Object obj3, @C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12579k C11305q<? super C8767m, ? super C8592o, ? super Integer, ? extends C8767m> qVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "fullyQualifiedName");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        Intrinsics.checkNotNullParameter(qVar, "factory");
        return mVar.mo17224k3(new C8765k(str, obj, obj2, obj3, lVar, qVar));
    }

    @C8761g
    @C12579k
    /* renamed from: b */
    public static final C8767m m32279b(@C12579k C8767m mVar, @C12579k String str, @C12580l Object obj, @C12580l Object obj2, @C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12579k C11305q<? super C8767m, ? super C8592o, ? super Integer, ? extends C8767m> qVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "fullyQualifiedName");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        Intrinsics.checkNotNullParameter(qVar, "factory");
        return mVar.mo17224k3(new C8764j(str, obj, obj2, lVar, qVar));
    }

    @C8761g
    @C12579k
    /* renamed from: c */
    public static final C8767m m32280c(@C12579k C8767m mVar, @C12579k String str, @C12580l Object obj, @C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12579k C11305q<? super C8767m, ? super C8592o, ? super Integer, ? extends C8767m> qVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "fullyQualifiedName");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        Intrinsics.checkNotNullParameter(qVar, "factory");
        return mVar.mo17224k3(new C8763i(str, obj, lVar, qVar));
    }

    @C8761g
    @C12579k
    /* renamed from: d */
    public static final C8767m m32281d(@C12579k C8767m mVar, @C12579k String str, @C12579k Object[] objArr, @C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12579k C11305q<? super C8767m, ? super C8592o, ? super Integer, ? extends C8767m> qVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "fullyQualifiedName");
        Intrinsics.checkNotNullParameter(objArr, "keys");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        Intrinsics.checkNotNullParameter(qVar, "factory");
        return mVar.mo17224k3(new C8766l(str, objArr, lVar, qVar));
    }

    @C12579k
    /* renamed from: e */
    public static final C8767m m32282e(@C12579k C8767m mVar, @C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12579k C11305q<? super C8767m, ? super C8592o, ? super Integer, ? extends C8767m> qVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        Intrinsics.checkNotNullParameter(qVar, "factory");
        return mVar.mo17224k3(new C8760f(lVar, qVar));
    }

    /* renamed from: f */
    public static /* synthetic */ C8767m m32283f(C8767m mVar, String str, Object obj, Object obj2, Object obj3, C11300l<C15983v0, C11079d2> lVar, C11305q qVar, int i, Object obj4) {
        if ((i & 16) != 0) {
            lVar = InspectableValueKt.m71060b();
        }
        return m32278a(mVar, str, obj, obj2, obj3, lVar, qVar);
    }

    /* renamed from: g */
    public static /* synthetic */ C8767m m32284g(C8767m mVar, String str, Object obj, Object obj2, C11300l<C15983v0, C11079d2> lVar, C11305q qVar, int i, Object obj3) {
        if ((i & 8) != 0) {
            lVar = InspectableValueKt.m71060b();
        }
        return m32279b(mVar, str, obj, obj2, lVar, qVar);
    }

    /* renamed from: h */
    public static /* synthetic */ C8767m m32285h(C8767m mVar, String str, Object obj, C11300l<C15983v0, C11079d2> lVar, C11305q qVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            lVar = InspectableValueKt.m71060b();
        }
        return m32280c(mVar, str, obj, lVar, qVar);
    }

    /* renamed from: i */
    public static /* synthetic */ C8767m m32286i(C8767m mVar, String str, Object[] objArr, C11300l<C15983v0, C11079d2> lVar, C11305q qVar, int i, Object obj) {
        if ((i & 4) != 0) {
            lVar = InspectableValueKt.m71060b();
        }
        return m32281d(mVar, str, objArr, lVar, qVar);
    }

    /* renamed from: j */
    public static /* synthetic */ C8767m m32287j(C8767m mVar, C11300l<C15983v0, C11079d2> lVar, C11305q qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = InspectableValueKt.m71060b();
        }
        return m32282e(mVar, lVar, qVar);
    }

    @C12579k
    /* renamed from: k */
    public static final C8767m m32288k(@C12579k C8592o oVar, @C12579k C8767m mVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "modifier");
        if (mVar.mo17001A(ComposedModifierKt$materialize$1.f23341f)) {
            return mVar;
        }
        oVar.mo14918M(1219399079);
        C8767m mVar2 = (C8767m) mVar.mo17009w(C8767m.f23478j, new ComposedModifierKt$materialize$result$1(oVar));
        oVar.mo15002m0();
        return mVar2;
    }
}
