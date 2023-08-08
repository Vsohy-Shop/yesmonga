package com.urbanairship.android.layout.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.method.ScrollingMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.android.layout.model.TextInputModel;
import com.urbanairship.android.layout.util.C35916j;
import com.urbanairship.android.layout.util.C35922n;
import com.urbanairship.android.layout.util.ViewExtensionsKt;
import com.urbanairship.android.layout.widget.C36026n;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.net.C9851c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/TextInputView;", "Landroidx/appcompat/widget/AppCompatEditText;", "Lcom/urbanairship/android/layout/view/a;", "Lcom/urbanairship/android/layout/widget/n;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "Lkotlinx/coroutines/flow/e;", "Lkotlin/d2;", "e", "Lkotlinx/coroutines/channels/g;", "g", "Lkotlinx/coroutines/channels/g;", "clicksChannel", "Landroid/view/View$OnTouchListener;", "v", "Landroid/view/View$OnTouchListener;", "touchListener", "Landroid/content/Context;", "context", "Lcom/urbanairship/android/layout/model/TextInputModel;", "model", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/TextInputModel;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class TextInputView extends AppCompatEditText implements C35977a, C36026n {
    @C12579k

    /* renamed from: g */
    public final C11744g<C11079d2> f88905g = C11748i.m46625d(Integer.MAX_VALUE, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
    @C12579k

    /* renamed from: v */
    public final View.OnTouchListener f88906v;

    /* renamed from: com.urbanairship.android.layout.view.TextInputView$a */
    public static final class C35966a implements TextInputModel.C35781a {

        /* renamed from: a */
        public final /* synthetic */ TextInputView f88907a;

        public C35966a(TextInputView textInputView) {
            this.f88907a = textInputView;
        }

        /* renamed from: b */
        public void mo107162b(@C12579k String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "value");
            Editable text = this.f88907a.getText();
            if (text == null || text.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f88907a.setText(str);
            }
        }

        /* renamed from: f */
        public void mo107011f(boolean z) {
            int i;
            TextInputView textInputView = this.f88907a;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            textInputView.setVisibility(i);
        }

        public void setEnabled(boolean z) {
            this.f88907a.setEnabled(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextInputView(@C12579k Context context, @C12579k TextInputModel textInputModel) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(textInputModel, C40045d.f102104u);
        C35988k kVar = new C35988k(this);
        this.f88906v = kVar;
        setBackground((Drawable) null);
        setMovementMethod(new ScrollingMovementMethod());
        C35916j.m148091i(this, textInputModel);
        C35922n.m148121a(textInputModel.mo107151M(), new C11300l<String, C11079d2>(this) {
            final /* synthetic */ TextInputView this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C11079d2.f28267a;
            }

            public final void invoke(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "it");
                this.this$0.setContentDescription(str);
            }
        });
        textInputModel.mo106988H(new C35966a(this));
        setOnTouchListener(kVar);
    }

    /* renamed from: h */
    public static final boolean m148207h(TextInputView textInputView, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(textInputView, "this$0");
        Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if (ViewExtensionsKt.m148031f(motionEvent)) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
            textInputView.f88905g.mo23751L(C11079d2.f28267a);
        }
        return false;
    }

    @C12579k
    /* renamed from: e */
    public C11907e<C11079d2> mo107595e() {
        return C11909g.m47490s1(this.f88905g);
    }

    @C12580l
    public InputConnection onCreateInputConnection(@C12579k EditorInfo editorInfo) {
        Intrinsics.checkNotNullParameter(editorInfo, "outAttrs");
        editorInfo.imeOptions |= 301989888;
        return super.onCreateInputConnection(editorInfo);
    }
}
