package com.contentsquare.android.sdk;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.contentsquare.android.sdk.j9 */
public final class C14446j9 {

    /* renamed from: a */
    public final C14447a f35689a;

    /* renamed from: com.contentsquare.android.sdk.j9$a */
    public interface C14447a {
        /* renamed from: b */
        void mo35644b(View view);

        /* renamed from: c */
        void mo35645c(ViewGroup viewGroup);
    }

    public C14446j9(C14447a aVar) {
        this.f35689a = aVar;
    }

    /* renamed from: a */
    public static C14446j9 m62208a(C14447a aVar) {
        return new C14446j9(aVar);
    }

    /* renamed from: b */
    public void mo35643b(ViewGroup viewGroup) {
        this.f35689a.mo35645c(viewGroup);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof ViewGroup) {
                    mo35643b((ViewGroup) childAt);
                } else {
                    this.f35689a.mo35644b(childAt);
                }
            }
        }
    }
}
