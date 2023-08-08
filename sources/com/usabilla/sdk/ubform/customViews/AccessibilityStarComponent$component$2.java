package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/widget/LinearLayout;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class AccessibilityStarComponent$component$2 extends Lambda implements C11289a<LinearLayout> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AccessibilityStarComponent this$0;

    /* renamed from: com.usabilla.sdk.ubform.customViews.AccessibilityStarComponent$component$2$a */
    public static final class C9767a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ LinearLayout f26739a;

        /* renamed from: b */
        public final /* synthetic */ AccessibilityStarComponent f26740b;

        public C9767a(LinearLayout linearLayout, AccessibilityStarComponent accessibilityStarComponent) {
            this.f26739a = linearLayout;
            this.f26740b = accessibilityStarComponent;
        }

        public boolean onPreDraw() {
            boolean z;
            this.f26739a.getViewTreeObserver().removeOnPreDrawListener(this);
            ArrayList<CheckableImageView> arrayList = new ArrayList<>();
            int childCount = this.f26739a.getChildCount();
            boolean z2 = false;
            if (childCount > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    View childAt = this.f26739a.getChildAt(i);
                    if (childAt != null) {
                        arrayList.add((CheckableImageView) childAt);
                        if (i2 >= childCount) {
                            break;
                        }
                        i = i2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.usabilla.sdk.ubform.customViews.CheckableImageView");
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((CheckableImageView) it.next()).getWidth() != ((CheckableImageView) arrayList.get(0)).getWidth()) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z2) {
                LinearLayout linearLayout = this.f26739a;
                AccessibilityStarComponent accessibilityStarComponent = this.f26740b;
                ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
                for (CheckableImageView layoutParams : arrayList) {
                    layoutParams.getLayoutParams().width = linearLayout.getWidth() / accessibilityStarComponent.getNumberOfStars();
                    arrayList2.add(C11079d2.f28267a);
                }
                this.f26739a.requestLayout();
            }
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccessibilityStarComponent$component$2(Context context, AccessibilityStarComponent accessibilityStarComponent) {
        super(0);
        this.$context = context;
        this.this$0 = accessibilityStarComponent;
    }

    @C12579k
    /* renamed from: a */
    public final LinearLayout invoke() {
        LinearLayout linearLayout = new LinearLayout(this.$context);
        linearLayout.getViewTreeObserver().addOnPreDrawListener(new C9767a(linearLayout, this.this$0));
        linearLayout.setOrientation(0);
        linearLayout.setImportantForAccessibility(2);
        return linearLayout;
    }
}
