package androidx.core.animation;

import android.animation.Animator;
import androidx.annotation.C0376v0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class AnimatorKt {

    /* renamed from: androidx.core.animation.AnimatorKt$a */
    public static final class C16998a implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l<Animator, C11079d2> f44931a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<Animator, C11079d2> f44932b;

        /* renamed from: c */
        public final /* synthetic */ C11300l<Animator, C11079d2> f44933c;

        /* renamed from: d */
        public final /* synthetic */ C11300l<Animator, C11079d2> f44934d;

        public C16998a(C11300l<? super Animator, C11079d2> lVar, C11300l<? super Animator, C11079d2> lVar2, C11300l<? super Animator, C11079d2> lVar3, C11300l<? super Animator, C11079d2> lVar4) {
            this.f44931a = lVar;
            this.f44932b = lVar2;
            this.f44933c = lVar3;
            this.f44934d = lVar4;
        }

        public void onAnimationCancel(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f44933c.invoke(animator);
        }

        public void onAnimationEnd(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f44932b.invoke(animator);
        }

        public void onAnimationRepeat(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f44931a.invoke(animator);
        }

        public void onAnimationStart(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f44934d.invoke(animator);
        }
    }

    /* renamed from: androidx.core.animation.AnimatorKt$b */
    public static final class C16999b implements Animator.AnimatorPauseListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l<Animator, C11079d2> f44935a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<Animator, C11079d2> f44936b;

        public C16999b(C11300l<? super Animator, C11079d2> lVar, C11300l<? super Animator, C11079d2> lVar2) {
            this.f44935a = lVar;
            this.f44936b = lVar2;
        }

        public void onAnimationPause(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f44935a.invoke(animator);
        }

        public void onAnimationResume(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f44936b.invoke(animator);
        }
    }

    /* renamed from: androidx.core.animation.AnimatorKt$c */
    public static final class C17000c implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l f44937a;

        public C17000c(C11300l lVar) {
            this.f44937a = lVar;
        }

        public void onAnimationCancel(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f44937a.invoke(animator);
        }

        public void onAnimationEnd(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public void onAnimationRepeat(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public void onAnimationStart(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* renamed from: androidx.core.animation.AnimatorKt$d */
    public static final class C17001d implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l f44938a;

        public C17001d(C11300l lVar) {
            this.f44938a = lVar;
        }

        public void onAnimationCancel(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public void onAnimationEnd(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f44938a.invoke(animator);
        }

        public void onAnimationRepeat(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public void onAnimationStart(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* renamed from: androidx.core.animation.AnimatorKt$e */
    public static final class C17002e implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l f44939a;

        public C17002e(C11300l lVar) {
            this.f44939a = lVar;
        }

        public void onAnimationCancel(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public void onAnimationEnd(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public void onAnimationRepeat(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f44939a.invoke(animator);
        }

        public void onAnimationStart(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* renamed from: androidx.core.animation.AnimatorKt$f */
    public static final class C17003f implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l f44940a;

        public C17003f(C11300l lVar) {
            this.f44940a = lVar;
        }

        public void onAnimationCancel(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public void onAnimationEnd(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public void onAnimationRepeat(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public void onAnimationStart(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f44940a.invoke(animator);
        }
    }

    @C12579k
    /* renamed from: a */
    public static final Animator.AnimatorListener m78689a(@C12579k Animator animator, @C12579k C11300l<? super Animator, C11079d2> lVar, @C12579k C11300l<? super Animator, C11079d2> lVar2, @C12579k C11300l<? super Animator, C11079d2> lVar3, @C12579k C11300l<? super Animator, C11079d2> lVar4) {
        Intrinsics.checkNotNullParameter(animator, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onEnd");
        Intrinsics.checkNotNullParameter(lVar2, "onStart");
        Intrinsics.checkNotNullParameter(lVar3, "onCancel");
        Intrinsics.checkNotNullParameter(lVar4, "onRepeat");
        C16998a aVar = new C16998a(lVar4, lVar, lVar3, lVar2);
        animator.addListener(aVar);
        return aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ Animator.AnimatorListener m78690b(Animator animator, C11300l lVar, C11300l lVar2, C11300l lVar3, C11300l lVar4, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = AnimatorKt$addListener$1.f44941f;
        }
        if ((i & 2) != 0) {
            lVar2 = AnimatorKt$addListener$2.f44942f;
        }
        if ((i & 4) != 0) {
            lVar3 = AnimatorKt$addListener$3.f44943f;
        }
        if ((i & 8) != 0) {
            lVar4 = AnimatorKt$addListener$4.f44944f;
        }
        Intrinsics.checkNotNullParameter(animator, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onEnd");
        Intrinsics.checkNotNullParameter(lVar2, "onStart");
        Intrinsics.checkNotNullParameter(lVar3, "onCancel");
        Intrinsics.checkNotNullParameter(lVar4, "onRepeat");
        C16998a aVar = new C16998a(lVar4, lVar, lVar3, lVar2);
        animator.addListener(aVar);
        return aVar;
    }

    @C0376v0(19)
    @C12579k
    /* renamed from: c */
    public static final Animator.AnimatorPauseListener m78691c(@C12579k Animator animator, @C12579k C11300l<? super Animator, C11079d2> lVar, @C12579k C11300l<? super Animator, C11079d2> lVar2) {
        Intrinsics.checkNotNullParameter(animator, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onResume");
        Intrinsics.checkNotNullParameter(lVar2, "onPause");
        C16999b bVar = new C16999b(lVar2, lVar);
        C17004a.m78705a(animator, bVar);
        return bVar;
    }

    /* renamed from: d */
    public static /* synthetic */ Animator.AnimatorPauseListener m78692d(Animator animator, C11300l lVar, C11300l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = AnimatorKt$addPauseListener$1.f44945f;
        }
        if ((i & 2) != 0) {
            lVar2 = AnimatorKt$addPauseListener$2.f44946f;
        }
        return m78691c(animator, lVar, lVar2);
    }

    @C12579k
    /* renamed from: e */
    public static final Animator.AnimatorListener m78693e(@C12579k Animator animator, @C12579k C11300l<? super Animator, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(animator, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C17000c cVar = new C17000c(lVar);
        animator.addListener(cVar);
        return cVar;
    }

    @C12579k
    /* renamed from: f */
    public static final Animator.AnimatorListener m78694f(@C12579k Animator animator, @C12579k C11300l<? super Animator, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(animator, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C17001d dVar = new C17001d(lVar);
        animator.addListener(dVar);
        return dVar;
    }

    @C0376v0(19)
    @C12579k
    /* renamed from: g */
    public static final Animator.AnimatorPauseListener m78695g(@C12579k Animator animator, @C12579k C11300l<? super Animator, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(animator, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        return m78692d(animator, (C11300l) null, lVar, 1, (Object) null);
    }

    @C12579k
    /* renamed from: h */
    public static final Animator.AnimatorListener m78696h(@C12579k Animator animator, @C12579k C11300l<? super Animator, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(animator, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C17002e eVar = new C17002e(lVar);
        animator.addListener(eVar);
        return eVar;
    }

    @C0376v0(19)
    @C12579k
    /* renamed from: i */
    public static final Animator.AnimatorPauseListener m78697i(@C12579k Animator animator, @C12579k C11300l<? super Animator, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(animator, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        return m78692d(animator, lVar, (C11300l) null, 2, (Object) null);
    }

    @C12579k
    /* renamed from: j */
    public static final Animator.AnimatorListener m78698j(@C12579k Animator animator, @C12579k C11300l<? super Animator, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(animator, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C17003f fVar = new C17003f(lVar);
        animator.addListener(fVar);
        return fVar;
    }
}
