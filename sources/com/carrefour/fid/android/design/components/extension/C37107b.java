package com.carrefour.fid.android.design.components.extension;

import android.view.animation.Animation;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.extension.b */
public final class C37107b {

    /* renamed from: com.carrefour.fid.android.design.components.extension.b$a */
    public static final class C37108a implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C11289a<C11079d2> f92905a;

        public C37108a(C11289a<C11079d2> aVar) {
            this.f92905a = aVar;
        }

        public void onAnimationEnd(@C12580l Animation animation) {
            C11289a<C11079d2> aVar = this.f92905a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(@C12580l Animation animation) {
        }

        public void onAnimationStart(@C12580l Animation animation) {
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.extension.b$b */
    public static final class C37109b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C11289a<C11079d2> f92906a;

        public C37109b(C11289a<C11079d2> aVar) {
            this.f92906a = aVar;
        }

        public void onAnimationEnd(@C12580l Animation animation) {
        }

        public void onAnimationRepeat(@C12580l Animation animation) {
        }

        public void onAnimationStart(@C12580l Animation animation) {
            C11289a<C11079d2> aVar = this.f92906a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: a */
    public static final void m152139a(@C12579k Animation animation, @C12580l C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(animation, "<this>");
        animation.setAnimationListener(new C37108a(aVar));
    }

    /* renamed from: b */
    public static /* synthetic */ void m152140b(Animation animation, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        m152139a(animation, aVar);
    }

    /* renamed from: c */
    public static final void m152141c(@C12579k Animation animation, @C12580l C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(animation, "<this>");
        animation.setAnimationListener(new C37109b(aVar));
    }

    /* renamed from: d */
    public static /* synthetic */ void m152142d(Animation animation, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        m152141c(animation, aVar);
    }
}
