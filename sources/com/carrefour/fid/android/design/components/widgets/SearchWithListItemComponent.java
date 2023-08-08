package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.content.res.C0507a;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37076s0;
import com.carrefour.fid.android.design.components.extension.ButtonKt;
import com.carrefour.fid.android.design.components.extension.C37110c;
import com.carrefour.fid.android.design.components.extension.EditTextKt;
import com.google.android.material.button.MaterialButton;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010?\u001a\u00020>\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\b\b\u0002\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R0\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R*\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R*\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006G"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/SearchWithListItemComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/d2;", "B", "z", "", "isEnabled", "setEditTextEnabled", "", "text", "setText", "hint", "setHintText", "isLoading", "setLoading", "setEnabled", "errorMessage", "setErrorMessage", "E", "y", "onDetachedFromWindow", "Lcom/carrefour/fid/android/design/components/databinding/s0;", "a", "Lcom/carrefour/fid/android/design/components/databinding/s0;", "binding", "b", "Z", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "c", "Landroid/graphics/Typeface;", "typeface", "Lkotlin/Function1;", "d", "Lkotlin/jvm/functions/l;", "getOnEditTextEditionFinishedListener", "()Lkotlin/jvm/functions/l;", "setOnEditTextEditionFinishedListener", "(Lkotlin/jvm/functions/l;)V", "onEditTextEditionFinishedListener", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/a;", "getOnKeyboardNextButtonClickedListener", "()Lkotlin/jvm/functions/a;", "setOnKeyboardNextButtonClickedListener", "(Lkotlin/jvm/functions/a;)V", "onKeyboardNextButtonClickedListener", "f", "getOnFocusChangeListener", "setOnFocusChangeListener", "onFocusChangeListener", "g", "getOnDeleteButtonClickListener", "setOnDeleteButtonClickListener", "onDeleteButtonClickListener", "v", "getOnErrorOccurredListener", "setOnErrorOccurredListener", "onErrorOccurredListener", "getText", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "w", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nSearchWithListItemComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchWithListItemComponent.kt\ncom/carrefour/fid/android/design/components/widgets/SearchWithListItemComponent\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,173:1\n262#2,2:174\n262#2,2:176\n*S KotlinDebug\n*F\n+ 1 SearchWithListItemComponent.kt\ncom/carrefour/fid/android/design/components/widgets/SearchWithListItemComponent\n*L\n143#1:174,2\n145#1:176,2\n*E\n"})
public final class SearchWithListItemComponent extends ConstraintLayout {
    @C12579k

    /* renamed from: w */
    public static final C37164a f93157w = new C37164a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f93158x = 8;

    /* renamed from: y */
    public static final long f93159y = 300;
    @C12579k

    /* renamed from: a */
    public final C37076s0 f93160a;

    /* renamed from: b */
    public boolean f93161b;

    /* renamed from: c */
    public final Typeface f93162c;
    @C12580l

    /* renamed from: d */
    public C11300l<? super String, C11079d2> f93163d;
    @C12580l

    /* renamed from: e */
    public C11289a<C11079d2> f93164e;
    @C12580l

    /* renamed from: f */
    public C11300l<? super Boolean, C11079d2> f93165f;
    @C12580l

    /* renamed from: g */
    public C11289a<C11079d2> f93166g;
    @C12580l

