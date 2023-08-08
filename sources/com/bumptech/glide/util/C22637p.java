package com.bumptech.glide.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.C22062f;
import com.bumptech.glide.request.target.C22569f;
import com.bumptech.glide.request.target.C22583o;
import com.bumptech.glide.request.transition.C22598f;
import java.util.Arrays;

/* renamed from: com.bumptech.glide.util.p */
public class C22637p<T> implements C22062f.C22064b<T>, C22583o {

    /* renamed from: a */
    public int[] f58035a;

    /* renamed from: b */
    public C22638a f58036b;

    /* renamed from: com.bumptech.glide.util.p$a */
    public static final class C22638a extends C22569f<View, Object> {
        public C22638a(@C0359n0 View view) {
            super(view);
        }

        /* renamed from: l */
        public void mo65592l(@C0359n0 Object obj, @C0363p0 C22598f<? super Object> fVar) {
        }

        /* renamed from: m */
        public void mo65753m(@C0363p0 Drawable drawable) {
        }

        /* renamed from: o */
        public void mo65594o(@C0363p0 Drawable drawable) {
        }
    }

    public C22637p() {
    }

    @C0363p0
    /* renamed from: a */
    public int[] mo65584a(@C0359n0 T t, int i, int i2) {
        int[] iArr = this.f58035a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: b */
    public void mo67012b(@C0359n0 View view) {
        if (this.f58035a == null && this.f58036b == null) {
            C22638a aVar = new C22638a(view);
            this.f58036b = aVar;
            aVar.mo65595p(this);
        }
    }

    /* renamed from: e */
    public void mo66710e(int i, int i2) {
        this.f58035a = new int[]{i, i2};
        this.f58036b = null;
    }

    public C22637p(@C0359n0 View view) {
        C22638a aVar = new C22638a(view);
        this.f58036b = aVar;
        aVar.mo65595p(this);
    }
}
