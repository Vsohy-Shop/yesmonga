package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0372t0;
import androidx.annotation.C0376v0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import java.util.Iterator;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import kotlin.sequences.C11559m;
import kotlin.sequences.C11563q;
import org.jetbrains.annotations.C12579k;

public final class ViewGroupKt {

    /* renamed from: androidx.core.view.ViewGroupKt$a */
    public static final class C18011a implements C11559m<View> {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f46522a;

        public C18011a(ViewGroup viewGroup) {
            this.f46522a = viewGroup;
        }

        @C12579k
        public Iterator<View> iterator() {
            return ViewGroupKt.m81814k(this.f46522a);
        }
    }

    /* renamed from: androidx.core.view.ViewGroupKt$b */
    public static final class C18012b implements Iterator<View>, C11348d {

        /* renamed from: a */
        public int f46523a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f46524b;

        public C18012b(ViewGroup viewGroup) {
            this.f46524b = viewGroup;
        }

        @C12579k
        /* renamed from: b */
        public View next() {
            ViewGroup viewGroup = this.f46524b;
            int i = this.f46523a;
            this.f46523a = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.f46523a < this.f46524b.getChildCount();
        }

        public void remove() {
            ViewGroup viewGroup = this.f46524b;
            int i = this.f46523a - 1;
            this.f46523a = i;
            viewGroup.removeViewAt(i);
        }
    }

    /* renamed from: a */
    public static final boolean m81804a(@C12579k ViewGroup viewGroup, @C12579k View view) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        if (viewGroup.indexOfChild(view) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final void m81805b(@C12579k ViewGroup viewGroup, @C12579k C11300l<? super View, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            lVar.invoke(childAt);
        }
    }

    /* renamed from: c */
    public static final void m81806c(@C12579k ViewGroup viewGroup, @C12579k C11304p<? super Integer, ? super View, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Integer valueOf = Integer.valueOf(i);
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            pVar.invoke(valueOf, childAt);
        }
    }

    @C12579k
    /* renamed from: d */
    public static final View m81807d(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + viewGroup.getChildCount());
    }

    @C12579k
    /* renamed from: e */
    public static final C11559m<View> m81808e(@C12579k ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return new C18011a(viewGroup);
    }

    @C12579k
    /* renamed from: f */
    public static final C11559m<View> m81809f(@C12579k ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return C11563q.m44902b(new ViewGroupKt$descendants$1(viewGroup, (C11045c<? super ViewGroupKt$descendants$1>) null));
    }

    @C12579k
    /* renamed from: g */
    public static final C11466l m81810g(@C12579k ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return C11479u.m44378W1(0, viewGroup.getChildCount());
    }

    /* renamed from: h */
    public static final int m81811h(@C12579k ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return viewGroup.getChildCount();
    }

    /* renamed from: i */
    public static final boolean m81812i(@C12579k ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        if (viewGroup.getChildCount() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final boolean m81813j(@C12579k ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        if (viewGroup.getChildCount() != 0) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: k */
    public static final Iterator<View> m81814k(@C12579k ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return new C18012b(viewGroup);
    }

    /* renamed from: l */
    public static final void m81815l(@C12579k ViewGroup viewGroup, @C12579k View view) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        viewGroup.removeView(view);
    }

    /* renamed from: m */
    public static final void m81816m(@C12579k ViewGroup viewGroup, @C12579k View view) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        viewGroup.addView(view);
    }

    /* renamed from: n */
    public static final void m81817n(@C12579k ViewGroup.MarginLayoutParams marginLayoutParams, @C0372t0 int i) {
        Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i, i, i);
    }

    /* renamed from: o */
    public static final void m81818o(@C12579k ViewGroup.MarginLayoutParams marginLayoutParams, @C0372t0 int i, @C0372t0 int i2, @C0372t0 int i3, @C0372t0 int i4) {
        Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    /* renamed from: p */
    public static /* synthetic */ void m81819p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.leftMargin;
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.rightMargin;
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(17)
    /* renamed from: q */
    public static final void m81820q(@C12579k ViewGroup.MarginLayoutParams marginLayoutParams, @C0372t0 int i, @C0372t0 int i2, @C0372t0 int i3, @C0372t0 int i4) {
        Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }

    /* renamed from: r */
    public static /* synthetic */ void m81821r(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.getMarginStart();
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }
}