    /* renamed from: v */
    public C11289a<C11079d2> f93167v;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.SearchWithListItemComponent$a */
    public static final class C37164a {
        public /* synthetic */ C37164a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C37164a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public SearchWithListItemComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: A */
    public static final void m152518A(SearchWithListItemComponent searchWithListItemComponent, View view) {
        Intrinsics.checkNotNullParameter(searchWithListItemComponent, "this$0");
        C11289a<C11079d2> aVar = searchWithListItemComponent.f93166g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: C */
    public static final void m152519C(SearchWithListItemComponent searchWithListItemComponent, View view, boolean z) {
        Intrinsics.checkNotNullParameter(searchWithListItemComponent, "this$0");
        C11300l<? super Boolean, C11079d2> lVar = searchWithListItemComponent.f93165f;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
    }

    /* renamed from: D */
    public static final boolean m152520D(SearchWithListItemComponent searchWithListItemComponent, TextView textView, int i, KeyEvent keyEvent) {
        C11289a<C11079d2> aVar;
        Intrinsics.checkNotNullParameter(searchWithListItemComponent, "this$0");
        if (i != 5 || (aVar = searchWithListItemComponent.f93164e) == null) {
            return false;
        }
        aVar.invoke();
        return false;
    }

    private final void setEditTextEnabled(boolean z) {
        this.f93160a.f92812c.setEnabled(z);
        if (z) {
            this.f93160a.f92812c.setTextColor(getResources().getColor(C36896b.C36902f.ds_grey_5, getContext().getTheme()));
        } else {
            this.f93160a.f92812c.setTextColor(getResources().getColor(C36896b.C36902f.ds_grey_20, getContext().getTheme()));
        }
    }

    /* renamed from: B */
    public final void mo113054B() {
        C37076s0 s0Var = this.f93160a;
        s0Var.f92812c.setTypeface(this.f93162c, 2);
        EditText editText = s0Var.f92812c;
        Intrinsics.checkNotNullExpressionValue(editText, "searchListItemEditText");
        C11909g.m47412V0(C11909g.m47418X0(C11909g.m47427a0(C11909g.m47448f1(C11909g.m47451g0(EditTextKt.m152108b(editText)), new SearchWithListItemComponent$initView$1$1(s0Var, this, (C11045c<? super SearchWithListItemComponent$initView$1$1>) null)), 300), new SearchWithListItemComponent$initView$1$2(this, (C11045c<? super SearchWithListItemComponent$initView$1$2>) null)), C37110c.m152146d(this));
        s0Var.f92812c.setOnFocusChangeListener(new C37235g1(this));
        s0Var.f92812c.setOnEditorActionListener(new C37238h1(this));
    }

    /* renamed from: E */
    public final void mo113055E() {
        this.f93160a.f92813d.setVisibility(4);
        this.f93160a.f92814e.setBackgroundColor(getResources().getColor(C36896b.C36902f.ds_grey_60, getContext().getTheme()));
    }

    @C12580l
    public final C11289a<C11079d2> getOnDeleteButtonClickListener() {
        return this.f93166g;
    }

    @C12580l
    public final C11300l<String, C11079d2> getOnEditTextEditionFinishedListener() {
        return this.f93163d;
    }

    @C12580l
    public final C11289a<C11079d2> getOnErrorOccurredListener() {
        return this.f93167v;
    }

    @C12580l
    public final C11300l<Boolean, C11079d2> getOnFocusChangeListener() {
        return this.f93165f;
    }

    @C12580l
    public final C11289a<C11079d2> getOnKeyboardNextButtonClickedListener() {
        return this.f93164e;
    }

    @C12579k
    public final String getText() {
        return this.f93160a.f92812c.getText().toString();
    }

    public void onDetachedFromWindow() {
        mo113073y();
        super.onDetachedFromWindow();
    }

    public void setEnabled(boolean z) {
        setEditTextEnabled(z);
        if (!z) {
            MaterialButton materialButton = this.f93160a.f92811b;
            Intrinsics.checkNotNullExpressionValue(materialButton, "binding.searchListItemDeleteButton");
            materialButton.setVisibility(8);
        } else if (!C11622t.isBlank(getText())) {
            MaterialButton materialButton2 = this.f93160a.f92811b;
            Intrinsics.checkNotNullExpressionValue(materialButton2, "binding.searchListItemDeleteButton");
            materialButton2.setVisibility(0);
        }
    }

    public final void setErrorMessage(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C9874a.f27073r);
        this.f93160a.f92813d.setText(str);
        this.f93160a.f92813d.setVisibility(0);
        this.f93160a.f92814e.setBackgroundColor(getResources().getColor(C36896b.C36902f.ds_red_1, getContext().getTheme()));
    }

    public final void setHintText(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "hint");
        this.f93160a.f92812c.setHint(str);
    }

    public final void setLoading(boolean z) {
        this.f93161b = z;
        if (z) {
            MaterialButton materialButton = this.f93160a.f92811b;
            Intrinsics.checkNotNullExpressionValue(materialButton, "binding.searchListItemDeleteButton");
            ButtonKt.m152103e(materialButton, true, (Drawable) null, (String) null, (Integer) null, (Integer) null, 30, (Object) null);
            setEnabled(false);
            return;
        }
        MaterialButton materialButton2 = this.f93160a.f92811b;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "binding.searchListItemDeleteButton");
        ButtonKt.m152103e(materialButton2, false, C0507a.m2346b(getContext(), C36896b.C36904h.ds_ic_symbol_cross), (String) null, (Integer) null, 0, 12, (Object) null);
        setEnabled(true);
    }

    public final void setOnDeleteButtonClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93166g = aVar;
    }

    public final void setOnEditTextEditionFinishedListener(@C12580l C11300l<? super String, C11079d2> lVar) {
        this.f93163d = lVar;
    }

    public final void setOnErrorOccurredListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93167v = aVar;
    }

    public final void setOnFocusChangeListener(@C12580l C11300l<? super Boolean, C11079d2> lVar) {
        this.f93165f = lVar;
    }

    public final void setOnKeyboardNextButtonClickedListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93164e = aVar;
    }

    public final void setText(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        EditText editText = this.f93160a.f92812c;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.searchListItemEditText");
        EditTextKt.m152107a(editText, str);
    }

    /* renamed from: y */
    public final void mo113073y() {
        this.f93163d = null;
        this.f93164e = null;
        this.f93165f = null;
        this.f93166g = null;
        this.f93167v = null;
    }

    /* renamed from: z */
    public final void mo113074z() {
        this.f93160a.f92811b.setOnClickListener(new C37241i1(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public SearchWithListItemComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchWithListItemComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public SearchWithListItemComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37076s0 d = C37076s0.m152059d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n            Lay…           true\n        )");
        this.f93160a = d;
        this.f93162c = d.f92812c.getTypeface();
        mo113054B();
        mo113074z();
    }
}
