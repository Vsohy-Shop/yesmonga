package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.preference.C19975v;
import androidx.preference.Preference;

public class SeekBarPreference extends Preference {

    /* renamed from: u1 */
    public static final String f50902u1 = "SeekBarPreference";

    /* renamed from: i1 */
    public int f50903i1;

    /* renamed from: j1 */
    public int f50904j1;

    /* renamed from: k1 */
    public int f50905k1;

    /* renamed from: l1 */
    public int f50906l1;

    /* renamed from: m1 */
    public boolean f50907m1;

    /* renamed from: n1 */
    public SeekBar f50908n1;

    /* renamed from: o1 */
    public TextView f50909o1;

    /* renamed from: p1 */
    public boolean f50910p1;

    /* renamed from: q1 */
    public boolean f50911q1;

    /* renamed from: r1 */
    public boolean f50912r1;

    /* renamed from: s1 */
    public final SeekBar.OnSeekBarChangeListener f50913s1;

    /* renamed from: t1 */
    public final View.OnKeyListener f50914t1;

    /* renamed from: androidx.preference.SeekBarPreference$a */
    public class C19910a implements SeekBar.OnSeekBarChangeListener {
        public C19910a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f50912r1 || !seekBarPreference.f50907m1) {
                    seekBarPreference.mo58979z3(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.mo58963A3(i + seekBarPreference2.f50904j1);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f50907m1 = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f50907m1 = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f50904j1 != seekBarPreference.f50903i1) {
                seekBarPreference.mo58979z3(seekBar);
            }
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$b */
    public class C19911b implements View.OnKeyListener {
        public C19911b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SeekBar seekBar;
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f50910p1 && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = seekBarPreference.f50908n1) == null) {
                return false;
            }
            return seekBar.onKeyDown(i, keyEvent);
        }
    }

    public SeekBarPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f50913s1 = new C19910a();
        this.f50914t1 = new C19911b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19975v.C19986k.SeekBarPreference, i, i2);
        this.f50904j1 = obtainStyledAttributes.getInt(C19975v.C19986k.SeekBarPreference_min, 0);
        mo58972s3(obtainStyledAttributes.getInt(C19975v.C19986k.SeekBarPreference_android_max, 100));
        mo58974u3(obtainStyledAttributes.getInt(C19975v.C19986k.SeekBarPreference_seekBarIncrement, 0));
        this.f50910p1 = obtainStyledAttributes.getBoolean(C19975v.C19986k.SeekBarPreference_adjustable, true);
        this.f50911q1 = obtainStyledAttributes.getBoolean(C19975v.C19986k.SeekBarPreference_showSeekBarValue, false);
        this.f50912r1 = obtainStyledAttributes.getBoolean(C19975v.C19986k.SeekBarPreference_updatesContinuously, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A3 */
    public void mo58963A3(int i) {
        TextView textView = this.f50909o1;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    /* renamed from: Q1 */
    public void mo34405Q1(@C0359n0 C19974u uVar) {
        super.mo34405Q1(uVar);
        uVar.itemView.setOnKeyListener(this.f50914t1);
        this.f50908n1 = (SeekBar) uVar.mo59214d(C19975v.C19981f.seekbar);
        TextView textView = (TextView) uVar.mo59214d(C19975v.C19981f.seekbar_value);
        this.f50909o1 = textView;
        if (this.f50911q1) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f50909o1 = null;
        }
        SeekBar seekBar = this.f50908n1;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this.f50913s1);
            this.f50908n1.setMax(this.f50905k1 - this.f50904j1);
            int i = this.f50906l1;
            if (i != 0) {
                this.f50908n1.setKeyProgressIncrement(i);
            } else {
                this.f50906l1 = this.f50908n1.getKeyProgressIncrement();
            }
            this.f50908n1.setProgress(this.f50903i1 - this.f50904j1);
            mo58963A3(this.f50903i1);
            this.f50908n1.setEnabled(mo58903q1());
        }
    }

    @C0363p0
    /* renamed from: a2 */
    public Object mo58774a2(@C0359n0 TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* renamed from: j2 */
    public void mo58776j2(@C0363p0 Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.mo58776j2(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo58776j2(savedState.getSuperState());
        this.f50903i1 = savedState.f50915a;
        this.f50904j1 = savedState.f50916b;
        this.f50905k1 = savedState.f50917c;
        mo58762G1();
    }

    @C0363p0
    /* renamed from: k2 */
    public Parcelable mo58777k2() {
        Parcelable k2 = super.mo58777k2();
        if (mo58921z1()) {
            return k2;
        }
        SavedState savedState = new SavedState(k2);
        savedState.f50915a = this.f50903i1;
        savedState.f50916b = this.f50904j1;
        savedState.f50917c = this.f50905k1;
        return savedState;
    }

    /* renamed from: k3 */
    public int mo58964k3() {
        return this.f50905k1;
    }

    /* renamed from: l2 */
    public void mo58778l2(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        mo58977x3(mo58825C0(((Integer) obj).intValue()));
    }

    /* renamed from: l3 */
    public int mo58965l3() {
        return this.f50904j1;
    }

    /* renamed from: m3 */
    public final int mo58966m3() {
        return this.f50906l1;
    }

    /* renamed from: n3 */
    public boolean mo58967n3() {
        return this.f50911q1;
    }

    /* renamed from: o3 */
    public boolean mo58968o3() {
        return this.f50912r1;
    }

    /* renamed from: p3 */
    public int mo58969p3() {
        return this.f50903i1;
    }

    /* renamed from: q3 */
    public boolean mo58970q3() {
        return this.f50910p1;
    }

    /* renamed from: r3 */
    public void mo58971r3(boolean z) {
        this.f50910p1 = z;
    }

    /* renamed from: s3 */
    public final void mo58972s3(int i) {
        int i2 = this.f50904j1;
        if (i < i2) {
            i = i2;
        }
        if (i != this.f50905k1) {
            this.f50905k1 = i;
            mo58762G1();
        }
    }

    /* renamed from: t3 */
    public void mo58973t3(int i) {
        int i2 = this.f50905k1;
        if (i > i2) {
            i = i2;
        }
        if (i != this.f50904j1) {
            this.f50904j1 = i;
            mo58762G1();
        }
    }

    /* renamed from: u3 */
    public final void mo58974u3(int i) {
        if (i != this.f50906l1) {
            this.f50906l1 = Math.min(this.f50905k1 - this.f50904j1, Math.abs(i));
            mo58762G1();
        }
    }

    /* renamed from: v3 */
    public void mo58975v3(boolean z) {
        this.f50911q1 = z;
        mo58762G1();
    }

    /* renamed from: w3 */
    public void mo58976w3(boolean z) {
        this.f50912r1 = z;
    }

    /* renamed from: x3 */
    public void mo58977x3(int i) {
        mo58978y3(i, true);
    }

    /* renamed from: y3 */
    public final void mo58978y3(int i, boolean z) {
        int i2 = this.f50904j1;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f50905k1;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f50903i1) {
            this.f50903i1 = i;
            mo58963A3(i);
            mo58907s2(i);
            if (z) {
                mo58762G1();
            }
        }
    }

    /* renamed from: z3 */
    public void mo58979z3(@C0359n0 SeekBar seekBar) {
        int progress = this.f50904j1 + seekBar.getProgress();
        if (progress == this.f50903i1) {
            return;
        }
        if (mo58882g(Integer.valueOf(progress))) {
            mo58978y3(progress, false);
            return;
        }
        seekBar.setProgress(this.f50903i1 - this.f50904j1);
        mo58963A3(this.f50903i1);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C19909a();

        /* renamed from: a */
        public int f50915a;

        /* renamed from: b */
        public int f50916b;

        /* renamed from: c */
        public int f50917c;

        /* renamed from: androidx.preference.SeekBarPreference$SavedState$a */
        public class C19909a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f50915a = parcel.readInt();
            this.f50916b = parcel.readInt();
            this.f50917c = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f50915a);
            parcel.writeInt(this.f50916b);
            parcel.writeInt(this.f50917c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C19975v.C19976a.seekBarPreferenceStyle);
    }

    public SeekBarPreference(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }
}
