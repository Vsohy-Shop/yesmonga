package com.usabilla.sdk.ubform.sdk.field.view;

import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/view/animation/AnimationSet;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class MoodView$animationBounce$2 extends Lambda implements C11289a<AnimationSet> {
    final /* synthetic */ MoodView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoodView$animationBounce$2(MoodView moodView) {
        super(0);
        this.this$0 = moodView;
    }

    @C12579k
    /* renamed from: a */
    public final AnimationSet invoke() {
        AnimationSet animationSet = new AnimationSet(true);
        MoodView moodView = this.this$0;
        animationSet.addAnimation(moodView.mo21050u(1.0f, 1.1f));
        ScaleAnimation p = moodView.mo21050u(1.1f, 1.0f);
        p.setStartOffset(100);
        C11079d2 d2Var = C11079d2.f28267a;
        animationSet.addAnimation(p);
        return animationSet;
    }
}
