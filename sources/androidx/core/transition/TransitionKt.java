package androidx.core.transition;

import android.annotation.SuppressLint;
import android.transition.Transition;
import androidx.annotation.C0376v0;
import androidx.appcompat.graphics.drawable.C0508a;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@SuppressLint({"ClassVerificationFailure"})
public final class TransitionKt {

    /* renamed from: androidx.core.transition.TransitionKt$a */
    public static final class C17954a implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l<Transition, C11079d2> f46427a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<Transition, C11079d2> f46428b;

        /* renamed from: c */
        public final /* synthetic */ C11300l<Transition, C11079d2> f46429c;

        /* renamed from: d */
        public final /* synthetic */ C11300l<Transition, C11079d2> f46430d;

        /* renamed from: e */
        public final /* synthetic */ C11300l<Transition, C11079d2> f46431e;

        public C17954a(C11300l<? super Transition, C11079d2> lVar, C11300l<? super Transition, C11079d2> lVar2, C11300l<? super Transition, C11079d2> lVar3, C11300l<? super Transition, C11079d2> lVar4, C11300l<? super Transition, C11079d2> lVar5) {
            this.f46427a = lVar;
            this.f46428b = lVar2;
            this.f46429c = lVar3;
            this.f46430d = lVar4;
            this.f46431e = lVar5;
        }

        public void onTransitionCancel(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
            this.f46430d.invoke(transition);
        }

        public void onTransitionEnd(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
            this.f46427a.invoke(transition);
        }

        public void onTransitionPause(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
            this.f46429c.invoke(transition);
        }

        public void onTransitionResume(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
            this.f46428b.invoke(transition);
        }

        public void onTransitionStart(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
            this.f46431e.invoke(transition);
        }
    }

    /* renamed from: androidx.core.transition.TransitionKt$b */
    public static final class C17955b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l f46432a;

        public C17955b(C11300l lVar) {
            this.f46432a = lVar;
        }

        public void onTransitionCancel(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
            this.f46432a.invoke(transition);
        }

        public void onTransitionEnd(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionPause(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionResume(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionStart(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }
    }

    /* renamed from: androidx.core.transition.TransitionKt$c */
    public static final class C17956c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l f46433a;

        public C17956c(C11300l lVar) {
            this.f46433a = lVar;
        }

        public void onTransitionCancel(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionEnd(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
            this.f46433a.invoke(transition);
        }

        public void onTransitionPause(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionResume(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionStart(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }
    }

    /* renamed from: androidx.core.transition.TransitionKt$d */
    public static final class C17957d implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l f46434a;

        public C17957d(C11300l lVar) {
            this.f46434a = lVar;
        }

        public void onTransitionCancel(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionEnd(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionPause(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
            this.f46434a.invoke(transition);
        }

        public void onTransitionResume(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionStart(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }
    }

    /* renamed from: androidx.core.transition.TransitionKt$e */
    public static final class C17958e implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l f46435a;

        public C17958e(C11300l lVar) {
            this.f46435a = lVar;
        }

        public void onTransitionCancel(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionEnd(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionPause(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionResume(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
            this.f46435a.invoke(transition);
        }

        public void onTransitionStart(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }
    }

    /* renamed from: androidx.core.transition.TransitionKt$f */
    public static final class C17959f implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l f46436a;

        public C17959f(C11300l lVar) {
            this.f46436a = lVar;
        }

        public void onTransitionCancel(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionEnd(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionPause(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionResume(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        }

        public void onTransitionStart(@C12579k Transition transition) {
            Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
            this.f46436a.invoke(transition);
        }
    }

    @C0376v0(19)
    @C12579k
    /* renamed from: a */
    public static final Transition.TransitionListener m81575a(@C12579k Transition transition, @C12579k C11300l<? super Transition, C11079d2> lVar, @C12579k C11300l<? super Transition, C11079d2> lVar2, @C12579k C11300l<? super Transition, C11079d2> lVar3, @C12579k C11300l<? super Transition, C11079d2> lVar4, @C12579k C11300l<? super Transition, C11079d2> lVar5) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onEnd");
        Intrinsics.checkNotNullParameter(lVar2, "onStart");
        Intrinsics.checkNotNullParameter(lVar3, "onCancel");
        Intrinsics.checkNotNullParameter(lVar4, "onResume");
        Intrinsics.checkNotNullParameter(lVar5, "onPause");
        C17954a aVar = new C17954a(lVar, lVar4, lVar5, lVar3, lVar2);
        transition.addListener(aVar);
        return aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ Transition.TransitionListener m81576b(Transition transition, C11300l lVar, C11300l lVar2, C11300l lVar3, C11300l lVar4, C11300l lVar5, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = TransitionKt$addListener$1.f46437f;
        }
        if ((i & 2) != 0) {
            lVar2 = TransitionKt$addListener$2.f46438f;
        }
        C11300l lVar6 = lVar2;
        if ((i & 4) != 0) {
            lVar3 = TransitionKt$addListener$3.f46439f;
        }
        C11300l lVar7 = lVar3;
        if ((i & 8) != 0) {
            lVar4 = TransitionKt$addListener$4.f46440f;
        }
        if ((i & 16) != 0) {
            lVar5 = TransitionKt$addListener$5.f46441f;
        }
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onEnd");
        Intrinsics.checkNotNullParameter(lVar6, "onStart");
        Intrinsics.checkNotNullParameter(lVar7, "onCancel");
        Intrinsics.checkNotNullParameter(lVar4, "onResume");
        Intrinsics.checkNotNullParameter(lVar5, "onPause");
        C17954a aVar = new C17954a(lVar, lVar4, lVar5, lVar7, lVar6);
        transition.addListener(aVar);
        return aVar;
    }

    @C0376v0(19)
    @C12579k
    /* renamed from: c */
    public static final Transition.TransitionListener m81577c(@C12579k Transition transition, @C12579k C11300l<? super Transition, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C17955b bVar = new C17955b(lVar);
        transition.addListener(bVar);
        return bVar;
    }

    @C0376v0(19)
    @C12579k
    /* renamed from: d */
    public static final Transition.TransitionListener m81578d(@C12579k Transition transition, @C12579k C11300l<? super Transition, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C17956c cVar = new C17956c(lVar);
        transition.addListener(cVar);
        return cVar;
    }

    @C0376v0(19)
    @C12579k
    /* renamed from: e */
    public static final Transition.TransitionListener m81579e(@C12579k Transition transition, @C12579k C11300l<? super Transition, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C17957d dVar = new C17957d(lVar);
        transition.addListener(dVar);
        return dVar;
    }

    @C0376v0(19)
    @C12579k
    /* renamed from: f */
    public static final Transition.TransitionListener m81580f(@C12579k Transition transition, @C12579k C11300l<? super Transition, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C17958e eVar = new C17958e(lVar);
        transition.addListener(eVar);
        return eVar;
    }

    @C0376v0(19)
    @C12579k
    /* renamed from: g */
    public static final Transition.TransitionListener m81581g(@C12579k Transition transition, @C12579k C11300l<? super Transition, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C17959f fVar = new C17959f(lVar);
        transition.addListener(fVar);
        return fVar;
    }
}
