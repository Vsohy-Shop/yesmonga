package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.annotation.C0359n0;

/* renamed from: androidx.transition.a */
public class C20533a {

    /* renamed from: androidx.transition.a$a */
    public interface C20534a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    /* renamed from: a */
    public static void m95666a(@C0359n0 Animator animator, @C0359n0 AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: b */
    public static void m95667b(@C0359n0 Animator animator) {
        animator.pause();
    }

    /* renamed from: c */
    public static void m95668c(@C0359n0 Animator animator) {
        animator.resume();
    }
}
