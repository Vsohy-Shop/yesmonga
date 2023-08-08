package com.carrefour.fid.android.shared.extension;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.annotation.C0349j;
import androidx.annotation.C0364q;
import androidx.annotation.C0375v;
import com.google.android.material.badge.C31132a;
import com.journeyapps.barcodescanner.camera.C34935s;
import com.usabilla.sdk.ubform.net.C9851c;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\ncom/carrefour/fid/android/shared/extension/TextViewKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,165:1\n11365#2:166\n11700#2,3:167\n*S KotlinDebug\n*F\n+ 1 TextView.kt\ncom/carrefour/fid/android/shared/extension/TextViewKt\n*L\n49#1:166\n49#1:167,3\n*E\n"})
public final class TextViewKt {

    /* renamed from: com.carrefour.fid.android.shared.extension.TextViewKt$a */
    public static final class C28729a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C12074o0 f70387a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<CharSequence, C11079d2> f70388b;

        public C28729a(C12074o0 o0Var, C11300l<? super CharSequence, C11079d2> lVar) {
            this.f70387a = o0Var;
            this.f70388b = lVar;
        }

        public void afterTextChanged(@C12579k Editable editable) {
            Intrinsics.checkNotNullParameter(editable, C34935s.f84988a);
        }

        public void beforeTextChanged(@C12579k CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, C34935s.f84988a);
        }

        public void onTextChanged(@C12579k CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, C34935s.f84988a);
            if (C12079p0.m48270k(this.f70387a)) {
                this.f70388b.invoke(charSequence);
            }
        }
    }

    @SuppressLint({"Recycle"})
    /* renamed from: d */
    public static final void m118953d(@C12579k TextView textView, @C12579k @C0364q int... iArr) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "textSizes");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int dimension : iArr) {
            arrayList.add(Float.valueOf(textView.getResources().getDimension(dimension)));
        }
        float[] N5 = CollectionsKt___CollectionsKt.m40542N5(arrayList);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "textSize", Arrays.copyOf(N5, N5.length));
        textView.clearAnimation();
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    @C0349j
    @C12579k
    /* renamed from: e */
    public static final C11907e<C28768m0> m118954e(@C12579k TextView textView, @C12579k C11300l<? super C28768m0, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "handled");
        return C11909g.m47500w(new TextViewKt$editorActionEvents$1(textView, lVar, (C11045c<? super TextViewKt$editorActionEvents$1>) null));
    }

    /* renamed from: f */
    public static /* synthetic */ C11907e m118955f(TextView textView, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = C28757h.f70418a;
        }
        return m118954e(textView, lVar);
    }

    @C0349j
    /* renamed from: g */
    public static final TextView.OnEditorActionListener m118956g(C12074o0 o0Var, C11300l<? super C28768m0, Boolean> lVar, C11300l<? super C28768m0, C11079d2> lVar2) {
        return new C28770n0(o0Var, lVar, lVar2);
    }

    @C0349j
    /* renamed from: h */
    public static final C28729a m118957h(C12074o0 o0Var, C11300l<? super CharSequence, C11079d2> lVar) {
        return new C28729a(o0Var, lVar);
    }

    /* renamed from: i */
    public static final boolean m118958i(C12074o0 o0Var, C11300l lVar, C11300l lVar2, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(o0Var, "$scope");
        Intrinsics.checkNotNullParameter(lVar, "$handled");
        Intrinsics.checkNotNullParameter(lVar2, "$emitter");
        if (!C12079p0.m48270k(o0Var)) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(textView, C9851c.f26937h);
        C28768m0 m0Var = new C28768m0(textView, i, keyEvent);
        if (!((Boolean) lVar.invoke(m0Var)).booleanValue()) {
            return false;
        }
        lVar2.invoke(m0Var);
        return true;
    }

    /* renamed from: j */
    public static final void m118959j(@C12579k TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setPaintFlags(1);
    }

    /* renamed from: k */
    public static final void m118960k(@C12579k TextView textView, @C12579k String str, @C0375v int i, @C0375v int i2, @C0375v int i3, @C0375v int i4) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(str, "message");
        textView.setText(str);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    /* renamed from: l */
    public static /* synthetic */ void m118961l(TextView textView, String str, int i, int i2, int i3, int i4, int i5, Object obj) {
        m118960k(textView, str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }

    /* renamed from: m */
    public static final void m118962m(@C12579k TextView textView, @C12580l Double d) {
        double d2;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (d != null) {
            d2 = d.doubleValue();
        } else {
            d2 = 0.0d;
        }
        textView.setText(C28782t.m119105b(Double.valueOf(d2)));
    }

    /* renamed from: n */
    public static final void m118963n(@C12579k TextView textView, @C12580l String str) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        m118962m(textView, Double.valueOf(StringKt.m118946z(str, 0.0d, 1, (Object) null)));
    }

    /* renamed from: o */
    public static final void m118964o(@C12579k TextView textView, @C12580l String str) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        String b = C28782t.m119105b(Double.valueOf(StringKt.m118946z(str, 0.0d, 1, (Object) null)));
        textView.setText(C31132a.f74628J0 + b);
    }

    /* renamed from: p */
    public static final void m118965p(@C12579k TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setPaintFlags(textView.getPaintFlags() | 16);
    }

    /* renamed from: q */
    public static final void m118966q(@C12579k TextView textView, int i, @C12580l Integer num, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        SpannableString spannableString = new SpannableString(textView.getText());
        StyleSpan styleSpan = new StyleSpan(i2);
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = spannableString.length();
        }
        spannableString.setSpan(styleSpan, i, i3, 33);
        textView.setText(spannableString);
    }

    /* renamed from: r */
    public static /* synthetic */ void m118967r(TextView textView, int i, Integer num, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            num = null;
        }
        m118966q(textView, i, num, i2);
    }

    @C0349j
    @C12579k
    /* renamed from: s */
    public static final C28744a0<CharSequence> m118968s(@C12579k TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        C11907e w = C11909g.m47500w(new TextViewKt$textEventChanges$1(textView, (C11045c<? super TextViewKt$textEventChanges$1>) null));
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "text");
        return InitialValueFlowKt.m118854a(w, text);
    }

    /* renamed from: t */
    public static final void m118969t(@C12579k TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setPaintFlags(textView.getPaintFlags() | 8);
    }
}
