package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.geometry.C15098i;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.urbanairship.iam.C9127a0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.d2 */
public final class C15173d2 {
    @C12579k
    /* renamed from: a */
    public static final C15118b2 m65563a(@C12579k C15403w2 w2Var) {
        Intrinsics.checkNotNullParameter(w2Var, C9127a0.f24709d);
        return C15208f0.m65926a(w2Var);
    }

    /* renamed from: b */
    public static final void m65564b(@C12579k C15118b2 b2Var, float f, float f2, float f3) {
        boolean z;
        Intrinsics.checkNotNullParameter(b2Var, "<this>");
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            b2Var.mo42433e(f2, f3);
            b2Var.mo42420A(f);
            b2Var.mo42433e(-f2, -f3);
        }
    }

    /* renamed from: c */
    public static final void m65565c(@C12579k C15118b2 b2Var, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(b2Var, "<this>");
        m65564b(b2Var, C15281o2.m66362a(f), f2, f3);
    }

    /* renamed from: d */
    public static /* synthetic */ void m65566d(C15118b2 b2Var, float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m65565c(b2Var, f, f2, f3);
    }

    /* renamed from: e */
    public static final void m65567e(@C12579k C15118b2 b2Var, float f, float f2, float f3, float f4) {
        boolean z;
        Intrinsics.checkNotNullParameter(b2Var, "<this>");
        boolean z2 = true;
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (f2 != 1.0f) {
                z2 = false;
            }
            if (z2) {
                return;
            }
        }
        b2Var.mo42433e(f3, f4);
        b2Var.mo42434f(f, f2);
        b2Var.mo42433e(-f3, -f4);
    }

    /* renamed from: f */
    public static /* synthetic */ void m65568f(C15118b2 b2Var, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        m65567e(b2Var, f, f2, f3, f4);
    }

    /* renamed from: g */
    public static final void m65569g(@C12579k C15118b2 b2Var, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(b2Var, "<this>");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        try {
            b2Var.mo42422E();
            aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            b2Var.mo42443q();
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: h */
    public static final void m65570h(@C12579k C15118b2 b2Var, @C12579k C15098i iVar, @C12579k C15211f3 f3Var, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(b2Var, "<this>");
        Intrinsics.checkNotNullParameter(iVar, "bounds");
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        try {
            b2Var.mo42447x(iVar, f3Var);
            aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            b2Var.mo42443q();
            C11322b0.m43480c(1);
        }
    }
}
