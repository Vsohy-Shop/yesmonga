package androidx.core.animation;

import android.animation.Animator;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.google.android.gms.common.internal.C40852x;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(19)
/* renamed from: androidx.core.animation.a */
public final class C17004a {
    @C12579k

    /* renamed from: a */
    public static final C17004a f44947a = new C17004a();

    @C0373u
    @C11384m
    /* renamed from: a */
    public static final void m78705a(@C12579k Animator animator, @C12579k Animator.AnimatorPauseListener animatorPauseListener) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Intrinsics.checkNotNullParameter(animatorPauseListener, C40852x.C40853a.f103958a);
        animator.addPauseListener(animatorPauseListener);
    }
}
