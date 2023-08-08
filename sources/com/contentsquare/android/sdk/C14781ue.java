package com.contentsquare.android.sdk;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import kotlin.text.C11626x;

/* renamed from: com.contentsquare.android.sdk.ue */
public class C14781ue {

    /* renamed from: b */
    public static final Character f36648b = Character.valueOf(C11626x.f28915f);

    /* renamed from: a */
    public final C14510lf f36649a;

    public C14781ue(C14510lf lfVar) {
        this.f36649a = lfVar;
    }

    /* renamed from: a */
    public final int mo36585a(View view, ViewGroup viewGroup) {
        int i = 0;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == view) {
                return i;
            }
            if (!this.f36649a.mo34888a(childAt, viewGroup)) {
                i++;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public String mo36586b(View view) {
        StringBuilder sb = new StringBuilder("[root]>");
        if (view != null) {
            mo36587c(view, sb);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo36587c(View view, StringBuilder sb) {
        if (!mo36589e(view) && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            mo36587c(viewGroup, sb);
            int a = mo36585a(view, viewGroup);
            if (a != -1) {
                sb.append(view.getClass().getSimpleName());
                mo36588d(sb, viewGroup, view, a);
            }
        }
    }

    /* renamed from: d */
    public final void mo36588d(StringBuilder sb, ViewGroup viewGroup, View view, int i) {
        String str;
        String b = C14493l4.m62465b(view, "");
        if (viewGroup instanceof RecyclerView) {
            int p0 = ((RecyclerView) viewGroup).mo59608p0(view);
            str = String.format(Locale.getDefault(), ":eq(%d)", new Object[]{Integer.valueOf(p0)});
        } else {
            str = String.format(Locale.getDefault(), ":eq(%d)", new Object[]{Integer.valueOf(i)});
        }
        sb.append(str);
        if (!C14358g3.m61811e(b)) {
            sb.append('#');
            sb.append(b);
        }
        sb.append(f36648b);
    }

    /* renamed from: e */
    public boolean mo36589e(View view) {
        return view.getClass().toString().endsWith("DecorView");
    }
}
