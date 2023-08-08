package androidx.compose.runtime;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.C11288f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
public final class Updater<T> {
    @C12579k

    /* renamed from: a */
    public final C8592o f22756a;

    public /* synthetic */ Updater(C8592o oVar) {
        this.f22756a = oVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ Updater m30179a(C8592o oVar) {
        return new Updater(oVar);
    }

    @C12579k
    /* renamed from: b */
    public static <T> C8592o m30180b(@C12579k C8592o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "composer");
        return oVar;
    }

    /* renamed from: c */
    public static boolean m30181c(C8592o oVar, Object obj) {
        return (obj instanceof Updater) && Intrinsics.areEqual((Object) oVar, (Object) ((Updater) obj).mo15317l());
    }

    /* renamed from: d */
    public static final boolean m30182d(C8592o oVar, C8592o oVar2) {
        return Intrinsics.areEqual((Object) oVar, (Object) oVar2);
    }

    @C11532s0
    /* renamed from: e */
    public static /* synthetic */ void m30183e() {
    }

    /* renamed from: f */
    public static int m30184f(C8592o oVar) {
        return oVar.hashCode();
    }

    /* renamed from: g */
    public static final void m30185g(C8592o oVar, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (oVar.mo14997l()) {
            oVar.mo15029v(C11079d2.f28267a, new Updater$init$1(lVar));
        }
    }

    /* renamed from: h */
    public static final void m30186h(C8592o oVar, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        oVar.mo15029v(C11079d2.f28267a, new Updater$reconcile$1(lVar));
    }

    /* renamed from: i */
    public static final void m30187i(C8592o oVar, int i, @C12579k C11304p<? super T, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        if (oVar.mo14997l() || !Intrinsics.areEqual(oVar.mo14921N(), (Object) Integer.valueOf(i))) {
            oVar.mo14893C(Integer.valueOf(i));
            oVar.mo15029v(Integer.valueOf(i), pVar);
        }
    }

    /* renamed from: j */
    public static final <V> void m30188j(C8592o oVar, V v, @C12579k C11304p<? super T, ? super V, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        if (oVar.mo14997l() || !Intrinsics.areEqual(oVar.mo14921N(), (Object) v)) {
            oVar.mo14893C(v);
            oVar.mo15029v(v, pVar);
        }
    }

    /* renamed from: k */
    public static String m30189k(C8592o oVar) {
        return "Updater(composer=" + oVar + ')';
    }

    /* renamed from: m */
    public static final void m30190m(C8592o oVar, int i, @C12579k C11304p<? super T, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        boolean l = oVar.mo14997l();
        if (l || !Intrinsics.areEqual(oVar.mo14921N(), (Object) Integer.valueOf(i))) {
            oVar.mo14893C(Integer.valueOf(i));
            if (!l) {
                oVar.mo15029v(Integer.valueOf(i), pVar);
            }
        }
    }

    /* renamed from: n */
    public static final <V> void m30191n(C8592o oVar, V v, @C12579k C11304p<? super T, ? super V, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        boolean l = oVar.mo14997l();
        if (l || !Intrinsics.areEqual(oVar.mo14921N(), (Object) v)) {
            oVar.mo14893C(v);
            if (!l) {
                oVar.mo15029v(v, pVar);
            }
        }
    }

    public boolean equals(Object obj) {
        return m30181c(this.f22756a, obj);
    }

    public int hashCode() {
        return m30184f(this.f22756a);
    }

    /* renamed from: l */
    public final /* synthetic */ C8592o mo15317l() {
        return this.f22756a;
    }

    public String toString() {
        return m30189k(this.f22756a);
    }
}
