package com.carrefour.fid.android.shared.extension;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.animation.Animation;
import com.bumptech.glide.load.engine.executor.C22218a;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12078p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animation.kt\ncom/carrefour/fid/android/shared/extension/AnimationKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,62:1\n314#2,11:63\n*S KotlinDebug\n*F\n+ 1 Animation.kt\ncom/carrefour/fid/android/shared/extension/AnimationKt\n*L\n30#1:63,11\n*E\n"})
public final class AnimationKt {

    /* renamed from: com.carrefour.fid.android.shared.extension.AnimationKt$a */
    public static final class C28701a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f70320a = true;

        /* renamed from: b */
        public final /* synthetic */ C12072o<C11079d2> f70321b;

        public C28701a(C12072o<? super C11079d2> oVar) {
            this.f70321b = oVar;
        }

        public void onAnimationCancel(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, C22218a.f57069g);
            this.f70320a = false;
        }

        public void onAnimationEnd(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, C22218a.f57069g);
            animator.removeListener(this);
            if (!this.f70321b.mo24536d()) {
                return;
            }
            if (this.f70320a) {
                C12072o<C11079d2> oVar = this.f70321b;
                Result.C10852a aVar = Result.f28060a;
                oVar.resumeWith(Result.m38702b(C11079d2.f28267a));
                return;
            }
            C12072o.C12073a.m48184a(this.f70321b, (Throwable) null, 1, (Object) null);
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.extension.AnimationKt$b */
    public static final class C28702b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C11289a<C11079d2> f70322a;

        public C28702b(C11289a<C11079d2> aVar) {
            this.f70322a = aVar;
        }

        public void onAnimationEnd(@C12580l Animation animation) {
            C11289a<C11079d2> aVar = this.f70322a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(@C12580l Animation animation) {
        }

        public void onAnimationStart(@C12580l Animation animation) {
        }
    }

    @C12580l
    /* renamed from: a */
    public static final Object m118727a(@C12579k Animator animator, @C12579k C11045c<? super C11079d2> cVar) {
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        pVar.mo24529C(new AnimationKt$awaitEnd$2$1(animator));
        animator.addListener(new C28701a(pVar));
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (y == C11063b.m42612h()) {
            return y;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: b */
    public static final void m118728b(@C12579k Animation animation, @C12580l C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(animation, "<this>");
        animation.setAnimationListener(new C28702b(aVar));
    }

    /* renamed from: c */
    public static /* synthetic */ void m118729c(Animation animation, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        m118728b(animation, aVar);
    }

    /* renamed from: d */
    public static final void m118730d(@C12579k Animation animation, long j) {
        Intrinsics.checkNotNullParameter(animation, "<this>");
        if (j < 0) {
            animation.setDuration(300);
        } else {
            animation.setDuration(j);
        }
    }
}
