package androidx.compose.runtime;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.C11288f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.runtime.u1 */
public final class C8684u1<T> {
    @C12579k

    /* renamed from: a */
    public final C8592o f23248a;

    public /* synthetic */ C8684u1(C8592o oVar) {
        this.f23248a = oVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C8684u1 m31905a(C8592o oVar) {
        return new C8684u1(oVar);
    }

    @C12579k
    /* renamed from: b */
    public static <T> C8592o m31906b(@C12579k C8592o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "composer");
        return oVar;
    }

    /* renamed from: c */
    public static boolean m31907c(C8592o oVar, Object obj) {
        return (obj instanceof C8684u1) && Intrinsics.areEqual((Object) oVar, (Object) ((C8684u1) obj).mo16772h());
    }

    /* renamed from: d */
    public static final boolean m31908d(C8592o oVar, C8592o oVar2) {
        return Intrinsics.areEqual((Object) oVar, (Object) oVar2);
    }

    @C11532s0
    /* renamed from: e */
    public static /* synthetic */ void m31909e() {
    }

    /* renamed from: f */
    public static int m31910f(C8592o oVar) {
        return oVar.hashCode();
    }

    /* renamed from: g */
    public static String m31911g(C8592o oVar) {
        return "SkippableUpdater(composer=" + oVar + ')';
    }

    /* renamed from: i */
    public static final void m31912i(C8592o oVar, @C12579k C11300l<? super Updater<T>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        oVar.mo14918M(509942095);
        lVar.invoke(Updater.m30179a(Updater.m30180b(oVar)));
        oVar.mo15002m0();
    }

    public boolean equals(Object obj) {
        return m31907c(this.f23248a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ C8592o mo16772h() {
        return this.f23248a;
    }

    public int hashCode() {
        return m31910f(this.f23248a);
    }

    public String toString() {
        return m31911g(this.f23248a);
    }
}
