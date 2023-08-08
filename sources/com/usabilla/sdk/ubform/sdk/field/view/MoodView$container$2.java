package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.widget.LinearLayout;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.utils.C10120e;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/widget/LinearLayout;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class MoodView$container$2 extends Lambda implements C11289a<LinearLayout> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MoodView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoodView$container$2(Context context, MoodView moodView) {
        super(0);
        this.$context = context;
        this.this$0 = moodView;
    }

    @C12579k
    /* renamed from: a */
    public final LinearLayout invoke() {
        LinearLayout linearLayout = new LinearLayout(this.$context);
        Context context = this.$context;
        MoodView moodView = this.this$0;
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setContentDescription(context.getString(C9747c.C9761n.ub_element_mood_select_rating, new Object[]{Integer.valueOf(MoodView.m37810q(moodView).mo20841C().size())}));
        linearLayout.setGravity(17);
        linearLayout.setId(C9747c.C9756i.ub_element_mood);
        linearLayout.setFocusable(true);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_padding);
        linearLayout.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        linearLayout.getViewTreeObserver().addOnPreDrawListener(new C10120e(linearLayout, moodView.getMaxSpacing()));
        return linearLayout;
    }
}
