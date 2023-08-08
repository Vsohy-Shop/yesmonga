package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0358n;
import androidx.annotation.C0375v;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.core.widget.C18483j;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37040e;
import com.carrefour.fid.android.design.components.type.CheckboxState;
import com.carrefour.fid.android.design.components.utils.C37135b;
import com.urbanairship.iam.events.C9175a;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000f\u001dB'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/CheckboxComponent;", "Landroid/widget/FrameLayout;", "Lcom/carrefour/fid/android/design/components/widgets/CheckboxComponent$a;", "uiViewModel", "Lkotlin/d2;", "b", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "c", "d", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/a;", "getOnCheckboxClickListener", "()Lkotlin/jvm/functions/a;", "setOnCheckboxClickListener", "(Lkotlin/jvm/functions/a;)V", "onCheckboxClickListener", "Lcom/carrefour/fid/android/design/components/databinding/e;", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/design/components/databinding/e;", "binding", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "CheckboxVariant", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class CheckboxComponent extends FrameLayout {

    /* renamed from: c */
    public static final int f93017c = 8;
    @C12580l

    /* renamed from: a */
    public C11289a<C11079d2> f93018a;
    @C12579k

    /* renamed from: b */
    public final C11677z f93019b;

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0015\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B3\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/CheckboxComponent$CheckboxVariant;", "", "", "background", "I", "q", "()I", "icon", "Ljava/lang/Integer;", "r", "()Ljava/lang/Integer;", "tintColor", "y", "textColor", "w", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;II)V", "a", "b", "c", "d", "e", "f", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum CheckboxVariant {
        NORMAL_CHECKED(r11, r4, r13, r14),
        NORMAL_UNCHECKED(C36896b.C36904h.background_checkbox_unchecked, (int) null, r13, r14),
        NORMAL_INDETERMINATE(r11, Integer.valueOf(r1), r13, r14),
        DISABLED_CHECKED(r12, r6, r13, r13),
        DISABLED_UNCHECKED(r8, (int) null, r10, r11),
        DISABLED_INDETERMINATE(r8, Integer.valueOf(r1), r10, r11);
        
        private final int background;
        @C12580l
        private final Integer icon;
        private final int textColor;
        private final int tintColor;

        /* access modifiers changed from: public */
        CheckboxVariant(@C0375v int i, @C0375v Integer num, @C0358n int i2, @C0358n int i3) {
            this.background = i;
            this.icon = num;
            this.tintColor = i2;
            this.textColor = i3;
        }

        /* renamed from: q */
        public final int mo112830q() {
            return this.background;
        }

        @C12580l
        /* renamed from: r */
        public final Integer mo112831r() {
            return this.icon;
        }

        /* renamed from: w */
        public final int mo112832w() {
            return this.textColor;
        }

        /* renamed from: y */
        public final int mo112833y() {
            return this.tintColor;
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.CheckboxComponent$b */
    public /* synthetic */ class C37151b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.design.components.type.CheckboxState[] r0 = com.carrefour.fid.android.design.components.type.CheckboxState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.type.CheckboxState r1 = com.carrefour.fid.android.design.components.type.CheckboxState.CHECKED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.type.CheckboxState r1 = com.carrefour.fid.android.design.components.type.CheckboxState.UNCHECKED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.design.components.type.CheckboxState r1 = com.carrefour.fid.android.design.components.type.CheckboxState.INDETERMINATE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.CheckboxComponent.C37151b.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CheckboxComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: e */
    public static final void m152285e(CheckboxComponent checkboxComponent, View view) {
        Intrinsics.checkNotNullParameter(checkboxComponent, "this$0");
        C11289a<C11079d2> aVar = checkboxComponent.f93018a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    private final C37040e getBinding() {
        return (C37040e) this.f93019b.getValue();
    }

    /* renamed from: b */
    public final void mo112825b(@C12579k C37150a aVar) {
        CheckboxVariant checkboxVariant;
        int i;
        C11079d2 d2Var;
        Intrinsics.checkNotNullParameter(aVar, "uiViewModel");
        int i2 = C37151b.$EnumSwitchMapping$0[aVar.mo112843i().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                } else if (aVar.mo112841h()) {
                    checkboxVariant = CheckboxVariant.DISABLED_INDETERMINATE;
                } else {
                    checkboxVariant = CheckboxVariant.NORMAL_INDETERMINATE;
                }
            } else if (aVar.mo112841h()) {
                checkboxVariant = CheckboxVariant.DISABLED_UNCHECKED;
            } else {
                checkboxVariant = CheckboxVariant.NORMAL_UNCHECKED;
            }
        } else if (aVar.mo112841h()) {
            checkboxVariant = CheckboxVariant.DISABLED_CHECKED;
        } else {
            checkboxVariant = CheckboxVariant.NORMAL_CHECKED;
        }
        AppCompatTextView appCompatTextView = getBinding().f92614c;
        if (aVar.mo112844j() != null) {
            i = 0;
        } else {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        getBinding().f92613b.setBackground(C17318d.m79726i(getContext(), checkboxVariant.mo112830q()));
        C18483j.m83673c(getBinding().f92613b, ColorStateList.valueOf(C17318d.m79723f(getContext(), checkboxVariant.mo112833y())));
        String j = aVar.mo112844j();
        Drawable drawable = null;
        if (j != null) {
            getBinding().f92614c.setVisibility(0);
            getBinding().f92614c.setTextColor(C17318d.m79723f(getContext(), checkboxVariant.mo112832w()));
            getBinding().f92614c.setText(j);
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            getBinding().f92614c.setVisibility(8);
        }
        AppCompatImageView appCompatImageView = getBinding().f92613b;
        if (checkboxVariant.mo112831r() != null) {
            drawable = C17318d.m79726i(getContext(), checkboxVariant.mo112831r().intValue());
        }
        appCompatImageView.setImageDrawable(drawable);
        if (aVar.mo112846l()) {
            getBinding().f92614c.setPaintFlags(getBinding().f92614c.getPaintFlags() | 16);
        } else {
            getBinding().f92614c.setPaintFlags(getBinding().f92614c.getPaintFlags() & -17);
        }
        Integer k = aVar.mo112845k();
        if (k != null) {
            getBinding().f92614c.setTextSize(0, (float) k.intValue());
        }
        invalidate();
        requestLayout();
    }

    /* renamed from: c */
    public final void mo112826c(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C36896b.C36914r.CheckboxComponent, i, 0);
            try {
                mo112825b(new C37150a(obtainStyledAttributes.getBoolean(C36896b.C36914r.CheckboxComponent_checkboxDisabled, false), CheckboxState.f92931a.mo112738a(obtainStyledAttributes.getInteger(C36896b.C36914r.CheckboxComponent_checkboxState, CheckboxState.UNCHECKED.mo112737q())), obtainStyledAttributes.getString(C36896b.C36914r.CheckboxComponent_checkboxText), false, Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(C36896b.C36914r.CheckboxComponent_checkboxTextSize, C37135b.m152207b(context, 14))), 8, (DefaultConstructorMarker) null));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: d */
    public final void mo112827d() {
        getBinding().f92615d.setOnClickListener(new C37239i(this));
    }

    @C12580l
    public final C11289a<C11079d2> getOnCheckboxClickListener() {
        return this.f93018a;
    }

    public final void setOnCheckboxClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93018a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CheckboxComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckboxComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public CheckboxComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93019b = C10864b0.m38748c(new CheckboxComponent$binding$2(context, this));
        mo112826c(context, attributeSet, i);
        mo112827d();
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.CheckboxComponent$a */
    public static final class C37150a {

        /* renamed from: f */
        public static final int f93027f = 0;

        /* renamed from: a */
        public final boolean f93028a;
        @C12579k

        /* renamed from: b */
        public final CheckboxState f93029b;
        @C12580l

        /* renamed from: c */
        public final String f93030c;

        /* renamed from: d */
        public final boolean f93031d;
        @C12580l

        /* renamed from: e */
        public final Integer f93032e;

        public C37150a(boolean z, @C12579k CheckboxState checkboxState, @C12580l String str, boolean z2, @C12580l Integer num) {
            Intrinsics.checkNotNullParameter(checkboxState, "checkboxState");
            this.f93028a = z;
            this.f93029b = checkboxState;
            this.f93030c = str;
            this.f93031d = z2;
            this.f93032e = num;
        }

        /* renamed from: g */
        public static /* synthetic */ C37150a m152294g(C37150a aVar, boolean z, CheckboxState checkboxState, String str, boolean z2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f93028a;
            }
            if ((i & 2) != 0) {
                checkboxState = aVar.f93029b;
            }
            CheckboxState checkboxState2 = checkboxState;
            if ((i & 4) != 0) {
                str = aVar.f93030c;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                z2 = aVar.f93031d;
            }
            boolean z3 = z2;
            if ((i & 16) != 0) {
                num = aVar.f93032e;
            }
            return aVar.mo112840f(z, checkboxState2, str2, z3, num);
        }

        /* renamed from: a */
        public final boolean mo112834a() {
            return this.f93028a;
        }

        @C12579k
        /* renamed from: b */
        public final CheckboxState mo112835b() {
            return this.f93029b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo112836c() {
            return this.f93030c;
        }

        /* renamed from: d */
        public final boolean mo112837d() {
            return this.f93031d;
        }

        @C12580l
        /* renamed from: e */
        public final Integer mo112838e() {
            return this.f93032e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37150a)) {
                return false;
            }
            C37150a aVar = (C37150a) obj;
            return this.f93028a == aVar.f93028a && this.f93029b == aVar.f93029b && Intrinsics.areEqual((Object) this.f93030c, (Object) aVar.f93030c) && this.f93031d == aVar.f93031d && Intrinsics.areEqual((Object) this.f93032e, (Object) aVar.f93032e);
        }

        @C12579k
        /* renamed from: f */
        public final C37150a mo112840f(boolean z, @C12579k CheckboxState checkboxState, @C12580l String str, boolean z2, @C12580l Integer num) {
            Intrinsics.checkNotNullParameter(checkboxState, "checkboxState");
            return new C37150a(z, checkboxState, str, z2, num);
        }

        /* renamed from: h */
        public final boolean mo112841h() {
            return this.f93028a;
        }

        public int hashCode() {
            boolean z = this.f93028a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (((z ? 1 : 0) * true) + this.f93029b.hashCode()) * 31;
            String str = this.f93030c;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z3 = this.f93031d;
            if (!z3) {
                z2 = z3;
            }
            int i2 = (hashCode2 + (z2 ? 1 : 0)) * 31;
            Integer num = this.f93032e;
            if (num != null) {
                i = num.hashCode();
            }
            return i2 + i;
        }

        @C12579k
        /* renamed from: i */
        public final CheckboxState mo112843i() {
            return this.f93029b;
        }

        @C12580l
        /* renamed from: j */
        public final String mo112844j() {
            return this.f93030c;
        }

        @C12580l
        /* renamed from: k */
        public final Integer mo112845k() {
            return this.f93032e;
        }

        /* renamed from: l */
        public final boolean mo112846l() {
            return this.f93031d;
        }

        @C12579k
        public String toString() {
            boolean z = this.f93028a;
            CheckboxState checkboxState = this.f93029b;
            String str = this.f93030c;
            boolean z2 = this.f93031d;
            Integer num = this.f93032e;
            return "CheckboxUIViewModel(checkboxDisabled=" + z + ", checkboxState=" + checkboxState + ", checkboxText=" + str + ", isTextStrikeThrough=" + z2 + ", checkboxTextSize=" + num + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37150a(boolean z, CheckboxState checkboxState, String str, boolean z2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, checkboxState, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : num);
        }
    }
}
