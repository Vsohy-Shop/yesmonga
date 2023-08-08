package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.resources.a */
public final class C31497a extends C31505f {

    /* renamed from: a */
    public final Typeface f76260a;

    /* renamed from: b */
    public final C31498a f76261b;

    /* renamed from: c */
    public boolean f76262c;

    /* renamed from: com.google.android.material.resources.a$a */
    public interface C31498a {
        /* renamed from: a */
        void mo90096a(Typeface typeface);
    }

    public C31497a(C31498a aVar, Typeface typeface) {
        this.f76260a = typeface;
        this.f76261b = aVar;
    }

    /* renamed from: a */
    public void mo88913a(int i) {
        mo90643d(this.f76260a);
    }

    /* renamed from: b */
    public void mo88914b(Typeface typeface, boolean z) {
        mo90643d(typeface);
    }

    /* renamed from: c */
    public void mo90642c() {
        this.f76262c = true;
    }

    /* renamed from: d */
    public final void mo90643d(Typeface typeface) {
        if (!this.f76262c) {
            this.f76261b.mo90096a(typeface);
        }
    }
}
