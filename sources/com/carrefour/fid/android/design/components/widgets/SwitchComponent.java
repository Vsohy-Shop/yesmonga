package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37042e1;
import com.urbanairship.iam.events.C9175a;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002R0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR$\u0010 \u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f8F@FX\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/SwitchComponent;", "Landroid/widget/FrameLayout;", "Lcom/carrefour/fid/android/design/components/widgets/SwitchComponent$a;", "uiViewModel", "Lkotlin/d2;", "b", "d", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "c", "Lkotlin/Function1;", "", "a", "Lkotlin/jvm/functions/l;", "getOnCheckedChangeListener", "()Lkotlin/jvm/functions/l;", "setOnCheckedChangeListener", "(Lkotlin/jvm/functions/l;)V", "onCheckedChangeListener", "Lcom/carrefour/fid/android/design/components/databinding/e1;", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/design/components/databinding/e1;", "binding", "", "Ljava/lang/String;", "textOn", "textOff", "isChecked", "f", "()Z", "setChecked", "(Z)V", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class SwitchComponent extends FrameLayout {

    /* renamed from: e */
    public static final int f93256e = 8;
    @C12580l

    /* renamed from: a */
    public C11300l<? super Boolean, C11079d2> f93257a;
    @C12579k

    /* renamed from: b */
    public final C11677z f93258b;
    @C12580l

    /* renamed from: c */
    public String f93259c;
    @C12580l

    /* renamed from: d */
    public String f93260d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public SwitchComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: e */
    public static final void m152677e(SwitchComponent switchComponent, CompoundButton compoundButton, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(switchComponent, "this$0");
        AppCompatTextView appCompatTextView = switchComponent.getBinding().f92622d;
        if (z) {
            str = switchComponent.f93259c;
        } else {
            str = switchComponent.f93260d;
        }
        appCompatTextView.setText(str);
        C11300l<? super Boolean, C11079d2> lVar = switchComponent.f93257a;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
    }

    private final C37042e1 getBinding() {
        return (C37042e1) this.f93258b.getValue();
    }

    /* renamed from: b */
    public final void mo113219b(@C12579k C37181a aVar) {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(aVar, "uiViewModel");
        getBinding().f92620b.setThumbDrawable(C17318d.m79726i(getContext(), C36896b.C36904h.background_switch_thumb));
        getBinding().f92620b.setTrackDrawable(C17318d.m79726i(getContext(), C36896b.C36904h.background_switch_track));
        boolean j = aVar.mo113236j();
        boolean g = aVar.mo113232g();
        getBinding().f92620b.setChecked(j);
        getBinding().f92620b.setEnabled(g);
        this.f93259c = aVar.mo113235i();
        this.f93260d = aVar.mo113233h();
        if (aVar.mo113235i() == null || aVar.mo113233h() == null) {
            getBinding().f92622d.setVisibility(8);
            return;
        }
        getBinding().f92622d.setVisibility(0);
        AppCompatTextView appCompatTextView = getBinding().f92622d;
        if (aVar.mo113236j()) {
            str = aVar.mo113235i();
        } else {
            str = aVar.mo113233h();
        }
        appCompatTextView.setText(str);
        AppCompatTextView appCompatTextView2 = getBinding().f92622d;
        Context context = getContext();
        if (g) {
            i = C36896b.C36902f.ds_grey_5;
        } else {
            i = C36896b.C36902f.ds_grey_20;
        }
        appCompatTextView2.setTextColor(C17318d.m79723f(context, i));
    }

    /* renamed from: c */
    public final void mo113220c(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C36896b.C36914r.SwitchComponent, i, 0);
            try {
                mo113219b(new C37181a(obtainStyledAttributes.getBoolean(C36896b.C36914r.SwitchComponent_switchIsOn, false), obtainStyledAttributes.getString(C36896b.C36914r.SwitchComponent_switchTextOn), obtainStyledAttributes.getString(C36896b.C36914r.SwitchComponent_switchTextOff), obtainStyledAttributes.getBoolean(C36896b.C36914r.SwitchComponent_switchEnabled, true)));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: d */
    public final void mo113221d() {
        getBinding().f92620b.setOnCheckedChangeListener(new C37421w1(this));
    }

    /* renamed from: f */
    public final boolean mo113222f() {
        return getBinding().f92620b.isChecked();
    }

    @C12580l
    public final C11300l<Boolean, C11079d2> getOnCheckedChangeListener() {
        return this.f93257a;
    }

    public final void setChecked(boolean z) {
        getBinding().f92620b.setChecked(z);
    }

    public final void setOnCheckedChangeListener(@C12580l C11300l<? super Boolean, C11079d2> lVar) {
        this.f93257a = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public SwitchComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwitchComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public SwitchComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93258b = C10864b0.m38748c(new SwitchComponent$binding$2(context, this));
        mo113220c(context, attributeSet, i);
        mo113221d();
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.SwitchComponent$a */
    public static final class C37181a {

        /* renamed from: e */
        public static final int f93261e = 0;

        /* renamed from: a */
        public final boolean f93262a;
        @C12580l

        /* renamed from: b */
        public final String f93263b;
        @C12580l

        /* renamed from: c */
        public final String f93264c;

        /* renamed from: d */
        public final boolean f93265d;

        public C37181a(boolean z, @C12580l String str, @C12580l String str2, boolean z2) {
            this.f93262a = z;
            this.f93263b = str;
            this.f93264c = str2;
            this.f93265d = z2;
        }

        /* renamed from: f */
        public static /* synthetic */ C37181a m152682f(C37181a aVar, boolean z, String str, String str2, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f93262a;
            }
            if ((i & 2) != 0) {
                str = aVar.f93263b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.f93264c;
            }
            if ((i & 8) != 0) {
                z2 = aVar.f93265d;
            }
            return aVar.mo113230e(z, str, str2, z2);
        }

        /* renamed from: a */
        public final boolean mo113226a() {
            return this.f93262a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo113227b() {
            return this.f93263b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo113228c() {
            return this.f93264c;
        }

        /* renamed from: d */
        public final boolean mo113229d() {
            return this.f93265d;
        }

        @C12579k
        /* renamed from: e */
        public final C37181a mo113230e(boolean z, @C12580l String str, @C12580l String str2, boolean z2) {
            return new C37181a(z, str, str2, z2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37181a)) {
                return false;
            }
            C37181a aVar = (C37181a) obj;
            return this.f93262a == aVar.f93262a && Intrinsics.areEqual((Object) this.f93263b, (Object) aVar.f93263b) && Intrinsics.areEqual((Object) this.f93264c, (Object) aVar.f93264c) && this.f93265d == aVar.f93265d;
        }

        /* renamed from: g */
        public final boolean mo113232g() {
            return this.f93265d;
        }

        @C12580l
        /* renamed from: h */
        public final String mo113233h() {
            return this.f93264c;
        }

        public int hashCode() {
            boolean z = this.f93262a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            String str = this.f93263b;
            int i2 = 0;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f93264c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            int i3 = (hashCode + i2) * 31;
            boolean z3 = this.f93265d;
            if (!z3) {
                z2 = z3;
            }
            return i3 + (z2 ? 1 : 0);
        }

        @C12580l
        /* renamed from: i */
        public final String mo113235i() {
            return this.f93263b;
        }

        /* renamed from: j */
        public final boolean mo113236j() {
            return this.f93262a;
        }

        @C12579k
        public String toString() {
            boolean z = this.f93262a;
            String str = this.f93263b;
            String str2 = this.f93264c;
            boolean z2 = this.f93265d;
            return "SwitchUIViewModel(isOn=" + z + ", textOn=" + str + ", textOff=" + str2 + ", switchEnabled=" + z2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37181a(boolean z, String str, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, str, str2, (i & 8) != 0 ? true : z2);
        }
    }
}
