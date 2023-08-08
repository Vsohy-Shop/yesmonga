package com.urbanairship.android.layout.widget;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0366r;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.android.layout.model.C35793b;
import com.urbanairship.android.layout.property.C35832e;
import com.urbanairship.android.layout.property.C35849p;
import com.urbanairship.android.layout.property.C35852s;
import com.urbanairship.android.layout.property.ToggleType;
import com.urbanairship.android.layout.util.C35916j;
import com.urbanairship.android.layout.util.C35921m;
import com.urbanairship.android.layout.util.C35922n;
import com.urbanairship.android.layout.view.C35977a;
import com.urbanairship.android.layout.widget.C36001a;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000 \r*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u00032\u00020\u0004:\u0001\u0017B\u0017\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0004\b1\u00102J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000eH\u0014J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0004J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000eH\u0002R\u001a\u0010\u001b\u001a\u00028\u00008\u0004X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R&\u0010)\u001a\u0006\u0012\u0002\b\u00030#8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+¨\u00063"}, mo22516d2 = {"Lcom/urbanairship/android/layout/widget/CheckableView;", "Lcom/urbanairship/android/layout/model/b;", "M", "Landroid/widget/FrameLayout;", "Lcom/urbanairship/android/layout/view/a;", "", "widthMeasureSpec", "heightMeasureSpec", "Lkotlin/d2;", "onMeasure", "Lcom/urbanairship/android/layout/property/p;", "style", "Landroidx/appcompat/widget/SwitchCompat;", "d", "Lcom/urbanairship/android/layout/property/e;", "Lcom/urbanairship/android/layout/widget/ShapeButton;", "c", "", "isChecked", "setCheckedInternal", "isEnabled", "setEnabled", "b", "a", "Lcom/urbanairship/android/layout/model/b;", "getModel", "()Lcom/urbanairship/android/layout/model/b;", "model", "Lcom/urbanairship/android/layout/widget/a$c;", "Lcom/urbanairship/android/layout/widget/a$c;", "getCheckedChangeListener", "()Lcom/urbanairship/android/layout/widget/a$c;", "setCheckedChangeListener", "(Lcom/urbanairship/android/layout/widget/a$c;)V", "checkedChangeListener", "Lcom/urbanairship/android/layout/widget/a;", "Lcom/urbanairship/android/layout/widget/a;", "getCheckableView", "()Lcom/urbanairship/android/layout/widget/a;", "setCheckableView", "(Lcom/urbanairship/android/layout/widget/a;)V", "checkableView", "getMinWidth", "()I", "minWidth", "getMinHeight", "minHeight", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/b;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public abstract class CheckableView<M extends C35793b<?>> extends FrameLayout implements C35977a {
    @C12579k

    /* renamed from: d */
    public static final C35991a f88946d = new C35991a((DefaultConstructorMarker) null);
    @C0366r(unit = 0)

    /* renamed from: e */
    public static final int f88947e = 24;
    @C0366r(unit = 0)

    /* renamed from: f */
    public static final int f88948f = 24;
    @C0366r(unit = 0)

    /* renamed from: g */
    public static final int f88949g = 48;

    /* renamed from: v */
    public static final int f88950v = -1;
    @C12579k

    /* renamed from: a */
    public final M f88951a;
    @C12580l

    /* renamed from: b */
    public C36001a.C36004c f88952b;

    /* renamed from: c */
    public C36001a<?> f88953c;

    /* renamed from: com.urbanairship.android.layout.widget.CheckableView$a */
    public static final class C35991a {
        public /* synthetic */ C35991a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C35991a() {
        }
    }

    /* renamed from: com.urbanairship.android.layout.widget.CheckableView$b */
    public /* synthetic */ class C35992b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleType.values().length];
            iArr[ToggleType.SWITCH.ordinal()] = 1;
            iArr[ToggleType.CHECKBOX.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckableView(@C12579k Context context, @C12579k M m) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(m, C40045d.f102104u);
        this.f88951a = m;
        int i = C35992b.$EnumSwitchMapping$0[m.mo107194N().ordinal()];
        if (i == 1) {
            C35852s M = m.mo107193M();
            Intrinsics.checkNotNull(M, "null cannot be cast to non-null type com.urbanairship.android.layout.property.SwitchStyle");
            mo107641b((C35849p) M);
        } else if (i == 2) {
            C35852s M2 = m.mo107193M();
            Intrinsics.checkNotNull(M2, "null cannot be cast to non-null type com.urbanairship.android.layout.property.CheckboxStyle");
            mo107640a((C35832e) M2);
        }
        C35916j.m148085c(this, m);
        C35922n.m148121a(m.mo107192L(), new C11300l<String, C11079d2>(this) {
            final /* synthetic */ CheckableView<M> this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C11079d2.f28267a;
            }

            public final void invoke(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "it");
                this.this$0.getCheckableView().mo107700c(str);
            }
        });
    }

    private final int getMinHeight() {
        int i = C35992b.$EnumSwitchMapping$0[this.f88951a.mo107194N().ordinal()];
        if (i == 1 || i == 2) {
            return 24;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int getMinWidth() {
        int i = C35992b.$EnumSwitchMapping$0[this.f88951a.mo107194N().ordinal()];
        if (i == 1) {
            return 48;
        }
        if (i == 2) {
            return 24;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public final void mo107640a(C35832e eVar) {
        ShapeButton c = mo107590c(eVar);
        c.setId(this.f88951a.mo107191K());
        C35916j.m148085c(c, this.f88951a);
        setCheckableView(new C36001a.C36003b(c));
        addView(c, -1, -1);
    }

    /* renamed from: b */
    public final void mo107641b(C35849p pVar) {
        SwitchCompat d = mo107591d(pVar);
        d.setId(this.f88951a.mo107191K());
        C35916j.m148089g(d, pVar);
        setCheckableView(new C36001a.C36005d(d));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = -3;
        addView(d, layoutParams);
    }

    @C12579k
    /* renamed from: c */
    public ShapeButton mo107590c(@C12579k C35832e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "style");
        C35832e.C35833a b = eVar.mo107337d().mo107340b();
        Intrinsics.checkNotNullExpressionValue(b, "style.bindings.selected");
        C35832e.C35833a c = eVar.mo107337d().mo107341c();
        Intrinsics.checkNotNullExpressionValue(c, "style.bindings.unselected");
        return new ShapeButton(getContext(), b.mo107339c(), c.mo107339c(), b.mo107338b(), c.mo107338b());
    }

    @C12579k
    /* renamed from: d */
    public SwitchCompat mo107591d(@C12579k C35849p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "style");
        return new SwitchCompat(getContext());
    }

    @C12579k
    public final C36001a<?> getCheckableView() {
        C36001a<?> aVar = this.f88953c;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("checkableView");
        return null;
    }

    @C12580l
    public final C36001a.C36004c getCheckedChangeListener() {
        return this.f88952b;
    }

    @C12579k
    public final M getModel() {
        return this.f88951a;
    }

    public void onMeasure(int i, int i2) {
        int minWidth = getMinWidth();
        int minHeight = getMinHeight();
        if (minWidth == -1 && minHeight == -1) {
            super.onMeasure(i, i2);
            return;
        }
        if (minWidth != -1) {
            int a = (int) C35921m.m148111a(getContext(), minWidth);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(a, 1073741824);
            }
        }
        if (minHeight != -1) {
            int a2 = (int) C35921m.m148111a(getContext(), minHeight);
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(a2, 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setCheckableView(@C12579k C36001a<?> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f88953c = aVar;
    }

    public final void setCheckedChangeListener(@C12580l C36001a.C36004c cVar) {
        this.f88952b = cVar;
    }

    public final void setCheckedInternal(boolean z) {
        getCheckableView().mo107703f((C36001a.C36004c) null);
        getCheckableView().mo107699b(z);
        getCheckableView().mo107703f(this.f88952b);
    }

    public void setEnabled(boolean z) {
        getCheckableView().mo107701d(z);
    }
}
