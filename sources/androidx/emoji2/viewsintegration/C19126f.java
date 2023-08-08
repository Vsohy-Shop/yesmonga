package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C18001r;
import androidx.emoji2.text.C19019f;

/* renamed from: androidx.emoji2.viewsintegration.f */
public final class C19126f {

    /* renamed from: a */
    public final C19128b f48652a;

    @C0376v0(19)
    /* renamed from: androidx.emoji2.viewsintegration.f$a */
    public static class C19127a extends C19128b {

        /* renamed from: a */
        public final TextView f48653a;

        /* renamed from: b */
        public final C19122d f48654b;

        /* renamed from: c */
        public boolean f48655c = true;

        public C19127a(TextView textView) {
            this.f48653a = textView;
            this.f48654b = new C19122d(textView);
        }

        @C0359n0
        /* renamed from: a */
        public InputFilter[] mo56423a(@C0359n0 InputFilter[] inputFilterArr) {
            if (!this.f48655c) {
                return mo56431i(inputFilterArr);
            }
            return mo56429g(inputFilterArr);
        }

        /* renamed from: b */
        public boolean mo56424b() {
            return this.f48655c;
        }

        /* renamed from: c */
        public void mo56425c(boolean z) {
            if (z) {
                mo56427e();
            }
        }

        /* renamed from: d */
        public void mo56426d(boolean z) {
            this.f48655c = z;
            mo56427e();
            mo56434l();
        }

        /* renamed from: e */
        public void mo56427e() {
            this.f48653a.setTransformationMethod(mo56428f(this.f48653a.getTransformationMethod()));
        }

        @C0363p0
        /* renamed from: f */
        public TransformationMethod mo56428f(@C0363p0 TransformationMethod transformationMethod) {
            if (this.f48655c) {
                return mo56435m(transformationMethod);
            }
            return mo56433k(transformationMethod);
        }

        @C0359n0
        /* renamed from: g */
        public final InputFilter[] mo56429g(@C0359n0 InputFilter[] inputFilterArr) {
            for (C19122d dVar : inputFilterArr) {
                if (dVar == this.f48654b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f48654b;
            return inputFilterArr2;
        }

        /* renamed from: h */
        public final SparseArray<InputFilter> mo56430h(@C0359n0 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C19122d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        @C0359n0
        /* renamed from: i */
        public final InputFilter[] mo56431i(@C0359n0 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> h = mo56430h(inputFilterArr);
            if (h.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - h.size())];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (h.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: j */
        public void mo56432j(boolean z) {
            this.f48655c = z;
        }

        @C0363p0
        /* renamed from: k */
        public final TransformationMethod mo56433k(@C0363p0 TransformationMethod transformationMethod) {
            if (transformationMethod instanceof C19132h) {
                return ((C19132h) transformationMethod).mo56448a();
            }
            return transformationMethod;
        }

        /* renamed from: l */
        public final void mo56434l() {
            this.f48653a.setFilters(mo56423a(this.f48653a.getFilters()));
        }

        @C0359n0
        /* renamed from: m */
        public final TransformationMethod mo56435m(@C0363p0 TransformationMethod transformationMethod) {
            if (!(transformationMethod instanceof C19132h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new C19132h(transformationMethod);
            }
            return transformationMethod;
        }
    }

    /* renamed from: androidx.emoji2.viewsintegration.f$b */
    public static class C19128b {
        @C0359n0
        /* renamed from: a */
        public InputFilter[] mo56423a(@C0359n0 InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        /* renamed from: b */
        public boolean mo56424b() {
            return false;
        }

        /* renamed from: c */
        public void mo56425c(boolean z) {
        }

        /* renamed from: d */
        public void mo56426d(boolean z) {
        }

        /* renamed from: e */
        public void mo56427e() {
        }

        @C0363p0
        /* renamed from: f */
        public TransformationMethod mo56428f(@C0363p0 TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    @C0376v0(19)
    /* renamed from: androidx.emoji2.viewsintegration.f$c */
    public static class C19129c extends C19128b {

        /* renamed from: a */
        public final C19127a f48656a;

        public C19129c(TextView textView) {
            this.f48656a = new C19127a(textView);
        }

        @C0359n0
        /* renamed from: a */
        public InputFilter[] mo56423a(@C0359n0 InputFilter[] inputFilterArr) {
            if (mo56436g()) {
                return inputFilterArr;
            }
            return this.f48656a.mo56423a(inputFilterArr);
        }

        /* renamed from: b */
        public boolean mo56424b() {
            return this.f48656a.mo56424b();
        }

        /* renamed from: c */
        public void mo56425c(boolean z) {
            if (!mo56436g()) {
                this.f48656a.mo56425c(z);
            }
        }

        /* renamed from: d */
        public void mo56426d(boolean z) {
            if (mo56436g()) {
                this.f48656a.mo56432j(z);
            } else {
                this.f48656a.mo56426d(z);
            }
        }

        /* renamed from: e */
        public void mo56427e() {
            if (!mo56436g()) {
                this.f48656a.mo56427e();
            }
        }

        @C0363p0
        /* renamed from: f */
        public TransformationMethod mo56428f(@C0363p0 TransformationMethod transformationMethod) {
            if (mo56436g()) {
                return transformationMethod;
            }
            return this.f48656a.mo56428f(transformationMethod);
        }

        /* renamed from: g */
        public final boolean mo56436g() {
            return !C19019f.m88870q();
        }
    }

    public C19126f(@C0359n0 TextView textView) {
        this(textView, true);
    }

    @C0359n0
    /* renamed from: a */
    public InputFilter[] mo56417a(@C0359n0 InputFilter[] inputFilterArr) {
        return this.f48652a.mo56423a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean mo56418b() {
        return this.f48652a.mo56424b();
    }

    /* renamed from: c */
    public void mo56419c(boolean z) {
        this.f48652a.mo56425c(z);
    }

    /* renamed from: d */
    public void mo56420d(boolean z) {
        this.f48652a.mo56426d(z);
    }

    /* renamed from: e */
    public void mo56421e() {
        this.f48652a.mo56427e();
    }

    @C0363p0
    /* renamed from: f */
    public TransformationMethod mo56422f(@C0363p0 TransformationMethod transformationMethod) {
        return this.f48652a.mo56428f(transformationMethod);
    }

    public C19126f(@C0359n0 TextView textView, boolean z) {
        C18001r.m81776m(textView, "textView cannot be null");
        if (!z) {
            this.f48652a = new C19129c(textView);
        } else {
            this.f48652a = new C19127a(textView);
        }
    }
}
