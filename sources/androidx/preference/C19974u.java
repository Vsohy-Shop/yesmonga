package androidx.preference;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.C0329d0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import androidx.preference.C19975v;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.preference.u */
public class C19974u extends RecyclerView.C20061e0 {
    @C0363p0

    /* renamed from: a */
    public final Drawable f51119a;

    /* renamed from: b */
    public ColorStateList f51120b;

    /* renamed from: c */
    public final SparseArray<View> f51121c;

    /* renamed from: d */
    public boolean f51122d;

    /* renamed from: e */
    public boolean f51123e;

    public C19974u(@C0359n0 View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f51121c = sparseArray;
        TextView textView = (TextView) view.findViewById(16908310);
        sparseArray.put(16908310, textView);
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        int i = C19975v.C19981f.icon_frame;
        sparseArray.put(i, view.findViewById(i));
        sparseArray.put(C19915a.f50934a, view.findViewById(C19915a.f50934a));
        this.f51119a = view.getBackground();
        if (textView != null) {
            this.f51120b = textView.getTextColors();
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: c */
    public static C19974u m92901c(@C0359n0 View view) {
        return new C19974u(view);
    }

    /* renamed from: d */
    public View mo59214d(@C0329d0 int i) {
        View view = this.f51121c.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            this.f51121c.put(i, findViewById);
        }
        return findViewById;
    }

    /* renamed from: e */
    public boolean mo59215e() {
        return this.f51122d;
    }

    /* renamed from: f */
    public boolean mo59216f() {
        return this.f51123e;
    }

    /* renamed from: g */
    public void mo59217g() {
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.f51119a;
        if (background != drawable) {
            C18196h2.m82502I1(this.itemView, drawable);
        }
        TextView textView = (TextView) mo59214d(16908310);
        if (textView != null && this.f51120b != null && !textView.getTextColors().equals(this.f51120b)) {
            textView.setTextColor(this.f51120b);
        }
    }

    /* renamed from: h */
    public void mo59218h(boolean z) {
        this.f51122d = z;
    }

    /* renamed from: i */
    public void mo59219i(boolean z) {
        this.f51123e = z;
    }
}
