package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class TextViewKt {

    /* renamed from: androidx.core.widget.TextViewKt$a */
    public static final class C18457a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C11300l<Editable, C11079d2> f47195a;

        /* renamed from: b */
        public final /* synthetic */ C11306r<CharSequence, Integer, Integer, Integer, C11079d2> f47196b;

        /* renamed from: c */
        public final /* synthetic */ C11306r<CharSequence, Integer, Integer, Integer, C11079d2> f47197c;

        public C18457a(C11300l<? super Editable, C11079d2> lVar, C11306r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C11079d2> rVar, C11306r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C11079d2> rVar2) {
            this.f47195a = lVar;
            this.f47196b = rVar;
            this.f47197c = rVar2;
        }

        public void afterTextChanged(@C12580l Editable editable) {
            this.f47195a.invoke(editable);
        }

        public void beforeTextChanged(@C12580l CharSequence charSequence, int i, int i2, int i3) {
            this.f47196b.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        public void onTextChanged(@C12580l CharSequence charSequence, int i, int i2, int i3) {
            this.f47197c.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    /* renamed from: androidx.core.widget.TextViewKt$b */
    public static final class C18458b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C11300l f47198a;

        public C18458b(C11300l lVar) {
            this.f47198a = lVar;
        }

        public void afterTextChanged(@C12580l Editable editable) {
            this.f47198a.invoke(editable);
        }

        public void beforeTextChanged(@C12580l CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(@C12580l CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: androidx.core.widget.TextViewKt$c */
    public static final class C18459c implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C11306r f47199a;

        public C18459c(C11306r rVar) {
            this.f47199a = rVar;
        }

        public void afterTextChanged(@C12580l Editable editable) {
        }

        public void beforeTextChanged(@C12580l CharSequence charSequence, int i, int i2, int i3) {
            this.f47199a.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        public void onTextChanged(@C12580l CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: androidx.core.widget.TextViewKt$d */
    public static final class C18460d implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C11306r f47200a;

        public C18460d(C11306r rVar) {
            this.f47200a = rVar;
        }

        public void afterTextChanged(@C12580l Editable editable) {
        }

        public void beforeTextChanged(@C12580l CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(@C12580l CharSequence charSequence, int i, int i2, int i3) {
            this.f47200a.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    @C12579k
    /* renamed from: a */
    public static final TextWatcher m83588a(@C12579k TextView textView, @C12579k C11306r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C11079d2> rVar, @C12579k C11306r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C11079d2> rVar2, @C12579k C11300l<? super Editable, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(rVar, "beforeTextChanged");
        Intrinsics.checkNotNullParameter(rVar2, "onTextChanged");
        Intrinsics.checkNotNullParameter(lVar, "afterTextChanged");
        C18457a aVar = new C18457a(lVar, rVar, rVar2);
        textView.addTextChangedListener(aVar);
        return aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ TextWatcher m83589b(TextView textView, C11306r rVar, C11306r rVar2, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            rVar = TextViewKt$addTextChangedListener$1.f47201f;
        }
        if ((i & 2) != 0) {
            rVar2 = TextViewKt$addTextChangedListener$2.f47202f;
        }
        if ((i & 4) != 0) {
            lVar = TextViewKt$addTextChangedListener$3.f47203f;
        }
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(rVar, "beforeTextChanged");
        Intrinsics.checkNotNullParameter(rVar2, "onTextChanged");
        Intrinsics.checkNotNullParameter(lVar, "afterTextChanged");
        C18457a aVar = new C18457a(lVar, rVar, rVar2);
        textView.addTextChangedListener(aVar);
        return aVar;
    }

    @C12579k
    /* renamed from: c */
    public static final TextWatcher m83590c(@C12579k TextView textView, @C12579k C11300l<? super Editable, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C18458b bVar = new C18458b(lVar);
        textView.addTextChangedListener(bVar);
        return bVar;
    }

    @C12579k
    /* renamed from: d */
    public static final TextWatcher m83591d(@C12579k TextView textView, @C12579k C11306r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C11079d2> rVar) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(rVar, "action");
        C18459c cVar = new C18459c(rVar);
        textView.addTextChangedListener(cVar);
        return cVar;
    }

    @C12579k
    /* renamed from: e */
    public static final TextWatcher m83592e(@C12579k TextView textView, @C12579k C11306r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C11079d2> rVar) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(rVar, "action");
        C18460d dVar = new C18460d(rVar);
        textView.addTextChangedListener(dVar);
        return dVar;
    }
}
