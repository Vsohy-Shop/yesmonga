package com.urbanairship.android.layout.widget;

import android.view.View;
import androidx.annotation.C0329d0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: com.urbanairship.android.layout.widget.a */
public abstract class C36001a<V extends View> {

    /* renamed from: a */
    public final V f88990a;

    /* renamed from: com.urbanairship.android.layout.widget.a$b */
    public static class C36003b extends C36001a<ShapeButton> {
        public C36003b(@C0359n0 ShapeButton shapeButton) {
            super(shapeButton);
        }

        /* renamed from: a */
        public boolean mo107698a() {
            return ((ShapeButton) this.f88990a).isChecked();
        }

        /* renamed from: b */
        public void mo107699b(boolean z) {
            ((ShapeButton) this.f88990a).setChecked(z);
        }

        /* renamed from: d */
        public void mo107701d(boolean z) {
            ((ShapeButton) this.f88990a).setEnabled(z);
        }

        /* renamed from: f */
        public void mo107703f(@C0363p0 C36004c cVar) {
            ((ShapeButton) this.f88990a).setOnCheckedChangeListener(cVar != null ? new C36006b(cVar) : null);
        }
    }

    /* renamed from: com.urbanairship.android.layout.widget.a$c */
    public interface C36004c {
        /* renamed from: a */
        void mo107586a(View view, boolean z);
    }

    /* renamed from: com.urbanairship.android.layout.widget.a$d */
    public static class C36005d extends C36001a<SwitchCompat> {
        public C36005d(@C0359n0 SwitchCompat switchCompat) {
            super(switchCompat);
        }

        /* renamed from: a */
        public boolean mo107698a() {
            return ((SwitchCompat) this.f88990a).isChecked();
        }

        /* renamed from: b */
        public void mo107699b(boolean z) {
            ((SwitchCompat) this.f88990a).setChecked(z);
        }

        /* renamed from: d */
        public void mo107701d(boolean z) {
            ((SwitchCompat) this.f88990a).setEnabled(z);
        }

        /* renamed from: f */
        public void mo107703f(@C0363p0 C36004c cVar) {
            ((SwitchCompat) this.f88990a).setOnCheckedChangeListener(cVar != null ? new C36007c(cVar) : null);
        }
    }

    /* renamed from: a */
    public abstract boolean mo107698a();

    /* renamed from: b */
    public abstract void mo107699b(boolean z);

    /* renamed from: c */
    public void mo107700c(@C0359n0 String str) {
        this.f88990a.setContentDescription(str);
    }

    /* renamed from: d */
    public abstract void mo107701d(boolean z);

    /* renamed from: e */
    public void mo107702e(@C0329d0 int i) {
        this.f88990a.setId(i);
    }

    /* renamed from: f */
    public abstract void mo107703f(@C0363p0 C36004c cVar);

    public C36001a(@C0359n0 V v) {
        this.f88990a = v;
    }
}
