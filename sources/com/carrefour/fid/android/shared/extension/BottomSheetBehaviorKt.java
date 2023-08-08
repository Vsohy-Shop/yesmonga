package com.carrefour.fid.android.shared.extension;

import android.view.View;
import androidx.annotation.C0349j;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

public final class BottomSheetBehaviorKt {

    /* renamed from: com.carrefour.fid.android.shared.extension.BottomSheetBehaviorKt$a */
    public static final class C28704a extends BottomSheetBehavior.C31172f {

        /* renamed from: a */
        public final /* synthetic */ C12074o0 f70323a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<C28769n, Boolean> f70324b;

        /* renamed from: c */
        public final /* synthetic */ C11300l<C28769n, C11079d2> f70325c;

        public C28704a(C12074o0 o0Var, C11300l<? super C28769n, Boolean> lVar, C11300l<? super C28769n, C11079d2> lVar2) {
            this.f70323a = o0Var;
            this.f70324b = lVar;
            this.f70325c = lVar2;
        }

        /* renamed from: b */
        public void mo68139b(@C12579k View view, float f) {
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
            if (C12079p0.m48270k(this.f70323a)) {
                C28769n nVar = new C28769n(view, f);
                if (this.f70324b.invoke(nVar).booleanValue()) {
                    this.f70325c.invoke(nVar);
                }
            }
        }

        /* renamed from: c */
        public void mo68140c(@C12579k View view, int i) {
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
        }
    }

    @C0349j
    @C12579k
    /* renamed from: b */
    public static final C11907e<C28769n> m118741b(@C12579k BottomSheetBehavior<?> bottomSheetBehavior, @C12579k C11300l<? super C28769n, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "handled");
        return C11909g.m47500w(new BottomSheetBehaviorKt$addBottomSheetEvents$1(lVar, bottomSheetBehavior, (C11045c<? super BottomSheetBehaviorKt$addBottomSheetEvents$1>) null));
    }

    /* renamed from: c */
    public static /* synthetic */ C11907e m118742c(BottomSheetBehavior bottomSheetBehavior, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = C28757h.f70418a;
        }
        return m118741b(bottomSheetBehavior, lVar);
    }

    @C0349j
    /* renamed from: d */
    public static final C28704a m118743d(C12074o0 o0Var, C11300l<? super C28769n, Boolean> lVar, C11300l<? super C28769n, C11079d2> lVar2) {
        return new C28704a(o0Var, lVar, lVar2);
    }
}
