package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.design.components.databinding.C37074r0;
import com.carrefour.fid.android.design.components.extension.C37110c;
import com.carrefour.fid.android.design.components.extension.EditTextKt;
import com.urbanairship.iam.events.C9175a;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00105\u001a\u000204\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\b\b\u0002\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R0\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R*\u00101\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u0006<"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/SearchBarComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "isEnabled", "Lkotlin/d2;", "setFocusOnInput", "G", "y", "z", "", "text", "setScanButtonContentDescription", "F", "A", "Lcom/carrefour/fid/android/design/components/databinding/r0;", "a", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/design/components/databinding/r0;", "binding", "Landroid/widget/EditText;", "b", "Landroid/widget/EditText;", "getSearchBarInput", "()Landroid/widget/EditText;", "searchBarInput", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/l;", "getOnInputChangeListener", "()Lkotlin/jvm/functions/l;", "setOnInputChangeListener", "(Lkotlin/jvm/functions/l;)V", "onInputChangeListener", "Lkotlin/Function0;", "d", "Lkotlin/jvm/functions/a;", "getOnVoiceSearchClickListener", "()Lkotlin/jvm/functions/a;", "setOnVoiceSearchClickListener", "(Lkotlin/jvm/functions/a;)V", "onVoiceSearchClickListener", "e", "getOnScanSearchClickListener", "setOnScanSearchClickListener", "onScanSearchClickListener", "f", "getOnEditSearchClickListener", "setOnEditSearchClickListener", "onEditSearchClickListener", "getText", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class SearchBarComponent extends ConstraintLayout {

    /* renamed from: g */
    public static final int f93150g = 8;
    @C12579k

    /* renamed from: a */
    public final C11677z f93151a;
    @C12579k

    /* renamed from: b */
    public final EditText f93152b;
    @C12580l

    /* renamed from: c */
    public C11300l<? super String, C11079d2> f93153c;
    @C12580l

    /* renamed from: d */
    public C11289a<C11079d2> f93154d;
    @C12580l

    /* renamed from: e */
    public C11289a<C11079d2> f93155e;
    @C12580l

    /* renamed from: f */
    public C11289a<C11079d2> f93156f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public SearchBarComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: B */
    public static final void m152502B(SearchBarComponent searchBarComponent, View view) {
        Intrinsics.checkNotNullParameter(searchBarComponent, "this$0");
        C11289a<C11079d2> aVar = searchBarComponent.f93156f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: C */
    public static final void m152503C(SearchBarComponent searchBarComponent, View view) {
        Intrinsics.checkNotNullParameter(searchBarComponent, "this$0");
        searchBarComponent.f93152b.setText(new String());
    }

    /* renamed from: D */
    public static final void m152504D(SearchBarComponent searchBarComponent, View view) {
        Intrinsics.checkNotNullParameter(searchBarComponent, "this$0");
        C11289a<C11079d2> aVar = searchBarComponent.f93154d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: E */
    public static final void m152505E(SearchBarComponent searchBarComponent, View view) {
        Intrinsics.checkNotNullParameter(searchBarComponent, "this$0");
        C11289a<C11079d2> aVar = searchBarComponent.f93155e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    private final C37074r0 getBinding() {
        return (C37074r0) this.f93151a.getValue();
    }

    private final void setFocusOnInput(boolean z) {
        getBinding().f92801e.setFocusable(z);
        getBinding().f92801e.setFocusableInTouchMode(z);
    }

    /* renamed from: A */
    public final void mo113035A() {
        C37074r0 binding = getBinding();
        this.f93152b.setOnClickListener(new C37201b1(this));
        binding.f92799c.setOnClickListener(new C37204c1(this));
        binding.f92802f.setOnClickListener(new C37217d1(this));
        binding.f92803g.setOnClickListener(new C37220e1(this));
    }

    /* renamed from: F */
    public final void mo113036F() {
        C11909g.m47412V0(C11909g.m47418X0(C11909g.m47427a0(C11909g.m47448f1(C11909g.m47451g0(EditTextKt.m152108b(this.f93152b)), new SearchBarComponent$initView$1$1(getBinding(), (C11045c<? super SearchBarComponent$initView$1$1>) null)), 300), new SearchBarComponent$initView$1$2(this, (C11045c<? super SearchBarComponent$initView$1$2>) null)), C37110c.m152146d(this));
    }

    /* renamed from: G */
    public final void mo113037G() {
        setFocusOnInput(true);
        getBinding().f92801e.requestFocus();
    }

    @C12580l
    public final C11289a<C11079d2> getOnEditSearchClickListener() {
        return this.f93156f;
    }

    @C12580l
    public final C11300l<String, C11079d2> getOnInputChangeListener() {
        return this.f93153c;
    }

    @C12580l
    public final C11289a<C11079d2> getOnScanSearchClickListener() {
        return this.f93155e;
    }

    @C12580l
    public final C11289a<C11079d2> getOnVoiceSearchClickListener() {
        return this.f93154d;
    }

    @C12579k
    public final EditText getSearchBarInput() {
        return this.f93152b;
    }

    @C12579k
    public final String getText() {
        return getBinding().f92801e.getText().toString();
    }

    public final void setOnEditSearchClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93156f = aVar;
    }

    public final void setOnInputChangeListener(@C12580l C11300l<? super String, C11079d2> lVar) {
        this.f93153c = lVar;
    }

    public final void setOnScanSearchClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93155e = aVar;
    }

    public final void setOnVoiceSearchClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93154d = aVar;
    }

    public final void setScanButtonContentDescription(@C12580l String str) {
        getBinding().f92803g.setContentDescription(str);
    }

    /* renamed from: y */
    public final void mo113049y() {
        getBinding().f92801e.clearFocus();
    }

    /* renamed from: z */
    public final void mo113050z() {
        getBinding().f92801e.getText().clear();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public SearchBarComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchBarComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public SearchBarComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93151a = C10864b0.m38748c(new SearchBarComponent$binding$2(context, this));
        EditText editText = getBinding().f92801e;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.searchBarInput");
        this.f93152b = editText;
        mo113036F();
        mo113035A();
    }
}
