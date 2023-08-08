package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.annotation.C0319a;
import androidx.annotation.C0359n0;
import androidx.core.view.C18024a2;
import androidx.fragment.C19144a;

/* renamed from: androidx.fragment.app.i */
public class C19236i {
    @C0319a
    /* renamed from: a */
    public static int m90201a(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    /* renamed from: b */
    public static C19237a m90202b(@C0359n0 Context context, @C0359n0 Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int a = m90201a(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i = C19144a.C19147c.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i) != null) {
                fragment.mContainer.setTag(i, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, a);
        if (onCreateAnimation != null) {
            return new C19237a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, a);
        if (onCreateAnimator != null) {
            return new C19237a(onCreateAnimator);
        }
        if (a == 0 && nextTransition != 0) {
            a = m90204d(context, nextTransition, z);
        }
        if (a != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a);
                    if (loadAnimation != null) {
                        return new C19237a(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, a);
                    if (loadAnimator != null) {
                        return new C19237a(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a);
                        if (loadAnimation2 != null) {
                            return new C19237a(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    @C0319a
    /* renamed from: c */
    public static int m90203c(@C0359n0 Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @C0319a
    /* renamed from: d */
    public static int m90204d(@C0359n0 Context context, int i, boolean z) {
        if (i != 4097) {
            if (i != 8194) {
                if (i != 8197) {
                    if (i != 4099) {
                        if (i != 4100) {
                            return -1;
                        }
                        if (z) {
                            return m90203c(context, 16842936);
                        }
                        return m90203c(context, 16842937);
                    } else if (z) {
                        return C19144a.C19146b.fragment_fade_enter;
                    } else {
                        return C19144a.C19146b.fragment_fade_exit;
                    }
                } else if (z) {
                    return m90203c(context, 16842938);
                } else {
                    return m90203c(context, 16842939);
                }
            } else if (z) {
                return C19144a.C19146b.fragment_close_enter;
            } else {
                return C19144a.C19146b.fragment_close_exit;
            }
        } else if (z) {
            return C19144a.C19146b.fragment_open_enter;
        } else {
            return C19144a.C19146b.fragment_open_exit;
        }
    }

    /* renamed from: androidx.fragment.app.i$a */
    public static class C19237a {

        /* renamed from: a */
        public final Animation f49519a;

        /* renamed from: b */
        public final Animator f49520b;

        public C19237a(Animation animation) {
            this.f49519a = animation;
            this.f49520b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public C19237a(Animator animator) {
            this.f49519a = null;
            this.f49520b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.i$b */
    public static class C19238b extends AnimationSet implements Runnable {

        /* renamed from: a */
        public final ViewGroup f49521a;

        /* renamed from: b */
        public final View f49522b;

        /* renamed from: c */
        public boolean f49523c;

        /* renamed from: d */
        public boolean f49524d;

        /* renamed from: e */
        public boolean f49525e = true;

        public C19238b(@C0359n0 Animation animation, @C0359n0 ViewGroup viewGroup, @C0359n0 View view) {
            super(false);
            this.f49521a = viewGroup;
            this.f49522b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, @C0359n0 Transformation transformation) {
            this.f49525e = true;
            if (this.f49523c) {
                return !this.f49524d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f49523c = true;
                C18024a2.m81875a(this.f49521a, this);
            }
            return true;
        }

        public void run() {
            if (this.f49523c || !this.f49525e) {
                this.f49521a.endViewTransition(this.f49522b);
                this.f49524d = true;
                return;
            }
            this.f49525e = false;
            this.f49521a.post(this);
        }

        public boolean getTransformation(long j, @C0359n0 Transformation transformation, float f) {
            this.f49525e = true;
            if (this.f49523c) {
                return !this.f49524d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f49523c = true;
                C18024a2.m81875a(this.f49521a, this);
            }
            return true;
        }
    }
}
