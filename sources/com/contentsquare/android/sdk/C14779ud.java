package com.contentsquare.android.sdk;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C18196h2;
import com.contentsquare.android.sdk.C14446j9;

/* renamed from: com.contentsquare.android.sdk.ud */
public class C14779ud {

    /* renamed from: com.contentsquare.android.sdk.ud$a */
    public class C14780a implements C14446j9.C14447a {

        /* renamed from: a */
        public final /* synthetic */ int f36644a;

        /* renamed from: b */
        public final /* synthetic */ int f36645b;

        /* renamed from: c */
        public final /* synthetic */ C14366g5 f36646c;

        public C14780a(int i, int i2, C14366g5 g5Var) {
            this.f36644a = i;
            this.f36645b = i2;
            this.f36646c = g5Var;
        }

        /* renamed from: a */
        public final void mo36581a(View view) {
            if (mo36584f(view) && mo36582d(view) && mo36583e(view)) {
                this.f36646c.mo35345e(view);
            }
        }

        /* renamed from: b */
        public void mo35644b(View view) {
            mo36581a(view);
        }

        /* renamed from: c */
        public void mo35645c(ViewGroup viewGroup) {
            mo36581a(viewGroup);
        }

        /* renamed from: d */
        public final boolean mo36582d(View view) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return C14921z6.m64199e(iArr[0], iArr[1], view.getWidth(), view.getHeight(), this.f36644a, this.f36645b);
        }

        /* renamed from: e */
        public final boolean mo36583e(View view) {
            return C18196h2.m82521O0(view);
        }

        /* renamed from: f */
        public final boolean mo36584f(View view) {
            return view.getVisibility() == 0;
        }
    }

    /* renamed from: a */
    public C14366g5<View> mo36580a(ViewGroup viewGroup, int i, int i2) {
        C14366g5<View> g5Var = new C14366g5<>();
        C14446j9.m62208a(new C14780a(i, i2, g5Var)).mo35643b(viewGroup);
        return g5Var;
    }
}
