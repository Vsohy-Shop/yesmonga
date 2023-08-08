package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C18001r;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.emoji2.text.q */
public final class C19107q extends SpannableStringBuilder {
    @C0359n0

    /* renamed from: a */
    public final Class<?> f48621a;
    @C0359n0

    /* renamed from: b */
    public final List<C19108a> f48622b = new ArrayList();

    /* renamed from: androidx.emoji2.text.q$a */
    public static class C19108a implements TextWatcher, SpanWatcher {

        /* renamed from: a */
        public final Object f48623a;

        /* renamed from: b */
        public final AtomicInteger f48624b = new AtomicInteger(0);

        public C19108a(Object obj) {
            this.f48623a = obj;
        }

        /* renamed from: a */
        public final void mo56343a() {
            this.f48624b.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f48623a).afterTextChanged(editable);
        }

        /* renamed from: b */
        public final boolean mo56345b(Object obj) {
            return obj instanceof C19091k;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f48623a).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* renamed from: c */
        public final void mo56347c() {
            this.f48624b.decrementAndGet();
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f48624b.get() <= 0 || !mo56345b(obj)) {
                ((SpanWatcher) this.f48623a).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f48624b.get() <= 0 || !mo56345b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i > i2) {
                        i = 0;
                    }
                    if (i3 > i4) {
                        i6 = i;
                        i5 = 0;
                        ((SpanWatcher) this.f48623a).onSpanChanged(spannable, obj, i6, i2, i5, i4);
                    }
                }
                i6 = i;
                i5 = i3;
                ((SpanWatcher) this.f48623a).onSpanChanged(spannable, obj, i6, i2, i5, i4);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f48624b.get() <= 0 || !mo56345b(obj)) {
                ((SpanWatcher) this.f48623a).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f48623a).onTextChanged(charSequence, i, i2, i3);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C19107q(@C0359n0 Class<?> cls) {
        C18001r.m81776m(cls, "watcherClass cannot be null");
        this.f48621a = cls;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public static C19107q m89431c(@C0359n0 Class<?> cls, @C0359n0 CharSequence charSequence) {
        return new C19107q(cls, charSequence);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public void mo56318a() {
        mo56323b();
    }

    /* renamed from: b */
    public final void mo56323b() {
        for (int i = 0; i < this.f48622b.size(); i++) {
            this.f48622b.get(i).mo56343a();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: d */
    public void mo56324d() {
        mo56334i();
        mo56326e();
    }

    /* renamed from: e */
    public final void mo56326e() {
        for (int i = 0; i < this.f48622b.size(); i++) {
            this.f48622b.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    public final C19108a mo56327f(Object obj) {
        for (int i = 0; i < this.f48622b.size(); i++) {
            C19108a aVar = this.f48622b.get(i);
            if (aVar.f48623a == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean mo56328g(@C0359n0 Class<?> cls) {
        return this.f48621a == cls;
    }

    public int getSpanEnd(@C0363p0 Object obj) {
        C19108a f;
        if (mo56333h(obj) && (f = mo56327f(obj)) != null) {
            obj = f;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(@C0363p0 Object obj) {
        C19108a f;
        if (mo56333h(obj) && (f = mo56327f(obj)) != null) {
            obj = f;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(@C0363p0 Object obj) {
        C19108a f;
        if (mo56333h(obj) && (f = mo56327f(obj)) != null) {
            obj = f;
        }
        return super.getSpanStart(obj);
    }

    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, @C0359n0 Class<T> cls) {
        if (!mo56328g(cls)) {
            return super.getSpans(i, i2, cls);
        }
        C19108a[] aVarArr = (C19108a[]) super.getSpans(i, i2, C19108a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f48623a;
        }
        return tArr;
    }

    /* renamed from: h */
    public final boolean mo56333h(@C0363p0 Object obj) {
        return obj != null && mo56328g(obj.getClass());
    }

    /* renamed from: i */
    public final void mo56334i() {
        for (int i = 0; i < this.f48622b.size(); i++) {
            this.f48622b.get(i).mo56347c();
        }
    }

    public int nextSpanTransition(int i, int i2, @C0363p0 Class<C19108a> cls) {
        if (cls == null || mo56328g(cls)) {
            cls = C19108a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(@C0363p0 Object obj) {
        C19108a aVar;
        if (mo56333h(obj)) {
            aVar = mo56327f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f48622b.remove(aVar);
        }
    }

    public void setSpan(@C0363p0 Object obj, int i, int i2, int i3) {
        if (mo56333h(obj)) {
            C19108a aVar = new C19108a(obj);
            this.f48622b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new C19107q(this.f48621a, this, i, i2);
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        mo56323b();
        super.replace(i, i2, charSequence);
        mo56334i();
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C19107q(@C0359n0 Class<?> cls, @C0359n0 CharSequence charSequence) {
        super(charSequence);
        C18001r.m81776m(cls, "watcherClass cannot be null");
        this.f48621a = cls;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        mo56323b();
        super.replace(i, i2, charSequence, i3, i4);
        mo56334i();
        return this;
    }

    @C0359n0
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @C0359n0
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C19107q(@C0359n0 Class<?> cls, @C0359n0 CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C18001r.m81776m(cls, "watcherClass cannot be null");
        this.f48621a = cls;
    }

    @C0359n0
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
